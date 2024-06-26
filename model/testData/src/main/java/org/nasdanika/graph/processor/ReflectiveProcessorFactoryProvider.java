package org.nasdanika.graph.processor;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reflector;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.Element;

/**
 * {@link Supplier} of a {@link ProcessorFactory} which reflecitvely creates  processors and wires hanlders and endpoints using annotations. 
 * @author Pavel
 *
 * @param <P>
 * @param <T>
 * @param <R>
 * @param <U>
 * @param <S>
 */
public class ReflectiveProcessorFactoryProvider<P, H, E> extends Reflector {
	
	private List<AnnotatedElementRecord> annotatedElementRecords = new ArrayList<>();
		
	public ReflectiveProcessorFactoryProvider(Object... targets) {
		for (Object target: targets) {
			getAnnotatedElementRecords(target, Collections.singletonList(target)).forEach(annotatedElementRecords::add);
		}
	}
	
	public ProcessorFactory<P> getFactory(Object... registryTargets) {
		return new ProcessorFactory<P>() {

			@Override
			protected ProcessorInfo<P> createProcessor(
					ProcessorConfig config, 
					boolean parallel,
					BiConsumer<Element,BiConsumer<ProcessorInfo<P>,ProgressMonitor>> infoProvider,
					Consumer<CompletionStage<?>> endpointWiringStageConsumer,
					ProgressMonitor progressMonitor) {
				
				P processor = ReflectiveProcessorFactoryProvider.this.createProcessor(config, parallel, infoProvider, endpointWiringStageConsumer, progressMonitor);
				return ProcessorInfo.of(config, processor);
			}
			
			@Override
			public Map<Element, ProcessorInfo<P>> createProcessors(Collection<ProcessorConfig> configs, boolean parallel, ProgressMonitor progressMonitor) {
				Map<Element, ProcessorInfo<P>> registry = super.createProcessors(configs, parallel, progressMonitor);
				for (Object registryTarget: registryTargets) {
					BiConsumer<Element, BiConsumer<ProcessorInfo<P>,ProgressMonitor>> infoProvider = (e, bc) -> {
						bc.accept(registry.get(e), progressMonitor);
					};
					
					List<AnnotatedElementRecord> registryTargetAnnotatedElementRecords = getAnnotatedElementRecords(registryTarget, Collections.singletonList(registryTarget)).toList();
					wireRegistryEntry(parallel ? registryTargetAnnotatedElementRecords.parallelStream() : registryTargetAnnotatedElementRecords.stream(), configs, infoProvider);
					wireRegistry(parallel ? registryTargetAnnotatedElementRecords.parallelStream() : registryTargetAnnotatedElementRecords.stream(), configs, infoProvider);
				}				
				
				return registry;
			}
			
		};
	}
	
	@SuppressWarnings("unchecked")
	protected P createProcessor(
			ProcessorConfig config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<P>,ProgressMonitor>> infoProvider,
			Consumer<CompletionStage<?>> endpointWiringStageConsumer,
			ProgressMonitor progressMonitor) {
		
		// TODO - progress steps.
		Optional<AnnotatedElementRecord> match = (parallel ? annotatedElementRecords.parallelStream() : annotatedElementRecords.stream())
			.filter(r -> r.test(config.getElement()) && r.getAnnotatedElement() instanceof Method && matchFactoryMethod(config, (Method) r.getAnnotatedElement()))
			.sorted((a, b) -> compareProcessorMethods((Method) a.getAnnotatedElement(), (Method) b.getAnnotatedElement()))
			.findFirst();
		
		if (match.isEmpty()) {
			return null;			
		}
		
		AnnotatedElementRecord matchedRecord = match.get();
		Method method = (Method) matchedRecord.getAnnotatedElement();
		P processor = (P) matchedRecord.invoke(config, parallel, infoProvider, progressMonitor);
		if (processor == null) {
			return processor;			
		}
		Processor elementProcessorAnnotation = method.getAnnotation(Processor.class);
		
		List<AnnotatedElementRecord> processorAnnotatedElementRecords = getAnnotatedElementRecords(processor, Collections.emptyList()).toList();
		Supplier<Stream<AnnotatedElementRecord>> processorAnnotatedElementRecordsStreamSupplier = () -> parallel ? processorAnnotatedElementRecords.parallelStream() : processorAnnotatedElementRecords.stream();
		
		boolean hideWired = elementProcessorAnnotation.hideWired();
		Map<Element, ProcessorConfig> childProcessorConfigsCopy = new LinkedHashMap<>(config.getChildProcessorConfigs());
		wireChildProcessor(
				processorAnnotatedElementRecordsStreamSupplier.get(), 
				config.getChildProcessorConfigs(), 
				infoProvider,
				childProcessorConfigsCopy::remove);
		
		wireChildProcessors(
				processorAnnotatedElementRecordsStreamSupplier.get(), 
				childProcessorConfigsCopy , 
				infoProvider);
		
		ProcessorConfig parentConfig = config.getParentProcessorConfig();
		if (parentConfig != null) {			
			Consumer<Consumer<ProcessorInfo<P>>> parentProcessorInfoConsumerCallback = parentProcessorInfoConsumer -> {
				infoProvider.accept(parentConfig.getElement(), (pInfo, pMonitor) -> parentProcessorInfoConsumer.accept(pInfo));
			};
			wireParentProcessor(processorAnnotatedElementRecordsStreamSupplier.get(), parentProcessorInfoConsumerCallback);
		}
		
		wireProcessorElement(processorAnnotatedElementRecordsStreamSupplier.get(), config.getElement());		
		
		wireRegistryEntry(
				processorAnnotatedElementRecordsStreamSupplier.get(), 
				config.getRegistry().values(), 
				infoProvider);
		
		wireRegistry(
				processorAnnotatedElementRecordsStreamSupplier.get(), 
				config.getRegistry().values(), 
				infoProvider);
		
		if (config instanceof NodeProcessorConfig) {
			NodeProcessorConfig<H, E> nodeProcessorConfig = (NodeProcessorConfig<H, E>) config;
			Map<Connection, CompletionStage<E>> unwiredIncomingEndpoints = new LinkedHashMap<>(nodeProcessorConfig.getIncomingEndpoints()); // Making a copy to remove wired on completion 
			wireIncomingEndpoint(
					processorAnnotatedElementRecordsStreamSupplier.get(), 
					nodeProcessorConfig.getIncomingEndpoints(), 
					progressMonitor)
			.forEach(r -> {
				if (r.consume()) {
					unwiredIncomingEndpoints.remove(r.connection());
				}
				endpointWiringStageConsumer.accept(r.result());
			});
			
			wireIncomingEndpoints(processorAnnotatedElementRecordsStreamSupplier.get(), unwiredIncomingEndpoints);
			
			Map<Connection, Consumer<H>> incomingHandlerConsumers = nodeProcessorConfig.getIncomingHandlerConsumers();
			Collection<Connection> wiredHandlerIncomingConnections = wireIncomingHandler(processorAnnotatedElementRecordsStreamSupplier.get(), incomingHandlerConsumers);
			Map<Connection, Consumer<H>> unwiredIncomingHandlerConsumers;
			if (hideWired) {
				unwiredIncomingHandlerConsumers = new LinkedHashMap<>(incomingHandlerConsumers);
				unwiredIncomingHandlerConsumers.keySet().removeAll(wiredHandlerIncomingConnections);
			} else {
				unwiredIncomingHandlerConsumers = incomingHandlerConsumers;
			}
			wireIncomingHandlerConsumers(processorAnnotatedElementRecordsStreamSupplier.get(), unwiredIncomingHandlerConsumers);
			
			Map<Connection, CompletionStage<E>> outgoingEndpoints = new LinkedHashMap<>(nodeProcessorConfig.getOutgoingEndpoints()); // Making a copy to removed wired on completion
			wireOutgoingEndpoint(
					processorAnnotatedElementRecordsStreamSupplier.get(), 
					outgoingEndpoints, 
					progressMonitor)
			.forEach(r -> {
				if (r.consume()) {
					outgoingEndpoints.remove(r.connection());
				}
				endpointWiringStageConsumer.accept(r.result());
			});
			wireOutgoingEndpoints(processorAnnotatedElementRecordsStreamSupplier.get(), outgoingEndpoints);
			
			Map<Connection, Consumer<H>> outgoingHandlerConsumers = nodeProcessorConfig.getOutgoingHandlerConsumers(); 
			Collection<Connection> wiredHandlerOutgoingConnections = wireOutgoingHandler(processorAnnotatedElementRecordsStreamSupplier.get(), outgoingHandlerConsumers);
			Map<Connection, Consumer<H>> unwiredOutgoingHandlerConsumers;
			if (hideWired) {
				unwiredOutgoingHandlerConsumers = new LinkedHashMap<>(outgoingHandlerConsumers);
				unwiredOutgoingHandlerConsumers.keySet().removeAll(wiredHandlerOutgoingConnections);
			} else {
				unwiredOutgoingHandlerConsumers = outgoingHandlerConsumers;
			}			
			wireOutgoingHandlerConsumers(processorAnnotatedElementRecordsStreamSupplier.get(), unwiredOutgoingHandlerConsumers);
		} else if (config instanceof ConnectionProcessorConfig) {
			ConnectionProcessorConfig<H, E> connectionProcessorConfig = (ConnectionProcessorConfig<H, E>) config;
			Consumer<E> sourceEndpointConsumer = wireSourceEndpoint(processorAnnotatedElementRecordsStreamSupplier.get());
			if (sourceEndpointConsumer != null) {
				endpointWiringStageConsumer.accept(connectionProcessorConfig.getSourceEndpoint().thenAccept(sourceEndpointConsumer));
			}			
			wireSourceHandler(processorAnnotatedElementRecordsStreamSupplier.get(), connectionProcessorConfig);
			
			Consumer<E> targetEndpointConsumer = wireTargetEndpoint(processorAnnotatedElementRecordsStreamSupplier.get());
			if (targetEndpointConsumer != null) {			
				endpointWiringStageConsumer.accept(connectionProcessorConfig.getTargetEndpoint().thenAccept(targetEndpointConsumer));
			}
			wireTargetHandler(processorAnnotatedElementRecordsStreamSupplier.get(), connectionProcessorConfig);
		}
		
		return (P) processor;
	}

	protected int compareProcessorMethods(Method a, Method b) {
		int priorityCmp = b.getAnnotation(Processor.class).priority() - a.getAnnotation(Processor.class).priority();
		if (priorityCmp != 0) {
			return priorityCmp;
		}
		
		Class<? extends Element> aType = a.getAnnotation(Processor.class).type();
		Class<? extends Element> bType = b.getAnnotation(Processor.class).type();
		if (!Objects.equals(aType, bType)) {
			if (aType.isAssignableFrom(bType)) {
				// b is more specific
				return 1;
			}
			if (bType.isAssignableFrom(aType)) {
				// a is more specific
				return -1;
			}
		}
		
		// Method in a sub-class is more specific
		Class<?> adc = a.getDeclaringClass();
		Class<?> bdc = b.getDeclaringClass();
		if (adc.isAssignableFrom(bdc)) {
			return adc == bdc ? 0 : 1;
		} 
		
		if (bdc.isAssignableFrom(adc)) {
			return -1;
		}
		
		// Taking config is more specific 
		int paramCountCmp = b.getParameterCount() - a.getParameterCount();
		if (paramCountCmp != 0) {
			return paramCountCmp;
		}
		
		return a.getName().compareTo(b.getName());
	}
	
	/**
	 * Records don't work with non-static types.
	 */
	protected class RegistryMatch {
		RegistryEntry annotation; 
		AnnotatedElementRecord setterRecord;
		ProcessorConfig config;
		
		public RegistryMatch(
				RegistryEntry annotation, 
				AnnotatedElementRecord setterRecord, 
				ProcessorConfig config) {
			super();
			this.annotation = annotation;
			this.setterRecord = setterRecord;
			this.config = config;
		}		
		
	}
		
	protected void wireRegistryEntry(
			Stream<AnnotatedElementRecord> processorAnnotatedElementRecords,
			Collection<ProcessorConfig> registry,
			BiConsumer<Element,BiConsumer<ProcessorInfo<P>,ProgressMonitor>> infoProvider) {
		
		processorAnnotatedElementRecords
			.filter(ae -> ae.getAnnotation(RegistryEntry.class) != null)
			.filter(ae -> ae.mustSet(null, "Fields/methods annotated with RegistryEntry must have (parameter) type assignable from the processor type or ProcessorInfo if info is set to true: " + ae.getAnnotatedElement()))
			.flatMap(setterRecord -> registry.stream().map(re -> new RegistryMatch(setterRecord.getAnnotation(RegistryEntry.class), setterRecord, re)))
			.filter(rm -> matchPredicate(rm.config.getElement(), rm.annotation.value()))
			.forEach(rm -> {
				infoProvider.accept(rm.config.getElement(), (rpInfo, pMonitor) -> {
					rm.setterRecord.set(rm.annotation.info() ? rpInfo : rpInfo.getProcessor());
				});
			});
	}

	protected void wireRegistry(
			Stream<AnnotatedElementRecord> processorAnnotatedElementRecords,
			Collection<ProcessorConfig> registry, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<P>,ProgressMonitor>> infoProvider) {

		processorAnnotatedElementRecords
				.filter(aer -> aer.getAnnotation(Registry.class) != null)
				.filter(aer -> aer.mustSet(Map.class, "Fields/methods annotated with Registry must have (parameter) type assignable from Map: " + aer.getAnnotatedElement()))
				.forEach(setterRecord -> {
					// Sets a map which is populated as processors get created
					Map<Element,ProcessorInfo<P>> r = Collections.synchronizedMap(new LinkedHashMap<>());
					setterRecord.set(r);
					for (ProcessorConfig re: registry) {
						infoProvider.accept(re.getElement(), (rp, pm) -> r.put(re.getElement(), rp));
					}
				});
	}

	protected void wireProcessorElement(Stream<AnnotatedElementRecord> processorAnnotatedElementRecords, Element element) {
		processorAnnotatedElementRecords
				.filter(aer -> aer.getAnnotation(ProcessorElement.class) != null)
				.filter(aer -> aer.mustSet(element.getClass(), "Methods annotated with ProcessorElement must have one parameter compatible with the processor element type (" + element.getClass() + "): " + aer.getAnnotatedElement()))
				.forEach(aer -> aer.set(element));						
	}

	protected void wireParentProcessor(			
			Stream<AnnotatedElementRecord> processorAnnotatedElementRecords,
			Consumer<Consumer<ProcessorInfo<P>>> parentProcessorInfoProvider) {

		processorAnnotatedElementRecords
				.filter(aer -> aer.getAnnotation(ParentProcessor.class) != null)
				.filter(aer -> aer.mustSet(null, "Fields/methods annotated with ParentProcessor must have (parameter) type assignable from the processor type or ProcessorInfo if value is set to true: " + aer.getAnnotatedElement()))
				.forEach(aer -> parentProcessorInfoProvider.accept(parentProcessorInfo -> aer.set(aer.getAnnotation(ParentProcessor.class).value() ? parentProcessorInfo : parentProcessorInfo.getProcessor())));
	}
	
	/**
	 * 
	 * @param processorAnnotatedElementRecords
	 * @param childProcessorConfigs
	 * @param infoProvider
	 * @param wiredChildrenConsumer accepts wired children
	 */
	private void wireChildProcessor(
			Stream<AnnotatedElementRecord> processorAnnotatedElementRecords,
			Map<Element, ProcessorConfig> childProcessorConfigs, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<P>,ProgressMonitor>> infoProvider,
			Consumer<Element> wiredChildrenConsumer) {		

		processorAnnotatedElementRecords
			.filter(aer -> aer.getAnnotation(ChildProcessor.class) != null)
			.filter(aer -> aer.mustSet(null, "Fields/methods annotated with ChildProcessor must have (parameter) type assignable from the processor type or ProcessorConfig if config is set to true: " + aer.getAnnotatedElement()))
			.forEach(aer -> {
				for (Entry<Element, ProcessorConfig> ce: childProcessorConfigs.entrySet()) {
					ChildProcessor childProcessorAnnotation = aer.getAnnotation(ChildProcessor.class);
					if (matchPredicate(ce.getKey(), childProcessorAnnotation.value())) {
						infoProvider.accept(ce.getKey(), (childProcessorInfo, pMonitor) -> {
							aer.set(childProcessorAnnotation.info() ? childProcessorInfo : childProcessorInfo.getProcessor());
							wiredChildrenConsumer.accept(ce.getKey());
						});
					};						
				}		
			});
	}	

	protected void wireChildProcessors(
			Stream<AnnotatedElementRecord> processorAnnotatedElementRecords,
			Map<Element, ProcessorConfig> childProcessorConfigs,
			BiConsumer<Element,BiConsumer<ProcessorInfo<P>,ProgressMonitor>> infoProvider) {		
		
		processorAnnotatedElementRecords
				.filter(aer -> aer.getAnnotation(ChildProcessors.class) != null)
				.filter(aer -> aer.mustSet(Map.class, "Fields/methods annotated with ChildProcessors must have (parameter) type assignable from Map: " + aer.getAnnotatedElement()))
				.forEach(aer -> {
					// Sets a map which is populated as processors get created
					Map<Element,ProcessorInfo<P>> childProcessorInfoMap = Collections.synchronizedMap(new LinkedHashMap<>());
					aer.set(childProcessorInfoMap);
					for (ProcessorConfig childConfig: childProcessorConfigs.values()) {
						infoProvider.accept(childConfig.getElement(), (childInfo, cpm) -> childProcessorInfoMap.put(childConfig.getElement(), childInfo));
					}
				});
	}
	
	/**
	 * Matches processor field or method and incoming connection.
	 * @return
	 */
	protected boolean matchIncomingHandler(AnnotatedElement handlerMember, Connection incomingConnection) {
		IncomingHandler incomingHandlerAnnotation = handlerMember.getAnnotation(IncomingHandler.class);
		if (incomingHandlerAnnotation == null) {
			return false;
		}
		
		if (handlerMember instanceof Method) {
			Method handlerMethod = (Method) handlerMember;
			int pc = handlerMethod.getParameterCount();
			if (pc > 1) {
				throw new NasdanikaException("A method annotated with IncomingHandler shall have zero or one parameter: " + handlerMethod);
			}
			if (pc == 1 && !handlerMethod.getParameterTypes()[0].isInstance(incomingConnection)) {
				return false;				
			}
		}
				
		return matchPredicate(incomingConnection, incomingHandlerAnnotation.value());
	}
	
	// Node wiring
	
	/**
	 * 
	 * @param processor
	 * @param incomingHandlerConsumers
	 * @param parallel
	 * @return Wired connections
	 */
	@SuppressWarnings("unchecked")
	protected Collection<Connection> wireIncomingHandler(
			Stream<AnnotatedElementRecord> processorAnnotatedElementRecords,
			Map<Connection, Consumer<H>> incomingHandlerConsumers) {		

		Set<Connection> wired = Collections.synchronizedSet(new HashSet<>());

		// Streaming fields and methods and then flat mapping them to all permutations with incoming handler consumers.
		// then filtering using matchIncomingHandler, sorting by priority, for all matching - wiring and removing from ret.
		processorAnnotatedElementRecords
			.filter(aer -> !Modifier.isAbstract(((Member) aer.getAnnotatedElement()).getModifiers()))
			.flatMap(aer -> incomingHandlerConsumers.entrySet().stream().map(ihce -> new ConnectionMatch<Consumer<H>>(
					aer, 
					ihce.getKey(), 
					ihce.getValue(), 
					ao -> ao.getAnnotation(IncomingHandler.class).priority(), 
					ao -> ao.getAnnotation(IncomingHandler.class).value())))
			.filter(mr -> matchIncomingHandler(mr.annotatedElementRecord.getAnnotatedElement(), mr.connection))
			.sorted()
			.forEach(mr -> {
				AnnotatedElement handlerMember = mr.annotatedElementRecord.getAnnotatedElement();
				Connection incomingConnection = mr.connection;
				if (wired.add(incomingConnection)) { // Wiring once
					if (handlerMember instanceof Field) {					
						mr.value.accept((H) mr.annotatedElementRecord.get());
					} else {
						Method handlerSupplierMethod = (Method) handlerMember;
						Object incomingHandler = handlerSupplierMethod.getParameterCount() == 0 ? mr.annotatedElementRecord.get() : mr.annotatedElementRecord.invoke(incomingConnection);
						mr.value.accept((H) incomingHandler);
					}
				}
			});
				
		return wired;
	}	
	
	protected void wireIncomingHandlerConsumers(
			Stream<AnnotatedElementRecord> processorAnnotatedElementRecords,
			Map<Connection, Consumer<H>> incomingHandlerConsumers) {				
		
		processorAnnotatedElementRecords
				.filter(aer -> aer.getAnnotation(IncomingHandlerConsumers.class) != null)
				.filter(aer -> aer.mustSet(Map.class, "Fields/methods annotated with IncomingHandlersConsumers must have (parameter) type assignable from Map: " + aer.getAnnotatedElement()))
				.forEach(aer -> aer.set(incomingHandlerConsumers));
	}
	
	/**
	 * Matches processor field or method and incoming connection.
	 * @return
	 */
	protected boolean matchIncomingEndpoint(AnnotatedElement endpointMember, Connection incomingConnection) {
		IncomingEndpoint incomingEndpointAnnotation = endpointMember.getAnnotation(IncomingEndpoint.class);
		if (incomingEndpointAnnotation == null) {
			return false;
		}
		
		if (endpointMember instanceof Method) {
			Method endpointMethod = (Method) endpointMember;
			int pc = endpointMethod.getParameterCount();
			if (pc == 0 || pc > 3) {
				throw new NasdanikaException("A method annotated with IncomingEndpoint shall have 1 - 3 parameters: " + endpointMethod);
			}
			if (pc > 1 && !endpointMethod.getParameterTypes()[0].isInstance(incomingConnection)) {
				return false;				
			}
		}
				
		return matchPredicate(incomingConnection, incomingEndpointAnnotation.value());
	}	
	
	protected class ConnectionMatch<T> implements Comparable<ConnectionMatch<T>> {
		
		AnnotatedElementRecord annotatedElementRecord; 
		Connection connection; 
		T value; 
		Function<AnnotatedElement, Integer> priorityGetter; 
		Function<AnnotatedElement, String> selectorGetter;
		
		ConnectionMatch(
				AnnotatedElementRecord annotatedElementRecord, 
				Connection connection, 
				T value,
				Function<AnnotatedElement, Integer> priorityGetter, 
				Function<AnnotatedElement, String> selectorGetter) {
			super();
			this.annotatedElementRecord = annotatedElementRecord;
			this.connection = connection;
			this.value = value;
			this.priorityGetter = priorityGetter;
			this.selectorGetter = selectorGetter;
		}

		@Override
		public int compareTo(ConnectionMatch<T> o) {
			AnnotatedElement a = annotatedElementRecord.getAnnotatedElement();
			AnnotatedElement b = o.annotatedElementRecord.getAnnotatedElement();
			
			if (priorityGetter != null) {
				Integer pa = priorityGetter.apply(a);
				Integer pb = priorityGetter.apply(b);
				if (!Objects.equals(pa, pb)) {
					return pb - pa;
				}
			}			
			if (a instanceof Member && b instanceof Member) {
				Class<?> adc = ((Member) a).getDeclaringClass();
				Class<?> bdc = ((Member) b).getDeclaringClass();
				if (adc.isAssignableFrom(bdc)) {
					return adc == bdc ? 0 : 1;
				} 
				
				if (bdc.isAssignableFrom(adc)) {
					return -1;
				}
			}
			if (selectorGetter != null) {
				String sa = selectorGetter.apply(a);
				String sb = selectorGetter.apply(b);
				if (sa.length() != sb.length()) {
					return sb.length() - sa.length();
				}
			}
			
			return a.hashCode() - b.hashCode();
		}
		
	}
	
	private record EndpointWireRecord(Connection connection, CompletionStage<Void> result, boolean consume) {};

	/**
	 * @param processor
	 * @param incomingEndpoints
	 * @param progressMonitor
	 * @return Wired incoming endpoints for collection of failures
	 */
	protected Stream<EndpointWireRecord> wireIncomingEndpoint(
			Stream<AnnotatedElementRecord> processorAnnotatedElementRecords,
			Map<Connection, CompletionStage<E>> incomingEndpoints,
			ProgressMonitor progressMonitor) {
						
		Set<Field> wiredFields = Collections.synchronizedSet(new HashSet<>()); // For setting a field once, setter methods may be invoked multiple times.
		Set<Connection> consumedConnections = Collections.synchronizedSet(new HashSet<>()); // For wiring a connection once.
				
		// Streaming fields and methods and then flat mapping them to all permutations with incoming endpoints.
		// then filtering using matchIncomingEndpoint, sorting by priority, wiring all matching and removing from ret.
		return processorAnnotatedElementRecords
			.filter(aer -> !Modifier.isAbstract(((Member) aer.getAnnotatedElement()).getModifiers()))
			.flatMap(aer -> incomingEndpoints.entrySet().stream().map(iee -> new ConnectionMatch<CompletionStage<E>>( 
					aer, 
					iee.getKey(), 
					iee.getValue(), 
					ao -> ao.getAnnotation(IncomingEndpoint.class).priority(), 
					ao -> ao.getAnnotation(IncomingEndpoint.class).value())))
			.filter(mr -> matchIncomingEndpoint(mr.annotatedElementRecord.getAnnotatedElement(), mr.connection))
			.sorted()
			.map(mr -> {
				AnnotatedElement endpointMember = mr.annotatedElementRecord.getAnnotatedElement();
				Connection incomingConnection = mr.connection;
				IncomingEndpoint incomingEndpointAnnotation = endpointMember.getAnnotation(IncomingEndpoint.class);
				boolean consumed = incomingEndpointAnnotation.consume() && !consumedConnections.add(incomingConnection);
				boolean fieldWired = endpointMember instanceof Field && !wiredFields.add((Field) endpointMember);
				if (!consumed && !fieldWired) { // Wiring an endpoint once is consumed and setting a field once
					CompletionStage<Void> result = mr.value.thenAccept(incomingEndpoint -> {
						if (endpointMember instanceof Field) {
							mr.annotatedElementRecord.set(incomingEndpoint);
						} else {
							Method endpointMethod = (Method) endpointMember;
							switch (endpointMethod.getParameterCount()) {
							case 1:
								mr.annotatedElementRecord.invoke(incomingEndpoint);
								break;
							case 2:
								mr.annotatedElementRecord.invoke(incomingConnection, incomingEndpoint);
								break;
							case 3:
								mr.annotatedElementRecord.invoke(incomingConnection, incomingEndpoint, progressMonitor);
								break;								
							default:
								throw new NasdanikaException("Incoming endpoint method shall have 1 to 3 parameters: " + endpointMethod);
							}							
						}
					});
					return new EndpointWireRecord(incomingConnection, result, incomingEndpointAnnotation.consume());
				}
				return null;
			})
			.filter(Objects::nonNull);
	}
	
	protected void wireIncomingEndpoints(
			Stream<AnnotatedElementRecord> processorAnnotatedElementRecords,
			Map<Connection, CompletionStage<E>> incomingEndpoints) {
		processorAnnotatedElementRecords
				.filter(aer -> aer.getAnnotation(IncomingEndpoints.class) != null)
				.filter(aer -> aer.mustSet(Map.class, "Fields/methods annotated with IncomingEndpoints must have (parameter) type assignable from Map: " + aer.getAnnotatedElement()))
				.forEach(aer -> aer.set(incomingEndpoints));
	}
	
	/**
	 * Matches processor field or method and outgoing connection.
	 * @return
	 */
	protected boolean matchOutgoingHandler(AnnotatedElement handlerMember, Connection outgoingConnection) {
		OutgoingHandler outgoingHandlerAnnotation = handlerMember.getAnnotation(OutgoingHandler.class);
		if (outgoingHandlerAnnotation == null) {
			return false;
		}
		
		if (handlerMember instanceof Method) {
			Method handlerMethod = (Method) handlerMember;
			int pc = handlerMethod.getParameterCount();
			if (pc > 1) {
				throw new NasdanikaException("A method annotated with OutgoingHandler shall have zero or one parameter: " + handlerMethod);
			}
			if (pc == 1 && !handlerMethod.getParameterTypes()[0].isInstance(outgoingConnection)) {
				return false;				
			}
		}
				
		return matchPredicate(outgoingConnection, outgoingHandlerAnnotation.value());
	}
	
	/**
	 * @param processor
	 * @param outgoingHandlerConsumers
	 * @param parallel
	 * @return Wired connections
	 */
	@SuppressWarnings("unchecked")
	protected Collection<Connection> wireOutgoingHandler(
			Stream<AnnotatedElementRecord> processorAnnotatedElementRecords,
			Map<Connection, Consumer<H>> outgoingHandlerConsumers) {
		Set<Connection> wired = Collections.synchronizedSet(new HashSet<>());

		// Streaming fields and methods and then flat mapping them to all permutations with outgoing handler consumers.
		// then filtering using matchOutgoingHandler, sorting by priority, wiring all matching and removing from ret.
		processorAnnotatedElementRecords
			.filter(aer -> !Modifier.isAbstract(((Member) aer.getAnnotatedElement()).getModifiers()))
			.flatMap(aer -> outgoingHandlerConsumers.entrySet().stream().map(ihce -> new ConnectionMatch<Consumer<H>>(
					aer, 
					ihce.getKey(), 
					ihce.getValue(), 
					ao -> ao.getAnnotation(OutgoingHandler.class).priority(), 
					ao -> ao.getAnnotation(OutgoingHandler.class).value())))
			.filter(mr -> matchOutgoingHandler(mr.annotatedElementRecord.getAnnotatedElement(), mr.connection))
			.sorted()
			.forEach(mr -> {
				AnnotatedElement handlerMember = mr.annotatedElementRecord.getAnnotatedElement();
				Connection outgoingConnection = mr.connection;
				if (wired.add(outgoingConnection)) {
					if (handlerMember instanceof Field) {					
						mr.value.accept((H) mr.annotatedElementRecord.get());
					} else {
						Method handlerSupplierMethod = (Method) handlerMember;
						Object outgoinggHandler = handlerSupplierMethod.getParameterCount() == 0 ? mr.annotatedElementRecord.get() : mr.annotatedElementRecord.invoke(outgoingConnection);
						mr.value.accept((H) outgoinggHandler);
					}
				}
			});
		return wired;
	}
	
	protected void wireOutgoingHandlerConsumers(
			Stream<AnnotatedElementRecord> processorAnnotatedElementRecords,
			Map<Connection, Consumer<H>> outgoingHandlerConsumers) {
		
		processorAnnotatedElementRecords
				.filter(aer -> aer.getAnnotation(OutgoingHandlerConsumers.class) != null)
				.filter(aer -> aer.mustSet(Map.class, "Fields/methods annotated with OutgoingHandlersConsumers must have (parameter) type assignable from Map: " + aer.getAnnotatedElement()))
				.forEach(aer -> aer.set(outgoingHandlerConsumers));
	}
	
	/**
	 * Matches processor field or method and outgoing connection.
	 * @return
	 */
	protected boolean matchOutgoingEndpoint(AnnotatedElement endpointMember, Connection outgoingConnection) {
		OutgoingEndpoint outgoingEndpointAnnotation = endpointMember.getAnnotation(OutgoingEndpoint.class);
		if (outgoingEndpointAnnotation == null) {
			return false;
		}
		
		if (endpointMember instanceof Method) {
			Method endpointMethod = (Method) endpointMember;
			int pc = endpointMethod.getParameterCount();
			if (pc == 0 || pc > 3) {
				throw new NasdanikaException("A method annotated with OutgoingEndpoint shall have 1 - 3 parameters: " + endpointMethod);
			}
			if (pc > 1 && !endpointMethod.getParameterTypes()[0].isInstance(outgoingConnection)) {
				return false;				
			}
		}
				
		return matchPredicate(outgoingConnection, outgoingEndpointAnnotation.value());
	}	
	
	protected Stream<EndpointWireRecord> wireOutgoingEndpoint(
			Stream<AnnotatedElementRecord> processorAnnotatedElementRecords,
			Map<Connection, CompletionStage<E>> outgoingEndpoints,
			ProgressMonitor progressMonitor) {
		
		Set<Field> wiredFields = Collections.synchronizedSet(new HashSet<>()); // For setting a field once, setter methods may be invoked multiple times.
		Set<Connection> consumedConnections = Collections.synchronizedSet(new HashSet<>()); // For wiring a connection once.

		// Streaming fields and methods and then flat mapping them to all permutations with outgoing endpoints.
		// then filtering using matchOutgoingEndpoint, sorting by priority, wiring all matching and removing from ret.
		return processorAnnotatedElementRecords
			.filter(aer -> !Modifier.isAbstract(((Member) aer.getAnnotatedElement()).getModifiers()))
			.flatMap(aer -> outgoingEndpoints.entrySet().stream().map(iee -> new ConnectionMatch<CompletionStage<E>>(
					aer, 
					iee.getKey(), 
					iee.getValue(), 
					ao -> ao.getAnnotation(OutgoingEndpoint.class).priority(), 
					ao -> ao.getAnnotation(OutgoingEndpoint.class).value())))
			.filter(mr -> matchOutgoingEndpoint(mr.annotatedElementRecord.getAnnotatedElement(), mr.connection))
			.sorted()
			.map(mr -> {				
				AnnotatedElement endpointMember = mr.annotatedElementRecord.getAnnotatedElement();
				Connection outgoingConnection = mr.connection;
				OutgoingEndpoint outgoingEndpointAnnotation = endpointMember.getAnnotation(OutgoingEndpoint.class);
				boolean consumed = outgoingEndpointAnnotation.consume() && !consumedConnections.add(outgoingConnection);
				boolean fieldWired = endpointMember instanceof Field && !wiredFields.add((Field) endpointMember);
				if (!consumed && !fieldWired) { // Setting a field once
					CompletionStage<Void> result = mr.value.thenAccept(outgoingEndpoint -> {
						if (endpointMember instanceof Field) {
							mr.annotatedElementRecord.set(outgoingEndpoint);
						} else {
							Method endpointMethod = (Method) endpointMember;
							switch (endpointMethod.getParameterCount()) {
							case 1:
								mr.annotatedElementRecord.invoke(outgoingEndpoint);
								break;
							case 2:
								mr.annotatedElementRecord.invoke(outgoingConnection, outgoingEndpoint);
								break;
							case 3:
								mr.annotatedElementRecord.invoke(outgoingConnection, outgoingEndpoint, progressMonitor);
								break;								
							default:
								throw new NasdanikaException("Outgoing endpoint method shall have 1 to 3 parameters: " + endpointMethod);
							}
						}					
					});
					return new EndpointWireRecord(outgoingConnection, result, outgoingEndpointAnnotation.consume());
				}
				return null;
			})
			.filter(Objects::nonNull);				
	}

	protected void wireOutgoingEndpoints(
			Stream<AnnotatedElementRecord> processorAnnotatedElementRecords,
			Map<Connection, CompletionStage<E>> outgoingEndpoints) {
		processorAnnotatedElementRecords
				.filter(aer -> aer.getAnnotation(OutgoingEndpoints.class) != null)
				.filter(aer -> aer.mustSet(Map.class, "Fields/methods annotated with OutgoingEndpoints must have (parameter) type assignable from Map: " + aer.getAnnotatedElement()))
				.forEach(aer -> aer.set(outgoingEndpoints));
	}
	
	// Connection wiring
	@SuppressWarnings("unchecked")
	protected void wireTargetHandler(
			Stream<AnnotatedElementRecord> processorAnnotatedElementRecords,
			ConnectionProcessorConfig<H,E> connectionProcessorConfig) {
		Optional<AnnotatedElementRecord> getter = processorAnnotatedElementRecords
			.filter(aer -> aer.getAnnotation(TargetHandler.class) != null)
			.filter(aer -> aer.mustGet(null, "Cannot use " + aer.getAnnotatedElement() + " to get target connection handler"))
			.findFirst();
		
		if (getter.isPresent()) {
			 connectionProcessorConfig.setTargetHandler((H) getter.get().get());
		}
	}

	protected Consumer<E> wireTargetEndpoint(Stream<AnnotatedElementRecord> processorAnnotatedElementRecords) {
		
		Optional<AnnotatedElementRecord> setter = processorAnnotatedElementRecords
			.filter(aer -> aer.getAnnotation(TargetEndpoint.class) != null)
			.filter(aer -> aer.mustSet(null, "Cannot use " + aer.getAnnotatedElement() + " to set target connection endpoint"))
			.findFirst();
		
		
		if (setter.isPresent()) {
			return targetEndpoint -> setter.get().set(targetEndpoint);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	protected void wireSourceHandler(
			Stream<AnnotatedElementRecord> processorAnnotatedElementRecords,
			ConnectionProcessorConfig<H,E> connectionProcessorConfig) {
		Optional<AnnotatedElementRecord> getter = processorAnnotatedElementRecords
			.filter(aer -> aer.getAnnotation(SourceHandler.class) != null)
			.filter(aer -> aer.mustGet(null, "Cannot use " + aer.getAnnotatedElement() + " to get source connection handler"))
			.findFirst();
		
		if (getter.isPresent()) {
			 connectionProcessorConfig.setSourceHandler((H) getter.get().get());
		}
	}

	protected Consumer<E> wireSourceEndpoint(Stream<AnnotatedElementRecord> processorAnnotatedElementRecords) {
		
		Optional<AnnotatedElementRecord> setter = processorAnnotatedElementRecords
			.filter(aer -> aer.getAnnotation(SourceEndpoint.class) != null)
			.filter(aer -> aer.mustSet(null, "Cannot use " + aer.getAnnotatedElement() + " to set source connection endpoint"))
			.findFirst();
				
		if (setter.isPresent()) {			
			return sourceEndpoint -> setter.get().set(sourceEndpoint);
		}
		return null;
	}
	
	protected boolean matchFactoryMethod(ProcessorConfig elementProcessorConfig, Method method) {
		if (Modifier.isAbstract(method.getModifiers())) {
			return false;
		}
		
		Processor elementProcessorAnnotation = method.getAnnotation(Processor.class);
		if (elementProcessorAnnotation == null) {
			return false;
		}
		
		Element element = elementProcessorConfig.getElement();
		if (!elementProcessorAnnotation.type().isInstance(element)) {
			return false;
		}
		
		if (method.getParameterCount() != 4 ||
				!method.getParameterTypes()[1].isAssignableFrom(boolean.class) ||
				!method.getParameterTypes()[2].isAssignableFrom(BiConsumer.class) ||
				!method.getParameterTypes()[3].isAssignableFrom(ProgressMonitor.class)) {
			throw new IllegalArgumentException("Factory method shall have 4 parameters compatible with: "
					+ "ProcessorConfig config, "
					+ "boolean parallel, "
					+ "BiConsumer<Element, BiConsumer<ProcessorInfo<P>,ProgressMonitor>> infoProvider, "
					+ "ProgressMonitor progressMonitor: " + method);
		}
		
		if (!method.getParameterTypes()[0].isInstance(elementProcessorConfig)) {
			return false;
		}
		
		return matchPredicate(elementProcessorConfig.getElement(), elementProcessorAnnotation.value());
	}
	
}

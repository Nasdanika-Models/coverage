package org.nasdanika.graph.processor;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.function.Consumer;

/**
 * Field or method to inject a map of outgoing connections to {@link Consumer}s of handlers. 
 * This map can be used to provide handlers for outgoing connections.
 * @author Pavel
 *
 */
@Retention(RUNTIME)
@Target({FIELD, METHOD})
public @interface OutgoingHandlerConsumers {
		
}

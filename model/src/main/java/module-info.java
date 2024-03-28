module org.nasdanika.models.coverage {
	exports org.nasdanika.models.coverage;
	exports org.nasdanika.models.coverage.impl;
	exports org.nasdanika.models.coverage.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.jacoco.core;

}
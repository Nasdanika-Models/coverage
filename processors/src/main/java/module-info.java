module org.nasdanika.models.coverage.processors {
		
	requires transitive org.nasdanika.models.coverage;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.coverage.processors;
	opens org.nasdanika.models.coverage.processors; // For loading resources
	
}

package org.nasdanika.models.coverage.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.models.coverage.ModuleCoverage;

public class CoverageTests {
	
	@Test
	public void testLoadExecCoverage() throws Exception {
		File target = new File("..\\..\\..\\git\\core\\graph\\target").getCanonicalFile();
		File jacocoExec = new File(target, "jacoco.exec");
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		try (InputStream in = new FileInputStream(jacocoExec)) {
			ModuleCoverage moduleCoverage = ModuleCoverage.loadJacoco("spring-petclinic", in, new File(target, "classes"));
			Resource res = rs.createResource(URI.createURI("target/coverage.xmi"));
			res.getContents().add(moduleCoverage);
			res.save(null);
		}
	}
	
}

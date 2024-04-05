package org.nasdanika.models.coverage.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.jacoco.core.analysis.Analyzer;
import org.jacoco.core.analysis.CoverageBuilder;
import org.jacoco.core.analysis.IBundleCoverage;
import org.jacoco.core.tools.ExecFileLoader;
import org.jacoco.report.DirectorySourceFileLocator;
import org.jacoco.report.FileMultiReportOutput;
import org.jacoco.report.IReportVisitor;
import org.jacoco.report.html.HTMLFormatter;
import org.junit.jupiter.api.Test;
import org.nasdanika.models.coverage.ModuleCoverage;

public class CoverageTests {
	
	@Test
	public void testLoadExecCoverage() throws Exception {
		File target = new File("testData/target").getCanonicalFile();
		File jacocoExec = new File(target, "jacoco.exec");
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		try (InputStream in = new FileInputStream(jacocoExec)) {
			ModuleCoverage moduleCoverage = ModuleCoverage.loadJacoco("org.nasdanika.graph", in, new File(target, "classes"));
			Resource res = rs.createResource(URI.createURI("target/coverage.xmi"));
			res.getContents().add(moduleCoverage);
			res.save(null);
		}
	}
	
	@Test
	public void testGenerateReportCoverage() throws Exception {
		File target = new File("testData/target").getCanonicalFile();
		File jacocoExec = new File(target, "jacoco.exec");

		ExecFileLoader execFileLoader = new ExecFileLoader();
		execFileLoader.load(jacocoExec);
		CoverageBuilder coverageBuilder = new CoverageBuilder();
		Analyzer analyzer = new Analyzer(execFileLoader.getExecutionDataStore(), coverageBuilder);
		analyzer.analyzeAll(new File(target, "classes"));
		IBundleCoverage bundle = coverageBuilder.getBundle("test");
		
		HTMLFormatter htmlFormatter = new HTMLFormatter();
		File reportDirectory = new File("target/jacoco-report");
		reportDirectory.mkdirs();
		final IReportVisitor visitor = htmlFormatter.createVisitor(new FileMultiReportOutput(reportDirectory));

		visitor.visitInfo(
				execFileLoader.getSessionInfoStore().getInfos(),
				execFileLoader.getExecutionDataStore().getContents());

		visitor.visitBundle(bundle,	new DirectorySourceFileLocator(new File(target, "../src/main/java"), "utf-8", 4));
		visitor.visitEnd();
	}
	
}

/**
 */
package org.nasdanika.models.coverage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.EList;
import org.jacoco.core.analysis.Analyzer;
import org.jacoco.core.analysis.CoverageBuilder;
import org.jacoco.core.analysis.IBundleCoverage;
import org.jacoco.core.analysis.IPackageCoverage;
import org.jacoco.core.tools.ExecFileLoader;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.coverage.ModuleCoverage#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.coverage.CoveragePackage#getModuleCoverage()
 * @model
 * @generated
 */
public interface ModuleCoverage extends Coverage {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.coverage.PackageCoverage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.nasdanika.models.coverage.CoveragePackage#getModuleCoverage_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageCoverage> getPackages();
	
	static ModuleCoverage loadJacoco(String moduleName, InputStream exec, File classesDir) throws IOException {
		ExecFileLoader execFileLoader = new ExecFileLoader();
		execFileLoader.load(exec);
		final CoverageBuilder coverageBuilder = new CoverageBuilder();
		final Analyzer analyzer = new Analyzer(execFileLoader.getExecutionDataStore(), coverageBuilder);
		analyzer.analyzeAll(classesDir);
		IBundleCoverage bundle = coverageBuilder.getBundle(moduleName);
		ModuleCoverage ret = CoverageFactory.eINSTANCE.createModuleCoverage();
		ret.load(bundle);		
		return ret;
	}
	
	default void load(IBundleCoverage data) {
		Coverage.super.load(data);
		EList<PackageCoverage> packages = getPackages();
		for (IPackageCoverage dp: data.getPackages()) {
			PackageCoverage pc = CoverageFactory.eINSTANCE.createPackageCoverage();
			pc.load(dp);
			packages.add(pc);
		}
	}

} // ModuleCoverage

/**
 */
package org.nasdanika.models.coverage;

import org.eclipse.emf.common.util.EList;
import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.analysis.IPackageCoverage;
import org.jacoco.core.analysis.ISourceFileCoverage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.coverage.PackageCoverage#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.PackageCoverage#getSourceFiles <em>Source Files</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.coverage.CoveragePackage#getPackageCoverage()
 * @model
 * @generated
 */
public interface PackageCoverage extends Coverage {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.coverage.ClassCoverage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see org.nasdanika.models.coverage.CoveragePackage#getPackageCoverage_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassCoverage> getClasses();

	/**
	 * Returns the value of the '<em><b>Source Files</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.coverage.SourceFileCoverage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Files</em>' containment reference list.
	 * @see org.nasdanika.models.coverage.CoveragePackage#getPackageCoverage_SourceFiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceFileCoverage> getSourceFiles();
	
	default void load(IPackageCoverage data) {
		Coverage.super.load(data);
		EList<ClassCoverage> classes = getClasses();
		for (IClassCoverage ccData: data.getClasses()) {
			ClassCoverage cc = CoverageFactory.eINSTANCE.createClassCoverage();
			cc.load(ccData);
			classes.add(cc);
		}
		
		EList<SourceFileCoverage> sourceFiles = getSourceFiles();
		for (ISourceFileCoverage sfData: data.getSourceFiles()) {
			SourceFileCoverage sfc = CoverageFactory.eINSTANCE.createSourceFileCoverage();
			sfc.load(sfData);
			sourceFiles.add(sfc);
		}
	}

} // PackageCoverage

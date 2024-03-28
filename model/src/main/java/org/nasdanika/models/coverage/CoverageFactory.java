/**
 */
package org.nasdanika.models.coverage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.coverage.CoveragePackage
 * @generated
 */
public interface CoverageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoverageFactory eINSTANCE = org.nasdanika.models.coverage.impl.CoverageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Counter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Counter</em>'.
	 * @generated
	 */
	Counter createCounter();

	/**
	 * Returns a new object of class '<em>Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage</em>'.
	 * @generated
	 */
	Coverage createCoverage();

	/**
	 * Returns a new object of class '<em>Module Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Coverage</em>'.
	 * @generated
	 */
	ModuleCoverage createModuleCoverage();

	/**
	 * Returns a new object of class '<em>Package Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Coverage</em>'.
	 * @generated
	 */
	PackageCoverage createPackageCoverage();

	/**
	 * Returns a new object of class '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line</em>'.
	 * @generated
	 */
	Line createLine();

	/**
	 * Returns a new object of class '<em>Source Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Coverage</em>'.
	 * @generated
	 */
	SourceCoverage createSourceCoverage();

	/**
	 * Returns a new object of class '<em>Class Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Coverage</em>'.
	 * @generated
	 */
	ClassCoverage createClassCoverage();

	/**
	 * Returns a new object of class '<em>Method Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Coverage</em>'.
	 * @generated
	 */
	MethodCoverage createMethodCoverage();

	/**
	 * Returns a new object of class '<em>Source File Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source File Coverage</em>'.
	 * @generated
	 */
	SourceFileCoverage createSourceFileCoverage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CoveragePackage getCoveragePackage();

} //CoverageFactory

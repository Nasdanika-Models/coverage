/**
 */
package org.nasdanika.models.coverage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.coverage.ClassCoverage;
import org.nasdanika.models.coverage.CoveragePackage;
import org.nasdanika.models.coverage.PackageCoverage;
import org.nasdanika.models.coverage.SourceFileCoverage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.coverage.impl.PackageCoverageImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.PackageCoverageImpl#getSourceFiles <em>Source Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageCoverageImpl extends CoverageImpl implements PackageCoverage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageCoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoveragePackage.Literals.PACKAGE_COVERAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ClassCoverage> getClasses() {
		return (EList<ClassCoverage>)eDynamicGet(CoveragePackage.PACKAGE_COVERAGE__CLASSES, CoveragePackage.Literals.PACKAGE_COVERAGE__CLASSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SourceFileCoverage> getSourceFiles() {
		return (EList<SourceFileCoverage>)eDynamicGet(CoveragePackage.PACKAGE_COVERAGE__SOURCE_FILES, CoveragePackage.Literals.PACKAGE_COVERAGE__SOURCE_FILES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoveragePackage.PACKAGE_COVERAGE__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case CoveragePackage.PACKAGE_COVERAGE__SOURCE_FILES:
				return ((InternalEList<?>)getSourceFiles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoveragePackage.PACKAGE_COVERAGE__CLASSES:
				return getClasses();
			case CoveragePackage.PACKAGE_COVERAGE__SOURCE_FILES:
				return getSourceFiles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoveragePackage.PACKAGE_COVERAGE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends ClassCoverage>)newValue);
				return;
			case CoveragePackage.PACKAGE_COVERAGE__SOURCE_FILES:
				getSourceFiles().clear();
				getSourceFiles().addAll((Collection<? extends SourceFileCoverage>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CoveragePackage.PACKAGE_COVERAGE__CLASSES:
				getClasses().clear();
				return;
			case CoveragePackage.PACKAGE_COVERAGE__SOURCE_FILES:
				getSourceFiles().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CoveragePackage.PACKAGE_COVERAGE__CLASSES:
				return !getClasses().isEmpty();
			case CoveragePackage.PACKAGE_COVERAGE__SOURCE_FILES:
				return !getSourceFiles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageCoverageImpl

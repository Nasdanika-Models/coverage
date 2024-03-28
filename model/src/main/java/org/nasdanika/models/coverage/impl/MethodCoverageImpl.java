/**
 */
package org.nasdanika.models.coverage.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.coverage.CoveragePackage;
import org.nasdanika.models.coverage.MethodCoverage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.coverage.impl.MethodCoverageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.MethodCoverageImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodCoverageImpl extends SourceCoverageImpl implements MethodCoverage {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodCoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoveragePackage.Literals.METHOD_COVERAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(CoveragePackage.METHOD_COVERAGE__DESCRIPTION, CoveragePackage.Literals.METHOD_COVERAGE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(CoveragePackage.METHOD_COVERAGE__DESCRIPTION, CoveragePackage.Literals.METHOD_COVERAGE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignature() {
		return (String)eDynamicGet(CoveragePackage.METHOD_COVERAGE__SIGNATURE, CoveragePackage.Literals.METHOD_COVERAGE__SIGNATURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignature(String newSignature) {
		eDynamicSet(CoveragePackage.METHOD_COVERAGE__SIGNATURE, CoveragePackage.Literals.METHOD_COVERAGE__SIGNATURE, newSignature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoveragePackage.METHOD_COVERAGE__DESCRIPTION:
				return getDescription();
			case CoveragePackage.METHOD_COVERAGE__SIGNATURE:
				return getSignature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoveragePackage.METHOD_COVERAGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CoveragePackage.METHOD_COVERAGE__SIGNATURE:
				setSignature((String)newValue);
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
			case CoveragePackage.METHOD_COVERAGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CoveragePackage.METHOD_COVERAGE__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
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
			case CoveragePackage.METHOD_COVERAGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case CoveragePackage.METHOD_COVERAGE__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? getSignature() != null : !SIGNATURE_EDEFAULT.equals(getSignature());
		}
		return super.eIsSet(featureID);
	}

} //MethodCoverageImpl

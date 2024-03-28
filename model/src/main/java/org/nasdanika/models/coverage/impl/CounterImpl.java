/**
 */
package org.nasdanika.models.coverage.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.coverage.Counter;
import org.nasdanika.models.coverage.CoveragePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Counter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.coverage.impl.CounterImpl#getCovered <em>Covered</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.CounterImpl#getMissed <em>Missed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CounterImpl extends MinimalEObjectImpl.Container implements Counter {
	/**
	 * The default value of the '{@link #getCovered() <em>Covered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovered()
	 * @generated
	 * @ordered
	 */
	protected static final int COVERED_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getMissed() <em>Missed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissed()
	 * @generated
	 * @ordered
	 */
	protected static final int MISSED_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoveragePackage.Literals.COUNTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCovered() {
		return (Integer)eDynamicGet(CoveragePackage.COUNTER__COVERED, CoveragePackage.Literals.COUNTER__COVERED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCovered(int newCovered) {
		eDynamicSet(CoveragePackage.COUNTER__COVERED, CoveragePackage.Literals.COUNTER__COVERED, newCovered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMissed() {
		return (Integer)eDynamicGet(CoveragePackage.COUNTER__MISSED, CoveragePackage.Literals.COUNTER__MISSED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMissed(int newMissed) {
		eDynamicSet(CoveragePackage.COUNTER__MISSED, CoveragePackage.Literals.COUNTER__MISSED, newMissed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoveragePackage.COUNTER__COVERED:
				return getCovered();
			case CoveragePackage.COUNTER__MISSED:
				return getMissed();
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
			case CoveragePackage.COUNTER__COVERED:
				setCovered((Integer)newValue);
				return;
			case CoveragePackage.COUNTER__MISSED:
				setMissed((Integer)newValue);
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
			case CoveragePackage.COUNTER__COVERED:
				setCovered(COVERED_EDEFAULT);
				return;
			case CoveragePackage.COUNTER__MISSED:
				setMissed(MISSED_EDEFAULT);
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
			case CoveragePackage.COUNTER__COVERED:
				return getCovered() != COVERED_EDEFAULT;
			case CoveragePackage.COUNTER__MISSED:
				return getMissed() != MISSED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //CounterImpl

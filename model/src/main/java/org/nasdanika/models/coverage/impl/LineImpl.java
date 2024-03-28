/**
 */
package org.nasdanika.models.coverage.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.coverage.Counter;
import org.nasdanika.models.coverage.CoveragePackage;
import org.nasdanika.models.coverage.Line;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.coverage.impl.LineImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.LineImpl#getInstructionCounter <em>Instruction Counter</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.LineImpl#getBranchCounter <em>Branch Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineImpl extends MinimalEObjectImpl.Container implements Line {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoveragePackage.Literals.LINE;
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
	public int getNumber() {
		return (Integer)eDynamicGet(CoveragePackage.LINE__NUMBER, CoveragePackage.Literals.LINE__NUMBER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(int newNumber) {
		eDynamicSet(CoveragePackage.LINE__NUMBER, CoveragePackage.Literals.LINE__NUMBER, newNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Counter getInstructionCounter() {
		return (Counter)eDynamicGet(CoveragePackage.LINE__INSTRUCTION_COUNTER, CoveragePackage.Literals.LINE__INSTRUCTION_COUNTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstructionCounter(Counter newInstructionCounter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newInstructionCounter, CoveragePackage.LINE__INSTRUCTION_COUNTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstructionCounter(Counter newInstructionCounter) {
		eDynamicSet(CoveragePackage.LINE__INSTRUCTION_COUNTER, CoveragePackage.Literals.LINE__INSTRUCTION_COUNTER, newInstructionCounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Counter getBranchCounter() {
		return (Counter)eDynamicGet(CoveragePackage.LINE__BRANCH_COUNTER, CoveragePackage.Literals.LINE__BRANCH_COUNTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranchCounter(Counter newBranchCounter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBranchCounter, CoveragePackage.LINE__BRANCH_COUNTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBranchCounter(Counter newBranchCounter) {
		eDynamicSet(CoveragePackage.LINE__BRANCH_COUNTER, CoveragePackage.Literals.LINE__BRANCH_COUNTER, newBranchCounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoveragePackage.LINE__INSTRUCTION_COUNTER:
				return basicSetInstructionCounter(null, msgs);
			case CoveragePackage.LINE__BRANCH_COUNTER:
				return basicSetBranchCounter(null, msgs);
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
			case CoveragePackage.LINE__NUMBER:
				return getNumber();
			case CoveragePackage.LINE__INSTRUCTION_COUNTER:
				return getInstructionCounter();
			case CoveragePackage.LINE__BRANCH_COUNTER:
				return getBranchCounter();
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
			case CoveragePackage.LINE__NUMBER:
				setNumber((Integer)newValue);
				return;
			case CoveragePackage.LINE__INSTRUCTION_COUNTER:
				setInstructionCounter((Counter)newValue);
				return;
			case CoveragePackage.LINE__BRANCH_COUNTER:
				setBranchCounter((Counter)newValue);
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
			case CoveragePackage.LINE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case CoveragePackage.LINE__INSTRUCTION_COUNTER:
				setInstructionCounter((Counter)null);
				return;
			case CoveragePackage.LINE__BRANCH_COUNTER:
				setBranchCounter((Counter)null);
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
			case CoveragePackage.LINE__NUMBER:
				return getNumber() != NUMBER_EDEFAULT;
			case CoveragePackage.LINE__INSTRUCTION_COUNTER:
				return getInstructionCounter() != null;
			case CoveragePackage.LINE__BRANCH_COUNTER:
				return getBranchCounter() != null;
		}
		return super.eIsSet(featureID);
	}

} //LineImpl

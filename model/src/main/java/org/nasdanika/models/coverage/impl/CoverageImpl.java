/**
 */
package org.nasdanika.models.coverage.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.coverage.Counter;
import org.nasdanika.models.coverage.Coverage;
import org.nasdanika.models.coverage.CoveragePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.coverage.impl.CoverageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.CoverageImpl#getInstructionCounter <em>Instruction Counter</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.CoverageImpl#getBranchCounter <em>Branch Counter</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.CoverageImpl#getLineCounter <em>Line Counter</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.CoverageImpl#getComplexityCounter <em>Complexity Counter</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.CoverageImpl#getMethodCounter <em>Method Counter</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.CoverageImpl#getClassCounter <em>Class Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageImpl extends MinimalEObjectImpl.Container implements Coverage {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoveragePackage.Literals.COVERAGE;
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
	public String getName() {
		return (String)eDynamicGet(CoveragePackage.COVERAGE__NAME, CoveragePackage.Literals.COVERAGE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(CoveragePackage.COVERAGE__NAME, CoveragePackage.Literals.COVERAGE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Counter getInstructionCounter() {
		return (Counter)eDynamicGet(CoveragePackage.COVERAGE__INSTRUCTION_COUNTER, CoveragePackage.Literals.COVERAGE__INSTRUCTION_COUNTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstructionCounter(Counter newInstructionCounter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newInstructionCounter, CoveragePackage.COVERAGE__INSTRUCTION_COUNTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstructionCounter(Counter newInstructionCounter) {
		eDynamicSet(CoveragePackage.COVERAGE__INSTRUCTION_COUNTER, CoveragePackage.Literals.COVERAGE__INSTRUCTION_COUNTER, newInstructionCounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Counter getBranchCounter() {
		return (Counter)eDynamicGet(CoveragePackage.COVERAGE__BRANCH_COUNTER, CoveragePackage.Literals.COVERAGE__BRANCH_COUNTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranchCounter(Counter newBranchCounter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBranchCounter, CoveragePackage.COVERAGE__BRANCH_COUNTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBranchCounter(Counter newBranchCounter) {
		eDynamicSet(CoveragePackage.COVERAGE__BRANCH_COUNTER, CoveragePackage.Literals.COVERAGE__BRANCH_COUNTER, newBranchCounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Counter getLineCounter() {
		return (Counter)eDynamicGet(CoveragePackage.COVERAGE__LINE_COUNTER, CoveragePackage.Literals.COVERAGE__LINE_COUNTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineCounter(Counter newLineCounter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLineCounter, CoveragePackage.COVERAGE__LINE_COUNTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineCounter(Counter newLineCounter) {
		eDynamicSet(CoveragePackage.COVERAGE__LINE_COUNTER, CoveragePackage.Literals.COVERAGE__LINE_COUNTER, newLineCounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Counter getComplexityCounter() {
		return (Counter)eDynamicGet(CoveragePackage.COVERAGE__COMPLEXITY_COUNTER, CoveragePackage.Literals.COVERAGE__COMPLEXITY_COUNTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexityCounter(Counter newComplexityCounter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newComplexityCounter, CoveragePackage.COVERAGE__COMPLEXITY_COUNTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComplexityCounter(Counter newComplexityCounter) {
		eDynamicSet(CoveragePackage.COVERAGE__COMPLEXITY_COUNTER, CoveragePackage.Literals.COVERAGE__COMPLEXITY_COUNTER, newComplexityCounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Counter getMethodCounter() {
		return (Counter)eDynamicGet(CoveragePackage.COVERAGE__METHOD_COUNTER, CoveragePackage.Literals.COVERAGE__METHOD_COUNTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodCounter(Counter newMethodCounter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMethodCounter, CoveragePackage.COVERAGE__METHOD_COUNTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodCounter(Counter newMethodCounter) {
		eDynamicSet(CoveragePackage.COVERAGE__METHOD_COUNTER, CoveragePackage.Literals.COVERAGE__METHOD_COUNTER, newMethodCounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Counter getClassCounter() {
		return (Counter)eDynamicGet(CoveragePackage.COVERAGE__CLASS_COUNTER, CoveragePackage.Literals.COVERAGE__CLASS_COUNTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassCounter(Counter newClassCounter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newClassCounter, CoveragePackage.COVERAGE__CLASS_COUNTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassCounter(Counter newClassCounter) {
		eDynamicSet(CoveragePackage.COVERAGE__CLASS_COUNTER, CoveragePackage.Literals.COVERAGE__CLASS_COUNTER, newClassCounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoveragePackage.COVERAGE__INSTRUCTION_COUNTER:
				return basicSetInstructionCounter(null, msgs);
			case CoveragePackage.COVERAGE__BRANCH_COUNTER:
				return basicSetBranchCounter(null, msgs);
			case CoveragePackage.COVERAGE__LINE_COUNTER:
				return basicSetLineCounter(null, msgs);
			case CoveragePackage.COVERAGE__COMPLEXITY_COUNTER:
				return basicSetComplexityCounter(null, msgs);
			case CoveragePackage.COVERAGE__METHOD_COUNTER:
				return basicSetMethodCounter(null, msgs);
			case CoveragePackage.COVERAGE__CLASS_COUNTER:
				return basicSetClassCounter(null, msgs);
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
			case CoveragePackage.COVERAGE__NAME:
				return getName();
			case CoveragePackage.COVERAGE__INSTRUCTION_COUNTER:
				return getInstructionCounter();
			case CoveragePackage.COVERAGE__BRANCH_COUNTER:
				return getBranchCounter();
			case CoveragePackage.COVERAGE__LINE_COUNTER:
				return getLineCounter();
			case CoveragePackage.COVERAGE__COMPLEXITY_COUNTER:
				return getComplexityCounter();
			case CoveragePackage.COVERAGE__METHOD_COUNTER:
				return getMethodCounter();
			case CoveragePackage.COVERAGE__CLASS_COUNTER:
				return getClassCounter();
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
			case CoveragePackage.COVERAGE__NAME:
				setName((String)newValue);
				return;
			case CoveragePackage.COVERAGE__INSTRUCTION_COUNTER:
				setInstructionCounter((Counter)newValue);
				return;
			case CoveragePackage.COVERAGE__BRANCH_COUNTER:
				setBranchCounter((Counter)newValue);
				return;
			case CoveragePackage.COVERAGE__LINE_COUNTER:
				setLineCounter((Counter)newValue);
				return;
			case CoveragePackage.COVERAGE__COMPLEXITY_COUNTER:
				setComplexityCounter((Counter)newValue);
				return;
			case CoveragePackage.COVERAGE__METHOD_COUNTER:
				setMethodCounter((Counter)newValue);
				return;
			case CoveragePackage.COVERAGE__CLASS_COUNTER:
				setClassCounter((Counter)newValue);
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
			case CoveragePackage.COVERAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoveragePackage.COVERAGE__INSTRUCTION_COUNTER:
				setInstructionCounter((Counter)null);
				return;
			case CoveragePackage.COVERAGE__BRANCH_COUNTER:
				setBranchCounter((Counter)null);
				return;
			case CoveragePackage.COVERAGE__LINE_COUNTER:
				setLineCounter((Counter)null);
				return;
			case CoveragePackage.COVERAGE__COMPLEXITY_COUNTER:
				setComplexityCounter((Counter)null);
				return;
			case CoveragePackage.COVERAGE__METHOD_COUNTER:
				setMethodCounter((Counter)null);
				return;
			case CoveragePackage.COVERAGE__CLASS_COUNTER:
				setClassCounter((Counter)null);
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
			case CoveragePackage.COVERAGE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CoveragePackage.COVERAGE__INSTRUCTION_COUNTER:
				return getInstructionCounter() != null;
			case CoveragePackage.COVERAGE__BRANCH_COUNTER:
				return getBranchCounter() != null;
			case CoveragePackage.COVERAGE__LINE_COUNTER:
				return getLineCounter() != null;
			case CoveragePackage.COVERAGE__COMPLEXITY_COUNTER:
				return getComplexityCounter() != null;
			case CoveragePackage.COVERAGE__METHOD_COUNTER:
				return getMethodCounter() != null;
			case CoveragePackage.COVERAGE__CLASS_COUNTER:
				return getClassCounter() != null;
		}
		return super.eIsSet(featureID);
	}

} //CoverageImpl

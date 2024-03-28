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
import org.nasdanika.models.coverage.MethodCoverage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.coverage.impl.ClassCoverageImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.ClassCoverageImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.ClassCoverageImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.ClassCoverageImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.ClassCoverageImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.ClassCoverageImpl#isNoMatch <em>No Match</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassCoverageImpl extends SourceCoverageImpl implements ClassCoverage {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getSuperType() <em>Super Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPER_TYPE_EDEFAULT = null;

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
	 * The default value of the '{@link #isNoMatch() <em>No Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoMatch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_MATCH_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassCoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoveragePackage.Literals.CLASS_COVERAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getId() {
		return (Long)eDynamicGet(CoveragePackage.CLASS_COVERAGE__ID, CoveragePackage.Literals.CLASS_COVERAGE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(long newId) {
		eDynamicSet(CoveragePackage.CLASS_COVERAGE__ID, CoveragePackage.Literals.CLASS_COVERAGE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getInterfaces() {
		return (EList<String>)eDynamicGet(CoveragePackage.CLASS_COVERAGE__INTERFACES, CoveragePackage.Literals.CLASS_COVERAGE__INTERFACES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuperType() {
		return (String)eDynamicGet(CoveragePackage.CLASS_COVERAGE__SUPER_TYPE, CoveragePackage.Literals.CLASS_COVERAGE__SUPER_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperType(String newSuperType) {
		eDynamicSet(CoveragePackage.CLASS_COVERAGE__SUPER_TYPE, CoveragePackage.Literals.CLASS_COVERAGE__SUPER_TYPE, newSuperType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<MethodCoverage> getMethods() {
		return (EList<MethodCoverage>)eDynamicGet(CoveragePackage.CLASS_COVERAGE__METHODS, CoveragePackage.Literals.CLASS_COVERAGE__METHODS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignature() {
		return (String)eDynamicGet(CoveragePackage.CLASS_COVERAGE__SIGNATURE, CoveragePackage.Literals.CLASS_COVERAGE__SIGNATURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignature(String newSignature) {
		eDynamicSet(CoveragePackage.CLASS_COVERAGE__SIGNATURE, CoveragePackage.Literals.CLASS_COVERAGE__SIGNATURE, newSignature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoMatch() {
		return (Boolean)eDynamicGet(CoveragePackage.CLASS_COVERAGE__NO_MATCH, CoveragePackage.Literals.CLASS_COVERAGE__NO_MATCH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoMatch(boolean newNoMatch) {
		eDynamicSet(CoveragePackage.CLASS_COVERAGE__NO_MATCH, CoveragePackage.Literals.CLASS_COVERAGE__NO_MATCH, newNoMatch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoveragePackage.CLASS_COVERAGE__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
			case CoveragePackage.CLASS_COVERAGE__ID:
				return getId();
			case CoveragePackage.CLASS_COVERAGE__INTERFACES:
				return getInterfaces();
			case CoveragePackage.CLASS_COVERAGE__SUPER_TYPE:
				return getSuperType();
			case CoveragePackage.CLASS_COVERAGE__METHODS:
				return getMethods();
			case CoveragePackage.CLASS_COVERAGE__SIGNATURE:
				return getSignature();
			case CoveragePackage.CLASS_COVERAGE__NO_MATCH:
				return isNoMatch();
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
			case CoveragePackage.CLASS_COVERAGE__ID:
				setId((Long)newValue);
				return;
			case CoveragePackage.CLASS_COVERAGE__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends String>)newValue);
				return;
			case CoveragePackage.CLASS_COVERAGE__SUPER_TYPE:
				setSuperType((String)newValue);
				return;
			case CoveragePackage.CLASS_COVERAGE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends MethodCoverage>)newValue);
				return;
			case CoveragePackage.CLASS_COVERAGE__SIGNATURE:
				setSignature((String)newValue);
				return;
			case CoveragePackage.CLASS_COVERAGE__NO_MATCH:
				setNoMatch((Boolean)newValue);
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
			case CoveragePackage.CLASS_COVERAGE__ID:
				setId(ID_EDEFAULT);
				return;
			case CoveragePackage.CLASS_COVERAGE__INTERFACES:
				getInterfaces().clear();
				return;
			case CoveragePackage.CLASS_COVERAGE__SUPER_TYPE:
				setSuperType(SUPER_TYPE_EDEFAULT);
				return;
			case CoveragePackage.CLASS_COVERAGE__METHODS:
				getMethods().clear();
				return;
			case CoveragePackage.CLASS_COVERAGE__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case CoveragePackage.CLASS_COVERAGE__NO_MATCH:
				setNoMatch(NO_MATCH_EDEFAULT);
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
			case CoveragePackage.CLASS_COVERAGE__ID:
				return getId() != ID_EDEFAULT;
			case CoveragePackage.CLASS_COVERAGE__INTERFACES:
				return !getInterfaces().isEmpty();
			case CoveragePackage.CLASS_COVERAGE__SUPER_TYPE:
				return SUPER_TYPE_EDEFAULT == null ? getSuperType() != null : !SUPER_TYPE_EDEFAULT.equals(getSuperType());
			case CoveragePackage.CLASS_COVERAGE__METHODS:
				return !getMethods().isEmpty();
			case CoveragePackage.CLASS_COVERAGE__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? getSignature() != null : !SIGNATURE_EDEFAULT.equals(getSignature());
			case CoveragePackage.CLASS_COVERAGE__NO_MATCH:
				return isNoMatch() != NO_MATCH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ClassCoverageImpl

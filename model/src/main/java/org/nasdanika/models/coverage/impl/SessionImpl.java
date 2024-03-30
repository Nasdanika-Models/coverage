/**
 */
package org.nasdanika.models.coverage.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.coverage.CoveragePackage;
import org.nasdanika.models.coverage.Session;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.coverage.impl.SessionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.SessionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.impl.SessionImpl#getDump <em>Dump</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SessionImpl extends MinimalEObjectImpl.Container implements Session {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDump() <em>Dump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDump()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUMP_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoveragePackage.Literals.SESSION;
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
	public String getId() {
		return (String)eDynamicGet(CoveragePackage.SESSION__ID, CoveragePackage.Literals.SESSION__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(CoveragePackage.SESSION__ID, CoveragePackage.Literals.SESSION__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStart() {
		return (Date)eDynamicGet(CoveragePackage.SESSION__START, CoveragePackage.Literals.SESSION__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Date newStart) {
		eDynamicSet(CoveragePackage.SESSION__START, CoveragePackage.Literals.SESSION__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDump() {
		return (Date)eDynamicGet(CoveragePackage.SESSION__DUMP, CoveragePackage.Literals.SESSION__DUMP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDump(Date newDump) {
		eDynamicSet(CoveragePackage.SESSION__DUMP, CoveragePackage.Literals.SESSION__DUMP, newDump);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoveragePackage.SESSION__ID:
				return getId();
			case CoveragePackage.SESSION__START:
				return getStart();
			case CoveragePackage.SESSION__DUMP:
				return getDump();
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
			case CoveragePackage.SESSION__ID:
				setId((String)newValue);
				return;
			case CoveragePackage.SESSION__START:
				setStart((Date)newValue);
				return;
			case CoveragePackage.SESSION__DUMP:
				setDump((Date)newValue);
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
			case CoveragePackage.SESSION__ID:
				setId(ID_EDEFAULT);
				return;
			case CoveragePackage.SESSION__START:
				setStart(START_EDEFAULT);
				return;
			case CoveragePackage.SESSION__DUMP:
				setDump(DUMP_EDEFAULT);
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
			case CoveragePackage.SESSION__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case CoveragePackage.SESSION__START:
				return START_EDEFAULT == null ? getStart() != null : !START_EDEFAULT.equals(getStart());
			case CoveragePackage.SESSION__DUMP:
				return DUMP_EDEFAULT == null ? getDump() != null : !DUMP_EDEFAULT.equals(getDump());
		}
		return super.eIsSet(featureID);
	}

} //SessionImpl

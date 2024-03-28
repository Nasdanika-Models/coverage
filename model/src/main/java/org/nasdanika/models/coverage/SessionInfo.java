/**
 */
package org.nasdanika.models.coverage;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.coverage.SessionInfo#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.SessionInfo#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.SessionInfo#getDump <em>Dump</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.coverage.CoveragePackage#getSessionInfo()
 * @model
 * @generated
 */
public interface SessionInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getSessionInfo_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.SessionInfo#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getSessionInfo_Start()
	 * @model
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.SessionInfo#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>Dump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dump</em>' attribute.
	 * @see #setDump(Date)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getSessionInfo_Dump()
	 * @model
	 * @generated
	 */
	Date getDump();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.SessionInfo#getDump <em>Dump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dump</em>' attribute.
	 * @see #getDump()
	 * @generated
	 */
	void setDump(Date value);

} // SessionInfo

/**
 */
package org.nasdanika.models.coverage;

import org.eclipse.emf.ecore.EObject;
import org.jacoco.core.analysis.ICounter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.coverage.Counter#getCovered <em>Covered</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.Counter#getMissed <em>Missed</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.coverage.CoveragePackage#getCounter()
 * @model
 * @generated
 */
public interface Counter extends EObject {
	/**
	 * Returns the value of the '<em><b>Covered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered</em>' attribute.
	 * @see #setCovered(int)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getCounter_Covered()
	 * @model
	 * @generated
	 */
	int getCovered();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.Counter#getCovered <em>Covered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Covered</em>' attribute.
	 * @see #getCovered()
	 * @generated
	 */
	void setCovered(int value);

	/**
	 * Returns the value of the '<em><b>Missed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missed</em>' attribute.
	 * @see #setMissed(int)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getCounter_Missed()
	 * @model
	 * @generated
	 */
	int getMissed();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.Counter#getMissed <em>Missed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missed</em>' attribute.
	 * @see #getMissed()
	 * @generated
	 */
	void setMissed(int value);
	
	static Counter load(ICounter data) {
		if (data == null) {
			return null;
		}
		Counter ret = CoverageFactory.eINSTANCE.createCounter();
		ret.setCovered(data.getCoveredCount());
		ret.setMissed(data.getMissedCount());
		return ret;
	}

} // Counter

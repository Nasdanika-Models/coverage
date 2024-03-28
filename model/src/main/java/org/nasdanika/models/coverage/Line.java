/**
 */
package org.nasdanika.models.coverage;

import org.eclipse.emf.ecore.EObject;
import org.jacoco.core.analysis.ILine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.coverage.Line#getNumber <em>Number</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.Line#getInstructionCounter <em>Instruction Counter</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.Line#getBranchCounter <em>Branch Counter</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.coverage.CoveragePackage#getLine()
 * @model
 * @generated
 */
public interface Line extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getLine_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.Line#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Instruction Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Counter</em>' containment reference.
	 * @see #setInstructionCounter(Counter)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getLine_InstructionCounter()
	 * @model containment="true"
	 * @generated
	 */
	Counter getInstructionCounter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.Line#getInstructionCounter <em>Instruction Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction Counter</em>' containment reference.
	 * @see #getInstructionCounter()
	 * @generated
	 */
	void setInstructionCounter(Counter value);

	/**
	 * Returns the value of the '<em><b>Branch Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Counter</em>' containment reference.
	 * @see #setBranchCounter(Counter)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getLine_BranchCounter()
	 * @model containment="true"
	 * @generated
	 */
	Counter getBranchCounter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.Line#getBranchCounter <em>Branch Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Counter</em>' containment reference.
	 * @see #getBranchCounter()
	 * @generated
	 */
	void setBranchCounter(Counter value);

	static Line load(ILine line, int i) {
		Line ret = CoverageFactory.eINSTANCE.createLine();
		ret.setBranchCounter(Counter.load(line.getBranchCounter()));
		ret.setInstructionCounter(Counter.load(line.getInstructionCounter()));
		ret.setNumber(i);
		return ret;
	}

} // Line

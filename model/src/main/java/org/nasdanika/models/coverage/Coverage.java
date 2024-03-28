/**
 */
package org.nasdanika.models.coverage;

import org.eclipse.emf.ecore.EObject;
import org.jacoco.core.analysis.ICoverageNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.coverage.Coverage#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.Coverage#getInstructionCounter <em>Instruction Counter</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.Coverage#getBranchCounter <em>Branch Counter</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.Coverage#getLineCounter <em>Line Counter</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.Coverage#getComplexityCounter <em>Complexity Counter</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.Coverage#getMethodCounter <em>Method Counter</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.Coverage#getClassCounter <em>Class Counter</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.coverage.CoveragePackage#getCoverage()
 * @model
 * @generated
 */
public interface Coverage extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getCoverage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.Coverage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Instruction Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Counter</em>' containment reference.
	 * @see #setInstructionCounter(Counter)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getCoverage_InstructionCounter()
	 * @model containment="true"
	 * @generated
	 */
	Counter getInstructionCounter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.Coverage#getInstructionCounter <em>Instruction Counter</em>}' containment reference.
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
	 * @see org.nasdanika.models.coverage.CoveragePackage#getCoverage_BranchCounter()
	 * @model containment="true"
	 * @generated
	 */
	Counter getBranchCounter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.Coverage#getBranchCounter <em>Branch Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Counter</em>' containment reference.
	 * @see #getBranchCounter()
	 * @generated
	 */
	void setBranchCounter(Counter value);

	/**
	 * Returns the value of the '<em><b>Line Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Counter</em>' containment reference.
	 * @see #setLineCounter(Counter)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getCoverage_LineCounter()
	 * @model containment="true"
	 * @generated
	 */
	Counter getLineCounter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.Coverage#getLineCounter <em>Line Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Counter</em>' containment reference.
	 * @see #getLineCounter()
	 * @generated
	 */
	void setLineCounter(Counter value);

	/**
	 * Returns the value of the '<em><b>Complexity Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complexity Counter</em>' containment reference.
	 * @see #setComplexityCounter(Counter)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getCoverage_ComplexityCounter()
	 * @model containment="true"
	 * @generated
	 */
	Counter getComplexityCounter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.Coverage#getComplexityCounter <em>Complexity Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complexity Counter</em>' containment reference.
	 * @see #getComplexityCounter()
	 * @generated
	 */
	void setComplexityCounter(Counter value);

	/**
	 * Returns the value of the '<em><b>Method Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Counter</em>' containment reference.
	 * @see #setMethodCounter(Counter)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getCoverage_MethodCounter()
	 * @model containment="true"
	 * @generated
	 */
	Counter getMethodCounter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.Coverage#getMethodCounter <em>Method Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Counter</em>' containment reference.
	 * @see #getMethodCounter()
	 * @generated
	 */
	void setMethodCounter(Counter value);

	/**
	 * Returns the value of the '<em><b>Class Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Counter</em>' containment reference.
	 * @see #setClassCounter(Counter)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getCoverage_ClassCounter()
	 * @model containment="true"
	 * @generated
	 */
	Counter getClassCounter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.Coverage#getClassCounter <em>Class Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Counter</em>' containment reference.
	 * @see #getClassCounter()
	 * @generated
	 */
	void setClassCounter(Counter value);
	
	default void load(ICoverageNode data) {
		setBranchCounter(Counter.load(data.getBranchCounter()));
		setClassCounter(Counter.load(data.getClassCounter()));
		setComplexityCounter(Counter.load(data.getComplexityCounter()));
		setInstructionCounter(Counter.load(data.getInstructionCounter()));
		setLineCounter(Counter.load(data.getLineCounter()));
		setMethodCounter(Counter.load(data.getMethodCounter()));
		setName(data.getName());
	}
	
} // Coverage

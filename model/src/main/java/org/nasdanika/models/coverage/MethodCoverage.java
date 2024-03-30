/**
 */
package org.nasdanika.models.coverage;

import org.eclipse.emf.common.util.EList;
import org.jacoco.core.analysis.IMethodCoverage;
import org.objectweb.asm.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.coverage.MethodCoverage#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.MethodCoverage#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.MethodCoverage#getParameterTypes <em>Parameter Types</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.coverage.CoveragePackage#getMethodCoverage()
 * @model
 * @generated
 */
public interface MethodCoverage extends SourceCoverage {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getMethodCoverage_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.MethodCoverage#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getMethodCoverage_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.MethodCoverage#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);
	
	/**
	 * Returns the value of the '<em><b>Parameter Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Types</em>' attribute list.
	 * @see org.nasdanika.models.coverage.CoveragePackage#getMethodCoverage_ParameterTypes()
	 * @model
	 * @generated
	 */
	EList<String> getParameterTypes();

	default void load(IMethodCoverage data) {
		SourceCoverage.super.load(data);
		setDescription(data.getDesc());
		setSignature(data.getSignature());
		if (data.getDesc() != null) {
			Type[] argumentTypes = Type.getArgumentTypes(data.getDesc());
			EList<String> parameterTypes = getParameterTypes();
			if (argumentTypes != null) {
				for (Type type: argumentTypes) {
					parameterTypes.add(type.getClassName());
				}
			}			
		}
		
	}

} // MethodCoverage

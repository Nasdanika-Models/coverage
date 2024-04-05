/**
 */
package org.nasdanika.models.coverage;

import org.eclipse.emf.common.util.EList;
import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.analysis.IMethodCoverage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.coverage.ClassCoverage#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.ClassCoverage#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.ClassCoverage#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.ClassCoverage#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.ClassCoverage#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.ClassCoverage#isNoMatch <em>No Match</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.ClassCoverage#getSourceFile <em>Source File</em>}</li>
 *   <li>{@link org.nasdanika.models.coverage.ClassCoverage#getPackageName <em>Package Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.coverage.CoveragePackage#getClassCoverage()
 * @model
 * @generated
 */
public interface ClassCoverage extends SourceCoverage {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getClassCoverage_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.ClassCoverage#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' attribute list.
	 * @see org.nasdanika.models.coverage.CoveragePackage#getClassCoverage_Interfaces()
	 * @model
	 * @generated
	 */
	EList<String> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' attribute.
	 * @see #setSuperType(String)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getClassCoverage_SuperType()
	 * @model
	 * @generated
	 */
	String getSuperType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.ClassCoverage#getSuperType <em>Super Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' attribute.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(String value);

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.coverage.MethodCoverage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see org.nasdanika.models.coverage.CoveragePackage#getClassCoverage_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodCoverage> getMethods();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getClassCoverage_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.ClassCoverage#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>No Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Match</em>' attribute.
	 * @see #setNoMatch(boolean)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getClassCoverage_NoMatch()
	 * @model
	 * @generated
	 */
	boolean isNoMatch();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.ClassCoverage#isNoMatch <em>No Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Match</em>' attribute.
	 * @see #isNoMatch()
	 * @generated
	 */
	void setNoMatch(boolean value);
	
	/**
	 * Returns the value of the '<em><b>Source File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source File</em>' attribute.
	 * @see #setSourceFile(String)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getClassCoverage_SourceFile()
	 * @model
	 * @generated
	 */
	String getSourceFile();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.ClassCoverage#getSourceFile <em>Source File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source File</em>' attribute.
	 * @see #getSourceFile()
	 * @generated
	 */
	void setSourceFile(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see org.nasdanika.models.coverage.CoveragePackage#getClassCoverage_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.coverage.ClassCoverage#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	default void load(IClassCoverage data) {
		SourceCoverage.super.load(data);
		EList<String> interfaces = getInterfaces();
		for (String in: data.getInterfaceNames()) {
			interfaces.add(in);
		}
		EList<MethodCoverage> methods = getMethods();
		for (IMethodCoverage mData: data.getMethods()) {
			MethodCoverage mc = CoverageFactory.eINSTANCE.createMethodCoverage();
			mc.load(mData);
			methods.add(mc);
		}
		setId(data.getId());
		setNoMatch(data.isNoMatch());
		setSignature(data.getSignature());
		setSuperType(data.getSuperName());		
		setSourceFile(data.getSourceFileName());
		setPackageName(data.getPackageName());
	}

} // ClassCoverage

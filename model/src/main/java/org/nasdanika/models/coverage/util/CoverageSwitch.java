/**
 */
package org.nasdanika.models.coverage.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.coverage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.coverage.CoveragePackage
 * @generated
 */
public class CoverageSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CoveragePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageSwitch() {
		if (modelPackage == null) {
			modelPackage = CoveragePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CoveragePackage.COUNTER: {
				Counter counter = (Counter)theEObject;
				T result = caseCounter(counter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoveragePackage.COVERAGE: {
				Coverage coverage = (Coverage)theEObject;
				T result = caseCoverage(coverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoveragePackage.SESSION: {
				Session session = (Session)theEObject;
				T result = caseSession(session);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoveragePackage.MODULE_COVERAGE: {
				ModuleCoverage moduleCoverage = (ModuleCoverage)theEObject;
				T result = caseModuleCoverage(moduleCoverage);
				if (result == null) result = caseCoverage(moduleCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoveragePackage.PACKAGE_COVERAGE: {
				PackageCoverage packageCoverage = (PackageCoverage)theEObject;
				T result = casePackageCoverage(packageCoverage);
				if (result == null) result = caseCoverage(packageCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoveragePackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoveragePackage.SOURCE_COVERAGE: {
				SourceCoverage sourceCoverage = (SourceCoverage)theEObject;
				T result = caseSourceCoverage(sourceCoverage);
				if (result == null) result = caseCoverage(sourceCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoveragePackage.CLASS_COVERAGE: {
				ClassCoverage classCoverage = (ClassCoverage)theEObject;
				T result = caseClassCoverage(classCoverage);
				if (result == null) result = caseSourceCoverage(classCoverage);
				if (result == null) result = caseCoverage(classCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoveragePackage.METHOD_COVERAGE: {
				MethodCoverage methodCoverage = (MethodCoverage)theEObject;
				T result = caseMethodCoverage(methodCoverage);
				if (result == null) result = caseSourceCoverage(methodCoverage);
				if (result == null) result = caseCoverage(methodCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoveragePackage.SOURCE_FILE_COVERAGE: {
				SourceFileCoverage sourceFileCoverage = (SourceFileCoverage)theEObject;
				T result = caseSourceFileCoverage(sourceFileCoverage);
				if (result == null) result = caseSourceCoverage(sourceFileCoverage);
				if (result == null) result = caseCoverage(sourceFileCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCounter(Counter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverage(Coverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSession(Session object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleCoverage(ModuleCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageCoverage(PackageCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceCoverage(SourceCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassCoverage(ClassCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodCoverage(MethodCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source File Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source File Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceFileCoverage(SourceFileCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CoverageSwitch

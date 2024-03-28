/**
 */
package org.nasdanika.models.coverage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.coverage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoverageFactoryImpl extends EFactoryImpl implements CoverageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoverageFactory init() {
		try {
			CoverageFactory theCoverageFactory = (CoverageFactory)EPackage.Registry.INSTANCE.getEFactory(CoveragePackage.eNS_URI);
			if (theCoverageFactory != null) {
				return theCoverageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoverageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CoveragePackage.COUNTER: return createCounter();
			case CoveragePackage.COVERAGE: return createCoverage();
			case CoveragePackage.MODULE_COVERAGE: return createModuleCoverage();
			case CoveragePackage.PACKAGE_COVERAGE: return createPackageCoverage();
			case CoveragePackage.LINE: return createLine();
			case CoveragePackage.SOURCE_COVERAGE: return createSourceCoverage();
			case CoveragePackage.CLASS_COVERAGE: return createClassCoverage();
			case CoveragePackage.METHOD_COVERAGE: return createMethodCoverage();
			case CoveragePackage.SOURCE_FILE_COVERAGE: return createSourceFileCoverage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Counter createCounter() {
		CounterImpl counter = new CounterImpl();
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coverage createCoverage() {
		CoverageImpl coverage = new CoverageImpl();
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleCoverage createModuleCoverage() {
		ModuleCoverageImpl moduleCoverage = new ModuleCoverageImpl();
		return moduleCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageCoverage createPackageCoverage() {
		PackageCoverageImpl packageCoverage = new PackageCoverageImpl();
		return packageCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceCoverage createSourceCoverage() {
		SourceCoverageImpl sourceCoverage = new SourceCoverageImpl();
		return sourceCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassCoverage createClassCoverage() {
		ClassCoverageImpl classCoverage = new ClassCoverageImpl();
		return classCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodCoverage createMethodCoverage() {
		MethodCoverageImpl methodCoverage = new MethodCoverageImpl();
		return methodCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceFileCoverage createSourceFileCoverage() {
		SourceFileCoverageImpl sourceFileCoverage = new SourceFileCoverageImpl();
		return sourceFileCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoveragePackage getCoveragePackage() {
		return (CoveragePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CoveragePackage getPackage() {
		return CoveragePackage.eINSTANCE;
	}

} //CoverageFactoryImpl

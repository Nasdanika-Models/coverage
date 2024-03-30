/**
 */
package org.nasdanika.models.coverage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.coverage.ClassCoverage;
import org.nasdanika.models.coverage.Counter;
import org.nasdanika.models.coverage.Coverage;
import org.nasdanika.models.coverage.CoverageFactory;
import org.nasdanika.models.coverage.CoveragePackage;
import org.nasdanika.models.coverage.Line;
import org.nasdanika.models.coverage.MethodCoverage;
import org.nasdanika.models.coverage.ModuleCoverage;
import org.nasdanika.models.coverage.PackageCoverage;
import org.nasdanika.models.coverage.Session;
import org.nasdanika.models.coverage.SourceCoverage;
import org.nasdanika.models.coverage.SourceFileCoverage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoveragePackageImpl extends EPackageImpl implements CoveragePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass counterEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleCoverageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageCoverageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceCoverageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classCoverageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodCoverageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFileCoverageEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.coverage.CoveragePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CoveragePackageImpl() {
		super(eNS_URI, CoverageFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CoveragePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CoveragePackage init() {
		if (isInited) return (CoveragePackage)EPackage.Registry.INSTANCE.getEPackage(CoveragePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCoveragePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CoveragePackageImpl theCoveragePackage = registeredCoveragePackage instanceof CoveragePackageImpl ? (CoveragePackageImpl)registeredCoveragePackage : new CoveragePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCoveragePackage.createPackageContents();

		// Initialize created meta-data
		theCoveragePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCoveragePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CoveragePackage.eNS_URI, theCoveragePackage);
		return theCoveragePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCounter() {
		return counterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCounter_Covered() {
		return (EAttribute)counterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCounter_Missed() {
		return (EAttribute)counterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoverage() {
		return coverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoverage_Name() {
		return (EAttribute)coverageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoverage_InstructionCounter() {
		return (EReference)coverageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoverage_BranchCounter() {
		return (EReference)coverageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoverage_LineCounter() {
		return (EReference)coverageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoverage_ComplexityCounter() {
		return (EReference)coverageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoverage_MethodCounter() {
		return (EReference)coverageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoverage_ClassCounter() {
		return (EReference)coverageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSession() {
		return sessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSession_Id() {
		return (EAttribute)sessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSession_Start() {
		return (EAttribute)sessionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSession_Dump() {
		return (EAttribute)sessionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleCoverage() {
		return moduleCoverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleCoverage_Packages() {
		return (EReference)moduleCoverageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleCoverage_Sessions() {
		return (EReference)moduleCoverageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageCoverage() {
		return packageCoverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageCoverage_Classes() {
		return (EReference)packageCoverageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageCoverage_SourceFiles() {
		return (EReference)packageCoverageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLine_Number() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLine_InstructionCounter() {
		return (EReference)lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLine_BranchCounter() {
		return (EReference)lineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceCoverage() {
		return sourceCoverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSourceCoverage_Lines() {
		return (EReference)sourceCoverageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassCoverage() {
		return classCoverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassCoverage_Id() {
		return (EAttribute)classCoverageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassCoverage_Interfaces() {
		return (EAttribute)classCoverageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassCoverage_SuperType() {
		return (EAttribute)classCoverageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassCoverage_Methods() {
		return (EReference)classCoverageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassCoverage_Signature() {
		return (EAttribute)classCoverageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassCoverage_NoMatch() {
		return (EAttribute)classCoverageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodCoverage() {
		return methodCoverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodCoverage_Description() {
		return (EAttribute)methodCoverageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodCoverage_Signature() {
		return (EAttribute)methodCoverageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodCoverage_ParameterTypes() {
		return (EAttribute)methodCoverageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceFileCoverage() {
		return sourceFileCoverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageFactory getCoverageFactory() {
		return (CoverageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		counterEClass = createEClass(COUNTER);
		createEAttribute(counterEClass, COUNTER__COVERED);
		createEAttribute(counterEClass, COUNTER__MISSED);

		coverageEClass = createEClass(COVERAGE);
		createEAttribute(coverageEClass, COVERAGE__NAME);
		createEReference(coverageEClass, COVERAGE__INSTRUCTION_COUNTER);
		createEReference(coverageEClass, COVERAGE__BRANCH_COUNTER);
		createEReference(coverageEClass, COVERAGE__LINE_COUNTER);
		createEReference(coverageEClass, COVERAGE__COMPLEXITY_COUNTER);
		createEReference(coverageEClass, COVERAGE__METHOD_COUNTER);
		createEReference(coverageEClass, COVERAGE__CLASS_COUNTER);

		sessionEClass = createEClass(SESSION);
		createEAttribute(sessionEClass, SESSION__ID);
		createEAttribute(sessionEClass, SESSION__START);
		createEAttribute(sessionEClass, SESSION__DUMP);

		moduleCoverageEClass = createEClass(MODULE_COVERAGE);
		createEReference(moduleCoverageEClass, MODULE_COVERAGE__PACKAGES);
		createEReference(moduleCoverageEClass, MODULE_COVERAGE__SESSIONS);

		packageCoverageEClass = createEClass(PACKAGE_COVERAGE);
		createEReference(packageCoverageEClass, PACKAGE_COVERAGE__CLASSES);
		createEReference(packageCoverageEClass, PACKAGE_COVERAGE__SOURCE_FILES);

		lineEClass = createEClass(LINE);
		createEAttribute(lineEClass, LINE__NUMBER);
		createEReference(lineEClass, LINE__INSTRUCTION_COUNTER);
		createEReference(lineEClass, LINE__BRANCH_COUNTER);

		sourceCoverageEClass = createEClass(SOURCE_COVERAGE);
		createEReference(sourceCoverageEClass, SOURCE_COVERAGE__LINES);

		classCoverageEClass = createEClass(CLASS_COVERAGE);
		createEAttribute(classCoverageEClass, CLASS_COVERAGE__ID);
		createEAttribute(classCoverageEClass, CLASS_COVERAGE__INTERFACES);
		createEAttribute(classCoverageEClass, CLASS_COVERAGE__SUPER_TYPE);
		createEReference(classCoverageEClass, CLASS_COVERAGE__METHODS);
		createEAttribute(classCoverageEClass, CLASS_COVERAGE__SIGNATURE);
		createEAttribute(classCoverageEClass, CLASS_COVERAGE__NO_MATCH);

		methodCoverageEClass = createEClass(METHOD_COVERAGE);
		createEAttribute(methodCoverageEClass, METHOD_COVERAGE__DESCRIPTION);
		createEAttribute(methodCoverageEClass, METHOD_COVERAGE__SIGNATURE);
		createEAttribute(methodCoverageEClass, METHOD_COVERAGE__PARAMETER_TYPES);

		sourceFileCoverageEClass = createEClass(SOURCE_FILE_COVERAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		moduleCoverageEClass.getESuperTypes().add(this.getCoverage());
		packageCoverageEClass.getESuperTypes().add(this.getCoverage());
		sourceCoverageEClass.getESuperTypes().add(this.getCoverage());
		classCoverageEClass.getESuperTypes().add(this.getSourceCoverage());
		methodCoverageEClass.getESuperTypes().add(this.getSourceCoverage());
		sourceFileCoverageEClass.getESuperTypes().add(this.getSourceCoverage());

		// Initialize classes, features, and operations; add parameters
		initEClass(counterEClass, Counter.class, "Counter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCounter_Covered(), ecorePackage.getEInt(), "covered", null, 0, 1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCounter_Missed(), ecorePackage.getEInt(), "missed", null, 0, 1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coverageEClass, Coverage.class, "Coverage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoverage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Coverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoverage_InstructionCounter(), this.getCounter(), null, "instructionCounter", null, 0, 1, Coverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoverage_BranchCounter(), this.getCounter(), null, "branchCounter", null, 0, 1, Coverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoverage_LineCounter(), this.getCounter(), null, "lineCounter", null, 0, 1, Coverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoverage_ComplexityCounter(), this.getCounter(), null, "complexityCounter", null, 0, 1, Coverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoverage_MethodCounter(), this.getCounter(), null, "methodCounter", null, 0, 1, Coverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoverage_ClassCounter(), this.getCounter(), null, "classCounter", null, 0, 1, Coverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sessionEClass, Session.class, "Session", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSession_Id(), ecorePackage.getEString(), "id", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSession_Start(), ecorePackage.getEDate(), "start", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSession_Dump(), ecorePackage.getEDate(), "dump", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleCoverageEClass, ModuleCoverage.class, "ModuleCoverage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleCoverage_Packages(), this.getPackageCoverage(), null, "packages", null, 0, -1, ModuleCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleCoverage_Sessions(), this.getSession(), null, "sessions", null, 0, -1, ModuleCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageCoverageEClass, PackageCoverage.class, "PackageCoverage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageCoverage_Classes(), this.getClassCoverage(), null, "classes", null, 0, -1, PackageCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageCoverage_SourceFiles(), this.getSourceFileCoverage(), null, "sourceFiles", null, 0, -1, PackageCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLine_Number(), ecorePackage.getEInt(), "number", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_InstructionCounter(), this.getCounter(), null, "instructionCounter", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_BranchCounter(), this.getCounter(), null, "branchCounter", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceCoverageEClass, SourceCoverage.class, "SourceCoverage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceCoverage_Lines(), this.getLine(), null, "lines", null, 0, -1, SourceCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classCoverageEClass, ClassCoverage.class, "ClassCoverage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassCoverage_Id(), ecorePackage.getELong(), "id", null, 0, 1, ClassCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassCoverage_Interfaces(), ecorePackage.getEString(), "interfaces", null, 0, -1, ClassCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassCoverage_SuperType(), ecorePackage.getEString(), "superType", null, 0, 1, ClassCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassCoverage_Methods(), this.getMethodCoverage(), null, "methods", null, 0, -1, ClassCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassCoverage_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, ClassCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassCoverage_NoMatch(), ecorePackage.getEBoolean(), "noMatch", null, 0, 1, ClassCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodCoverageEClass, MethodCoverage.class, "MethodCoverage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodCoverage_Description(), ecorePackage.getEString(), "description", null, 0, 1, MethodCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodCoverage_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, MethodCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodCoverage_ParameterTypes(), ecorePackage.getEString(), "parameterTypes", null, 0, -1, MethodCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceFileCoverageEClass, SourceFileCoverage.class, "SourceFileCoverage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CoveragePackageImpl

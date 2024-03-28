/**
 */
package org.nasdanika.models.coverage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.coverage.CoverageFactory
 * @model kind="package"
 * @generated
 */
public interface CoveragePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "coverage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/coverage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.coverage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoveragePackage eINSTANCE = org.nasdanika.models.coverage.impl.CoveragePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.coverage.impl.CounterImpl <em>Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.coverage.impl.CounterImpl
	 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getCounter()
	 * @generated
	 */
	int COUNTER = 0;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__COVERED = 0;

	/**
	 * The feature id for the '<em><b>Missed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__MISSED = 1;

	/**
	 * The number of structural features of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.coverage.impl.CoverageImpl <em>Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.coverage.impl.CoverageImpl
	 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getCoverage()
	 * @generated
	 */
	int COVERAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Instruction Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__INSTRUCTION_COUNTER = 1;

	/**
	 * The feature id for the '<em><b>Branch Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__BRANCH_COUNTER = 2;

	/**
	 * The feature id for the '<em><b>Line Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__LINE_COUNTER = 3;

	/**
	 * The feature id for the '<em><b>Complexity Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__COMPLEXITY_COUNTER = 4;

	/**
	 * The feature id for the '<em><b>Method Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__METHOD_COUNTER = 5;

	/**
	 * The feature id for the '<em><b>Class Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__CLASS_COUNTER = 6;

	/**
	 * The number of structural features of the '<em>Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.coverage.impl.ModuleCoverageImpl <em>Module Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.coverage.impl.ModuleCoverageImpl
	 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getModuleCoverage()
	 * @generated
	 */
	int MODULE_COVERAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_COVERAGE__NAME = COVERAGE__NAME;

	/**
	 * The feature id for the '<em><b>Instruction Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_COVERAGE__INSTRUCTION_COUNTER = COVERAGE__INSTRUCTION_COUNTER;

	/**
	 * The feature id for the '<em><b>Branch Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_COVERAGE__BRANCH_COUNTER = COVERAGE__BRANCH_COUNTER;

	/**
	 * The feature id for the '<em><b>Line Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_COVERAGE__LINE_COUNTER = COVERAGE__LINE_COUNTER;

	/**
	 * The feature id for the '<em><b>Complexity Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_COVERAGE__COMPLEXITY_COUNTER = COVERAGE__COMPLEXITY_COUNTER;

	/**
	 * The feature id for the '<em><b>Method Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_COVERAGE__METHOD_COUNTER = COVERAGE__METHOD_COUNTER;

	/**
	 * The feature id for the '<em><b>Class Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_COVERAGE__CLASS_COUNTER = COVERAGE__CLASS_COUNTER;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_COVERAGE__PACKAGES = COVERAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_COVERAGE_FEATURE_COUNT = COVERAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_COVERAGE_OPERATION_COUNT = COVERAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.coverage.impl.PackageCoverageImpl <em>Package Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.coverage.impl.PackageCoverageImpl
	 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getPackageCoverage()
	 * @generated
	 */
	int PACKAGE_COVERAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_COVERAGE__NAME = COVERAGE__NAME;

	/**
	 * The feature id for the '<em><b>Instruction Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_COVERAGE__INSTRUCTION_COUNTER = COVERAGE__INSTRUCTION_COUNTER;

	/**
	 * The feature id for the '<em><b>Branch Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_COVERAGE__BRANCH_COUNTER = COVERAGE__BRANCH_COUNTER;

	/**
	 * The feature id for the '<em><b>Line Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_COVERAGE__LINE_COUNTER = COVERAGE__LINE_COUNTER;

	/**
	 * The feature id for the '<em><b>Complexity Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_COVERAGE__COMPLEXITY_COUNTER = COVERAGE__COMPLEXITY_COUNTER;

	/**
	 * The feature id for the '<em><b>Method Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_COVERAGE__METHOD_COUNTER = COVERAGE__METHOD_COUNTER;

	/**
	 * The feature id for the '<em><b>Class Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_COVERAGE__CLASS_COUNTER = COVERAGE__CLASS_COUNTER;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_COVERAGE__CLASSES = COVERAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_COVERAGE__SOURCE_FILES = COVERAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_COVERAGE_FEATURE_COUNT = COVERAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Package Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_COVERAGE_OPERATION_COUNT = COVERAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.coverage.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.coverage.impl.LineImpl
	 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getLine()
	 * @generated
	 */
	int LINE = 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Instruction Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__INSTRUCTION_COUNTER = 1;

	/**
	 * The feature id for the '<em><b>Branch Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__BRANCH_COUNTER = 2;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.coverage.impl.SourceCoverageImpl <em>Source Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.coverage.impl.SourceCoverageImpl
	 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getSourceCoverage()
	 * @generated
	 */
	int SOURCE_COVERAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COVERAGE__NAME = COVERAGE__NAME;

	/**
	 * The feature id for the '<em><b>Instruction Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COVERAGE__INSTRUCTION_COUNTER = COVERAGE__INSTRUCTION_COUNTER;

	/**
	 * The feature id for the '<em><b>Branch Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COVERAGE__BRANCH_COUNTER = COVERAGE__BRANCH_COUNTER;

	/**
	 * The feature id for the '<em><b>Line Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COVERAGE__LINE_COUNTER = COVERAGE__LINE_COUNTER;

	/**
	 * The feature id for the '<em><b>Complexity Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COVERAGE__COMPLEXITY_COUNTER = COVERAGE__COMPLEXITY_COUNTER;

	/**
	 * The feature id for the '<em><b>Method Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COVERAGE__METHOD_COUNTER = COVERAGE__METHOD_COUNTER;

	/**
	 * The feature id for the '<em><b>Class Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COVERAGE__CLASS_COUNTER = COVERAGE__CLASS_COUNTER;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COVERAGE__LINES = COVERAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COVERAGE_FEATURE_COUNT = COVERAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Source Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COVERAGE_OPERATION_COUNT = COVERAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.coverage.impl.ClassCoverageImpl <em>Class Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.coverage.impl.ClassCoverageImpl
	 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getClassCoverage()
	 * @generated
	 */
	int CLASS_COVERAGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COVERAGE__NAME = SOURCE_COVERAGE__NAME;

	/**
	 * The feature id for the '<em><b>Instruction Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COVERAGE__INSTRUCTION_COUNTER = SOURCE_COVERAGE__INSTRUCTION_COUNTER;

	/**
	 * The feature id for the '<em><b>Branch Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COVERAGE__BRANCH_COUNTER = SOURCE_COVERAGE__BRANCH_COUNTER;

	/**
	 * The feature id for the '<em><b>Line Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COVERAGE__LINE_COUNTER = SOURCE_COVERAGE__LINE_COUNTER;

	/**
	 * The feature id for the '<em><b>Complexity Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COVERAGE__COMPLEXITY_COUNTER = SOURCE_COVERAGE__COMPLEXITY_COUNTER;

	/**
	 * The feature id for the '<em><b>Method Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COVERAGE__METHOD_COUNTER = SOURCE_COVERAGE__METHOD_COUNTER;

	/**
	 * The feature id for the '<em><b>Class Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COVERAGE__CLASS_COUNTER = SOURCE_COVERAGE__CLASS_COUNTER;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COVERAGE__LINES = SOURCE_COVERAGE__LINES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COVERAGE__ID = SOURCE_COVERAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COVERAGE__INTERFACES = SOURCE_COVERAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COVERAGE__SUPER_TYPE = SOURCE_COVERAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COVERAGE__METHODS = SOURCE_COVERAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COVERAGE__SIGNATURE = SOURCE_COVERAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>No Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COVERAGE__NO_MATCH = SOURCE_COVERAGE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Class Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COVERAGE_FEATURE_COUNT = SOURCE_COVERAGE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Class Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COVERAGE_OPERATION_COUNT = SOURCE_COVERAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.coverage.impl.MethodCoverageImpl <em>Method Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.coverage.impl.MethodCoverageImpl
	 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getMethodCoverage()
	 * @generated
	 */
	int METHOD_COVERAGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_COVERAGE__NAME = SOURCE_COVERAGE__NAME;

	/**
	 * The feature id for the '<em><b>Instruction Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_COVERAGE__INSTRUCTION_COUNTER = SOURCE_COVERAGE__INSTRUCTION_COUNTER;

	/**
	 * The feature id for the '<em><b>Branch Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_COVERAGE__BRANCH_COUNTER = SOURCE_COVERAGE__BRANCH_COUNTER;

	/**
	 * The feature id for the '<em><b>Line Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_COVERAGE__LINE_COUNTER = SOURCE_COVERAGE__LINE_COUNTER;

	/**
	 * The feature id for the '<em><b>Complexity Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_COVERAGE__COMPLEXITY_COUNTER = SOURCE_COVERAGE__COMPLEXITY_COUNTER;

	/**
	 * The feature id for the '<em><b>Method Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_COVERAGE__METHOD_COUNTER = SOURCE_COVERAGE__METHOD_COUNTER;

	/**
	 * The feature id for the '<em><b>Class Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_COVERAGE__CLASS_COUNTER = SOURCE_COVERAGE__CLASS_COUNTER;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_COVERAGE__LINES = SOURCE_COVERAGE__LINES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_COVERAGE__DESCRIPTION = SOURCE_COVERAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_COVERAGE__SIGNATURE = SOURCE_COVERAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_COVERAGE_FEATURE_COUNT = SOURCE_COVERAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Method Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_COVERAGE_OPERATION_COUNT = SOURCE_COVERAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.coverage.impl.SourceFileCoverageImpl <em>Source File Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.coverage.impl.SourceFileCoverageImpl
	 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getSourceFileCoverage()
	 * @generated
	 */
	int SOURCE_FILE_COVERAGE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_COVERAGE__NAME = SOURCE_COVERAGE__NAME;

	/**
	 * The feature id for the '<em><b>Instruction Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_COVERAGE__INSTRUCTION_COUNTER = SOURCE_COVERAGE__INSTRUCTION_COUNTER;

	/**
	 * The feature id for the '<em><b>Branch Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_COVERAGE__BRANCH_COUNTER = SOURCE_COVERAGE__BRANCH_COUNTER;

	/**
	 * The feature id for the '<em><b>Line Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_COVERAGE__LINE_COUNTER = SOURCE_COVERAGE__LINE_COUNTER;

	/**
	 * The feature id for the '<em><b>Complexity Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_COVERAGE__COMPLEXITY_COUNTER = SOURCE_COVERAGE__COMPLEXITY_COUNTER;

	/**
	 * The feature id for the '<em><b>Method Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_COVERAGE__METHOD_COUNTER = SOURCE_COVERAGE__METHOD_COUNTER;

	/**
	 * The feature id for the '<em><b>Class Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_COVERAGE__CLASS_COUNTER = SOURCE_COVERAGE__CLASS_COUNTER;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_COVERAGE__LINES = SOURCE_COVERAGE__LINES;

	/**
	 * The number of structural features of the '<em>Source File Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_COVERAGE_FEATURE_COUNT = SOURCE_COVERAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Source File Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_COVERAGE_OPERATION_COUNT = SOURCE_COVERAGE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.coverage.Counter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter</em>'.
	 * @see org.nasdanika.models.coverage.Counter
	 * @generated
	 */
	EClass getCounter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.coverage.Counter#getCovered <em>Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Covered</em>'.
	 * @see org.nasdanika.models.coverage.Counter#getCovered()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_Covered();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.coverage.Counter#getMissed <em>Missed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missed</em>'.
	 * @see org.nasdanika.models.coverage.Counter#getMissed()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_Missed();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.coverage.Coverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coverage</em>'.
	 * @see org.nasdanika.models.coverage.Coverage
	 * @generated
	 */
	EClass getCoverage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.coverage.Coverage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.coverage.Coverage#getName()
	 * @see #getCoverage()
	 * @generated
	 */
	EAttribute getCoverage_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.coverage.Coverage#getInstructionCounter <em>Instruction Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instruction Counter</em>'.
	 * @see org.nasdanika.models.coverage.Coverage#getInstructionCounter()
	 * @see #getCoverage()
	 * @generated
	 */
	EReference getCoverage_InstructionCounter();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.coverage.Coverage#getBranchCounter <em>Branch Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Branch Counter</em>'.
	 * @see org.nasdanika.models.coverage.Coverage#getBranchCounter()
	 * @see #getCoverage()
	 * @generated
	 */
	EReference getCoverage_BranchCounter();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.coverage.Coverage#getLineCounter <em>Line Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Counter</em>'.
	 * @see org.nasdanika.models.coverage.Coverage#getLineCounter()
	 * @see #getCoverage()
	 * @generated
	 */
	EReference getCoverage_LineCounter();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.coverage.Coverage#getComplexityCounter <em>Complexity Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complexity Counter</em>'.
	 * @see org.nasdanika.models.coverage.Coverage#getComplexityCounter()
	 * @see #getCoverage()
	 * @generated
	 */
	EReference getCoverage_ComplexityCounter();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.coverage.Coverage#getMethodCounter <em>Method Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Counter</em>'.
	 * @see org.nasdanika.models.coverage.Coverage#getMethodCounter()
	 * @see #getCoverage()
	 * @generated
	 */
	EReference getCoverage_MethodCounter();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.coverage.Coverage#getClassCounter <em>Class Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Counter</em>'.
	 * @see org.nasdanika.models.coverage.Coverage#getClassCounter()
	 * @see #getCoverage()
	 * @generated
	 */
	EReference getCoverage_ClassCounter();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.coverage.ModuleCoverage <em>Module Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Coverage</em>'.
	 * @see org.nasdanika.models.coverage.ModuleCoverage
	 * @generated
	 */
	EClass getModuleCoverage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.coverage.ModuleCoverage#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.nasdanika.models.coverage.ModuleCoverage#getPackages()
	 * @see #getModuleCoverage()
	 * @generated
	 */
	EReference getModuleCoverage_Packages();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.coverage.PackageCoverage <em>Package Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Coverage</em>'.
	 * @see org.nasdanika.models.coverage.PackageCoverage
	 * @generated
	 */
	EClass getPackageCoverage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.coverage.PackageCoverage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see org.nasdanika.models.coverage.PackageCoverage#getClasses()
	 * @see #getPackageCoverage()
	 * @generated
	 */
	EReference getPackageCoverage_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.coverage.PackageCoverage#getSourceFiles <em>Source Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Files</em>'.
	 * @see org.nasdanika.models.coverage.PackageCoverage#getSourceFiles()
	 * @see #getPackageCoverage()
	 * @generated
	 */
	EReference getPackageCoverage_SourceFiles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.coverage.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see org.nasdanika.models.coverage.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.coverage.Line#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.nasdanika.models.coverage.Line#getNumber()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Number();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.coverage.Line#getInstructionCounter <em>Instruction Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instruction Counter</em>'.
	 * @see org.nasdanika.models.coverage.Line#getInstructionCounter()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_InstructionCounter();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.coverage.Line#getBranchCounter <em>Branch Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Branch Counter</em>'.
	 * @see org.nasdanika.models.coverage.Line#getBranchCounter()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_BranchCounter();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.coverage.SourceCoverage <em>Source Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Coverage</em>'.
	 * @see org.nasdanika.models.coverage.SourceCoverage
	 * @generated
	 */
	EClass getSourceCoverage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.coverage.SourceCoverage#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see org.nasdanika.models.coverage.SourceCoverage#getLines()
	 * @see #getSourceCoverage()
	 * @generated
	 */
	EReference getSourceCoverage_Lines();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.coverage.ClassCoverage <em>Class Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Coverage</em>'.
	 * @see org.nasdanika.models.coverage.ClassCoverage
	 * @generated
	 */
	EClass getClassCoverage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.coverage.ClassCoverage#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.coverage.ClassCoverage#getId()
	 * @see #getClassCoverage()
	 * @generated
	 */
	EAttribute getClassCoverage_Id();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.coverage.ClassCoverage#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Interfaces</em>'.
	 * @see org.nasdanika.models.coverage.ClassCoverage#getInterfaces()
	 * @see #getClassCoverage()
	 * @generated
	 */
	EAttribute getClassCoverage_Interfaces();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.coverage.ClassCoverage#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Super Type</em>'.
	 * @see org.nasdanika.models.coverage.ClassCoverage#getSuperType()
	 * @see #getClassCoverage()
	 * @generated
	 */
	EAttribute getClassCoverage_SuperType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.coverage.ClassCoverage#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.nasdanika.models.coverage.ClassCoverage#getMethods()
	 * @see #getClassCoverage()
	 * @generated
	 */
	EReference getClassCoverage_Methods();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.coverage.ClassCoverage#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see org.nasdanika.models.coverage.ClassCoverage#getSignature()
	 * @see #getClassCoverage()
	 * @generated
	 */
	EAttribute getClassCoverage_Signature();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.coverage.ClassCoverage#isNoMatch <em>No Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Match</em>'.
	 * @see org.nasdanika.models.coverage.ClassCoverage#isNoMatch()
	 * @see #getClassCoverage()
	 * @generated
	 */
	EAttribute getClassCoverage_NoMatch();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.coverage.MethodCoverage <em>Method Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Coverage</em>'.
	 * @see org.nasdanika.models.coverage.MethodCoverage
	 * @generated
	 */
	EClass getMethodCoverage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.coverage.MethodCoverage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.coverage.MethodCoverage#getDescription()
	 * @see #getMethodCoverage()
	 * @generated
	 */
	EAttribute getMethodCoverage_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.coverage.MethodCoverage#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see org.nasdanika.models.coverage.MethodCoverage#getSignature()
	 * @see #getMethodCoverage()
	 * @generated
	 */
	EAttribute getMethodCoverage_Signature();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.coverage.SourceFileCoverage <em>Source File Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source File Coverage</em>'.
	 * @see org.nasdanika.models.coverage.SourceFileCoverage
	 * @generated
	 */
	EClass getSourceFileCoverage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoverageFactory getCoverageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.coverage.impl.CounterImpl <em>Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.coverage.impl.CounterImpl
		 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getCounter()
		 * @generated
		 */
		EClass COUNTER = eINSTANCE.getCounter();
		/**
		 * The meta object literal for the '<em><b>Covered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER__COVERED = eINSTANCE.getCounter_Covered();
		/**
		 * The meta object literal for the '<em><b>Missed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER__MISSED = eINSTANCE.getCounter_Missed();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.coverage.impl.CoverageImpl <em>Coverage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.coverage.impl.CoverageImpl
		 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getCoverage()
		 * @generated
		 */
		EClass COVERAGE = eINSTANCE.getCoverage();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COVERAGE__NAME = eINSTANCE.getCoverage_Name();
		/**
		 * The meta object literal for the '<em><b>Instruction Counter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE__INSTRUCTION_COUNTER = eINSTANCE.getCoverage_InstructionCounter();
		/**
		 * The meta object literal for the '<em><b>Branch Counter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE__BRANCH_COUNTER = eINSTANCE.getCoverage_BranchCounter();
		/**
		 * The meta object literal for the '<em><b>Line Counter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE__LINE_COUNTER = eINSTANCE.getCoverage_LineCounter();
		/**
		 * The meta object literal for the '<em><b>Complexity Counter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE__COMPLEXITY_COUNTER = eINSTANCE.getCoverage_ComplexityCounter();
		/**
		 * The meta object literal for the '<em><b>Method Counter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE__METHOD_COUNTER = eINSTANCE.getCoverage_MethodCounter();
		/**
		 * The meta object literal for the '<em><b>Class Counter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE__CLASS_COUNTER = eINSTANCE.getCoverage_ClassCounter();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.coverage.impl.ModuleCoverageImpl <em>Module Coverage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.coverage.impl.ModuleCoverageImpl
		 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getModuleCoverage()
		 * @generated
		 */
		EClass MODULE_COVERAGE = eINSTANCE.getModuleCoverage();
		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_COVERAGE__PACKAGES = eINSTANCE.getModuleCoverage_Packages();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.coverage.impl.PackageCoverageImpl <em>Package Coverage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.coverage.impl.PackageCoverageImpl
		 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getPackageCoverage()
		 * @generated
		 */
		EClass PACKAGE_COVERAGE = eINSTANCE.getPackageCoverage();
		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_COVERAGE__CLASSES = eINSTANCE.getPackageCoverage_Classes();
		/**
		 * The meta object literal for the '<em><b>Source Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_COVERAGE__SOURCE_FILES = eINSTANCE.getPackageCoverage_SourceFiles();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.coverage.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.coverage.impl.LineImpl
		 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();
		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__NUMBER = eINSTANCE.getLine_Number();
		/**
		 * The meta object literal for the '<em><b>Instruction Counter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__INSTRUCTION_COUNTER = eINSTANCE.getLine_InstructionCounter();
		/**
		 * The meta object literal for the '<em><b>Branch Counter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__BRANCH_COUNTER = eINSTANCE.getLine_BranchCounter();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.coverage.impl.SourceCoverageImpl <em>Source Coverage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.coverage.impl.SourceCoverageImpl
		 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getSourceCoverage()
		 * @generated
		 */
		EClass SOURCE_COVERAGE = eINSTANCE.getSourceCoverage();
		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_COVERAGE__LINES = eINSTANCE.getSourceCoverage_Lines();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.coverage.impl.ClassCoverageImpl <em>Class Coverage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.coverage.impl.ClassCoverageImpl
		 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getClassCoverage()
		 * @generated
		 */
		EClass CLASS_COVERAGE = eINSTANCE.getClassCoverage();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_COVERAGE__ID = eINSTANCE.getClassCoverage_Id();
		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_COVERAGE__INTERFACES = eINSTANCE.getClassCoverage_Interfaces();
		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_COVERAGE__SUPER_TYPE = eINSTANCE.getClassCoverage_SuperType();
		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_COVERAGE__METHODS = eINSTANCE.getClassCoverage_Methods();
		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_COVERAGE__SIGNATURE = eINSTANCE.getClassCoverage_Signature();
		/**
		 * The meta object literal for the '<em><b>No Match</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_COVERAGE__NO_MATCH = eINSTANCE.getClassCoverage_NoMatch();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.coverage.impl.MethodCoverageImpl <em>Method Coverage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.coverage.impl.MethodCoverageImpl
		 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getMethodCoverage()
		 * @generated
		 */
		EClass METHOD_COVERAGE = eINSTANCE.getMethodCoverage();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_COVERAGE__DESCRIPTION = eINSTANCE.getMethodCoverage_Description();
		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_COVERAGE__SIGNATURE = eINSTANCE.getMethodCoverage_Signature();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.coverage.impl.SourceFileCoverageImpl <em>Source File Coverage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.coverage.impl.SourceFileCoverageImpl
		 * @see org.nasdanika.models.coverage.impl.CoveragePackageImpl#getSourceFileCoverage()
		 * @generated
		 */
		EClass SOURCE_FILE_COVERAGE = eINSTANCE.getSourceFileCoverage();

	}

} //CoveragePackage

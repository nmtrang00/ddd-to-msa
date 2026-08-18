/**
 */
package lemma.adapted.xcore.behavior;

import lemma.adapted.xcore.data.DataPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see lemma.adapted.xcore.behavior.BehaviorFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/xcore/behavior";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behavior";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorPackage eINSTANCE = lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl.init();

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.BehaviorModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorModelImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getBehaviorModel()
	 * @generated
	 */
	int BEHAVIOR_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Tmodel Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_MODEL__TMODEL_URI = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_MODEL__IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Activity Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_MODEL__ACTIVITY_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ActivityModelImpl <em>Activity Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ActivityModelImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getActivityModel()
	 * @generated
	 */
	int ACTIVITY_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MODEL__ACTIVITIES = 0;

	/**
	 * The number of structural features of the '<em>Activity Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Activity Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.NamedElementImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.SpecDataOperationImpl <em>Spec Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.SpecDataOperationImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getSpecDataOperation()
	 * @generated
	 */
	int SPEC_DATA_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_DATA_OPERATION__NAME = DataPackage.DATA_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_DATA_OPERATION__HIDDEN = DataPackage.DATA_OPERATION__HIDDEN;

	/**
	 * The feature id for the '<em><b>Has No Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_DATA_OPERATION__HAS_NO_RETURN_TYPE = DataPackage.DATA_OPERATION__HAS_NO_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_DATA_OPERATION__FEATURES = DataPackage.DATA_OPERATION__FEATURES;

	/**
	 * The feature id for the '<em><b>Operation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_DATA_OPERATION__OPERATION_TYPE = DataPackage.DATA_OPERATION__OPERATION_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_DATA_OPERATION__PARAMETERS = DataPackage.DATA_OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Data Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_DATA_OPERATION__DATA_STRUCTURE = DataPackage.DATA_OPERATION__DATA_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Inherited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_DATA_OPERATION__INHERITED = DataPackage.DATA_OPERATION__INHERITED;

	/**
	 * The feature id for the '<em><b>Is Invariant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_DATA_OPERATION__IS_INVARIANT = DataPackage.DATA_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_DATA_OPERATION__OWNED_RULES = DataPackage.DATA_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spec Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_DATA_OPERATION_FEATURE_COUNT = DataPackage.DATA_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_DATA_OPERATION___GET_QUALIFIED_NAME_PARTS = DataPackage.DATA_OPERATION___GET_QUALIFIED_NAME_PARTS;

	/**
	 * The operation id for the '<em>Build Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_DATA_OPERATION___BUILD_QUALIFIED_NAME__STRING = DataPackage.DATA_OPERATION___BUILD_QUALIFIED_NAME__STRING;

	/**
	 * The operation id for the '<em>Find Eponymous Super Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_DATA_OPERATION___FIND_EPONYMOUS_SUPER_OPERATION = DataPackage.DATA_OPERATION___FIND_EPONYMOUS_SUPER_OPERATION;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_DATA_OPERATION___HAS_FEATURE__DATAOPERATIONFEATURE = DataPackage.DATA_OPERATION___HAS_FEATURE__DATAOPERATIONFEATURE;

	/**
	 * The number of operations of the '<em>Spec Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_DATA_OPERATION_OPERATION_COUNT = DataPackage.DATA_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.SpecRuleImpl <em>Spec Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.SpecRuleImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getSpecRule()
	 * @generated
	 */
	int SPEC_RULE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Raw String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RULE__RAW_STRING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RULE__EXPR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spec Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Spec Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RULE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ImportedOperationImpl <em>Imported Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ImportedOperationImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getImportedOperation()
	 * @generated
	 */
	int IMPORTED_OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_OPERATION__IMPORT = 0;

	/**
	 * The number of structural features of the '<em>Imported Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_OPERATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Imported Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ImportedInterfaceOperationImpl <em>Imported Interface Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ImportedInterfaceOperationImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getImportedInterfaceOperation()
	 * @generated
	 */
	int IMPORTED_INTERFACE_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_INTERFACE_OPERATION__IMPORT = IMPORTED_OPERATION__IMPORT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_INTERFACE_OPERATION__OPERATION = IMPORTED_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imported Interface Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_INTERFACE_OPERATION_FEATURE_COUNT = IMPORTED_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Imported Interface Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_INTERFACE_OPERATION_OPERATION_COUNT = IMPORTED_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ImportedDataOperationImpl <em>Imported Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ImportedDataOperationImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getImportedDataOperation()
	 * @generated
	 */
	int IMPORTED_DATA_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_DATA_OPERATION__IMPORT = IMPORTED_OPERATION__IMPORT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_DATA_OPERATION__OPERATION = IMPORTED_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imported Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_DATA_OPERATION_FEATURE_COUNT = IMPORTED_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Imported Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_DATA_OPERATION_OPERATION_COUNT = IMPORTED_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ImportedParameterImpl <em>Imported Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ImportedParameterImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getImportedParameter()
	 * @generated
	 */
	int IMPORTED_PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PARAMETER__IMPORT = 0;

	/**
	 * The number of structural features of the '<em>Imported Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Imported Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ImportedInterfaceParameterImpl <em>Imported Interface Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ImportedInterfaceParameterImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getImportedInterfaceParameter()
	 * @generated
	 */
	int IMPORTED_INTERFACE_PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_INTERFACE_PARAMETER__IMPORT = IMPORTED_PARAMETER__IMPORT;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_INTERFACE_PARAMETER__PARAMETER = IMPORTED_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imported Interface Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_INTERFACE_PARAMETER_FEATURE_COUNT = IMPORTED_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Imported Interface Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_INTERFACE_PARAMETER_OPERATION_COUNT = IMPORTED_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ImportedDataParameterImpl <em>Imported Data Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ImportedDataParameterImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getImportedDataParameter()
	 * @generated
	 */
	int IMPORTED_DATA_PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_DATA_PARAMETER__IMPORT = IMPORTED_PARAMETER__IMPORT;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_DATA_PARAMETER__PARAMETER = IMPORTED_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imported Data Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_DATA_PARAMETER_FEATURE_COUNT = IMPORTED_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Imported Data Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_DATA_PARAMETER_OPERATION_COUNT = IMPORTED_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 11;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__SPECIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ActivityImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SPECIFICATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TO_TRANSFORM = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PARAMETER_MAPPINGS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ROOT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ScopeImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 13;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__CHILDREN = 1;

	/**
	 * The feature id for the '<em><b>Inherited Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__INHERITED_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Owned Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__OWNED_VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__GROUP = 4;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.IdentifierImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ActivityGroupImpl <em>Activity Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ActivityGroupImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getActivityGroup()
	 * @generated
	 */
	int ACTIVITY_GROUP = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__PARENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__CHILDREN = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inherited Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__INHERITED_VARIABLES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__OWNED_VARIABLES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__GROUP = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__OWNED_NODES = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__OWNED_EDGES = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__SCOPE = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__ACTIVITY = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Structured Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Conditional Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__CONDITIONAL_NODE = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Activity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Activity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.VariableImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__IMPORTED_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__PRIMITIVE_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__UPPER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__LOWER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Accessible Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ACCESSIBLE_SCOPES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SCOPE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ActivityNodeImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getActivityNode()
	 * @generated
	 */
	int ACTIVITY_NODE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__SEDGE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__TEDGE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__GROUP = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ActivityEdgeImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getActivityEdge()
	 * @generated
	 */
	int ACTIVITY_EDGE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__GROUP = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ControlNodeImpl <em>Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ControlNodeImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getControlNode()
	 * @generated
	 */
	int CONTROL_NODE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__SEDGE = ACTIVITY_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__TEDGE = ACTIVITY_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__GROUP = ACTIVITY_NODE__GROUP;

	/**
	 * The number of structural features of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_OPERATION_COUNT = ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.InitialNodeImpl <em>Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.InitialNodeImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getInitialNode()
	 * @generated
	 */
	int INITIAL_NODE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__SEDGE = CONTROL_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__TEDGE = CONTROL_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__GROUP = CONTROL_NODE__GROUP;

	/**
	 * The number of structural features of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ExecutableNodeImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getExecutableNode()
	 * @generated
	 */
	int EXECUTABLE_NODE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__SEDGE = ACTIVITY_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__TEDGE = ACTIVITY_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__GROUP = ACTIVITY_NODE__GROUP;

	/**
	 * The number of structural features of the '<em>Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_OPERATION_COUNT = ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.FinalNodeImpl <em>Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.FinalNodeImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getFinalNode()
	 * @generated
	 */
	int FINAL_NODE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__SEDGE = CONTROL_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__TEDGE = CONTROL_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__GROUP = CONTROL_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Variables To Return</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__VARIABLES_TO_RETURN = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ActivityFinalNodeImpl <em>Activity Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ActivityFinalNodeImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getActivityFinalNode()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__NAME = FINAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__SEDGE = FINAL_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__TEDGE = FINAL_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__GROUP = FINAL_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Variables To Return</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__VARIABLES_TO_RETURN = FINAL_NODE__VARIABLES_TO_RETURN;

	/**
	 * The number of structural features of the '<em>Activity Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_FEATURE_COUNT = FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_OPERATION_COUNT = FINAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.FlowFinalNodeImpl <em>Flow Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.FlowFinalNodeImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getFlowFinalNode()
	 * @generated
	 */
	int FLOW_FINAL_NODE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__NAME = FINAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__SEDGE = FINAL_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__TEDGE = FINAL_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__GROUP = FINAL_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Variables To Return</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__VARIABLES_TO_RETURN = FINAL_NODE__VARIABLES_TO_RETURN;

	/**
	 * The number of structural features of the '<em>Flow Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_FEATURE_COUNT = FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flow Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_OPERATION_COUNT = FINAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.StructuredActivityNodeImpl <em>Structured Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.StructuredActivityNodeImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getStructuredActivityNode()
	 * @generated
	 */
	int STRUCTURED_ACTIVITY_NODE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__SEDGE = CONTROL_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__TEDGE = CONTROL_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__GROUP = CONTROL_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__TEST = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__BODY = CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structured Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Structured Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ConditionalNodeImpl <em>Conditional Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ConditionalNodeImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getConditionalNode()
	 * @generated
	 */
	int CONDITIONAL_NODE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__NAME = STRUCTURED_ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__SEDGE = STRUCTURED_ACTIVITY_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__TEDGE = STRUCTURED_ACTIVITY_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__GROUP = STRUCTURED_ACTIVITY_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__TEST = STRUCTURED_ACTIVITY_NODE__TEST;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__BODY = STRUCTURED_ACTIVITY_NODE__BODY;

	/**
	 * The feature id for the '<em><b>Else Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__ELSE_BODY = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE_FEATURE_COUNT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conditional Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE_OPERATION_COUNT = STRUCTURED_ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.LoopNodeImpl <em>Loop Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.LoopNodeImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getLoopNode()
	 * @generated
	 */
	int LOOP_NODE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__NAME = STRUCTURED_ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__SEDGE = STRUCTURED_ACTIVITY_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__TEDGE = STRUCTURED_ACTIVITY_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__GROUP = STRUCTURED_ACTIVITY_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__TEST = STRUCTURED_ACTIVITY_NODE__TEST;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__BODY = STRUCTURED_ACTIVITY_NODE__BODY;

	/**
	 * The feature id for the '<em><b>Setup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__SETUP = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE_FEATURE_COUNT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loop Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE_OPERATION_COUNT = STRUCTURED_ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.CallOperationActionImpl <em>Call Operation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.CallOperationActionImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getCallOperationAction()
	 * @generated
	 */
	int CALL_OPERATION_ACTION = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__NAME = EXECUTABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__SEDGE = EXECUTABLE_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__TEDGE = EXECUTABLE_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__GROUP = EXECUTABLE_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Domain To Declare Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__DOMAIN_TO_DECLARE_RESULT = EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__IMPORTED_OPERATION = EXECUTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__PARAMETER_MAPPINGS = EXECUTABLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Call Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Call Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION_OPERATION_COUNT = EXECUTABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.VariableDeclarationActionImpl <em>Variable Declaration Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.VariableDeclarationActionImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getVariableDeclarationAction()
	 * @generated
	 */
	int VARIABLE_DECLARATION_ACTION = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_ACTION__NAME = EXECUTABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_ACTION__SEDGE = EXECUTABLE_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_ACTION__TEDGE = EXECUTABLE_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_ACTION__GROUP = EXECUTABLE_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_ACTION__LOWER_BOUND = EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_ACTION__UPPER_BOUND = EXECUTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imported Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_ACTION__IMPORTED_TYPE = EXECUTABLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE = EXECUTABLE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_ACTION__DECLARATION = EXECUTABLE_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Variable Declaration Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_ACTION_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Variable Declaration Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_ACTION_OPERATION_COUNT = EXECUTABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.VariableAssignmentActionImpl <em>Variable Assignment Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.VariableAssignmentActionImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getVariableAssignmentAction()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT_ACTION = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_ACTION__NAME = EXECUTABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_ACTION__SEDGE = EXECUTABLE_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_ACTION__TEDGE = EXECUTABLE_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_ACTION__GROUP = EXECUTABLE_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_ACTION__ASSIGNMENT = EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Assignment Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_ACTION_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Assignment Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_ACTION_OPERATION_COUNT = EXECUTABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.VariableAssignmentImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getVariableAssignment()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT = 31;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__EXPR = 1;

	/**
	 * The number of structural features of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.RaiseExceptionActionImpl <em>Raise Exception Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.RaiseExceptionActionImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getRaiseExceptionAction()
	 * @generated
	 */
	int RAISE_EXCEPTION_ACTION = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__NAME = EXECUTABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__SEDGE = EXECUTABLE_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__TEDGE = EXECUTABLE_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__GROUP = EXECUTABLE_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__EXCEPTION = EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raise Exception Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Raise Exception Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION_OPERATION_COUNT = EXECUTABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.RaiseEntityNotFoundExceptionActionImpl <em>Raise Entity Not Found Exception Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.RaiseEntityNotFoundExceptionActionImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getRaiseEntityNotFoundExceptionAction()
	 * @generated
	 */
	int RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION__NAME = RAISE_EXCEPTION_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION__SEDGE = RAISE_EXCEPTION_ACTION__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION__TEDGE = RAISE_EXCEPTION_ACTION__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION__GROUP = RAISE_EXCEPTION_ACTION__GROUP;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION__EXCEPTION = RAISE_EXCEPTION_ACTION__EXCEPTION;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION__ENTITY = RAISE_EXCEPTION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raise Entity Not Found Exception Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION_FEATURE_COUNT = RAISE_EXCEPTION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Raise Entity Not Found Exception Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION_OPERATION_COUNT = RAISE_EXCEPTION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.SignalActionImpl <em>Signal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.SignalActionImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getSignalAction()
	 * @generated
	 */
	int SIGNAL_ACTION = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ACTION__NAME = EXECUTABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ACTION__SEDGE = EXECUTABLE_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ACTION__TEDGE = EXECUTABLE_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ACTION__GROUP = EXECUTABLE_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ACTION__EVENT = EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ACTION__VALUE = EXECUTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ACTION_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Signal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ACTION_OPERATION_COUNT = EXECUTABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.SendSignalActionImpl <em>Send Signal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.SendSignalActionImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getSendSignalAction()
	 * @generated
	 */
	int SEND_SIGNAL_ACTION = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__NAME = SIGNAL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__SEDGE = SIGNAL_ACTION__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__TEDGE = SIGNAL_ACTION__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__GROUP = SIGNAL_ACTION__GROUP;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__EVENT = SIGNAL_ACTION__EVENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__VALUE = SIGNAL_ACTION__VALUE;

	/**
	 * The number of structural features of the '<em>Send Signal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION_FEATURE_COUNT = SIGNAL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Send Signal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION_OPERATION_COUNT = SIGNAL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ReceiveSignalActionImpl <em>Receive Signal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ReceiveSignalActionImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getReceiveSignalAction()
	 * @generated
	 */
	int RECEIVE_SIGNAL_ACTION = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_SIGNAL_ACTION__NAME = SIGNAL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_SIGNAL_ACTION__SEDGE = SIGNAL_ACTION__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_SIGNAL_ACTION__TEDGE = SIGNAL_ACTION__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_SIGNAL_ACTION__GROUP = SIGNAL_ACTION__GROUP;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_SIGNAL_ACTION__EVENT = SIGNAL_ACTION__EVENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_SIGNAL_ACTION__VALUE = SIGNAL_ACTION__VALUE;

	/**
	 * The number of structural features of the '<em>Receive Signal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_SIGNAL_ACTION_FEATURE_COUNT = SIGNAL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Receive Signal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_SIGNAL_ACTION_OPERATION_COUNT = SIGNAL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ParallelNodeImpl <em>Parallel Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ParallelNodeImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getParallelNode()
	 * @generated
	 */
	int PARALLEL_NODE = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__SEDGE = CONTROL_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__TEDGE = CONTROL_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__GROUP = CONTROL_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Owned Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__OWNED_GROUP = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parallel Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parallel Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ParameterMappingImpl <em>Parameter Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ParameterMappingImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getParameterMapping()
	 * @generated
	 */
	int PARAMETER_MAPPING = 38;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Operation Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__OPERATION_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Activity Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__ACTIVITY_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__VALUE = 5;

	/**
	 * The feature id for the '<em><b>Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__ACTION = 6;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__ACTIVITY = 7;

	/**
	 * The number of structural features of the '<em>Parameter Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Parameter Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.ExpressionImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.UnaryExpressionImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__IDENTIFIER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.BinaryExpressionImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT_EXPR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT_EXPR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.NotExpressionImpl <em>Not Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.NotExpressionImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getNotExpression()
	 * @generated
	 */
	int NOT_EXPRESSION = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.OperatorImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 43;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.IntegerOperatorImpl <em>Integer Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.IntegerOperatorImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getIntegerOperator()
	 * @generated
	 */
	int INTEGER_OPERATOR = 44;

	/**
	 * The number of structural features of the '<em>Integer Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.DivideImpl <em>Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.DivideImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getDivide()
	 * @generated
	 */
	int DIVIDE = 45;

	/**
	 * The number of structural features of the '<em>Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_OPERATION_COUNT = INTEGER_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.TimesImpl <em>Times</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.TimesImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getTimes()
	 * @generated
	 */
	int TIMES = 46;

	/**
	 * The number of structural features of the '<em>Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMES_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMES_OPERATION_COUNT = INTEGER_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.PlusImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 47;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATION_COUNT = INTEGER_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.MinusImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 48;

	/**
	 * The number of structural features of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATION_COUNT = INTEGER_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.LogicalOperatorImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 49;

	/**
	 * The number of structural features of the '<em>Logical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.GtImpl <em>Gt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.GtImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getGt()
	 * @generated
	 */
	int GT = 50;

	/**
	 * The number of structural features of the '<em>Gt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.LtImpl <em>Lt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.LtImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getLt()
	 * @generated
	 */
	int LT = 51;

	/**
	 * The number of structural features of the '<em>Lt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.GeImpl <em>Ge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.GeImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getGe()
	 * @generated
	 */
	int GE = 52;

	/**
	 * The number of structural features of the '<em>Ge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GE_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GE_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.LeImpl <em>Le</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.LeImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getLe()
	 * @generated
	 */
	int LE = 53;

	/**
	 * The number of structural features of the '<em>Le</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Le</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.EqImpl <em>Eq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.EqImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getEq()
	 * @generated
	 */
	int EQ = 54;

	/**
	 * The number of structural features of the '<em>Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.NeImpl <em>Ne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.NeImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getNe()
	 * @generated
	 */
	int NE = 55;

	/**
	 * The number of structural features of the '<em>Ne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.AndImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 56;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.OrImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getOr()
	 * @generated
	 */
	int OR = 57;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.impl.TypedMultiplicityElementImpl <em>Typed Multiplicity Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.impl.TypedMultiplicityElementImpl
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getTypedMultiplicityElement()
	 * @generated
	 */
	int TYPED_MULTIPLICITY_ELEMENT = 58;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT__DEFAULT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT__UPPER_BOUND = 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT__LOWER_BOUND = 3;

	/**
	 * The number of structural features of the '<em>Typed Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Typed Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.behavior.ParameterMappingType <em>Parameter Mapping Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.behavior.ParameterMappingType
	 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getParameterMappingType()
	 * @generated
	 */
	int PARAMETER_MAPPING_TYPE = 59;


	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.BehaviorModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see lemma.adapted.xcore.behavior.BehaviorModel
	 * @generated
	 */
	EClass getBehaviorModel();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.behavior.BehaviorModel#getT_modelUri <em>Tmodel Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tmodel Uri</em>'.
	 * @see lemma.adapted.xcore.behavior.BehaviorModel#getT_modelUri()
	 * @see #getBehaviorModel()
	 * @generated
	 */
	EAttribute getBehaviorModel_T_modelUri();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.behavior.BehaviorModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see lemma.adapted.xcore.behavior.BehaviorModel#getImports()
	 * @see #getBehaviorModel()
	 * @generated
	 */
	EReference getBehaviorModel_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.BehaviorModel#getActivityModel <em>Activity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity Model</em>'.
	 * @see lemma.adapted.xcore.behavior.BehaviorModel#getActivityModel()
	 * @see #getBehaviorModel()
	 * @generated
	 */
	EReference getBehaviorModel_ActivityModel();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.ActivityModel <em>Activity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Model</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityModel
	 * @generated
	 */
	EClass getActivityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.behavior.ActivityModel#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityModel#getActivities()
	 * @see #getActivityModel()
	 * @generated
	 */
	EReference getActivityModel_Activities();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see lemma.adapted.xcore.behavior.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.behavior.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lemma.adapted.xcore.behavior.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.SpecDataOperation <em>Spec Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Data Operation</em>'.
	 * @see lemma.adapted.xcore.behavior.SpecDataOperation
	 * @generated
	 */
	EClass getSpecDataOperation();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.behavior.SpecDataOperation#getIsInvariant <em>Is Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Invariant</em>'.
	 * @see lemma.adapted.xcore.behavior.SpecDataOperation#getIsInvariant()
	 * @see #getSpecDataOperation()
	 * @generated
	 */
	EAttribute getSpecDataOperation_IsInvariant();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.behavior.SpecDataOperation#getOwnedRules <em>Owned Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Rules</em>'.
	 * @see lemma.adapted.xcore.behavior.SpecDataOperation#getOwnedRules()
	 * @see #getSpecDataOperation()
	 * @generated
	 */
	EReference getSpecDataOperation_OwnedRules();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.SpecRule <em>Spec Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Rule</em>'.
	 * @see lemma.adapted.xcore.behavior.SpecRule
	 * @generated
	 */
	EClass getSpecRule();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.behavior.SpecRule#getRawString <em>Raw String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw String</em>'.
	 * @see lemma.adapted.xcore.behavior.SpecRule#getRawString()
	 * @see #getSpecRule()
	 * @generated
	 */
	EAttribute getSpecRule_RawString();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.SpecRule#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see lemma.adapted.xcore.behavior.SpecRule#getExpr()
	 * @see #getSpecRule()
	 * @generated
	 */
	EReference getSpecRule_Expr();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.ImportedOperation <em>Imported Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Operation</em>'.
	 * @see lemma.adapted.xcore.behavior.ImportedOperation
	 * @generated
	 */
	EClass getImportedOperation();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.behavior.ImportedOperation#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see lemma.adapted.xcore.behavior.ImportedOperation#getImport()
	 * @see #getImportedOperation()
	 * @generated
	 */
	EReference getImportedOperation_Import();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.ImportedInterfaceOperation <em>Imported Interface Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Interface Operation</em>'.
	 * @see lemma.adapted.xcore.behavior.ImportedInterfaceOperation
	 * @generated
	 */
	EClass getImportedInterfaceOperation();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.behavior.ImportedInterfaceOperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see lemma.adapted.xcore.behavior.ImportedInterfaceOperation#getOperation()
	 * @see #getImportedInterfaceOperation()
	 * @generated
	 */
	EReference getImportedInterfaceOperation_Operation();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.ImportedDataOperation <em>Imported Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Data Operation</em>'.
	 * @see lemma.adapted.xcore.behavior.ImportedDataOperation
	 * @generated
	 */
	EClass getImportedDataOperation();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.behavior.ImportedDataOperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see lemma.adapted.xcore.behavior.ImportedDataOperation#getOperation()
	 * @see #getImportedDataOperation()
	 * @generated
	 */
	EReference getImportedDataOperation_Operation();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.ImportedParameter <em>Imported Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Parameter</em>'.
	 * @see lemma.adapted.xcore.behavior.ImportedParameter
	 * @generated
	 */
	EClass getImportedParameter();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.behavior.ImportedParameter#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see lemma.adapted.xcore.behavior.ImportedParameter#getImport()
	 * @see #getImportedParameter()
	 * @generated
	 */
	EReference getImportedParameter_Import();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.ImportedInterfaceParameter <em>Imported Interface Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Interface Parameter</em>'.
	 * @see lemma.adapted.xcore.behavior.ImportedInterfaceParameter
	 * @generated
	 */
	EClass getImportedInterfaceParameter();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.behavior.ImportedInterfaceParameter#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see lemma.adapted.xcore.behavior.ImportedInterfaceParameter#getParameter()
	 * @see #getImportedInterfaceParameter()
	 * @generated
	 */
	EReference getImportedInterfaceParameter_Parameter();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.ImportedDataParameter <em>Imported Data Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Data Parameter</em>'.
	 * @see lemma.adapted.xcore.behavior.ImportedDataParameter
	 * @generated
	 */
	EClass getImportedDataParameter();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.behavior.ImportedDataParameter#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see lemma.adapted.xcore.behavior.ImportedDataParameter#getParameter()
	 * @see #getImportedDataParameter()
	 * @generated
	 */
	EReference getImportedDataParameter_Parameter();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see lemma.adapted.xcore.behavior.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.Behavior#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see lemma.adapted.xcore.behavior.Behavior#getSpecification()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Specification();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see lemma.adapted.xcore.behavior.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.behavior.Activity#getToTransform <em>To Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Transform</em>'.
	 * @see lemma.adapted.xcore.behavior.Activity#getToTransform()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_ToTransform();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.behavior.Activity#getOwnedParameters <em>Owned Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameters</em>'.
	 * @see lemma.adapted.xcore.behavior.Activity#getOwnedParameters()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_OwnedParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.behavior.Activity#getParameterMappings <em>Parameter Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Mappings</em>'.
	 * @see lemma.adapted.xcore.behavior.Activity#getParameterMappings()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_ParameterMappings();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.Activity#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see lemma.adapted.xcore.behavior.Activity#getRoot()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Root();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see lemma.adapted.xcore.behavior.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.behavior.Scope#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see lemma.adapted.xcore.behavior.Scope#getParent()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Parent();

	/**
	 * Returns the meta object for the reference list '{@link lemma.adapted.xcore.behavior.Scope#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see lemma.adapted.xcore.behavior.Scope#getChildren()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Children();

	/**
	 * Returns the meta object for the reference list '{@link lemma.adapted.xcore.behavior.Scope#getInheritedVariables <em>Inherited Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherited Variables</em>'.
	 * @see lemma.adapted.xcore.behavior.Scope#getInheritedVariables()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_InheritedVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.behavior.Scope#getOwnedVariables <em>Owned Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Variables</em>'.
	 * @see lemma.adapted.xcore.behavior.Scope#getOwnedVariables()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_OwnedVariables();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.behavior.Scope#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see lemma.adapted.xcore.behavior.Scope#getGroup()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Group();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see lemma.adapted.xcore.behavior.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.ActivityGroup <em>Activity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Group</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityGroup
	 * @generated
	 */
	EClass getActivityGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.behavior.ActivityGroup#getOwnedNodes <em>Owned Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Nodes</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityGroup#getOwnedNodes()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_OwnedNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.behavior.ActivityGroup#getOwnedEdges <em>Owned Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Edges</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityGroup#getOwnedEdges()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_OwnedEdges();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.ActivityGroup#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityGroup#getScope()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_Scope();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.behavior.ActivityGroup#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityGroup#getActivity()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_Activity();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.behavior.ActivityGroup#getStructuredActivityNode <em>Structured Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Structured Activity Node</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityGroup#getStructuredActivityNode()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_StructuredActivityNode();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.behavior.ActivityGroup#getConditionalNode <em>Conditional Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Conditional Node</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityGroup#getConditionalNode()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_ConditionalNode();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see lemma.adapted.xcore.behavior.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.Variable#getImportedType <em>Imported Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Type</em>'.
	 * @see lemma.adapted.xcore.behavior.Variable#getImportedType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_ImportedType();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.Variable#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primitive Type</em>'.
	 * @see lemma.adapted.xcore.behavior.Variable#getPrimitiveType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_PrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.behavior.Variable#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see lemma.adapted.xcore.behavior.Variable#getUpperBound()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.behavior.Variable#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see lemma.adapted.xcore.behavior.Variable#getLowerBound()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_LowerBound();

	/**
	 * Returns the meta object for the reference list '{@link lemma.adapted.xcore.behavior.Variable#getAccessibleScopes <em>Accessible Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessible Scopes</em>'.
	 * @see lemma.adapted.xcore.behavior.Variable#getAccessibleScopes()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_AccessibleScopes();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.behavior.Variable#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scope</em>'.
	 * @see lemma.adapted.xcore.behavior.Variable#getScope()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Scope();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityNode
	 * @generated
	 */
	EClass getActivityNode();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.behavior.ActivityNode#getSEdge <em>SEdge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SEdge</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityNode#getSEdge()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_SEdge();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.behavior.ActivityNode#getTEdge <em>TEdge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TEdge</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityNode#getTEdge()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_TEdge();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.behavior.ActivityNode#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityNode#getGroup()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Group();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityEdge
	 * @generated
	 */
	EClass getActivityEdge();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.behavior.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityEdge#getSource()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.behavior.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityEdge#getTarget()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Target();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.behavior.ActivityEdge#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityEdge#getGroup()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Group();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node</em>'.
	 * @see lemma.adapted.xcore.behavior.InitialNode
	 * @generated
	 */
	EClass getInitialNode();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node</em>'.
	 * @see lemma.adapted.xcore.behavior.ControlNode
	 * @generated
	 */
	EClass getControlNode();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Node</em>'.
	 * @see lemma.adapted.xcore.behavior.ExecutableNode
	 * @generated
	 */
	EClass getExecutableNode();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node</em>'.
	 * @see lemma.adapted.xcore.behavior.FinalNode
	 * @generated
	 */
	EClass getFinalNode();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.behavior.FinalNode#getVariablesToReturn <em>Variables To Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables To Return</em>'.
	 * @see lemma.adapted.xcore.behavior.FinalNode#getVariablesToReturn()
	 * @see #getFinalNode()
	 * @generated
	 */
	EReference getFinalNode_VariablesToReturn();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.ActivityFinalNode <em>Activity Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node</em>'.
	 * @see lemma.adapted.xcore.behavior.ActivityFinalNode
	 * @generated
	 */
	EClass getActivityFinalNode();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.FlowFinalNode <em>Flow Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Final Node</em>'.
	 * @see lemma.adapted.xcore.behavior.FlowFinalNode
	 * @generated
	 */
	EClass getFlowFinalNode();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.StructuredActivityNode <em>Structured Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Activity Node</em>'.
	 * @see lemma.adapted.xcore.behavior.StructuredActivityNode
	 * @generated
	 */
	EClass getStructuredActivityNode();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.StructuredActivityNode#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test</em>'.
	 * @see lemma.adapted.xcore.behavior.StructuredActivityNode#getTest()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_Test();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.StructuredActivityNode#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see lemma.adapted.xcore.behavior.StructuredActivityNode#getBody()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_Body();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.ConditionalNode <em>Conditional Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Node</em>'.
	 * @see lemma.adapted.xcore.behavior.ConditionalNode
	 * @generated
	 */
	EClass getConditionalNode();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.ConditionalNode#getElseBody <em>Else Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Body</em>'.
	 * @see lemma.adapted.xcore.behavior.ConditionalNode#getElseBody()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EReference getConditionalNode_ElseBody();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.LoopNode <em>Loop Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Node</em>'.
	 * @see lemma.adapted.xcore.behavior.LoopNode
	 * @generated
	 */
	EClass getLoopNode();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.LoopNode#getSetup <em>Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Setup</em>'.
	 * @see lemma.adapted.xcore.behavior.LoopNode#getSetup()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_Setup();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.CallOperationAction <em>Call Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Operation Action</em>'.
	 * @see lemma.adapted.xcore.behavior.CallOperationAction
	 * @generated
	 */
	EClass getCallOperationAction();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.behavior.CallOperationAction#getDomainToDeclareResult <em>Domain To Declare Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain To Declare Result</em>'.
	 * @see lemma.adapted.xcore.behavior.CallOperationAction#getDomainToDeclareResult()
	 * @see #getCallOperationAction()
	 * @generated
	 */
	EAttribute getCallOperationAction_DomainToDeclareResult();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.CallOperationAction#getImportedOperation <em>Imported Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Operation</em>'.
	 * @see lemma.adapted.xcore.behavior.CallOperationAction#getImportedOperation()
	 * @see #getCallOperationAction()
	 * @generated
	 */
	EReference getCallOperationAction_ImportedOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.behavior.CallOperationAction#getParameterMappings <em>Parameter Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Mappings</em>'.
	 * @see lemma.adapted.xcore.behavior.CallOperationAction#getParameterMappings()
	 * @see #getCallOperationAction()
	 * @generated
	 */
	EReference getCallOperationAction_ParameterMappings();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.VariableDeclarationAction <em>Variable Declaration Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration Action</em>'.
	 * @see lemma.adapted.xcore.behavior.VariableDeclarationAction
	 * @generated
	 */
	EClass getVariableDeclarationAction();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.behavior.VariableDeclarationAction#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see lemma.adapted.xcore.behavior.VariableDeclarationAction#getLowerBound()
	 * @see #getVariableDeclarationAction()
	 * @generated
	 */
	EAttribute getVariableDeclarationAction_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.behavior.VariableDeclarationAction#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see lemma.adapted.xcore.behavior.VariableDeclarationAction#getUpperBound()
	 * @see #getVariableDeclarationAction()
	 * @generated
	 */
	EAttribute getVariableDeclarationAction_UpperBound();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.VariableDeclarationAction#getImportedType <em>Imported Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Type</em>'.
	 * @see lemma.adapted.xcore.behavior.VariableDeclarationAction#getImportedType()
	 * @see #getVariableDeclarationAction()
	 * @generated
	 */
	EReference getVariableDeclarationAction_ImportedType();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.VariableDeclarationAction#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primitive Type</em>'.
	 * @see lemma.adapted.xcore.behavior.VariableDeclarationAction#getPrimitiveType()
	 * @see #getVariableDeclarationAction()
	 * @generated
	 */
	EReference getVariableDeclarationAction_PrimitiveType();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.VariableDeclarationAction#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declaration</em>'.
	 * @see lemma.adapted.xcore.behavior.VariableDeclarationAction#getDeclaration()
	 * @see #getVariableDeclarationAction()
	 * @generated
	 */
	EReference getVariableDeclarationAction_Declaration();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.VariableAssignmentAction <em>Variable Assignment Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment Action</em>'.
	 * @see lemma.adapted.xcore.behavior.VariableAssignmentAction
	 * @generated
	 */
	EClass getVariableAssignmentAction();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.VariableAssignmentAction#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignment</em>'.
	 * @see lemma.adapted.xcore.behavior.VariableAssignmentAction#getAssignment()
	 * @see #getVariableAssignmentAction()
	 * @generated
	 */
	EReference getVariableAssignmentAction_Assignment();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.VariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment</em>'.
	 * @see lemma.adapted.xcore.behavior.VariableAssignment
	 * @generated
	 */
	EClass getVariableAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.VariableAssignment#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see lemma.adapted.xcore.behavior.VariableAssignment#getIdentifier()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.VariableAssignment#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see lemma.adapted.xcore.behavior.VariableAssignment#getExpr()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Expr();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.RaiseExceptionAction <em>Raise Exception Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raise Exception Action</em>'.
	 * @see lemma.adapted.xcore.behavior.RaiseExceptionAction
	 * @generated
	 */
	EClass getRaiseExceptionAction();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.RaiseExceptionAction#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception</em>'.
	 * @see lemma.adapted.xcore.behavior.RaiseExceptionAction#getException()
	 * @see #getRaiseExceptionAction()
	 * @generated
	 */
	EReference getRaiseExceptionAction_Exception();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.RaiseEntityNotFoundExceptionAction <em>Raise Entity Not Found Exception Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raise Entity Not Found Exception Action</em>'.
	 * @see lemma.adapted.xcore.behavior.RaiseEntityNotFoundExceptionAction
	 * @generated
	 */
	EClass getRaiseEntityNotFoundExceptionAction();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.behavior.RaiseEntityNotFoundExceptionAction#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see lemma.adapted.xcore.behavior.RaiseEntityNotFoundExceptionAction#getEntity()
	 * @see #getRaiseEntityNotFoundExceptionAction()
	 * @generated
	 */
	EReference getRaiseEntityNotFoundExceptionAction_Entity();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.SendSignalAction <em>Send Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Signal Action</em>'.
	 * @see lemma.adapted.xcore.behavior.SendSignalAction
	 * @generated
	 */
	EClass getSendSignalAction();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.ReceiveSignalAction <em>Receive Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Signal Action</em>'.
	 * @see lemma.adapted.xcore.behavior.ReceiveSignalAction
	 * @generated
	 */
	EClass getReceiveSignalAction();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.ParallelNode <em>Parallel Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Node</em>'.
	 * @see lemma.adapted.xcore.behavior.ParallelNode
	 * @generated
	 */
	EClass getParallelNode();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.behavior.ParallelNode#getOwnedGroup <em>Owned Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Group</em>'.
	 * @see lemma.adapted.xcore.behavior.ParallelNode#getOwnedGroup()
	 * @see #getParallelNode()
	 * @generated
	 */
	EReference getParallelNode_OwnedGroup();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.SignalAction <em>Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Action</em>'.
	 * @see lemma.adapted.xcore.behavior.SignalAction
	 * @generated
	 */
	EClass getSignalAction();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.SignalAction#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see lemma.adapted.xcore.behavior.SignalAction#getEvent()
	 * @see #getSignalAction()
	 * @generated
	 */
	EReference getSignalAction_Event();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.SignalAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see lemma.adapted.xcore.behavior.SignalAction#getValue()
	 * @see #getSignalAction()
	 * @generated
	 */
	EReference getSignalAction_Value();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.ParameterMapping <em>Parameter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Mapping</em>'.
	 * @see lemma.adapted.xcore.behavior.ParameterMapping
	 * @generated
	 */
	EClass getParameterMapping();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.behavior.ParameterMapping#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see lemma.adapted.xcore.behavior.ParameterMapping#getType()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EAttribute getParameterMapping_Type();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.ParameterMapping#getOperationParameter <em>Operation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Parameter</em>'.
	 * @see lemma.adapted.xcore.behavior.ParameterMapping#getOperationParameter()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_OperationParameter();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.ParameterMapping#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see lemma.adapted.xcore.behavior.ParameterMapping#getIdentifier()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_Identifier();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.behavior.ParameterMapping#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see lemma.adapted.xcore.behavior.ParameterMapping#getVariable()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_Variable();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.behavior.ParameterMapping#getActivityParameter <em>Activity Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity Parameter</em>'.
	 * @see lemma.adapted.xcore.behavior.ParameterMapping#getActivityParameter()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_ActivityParameter();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.ParameterMapping#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see lemma.adapted.xcore.behavior.ParameterMapping#getValue()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_Value();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.behavior.ParameterMapping#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Action</em>'.
	 * @see lemma.adapted.xcore.behavior.ParameterMapping#getAction()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_Action();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.behavior.ParameterMapping#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity</em>'.
	 * @see lemma.adapted.xcore.behavior.ParameterMapping#getActivity()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_Activity();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see lemma.adapted.xcore.behavior.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see lemma.adapted.xcore.behavior.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.UnaryExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see lemma.adapted.xcore.behavior.UnaryExpression#getValue()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Value();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.UnaryExpression#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see lemma.adapted.xcore.behavior.UnaryExpression#getIdentifier()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Identifier();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see lemma.adapted.xcore.behavior.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see lemma.adapted.xcore.behavior.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.BinaryExpression#getLeftExpr <em>Left Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Expr</em>'.
	 * @see lemma.adapted.xcore.behavior.BinaryExpression#getLeftExpr()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_LeftExpr();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.BinaryExpression#getRightExpr <em>Right Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Expr</em>'.
	 * @see lemma.adapted.xcore.behavior.BinaryExpression#getRightExpr()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_RightExpr();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.NotExpression <em>Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Expression</em>'.
	 * @see lemma.adapted.xcore.behavior.NotExpression
	 * @generated
	 */
	EClass getNotExpression();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.NotExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see lemma.adapted.xcore.behavior.NotExpression#getExpr()
	 * @see #getNotExpression()
	 * @generated
	 */
	EReference getNotExpression_Expr();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see lemma.adapted.xcore.behavior.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.IntegerOperator <em>Integer Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Operator</em>'.
	 * @see lemma.adapted.xcore.behavior.IntegerOperator
	 * @generated
	 */
	EClass getIntegerOperator();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Divide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divide</em>'.
	 * @see lemma.adapted.xcore.behavior.Divide
	 * @generated
	 */
	EClass getDivide();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Times <em>Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Times</em>'.
	 * @see lemma.adapted.xcore.behavior.Times
	 * @generated
	 */
	EClass getTimes();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see lemma.adapted.xcore.behavior.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see lemma.adapted.xcore.behavior.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Operator</em>'.
	 * @see lemma.adapted.xcore.behavior.LogicalOperator
	 * @generated
	 */
	EClass getLogicalOperator();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Gt <em>Gt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gt</em>'.
	 * @see lemma.adapted.xcore.behavior.Gt
	 * @generated
	 */
	EClass getGt();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Lt <em>Lt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lt</em>'.
	 * @see lemma.adapted.xcore.behavior.Lt
	 * @generated
	 */
	EClass getLt();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Ge <em>Ge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ge</em>'.
	 * @see lemma.adapted.xcore.behavior.Ge
	 * @generated
	 */
	EClass getGe();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Le <em>Le</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Le</em>'.
	 * @see lemma.adapted.xcore.behavior.Le
	 * @generated
	 */
	EClass getLe();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Eq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eq</em>'.
	 * @see lemma.adapted.xcore.behavior.Eq
	 * @generated
	 */
	EClass getEq();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Ne <em>Ne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne</em>'.
	 * @see lemma.adapted.xcore.behavior.Ne
	 * @generated
	 */
	EClass getNe();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see lemma.adapted.xcore.behavior.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see lemma.adapted.xcore.behavior.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.behavior.TypedMultiplicityElement <em>Typed Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Multiplicity Element</em>'.
	 * @see lemma.adapted.xcore.behavior.TypedMultiplicityElement
	 * @generated
	 */
	EClass getTypedMultiplicityElement();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.TypedMultiplicityElement#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see lemma.adapted.xcore.behavior.TypedMultiplicityElement#getDefault()
	 * @see #getTypedMultiplicityElement()
	 * @generated
	 */
	EReference getTypedMultiplicityElement_Default();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.behavior.TypedMultiplicityElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see lemma.adapted.xcore.behavior.TypedMultiplicityElement#getType()
	 * @see #getTypedMultiplicityElement()
	 * @generated
	 */
	EReference getTypedMultiplicityElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.behavior.TypedMultiplicityElement#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see lemma.adapted.xcore.behavior.TypedMultiplicityElement#getUpperBound()
	 * @see #getTypedMultiplicityElement()
	 * @generated
	 */
	EAttribute getTypedMultiplicityElement_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.behavior.TypedMultiplicityElement#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see lemma.adapted.xcore.behavior.TypedMultiplicityElement#getLowerBound()
	 * @see #getTypedMultiplicityElement()
	 * @generated
	 */
	EAttribute getTypedMultiplicityElement_LowerBound();

	/**
	 * Returns the meta object for enum '{@link lemma.adapted.xcore.behavior.ParameterMappingType <em>Parameter Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Mapping Type</em>'.
	 * @see lemma.adapted.xcore.behavior.ParameterMappingType
	 * @generated
	 */
	EEnum getParameterMappingType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviorFactory getBehaviorFactory();

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
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.BehaviorModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorModelImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getBehaviorModel()
		 * @generated
		 */
		EClass BEHAVIOR_MODEL = eINSTANCE.getBehaviorModel();

		/**
		 * The meta object literal for the '<em><b>Tmodel Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_MODEL__TMODEL_URI = eINSTANCE.getBehaviorModel_T_modelUri();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_MODEL__IMPORTS = eINSTANCE.getBehaviorModel_Imports();

		/**
		 * The meta object literal for the '<em><b>Activity Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_MODEL__ACTIVITY_MODEL = eINSTANCE.getBehaviorModel_ActivityModel();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ActivityModelImpl <em>Activity Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ActivityModelImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getActivityModel()
		 * @generated
		 */
		EClass ACTIVITY_MODEL = eINSTANCE.getActivityModel();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_MODEL__ACTIVITIES = eINSTANCE.getActivityModel_Activities();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.NamedElementImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.SpecDataOperationImpl <em>Spec Data Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.SpecDataOperationImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getSpecDataOperation()
		 * @generated
		 */
		EClass SPEC_DATA_OPERATION = eINSTANCE.getSpecDataOperation();

		/**
		 * The meta object literal for the '<em><b>Is Invariant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_DATA_OPERATION__IS_INVARIANT = eINSTANCE.getSpecDataOperation_IsInvariant();

		/**
		 * The meta object literal for the '<em><b>Owned Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_DATA_OPERATION__OWNED_RULES = eINSTANCE.getSpecDataOperation_OwnedRules();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.SpecRuleImpl <em>Spec Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.SpecRuleImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getSpecRule()
		 * @generated
		 */
		EClass SPEC_RULE = eINSTANCE.getSpecRule();

		/**
		 * The meta object literal for the '<em><b>Raw String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_RULE__RAW_STRING = eINSTANCE.getSpecRule_RawString();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_RULE__EXPR = eINSTANCE.getSpecRule_Expr();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ImportedOperationImpl <em>Imported Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ImportedOperationImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getImportedOperation()
		 * @generated
		 */
		EClass IMPORTED_OPERATION = eINSTANCE.getImportedOperation();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_OPERATION__IMPORT = eINSTANCE.getImportedOperation_Import();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ImportedInterfaceOperationImpl <em>Imported Interface Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ImportedInterfaceOperationImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getImportedInterfaceOperation()
		 * @generated
		 */
		EClass IMPORTED_INTERFACE_OPERATION = eINSTANCE.getImportedInterfaceOperation();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_INTERFACE_OPERATION__OPERATION = eINSTANCE.getImportedInterfaceOperation_Operation();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ImportedDataOperationImpl <em>Imported Data Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ImportedDataOperationImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getImportedDataOperation()
		 * @generated
		 */
		EClass IMPORTED_DATA_OPERATION = eINSTANCE.getImportedDataOperation();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_DATA_OPERATION__OPERATION = eINSTANCE.getImportedDataOperation_Operation();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ImportedParameterImpl <em>Imported Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ImportedParameterImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getImportedParameter()
		 * @generated
		 */
		EClass IMPORTED_PARAMETER = eINSTANCE.getImportedParameter();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_PARAMETER__IMPORT = eINSTANCE.getImportedParameter_Import();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ImportedInterfaceParameterImpl <em>Imported Interface Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ImportedInterfaceParameterImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getImportedInterfaceParameter()
		 * @generated
		 */
		EClass IMPORTED_INTERFACE_PARAMETER = eINSTANCE.getImportedInterfaceParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_INTERFACE_PARAMETER__PARAMETER = eINSTANCE.getImportedInterfaceParameter_Parameter();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ImportedDataParameterImpl <em>Imported Data Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ImportedDataParameterImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getImportedDataParameter()
		 * @generated
		 */
		EClass IMPORTED_DATA_PARAMETER = eINSTANCE.getImportedDataParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_DATA_PARAMETER__PARAMETER = eINSTANCE.getImportedDataParameter_Parameter();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__SPECIFICATION = eINSTANCE.getBehavior_Specification();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ActivityImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>To Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__TO_TRANSFORM = eINSTANCE.getActivity_ToTransform();

		/**
		 * The meta object literal for the '<em><b>Owned Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__OWNED_PARAMETERS = eINSTANCE.getActivity_OwnedParameters();

		/**
		 * The meta object literal for the '<em><b>Parameter Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PARAMETER_MAPPINGS = eINSTANCE.getActivity_ParameterMappings();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__ROOT = eINSTANCE.getActivity_Root();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ScopeImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__PARENT = eINSTANCE.getScope_Parent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__CHILDREN = eINSTANCE.getScope_Children();

		/**
		 * The meta object literal for the '<em><b>Inherited Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__INHERITED_VARIABLES = eINSTANCE.getScope_InheritedVariables();

		/**
		 * The meta object literal for the '<em><b>Owned Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__OWNED_VARIABLES = eINSTANCE.getScope_OwnedVariables();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__GROUP = eINSTANCE.getScope_Group();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.IdentifierImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ActivityGroupImpl <em>Activity Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ActivityGroupImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getActivityGroup()
		 * @generated
		 */
		EClass ACTIVITY_GROUP = eINSTANCE.getActivityGroup();

		/**
		 * The meta object literal for the '<em><b>Owned Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GROUP__OWNED_NODES = eINSTANCE.getActivityGroup_OwnedNodes();

		/**
		 * The meta object literal for the '<em><b>Owned Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GROUP__OWNED_EDGES = eINSTANCE.getActivityGroup_OwnedEdges();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GROUP__SCOPE = eINSTANCE.getActivityGroup_Scope();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GROUP__ACTIVITY = eINSTANCE.getActivityGroup_Activity();

		/**
		 * The meta object literal for the '<em><b>Structured Activity Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE = eINSTANCE.getActivityGroup_StructuredActivityNode();

		/**
		 * The meta object literal for the '<em><b>Conditional Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GROUP__CONDITIONAL_NODE = eINSTANCE.getActivityGroup_ConditionalNode();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.VariableImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Imported Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__IMPORTED_TYPE = eINSTANCE.getVariable_ImportedType();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__PRIMITIVE_TYPE = eINSTANCE.getVariable_PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__UPPER_BOUND = eINSTANCE.getVariable_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__LOWER_BOUND = eINSTANCE.getVariable_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Accessible Scopes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__ACCESSIBLE_SCOPES = eINSTANCE.getVariable_AccessibleScopes();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__SCOPE = eINSTANCE.getVariable_Scope();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ActivityNodeImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getActivityNode()
		 * @generated
		 */
		EClass ACTIVITY_NODE = eINSTANCE.getActivityNode();

		/**
		 * The meta object literal for the '<em><b>SEdge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__SEDGE = eINSTANCE.getActivityNode_SEdge();

		/**
		 * The meta object literal for the '<em><b>TEdge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__TEDGE = eINSTANCE.getActivityNode_TEdge();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__GROUP = eINSTANCE.getActivityNode_Group();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ActivityEdgeImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getActivityEdge()
		 * @generated
		 */
		EClass ACTIVITY_EDGE = eINSTANCE.getActivityEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__SOURCE = eINSTANCE.getActivityEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__TARGET = eINSTANCE.getActivityEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__GROUP = eINSTANCE.getActivityEdge_Group();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.InitialNodeImpl <em>Initial Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.InitialNodeImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getInitialNode()
		 * @generated
		 */
		EClass INITIAL_NODE = eINSTANCE.getInitialNode();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ControlNodeImpl <em>Control Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ControlNodeImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getControlNode()
		 * @generated
		 */
		EClass CONTROL_NODE = eINSTANCE.getControlNode();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ExecutableNodeImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getExecutableNode()
		 * @generated
		 */
		EClass EXECUTABLE_NODE = eINSTANCE.getExecutableNode();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.FinalNodeImpl <em>Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.FinalNodeImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getFinalNode()
		 * @generated
		 */
		EClass FINAL_NODE = eINSTANCE.getFinalNode();

		/**
		 * The meta object literal for the '<em><b>Variables To Return</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_NODE__VARIABLES_TO_RETURN = eINSTANCE.getFinalNode_VariablesToReturn();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ActivityFinalNodeImpl <em>Activity Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ActivityFinalNodeImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getActivityFinalNode()
		 * @generated
		 */
		EClass ACTIVITY_FINAL_NODE = eINSTANCE.getActivityFinalNode();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.FlowFinalNodeImpl <em>Flow Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.FlowFinalNodeImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getFlowFinalNode()
		 * @generated
		 */
		EClass FLOW_FINAL_NODE = eINSTANCE.getFlowFinalNode();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.StructuredActivityNodeImpl <em>Structured Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.StructuredActivityNodeImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getStructuredActivityNode()
		 * @generated
		 */
		EClass STRUCTURED_ACTIVITY_NODE = eINSTANCE.getStructuredActivityNode();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_ACTIVITY_NODE__TEST = eINSTANCE.getStructuredActivityNode_Test();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_ACTIVITY_NODE__BODY = eINSTANCE.getStructuredActivityNode_Body();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ConditionalNodeImpl <em>Conditional Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ConditionalNodeImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getConditionalNode()
		 * @generated
		 */
		EClass CONDITIONAL_NODE = eINSTANCE.getConditionalNode();

		/**
		 * The meta object literal for the '<em><b>Else Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_NODE__ELSE_BODY = eINSTANCE.getConditionalNode_ElseBody();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.LoopNodeImpl <em>Loop Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.LoopNodeImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getLoopNode()
		 * @generated
		 */
		EClass LOOP_NODE = eINSTANCE.getLoopNode();

		/**
		 * The meta object literal for the '<em><b>Setup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__SETUP = eINSTANCE.getLoopNode_Setup();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.CallOperationActionImpl <em>Call Operation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.CallOperationActionImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getCallOperationAction()
		 * @generated
		 */
		EClass CALL_OPERATION_ACTION = eINSTANCE.getCallOperationAction();

		/**
		 * The meta object literal for the '<em><b>Domain To Declare Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_OPERATION_ACTION__DOMAIN_TO_DECLARE_RESULT = eINSTANCE.getCallOperationAction_DomainToDeclareResult();

		/**
		 * The meta object literal for the '<em><b>Imported Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_OPERATION_ACTION__IMPORTED_OPERATION = eINSTANCE.getCallOperationAction_ImportedOperation();

		/**
		 * The meta object literal for the '<em><b>Parameter Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_OPERATION_ACTION__PARAMETER_MAPPINGS = eINSTANCE.getCallOperationAction_ParameterMappings();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.VariableDeclarationActionImpl <em>Variable Declaration Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.VariableDeclarationActionImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getVariableDeclarationAction()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION_ACTION = eINSTANCE.getVariableDeclarationAction();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION_ACTION__LOWER_BOUND = eINSTANCE.getVariableDeclarationAction_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION_ACTION__UPPER_BOUND = eINSTANCE.getVariableDeclarationAction_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Imported Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_ACTION__IMPORTED_TYPE = eINSTANCE.getVariableDeclarationAction_ImportedType();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE = eINSTANCE.getVariableDeclarationAction_PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_ACTION__DECLARATION = eINSTANCE.getVariableDeclarationAction_Declaration();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.VariableAssignmentActionImpl <em>Variable Assignment Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.VariableAssignmentActionImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getVariableAssignmentAction()
		 * @generated
		 */
		EClass VARIABLE_ASSIGNMENT_ACTION = eINSTANCE.getVariableAssignmentAction();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT_ACTION__ASSIGNMENT = eINSTANCE.getVariableAssignmentAction_Assignment();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.VariableAssignmentImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getVariableAssignment()
		 * @generated
		 */
		EClass VARIABLE_ASSIGNMENT = eINSTANCE.getVariableAssignment();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT__IDENTIFIER = eINSTANCE.getVariableAssignment_Identifier();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT__EXPR = eINSTANCE.getVariableAssignment_Expr();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.RaiseExceptionActionImpl <em>Raise Exception Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.RaiseExceptionActionImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getRaiseExceptionAction()
		 * @generated
		 */
		EClass RAISE_EXCEPTION_ACTION = eINSTANCE.getRaiseExceptionAction();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAISE_EXCEPTION_ACTION__EXCEPTION = eINSTANCE.getRaiseExceptionAction_Exception();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.RaiseEntityNotFoundExceptionActionImpl <em>Raise Entity Not Found Exception Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.RaiseEntityNotFoundExceptionActionImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getRaiseEntityNotFoundExceptionAction()
		 * @generated
		 */
		EClass RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION = eINSTANCE.getRaiseEntityNotFoundExceptionAction();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION__ENTITY = eINSTANCE.getRaiseEntityNotFoundExceptionAction_Entity();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.SendSignalActionImpl <em>Send Signal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.SendSignalActionImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getSendSignalAction()
		 * @generated
		 */
		EClass SEND_SIGNAL_ACTION = eINSTANCE.getSendSignalAction();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ReceiveSignalActionImpl <em>Receive Signal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ReceiveSignalActionImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getReceiveSignalAction()
		 * @generated
		 */
		EClass RECEIVE_SIGNAL_ACTION = eINSTANCE.getReceiveSignalAction();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ParallelNodeImpl <em>Parallel Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ParallelNodeImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getParallelNode()
		 * @generated
		 */
		EClass PARALLEL_NODE = eINSTANCE.getParallelNode();

		/**
		 * The meta object literal for the '<em><b>Owned Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_NODE__OWNED_GROUP = eINSTANCE.getParallelNode_OwnedGroup();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.SignalActionImpl <em>Signal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.SignalActionImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getSignalAction()
		 * @generated
		 */
		EClass SIGNAL_ACTION = eINSTANCE.getSignalAction();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_ACTION__EVENT = eINSTANCE.getSignalAction_Event();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_ACTION__VALUE = eINSTANCE.getSignalAction_Value();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ParameterMappingImpl <em>Parameter Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ParameterMappingImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getParameterMapping()
		 * @generated
		 */
		EClass PARAMETER_MAPPING = eINSTANCE.getParameterMapping();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_MAPPING__TYPE = eINSTANCE.getParameterMapping_Type();

		/**
		 * The meta object literal for the '<em><b>Operation Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_MAPPING__OPERATION_PARAMETER = eINSTANCE.getParameterMapping_OperationParameter();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_MAPPING__IDENTIFIER = eINSTANCE.getParameterMapping_Identifier();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_MAPPING__VARIABLE = eINSTANCE.getParameterMapping_Variable();

		/**
		 * The meta object literal for the '<em><b>Activity Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_MAPPING__ACTIVITY_PARAMETER = eINSTANCE.getParameterMapping_ActivityParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_MAPPING__VALUE = eINSTANCE.getParameterMapping_Value();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_MAPPING__ACTION = eINSTANCE.getParameterMapping_Action();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_MAPPING__ACTIVITY = eINSTANCE.getParameterMapping_Activity();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.ExpressionImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.UnaryExpressionImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__VALUE = eINSTANCE.getUnaryExpression_Value();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__IDENTIFIER = eINSTANCE.getUnaryExpression_Identifier();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.BinaryExpressionImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT_EXPR = eINSTANCE.getBinaryExpression_LeftExpr();

		/**
		 * The meta object literal for the '<em><b>Right Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT_EXPR = eINSTANCE.getBinaryExpression_RightExpr();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.NotExpressionImpl <em>Not Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.NotExpressionImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getNotExpression()
		 * @generated
		 */
		EClass NOT_EXPRESSION = eINSTANCE.getNotExpression();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EXPRESSION__EXPR = eINSTANCE.getNotExpression_Expr();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.OperatorImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.IntegerOperatorImpl <em>Integer Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.IntegerOperatorImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getIntegerOperator()
		 * @generated
		 */
		EClass INTEGER_OPERATOR = eINSTANCE.getIntegerOperator();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.DivideImpl <em>Divide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.DivideImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getDivide()
		 * @generated
		 */
		EClass DIVIDE = eINSTANCE.getDivide();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.TimesImpl <em>Times</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.TimesImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getTimes()
		 * @generated
		 */
		EClass TIMES = eINSTANCE.getTimes();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.PlusImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.MinusImpl <em>Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.MinusImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getMinus()
		 * @generated
		 */
		EClass MINUS = eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.LogicalOperatorImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EClass LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.GtImpl <em>Gt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.GtImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getGt()
		 * @generated
		 */
		EClass GT = eINSTANCE.getGt();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.LtImpl <em>Lt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.LtImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getLt()
		 * @generated
		 */
		EClass LT = eINSTANCE.getLt();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.GeImpl <em>Ge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.GeImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getGe()
		 * @generated
		 */
		EClass GE = eINSTANCE.getGe();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.LeImpl <em>Le</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.LeImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getLe()
		 * @generated
		 */
		EClass LE = eINSTANCE.getLe();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.EqImpl <em>Eq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.EqImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getEq()
		 * @generated
		 */
		EClass EQ = eINSTANCE.getEq();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.NeImpl <em>Ne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.NeImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getNe()
		 * @generated
		 */
		EClass NE = eINSTANCE.getNe();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.AndImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.OrImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.impl.TypedMultiplicityElementImpl <em>Typed Multiplicity Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.impl.TypedMultiplicityElementImpl
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getTypedMultiplicityElement()
		 * @generated
		 */
		EClass TYPED_MULTIPLICITY_ELEMENT = eINSTANCE.getTypedMultiplicityElement();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_MULTIPLICITY_ELEMENT__DEFAULT = eINSTANCE.getTypedMultiplicityElement_Default();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_MULTIPLICITY_ELEMENT__TYPE = eINSTANCE.getTypedMultiplicityElement_Type();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_MULTIPLICITY_ELEMENT__UPPER_BOUND = eINSTANCE.getTypedMultiplicityElement_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_MULTIPLICITY_ELEMENT__LOWER_BOUND = eINSTANCE.getTypedMultiplicityElement_LowerBound();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.behavior.ParameterMappingType <em>Parameter Mapping Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.behavior.ParameterMappingType
		 * @see lemma.adapted.xcore.behavior.impl.BehaviorPackageImpl#getParameterMappingType()
		 * @generated
		 */
		EEnum PARAMETER_MAPPING_TYPE = eINSTANCE.getParameterMappingType();

	}

} //BehaviorPackage

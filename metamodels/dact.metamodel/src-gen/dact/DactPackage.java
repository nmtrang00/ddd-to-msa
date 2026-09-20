/**
 */
package dact;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see dact.DactFactory
 * @model kind="package"
 * @generated
 */
public interface DactPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dact";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/xcore/dact";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dact";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DactPackage eINSTANCE = dact.impl.DactPackageImpl.init();

	/**
	 * The meta object id for the '{@link dact.impl.TransformationOnlyImpl <em>Transformation Only</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.TransformationOnlyImpl
	 * @see dact.impl.DactPackageImpl#getTransformationOnly()
	 * @generated
	 */
	int TRANSFORMATION_ONLY = 0;

	/**
	 * The number of structural features of the '<em>Transformation Only</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ONLY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Transformation Only</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ONLY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dact.impl.DiagnosticSupportedImpl <em>Diagnostic Supported</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.DiagnosticSupportedImpl
	 * @see dact.impl.DactPackageImpl#getDiagnosticSupported()
	 * @generated
	 */
	int DIAGNOSTIC_SUPPORTED = 1;

	/**
	 * The number of structural features of the '<em>Diagnostic Supported</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_SUPPORTED_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_SUPPORTED___REPORT__DIAGNOSTICCHAIN_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_SUPPORTED___WARN__DIAGNOSTICCHAIN_STRING_STRING = 1;

	/**
	 * The number of operations of the '<em>Diagnostic Supported</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_SUPPORTED_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link dact.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.RootImpl
	 * @see dact.impl.DactPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 2;

	/**
	 * The feature id for the '<em><b>Ddd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__DDD = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ACTIVITY = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Primitives Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__PRIMITIVES_TYPES = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT___REPORT__DIAGNOSTICCHAIN_STRING_STRING = DIAGNOSTIC_SUPPORTED___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT___WARN__DIAGNOSTICCHAIN_STRING_STRING = DIAGNOSTIC_SUPPORTED___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Unique Primitive Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT___UNIQUE_PRIMITIVE_TYPE__DIAGNOSTICCHAIN_MAP = DIAGNOSTIC_SUPPORTED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = DIAGNOSTIC_SUPPORTED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dact.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.NamedElementImpl
	 * @see dact.impl.DactPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

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
	 * The meta object id for the '{@link dact.impl.TypedMultiplicityElementImpl <em>Typed Multiplicity Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.TypedMultiplicityElementImpl
	 * @see dact.impl.DactPackageImpl#getTypedMultiplicityElement()
	 * @generated
	 */
	int TYPED_MULTIPLICITY_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT__DEFAULT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT__UPPER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT__LOWER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Typed Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT___REPORT__DIAGNOSTICCHAIN_STRING_STRING = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT___WARN__DIAGNOSTICCHAIN_STRING_STRING = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>No Default For Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Single</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT___IS_SINGLE = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT___IS_COLLECTION = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Typed Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MULTIPLICITY_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link dact.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ModelImpl
	 * @see dact.impl.DactPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dact.impl.DddModelImpl <em>Ddd Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.DddModelImpl
	 * @see dact.impl.DactPackageImpl#getDddModel()
	 * @generated
	 */
	int DDD_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Bounded Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDD_MODEL__BOUNDED_CONTEXTS = MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shared Domain Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDD_MODEL__SHARED_DOMAIN_OBJECTS = MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ddd Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDD_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDD_MODEL___REPORT__DIAGNOSTICCHAIN_STRING_STRING = MODEL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDD_MODEL___WARN__DIAGNOSTICCHAIN_STRING_STRING = MODEL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unique Bounded Context Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDD_MODEL___UNIQUE_BOUNDED_CONTEXT_NAMES__DIAGNOSTICCHAIN_MAP = MODEL_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Unique Shared Domain Object Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDD_MODEL___UNIQUE_SHARED_DOMAIN_OBJECT_NAMES__DIAGNOSTICCHAIN_MAP = MODEL_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ddd Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDD_MODEL_OPERATION_COUNT = MODEL_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link dact.impl.ActivityModelImpl <em>Activity Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ActivityModelImpl
	 * @see dact.impl.DactPackageImpl#getActivityModel()
	 * @generated
	 */
	int ACTIVITY_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MODEL__ACTIVITIES = MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MODEL___REPORT__DIAGNOSTICCHAIN_STRING_STRING = MODEL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MODEL___WARN__DIAGNOSTICCHAIN_STRING_STRING = MODEL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unique Activity Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MODEL___UNIQUE_ACTIVITY_NAMES__DIAGNOSTICCHAIN_MAP = MODEL_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activity Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MODEL_OPERATION_COUNT = MODEL_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link dact.impl.DomainNodeOperationMappingImpl <em>Domain Node Operation Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.DomainNodeOperationMappingImpl
	 * @see dact.impl.DactPackageImpl#getDomainNodeOperationMapping()
	 * @generated
	 */
	int DOMAIN_NODE_OPERATION_MAPPING = 8;

	/**
	 * The feature id for the '<em><b>Used By External Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE_OPERATION_MAPPING__USED_BY_EXTERNAL_CONTEXT = TRANSFORMATION_ONLY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE_OPERATION_MAPPING__DOMAIN_NODE = TRANSFORMATION_ONLY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE_OPERATION_MAPPING__OPERATION = TRANSFORMATION_ONLY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Domain Node Operation Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE_OPERATION_MAPPING_FEATURE_COUNT = TRANSFORMATION_ONLY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Domain Node Operation Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE_OPERATION_MAPPING_OPERATION_COUNT = TRANSFORMATION_ONLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.BoundedContextImpl <em>Bounded Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.BoundedContextImpl
	 * @see dact.impl.DactPackageImpl#getBoundedContext()
	 * @generated
	 */
	int BOUNDED_CONTEXT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT__IS_EXTERNAL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT__OWNED_ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bounded Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT___REPORT__DIAGNOSTICCHAIN_STRING_STRING = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT___WARN__DIAGNOSTICCHAIN_STRING_STRING = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unique Domain Element Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT___UNIQUE_DOMAIN_ELEMENT_NAMES__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bounded Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link dact.impl.DomainElementImpl <em>Domain Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.DomainElementImpl
	 * @see dact.impl.DactPackageImpl#getDomainElement()
	 * @generated
	 */
	int DOMAIN_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__CONTEXT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.TypeImpl
	 * @see dact.impl.DactPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.DomainObjectImpl <em>Domain Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.DomainObjectImpl
	 * @see dact.impl.DactPackageImpl#getDomainObject()
	 * @generated
	 */
	int DOMAIN_OBJECT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__CONTEXT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__OWNED_PROPERTIES = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__OWNED_OPERATIONS = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__SCOPE = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT___REPORT__DIAGNOSTICCHAIN_STRING_STRING = TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT___WARN__DIAGNOSTICCHAIN_STRING_STRING = TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unique Operation Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP = TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Unique Property Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT___UNIQUE_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP = TYPE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Single Invariant Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT___SINGLE_INVARIANT_OPERATION__DIAGNOSTICCHAIN_MAP = TYPE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION_COUNT = TYPE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link dact.impl.InternalDomainObjectImpl <em>Internal Domain Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.InternalDomainObjectImpl
	 * @see dact.impl.DactPackageImpl#getInternalDomainObject()
	 * @generated
	 */
	int INTERNAL_DOMAIN_OBJECT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOMAIN_OBJECT__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOMAIN_OBJECT__CONTEXT = DOMAIN_OBJECT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOMAIN_OBJECT__OWNED_PROPERTIES = DOMAIN_OBJECT__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOMAIN_OBJECT__OWNED_OPERATIONS = DOMAIN_OBJECT__OWNED_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOMAIN_OBJECT__SCOPE = DOMAIN_OBJECT__SCOPE;

	/**
	 * The number of structural features of the '<em>Internal Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOMAIN_OBJECT_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOMAIN_OBJECT___REPORT__DIAGNOSTICCHAIN_STRING_STRING = DOMAIN_OBJECT___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOMAIN_OBJECT___WARN__DIAGNOSTICCHAIN_STRING_STRING = DOMAIN_OBJECT___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Unique Operation Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOMAIN_OBJECT___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP = DOMAIN_OBJECT___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Property Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOMAIN_OBJECT___UNIQUE_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP = DOMAIN_OBJECT___UNIQUE_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Single Invariant Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOMAIN_OBJECT___SINGLE_INVARIANT_OPERATION__DIAGNOSTICCHAIN_MAP = DOMAIN_OBJECT___SINGLE_INVARIANT_OPERATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Internal Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOMAIN_OBJECT_OPERATION_COUNT = DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.EntityImpl
	 * @see dact.impl.DactPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = INTERNAL_DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CONTEXT = INTERNAL_DOMAIN_OBJECT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__OWNED_PROPERTIES = INTERNAL_DOMAIN_OBJECT__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__OWNED_OPERATIONS = INTERNAL_DOMAIN_OBJECT__OWNED_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SCOPE = INTERNAL_DOMAIN_OBJECT__SCOPE;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REPOSITORY = INTERNAL_DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = INTERNAL_DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___REPORT__DIAGNOSTICCHAIN_STRING_STRING = INTERNAL_DOMAIN_OBJECT___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___WARN__DIAGNOSTICCHAIN_STRING_STRING = INTERNAL_DOMAIN_OBJECT___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Unique Operation Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP = INTERNAL_DOMAIN_OBJECT___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Property Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___UNIQUE_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP = INTERNAL_DOMAIN_OBJECT___UNIQUE_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Single Invariant Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___SINGLE_INVARIANT_OPERATION__DIAGNOSTICCHAIN_MAP = INTERNAL_DOMAIN_OBJECT___SINGLE_INVARIANT_OPERATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = INTERNAL_DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.ValueObjectImpl <em>Value Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ValueObjectImpl
	 * @see dact.impl.DactPackageImpl#getValueObject()
	 * @generated
	 */
	int VALUE_OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__NAME = INTERNAL_DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__CONTEXT = INTERNAL_DOMAIN_OBJECT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__OWNED_PROPERTIES = INTERNAL_DOMAIN_OBJECT__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__OWNED_OPERATIONS = INTERNAL_DOMAIN_OBJECT__OWNED_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__SCOPE = INTERNAL_DOMAIN_OBJECT__SCOPE;

	/**
	 * The number of structural features of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_FEATURE_COUNT = INTERNAL_DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT___REPORT__DIAGNOSTICCHAIN_STRING_STRING = INTERNAL_DOMAIN_OBJECT___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT___WARN__DIAGNOSTICCHAIN_STRING_STRING = INTERNAL_DOMAIN_OBJECT___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Unique Operation Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP = INTERNAL_DOMAIN_OBJECT___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Property Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT___UNIQUE_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP = INTERNAL_DOMAIN_OBJECT___UNIQUE_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Single Invariant Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT___SINGLE_INVARIANT_OPERATION__DIAGNOSTICCHAIN_MAP = INTERNAL_DOMAIN_OBJECT___SINGLE_INVARIANT_OPERATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_OPERATION_COUNT = INTERNAL_DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.SharedDomainObjectImpl <em>Shared Domain Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.SharedDomainObjectImpl
	 * @see dact.impl.DactPackageImpl#getSharedDomainObject()
	 * @generated
	 */
	int SHARED_DOMAIN_OBJECT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DOMAIN_OBJECT__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DOMAIN_OBJECT__CONTEXT = DOMAIN_OBJECT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DOMAIN_OBJECT__OWNED_PROPERTIES = DOMAIN_OBJECT__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DOMAIN_OBJECT__OWNED_OPERATIONS = DOMAIN_OBJECT__OWNED_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DOMAIN_OBJECT__SCOPE = DOMAIN_OBJECT__SCOPE;

	/**
	 * The feature id for the '<em><b>Abstracted Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DOMAIN_OBJECT__ABSTRACTED_ROOT = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shared Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DOMAIN_OBJECT_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DOMAIN_OBJECT___REPORT__DIAGNOSTICCHAIN_STRING_STRING = DOMAIN_OBJECT___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DOMAIN_OBJECT___WARN__DIAGNOSTICCHAIN_STRING_STRING = DOMAIN_OBJECT___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Unique Operation Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DOMAIN_OBJECT___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP = DOMAIN_OBJECT___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Property Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DOMAIN_OBJECT___UNIQUE_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP = DOMAIN_OBJECT___UNIQUE_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Single Invariant Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DOMAIN_OBJECT___SINGLE_INVARIANT_OPERATION__DIAGNOSTICCHAIN_MAP = DOMAIN_OBJECT___SINGLE_INVARIANT_OPERATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Shared Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DOMAIN_OBJECT_OPERATION_COUNT = DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.SharedValueObjectImpl <em>Shared Value Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.SharedValueObjectImpl
	 * @see dact.impl.DactPackageImpl#getSharedValueObject()
	 * @generated
	 */
	int SHARED_VALUE_OBJECT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VALUE_OBJECT__NAME = SHARED_DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VALUE_OBJECT__CONTEXT = SHARED_DOMAIN_OBJECT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VALUE_OBJECT__OWNED_PROPERTIES = SHARED_DOMAIN_OBJECT__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VALUE_OBJECT__OWNED_OPERATIONS = SHARED_DOMAIN_OBJECT__OWNED_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VALUE_OBJECT__SCOPE = SHARED_DOMAIN_OBJECT__SCOPE;

	/**
	 * The feature id for the '<em><b>Abstracted Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VALUE_OBJECT__ABSTRACTED_ROOT = SHARED_DOMAIN_OBJECT__ABSTRACTED_ROOT;

	/**
	 * The number of structural features of the '<em>Shared Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VALUE_OBJECT_FEATURE_COUNT = SHARED_DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VALUE_OBJECT___REPORT__DIAGNOSTICCHAIN_STRING_STRING = SHARED_DOMAIN_OBJECT___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VALUE_OBJECT___WARN__DIAGNOSTICCHAIN_STRING_STRING = SHARED_DOMAIN_OBJECT___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Unique Operation Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VALUE_OBJECT___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP = SHARED_DOMAIN_OBJECT___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Property Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VALUE_OBJECT___UNIQUE_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP = SHARED_DOMAIN_OBJECT___UNIQUE_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Single Invariant Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VALUE_OBJECT___SINGLE_INVARIANT_OPERATION__DIAGNOSTICCHAIN_MAP = SHARED_DOMAIN_OBJECT___SINGLE_INVARIANT_OPERATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Shared Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VALUE_OBJECT_OPERATION_COUNT = SHARED_DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.AggregateRootImpl <em>Aggregate Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.AggregateRootImpl
	 * @see dact.impl.DactPackageImpl#getAggregateRoot()
	 * @generated
	 */
	int AGGREGATE_ROOT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ROOT__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ROOT__CONTEXT = ENTITY__CONTEXT;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ROOT__OWNED_PROPERTIES = ENTITY__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ROOT__OWNED_OPERATIONS = ENTITY__OWNED_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ROOT__SCOPE = ENTITY__SCOPE;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ROOT__REPOSITORY = ENTITY__REPOSITORY;

	/**
	 * The number of structural features of the '<em>Aggregate Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ROOT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ROOT___REPORT__DIAGNOSTICCHAIN_STRING_STRING = ENTITY___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ROOT___WARN__DIAGNOSTICCHAIN_STRING_STRING = ENTITY___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Unique Operation Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ROOT___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP = ENTITY___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Property Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ROOT___UNIQUE_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP = ENTITY___UNIQUE_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Single Invariant Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ROOT___SINGLE_INVARIANT_OPERATION__DIAGNOSTICCHAIN_MAP = ENTITY___SINGLE_INVARIANT_OPERATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Aggregate Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ROOT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.InterfaceImpl
	 * @see dact.impl.DactPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = DOMAIN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONTEXT = DOMAIN_ELEMENT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OWNED_OPERATIONS = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___REPORT__DIAGNOSTICCHAIN_STRING_STRING = DOMAIN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___WARN__DIAGNOSTICCHAIN_STRING_STRING = DOMAIN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unique Operation Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = DOMAIN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link dact.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.RepositoryImpl
	 * @see dact.impl.DactPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTEXT = INTERFACE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__OWNED_OPERATIONS = INTERFACE__OWNED_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ENTITY = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___REPORT__DIAGNOSTICCHAIN_STRING_STRING = INTERFACE___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___WARN__DIAGNOSTICCHAIN_STRING_STRING = INTERFACE___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Unique Operation Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP = INTERFACE___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ServiceImpl
	 * @see dact.impl.DactPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CONTEXT = INTERFACE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OWNED_OPERATIONS = INTERFACE__OWNED_OPERATIONS;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___REPORT__DIAGNOSTICCHAIN_STRING_STRING = INTERFACE___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___WARN__DIAGNOSTICCHAIN_STRING_STRING = INTERFACE___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Unique Operation Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP = INTERFACE___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.DefinesIdentityObjectImpl <em>Defines Identity Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.DefinesIdentityObjectImpl
	 * @see dact.impl.DactPackageImpl#getDefinesIdentityObject()
	 * @generated
	 */
	int DEFINES_IDENTITY_OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Defines Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINES_IDENTITY_OBJECT__DEFINES_IDENTITY = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Defines Identity Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINES_IDENTITY_OBJECT_FEATURE_COUNT = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINES_IDENTITY_OBJECT___REPORT__DIAGNOSTICCHAIN_STRING_STRING = DIAGNOSTIC_SUPPORTED___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINES_IDENTITY_OBJECT___WARN__DIAGNOSTICCHAIN_STRING_STRING = DIAGNOSTIC_SUPPORTED___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Single Valued Primitive Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINES_IDENTITY_OBJECT___SINGLE_VALUED_PRIMITIVE_PROPERTY__DIAGNOSTICCHAIN_MAP = DIAGNOSTIC_SUPPORTED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Defines Identity Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINES_IDENTITY_OBJECT_OPERATION_COUNT = DIAGNOSTIC_SUPPORTED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dact.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.PropertyImpl
	 * @see dact.impl.DactPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 17;

	/**
	 * The feature id for the '<em><b>Defines Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEFINES_IDENTITY = DEFINES_IDENTITY_OBJECT__DEFINES_IDENTITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = DEFINES_IDENTITY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEFAULT = DEFINES_IDENTITY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = DEFINES_IDENTITY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER_BOUND = DEFINES_IDENTITY_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER_BOUND = DEFINES_IDENTITY_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_COMPOSITE = DEFINES_IDENTITY_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Domain Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DOMAIN_OBJECT = DEFINES_IDENTITY_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = DEFINES_IDENTITY_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___REPORT__DIAGNOSTICCHAIN_STRING_STRING = DEFINES_IDENTITY_OBJECT___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___WARN__DIAGNOSTICCHAIN_STRING_STRING = DEFINES_IDENTITY_OBJECT___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Single Valued Primitive Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SINGLE_VALUED_PRIMITIVE_PROPERTY__DIAGNOSTICCHAIN_MAP = DEFINES_IDENTITY_OBJECT___SINGLE_VALUED_PRIMITIVE_PROPERTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Default For Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP = DEFINES_IDENTITY_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Single</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_SINGLE = DEFINES_IDENTITY_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_COLLECTION = DEFINES_IDENTITY_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Mandatory Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___MANDATORY_TYPE__DIAGNOSTICCHAIN_MAP = DEFINES_IDENTITY_OBJECT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Composite Requires Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___COMPOSITE_REQUIRES_ENTITY__DIAGNOSTICCHAIN_MAP = DEFINES_IDENTITY_OBJECT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Aggregate Is Not Composed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___AGGREGATE_IS_NOT_COMPOSED__DIAGNOSTICCHAIN_MAP = DEFINES_IDENTITY_OBJECT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Primitive Property Requires Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___PRIMITIVE_PROPERTY_REQUIRES_NAME__DIAGNOSTICCHAIN_MAP = DEFINES_IDENTITY_OBJECT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Shared Object Type Restriction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SHARED_OBJECT_TYPE_RESTRICTION__DIAGNOSTICCHAIN_MAP = DEFINES_IDENTITY_OBJECT_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = DEFINES_IDENTITY_OBJECT_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link dact.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.OperationImpl
	 * @see dact.impl.DactPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Defines Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DEFINES_IDENTITY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Expose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TO_EXPOSE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BEHAVIOR = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INTERFACE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Domain Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DOMAIN_OBJECT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___REPORT__DIAGNOSTICCHAIN_STRING_STRING = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___WARN__DIAGNOSTICCHAIN_STRING_STRING = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Single Valued Primitive Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___SINGLE_VALUED_PRIMITIVE_PROPERTY__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Matched Domain Operation Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___MATCHED_DOMAIN_OPERATION_TYPE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Matched Repository Operation Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___MATCHED_REPOSITORY_OPERATION_TYPE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Matched Service Operation Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___MATCHED_SERVICE_OPERATION_TYPE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>No Behavior Specification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___NO_BEHAVIOR_SPECIFICATION__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Constructor Matches Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___CONSTRUCTOR_MATCHES_PROPERTIES__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link dact.impl.SpecOperationImpl <em>Spec Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.SpecOperationImpl
	 * @see dact.impl.DactPackageImpl#getSpecOperation()
	 * @generated
	 */
	int SPEC_OPERATION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Defines Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION__DEFINES_IDENTITY = OPERATION__DEFINES_IDENTITY;

	/**
	 * The feature id for the '<em><b>To Expose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION__TO_EXPOSE = OPERATION__TO_EXPOSE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION__TYPE = OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION__BEHAVIOR = OPERATION__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION__OWNED_PARAMETERS = OPERATION__OWNED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION__INTERFACE = OPERATION__INTERFACE;

	/**
	 * The feature id for the '<em><b>Domain Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION__DOMAIN_OBJECT = OPERATION__DOMAIN_OBJECT;

	/**
	 * The feature id for the '<em><b>Is Invariant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION__IS_INVARIANT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION__OWNED_RULES = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spec Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION___REPORT__DIAGNOSTICCHAIN_STRING_STRING = OPERATION___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION___WARN__DIAGNOSTICCHAIN_STRING_STRING = OPERATION___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Single Valued Primitive Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION___SINGLE_VALUED_PRIMITIVE_PROPERTY__DIAGNOSTICCHAIN_MAP = OPERATION___SINGLE_VALUED_PRIMITIVE_PROPERTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Matched Domain Operation Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION___MATCHED_DOMAIN_OPERATION_TYPE__DIAGNOSTICCHAIN_MAP = OPERATION___MATCHED_DOMAIN_OPERATION_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Matched Repository Operation Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION___MATCHED_REPOSITORY_OPERATION_TYPE__DIAGNOSTICCHAIN_MAP = OPERATION___MATCHED_REPOSITORY_OPERATION_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Matched Service Operation Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION___MATCHED_SERVICE_OPERATION_TYPE__DIAGNOSTICCHAIN_MAP = OPERATION___MATCHED_SERVICE_OPERATION_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Behavior Specification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION___NO_BEHAVIOR_SPECIFICATION__DIAGNOSTICCHAIN_MAP = OPERATION___NO_BEHAVIOR_SPECIFICATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Constructor Matches Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION___CONSTRUCTOR_MATCHES_PROPERTIES__DIAGNOSTICCHAIN_MAP = OPERATION___CONSTRUCTOR_MATCHES_PROPERTIES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Behavior Xor Specification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION___BEHAVIOR_XOR_SPECIFICATION__DIAGNOSTICCHAIN_MAP = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Owned By Domain Object Only</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION___OWNED_BY_DOMAIN_OBJECT_ONLY__DIAGNOSTICCHAIN_MAP = OPERATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unique Rule Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION___UNIQUE_RULE_NAMES__DIAGNOSTICCHAIN_MAP = OPERATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Single Bool Out Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION___SINGLE_BOOL_OUT_PARAMETER__DIAGNOSTICCHAIN_MAP = OPERATION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Spec Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link dact.impl.SpecRuleImpl <em>Spec Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.SpecRuleImpl
	 * @see dact.impl.DactPackageImpl#getSpecRule()
	 * @generated
	 */
	int SPEC_RULE = 20;

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
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RULE__OPERATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Spec Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Spec Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RULE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.DataTypeImpl
	 * @see dact.impl.DactPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.PrimitiveTypeImpl
	 * @see dact.impl.DactPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.StringTypeImpl
	 * @see dact.impl.DactPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.BooleanTypeImpl
	 * @see dact.impl.DactPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.IntegerTypeImpl
	 * @see dact.impl.DactPackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.RealTypeImpl <em>Real Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.RealTypeImpl
	 * @see dact.impl.DactPackageImpl#getRealType()
	 * @generated
	 */
	int REAL_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.EnumerationImpl
	 * @see dact.impl.DactPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CONTEXT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_LITERALS = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.EnumerationLiteralImpl
	 * @see dact.impl.DactPackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ValueSpecificationImpl
	 * @see dact.impl.DactPackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 49;

	/**
	 * The number of structural features of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dact.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.LiteralImpl
	 * @see dact.impl.DactPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 35;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.LiteralNullImpl <em>Literal Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.LiteralNullImpl
	 * @see dact.impl.DactPackageImpl#getLiteralNull()
	 * @generated
	 */
	int LITERAL_NULL = 36;

	/**
	 * The number of structural features of the '<em>Literal Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.LiteralStringImpl <em>Literal String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.LiteralStringImpl
	 * @see dact.impl.DactPackageImpl#getLiteralString()
	 * @generated
	 */
	int LITERAL_STRING = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__LENGTH = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Literal String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___CONTAINS__STRING = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dact.impl.LiteralIntegerImpl <em>Literal Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.LiteralIntegerImpl
	 * @see dact.impl.DactPackageImpl#getLiteralInteger()
	 * @generated
	 */
	int LITERAL_INTEGER = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.LiteralBooleanImpl <em>Literal Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.LiteralBooleanImpl
	 * @see dact.impl.DactPackageImpl#getLiteralBoolean()
	 * @generated
	 */
	int LITERAL_BOOLEAN = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.LiteralRealImpl <em>Literal Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.LiteralRealImpl
	 * @see dact.impl.DactPackageImpl#getLiteralReal()
	 * @generated
	 */
	int LITERAL_REAL = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.DomainEventImpl <em>Domain Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.DomainEventImpl
	 * @see dact.impl.DactPackageImpl#getDomainEvent()
	 * @generated
	 */
	int DOMAIN_EVENT = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__CONTEXT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__OWNED_PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__OWNED_OPERATIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__SCOPE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstracted Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__ABSTRACTED_ROOT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Domain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT___REPORT__DIAGNOSTICCHAIN_STRING_STRING = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT___WARN__DIAGNOSTICCHAIN_STRING_STRING = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unique Operation Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Unique Property Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT___UNIQUE_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Single Invariant Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT___SINGLE_INVARIANT_OPERATION__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Domain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link dact.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ActivityImpl
	 * @see dact.impl.DactPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
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
	 * The feature id for the '<em><b>Owned Domain Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_DOMAIN_NODES = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Processed Domain Node Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PROCESSED_DOMAIN_NODE_MAPPINGS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___REPORT__DIAGNOSTICCHAIN_STRING_STRING = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___WARN__DIAGNOSTICCHAIN_STRING_STRING = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Mappings Only With Specification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___MAPPINGS_ONLY_WITH_SPECIFICATION__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Matched Parameter Mappings Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___MATCHED_PARAMETER_MAPPINGS_COUNT__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Each Parameter Is Mapped</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___EACH_PARAMETER_IS_MAPPED__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link dact.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ScopeImpl
	 * @see dact.impl.DactPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__CHILDREN = 2;

	/**
	 * The feature id for the '<em><b>Inherited Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__INHERITED_VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Owned Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__OWNED_VARIABLES = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__GROUP = 5;

	/**
	 * The feature id for the '<em><b>Domain Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__DOMAIN_OBJECT = 6;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dact.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.IdentifierImpl
	 * @see dact.impl.DactPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__INDEX = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.ActivityGroupImpl <em>Activity Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ActivityGroupImpl
	 * @see dact.impl.DactPackageImpl#getActivityGroup()
	 * @generated
	 */
	int ACTIVITY_GROUP = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__OWNED_NODES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__OWNED_EDGES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__SCOPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__ACTIVITY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Structured Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Conditional Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__CONDITIONAL_NODE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Activity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP___REPORT__DIAGNOSTICCHAIN_STRING_STRING = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP___WARN__DIAGNOSTICCHAIN_STRING_STRING = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Single Initial Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP___SINGLE_INITIAL_NODE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Single Final Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP___SINGLE_FINAL_NODE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Non Empty Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP___NON_EMPTY_GROUP__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Activity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link dact.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.VariableImpl
	 * @see dact.impl.DactPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = TRANSFORMATION_ONLY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DEFAULT = TRANSFORMATION_ONLY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = TRANSFORMATION_ONLY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__UPPER_BOUND = TRANSFORMATION_ONLY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__LOWER_BOUND = TRANSFORMATION_ONLY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Accessible Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ACCESSIBLE_SCOPES = TRANSFORMATION_ONLY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SCOPE = TRANSFORMATION_ONLY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = TRANSFORMATION_ONLY_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___REPORT__DIAGNOSTICCHAIN_STRING_STRING = TRANSFORMATION_ONLY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___WARN__DIAGNOSTICCHAIN_STRING_STRING = TRANSFORMATION_ONLY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>No Default For Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP = TRANSFORMATION_ONLY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Single</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___IS_SINGLE = TRANSFORMATION_ONLY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___IS_COLLECTION = TRANSFORMATION_ONLY_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = TRANSFORMATION_ONLY_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link dact.impl.InstanceValueImpl <em>Instance Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.InstanceValueImpl
	 * @see dact.impl.DactPackageImpl#getInstanceValue()
	 * @generated
	 */
	int INSTANCE_VALUE = 47;

	/**
	 * The feature id for the '<em><b>Is Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__IS_INSTANCE_OF = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__OWNED_PROPERTIES = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instance Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.InstancePropertyImpl <em>Instance Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.InstancePropertyImpl
	 * @see dact.impl.DactPackageImpl#getInstanceProperty()
	 * @generated
	 */
	int INSTANCE_PROPERTY = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPERTY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPERTY__IS_INSTANCE_OF = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPERTY__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instance Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPERTY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ActivityNodeImpl
	 * @see dact.impl.DactPackageImpl#getActivityNode()
	 * @generated
	 */
	int ACTIVITY_NODE = 50;

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
	 * The meta object id for the '{@link dact.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ActivityEdgeImpl
	 * @see dact.impl.DactPackageImpl#getActivityEdge()
	 * @generated
	 */
	int ACTIVITY_EDGE = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__NAME = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edge Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__EDGE_NAME = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__SOURCE = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__TARGET = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__GROUP = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_FEATURE_COUNT = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE___REPORT__DIAGNOSTICCHAIN_STRING_STRING = DIAGNOSTIC_SUPPORTED___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE___WARN__DIAGNOSTICCHAIN_STRING_STRING = DIAGNOSTIC_SUPPORTED___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>No Self Loop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE___NO_SELF_LOOP__DIAGNOSTICCHAIN_MAP = DIAGNOSTIC_SUPPORTED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>No Edge Into Initial Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE___NO_EDGE_INTO_INITIAL_NODE__DIAGNOSTICCHAIN_MAP = DIAGNOSTIC_SUPPORTED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>No Edge Out Of Final Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE___NO_EDGE_OUT_OF_FINAL_NODE__DIAGNOSTICCHAIN_MAP = DIAGNOSTIC_SUPPORTED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Endpoints In Same Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE___ENDPOINTS_IN_SAME_GROUP__DIAGNOSTICCHAIN_MAP = DIAGNOSTIC_SUPPORTED_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OPERATION_COUNT = DIAGNOSTIC_SUPPORTED_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link dact.impl.ControlNodeImpl <em>Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ControlNodeImpl
	 * @see dact.impl.DactPackageImpl#getControlNode()
	 * @generated
	 */
	int CONTROL_NODE = 53;

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
	 * The meta object id for the '{@link dact.impl.InitialNodeImpl <em>Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.InitialNodeImpl
	 * @see dact.impl.DactPackageImpl#getInitialNode()
	 * @generated
	 */
	int INITIAL_NODE = 52;

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
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__TNAME = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ExecutableNodeImpl
	 * @see dact.impl.DactPackageImpl#getExecutableNode()
	 * @generated
	 */
	int EXECUTABLE_NODE = 54;

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
	 * The meta object id for the '{@link dact.impl.FinalNodeImpl <em>Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.FinalNodeImpl
	 * @see dact.impl.DactPackageImpl#getFinalNode()
	 * @generated
	 */
	int FINAL_NODE = 55;

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
	 * The meta object id for the '{@link dact.impl.ActivityFinalNodeImpl <em>Activity Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ActivityFinalNodeImpl
	 * @see dact.impl.DactPackageImpl#getActivityFinalNode()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE = 56;

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
	 * The meta object id for the '{@link dact.impl.FlowFinalNodeImpl <em>Flow Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.FlowFinalNodeImpl
	 * @see dact.impl.DactPackageImpl#getFlowFinalNode()
	 * @generated
	 */
	int FLOW_FINAL_NODE = 57;

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
	 * The meta object id for the '{@link dact.impl.StructuredActivityNodeImpl <em>Structured Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.StructuredActivityNodeImpl
	 * @see dact.impl.DactPackageImpl#getStructuredActivityNode()
	 * @generated
	 */
	int STRUCTURED_ACTIVITY_NODE = 58;

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
	 * The meta object id for the '{@link dact.impl.ConditionalNodeImpl <em>Conditional Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ConditionalNodeImpl
	 * @see dact.impl.DactPackageImpl#getConditionalNode()
	 * @generated
	 */
	int CONDITIONAL_NODE = 59;

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
	 * The meta object id for the '{@link dact.impl.LoopNodeImpl <em>Loop Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.LoopNodeImpl
	 * @see dact.impl.DactPackageImpl#getLoopNode()
	 * @generated
	 */
	int LOOP_NODE = 60;

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
	 * The meta object id for the '{@link dact.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.BehaviorImpl
	 * @see dact.impl.DactPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 61;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
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
	 * The meta object id for the '{@link dact.impl.CallOperationActionImpl <em>Call Operation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.CallOperationActionImpl
	 * @see dact.impl.DactPackageImpl#getCallOperationAction()
	 * @generated
	 */
	int CALL_OPERATION_ACTION = 62;

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
	 * The feature id for the '<em><b>To Declare Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__TO_DECLARE_RESULT = EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__OPERATION = EXECUTABLE_NODE_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link dact.impl.VariableDeclarationActionImpl <em>Variable Declaration Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.VariableDeclarationActionImpl
	 * @see dact.impl.DactPackageImpl#getVariableDeclarationAction()
	 * @generated
	 */
	int VARIABLE_DECLARATION_ACTION = 63;

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
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_ACTION__TYPE = EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_ACTION__UPPER_BOUND = EXECUTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_ACTION__LOWER_BOUND = EXECUTABLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_ACTION__DECLARATION = EXECUTABLE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variable Declaration Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_ACTION_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Variable Declaration Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_ACTION_OPERATION_COUNT = EXECUTABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ExpressionImpl
	 * @see dact.impl.DactPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 81;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DEFAULT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__UPPER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LOWER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___REPORT__DIAGNOSTICCHAIN_STRING_STRING = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___WARN__DIAGNOSTICCHAIN_STRING_STRING = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>No Default For Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Single</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___IS_SINGLE = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___IS_COLLECTION = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link dact.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.VariableAssignmentImpl
	 * @see dact.impl.DactPackageImpl#getVariableAssignment()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__DEFAULT = EXPRESSION__DEFAULT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__UPPER_BOUND = EXPRESSION__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__LOWER_BOUND = EXPRESSION__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__IDENTIFIER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__EXPR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT___REPORT__DIAGNOSTICCHAIN_STRING_STRING = EXPRESSION___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT___WARN__DIAGNOSTICCHAIN_STRING_STRING = EXPRESSION___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>No Default For Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP = EXPRESSION___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Single</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT___IS_SINGLE = EXPRESSION___IS_SINGLE;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT___IS_COLLECTION = EXPRESSION___IS_COLLECTION;

	/**
	 * The number of operations of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.RaiseExceptionActionImpl <em>Raise Exception Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.RaiseExceptionActionImpl
	 * @see dact.impl.DactPackageImpl#getRaiseExceptionAction()
	 * @generated
	 */
	int RAISE_EXCEPTION_ACTION = 65;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__DESCRIPTION = EXECUTABLE_NODE_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link dact.impl.RaiseEntityNotFoundExceptionActionImpl <em>Raise Entity Not Found Exception Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.RaiseEntityNotFoundExceptionActionImpl
	 * @see dact.impl.DactPackageImpl#getRaiseEntityNotFoundExceptionAction()
	 * @generated
	 */
	int RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION = 66;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION__DESCRIPTION = RAISE_EXCEPTION_ACTION__DESCRIPTION;

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
	 * The meta object id for the '{@link dact.impl.SignalActionImpl <em>Signal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.SignalActionImpl
	 * @see dact.impl.DactPackageImpl#getSignalAction()
	 * @generated
	 */
	int SIGNAL_ACTION = 78;

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
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ACTION__EVENT = EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ACTION__VARIABLE = EXECUTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ACTION__IDENTIFIER = EXECUTABLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ACTION__VALUE = EXECUTABLE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Signal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ACTION_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ACTION___REPORT__DIAGNOSTICCHAIN_STRING_STRING = EXECUTABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ACTION___WARN__DIAGNOSTICCHAIN_STRING_STRING = EXECUTABLE_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Exclusive Event Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ACTION___EXCLUSIVE_EVENT_SOURCE__DIAGNOSTICCHAIN_MAP = EXECUTABLE_NODE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Signal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ACTION_OPERATION_COUNT = EXECUTABLE_NODE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link dact.impl.SendSignalActionImpl <em>Send Signal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.SendSignalActionImpl
	 * @see dact.impl.DactPackageImpl#getSendSignalAction()
	 * @generated
	 */
	int SEND_SIGNAL_ACTION = 67;

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
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__EVENT = SIGNAL_ACTION__EVENT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__VARIABLE = SIGNAL_ACTION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__IDENTIFIER = SIGNAL_ACTION__IDENTIFIER;

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
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___REPORT__DIAGNOSTICCHAIN_STRING_STRING = SIGNAL_ACTION___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___WARN__DIAGNOSTICCHAIN_STRING_STRING = SIGNAL_ACTION___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Exclusive Event Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___EXCLUSIVE_EVENT_SOURCE__DIAGNOSTICCHAIN_MAP = SIGNAL_ACTION___EXCLUSIVE_EVENT_SOURCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Send Signal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION_OPERATION_COUNT = SIGNAL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.ReceiveSignalActionImpl <em>Receive Signal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ReceiveSignalActionImpl
	 * @see dact.impl.DactPackageImpl#getReceiveSignalAction()
	 * @generated
	 */
	int RECEIVE_SIGNAL_ACTION = 68;

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
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_SIGNAL_ACTION__EVENT = SIGNAL_ACTION__EVENT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_SIGNAL_ACTION__VARIABLE = SIGNAL_ACTION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_SIGNAL_ACTION__IDENTIFIER = SIGNAL_ACTION__IDENTIFIER;

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
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_SIGNAL_ACTION___REPORT__DIAGNOSTICCHAIN_STRING_STRING = SIGNAL_ACTION___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_SIGNAL_ACTION___WARN__DIAGNOSTICCHAIN_STRING_STRING = SIGNAL_ACTION___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Exclusive Event Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_SIGNAL_ACTION___EXCLUSIVE_EVENT_SOURCE__DIAGNOSTICCHAIN_MAP = SIGNAL_ACTION___EXCLUSIVE_EVENT_SOURCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Receive Signal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_SIGNAL_ACTION_OPERATION_COUNT = SIGNAL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.VariableAssignmentActionImpl <em>Variable Assignment Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.VariableAssignmentActionImpl
	 * @see dact.impl.DactPackageImpl#getVariableAssignmentAction()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT_ACTION = 69;

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
	 * The meta object id for the '{@link dact.impl.ParallelNodeImpl <em>Parallel Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ParallelNodeImpl
	 * @see dact.impl.DactPackageImpl#getParallelNode()
	 * @generated
	 */
	int PARALLEL_NODE = 70;

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
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__FLOWS = CONTROL_NODE_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link dact.impl.ParallelFlowImpl <em>Parallel Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ParallelFlowImpl
	 * @see dact.impl.DactPackageImpl#getParallelFlow()
	 * @generated
	 */
	int PARALLEL_FLOW = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW__NAME = ACTIVITY_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW__OWNED_NODES = ACTIVITY_GROUP__OWNED_NODES;

	/**
	 * The feature id for the '<em><b>Owned Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW__OWNED_EDGES = ACTIVITY_GROUP__OWNED_EDGES;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW__SCOPE = ACTIVITY_GROUP__SCOPE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW__ACTIVITY = ACTIVITY_GROUP__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Structured Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW__STRUCTURED_ACTIVITY_NODE = ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Conditional Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW__CONDITIONAL_NODE = ACTIVITY_GROUP__CONDITIONAL_NODE;

	/**
	 * The feature id for the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW__IS_PRIMARY = ACTIVITY_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parallel Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW__PARALLEL_NODE = ACTIVITY_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parallel Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_FEATURE_COUNT = ACTIVITY_GROUP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW___REPORT__DIAGNOSTICCHAIN_STRING_STRING = ACTIVITY_GROUP___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW___WARN__DIAGNOSTICCHAIN_STRING_STRING = ACTIVITY_GROUP___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Single Initial Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW___SINGLE_INITIAL_NODE__DIAGNOSTICCHAIN_MAP = ACTIVITY_GROUP___SINGLE_INITIAL_NODE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Single Final Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW___SINGLE_FINAL_NODE__DIAGNOSTICCHAIN_MAP = ACTIVITY_GROUP___SINGLE_FINAL_NODE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Non Empty Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW___NON_EMPTY_GROUP__DIAGNOSTICCHAIN_MAP = ACTIVITY_GROUP___NON_EMPTY_GROUP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Parallel Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_OPERATION_COUNT = ACTIVITY_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.DomainNodeImpl <em>Domain Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.DomainNodeImpl
	 * @see dact.impl.DactPackageImpl#getDomainNode()
	 * @generated
	 */
	int DOMAIN_NODE = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE__NAME = EXECUTABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE__SEDGE = EXECUTABLE_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE__TEDGE = EXECUTABLE_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE__GROUP = EXECUTABLE_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE__AGGREGATE = EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE__RESULT = EXECUTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE__ENTITY = EXECUTABLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Main Expr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE__MAIN_EXPR = EXECUTABLE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property Chain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE__PROPERTY_CHAIN = EXECUTABLE_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Domain Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE___REPORT__DIAGNOSTICCHAIN_STRING_STRING = EXECUTABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE___WARN__DIAGNOSTICCHAIN_STRING_STRING = EXECUTABLE_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Requires Main Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE___REQUIRES_MAIN_EXPRESSION__DIAGNOSTICCHAIN_MAP = EXECUTABLE_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Self Anchored Binary Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE___SELF_ANCHORED_BINARY_EXPRESSION__DIAGNOSTICCHAIN_MAP = EXECUTABLE_NODE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Domain Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_NODE_OPERATION_COUNT = EXECUTABLE_NODE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link dact.impl.DomainFindActionImpl <em>Domain Find Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.DomainFindActionImpl
	 * @see dact.impl.DactPackageImpl#getDomainFindAction()
	 * @generated
	 */
	int DOMAIN_FIND_ACTION = 74;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FIND_ACTION__NAME = DOMAIN_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FIND_ACTION__SEDGE = DOMAIN_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FIND_ACTION__TEDGE = DOMAIN_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FIND_ACTION__GROUP = DOMAIN_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FIND_ACTION__AGGREGATE = DOMAIN_NODE__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FIND_ACTION__RESULT = DOMAIN_NODE__RESULT;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FIND_ACTION__ENTITY = DOMAIN_NODE__ENTITY;

	/**
	 * The feature id for the '<em><b>Main Expr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FIND_ACTION__MAIN_EXPR = DOMAIN_NODE__MAIN_EXPR;

	/**
	 * The feature id for the '<em><b>Property Chain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FIND_ACTION__PROPERTY_CHAIN = DOMAIN_NODE__PROPERTY_CHAIN;

	/**
	 * The number of structural features of the '<em>Domain Find Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FIND_ACTION_FEATURE_COUNT = DOMAIN_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FIND_ACTION___REPORT__DIAGNOSTICCHAIN_STRING_STRING = DOMAIN_NODE___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FIND_ACTION___WARN__DIAGNOSTICCHAIN_STRING_STRING = DOMAIN_NODE___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Requires Main Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FIND_ACTION___REQUIRES_MAIN_EXPRESSION__DIAGNOSTICCHAIN_MAP = DOMAIN_NODE___REQUIRES_MAIN_EXPRESSION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Self Anchored Binary Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FIND_ACTION___SELF_ANCHORED_BINARY_EXPRESSION__DIAGNOSTICCHAIN_MAP = DOMAIN_NODE___SELF_ANCHORED_BINARY_EXPRESSION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Domain Find Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FIND_ACTION_OPERATION_COUNT = DOMAIN_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.DomainExistActionImpl <em>Domain Exist Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.DomainExistActionImpl
	 * @see dact.impl.DactPackageImpl#getDomainExistAction()
	 * @generated
	 */
	int DOMAIN_EXIST_ACTION = 73;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXIST_ACTION__NAME = DOMAIN_FIND_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXIST_ACTION__SEDGE = DOMAIN_FIND_ACTION__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXIST_ACTION__TEDGE = DOMAIN_FIND_ACTION__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXIST_ACTION__GROUP = DOMAIN_FIND_ACTION__GROUP;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXIST_ACTION__AGGREGATE = DOMAIN_FIND_ACTION__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXIST_ACTION__RESULT = DOMAIN_FIND_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXIST_ACTION__ENTITY = DOMAIN_FIND_ACTION__ENTITY;

	/**
	 * The feature id for the '<em><b>Main Expr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXIST_ACTION__MAIN_EXPR = DOMAIN_FIND_ACTION__MAIN_EXPR;

	/**
	 * The feature id for the '<em><b>Property Chain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXIST_ACTION__PROPERTY_CHAIN = DOMAIN_FIND_ACTION__PROPERTY_CHAIN;

	/**
	 * The number of structural features of the '<em>Domain Exist Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXIST_ACTION_FEATURE_COUNT = DOMAIN_FIND_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXIST_ACTION___REPORT__DIAGNOSTICCHAIN_STRING_STRING = DOMAIN_FIND_ACTION___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXIST_ACTION___WARN__DIAGNOSTICCHAIN_STRING_STRING = DOMAIN_FIND_ACTION___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Requires Main Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXIST_ACTION___REQUIRES_MAIN_EXPRESSION__DIAGNOSTICCHAIN_MAP = DOMAIN_FIND_ACTION___REQUIRES_MAIN_EXPRESSION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Self Anchored Binary Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXIST_ACTION___SELF_ANCHORED_BINARY_EXPRESSION__DIAGNOSTICCHAIN_MAP = DOMAIN_FIND_ACTION___SELF_ANCHORED_BINARY_EXPRESSION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Domain Exist Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXIST_ACTION_OPERATION_COUNT = DOMAIN_FIND_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.DomainCreateActionImpl <em>Domain Create Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.DomainCreateActionImpl
	 * @see dact.impl.DactPackageImpl#getDomainCreateAction()
	 * @generated
	 */
	int DOMAIN_CREATE_ACTION = 75;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CREATE_ACTION__NAME = DOMAIN_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CREATE_ACTION__SEDGE = DOMAIN_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CREATE_ACTION__TEDGE = DOMAIN_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CREATE_ACTION__GROUP = DOMAIN_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CREATE_ACTION__AGGREGATE = DOMAIN_NODE__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CREATE_ACTION__RESULT = DOMAIN_NODE__RESULT;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CREATE_ACTION__ENTITY = DOMAIN_NODE__ENTITY;

	/**
	 * The feature id for the '<em><b>Main Expr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CREATE_ACTION__MAIN_EXPR = DOMAIN_NODE__MAIN_EXPR;

	/**
	 * The feature id for the '<em><b>Property Chain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CREATE_ACTION__PROPERTY_CHAIN = DOMAIN_NODE__PROPERTY_CHAIN;

	/**
	 * The number of structural features of the '<em>Domain Create Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CREATE_ACTION_FEATURE_COUNT = DOMAIN_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CREATE_ACTION___REPORT__DIAGNOSTICCHAIN_STRING_STRING = DOMAIN_NODE___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CREATE_ACTION___WARN__DIAGNOSTICCHAIN_STRING_STRING = DOMAIN_NODE___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Requires Main Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CREATE_ACTION___REQUIRES_MAIN_EXPRESSION__DIAGNOSTICCHAIN_MAP = DOMAIN_NODE___REQUIRES_MAIN_EXPRESSION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Self Anchored Binary Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CREATE_ACTION___SELF_ANCHORED_BINARY_EXPRESSION__DIAGNOSTICCHAIN_MAP = DOMAIN_NODE___SELF_ANCHORED_BINARY_EXPRESSION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Domain Create Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CREATE_ACTION_OPERATION_COUNT = DOMAIN_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.DomainUpdateActionImpl <em>Domain Update Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.DomainUpdateActionImpl
	 * @see dact.impl.DactPackageImpl#getDomainUpdateAction()
	 * @generated
	 */
	int DOMAIN_UPDATE_ACTION = 76;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_UPDATE_ACTION__NAME = DOMAIN_CREATE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_UPDATE_ACTION__SEDGE = DOMAIN_CREATE_ACTION__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_UPDATE_ACTION__TEDGE = DOMAIN_CREATE_ACTION__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_UPDATE_ACTION__GROUP = DOMAIN_CREATE_ACTION__GROUP;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_UPDATE_ACTION__AGGREGATE = DOMAIN_CREATE_ACTION__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_UPDATE_ACTION__RESULT = DOMAIN_CREATE_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_UPDATE_ACTION__ENTITY = DOMAIN_CREATE_ACTION__ENTITY;

	/**
	 * The feature id for the '<em><b>Main Expr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_UPDATE_ACTION__MAIN_EXPR = DOMAIN_CREATE_ACTION__MAIN_EXPR;

	/**
	 * The feature id for the '<em><b>Property Chain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_UPDATE_ACTION__PROPERTY_CHAIN = DOMAIN_CREATE_ACTION__PROPERTY_CHAIN;

	/**
	 * The number of structural features of the '<em>Domain Update Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_UPDATE_ACTION_FEATURE_COUNT = DOMAIN_CREATE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_UPDATE_ACTION___REPORT__DIAGNOSTICCHAIN_STRING_STRING = DOMAIN_CREATE_ACTION___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_UPDATE_ACTION___WARN__DIAGNOSTICCHAIN_STRING_STRING = DOMAIN_CREATE_ACTION___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Requires Main Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_UPDATE_ACTION___REQUIRES_MAIN_EXPRESSION__DIAGNOSTICCHAIN_MAP = DOMAIN_CREATE_ACTION___REQUIRES_MAIN_EXPRESSION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Self Anchored Binary Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_UPDATE_ACTION___SELF_ANCHORED_BINARY_EXPRESSION__DIAGNOSTICCHAIN_MAP = DOMAIN_CREATE_ACTION___SELF_ANCHORED_BINARY_EXPRESSION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Domain Update Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_UPDATE_ACTION_OPERATION_COUNT = DOMAIN_CREATE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.DomainDeleteActionImpl <em>Domain Delete Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.DomainDeleteActionImpl
	 * @see dact.impl.DactPackageImpl#getDomainDeleteAction()
	 * @generated
	 */
	int DOMAIN_DELETE_ACTION = 77;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DELETE_ACTION__NAME = DOMAIN_NODE__NAME;

	/**
	 * The feature id for the '<em><b>SEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DELETE_ACTION__SEDGE = DOMAIN_NODE__SEDGE;

	/**
	 * The feature id for the '<em><b>TEdge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DELETE_ACTION__TEDGE = DOMAIN_NODE__TEDGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DELETE_ACTION__GROUP = DOMAIN_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DELETE_ACTION__AGGREGATE = DOMAIN_NODE__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DELETE_ACTION__RESULT = DOMAIN_NODE__RESULT;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DELETE_ACTION__ENTITY = DOMAIN_NODE__ENTITY;

	/**
	 * The feature id for the '<em><b>Main Expr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DELETE_ACTION__MAIN_EXPR = DOMAIN_NODE__MAIN_EXPR;

	/**
	 * The feature id for the '<em><b>Property Chain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DELETE_ACTION__PROPERTY_CHAIN = DOMAIN_NODE__PROPERTY_CHAIN;

	/**
	 * The number of structural features of the '<em>Domain Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DELETE_ACTION_FEATURE_COUNT = DOMAIN_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DELETE_ACTION___REPORT__DIAGNOSTICCHAIN_STRING_STRING = DOMAIN_NODE___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DELETE_ACTION___WARN__DIAGNOSTICCHAIN_STRING_STRING = DOMAIN_NODE___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Requires Main Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DELETE_ACTION___REQUIRES_MAIN_EXPRESSION__DIAGNOSTICCHAIN_MAP = DOMAIN_NODE___REQUIRES_MAIN_EXPRESSION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Self Anchored Binary Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DELETE_ACTION___SELF_ANCHORED_BINARY_EXPRESSION__DIAGNOSTICCHAIN_MAP = DOMAIN_NODE___SELF_ANCHORED_BINARY_EXPRESSION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Domain Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DELETE_ACTION_OPERATION_COUNT = DOMAIN_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ParameterImpl
	 * @see dact.impl.DactPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 79;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = TYPED_MULTIPLICITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT = TYPED_MULTIPLICITY_ELEMENT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = TYPED_MULTIPLICITY_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UPPER_BOUND = TYPED_MULTIPLICITY_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LOWER_BOUND = TYPED_MULTIPLICITY_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DIRECTION = TYPED_MULTIPLICITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ROLE = TYPED_MULTIPLICITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPERATION = TYPED_MULTIPLICITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ACTIVITY = TYPED_MULTIPLICITY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TYPED_MULTIPLICITY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___REPORT__DIAGNOSTICCHAIN_STRING_STRING = TYPED_MULTIPLICITY_ELEMENT___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___WARN__DIAGNOSTICCHAIN_STRING_STRING = TYPED_MULTIPLICITY_ELEMENT___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>No Default For Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP = TYPED_MULTIPLICITY_ELEMENT___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Single</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_SINGLE = TYPED_MULTIPLICITY_ELEMENT___IS_SINGLE;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_COLLECTION = TYPED_MULTIPLICITY_ELEMENT___IS_COLLECTION;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = TYPED_MULTIPLICITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.ParameterMappingImpl <em>Parameter Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.ParameterMappingImpl
	 * @see dact.impl.DactPackageImpl#getParameterMapping()
	 * @generated
	 */
	int PARAMETER_MAPPING = 80;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__TYPE = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__OPERATION_PARAMETER = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__IDENTIFIER = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__VARIABLE = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Activity Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__ACTIVITY_PARAMETER = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__VALUE = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__ACTION = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__ACTIVITY = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Parameter Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING_FEATURE_COUNT = DIAGNOSTIC_SUPPORTED_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING___REPORT__DIAGNOSTICCHAIN_STRING_STRING = DIAGNOSTIC_SUPPORTED___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING___WARN__DIAGNOSTICCHAIN_STRING_STRING = DIAGNOSTIC_SUPPORTED___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Conforming Activity Operation Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING___CONFORMING_ACTIVITY_OPERATION_PARAMETER__DIAGNOSTICCHAIN_MAP = DIAGNOSTIC_SUPPORTED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Exclusive Mapping Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING___EXCLUSIVE_MAPPING_SOURCE__DIAGNOSTICCHAIN_MAP = DIAGNOSTIC_SUPPORTED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Value Only In Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING___VALUE_ONLY_IN_ACTION__DIAGNOSTICCHAIN_MAP = DIAGNOSTIC_SUPPORTED_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING_OPERATION_COUNT = DIAGNOSTIC_SUPPORTED_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link dact.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.UnaryExpressionImpl
	 * @see dact.impl.DactPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 82;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__DEFAULT = EXPRESSION__DEFAULT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__UPPER_BOUND = EXPRESSION__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__LOWER_BOUND = EXPRESSION__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Enum Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__ENUM_VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__IDENTIFIER = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION___REPORT__DIAGNOSTICCHAIN_STRING_STRING = EXPRESSION___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION___WARN__DIAGNOSTICCHAIN_STRING_STRING = EXPRESSION___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>No Default For Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP = EXPRESSION___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Single</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION___IS_SINGLE = EXPRESSION___IS_SINGLE;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION___IS_COLLECTION = EXPRESSION___IS_COLLECTION;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.BinaryExpressionImpl
	 * @see dact.impl.DactPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 83;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__DEFAULT = EXPRESSION__DEFAULT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__UPPER_BOUND = EXPRESSION__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LOWER_BOUND = EXPRESSION__LOWER_BOUND;

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
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION___REPORT__DIAGNOSTICCHAIN_STRING_STRING = EXPRESSION___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION___WARN__DIAGNOSTICCHAIN_STRING_STRING = EXPRESSION___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>No Default For Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP = EXPRESSION___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Single</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION___IS_SINGLE = EXPRESSION___IS_SINGLE;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION___IS_COLLECTION = EXPRESSION___IS_COLLECTION;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.NotExpressionImpl <em>Not Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.NotExpressionImpl
	 * @see dact.impl.DactPackageImpl#getNotExpression()
	 * @generated
	 */
	int NOT_EXPRESSION = 84;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__DEFAULT = EXPRESSION__DEFAULT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__UPPER_BOUND = EXPRESSION__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__LOWER_BOUND = EXPRESSION__LOWER_BOUND;

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
	 * The operation id for the '<em>Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION___REPORT__DIAGNOSTICCHAIN_STRING_STRING = EXPRESSION___REPORT__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>Warn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION___WARN__DIAGNOSTICCHAIN_STRING_STRING = EXPRESSION___WARN__DIAGNOSTICCHAIN_STRING_STRING;

	/**
	 * The operation id for the '<em>No Default For Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP = EXPRESSION___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Single</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION___IS_SINGLE = EXPRESSION___IS_SINGLE;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION___IS_COLLECTION = EXPRESSION___IS_COLLECTION;

	/**
	 * The number of operations of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.OperatorImpl
	 * @see dact.impl.DactPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 85;

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
	 * The meta object id for the '{@link dact.impl.IntegerOperatorImpl <em>Integer Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.IntegerOperatorImpl
	 * @see dact.impl.DactPackageImpl#getIntegerOperator()
	 * @generated
	 */
	int INTEGER_OPERATOR = 86;

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
	 * The meta object id for the '{@link dact.impl.DivideImpl <em>Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.DivideImpl
	 * @see dact.impl.DactPackageImpl#getDivide()
	 * @generated
	 */
	int DIVIDE = 87;

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
	 * The meta object id for the '{@link dact.impl.TimesImpl <em>Times</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.TimesImpl
	 * @see dact.impl.DactPackageImpl#getTimes()
	 * @generated
	 */
	int TIMES = 88;

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
	 * The meta object id for the '{@link dact.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.PlusImpl
	 * @see dact.impl.DactPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 89;

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
	 * The meta object id for the '{@link dact.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.MinusImpl
	 * @see dact.impl.DactPackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 90;

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
	 * The meta object id for the '{@link dact.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.LogicalOperatorImpl
	 * @see dact.impl.DactPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 91;

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
	 * The meta object id for the '{@link dact.impl.GtImpl <em>Gt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.GtImpl
	 * @see dact.impl.DactPackageImpl#getGt()
	 * @generated
	 */
	int GT = 92;

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
	 * The meta object id for the '{@link dact.impl.LtImpl <em>Lt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.LtImpl
	 * @see dact.impl.DactPackageImpl#getLt()
	 * @generated
	 */
	int LT = 93;

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
	 * The meta object id for the '{@link dact.impl.GeImpl <em>Ge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.GeImpl
	 * @see dact.impl.DactPackageImpl#getGe()
	 * @generated
	 */
	int GE = 94;

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
	 * The meta object id for the '{@link dact.impl.LeImpl <em>Le</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.LeImpl
	 * @see dact.impl.DactPackageImpl#getLe()
	 * @generated
	 */
	int LE = 95;

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
	 * The meta object id for the '{@link dact.impl.EqImpl <em>Eq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.EqImpl
	 * @see dact.impl.DactPackageImpl#getEq()
	 * @generated
	 */
	int EQ = 96;

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
	 * The meta object id for the '{@link dact.impl.NeImpl <em>Ne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.NeImpl
	 * @see dact.impl.DactPackageImpl#getNe()
	 * @generated
	 */
	int NE = 97;

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
	 * The meta object id for the '{@link dact.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.AndImpl
	 * @see dact.impl.DactPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 98;

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
	 * The meta object id for the '{@link dact.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.OrImpl
	 * @see dact.impl.DactPackageImpl#getOr()
	 * @generated
	 */
	int OR = 99;

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
	 * The meta object id for the '{@link dact.impl.InImpl <em>In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.impl.InImpl
	 * @see dact.impl.DactPackageImpl#getIn()
	 * @generated
	 */
	int IN = 100;

	/**
	 * The number of structural features of the '<em>In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dact.OperationType <em>Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.OperationType
	 * @see dact.impl.DactPackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 101;

	/**
	 * The meta object id for the '{@link dact.ParameterDirection <em>Parameter Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.ParameterDirection
	 * @see dact.impl.DactPackageImpl#getParameterDirection()
	 * @generated
	 */
	int PARAMETER_DIRECTION = 102;

	/**
	 * The meta object id for the '{@link dact.ParameterRole <em>Parameter Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.ParameterRole
	 * @see dact.impl.DactPackageImpl#getParameterRole()
	 * @generated
	 */
	int PARAMETER_ROLE = 103;

	/**
	 * The meta object id for the '{@link dact.ParameterMappingType <em>Parameter Mapping Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dact.ParameterMappingType
	 * @see dact.impl.DactPackageImpl#getParameterMappingType()
	 * @generated
	 */
	int PARAMETER_MAPPING_TYPE = 104;


	/**
	 * Returns the meta object for class '{@link dact.TransformationOnly <em>Transformation Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Only</em>'.
	 * @see dact.TransformationOnly
	 * @generated
	 */
	EClass getTransformationOnly();

	/**
	 * Returns the meta object for class '{@link dact.DiagnosticSupported <em>Diagnostic Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagnostic Supported</em>'.
	 * @see dact.DiagnosticSupported
	 * @generated
	 */
	EClass getDiagnosticSupported();

	/**
	 * Returns the meta object for the '{@link dact.DiagnosticSupported#report(org.eclipse.emf.common.util.DiagnosticChain, java.lang.String, java.lang.String) <em>Report</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Report</em>' operation.
	 * @see dact.DiagnosticSupported#report(org.eclipse.emf.common.util.DiagnosticChain, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDiagnosticSupported__Report__DiagnosticChain_String_String();

	/**
	 * Returns the meta object for the '{@link dact.DiagnosticSupported#warn(org.eclipse.emf.common.util.DiagnosticChain, java.lang.String, java.lang.String) <em>Warn</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Warn</em>' operation.
	 * @see dact.DiagnosticSupported#warn(org.eclipse.emf.common.util.DiagnosticChain, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDiagnosticSupported__Warn__DiagnosticChain_String_String();

	/**
	 * Returns the meta object for class '{@link dact.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see dact.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference '{@link dact.Root#getDdd <em>Ddd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ddd</em>'.
	 * @see dact.Root#getDdd()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Ddd();

	/**
	 * Returns the meta object for the containment reference '{@link dact.Root#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see dact.Root#getActivity()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.Root#getPrimitivesTypes <em>Primitives Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitives Types</em>'.
	 * @see dact.Root#getPrimitivesTypes()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_PrimitivesTypes();

	/**
	 * Returns the meta object for the '{@link dact.Root#UniquePrimitiveType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Primitive Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Primitive Type</em>' operation.
	 * @see dact.Root#UniquePrimitiveType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRoot__UniquePrimitiveType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dact.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see dact.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link dact.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dact.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link dact.TypedMultiplicityElement <em>Typed Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Multiplicity Element</em>'.
	 * @see dact.TypedMultiplicityElement
	 * @generated
	 */
	EClass getTypedMultiplicityElement();

	/**
	 * Returns the meta object for the containment reference '{@link dact.TypedMultiplicityElement#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see dact.TypedMultiplicityElement#getDefault()
	 * @see #getTypedMultiplicityElement()
	 * @generated
	 */
	EReference getTypedMultiplicityElement_Default();

	/**
	 * Returns the meta object for the reference '{@link dact.TypedMultiplicityElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see dact.TypedMultiplicityElement#getType()
	 * @see #getTypedMultiplicityElement()
	 * @generated
	 */
	EReference getTypedMultiplicityElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link dact.TypedMultiplicityElement#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see dact.TypedMultiplicityElement#getUpperBound()
	 * @see #getTypedMultiplicityElement()
	 * @generated
	 */
	EAttribute getTypedMultiplicityElement_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link dact.TypedMultiplicityElement#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see dact.TypedMultiplicityElement#getLowerBound()
	 * @see #getTypedMultiplicityElement()
	 * @generated
	 */
	EAttribute getTypedMultiplicityElement_LowerBound();

	/**
	 * Returns the meta object for the '{@link dact.TypedMultiplicityElement#NoDefaultForVariable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Default For Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Default For Variable</em>' operation.
	 * @see dact.TypedMultiplicityElement#NoDefaultForVariable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTypedMultiplicityElement__NoDefaultForVariable__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.TypedMultiplicityElement#isSingle() <em>Is Single</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Single</em>' operation.
	 * @see dact.TypedMultiplicityElement#isSingle()
	 * @generated
	 */
	EOperation getTypedMultiplicityElement__IsSingle();

	/**
	 * Returns the meta object for the '{@link dact.TypedMultiplicityElement#isCollection() <em>Is Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Collection</em>' operation.
	 * @see dact.TypedMultiplicityElement#isCollection()
	 * @generated
	 */
	EOperation getTypedMultiplicityElement__IsCollection();

	/**
	 * Returns the meta object for class '{@link dact.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see dact.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for class '{@link dact.DddModel <em>Ddd Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddd Model</em>'.
	 * @see dact.DddModel
	 * @generated
	 */
	EClass getDddModel();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.DddModel#getBoundedContexts <em>Bounded Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bounded Contexts</em>'.
	 * @see dact.DddModel#getBoundedContexts()
	 * @see #getDddModel()
	 * @generated
	 */
	EReference getDddModel_BoundedContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.DddModel#getSharedDomainObjects <em>Shared Domain Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Domain Objects</em>'.
	 * @see dact.DddModel#getSharedDomainObjects()
	 * @see #getDddModel()
	 * @generated
	 */
	EReference getDddModel_SharedDomainObjects();

	/**
	 * Returns the meta object for the '{@link dact.DddModel#UniqueBoundedContextNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Bounded Context Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Bounded Context Names</em>' operation.
	 * @see dact.DddModel#UniqueBoundedContextNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDddModel__UniqueBoundedContextNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.DddModel#UniqueSharedDomainObjectNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Shared Domain Object Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Shared Domain Object Names</em>' operation.
	 * @see dact.DddModel#UniqueSharedDomainObjectNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDddModel__UniqueSharedDomainObjectNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dact.ActivityModel <em>Activity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Model</em>'.
	 * @see dact.ActivityModel
	 * @generated
	 */
	EClass getActivityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.ActivityModel#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see dact.ActivityModel#getActivities()
	 * @see #getActivityModel()
	 * @generated
	 */
	EReference getActivityModel_Activities();

	/**
	 * Returns the meta object for the '{@link dact.ActivityModel#UniqueActivityNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Activity Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Activity Names</em>' operation.
	 * @see dact.ActivityModel#UniqueActivityNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getActivityModel__UniqueActivityNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dact.DomainNodeOperationMapping <em>Domain Node Operation Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Node Operation Mapping</em>'.
	 * @see dact.DomainNodeOperationMapping
	 * @generated
	 */
	EClass getDomainNodeOperationMapping();

	/**
	 * Returns the meta object for the attribute '{@link dact.DomainNodeOperationMapping#getUsedByExternalContext <em>Used By External Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used By External Context</em>'.
	 * @see dact.DomainNodeOperationMapping#getUsedByExternalContext()
	 * @see #getDomainNodeOperationMapping()
	 * @generated
	 */
	EAttribute getDomainNodeOperationMapping_UsedByExternalContext();

	/**
	 * Returns the meta object for the reference '{@link dact.DomainNodeOperationMapping#getDomainNode <em>Domain Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Node</em>'.
	 * @see dact.DomainNodeOperationMapping#getDomainNode()
	 * @see #getDomainNodeOperationMapping()
	 * @generated
	 */
	EReference getDomainNodeOperationMapping_DomainNode();

	/**
	 * Returns the meta object for the reference '{@link dact.DomainNodeOperationMapping#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see dact.DomainNodeOperationMapping#getOperation()
	 * @see #getDomainNodeOperationMapping()
	 * @generated
	 */
	EReference getDomainNodeOperationMapping_Operation();

	/**
	 * Returns the meta object for class '{@link dact.BoundedContext <em>Bounded Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Context</em>'.
	 * @see dact.BoundedContext
	 * @generated
	 */
	EClass getBoundedContext();

	/**
	 * Returns the meta object for the attribute '{@link dact.BoundedContext#getIsExternal <em>Is External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is External</em>'.
	 * @see dact.BoundedContext#getIsExternal()
	 * @see #getBoundedContext()
	 * @generated
	 */
	EAttribute getBoundedContext_IsExternal();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.BoundedContext#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Elements</em>'.
	 * @see dact.BoundedContext#getOwnedElements()
	 * @see #getBoundedContext()
	 * @generated
	 */
	EReference getBoundedContext_OwnedElements();

	/**
	 * Returns the meta object for the '{@link dact.BoundedContext#UniqueDomainElementNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Domain Element Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Domain Element Names</em>' operation.
	 * @see dact.BoundedContext#UniqueDomainElementNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBoundedContext__UniqueDomainElementNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dact.DomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Element</em>'.
	 * @see dact.DomainElement
	 * @generated
	 */
	EClass getDomainElement();

	/**
	 * Returns the meta object for the container reference '{@link dact.DomainElement#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see dact.DomainElement#getContext()
	 * @see #getDomainElement()
	 * @generated
	 */
	EReference getDomainElement_Context();

	/**
	 * Returns the meta object for class '{@link dact.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see dact.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the reference '{@link dact.Entity#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see dact.Entity#getRepository()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Repository();

	/**
	 * Returns the meta object for class '{@link dact.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Object</em>'.
	 * @see dact.ValueObject
	 * @generated
	 */
	EClass getValueObject();

	/**
	 * Returns the meta object for class '{@link dact.SharedValueObject <em>Shared Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Value Object</em>'.
	 * @see dact.SharedValueObject
	 * @generated
	 */
	EClass getSharedValueObject();

	/**
	 * Returns the meta object for class '{@link dact.AggregateRoot <em>Aggregate Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Root</em>'.
	 * @see dact.AggregateRoot
	 * @generated
	 */
	EClass getAggregateRoot();

	/**
	 * Returns the meta object for class '{@link dact.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see dact.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the reference '{@link dact.Repository#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see dact.Repository#getEntity()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Entity();

	/**
	 * Returns the meta object for class '{@link dact.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see dact.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link dact.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see dact.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link dact.Property#getIsComposite <em>Is Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composite</em>'.
	 * @see dact.Property#getIsComposite()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsComposite();

	/**
	 * Returns the meta object for the container reference '{@link dact.Property#getDomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain Object</em>'.
	 * @see dact.Property#getDomainObject()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_DomainObject();

	/**
	 * Returns the meta object for the '{@link dact.Property#MandatoryType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Mandatory Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mandatory Type</em>' operation.
	 * @see dact.Property#MandatoryType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProperty__MandatoryType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.Property#CompositeRequiresEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Composite Requires Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Composite Requires Entity</em>' operation.
	 * @see dact.Property#CompositeRequiresEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProperty__CompositeRequiresEntity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.Property#AggregateIsNotComposed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Aggregate Is Not Composed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Aggregate Is Not Composed</em>' operation.
	 * @see dact.Property#AggregateIsNotComposed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProperty__AggregateIsNotComposed__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.Property#PrimitivePropertyRequiresName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Primitive Property Requires Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Primitive Property Requires Name</em>' operation.
	 * @see dact.Property#PrimitivePropertyRequiresName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProperty__PrimitivePropertyRequiresName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.Property#SharedObjectTypeRestriction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Shared Object Type Restriction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Shared Object Type Restriction</em>' operation.
	 * @see dact.Property#SharedObjectTypeRestriction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProperty__SharedObjectTypeRestriction__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dact.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see dact.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link dact.Operation#getToExpose <em>To Expose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Expose</em>'.
	 * @see dact.Operation#getToExpose()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ToExpose();

	/**
	 * Returns the meta object for the attribute '{@link dact.Operation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dact.Operation#getType()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Type();

	/**
	 * Returns the meta object for the reference '{@link dact.Operation#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see dact.Operation#getBehavior()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Behavior();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.Operation#getOwnedParameters <em>Owned Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameters</em>'.
	 * @see dact.Operation#getOwnedParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_OwnedParameters();

	/**
	 * Returns the meta object for the container reference '{@link dact.Operation#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface</em>'.
	 * @see dact.Operation#getInterface()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Interface();

	/**
	 * Returns the meta object for the container reference '{@link dact.Operation#getDomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain Object</em>'.
	 * @see dact.Operation#getDomainObject()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_DomainObject();

	/**
	 * Returns the meta object for the '{@link dact.Operation#MatchedDomainOperationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Matched Domain Operation Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Matched Domain Operation Type</em>' operation.
	 * @see dact.Operation#MatchedDomainOperationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOperation__MatchedDomainOperationType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.Operation#MatchedRepositoryOperationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Matched Repository Operation Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Matched Repository Operation Type</em>' operation.
	 * @see dact.Operation#MatchedRepositoryOperationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOperation__MatchedRepositoryOperationType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.Operation#MatchedServiceOperationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Matched Service Operation Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Matched Service Operation Type</em>' operation.
	 * @see dact.Operation#MatchedServiceOperationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOperation__MatchedServiceOperationType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.Operation#NoBehaviorSpecification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Behavior Specification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Behavior Specification</em>' operation.
	 * @see dact.Operation#NoBehaviorSpecification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOperation__NoBehaviorSpecification__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.Operation#ConstructorMatchesProperties(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constructor Matches Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constructor Matches Properties</em>' operation.
	 * @see dact.Operation#ConstructorMatchesProperties(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOperation__ConstructorMatchesProperties__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dact.SpecOperation <em>Spec Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Operation</em>'.
	 * @see dact.SpecOperation
	 * @generated
	 */
	EClass getSpecOperation();

	/**
	 * Returns the meta object for the attribute '{@link dact.SpecOperation#getIsInvariant <em>Is Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Invariant</em>'.
	 * @see dact.SpecOperation#getIsInvariant()
	 * @see #getSpecOperation()
	 * @generated
	 */
	EAttribute getSpecOperation_IsInvariant();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.SpecOperation#getOwnedRules <em>Owned Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Rules</em>'.
	 * @see dact.SpecOperation#getOwnedRules()
	 * @see #getSpecOperation()
	 * @generated
	 */
	EReference getSpecOperation_OwnedRules();

	/**
	 * Returns the meta object for the '{@link dact.SpecOperation#BehaviorXorSpecification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Behavior Xor Specification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Behavior Xor Specification</em>' operation.
	 * @see dact.SpecOperation#BehaviorXorSpecification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSpecOperation__BehaviorXorSpecification__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.SpecOperation#OwnedByDomainObjectOnly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Owned By Domain Object Only</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Owned By Domain Object Only</em>' operation.
	 * @see dact.SpecOperation#OwnedByDomainObjectOnly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSpecOperation__OwnedByDomainObjectOnly__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.SpecOperation#UniqueRuleNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Rule Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Rule Names</em>' operation.
	 * @see dact.SpecOperation#UniqueRuleNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSpecOperation__UniqueRuleNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.SpecOperation#SingleBoolOutParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Single Bool Out Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Single Bool Out Parameter</em>' operation.
	 * @see dact.SpecOperation#SingleBoolOutParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSpecOperation__SingleBoolOutParameter__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dact.SpecRule <em>Spec Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Rule</em>'.
	 * @see dact.SpecRule
	 * @generated
	 */
	EClass getSpecRule();

	/**
	 * Returns the meta object for the attribute '{@link dact.SpecRule#getRawString <em>Raw String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw String</em>'.
	 * @see dact.SpecRule#getRawString()
	 * @see #getSpecRule()
	 * @generated
	 */
	EAttribute getSpecRule_RawString();

	/**
	 * Returns the meta object for the containment reference '{@link dact.SpecRule#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see dact.SpecRule#getExpr()
	 * @see #getSpecRule()
	 * @generated
	 */
	EReference getSpecRule_Expr();

	/**
	 * Returns the meta object for the container reference '{@link dact.SpecRule#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see dact.SpecRule#getOperation()
	 * @see #getSpecRule()
	 * @generated
	 */
	EReference getSpecRule_Operation();

	/**
	 * Returns the meta object for class '{@link dact.InternalDomainObject <em>Internal Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Domain Object</em>'.
	 * @see dact.InternalDomainObject
	 * @generated
	 */
	EClass getInternalDomainObject();

	/**
	 * Returns the meta object for class '{@link dact.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see dact.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.Interface#getOwnedOperations <em>Owned Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Operations</em>'.
	 * @see dact.Interface#getOwnedOperations()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_OwnedOperations();

	/**
	 * Returns the meta object for the '{@link dact.Interface#UniqueOperationNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Operation Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Operation Names</em>' operation.
	 * @see dact.Interface#UniqueOperationNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInterface__UniqueOperationNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dact.DefinesIdentityObject <em>Defines Identity Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defines Identity Object</em>'.
	 * @see dact.DefinesIdentityObject
	 * @generated
	 */
	EClass getDefinesIdentityObject();

	/**
	 * Returns the meta object for the attribute '{@link dact.DefinesIdentityObject#isDefinesIdentity <em>Defines Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defines Identity</em>'.
	 * @see dact.DefinesIdentityObject#isDefinesIdentity()
	 * @see #getDefinesIdentityObject()
	 * @generated
	 */
	EAttribute getDefinesIdentityObject_DefinesIdentity();

	/**
	 * Returns the meta object for the '{@link dact.DefinesIdentityObject#SingleValuedPrimitiveProperty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Single Valued Primitive Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Single Valued Primitive Property</em>' operation.
	 * @see dact.DefinesIdentityObject#SingleValuedPrimitiveProperty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDefinesIdentityObject__SingleValuedPrimitiveProperty__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dact.DomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object</em>'.
	 * @see dact.DomainObject
	 * @generated
	 */
	EClass getDomainObject();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.DomainObject#getOwnedProperties <em>Owned Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Properties</em>'.
	 * @see dact.DomainObject#getOwnedProperties()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_OwnedProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.DomainObject#getOwnedOperations <em>Owned Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Operations</em>'.
	 * @see dact.DomainObject#getOwnedOperations()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_OwnedOperations();

	/**
	 * Returns the meta object for the containment reference '{@link dact.DomainObject#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see dact.DomainObject#getScope()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_Scope();

	/**
	 * Returns the meta object for the '{@link dact.DomainObject#UniqueOperationNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Operation Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Operation Names</em>' operation.
	 * @see dact.DomainObject#UniqueOperationNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDomainObject__UniqueOperationNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.DomainObject#UniquePropertyNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Property Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Property Names</em>' operation.
	 * @see dact.DomainObject#UniquePropertyNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDomainObject__UniquePropertyNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.DomainObject#SingleInvariantOperation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Single Invariant Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Single Invariant Operation</em>' operation.
	 * @see dact.DomainObject#SingleInvariantOperation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDomainObject__SingleInvariantOperation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dact.SharedDomainObject <em>Shared Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Domain Object</em>'.
	 * @see dact.SharedDomainObject
	 * @generated
	 */
	EClass getSharedDomainObject();

	/**
	 * Returns the meta object for the reference '{@link dact.SharedDomainObject#getAbstractedRoot <em>Abstracted Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstracted Root</em>'.
	 * @see dact.SharedDomainObject#getAbstractedRoot()
	 * @see #getSharedDomainObject()
	 * @generated
	 */
	EReference getSharedDomainObject_AbstractedRoot();

	/**
	 * Returns the meta object for class '{@link dact.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see dact.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link dact.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see dact.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for class '{@link dact.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see dact.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for class '{@link dact.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see dact.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for class '{@link dact.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Type</em>'.
	 * @see dact.RealType
	 * @generated
	 */
	EClass getRealType();

	/**
	 * Returns the meta object for class '{@link dact.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see dact.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link dact.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see dact.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.Enumeration#getOwnedLiterals <em>Owned Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Literals</em>'.
	 * @see dact.Enumeration#getOwnedLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_OwnedLiterals();

	/**
	 * Returns the meta object for class '{@link dact.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see dact.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link dact.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see dact.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link dact.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see dact.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link dact.LiteralNull <em>Literal Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Null</em>'.
	 * @see dact.LiteralNull
	 * @generated
	 */
	EClass getLiteralNull();

	/**
	 * Returns the meta object for class '{@link dact.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal String</em>'.
	 * @see dact.LiteralString
	 * @generated
	 */
	EClass getLiteralString();

	/**
	 * Returns the meta object for the attribute '{@link dact.LiteralString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dact.LiteralString#getValue()
	 * @see #getLiteralString()
	 * @generated
	 */
	EAttribute getLiteralString_Value();

	/**
	 * Returns the meta object for the attribute '{@link dact.LiteralString#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see dact.LiteralString#getLength()
	 * @see #getLiteralString()
	 * @generated
	 */
	EAttribute getLiteralString_Length();

	/**
	 * Returns the meta object for the '{@link dact.LiteralString#contains(java.lang.String) <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains</em>' operation.
	 * @see dact.LiteralString#contains(java.lang.String)
	 * @generated
	 */
	EOperation getLiteralString__Contains__String();

	/**
	 * Returns the meta object for class '{@link dact.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Integer</em>'.
	 * @see dact.LiteralInteger
	 * @generated
	 */
	EClass getLiteralInteger();

	/**
	 * Returns the meta object for the attribute '{@link dact.LiteralInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dact.LiteralInteger#getValue()
	 * @see #getLiteralInteger()
	 * @generated
	 */
	EAttribute getLiteralInteger_Value();

	/**
	 * Returns the meta object for class '{@link dact.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Boolean</em>'.
	 * @see dact.LiteralBoolean
	 * @generated
	 */
	EClass getLiteralBoolean();

	/**
	 * Returns the meta object for the attribute '{@link dact.LiteralBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dact.LiteralBoolean#isValue()
	 * @see #getLiteralBoolean()
	 * @generated
	 */
	EAttribute getLiteralBoolean_Value();

	/**
	 * Returns the meta object for class '{@link dact.LiteralReal <em>Literal Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Real</em>'.
	 * @see dact.LiteralReal
	 * @generated
	 */
	EClass getLiteralReal();

	/**
	 * Returns the meta object for the attribute '{@link dact.LiteralReal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dact.LiteralReal#getValue()
	 * @see #getLiteralReal()
	 * @generated
	 */
	EAttribute getLiteralReal_Value();

	/**
	 * Returns the meta object for class '{@link dact.DomainEvent <em>Domain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Event</em>'.
	 * @see dact.DomainEvent
	 * @generated
	 */
	EClass getDomainEvent();

	/**
	 * Returns the meta object for class '{@link dact.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see dact.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link dact.Activity#getToTransform <em>To Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Transform</em>'.
	 * @see dact.Activity#getToTransform()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_ToTransform();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.Activity#getOwnedParameters <em>Owned Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameters</em>'.
	 * @see dact.Activity#getOwnedParameters()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_OwnedParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.Activity#getParameterMappings <em>Parameter Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Mappings</em>'.
	 * @see dact.Activity#getParameterMappings()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_ParameterMappings();

	/**
	 * Returns the meta object for the containment reference '{@link dact.Activity#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see dact.Activity#getRoot()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.Activity#getOwnedDomainNodes <em>Owned Domain Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Domain Nodes</em>'.
	 * @see dact.Activity#getOwnedDomainNodes()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_OwnedDomainNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.Activity#getProcessedDomainNodeMappings <em>Processed Domain Node Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processed Domain Node Mappings</em>'.
	 * @see dact.Activity#getProcessedDomainNodeMappings()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_ProcessedDomainNodeMappings();

	/**
	 * Returns the meta object for the '{@link dact.Activity#MappingsOnlyWithSpecification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Mappings Only With Specification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mappings Only With Specification</em>' operation.
	 * @see dact.Activity#MappingsOnlyWithSpecification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getActivity__MappingsOnlyWithSpecification__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.Activity#MatchedParameterMappingsCount(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Matched Parameter Mappings Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Matched Parameter Mappings Count</em>' operation.
	 * @see dact.Activity#MatchedParameterMappingsCount(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getActivity__MatchedParameterMappingsCount__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.Activity#EachParameterIsMapped(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Each Parameter Is Mapped</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Each Parameter Is Mapped</em>' operation.
	 * @see dact.Activity#EachParameterIsMapped(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getActivity__EachParameterIsMapped__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dact.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see dact.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the attribute '{@link dact.Scope#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dact.Scope#getName()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_Name();

	/**
	 * Returns the meta object for the reference '{@link dact.Scope#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see dact.Scope#getParent()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Parent();

	/**
	 * Returns the meta object for the reference list '{@link dact.Scope#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see dact.Scope#getChildren()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Children();

	/**
	 * Returns the meta object for the reference list '{@link dact.Scope#getInheritedVariables <em>Inherited Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherited Variables</em>'.
	 * @see dact.Scope#getInheritedVariables()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_InheritedVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.Scope#getOwnedVariables <em>Owned Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Variables</em>'.
	 * @see dact.Scope#getOwnedVariables()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_OwnedVariables();

	/**
	 * Returns the meta object for the container reference '{@link dact.Scope#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see dact.Scope#getGroup()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Group();

	/**
	 * Returns the meta object for the container reference '{@link dact.Scope#getDomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain Object</em>'.
	 * @see dact.Scope#getDomainObject()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_DomainObject();

	/**
	 * Returns the meta object for class '{@link dact.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see dact.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link dact.Identifier#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see dact.Identifier#getIndex()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Index();

	/**
	 * Returns the meta object for class '{@link dact.ActivityGroup <em>Activity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Group</em>'.
	 * @see dact.ActivityGroup
	 * @generated
	 */
	EClass getActivityGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.ActivityGroup#getOwnedNodes <em>Owned Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Nodes</em>'.
	 * @see dact.ActivityGroup#getOwnedNodes()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_OwnedNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.ActivityGroup#getOwnedEdges <em>Owned Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Edges</em>'.
	 * @see dact.ActivityGroup#getOwnedEdges()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_OwnedEdges();

	/**
	 * Returns the meta object for the containment reference '{@link dact.ActivityGroup#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see dact.ActivityGroup#getScope()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_Scope();

	/**
	 * Returns the meta object for the container reference '{@link dact.ActivityGroup#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity</em>'.
	 * @see dact.ActivityGroup#getActivity()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_Activity();

	/**
	 * Returns the meta object for the container reference '{@link dact.ActivityGroup#getStructuredActivityNode <em>Structured Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Structured Activity Node</em>'.
	 * @see dact.ActivityGroup#getStructuredActivityNode()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_StructuredActivityNode();

	/**
	 * Returns the meta object for the container reference '{@link dact.ActivityGroup#getConditionalNode <em>Conditional Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Conditional Node</em>'.
	 * @see dact.ActivityGroup#getConditionalNode()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_ConditionalNode();

	/**
	 * Returns the meta object for the '{@link dact.ActivityGroup#SingleInitialNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Single Initial Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Single Initial Node</em>' operation.
	 * @see dact.ActivityGroup#SingleInitialNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getActivityGroup__SingleInitialNode__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.ActivityGroup#SingleFinalNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Single Final Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Single Final Node</em>' operation.
	 * @see dact.ActivityGroup#SingleFinalNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getActivityGroup__SingleFinalNode__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.ActivityGroup#NonEmptyGroup(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Empty Group</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Non Empty Group</em>' operation.
	 * @see dact.ActivityGroup#NonEmptyGroup(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getActivityGroup__NonEmptyGroup__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dact.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see dact.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference list '{@link dact.Variable#getAccessibleScopes <em>Accessible Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessible Scopes</em>'.
	 * @see dact.Variable#getAccessibleScopes()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_AccessibleScopes();

	/**
	 * Returns the meta object for the container reference '{@link dact.Variable#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scope</em>'.
	 * @see dact.Variable#getScope()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Scope();

	/**
	 * Returns the meta object for class '{@link dact.InstanceValue <em>Instance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Value</em>'.
	 * @see dact.InstanceValue
	 * @generated
	 */
	EClass getInstanceValue();

	/**
	 * Returns the meta object for the reference '{@link dact.InstanceValue#getIsInstanceOf <em>Is Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Instance Of</em>'.
	 * @see dact.InstanceValue#getIsInstanceOf()
	 * @see #getInstanceValue()
	 * @generated
	 */
	EReference getInstanceValue_IsInstanceOf();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.InstanceValue#getOwnedProperties <em>Owned Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Properties</em>'.
	 * @see dact.InstanceValue#getOwnedProperties()
	 * @see #getInstanceValue()
	 * @generated
	 */
	EReference getInstanceValue_OwnedProperties();

	/**
	 * Returns the meta object for class '{@link dact.InstanceProperty <em>Instance Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Property</em>'.
	 * @see dact.InstanceProperty
	 * @generated
	 */
	EClass getInstanceProperty();

	/**
	 * Returns the meta object for the reference '{@link dact.InstanceProperty#getIsInstanceOf <em>Is Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Instance Of</em>'.
	 * @see dact.InstanceProperty#getIsInstanceOf()
	 * @see #getInstanceProperty()
	 * @generated
	 */
	EReference getInstanceProperty_IsInstanceOf();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.InstanceProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see dact.InstanceProperty#getValue()
	 * @see #getInstanceProperty()
	 * @generated
	 */
	EReference getInstanceProperty_Value();

	/**
	 * Returns the meta object for class '{@link dact.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see dact.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for class '{@link dact.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node</em>'.
	 * @see dact.ActivityNode
	 * @generated
	 */
	EClass getActivityNode();

	/**
	 * Returns the meta object for the reference '{@link dact.ActivityNode#getSEdge <em>SEdge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SEdge</em>'.
	 * @see dact.ActivityNode#getSEdge()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_SEdge();

	/**
	 * Returns the meta object for the reference '{@link dact.ActivityNode#getTEdge <em>TEdge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TEdge</em>'.
	 * @see dact.ActivityNode#getTEdge()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_TEdge();

	/**
	 * Returns the meta object for the container reference '{@link dact.ActivityNode#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see dact.ActivityNode#getGroup()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Group();

	/**
	 * Returns the meta object for class '{@link dact.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge</em>'.
	 * @see dact.ActivityEdge
	 * @generated
	 */
	EClass getActivityEdge();

	/**
	 * Returns the meta object for the attribute '{@link dact.ActivityEdge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dact.ActivityEdge#getName()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EAttribute getActivityEdge_Name();

	/**
	 * Returns the meta object for the attribute '{@link dact.ActivityEdge#getEdgeName <em>Edge Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge Name</em>'.
	 * @see dact.ActivityEdge#getEdgeName()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EAttribute getActivityEdge_EdgeName();

	/**
	 * Returns the meta object for the reference '{@link dact.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dact.ActivityEdge#getSource()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link dact.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dact.ActivityEdge#getTarget()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Target();

	/**
	 * Returns the meta object for the container reference '{@link dact.ActivityEdge#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see dact.ActivityEdge#getGroup()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Group();

	/**
	 * Returns the meta object for the '{@link dact.ActivityEdge#NoSelfLoop(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Self Loop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Self Loop</em>' operation.
	 * @see dact.ActivityEdge#NoSelfLoop(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getActivityEdge__NoSelfLoop__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.ActivityEdge#NoEdgeIntoInitialNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Edge Into Initial Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Edge Into Initial Node</em>' operation.
	 * @see dact.ActivityEdge#NoEdgeIntoInitialNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getActivityEdge__NoEdgeIntoInitialNode__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.ActivityEdge#NoEdgeOutOfFinalNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Edge Out Of Final Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Edge Out Of Final Node</em>' operation.
	 * @see dact.ActivityEdge#NoEdgeOutOfFinalNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getActivityEdge__NoEdgeOutOfFinalNode__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.ActivityEdge#EndpointsInSameGroup(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Endpoints In Same Group</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Endpoints In Same Group</em>' operation.
	 * @see dact.ActivityEdge#EndpointsInSameGroup(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getActivityEdge__EndpointsInSameGroup__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dact.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node</em>'.
	 * @see dact.InitialNode
	 * @generated
	 */
	EClass getInitialNode();

	/**
	 * Returns the meta object for the attribute '{@link dact.InitialNode#getTName <em>TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TName</em>'.
	 * @see dact.InitialNode#getTName()
	 * @see #getInitialNode()
	 * @generated
	 */
	EAttribute getInitialNode_TName();

	/**
	 * Returns the meta object for class '{@link dact.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node</em>'.
	 * @see dact.ControlNode
	 * @generated
	 */
	EClass getControlNode();

	/**
	 * Returns the meta object for class '{@link dact.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Node</em>'.
	 * @see dact.ExecutableNode
	 * @generated
	 */
	EClass getExecutableNode();

	/**
	 * Returns the meta object for class '{@link dact.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node</em>'.
	 * @see dact.FinalNode
	 * @generated
	 */
	EClass getFinalNode();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.FinalNode#getVariablesToReturn <em>Variables To Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables To Return</em>'.
	 * @see dact.FinalNode#getVariablesToReturn()
	 * @see #getFinalNode()
	 * @generated
	 */
	EReference getFinalNode_VariablesToReturn();

	/**
	 * Returns the meta object for class '{@link dact.ActivityFinalNode <em>Activity Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node</em>'.
	 * @see dact.ActivityFinalNode
	 * @generated
	 */
	EClass getActivityFinalNode();

	/**
	 * Returns the meta object for class '{@link dact.FlowFinalNode <em>Flow Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Final Node</em>'.
	 * @see dact.FlowFinalNode
	 * @generated
	 */
	EClass getFlowFinalNode();

	/**
	 * Returns the meta object for class '{@link dact.StructuredActivityNode <em>Structured Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Activity Node</em>'.
	 * @see dact.StructuredActivityNode
	 * @generated
	 */
	EClass getStructuredActivityNode();

	/**
	 * Returns the meta object for the containment reference '{@link dact.StructuredActivityNode#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test</em>'.
	 * @see dact.StructuredActivityNode#getTest()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_Test();

	/**
	 * Returns the meta object for the containment reference '{@link dact.StructuredActivityNode#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see dact.StructuredActivityNode#getBody()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_Body();

	/**
	 * Returns the meta object for class '{@link dact.ConditionalNode <em>Conditional Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Node</em>'.
	 * @see dact.ConditionalNode
	 * @generated
	 */
	EClass getConditionalNode();

	/**
	 * Returns the meta object for the containment reference '{@link dact.ConditionalNode#getElseBody <em>Else Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Body</em>'.
	 * @see dact.ConditionalNode#getElseBody()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EReference getConditionalNode_ElseBody();

	/**
	 * Returns the meta object for class '{@link dact.LoopNode <em>Loop Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Node</em>'.
	 * @see dact.LoopNode
	 * @generated
	 */
	EClass getLoopNode();

	/**
	 * Returns the meta object for the containment reference '{@link dact.LoopNode#getSetup <em>Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Setup</em>'.
	 * @see dact.LoopNode#getSetup()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_Setup();

	/**
	 * Returns the meta object for class '{@link dact.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see dact.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the reference '{@link dact.Behavior#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see dact.Behavior#getSpecification()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Specification();

	/**
	 * Returns the meta object for class '{@link dact.CallOperationAction <em>Call Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Operation Action</em>'.
	 * @see dact.CallOperationAction
	 * @generated
	 */
	EClass getCallOperationAction();

	/**
	 * Returns the meta object for the attribute '{@link dact.CallOperationAction#getToDeclareResult <em>To Declare Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Declare Result</em>'.
	 * @see dact.CallOperationAction#getToDeclareResult()
	 * @see #getCallOperationAction()
	 * @generated
	 */
	EAttribute getCallOperationAction_ToDeclareResult();

	/**
	 * Returns the meta object for the reference '{@link dact.CallOperationAction#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see dact.CallOperationAction#getOperation()
	 * @see #getCallOperationAction()
	 * @generated
	 */
	EReference getCallOperationAction_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.CallOperationAction#getParameterMappings <em>Parameter Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Mappings</em>'.
	 * @see dact.CallOperationAction#getParameterMappings()
	 * @see #getCallOperationAction()
	 * @generated
	 */
	EReference getCallOperationAction_ParameterMappings();

	/**
	 * Returns the meta object for class '{@link dact.VariableDeclarationAction <em>Variable Declaration Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration Action</em>'.
	 * @see dact.VariableDeclarationAction
	 * @generated
	 */
	EClass getVariableDeclarationAction();

	/**
	 * Returns the meta object for the reference '{@link dact.VariableDeclarationAction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see dact.VariableDeclarationAction#getType()
	 * @see #getVariableDeclarationAction()
	 * @generated
	 */
	EReference getVariableDeclarationAction_Type();

	/**
	 * Returns the meta object for the attribute '{@link dact.VariableDeclarationAction#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see dact.VariableDeclarationAction#getUpperBound()
	 * @see #getVariableDeclarationAction()
	 * @generated
	 */
	EAttribute getVariableDeclarationAction_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link dact.VariableDeclarationAction#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see dact.VariableDeclarationAction#getLowerBound()
	 * @see #getVariableDeclarationAction()
	 * @generated
	 */
	EAttribute getVariableDeclarationAction_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link dact.VariableDeclarationAction#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declaration</em>'.
	 * @see dact.VariableDeclarationAction#getDeclaration()
	 * @see #getVariableDeclarationAction()
	 * @generated
	 */
	EReference getVariableDeclarationAction_Declaration();

	/**
	 * Returns the meta object for class '{@link dact.VariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment</em>'.
	 * @see dact.VariableAssignment
	 * @generated
	 */
	EClass getVariableAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link dact.VariableAssignment#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see dact.VariableAssignment#getIdentifier()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link dact.VariableAssignment#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see dact.VariableAssignment#getExpr()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Expr();

	/**
	 * Returns the meta object for class '{@link dact.RaiseExceptionAction <em>Raise Exception Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raise Exception Action</em>'.
	 * @see dact.RaiseExceptionAction
	 * @generated
	 */
	EClass getRaiseExceptionAction();

	/**
	 * Returns the meta object for the attribute '{@link dact.RaiseExceptionAction#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dact.RaiseExceptionAction#getDescription()
	 * @see #getRaiseExceptionAction()
	 * @generated
	 */
	EAttribute getRaiseExceptionAction_Description();

	/**
	 * Returns the meta object for class '{@link dact.RaiseEntityNotFoundExceptionAction <em>Raise Entity Not Found Exception Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raise Entity Not Found Exception Action</em>'.
	 * @see dact.RaiseEntityNotFoundExceptionAction
	 * @generated
	 */
	EClass getRaiseEntityNotFoundExceptionAction();

	/**
	 * Returns the meta object for the reference '{@link dact.RaiseEntityNotFoundExceptionAction#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see dact.RaiseEntityNotFoundExceptionAction#getEntity()
	 * @see #getRaiseEntityNotFoundExceptionAction()
	 * @generated
	 */
	EReference getRaiseEntityNotFoundExceptionAction_Entity();

	/**
	 * Returns the meta object for class '{@link dact.SendSignalAction <em>Send Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Signal Action</em>'.
	 * @see dact.SendSignalAction
	 * @generated
	 */
	EClass getSendSignalAction();

	/**
	 * Returns the meta object for class '{@link dact.ReceiveSignalAction <em>Receive Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Signal Action</em>'.
	 * @see dact.ReceiveSignalAction
	 * @generated
	 */
	EClass getReceiveSignalAction();

	/**
	 * Returns the meta object for class '{@link dact.VariableAssignmentAction <em>Variable Assignment Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment Action</em>'.
	 * @see dact.VariableAssignmentAction
	 * @generated
	 */
	EClass getVariableAssignmentAction();

	/**
	 * Returns the meta object for the containment reference '{@link dact.VariableAssignmentAction#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignment</em>'.
	 * @see dact.VariableAssignmentAction#getAssignment()
	 * @see #getVariableAssignmentAction()
	 * @generated
	 */
	EReference getVariableAssignmentAction_Assignment();

	/**
	 * Returns the meta object for class '{@link dact.ParallelNode <em>Parallel Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Node</em>'.
	 * @see dact.ParallelNode
	 * @generated
	 */
	EClass getParallelNode();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.ParallelNode#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see dact.ParallelNode#getFlows()
	 * @see #getParallelNode()
	 * @generated
	 */
	EReference getParallelNode_Flows();

	/**
	 * Returns the meta object for class '{@link dact.ParallelFlow <em>Parallel Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Flow</em>'.
	 * @see dact.ParallelFlow
	 * @generated
	 */
	EClass getParallelFlow();

	/**
	 * Returns the meta object for the attribute '{@link dact.ParallelFlow#isIsPrimary <em>Is Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Primary</em>'.
	 * @see dact.ParallelFlow#isIsPrimary()
	 * @see #getParallelFlow()
	 * @generated
	 */
	EAttribute getParallelFlow_IsPrimary();

	/**
	 * Returns the meta object for the container reference '{@link dact.ParallelFlow#getParallelNode <em>Parallel Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parallel Node</em>'.
	 * @see dact.ParallelFlow#getParallelNode()
	 * @see #getParallelFlow()
	 * @generated
	 */
	EReference getParallelFlow_ParallelNode();

	/**
	 * Returns the meta object for class '{@link dact.DomainNode <em>Domain Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Node</em>'.
	 * @see dact.DomainNode
	 * @generated
	 */
	EClass getDomainNode();

	/**
	 * Returns the meta object for the reference '{@link dact.DomainNode#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aggregate</em>'.
	 * @see dact.DomainNode#getAggregate()
	 * @see #getDomainNode()
	 * @generated
	 */
	EReference getDomainNode_Aggregate();

	/**
	 * Returns the meta object for the containment reference '{@link dact.DomainNode#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see dact.DomainNode#getResult()
	 * @see #getDomainNode()
	 * @generated
	 */
	EReference getDomainNode_Result();

	/**
	 * Returns the meta object for the reference '{@link dact.DomainNode#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see dact.DomainNode#getEntity()
	 * @see #getDomainNode()
	 * @generated
	 */
	EReference getDomainNode_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link dact.DomainNode#getMainExpr <em>Main Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Main Expr</em>'.
	 * @see dact.DomainNode#getMainExpr()
	 * @see #getDomainNode()
	 * @generated
	 */
	EReference getDomainNode_MainExpr();

	/**
	 * Returns the meta object for the reference list '{@link dact.DomainNode#getPropertyChain <em>Property Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property Chain</em>'.
	 * @see dact.DomainNode#getPropertyChain()
	 * @see #getDomainNode()
	 * @generated
	 */
	EReference getDomainNode_PropertyChain();

	/**
	 * Returns the meta object for the '{@link dact.DomainNode#RequiresMainExpression(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Requires Main Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requires Main Expression</em>' operation.
	 * @see dact.DomainNode#RequiresMainExpression(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDomainNode__RequiresMainExpression__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.DomainNode#SelfAnchoredBinaryExpression(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Self Anchored Binary Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Self Anchored Binary Expression</em>' operation.
	 * @see dact.DomainNode#SelfAnchoredBinaryExpression(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDomainNode__SelfAnchoredBinaryExpression__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dact.DomainExistAction <em>Domain Exist Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Exist Action</em>'.
	 * @see dact.DomainExistAction
	 * @generated
	 */
	EClass getDomainExistAction();

	/**
	 * Returns the meta object for class '{@link dact.DomainFindAction <em>Domain Find Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Find Action</em>'.
	 * @see dact.DomainFindAction
	 * @generated
	 */
	EClass getDomainFindAction();

	/**
	 * Returns the meta object for class '{@link dact.DomainCreateAction <em>Domain Create Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Create Action</em>'.
	 * @see dact.DomainCreateAction
	 * @generated
	 */
	EClass getDomainCreateAction();

	/**
	 * Returns the meta object for class '{@link dact.DomainUpdateAction <em>Domain Update Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Update Action</em>'.
	 * @see dact.DomainUpdateAction
	 * @generated
	 */
	EClass getDomainUpdateAction();

	/**
	 * Returns the meta object for class '{@link dact.DomainDeleteAction <em>Domain Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Delete Action</em>'.
	 * @see dact.DomainDeleteAction
	 * @generated
	 */
	EClass getDomainDeleteAction();

	/**
	 * Returns the meta object for class '{@link dact.SignalAction <em>Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Action</em>'.
	 * @see dact.SignalAction
	 * @generated
	 */
	EClass getSignalAction();

	/**
	 * Returns the meta object for the reference '{@link dact.SignalAction#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see dact.SignalAction#getEvent()
	 * @see #getSignalAction()
	 * @generated
	 */
	EReference getSignalAction_Event();

	/**
	 * Returns the meta object for the reference '{@link dact.SignalAction#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see dact.SignalAction#getVariable()
	 * @see #getSignalAction()
	 * @generated
	 */
	EReference getSignalAction_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link dact.SignalAction#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see dact.SignalAction#getIdentifier()
	 * @see #getSignalAction()
	 * @generated
	 */
	EReference getSignalAction_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link dact.SignalAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see dact.SignalAction#getValue()
	 * @see #getSignalAction()
	 * @generated
	 */
	EReference getSignalAction_Value();

	/**
	 * Returns the meta object for the '{@link dact.SignalAction#ExclusiveEventSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Exclusive Event Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exclusive Event Source</em>' operation.
	 * @see dact.SignalAction#ExclusiveEventSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSignalAction__ExclusiveEventSource__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dact.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see dact.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link dact.Parameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see dact.Parameter#getDirection()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Direction();

	/**
	 * Returns the meta object for the attribute '{@link dact.Parameter#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see dact.Parameter#getRole()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Role();

	/**
	 * Returns the meta object for the container reference '{@link dact.Parameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see dact.Parameter#getOperation()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Operation();

	/**
	 * Returns the meta object for the container reference '{@link dact.Parameter#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity</em>'.
	 * @see dact.Parameter#getActivity()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Activity();

	/**
	 * Returns the meta object for class '{@link dact.ParameterMapping <em>Parameter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Mapping</em>'.
	 * @see dact.ParameterMapping
	 * @generated
	 */
	EClass getParameterMapping();

	/**
	 * Returns the meta object for the attribute '{@link dact.ParameterMapping#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dact.ParameterMapping#getType()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EAttribute getParameterMapping_Type();

	/**
	 * Returns the meta object for the reference '{@link dact.ParameterMapping#getOperationParameter <em>Operation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Parameter</em>'.
	 * @see dact.ParameterMapping#getOperationParameter()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_OperationParameter();

	/**
	 * Returns the meta object for the containment reference '{@link dact.ParameterMapping#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see dact.ParameterMapping#getIdentifier()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_Identifier();

	/**
	 * Returns the meta object for the reference '{@link dact.ParameterMapping#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see dact.ParameterMapping#getVariable()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_Variable();

	/**
	 * Returns the meta object for the reference '{@link dact.ParameterMapping#getActivityParameter <em>Activity Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity Parameter</em>'.
	 * @see dact.ParameterMapping#getActivityParameter()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_ActivityParameter();

	/**
	 * Returns the meta object for the containment reference '{@link dact.ParameterMapping#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see dact.ParameterMapping#getValue()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_Value();

	/**
	 * Returns the meta object for the container reference '{@link dact.ParameterMapping#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Action</em>'.
	 * @see dact.ParameterMapping#getAction()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_Action();

	/**
	 * Returns the meta object for the container reference '{@link dact.ParameterMapping#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity</em>'.
	 * @see dact.ParameterMapping#getActivity()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_Activity();

	/**
	 * Returns the meta object for the '{@link dact.ParameterMapping#ConformingActivityOperationParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Conforming Activity Operation Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conforming Activity Operation Parameter</em>' operation.
	 * @see dact.ParameterMapping#ConformingActivityOperationParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getParameterMapping__ConformingActivityOperationParameter__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.ParameterMapping#ExclusiveMappingSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Exclusive Mapping Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exclusive Mapping Source</em>' operation.
	 * @see dact.ParameterMapping#ExclusiveMappingSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getParameterMapping__ExclusiveMappingSource__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dact.ParameterMapping#ValueOnlyInAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Value Only In Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value Only In Action</em>' operation.
	 * @see dact.ParameterMapping#ValueOnlyInAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getParameterMapping__ValueOnlyInAction__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dact.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see dact.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link dact.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see dact.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the reference '{@link dact.UnaryExpression#getEnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Value</em>'.
	 * @see dact.UnaryExpression#getEnumValue()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_EnumValue();

	/**
	 * Returns the meta object for the containment reference '{@link dact.UnaryExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see dact.UnaryExpression#getValue()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Value();

	/**
	 * Returns the meta object for the containment reference '{@link dact.UnaryExpression#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see dact.UnaryExpression#getIdentifier()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Identifier();

	/**
	 * Returns the meta object for class '{@link dact.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see dact.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link dact.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see dact.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link dact.BinaryExpression#getLeftExpr <em>Left Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Expr</em>'.
	 * @see dact.BinaryExpression#getLeftExpr()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_LeftExpr();

	/**
	 * Returns the meta object for the containment reference '{@link dact.BinaryExpression#getRightExpr <em>Right Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Expr</em>'.
	 * @see dact.BinaryExpression#getRightExpr()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_RightExpr();

	/**
	 * Returns the meta object for class '{@link dact.NotExpression <em>Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Expression</em>'.
	 * @see dact.NotExpression
	 * @generated
	 */
	EClass getNotExpression();

	/**
	 * Returns the meta object for the containment reference '{@link dact.NotExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see dact.NotExpression#getExpr()
	 * @see #getNotExpression()
	 * @generated
	 */
	EReference getNotExpression_Expr();

	/**
	 * Returns the meta object for class '{@link dact.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see dact.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for class '{@link dact.IntegerOperator <em>Integer Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Operator</em>'.
	 * @see dact.IntegerOperator
	 * @generated
	 */
	EClass getIntegerOperator();

	/**
	 * Returns the meta object for class '{@link dact.Divide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divide</em>'.
	 * @see dact.Divide
	 * @generated
	 */
	EClass getDivide();

	/**
	 * Returns the meta object for class '{@link dact.Times <em>Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Times</em>'.
	 * @see dact.Times
	 * @generated
	 */
	EClass getTimes();

	/**
	 * Returns the meta object for class '{@link dact.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see dact.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link dact.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see dact.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for class '{@link dact.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Operator</em>'.
	 * @see dact.LogicalOperator
	 * @generated
	 */
	EClass getLogicalOperator();

	/**
	 * Returns the meta object for class '{@link dact.Gt <em>Gt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gt</em>'.
	 * @see dact.Gt
	 * @generated
	 */
	EClass getGt();

	/**
	 * Returns the meta object for class '{@link dact.Lt <em>Lt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lt</em>'.
	 * @see dact.Lt
	 * @generated
	 */
	EClass getLt();

	/**
	 * Returns the meta object for class '{@link dact.Ge <em>Ge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ge</em>'.
	 * @see dact.Ge
	 * @generated
	 */
	EClass getGe();

	/**
	 * Returns the meta object for class '{@link dact.Le <em>Le</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Le</em>'.
	 * @see dact.Le
	 * @generated
	 */
	EClass getLe();

	/**
	 * Returns the meta object for class '{@link dact.Eq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eq</em>'.
	 * @see dact.Eq
	 * @generated
	 */
	EClass getEq();

	/**
	 * Returns the meta object for class '{@link dact.Ne <em>Ne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne</em>'.
	 * @see dact.Ne
	 * @generated
	 */
	EClass getNe();

	/**
	 * Returns the meta object for class '{@link dact.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see dact.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link dact.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see dact.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link dact.In <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In</em>'.
	 * @see dact.In
	 * @generated
	 */
	EClass getIn();

	/**
	 * Returns the meta object for enum '{@link dact.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Type</em>'.
	 * @see dact.OperationType
	 * @generated
	 */
	EEnum getOperationType();

	/**
	 * Returns the meta object for enum '{@link dact.ParameterDirection <em>Parameter Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Direction</em>'.
	 * @see dact.ParameterDirection
	 * @generated
	 */
	EEnum getParameterDirection();

	/**
	 * Returns the meta object for enum '{@link dact.ParameterRole <em>Parameter Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Role</em>'.
	 * @see dact.ParameterRole
	 * @generated
	 */
	EEnum getParameterRole();

	/**
	 * Returns the meta object for enum '{@link dact.ParameterMappingType <em>Parameter Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Mapping Type</em>'.
	 * @see dact.ParameterMappingType
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
	DactFactory getDactFactory();

} //DactPackage

/**
 */
package lemma.adapted.xcore.data;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see lemma.adapted.xcore.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/xcore/data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = lemma.adapted.xcore.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.DataModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.DataModelImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Tmodel Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__TMODEL_URI = 0;

	/**
	 * The feature id for the '<em><b>Complex Type Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__COMPLEX_TYPE_IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__VERSIONS = 2;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__CONTEXTS = 3;

	/**
	 * The feature id for the '<em><b>Complex Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__COMPLEX_TYPES = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Contained Complex Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL___GET_CONTAINED_COMPLEX_TYPES = 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.ComplexTypeImportImpl <em>Complex Type Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.ComplexTypeImportImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getComplexTypeImport()
	 * @generated
	 */
	int COMPLEX_TYPE_IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_IMPORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_IMPORT__IMPORT_URI = 1;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_IMPORT__DATA_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Complex Type Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_IMPORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Complex Type Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.VersionImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Complex Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__COMPLEX_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__CONTEXTS = 2;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DATA_MODEL = 3;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Contained Complex Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION___GET_CONTAINED_COMPLEX_TYPES = 0;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION___GET_QUALIFIED_NAME_PARTS = 1;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.ContextImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Complex Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__COMPLEX_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DATA_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET_QUALIFIED_NAME_PARTS = 0;

	/**
	 * The operation id for the '<em>Build Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___BUILD_QUALIFIED_NAME__STRING = 1;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.TypeImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 4;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.PrimitiveTypeImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__TYPE_NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__TYPE_SIZE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE = TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE = TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES = TYPE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.PrimitiveBooleanImpl <em>Primitive Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.PrimitiveBooleanImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveBoolean()
	 * @generated
	 */
	int PRIMITIVE_BOOLEAN = 6;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.PrimitiveByteImpl <em>Primitive Byte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.PrimitiveByteImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveByte()
	 * @generated
	 */
	int PRIMITIVE_BYTE = 7;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BYTE__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BYTE__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BYTE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BYTE___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BYTE___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BYTE___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BYTE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.PrimitiveCharacterImpl <em>Primitive Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.PrimitiveCharacterImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveCharacter()
	 * @generated
	 */
	int PRIMITIVE_CHARACTER = 8;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CHARACTER__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CHARACTER__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CHARACTER_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CHARACTER___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CHARACTER___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CHARACTER___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CHARACTER_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.PrimitiveDateImpl <em>Primitive Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.PrimitiveDateImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveDate()
	 * @generated
	 */
	int PRIMITIVE_DATE = 9;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATE__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATE__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATE___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATE___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATE___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.PrimitiveDoubleImpl <em>Primitive Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.PrimitiveDoubleImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveDouble()
	 * @generated
	 */
	int PRIMITIVE_DOUBLE = 10;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DOUBLE__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DOUBLE__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DOUBLE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DOUBLE___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DOUBLE___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DOUBLE___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DOUBLE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.PrimitiveFloatImpl <em>Primitive Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.PrimitiveFloatImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveFloat()
	 * @generated
	 */
	int PRIMITIVE_FLOAT = 11;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FLOAT__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FLOAT__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FLOAT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FLOAT___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FLOAT___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FLOAT___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FLOAT_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.PrimitiveIntegerImpl <em>Primitive Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.PrimitiveIntegerImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveInteger()
	 * @generated
	 */
	int PRIMITIVE_INTEGER = 12;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.PrimitiveLongImpl <em>Primitive Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.PrimitiveLongImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveLong()
	 * @generated
	 */
	int PRIMITIVE_LONG = 13;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LONG__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LONG__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LONG_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LONG___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LONG___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LONG___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LONG_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.PrimitiveShortImpl <em>Primitive Short</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.PrimitiveShortImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveShort()
	 * @generated
	 */
	int PRIMITIVE_SHORT = 14;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SHORT__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SHORT__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SHORT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SHORT___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SHORT___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SHORT___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SHORT_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.PrimitiveStringImpl <em>Primitive String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.PrimitiveStringImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveString()
	 * @generated
	 */
	int PRIMITIVE_STRING = 15;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.PrimitiveUnspecifiedImpl <em>Primitive Unspecified</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.PrimitiveUnspecifiedImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveUnspecified()
	 * @generated
	 */
	int PRIMITIVE_UNSPECIFIED = 16;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_UNSPECIFIED__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_UNSPECIFIED__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Unspecified</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_UNSPECIFIED_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_UNSPECIFIED___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_UNSPECIFIED___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_UNSPECIFIED___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Unspecified</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_UNSPECIFIED_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.ComplexTypeImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__FEATURES = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__DATA_MODEL = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__VERSION = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__CONTEXT = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__IS_STRUCTURE = TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Primitive Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__IS_PRIMITIVE_COLLECTION = TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Structured Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__IS_STRUCTURED_COLLECTION = TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Enumeration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__IS_ENUMERATION = TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE___GET_QUALIFIED_NAME_PARTS = TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Build Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE___BUILD_QUALIFIED_NAME__STRING = TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Closest Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE___GET_CLOSEST_NAMESPACE = TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Compare Field Counts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE___COMPARE_FIELD_COUNTS__ELIST_ELIST = TYPE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE___HAS_FEATURE__COMPLEXTYPEFEATURE = TYPE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.ImportedComplexTypeImpl <em>Imported Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.ImportedComplexTypeImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getImportedComplexType()
	 * @generated
	 */
	int IMPORTED_COMPLEX_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_COMPLEX_TYPE__IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Imported Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_COMPLEX_TYPE__IMPORTED_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_COMPLEX_TYPE__DATA_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_COMPLEX_TYPE__PARAMETER = 3;

	/**
	 * The number of structural features of the '<em>Imported Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_COMPLEX_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Imported Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_COMPLEX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.DataStructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.DataStructureImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getDataStructure()
	 * @generated
	 */
	int DATA_STRUCTURE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__NAME = COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__FEATURES = COMPLEX_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__DATA_MODEL = COMPLEX_TYPE__DATA_MODEL;

	/**
	 * The feature id for the '<em><b>Version</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__VERSION = COMPLEX_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__CONTEXT = COMPLEX_TYPE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__IS_STRUCTURE = COMPLEX_TYPE__IS_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Is Primitive Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__IS_PRIMITIVE_COLLECTION = COMPLEX_TYPE__IS_PRIMITIVE_COLLECTION;

	/**
	 * The feature id for the '<em><b>Is Structured Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__IS_STRUCTURED_COLLECTION = COMPLEX_TYPE__IS_STRUCTURED_COLLECTION;

	/**
	 * The feature id for the '<em><b>Is Enumeration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__IS_ENUMERATION = COMPLEX_TYPE__IS_ENUMERATION;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__SUPER = COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__DATA_FIELDS = COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__OPERATIONS = COMPLEX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE___GET_QUALIFIED_NAME_PARTS = COMPLEX_TYPE___GET_QUALIFIED_NAME_PARTS;

	/**
	 * The operation id for the '<em>Build Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE___BUILD_QUALIFIED_NAME__STRING = COMPLEX_TYPE___BUILD_QUALIFIED_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Closest Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE___GET_CLOSEST_NAMESPACE = COMPLEX_TYPE___GET_CLOSEST_NAMESPACE;

	/**
	 * The operation id for the '<em>Compare Field Counts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE___COMPARE_FIELD_COUNTS__ELIST_ELIST = COMPLEX_TYPE___COMPARE_FIELD_COUNTS__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE___HAS_FEATURE__COMPLEXTYPEFEATURE = COMPLEX_TYPE___HAS_FEATURE__COMPLEXTYPEFEATURE;

	/**
	 * The operation id for the '<em>Get Effective Fields</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE___GET_EFFECTIVE_FIELDS = COMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Effective Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE___GET_EFFECTIVE_OPERATIONS = COMPLEX_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Extension Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE___IS_EXTENSION_OF__DATASTRUCTURE = COMPLEX_TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Compare Field Counts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE___COMPARE_FIELD_COUNTS__DATASTRUCTURE = COMPLEX_TYPE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_OPERATION_COUNT = COMPLEX_TYPE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.DataOperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.DataOperationImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getDataOperation()
	 * @generated
	 */
	int DATA_OPERATION = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION__HIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Has No Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION__HAS_NO_RETURN_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION__FEATURES = 3;

	/**
	 * The feature id for the '<em><b>Operation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION__OPERATION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION__PARAMETERS = 5;

	/**
	 * The feature id for the '<em><b>Data Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION__DATA_STRUCTURE = 6;

	/**
	 * The feature id for the '<em><b>Inherited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION__INHERITED = 7;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION___GET_QUALIFIED_NAME_PARTS = 0;

	/**
	 * The operation id for the '<em>Build Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION___BUILD_QUALIFIED_NAME__STRING = 1;

	/**
	 * The operation id for the '<em>Find Eponymous Super Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION___FIND_EPONYMOUS_SUPER_OPERATION = 2;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION___HAS_FEATURE__DATAOPERATIONFEATURE = 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.DataOperationParameterImpl <em>Operation Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.DataOperationParameterImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getDataOperationParameter()
	 * @generated
	 */
	int DATA_OPERATION_PARAMETER = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_PARAMETER__LOWER_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_PARAMETER__UPPER_BOUND = 2;

	/**
	 * The feature id for the '<em><b>Exchange Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_PARAMETER__EXCHANGE_PATTERN = 3;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_PARAMETER__COMPLEX_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Imported Complex Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_PARAMETER__IMPORTED_COMPLEX_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_PARAMETER__PRIMITIVE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Initialization Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_PARAMETER__INITIALIZATION_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_PARAMETER__OPERATION = 8;

	/**
	 * The number of structural features of the '<em>Operation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_PARAMETER_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_PARAMETER___GET_QUALIFIED_NAME_PARTS = 0;

	/**
	 * The operation id for the '<em>Build Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_PARAMETER___BUILD_QUALIFIED_NAME__STRING = 1;

	/**
	 * The operation id for the '<em>Get Effective Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_PARAMETER___GET_EFFECTIVE_TYPE = 2;

	/**
	 * The number of operations of the '<em>Operation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_PARAMETER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.CollectionTypeImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getCollectionType()
	 * @generated
	 */
	int COLLECTION_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__NAME = COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__FEATURES = COMPLEX_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__DATA_MODEL = COMPLEX_TYPE__DATA_MODEL;

	/**
	 * The feature id for the '<em><b>Version</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__VERSION = COMPLEX_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__CONTEXT = COMPLEX_TYPE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__IS_STRUCTURE = COMPLEX_TYPE__IS_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Is Primitive Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__IS_PRIMITIVE_COLLECTION = COMPLEX_TYPE__IS_PRIMITIVE_COLLECTION;

	/**
	 * The feature id for the '<em><b>Is Structured Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__IS_STRUCTURED_COLLECTION = COMPLEX_TYPE__IS_STRUCTURED_COLLECTION;

	/**
	 * The feature id for the '<em><b>Is Enumeration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__IS_ENUMERATION = COMPLEX_TYPE__IS_ENUMERATION;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__PRIMITIVE_TYPE = COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__DATA_FIELDS = COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE___GET_QUALIFIED_NAME_PARTS = COMPLEX_TYPE___GET_QUALIFIED_NAME_PARTS;

	/**
	 * The operation id for the '<em>Build Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE___BUILD_QUALIFIED_NAME__STRING = COMPLEX_TYPE___BUILD_QUALIFIED_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Closest Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE___GET_CLOSEST_NAMESPACE = COMPLEX_TYPE___GET_CLOSEST_NAMESPACE;

	/**
	 * The operation id for the '<em>Compare Field Counts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE___COMPARE_FIELD_COUNTS__ELIST_ELIST = COMPLEX_TYPE___COMPARE_FIELD_COUNTS__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE___HAS_FEATURE__COMPLEXTYPEFEATURE = COMPLEX_TYPE___HAS_FEATURE__COMPLEXTYPEFEATURE;

	/**
	 * The operation id for the '<em>Compare Field Counts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE___COMPARE_FIELD_COUNTS__COLLECTIONTYPE = COMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_OPERATION_COUNT = COMPLEX_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.DataFieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.DataFieldImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getDataField()
	 * @generated
	 */
	int DATA_FIELD = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__HIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__IMMUTABLE = 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__LOWER_BOUND = 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__UPPER_BOUND = 4;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__COMPLEX_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Imported Complex Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__IMPORTED_COMPLEX_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__PRIMITIVE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Initialization Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__INITIALIZATION_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__FEATURES = 9;

	/**
	 * The feature id for the '<em><b>Data Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__DATA_STRUCTURE = 10;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__COLLECTION_TYPE = 11;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Get Effective Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD___GET_EFFECTIVE_TYPE = 0;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD___GET_QUALIFIED_NAME_PARTS = 1;

	/**
	 * The operation id for the '<em>Build Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD___BUILD_QUALIFIED_NAME__STRING = 2;

	/**
	 * The operation id for the '<em>Find Eponymous Super Field</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD___FIND_EPONYMOUS_SUPER_FIELD = 3;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD___HAS_FEATURE__DATAFIELDFEATURE = 4;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.EnumerationImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__FEATURES = COMPLEX_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__DATA_MODEL = COMPLEX_TYPE__DATA_MODEL;

	/**
	 * The feature id for the '<em><b>Version</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__VERSION = COMPLEX_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CONTEXT = COMPLEX_TYPE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__IS_STRUCTURE = COMPLEX_TYPE__IS_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Is Primitive Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__IS_PRIMITIVE_COLLECTION = COMPLEX_TYPE__IS_PRIMITIVE_COLLECTION;

	/**
	 * The feature id for the '<em><b>Is Structured Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__IS_STRUCTURED_COLLECTION = COMPLEX_TYPE__IS_STRUCTURED_COLLECTION;

	/**
	 * The feature id for the '<em><b>Is Enumeration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__IS_ENUMERATION = COMPLEX_TYPE__IS_ENUMERATION;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__FIELDS = COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___GET_QUALIFIED_NAME_PARTS = COMPLEX_TYPE___GET_QUALIFIED_NAME_PARTS;

	/**
	 * The operation id for the '<em>Build Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___BUILD_QUALIFIED_NAME__STRING = COMPLEX_TYPE___BUILD_QUALIFIED_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Closest Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___GET_CLOSEST_NAMESPACE = COMPLEX_TYPE___GET_CLOSEST_NAMESPACE;

	/**
	 * The operation id for the '<em>Compare Field Counts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___COMPARE_FIELD_COUNTS__ELIST_ELIST = COMPLEX_TYPE___COMPARE_FIELD_COUNTS__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___HAS_FEATURE__COMPLEXTYPEFEATURE = COMPLEX_TYPE___HAS_FEATURE__COMPLEXTYPEFEATURE;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = COMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.EnumerationFieldImpl <em>Enumeration Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.EnumerationFieldImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getEnumerationField()
	 * @generated
	 */
	int ENUMERATION_FIELD = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Initialization Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FIELD__INITIALIZATION_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FIELD__ENUMERATION = 2;

	/**
	 * The number of structural features of the '<em>Enumeration Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FIELD_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FIELD___GET_QUALIFIED_NAME_PARTS = 0;

	/**
	 * The operation id for the '<em>Build Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FIELD___BUILD_QUALIFIED_NAME__STRING = 1;

	/**
	 * The number of operations of the '<em>Enumeration Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FIELD_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.ValueSpecificationImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 26;

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
	 * The meta object id for the '{@link lemma.adapted.xcore.data.impl.PrimitiveValueImpl <em>Primitive Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.impl.PrimitiveValueImpl
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveValue()
	 * @generated
	 */
	int PRIMITIVE_VALUE = 27;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE__STRING_VALUE = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE__BOOLEAN_VALUE = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Numeric Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE__NUMERIC_VALUE = VALUE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE__LENGTH = VALUE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Primitive Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___CONTAINS__STRING = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is In Closed Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___IS_IN_CLOSED_SET__BIGDECIMAL_BIGDECIMAL = VALUE_SPECIFICATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Decimals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___HAS_DECIMALS = VALUE_SPECIFICATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Of Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___IS_OF_TYPE__PRIMITIVETYPE = VALUE_SPECIFICATION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Has No Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___HAS_NO_VALUE = VALUE_SPECIFICATION_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>As Value Of Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_VALUE_OF_TYPE__PRIMITIVETYPE = VALUE_SPECIFICATION_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___VALUE_AS_STRING = VALUE_SPECIFICATION_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>As Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_BOOLEAN = VALUE_SPECIFICATION_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>As Byte</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_BYTE = VALUE_SPECIFICATION_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>As Character</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_CHARACTER = VALUE_SPECIFICATION_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>As Double</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_DOUBLE = VALUE_SPECIFICATION_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>As Float</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_FLOAT = VALUE_SPECIFICATION_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>As Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_INTEGER = VALUE_SPECIFICATION_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>As Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_LONG = VALUE_SPECIFICATION_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>As Short</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_SHORT = VALUE_SPECIFICATION_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_STRING = VALUE_SPECIFICATION_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Infer Compatible Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___INFER_COMPATIBLE_TYPES = VALUE_SPECIFICATION_OPERATION_COUNT + 16;

	/**
	 * The number of operations of the '<em>Primitive Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 17;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.PrimitiveTypeConstants <em>Primitive Type Constants</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.PrimitiveTypeConstants
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveTypeConstants()
	 * @generated
	 */
	int PRIMITIVE_TYPE_CONSTANTS = 28;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.ComplexTypeFeature <em>Complex Type Feature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.ComplexTypeFeature
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getComplexTypeFeature()
	 * @generated
	 */
	int COMPLEX_TYPE_FEATURE = 29;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.DataOperationFeature <em>Operation Feature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.DataOperationFeature
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getDataOperationFeature()
	 * @generated
	 */
	int DATA_OPERATION_FEATURE = 30;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.OperationType <em>Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.OperationType
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 31;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.ExchangePattern <em>Exchange Pattern</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.ExchangePattern
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getExchangePattern()
	 * @generated
	 */
	int EXCHANGE_PATTERN = 32;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.data.DataFieldFeature <em>Field Feature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.data.DataFieldFeature
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getDataFieldFeature()
	 * @generated
	 */
	int DATA_FIELD_FEATURE = 33;

	/**
	 * The meta object id for the '<em>Type Name Size Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getTypeNameSizeMap()
	 * @generated
	 */
	int TYPE_NAME_SIZE_MAP = 34;


	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.DataModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see lemma.adapted.xcore.data.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.DataModel#getT_modelUri <em>Tmodel Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tmodel Uri</em>'.
	 * @see lemma.adapted.xcore.data.DataModel#getT_modelUri()
	 * @see #getDataModel()
	 * @generated
	 */
	EAttribute getDataModel_T_modelUri();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.data.DataModel#getComplexTypeImports <em>Complex Type Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Type Imports</em>'.
	 * @see lemma.adapted.xcore.data.DataModel#getComplexTypeImports()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_ComplexTypeImports();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.data.DataModel#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see lemma.adapted.xcore.data.DataModel#getVersions()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Versions();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.data.DataModel#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see lemma.adapted.xcore.data.DataModel#getContexts()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Contexts();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.data.DataModel#getComplexTypes <em>Complex Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Types</em>'.
	 * @see lemma.adapted.xcore.data.DataModel#getComplexTypes()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_ComplexTypes();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.DataModel#getContainedComplexTypes() <em>Get Contained Complex Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contained Complex Types</em>' operation.
	 * @see lemma.adapted.xcore.data.DataModel#getContainedComplexTypes()
	 * @generated
	 */
	EOperation getDataModel__GetContainedComplexTypes();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.ComplexTypeImport <em>Complex Type Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type Import</em>'.
	 * @see lemma.adapted.xcore.data.ComplexTypeImport
	 * @generated
	 */
	EClass getComplexTypeImport();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.ComplexTypeImport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lemma.adapted.xcore.data.ComplexTypeImport#getName()
	 * @see #getComplexTypeImport()
	 * @generated
	 */
	EAttribute getComplexTypeImport_Name();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.ComplexTypeImport#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see lemma.adapted.xcore.data.ComplexTypeImport#getImportURI()
	 * @see #getComplexTypeImport()
	 * @generated
	 */
	EAttribute getComplexTypeImport_ImportURI();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.data.ComplexTypeImport#getDataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Model</em>'.
	 * @see lemma.adapted.xcore.data.ComplexTypeImport#getDataModel()
	 * @see #getComplexTypeImport()
	 * @generated
	 */
	EReference getComplexTypeImport_DataModel();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see lemma.adapted.xcore.data.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.Version#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lemma.adapted.xcore.data.Version#getName()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.data.Version#getComplexTypes <em>Complex Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Types</em>'.
	 * @see lemma.adapted.xcore.data.Version#getComplexTypes()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_ComplexTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.data.Version#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see lemma.adapted.xcore.data.Version#getContexts()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Contexts();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.data.Version#getDataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Model</em>'.
	 * @see lemma.adapted.xcore.data.Version#getDataModel()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_DataModel();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.Version#getContainedComplexTypes() <em>Get Contained Complex Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contained Complex Types</em>' operation.
	 * @see lemma.adapted.xcore.data.Version#getContainedComplexTypes()
	 * @generated
	 */
	EOperation getVersion__GetContainedComplexTypes();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.Version#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see lemma.adapted.xcore.data.Version#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getVersion__GetQualifiedNameParts();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see lemma.adapted.xcore.data.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.Context#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lemma.adapted.xcore.data.Context#getName()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.data.Context#getComplexTypes <em>Complex Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Types</em>'.
	 * @see lemma.adapted.xcore.data.Context#getComplexTypes()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_ComplexTypes();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.data.Context#getDataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Model</em>'.
	 * @see lemma.adapted.xcore.data.Context#getDataModel()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_DataModel();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.data.Context#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Version</em>'.
	 * @see lemma.adapted.xcore.data.Context#getVersion()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Version();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.Context#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see lemma.adapted.xcore.data.Context#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getContext__GetQualifiedNameParts();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.Context#buildQualifiedName(java.lang.String) <em>Build Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Qualified Name</em>' operation.
	 * @see lemma.adapted.xcore.data.Context#buildQualifiedName(java.lang.String)
	 * @generated
	 */
	EOperation getContext__BuildQualifiedName__String();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see lemma.adapted.xcore.data.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.PrimitiveType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveType#getTypeName()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.PrimitiveType#getTypeSize <em>Type Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Size</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveType#getTypeSize()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_TypeSize();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveType#sizeCompare(lemma.adapted.xcore.data.PrimitiveType) <em>Size Compare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Size Compare</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveType#sizeCompare(lemma.adapted.xcore.data.PrimitiveType)
	 * @generated
	 */
	EOperation getPrimitiveType__SizeCompare__PrimitiveType();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveType#isCompatibleWith(lemma.adapted.xcore.data.PrimitiveType) <em>Is Compatible With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Compatible With</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveType#isCompatibleWith(lemma.adapted.xcore.data.PrimitiveType)
	 * @generated
	 */
	EOperation getPrimitiveType__IsCompatibleWith__PrimitiveType();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveType#getBuiltinPrimitiveTypes() <em>Get Builtin Primitive Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Builtin Primitive Types</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveType#getBuiltinPrimitiveTypes()
	 * @generated
	 */
	EOperation getPrimitiveType__GetBuiltinPrimitiveTypes();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.PrimitiveBoolean <em>Primitive Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Boolean</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveBoolean
	 * @generated
	 */
	EClass getPrimitiveBoolean();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.PrimitiveByte <em>Primitive Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Byte</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveByte
	 * @generated
	 */
	EClass getPrimitiveByte();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.PrimitiveCharacter <em>Primitive Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Character</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveCharacter
	 * @generated
	 */
	EClass getPrimitiveCharacter();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.PrimitiveDate <em>Primitive Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Date</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveDate
	 * @generated
	 */
	EClass getPrimitiveDate();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.PrimitiveDouble <em>Primitive Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Double</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveDouble
	 * @generated
	 */
	EClass getPrimitiveDouble();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.PrimitiveFloat <em>Primitive Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Float</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveFloat
	 * @generated
	 */
	EClass getPrimitiveFloat();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.PrimitiveInteger <em>Primitive Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Integer</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveInteger
	 * @generated
	 */
	EClass getPrimitiveInteger();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.PrimitiveLong <em>Primitive Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Long</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveLong
	 * @generated
	 */
	EClass getPrimitiveLong();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.PrimitiveShort <em>Primitive Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Short</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveShort
	 * @generated
	 */
	EClass getPrimitiveShort();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.PrimitiveString <em>Primitive String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive String</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveString
	 * @generated
	 */
	EClass getPrimitiveString();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.PrimitiveUnspecified <em>Primitive Unspecified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Unspecified</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveUnspecified
	 * @generated
	 */
	EClass getPrimitiveUnspecified();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see lemma.adapted.xcore.data.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.ComplexType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lemma.adapted.xcore.data.ComplexType#getName()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Name();

	/**
	 * Returns the meta object for the attribute list '{@link lemma.adapted.xcore.data.ComplexType#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Features</em>'.
	 * @see lemma.adapted.xcore.data.ComplexType#getFeatures()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Features();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.data.ComplexType#getDataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Model</em>'.
	 * @see lemma.adapted.xcore.data.ComplexType#getDataModel()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_DataModel();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.data.ComplexType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Version</em>'.
	 * @see lemma.adapted.xcore.data.ComplexType#getVersion()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Version();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.data.ComplexType#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see lemma.adapted.xcore.data.ComplexType#getContext()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Context();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.ComplexType#isIsStructure <em>Is Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Structure</em>'.
	 * @see lemma.adapted.xcore.data.ComplexType#isIsStructure()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_IsStructure();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.ComplexType#isIsPrimitiveCollection <em>Is Primitive Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Primitive Collection</em>'.
	 * @see lemma.adapted.xcore.data.ComplexType#isIsPrimitiveCollection()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_IsPrimitiveCollection();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.ComplexType#isIsStructuredCollection <em>Is Structured Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Structured Collection</em>'.
	 * @see lemma.adapted.xcore.data.ComplexType#isIsStructuredCollection()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_IsStructuredCollection();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.ComplexType#isIsEnumeration <em>Is Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Enumeration</em>'.
	 * @see lemma.adapted.xcore.data.ComplexType#isIsEnumeration()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_IsEnumeration();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.ComplexType#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see lemma.adapted.xcore.data.ComplexType#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getComplexType__GetQualifiedNameParts();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.ComplexType#buildQualifiedName(java.lang.String) <em>Build Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Qualified Name</em>' operation.
	 * @see lemma.adapted.xcore.data.ComplexType#buildQualifiedName(java.lang.String)
	 * @generated
	 */
	EOperation getComplexType__BuildQualifiedName__String();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.ComplexType#getClosestNamespace() <em>Get Closest Namespace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Closest Namespace</em>' operation.
	 * @see lemma.adapted.xcore.data.ComplexType#getClosestNamespace()
	 * @generated
	 */
	EOperation getComplexType__GetClosestNamespace();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.ComplexType#compareFieldCounts(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Compare Field Counts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare Field Counts</em>' operation.
	 * @see lemma.adapted.xcore.data.ComplexType#compareFieldCounts(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getComplexType__CompareFieldCounts__EList_EList();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.ComplexType#hasFeature(lemma.adapted.xcore.data.ComplexTypeFeature) <em>Has Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Feature</em>' operation.
	 * @see lemma.adapted.xcore.data.ComplexType#hasFeature(lemma.adapted.xcore.data.ComplexTypeFeature)
	 * @generated
	 */
	EOperation getComplexType__HasFeature__ComplexTypeFeature();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.ImportedComplexType <em>Imported Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Complex Type</em>'.
	 * @see lemma.adapted.xcore.data.ImportedComplexType
	 * @generated
	 */
	EClass getImportedComplexType();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.data.ImportedComplexType#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see lemma.adapted.xcore.data.ImportedComplexType#getImport()
	 * @see #getImportedComplexType()
	 * @generated
	 */
	EReference getImportedComplexType_Import();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.data.ImportedComplexType#getImportedType <em>Imported Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Type</em>'.
	 * @see lemma.adapted.xcore.data.ImportedComplexType#getImportedType()
	 * @see #getImportedComplexType()
	 * @generated
	 */
	EReference getImportedComplexType_ImportedType();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.data.ImportedComplexType#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Field</em>'.
	 * @see lemma.adapted.xcore.data.ImportedComplexType#getDataField()
	 * @see #getImportedComplexType()
	 * @generated
	 */
	EReference getImportedComplexType_DataField();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.data.ImportedComplexType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parameter</em>'.
	 * @see lemma.adapted.xcore.data.ImportedComplexType#getParameter()
	 * @see #getImportedComplexType()
	 * @generated
	 */
	EReference getImportedComplexType_Parameter();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.DataStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see lemma.adapted.xcore.data.DataStructure
	 * @generated
	 */
	EClass getDataStructure();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.data.DataStructure#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super</em>'.
	 * @see lemma.adapted.xcore.data.DataStructure#getSuper()
	 * @see #getDataStructure()
	 * @generated
	 */
	EReference getDataStructure_Super();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.data.DataStructure#getDataFields <em>Data Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Fields</em>'.
	 * @see lemma.adapted.xcore.data.DataStructure#getDataFields()
	 * @see #getDataStructure()
	 * @generated
	 */
	EReference getDataStructure_DataFields();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.data.DataStructure#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see lemma.adapted.xcore.data.DataStructure#getOperations()
	 * @see #getDataStructure()
	 * @generated
	 */
	EReference getDataStructure_Operations();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.DataStructure#getEffectiveFields() <em>Get Effective Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effective Fields</em>' operation.
	 * @see lemma.adapted.xcore.data.DataStructure#getEffectiveFields()
	 * @generated
	 */
	EOperation getDataStructure__GetEffectiveFields();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.DataStructure#getEffectiveOperations() <em>Get Effective Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effective Operations</em>' operation.
	 * @see lemma.adapted.xcore.data.DataStructure#getEffectiveOperations()
	 * @generated
	 */
	EOperation getDataStructure__GetEffectiveOperations();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.DataStructure#isExtensionOf(lemma.adapted.xcore.data.DataStructure) <em>Is Extension Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Extension Of</em>' operation.
	 * @see lemma.adapted.xcore.data.DataStructure#isExtensionOf(lemma.adapted.xcore.data.DataStructure)
	 * @generated
	 */
	EOperation getDataStructure__IsExtensionOf__DataStructure();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.DataStructure#compareFieldCounts(lemma.adapted.xcore.data.DataStructure) <em>Compare Field Counts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare Field Counts</em>' operation.
	 * @see lemma.adapted.xcore.data.DataStructure#compareFieldCounts(lemma.adapted.xcore.data.DataStructure)
	 * @generated
	 */
	EOperation getDataStructure__CompareFieldCounts__DataStructure();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.DataOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see lemma.adapted.xcore.data.DataOperation
	 * @generated
	 */
	EClass getDataOperation();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.DataOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lemma.adapted.xcore.data.DataOperation#getName()
	 * @see #getDataOperation()
	 * @generated
	 */
	EAttribute getDataOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.DataOperation#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see lemma.adapted.xcore.data.DataOperation#isHidden()
	 * @see #getDataOperation()
	 * @generated
	 */
	EAttribute getDataOperation_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.DataOperation#isHasNoReturnType <em>Has No Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has No Return Type</em>'.
	 * @see lemma.adapted.xcore.data.DataOperation#isHasNoReturnType()
	 * @see #getDataOperation()
	 * @generated
	 */
	EAttribute getDataOperation_HasNoReturnType();

	/**
	 * Returns the meta object for the attribute list '{@link lemma.adapted.xcore.data.DataOperation#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Features</em>'.
	 * @see lemma.adapted.xcore.data.DataOperation#getFeatures()
	 * @see #getDataOperation()
	 * @generated
	 */
	EAttribute getDataOperation_Features();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.DataOperation#getOperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Type</em>'.
	 * @see lemma.adapted.xcore.data.DataOperation#getOperationType()
	 * @see #getDataOperation()
	 * @generated
	 */
	EAttribute getDataOperation_OperationType();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.data.DataOperation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see lemma.adapted.xcore.data.DataOperation#getParameters()
	 * @see #getDataOperation()
	 * @generated
	 */
	EReference getDataOperation_Parameters();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.data.DataOperation#getDataStructure <em>Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Structure</em>'.
	 * @see lemma.adapted.xcore.data.DataOperation#getDataStructure()
	 * @see #getDataOperation()
	 * @generated
	 */
	EReference getDataOperation_DataStructure();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.DataOperation#isInherited <em>Inherited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited</em>'.
	 * @see lemma.adapted.xcore.data.DataOperation#isInherited()
	 * @see #getDataOperation()
	 * @generated
	 */
	EAttribute getDataOperation_Inherited();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.DataOperation#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see lemma.adapted.xcore.data.DataOperation#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getDataOperation__GetQualifiedNameParts();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.DataOperation#buildQualifiedName(java.lang.String) <em>Build Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Qualified Name</em>' operation.
	 * @see lemma.adapted.xcore.data.DataOperation#buildQualifiedName(java.lang.String)
	 * @generated
	 */
	EOperation getDataOperation__BuildQualifiedName__String();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.DataOperation#findEponymousSuperOperation() <em>Find Eponymous Super Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Eponymous Super Operation</em>' operation.
	 * @see lemma.adapted.xcore.data.DataOperation#findEponymousSuperOperation()
	 * @generated
	 */
	EOperation getDataOperation__FindEponymousSuperOperation();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.DataOperation#hasFeature(lemma.adapted.xcore.data.DataOperationFeature) <em>Has Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Feature</em>' operation.
	 * @see lemma.adapted.xcore.data.DataOperation#hasFeature(lemma.adapted.xcore.data.DataOperationFeature)
	 * @generated
	 */
	EOperation getDataOperation__HasFeature__DataOperationFeature();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.DataOperationParameter <em>Operation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Parameter</em>'.
	 * @see lemma.adapted.xcore.data.DataOperationParameter
	 * @generated
	 */
	EClass getDataOperationParameter();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.DataOperationParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lemma.adapted.xcore.data.DataOperationParameter#getName()
	 * @see #getDataOperationParameter()
	 * @generated
	 */
	EAttribute getDataOperationParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.DataOperationParameter#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see lemma.adapted.xcore.data.DataOperationParameter#getLowerBound()
	 * @see #getDataOperationParameter()
	 * @generated
	 */
	EAttribute getDataOperationParameter_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.DataOperationParameter#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see lemma.adapted.xcore.data.DataOperationParameter#getUpperBound()
	 * @see #getDataOperationParameter()
	 * @generated
	 */
	EAttribute getDataOperationParameter_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.DataOperationParameter#getExchangePattern <em>Exchange Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange Pattern</em>'.
	 * @see lemma.adapted.xcore.data.DataOperationParameter#getExchangePattern()
	 * @see #getDataOperationParameter()
	 * @generated
	 */
	EAttribute getDataOperationParameter_ExchangePattern();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.data.DataOperationParameter#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Complex Type</em>'.
	 * @see lemma.adapted.xcore.data.DataOperationParameter#getComplexType()
	 * @see #getDataOperationParameter()
	 * @generated
	 */
	EReference getDataOperationParameter_ComplexType();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.data.DataOperationParameter#getImportedComplexType <em>Imported Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Complex Type</em>'.
	 * @see lemma.adapted.xcore.data.DataOperationParameter#getImportedComplexType()
	 * @see #getDataOperationParameter()
	 * @generated
	 */
	EReference getDataOperationParameter_ImportedComplexType();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.data.DataOperationParameter#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primitive Type</em>'.
	 * @see lemma.adapted.xcore.data.DataOperationParameter#getPrimitiveType()
	 * @see #getDataOperationParameter()
	 * @generated
	 */
	EReference getDataOperationParameter_PrimitiveType();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.data.DataOperationParameter#getInitializationValue <em>Initialization Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialization Value</em>'.
	 * @see lemma.adapted.xcore.data.DataOperationParameter#getInitializationValue()
	 * @see #getDataOperationParameter()
	 * @generated
	 */
	EReference getDataOperationParameter_InitializationValue();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.data.DataOperationParameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see lemma.adapted.xcore.data.DataOperationParameter#getOperation()
	 * @see #getDataOperationParameter()
	 * @generated
	 */
	EReference getDataOperationParameter_Operation();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.DataOperationParameter#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see lemma.adapted.xcore.data.DataOperationParameter#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getDataOperationParameter__GetQualifiedNameParts();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.DataOperationParameter#buildQualifiedName(java.lang.String) <em>Build Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Qualified Name</em>' operation.
	 * @see lemma.adapted.xcore.data.DataOperationParameter#buildQualifiedName(java.lang.String)
	 * @generated
	 */
	EOperation getDataOperationParameter__BuildQualifiedName__String();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.DataOperationParameter#getEffectiveType() <em>Get Effective Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effective Type</em>' operation.
	 * @see lemma.adapted.xcore.data.DataOperationParameter#getEffectiveType()
	 * @generated
	 */
	EOperation getDataOperationParameter__GetEffectiveType();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see lemma.adapted.xcore.data.CollectionType
	 * @generated
	 */
	EClass getCollectionType();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.data.CollectionType#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primitive Type</em>'.
	 * @see lemma.adapted.xcore.data.CollectionType#getPrimitiveType()
	 * @see #getCollectionType()
	 * @generated
	 */
	EReference getCollectionType_PrimitiveType();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.data.CollectionType#getDataFields <em>Data Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Fields</em>'.
	 * @see lemma.adapted.xcore.data.CollectionType#getDataFields()
	 * @see #getCollectionType()
	 * @generated
	 */
	EReference getCollectionType_DataFields();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.CollectionType#compareFieldCounts(lemma.adapted.xcore.data.CollectionType) <em>Compare Field Counts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare Field Counts</em>' operation.
	 * @see lemma.adapted.xcore.data.CollectionType#compareFieldCounts(lemma.adapted.xcore.data.CollectionType)
	 * @generated
	 */
	EOperation getCollectionType__CompareFieldCounts__CollectionType();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.DataField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see lemma.adapted.xcore.data.DataField
	 * @generated
	 */
	EClass getDataField();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.DataField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lemma.adapted.xcore.data.DataField#getName()
	 * @see #getDataField()
	 * @generated
	 */
	EAttribute getDataField_Name();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.DataField#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see lemma.adapted.xcore.data.DataField#isHidden()
	 * @see #getDataField()
	 * @generated
	 */
	EAttribute getDataField_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.DataField#isImmutable <em>Immutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immutable</em>'.
	 * @see lemma.adapted.xcore.data.DataField#isImmutable()
	 * @see #getDataField()
	 * @generated
	 */
	EAttribute getDataField_Immutable();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.DataField#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see lemma.adapted.xcore.data.DataField#getLowerBound()
	 * @see #getDataField()
	 * @generated
	 */
	EAttribute getDataField_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.DataField#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see lemma.adapted.xcore.data.DataField#getUpperBound()
	 * @see #getDataField()
	 * @generated
	 */
	EAttribute getDataField_UpperBound();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.data.DataField#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Complex Type</em>'.
	 * @see lemma.adapted.xcore.data.DataField#getComplexType()
	 * @see #getDataField()
	 * @generated
	 */
	EReference getDataField_ComplexType();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.data.DataField#getImportedComplexType <em>Imported Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Complex Type</em>'.
	 * @see lemma.adapted.xcore.data.DataField#getImportedComplexType()
	 * @see #getDataField()
	 * @generated
	 */
	EReference getDataField_ImportedComplexType();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.data.DataField#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primitive Type</em>'.
	 * @see lemma.adapted.xcore.data.DataField#getPrimitiveType()
	 * @see #getDataField()
	 * @generated
	 */
	EReference getDataField_PrimitiveType();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.data.DataField#getInitializationValue <em>Initialization Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialization Value</em>'.
	 * @see lemma.adapted.xcore.data.DataField#getInitializationValue()
	 * @see #getDataField()
	 * @generated
	 */
	EReference getDataField_InitializationValue();

	/**
	 * Returns the meta object for the attribute list '{@link lemma.adapted.xcore.data.DataField#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Features</em>'.
	 * @see lemma.adapted.xcore.data.DataField#getFeatures()
	 * @see #getDataField()
	 * @generated
	 */
	EAttribute getDataField_Features();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.data.DataField#getDataStructure <em>Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Structure</em>'.
	 * @see lemma.adapted.xcore.data.DataField#getDataStructure()
	 * @see #getDataField()
	 * @generated
	 */
	EReference getDataField_DataStructure();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.data.DataField#getCollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collection Type</em>'.
	 * @see lemma.adapted.xcore.data.DataField#getCollectionType()
	 * @see #getDataField()
	 * @generated
	 */
	EReference getDataField_CollectionType();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.DataField#getEffectiveType() <em>Get Effective Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effective Type</em>' operation.
	 * @see lemma.adapted.xcore.data.DataField#getEffectiveType()
	 * @generated
	 */
	EOperation getDataField__GetEffectiveType();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.DataField#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see lemma.adapted.xcore.data.DataField#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getDataField__GetQualifiedNameParts();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.DataField#buildQualifiedName(java.lang.String) <em>Build Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Qualified Name</em>' operation.
	 * @see lemma.adapted.xcore.data.DataField#buildQualifiedName(java.lang.String)
	 * @generated
	 */
	EOperation getDataField__BuildQualifiedName__String();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.DataField#findEponymousSuperField() <em>Find Eponymous Super Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Eponymous Super Field</em>' operation.
	 * @see lemma.adapted.xcore.data.DataField#findEponymousSuperField()
	 * @generated
	 */
	EOperation getDataField__FindEponymousSuperField();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.DataField#hasFeature(lemma.adapted.xcore.data.DataFieldFeature) <em>Has Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Feature</em>' operation.
	 * @see lemma.adapted.xcore.data.DataField#hasFeature(lemma.adapted.xcore.data.DataFieldFeature)
	 * @generated
	 */
	EOperation getDataField__HasFeature__DataFieldFeature();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see lemma.adapted.xcore.data.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.data.Enumeration#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see lemma.adapted.xcore.data.Enumeration#getFields()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Fields();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.EnumerationField <em>Enumeration Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Field</em>'.
	 * @see lemma.adapted.xcore.data.EnumerationField
	 * @generated
	 */
	EClass getEnumerationField();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.EnumerationField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lemma.adapted.xcore.data.EnumerationField#getName()
	 * @see #getEnumerationField()
	 * @generated
	 */
	EAttribute getEnumerationField_Name();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.data.EnumerationField#getInitializationValue <em>Initialization Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialization Value</em>'.
	 * @see lemma.adapted.xcore.data.EnumerationField#getInitializationValue()
	 * @see #getEnumerationField()
	 * @generated
	 */
	EReference getEnumerationField_InitializationValue();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.data.EnumerationField#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enumeration</em>'.
	 * @see lemma.adapted.xcore.data.EnumerationField#getEnumeration()
	 * @see #getEnumerationField()
	 * @generated
	 */
	EReference getEnumerationField_Enumeration();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.EnumerationField#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see lemma.adapted.xcore.data.EnumerationField#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getEnumerationField__GetQualifiedNameParts();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.EnumerationField#buildQualifiedName(java.lang.String) <em>Build Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Qualified Name</em>' operation.
	 * @see lemma.adapted.xcore.data.EnumerationField#buildQualifiedName(java.lang.String)
	 * @generated
	 */
	EOperation getEnumerationField__BuildQualifiedName__String();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see lemma.adapted.xcore.data.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.data.PrimitiveValue <em>Primitive Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Value</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveValue
	 * @generated
	 */
	EClass getPrimitiveValue();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.PrimitiveValue#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#getStringValue()
	 * @see #getPrimitiveValue()
	 * @generated
	 */
	EAttribute getPrimitiveValue_StringValue();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.PrimitiveValue#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#getBooleanValue()
	 * @see #getPrimitiveValue()
	 * @generated
	 */
	EAttribute getPrimitiveValue_BooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.PrimitiveValue#getNumericValue <em>Numeric Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numeric Value</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#getNumericValue()
	 * @see #getPrimitiveValue()
	 * @generated
	 */
	EAttribute getPrimitiveValue_NumericValue();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.data.PrimitiveValue#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#getLength()
	 * @see #getPrimitiveValue()
	 * @generated
	 */
	EAttribute getPrimitiveValue_Length();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveValue#contains(java.lang.String) <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#contains(java.lang.String)
	 * @generated
	 */
	EOperation getPrimitiveValue__Contains__String();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveValue#isInClosedSet(java.math.BigDecimal, java.math.BigDecimal) <em>Is In Closed Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is In Closed Set</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#isInClosedSet(java.math.BigDecimal, java.math.BigDecimal)
	 * @generated
	 */
	EOperation getPrimitiveValue__IsInClosedSet__BigDecimal_BigDecimal();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveValue#hasDecimals() <em>Has Decimals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Decimals</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#hasDecimals()
	 * @generated
	 */
	EOperation getPrimitiveValue__HasDecimals();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveValue#isOfType(lemma.adapted.xcore.data.PrimitiveType) <em>Is Of Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Of Type</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#isOfType(lemma.adapted.xcore.data.PrimitiveType)
	 * @generated
	 */
	EOperation getPrimitiveValue__IsOfType__PrimitiveType();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveValue#hasNoValue() <em>Has No Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has No Value</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#hasNoValue()
	 * @generated
	 */
	EOperation getPrimitiveValue__HasNoValue();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveValue#asValueOfType(lemma.adapted.xcore.data.PrimitiveType) <em>As Value Of Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Value Of Type</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#asValueOfType(lemma.adapted.xcore.data.PrimitiveType)
	 * @generated
	 */
	EOperation getPrimitiveValue__AsValueOfType__PrimitiveType();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveValue#valueAsString() <em>Value As String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value As String</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#valueAsString()
	 * @generated
	 */
	EOperation getPrimitiveValue__ValueAsString();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveValue#asBoolean() <em>As Boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Boolean</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#asBoolean()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsBoolean();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveValue#asByte() <em>As Byte</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Byte</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#asByte()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsByte();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveValue#asCharacter() <em>As Character</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Character</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#asCharacter()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsCharacter();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveValue#asDouble() <em>As Double</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Double</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#asDouble()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsDouble();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveValue#asFloat() <em>As Float</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Float</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#asFloat()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsFloat();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveValue#asInteger() <em>As Integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Integer</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#asInteger()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsInteger();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveValue#asLong() <em>As Long</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Long</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#asLong()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsLong();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveValue#asShort() <em>As Short</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Short</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#asShort()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsShort();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveValue#asString() <em>As String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As String</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#asString()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsString();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.data.PrimitiveValue#inferCompatibleTypes() <em>Infer Compatible Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Infer Compatible Types</em>' operation.
	 * @see lemma.adapted.xcore.data.PrimitiveValue#inferCompatibleTypes()
	 * @generated
	 */
	EOperation getPrimitiveValue__InferCompatibleTypes();

	/**
	 * Returns the meta object for enum '{@link lemma.adapted.xcore.data.PrimitiveTypeConstants <em>Primitive Type Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type Constants</em>'.
	 * @see lemma.adapted.xcore.data.PrimitiveTypeConstants
	 * @generated
	 */
	EEnum getPrimitiveTypeConstants();

	/**
	 * Returns the meta object for enum '{@link lemma.adapted.xcore.data.ComplexTypeFeature <em>Complex Type Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Complex Type Feature</em>'.
	 * @see lemma.adapted.xcore.data.ComplexTypeFeature
	 * @generated
	 */
	EEnum getComplexTypeFeature();

	/**
	 * Returns the meta object for enum '{@link lemma.adapted.xcore.data.DataOperationFeature <em>Operation Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Feature</em>'.
	 * @see lemma.adapted.xcore.data.DataOperationFeature
	 * @generated
	 */
	EEnum getDataOperationFeature();

	/**
	 * Returns the meta object for enum '{@link lemma.adapted.xcore.data.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Type</em>'.
	 * @see lemma.adapted.xcore.data.OperationType
	 * @generated
	 */
	EEnum getOperationType();

	/**
	 * Returns the meta object for enum '{@link lemma.adapted.xcore.data.ExchangePattern <em>Exchange Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exchange Pattern</em>'.
	 * @see lemma.adapted.xcore.data.ExchangePattern
	 * @generated
	 */
	EEnum getExchangePattern();

	/**
	 * Returns the meta object for enum '{@link lemma.adapted.xcore.data.DataFieldFeature <em>Field Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Field Feature</em>'.
	 * @see lemma.adapted.xcore.data.DataFieldFeature
	 * @generated
	 */
	EEnum getDataFieldFeature();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Type Name Size Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Name Size Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map&lt;java.lang.String, java.lang.Integer&gt;"
	 * @generated
	 */
	EDataType getTypeNameSizeMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

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
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.DataModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.DataModelImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getDataModel()
		 * @generated
		 */
		EClass DATA_MODEL = eINSTANCE.getDataModel();

		/**
		 * The meta object literal for the '<em><b>Tmodel Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MODEL__TMODEL_URI = eINSTANCE.getDataModel_T_modelUri();

		/**
		 * The meta object literal for the '<em><b>Complex Type Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__COMPLEX_TYPE_IMPORTS = eINSTANCE.getDataModel_ComplexTypeImports();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__VERSIONS = eINSTANCE.getDataModel_Versions();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__CONTEXTS = eINSTANCE.getDataModel_Contexts();

		/**
		 * The meta object literal for the '<em><b>Complex Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__COMPLEX_TYPES = eINSTANCE.getDataModel_ComplexTypes();

		/**
		 * The meta object literal for the '<em><b>Get Contained Complex Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_MODEL___GET_CONTAINED_COMPLEX_TYPES = eINSTANCE.getDataModel__GetContainedComplexTypes();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.ComplexTypeImportImpl <em>Complex Type Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.ComplexTypeImportImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getComplexTypeImport()
		 * @generated
		 */
		EClass COMPLEX_TYPE_IMPORT = eINSTANCE.getComplexTypeImport();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE_IMPORT__NAME = eINSTANCE.getComplexTypeImport_Name();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE_IMPORT__IMPORT_URI = eINSTANCE.getComplexTypeImport_ImportURI();

		/**
		 * The meta object literal for the '<em><b>Data Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE_IMPORT__DATA_MODEL = eINSTANCE.getComplexTypeImport_DataModel();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.VersionImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__NAME = eINSTANCE.getVersion_Name();

		/**
		 * The meta object literal for the '<em><b>Complex Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__COMPLEX_TYPES = eINSTANCE.getVersion_ComplexTypes();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__CONTEXTS = eINSTANCE.getVersion_Contexts();

		/**
		 * The meta object literal for the '<em><b>Data Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__DATA_MODEL = eINSTANCE.getVersion_DataModel();

		/**
		 * The meta object literal for the '<em><b>Get Contained Complex Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION___GET_CONTAINED_COMPLEX_TYPES = eINSTANCE.getVersion__GetContainedComplexTypes();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getVersion__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.ContextImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__NAME = eINSTANCE.getContext_Name();

		/**
		 * The meta object literal for the '<em><b>Complex Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__COMPLEX_TYPES = eINSTANCE.getContext_ComplexTypes();

		/**
		 * The meta object literal for the '<em><b>Data Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__DATA_MODEL = eINSTANCE.getContext_DataModel();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__VERSION = eINSTANCE.getContext_Version();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getContext__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '<em><b>Build Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___BUILD_QUALIFIED_NAME__STRING = eINSTANCE.getContext__BuildQualifiedName__String();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.TypeImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.PrimitiveTypeImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__TYPE_NAME = eINSTANCE.getPrimitiveType_TypeName();

		/**
		 * The meta object literal for the '<em><b>Type Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__TYPE_SIZE = eINSTANCE.getPrimitiveType_TypeSize();

		/**
		 * The meta object literal for the '<em><b>Size Compare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE = eINSTANCE.getPrimitiveType__SizeCompare__PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Is Compatible With</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE = eINSTANCE.getPrimitiveType__IsCompatibleWith__PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Get Builtin Primitive Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES = eINSTANCE.getPrimitiveType__GetBuiltinPrimitiveTypes();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.PrimitiveBooleanImpl <em>Primitive Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.PrimitiveBooleanImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveBoolean()
		 * @generated
		 */
		EClass PRIMITIVE_BOOLEAN = eINSTANCE.getPrimitiveBoolean();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.PrimitiveByteImpl <em>Primitive Byte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.PrimitiveByteImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveByte()
		 * @generated
		 */
		EClass PRIMITIVE_BYTE = eINSTANCE.getPrimitiveByte();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.PrimitiveCharacterImpl <em>Primitive Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.PrimitiveCharacterImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveCharacter()
		 * @generated
		 */
		EClass PRIMITIVE_CHARACTER = eINSTANCE.getPrimitiveCharacter();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.PrimitiveDateImpl <em>Primitive Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.PrimitiveDateImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveDate()
		 * @generated
		 */
		EClass PRIMITIVE_DATE = eINSTANCE.getPrimitiveDate();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.PrimitiveDoubleImpl <em>Primitive Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.PrimitiveDoubleImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveDouble()
		 * @generated
		 */
		EClass PRIMITIVE_DOUBLE = eINSTANCE.getPrimitiveDouble();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.PrimitiveFloatImpl <em>Primitive Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.PrimitiveFloatImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveFloat()
		 * @generated
		 */
		EClass PRIMITIVE_FLOAT = eINSTANCE.getPrimitiveFloat();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.PrimitiveIntegerImpl <em>Primitive Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.PrimitiveIntegerImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveInteger()
		 * @generated
		 */
		EClass PRIMITIVE_INTEGER = eINSTANCE.getPrimitiveInteger();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.PrimitiveLongImpl <em>Primitive Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.PrimitiveLongImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveLong()
		 * @generated
		 */
		EClass PRIMITIVE_LONG = eINSTANCE.getPrimitiveLong();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.PrimitiveShortImpl <em>Primitive Short</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.PrimitiveShortImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveShort()
		 * @generated
		 */
		EClass PRIMITIVE_SHORT = eINSTANCE.getPrimitiveShort();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.PrimitiveStringImpl <em>Primitive String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.PrimitiveStringImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveString()
		 * @generated
		 */
		EClass PRIMITIVE_STRING = eINSTANCE.getPrimitiveString();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.PrimitiveUnspecifiedImpl <em>Primitive Unspecified</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.PrimitiveUnspecifiedImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveUnspecified()
		 * @generated
		 */
		EClass PRIMITIVE_UNSPECIFIED = eINSTANCE.getPrimitiveUnspecified();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.ComplexTypeImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getComplexType()
		 * @generated
		 */
		EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__NAME = eINSTANCE.getComplexType_Name();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__FEATURES = eINSTANCE.getComplexType_Features();

		/**
		 * The meta object literal for the '<em><b>Data Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__DATA_MODEL = eINSTANCE.getComplexType_DataModel();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__VERSION = eINSTANCE.getComplexType_Version();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__CONTEXT = eINSTANCE.getComplexType_Context();

		/**
		 * The meta object literal for the '<em><b>Is Structure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__IS_STRUCTURE = eINSTANCE.getComplexType_IsStructure();

		/**
		 * The meta object literal for the '<em><b>Is Primitive Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__IS_PRIMITIVE_COLLECTION = eINSTANCE.getComplexType_IsPrimitiveCollection();

		/**
		 * The meta object literal for the '<em><b>Is Structured Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__IS_STRUCTURED_COLLECTION = eINSTANCE.getComplexType_IsStructuredCollection();

		/**
		 * The meta object literal for the '<em><b>Is Enumeration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__IS_ENUMERATION = eINSTANCE.getComplexType_IsEnumeration();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_TYPE___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getComplexType__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '<em><b>Build Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_TYPE___BUILD_QUALIFIED_NAME__STRING = eINSTANCE.getComplexType__BuildQualifiedName__String();

		/**
		 * The meta object literal for the '<em><b>Get Closest Namespace</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_TYPE___GET_CLOSEST_NAMESPACE = eINSTANCE.getComplexType__GetClosestNamespace();

		/**
		 * The meta object literal for the '<em><b>Compare Field Counts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_TYPE___COMPARE_FIELD_COUNTS__ELIST_ELIST = eINSTANCE.getComplexType__CompareFieldCounts__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Has Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_TYPE___HAS_FEATURE__COMPLEXTYPEFEATURE = eINSTANCE.getComplexType__HasFeature__ComplexTypeFeature();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.ImportedComplexTypeImpl <em>Imported Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.ImportedComplexTypeImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getImportedComplexType()
		 * @generated
		 */
		EClass IMPORTED_COMPLEX_TYPE = eINSTANCE.getImportedComplexType();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_COMPLEX_TYPE__IMPORT = eINSTANCE.getImportedComplexType_Import();

		/**
		 * The meta object literal for the '<em><b>Imported Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_COMPLEX_TYPE__IMPORTED_TYPE = eINSTANCE.getImportedComplexType_ImportedType();

		/**
		 * The meta object literal for the '<em><b>Data Field</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_COMPLEX_TYPE__DATA_FIELD = eINSTANCE.getImportedComplexType_DataField();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_COMPLEX_TYPE__PARAMETER = eINSTANCE.getImportedComplexType_Parameter();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.DataStructureImpl <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.DataStructureImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getDataStructure()
		 * @generated
		 */
		EClass DATA_STRUCTURE = eINSTANCE.getDataStructure();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STRUCTURE__SUPER = eINSTANCE.getDataStructure_Super();

		/**
		 * The meta object literal for the '<em><b>Data Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STRUCTURE__DATA_FIELDS = eINSTANCE.getDataStructure_DataFields();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STRUCTURE__OPERATIONS = eINSTANCE.getDataStructure_Operations();

		/**
		 * The meta object literal for the '<em><b>Get Effective Fields</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_STRUCTURE___GET_EFFECTIVE_FIELDS = eINSTANCE.getDataStructure__GetEffectiveFields();

		/**
		 * The meta object literal for the '<em><b>Get Effective Operations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_STRUCTURE___GET_EFFECTIVE_OPERATIONS = eINSTANCE.getDataStructure__GetEffectiveOperations();

		/**
		 * The meta object literal for the '<em><b>Is Extension Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_STRUCTURE___IS_EXTENSION_OF__DATASTRUCTURE = eINSTANCE.getDataStructure__IsExtensionOf__DataStructure();

		/**
		 * The meta object literal for the '<em><b>Compare Field Counts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_STRUCTURE___COMPARE_FIELD_COUNTS__DATASTRUCTURE = eINSTANCE.getDataStructure__CompareFieldCounts__DataStructure();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.DataOperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.DataOperationImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getDataOperation()
		 * @generated
		 */
		EClass DATA_OPERATION = eINSTANCE.getDataOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OPERATION__NAME = eINSTANCE.getDataOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OPERATION__HIDDEN = eINSTANCE.getDataOperation_Hidden();

		/**
		 * The meta object literal for the '<em><b>Has No Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OPERATION__HAS_NO_RETURN_TYPE = eINSTANCE.getDataOperation_HasNoReturnType();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OPERATION__FEATURES = eINSTANCE.getDataOperation_Features();

		/**
		 * The meta object literal for the '<em><b>Operation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OPERATION__OPERATION_TYPE = eINSTANCE.getDataOperation_OperationType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OPERATION__PARAMETERS = eINSTANCE.getDataOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Data Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OPERATION__DATA_STRUCTURE = eINSTANCE.getDataOperation_DataStructure();

		/**
		 * The meta object literal for the '<em><b>Inherited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OPERATION__INHERITED = eINSTANCE.getDataOperation_Inherited();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_OPERATION___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getDataOperation__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '<em><b>Build Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_OPERATION___BUILD_QUALIFIED_NAME__STRING = eINSTANCE.getDataOperation__BuildQualifiedName__String();

		/**
		 * The meta object literal for the '<em><b>Find Eponymous Super Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_OPERATION___FIND_EPONYMOUS_SUPER_OPERATION = eINSTANCE.getDataOperation__FindEponymousSuperOperation();

		/**
		 * The meta object literal for the '<em><b>Has Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_OPERATION___HAS_FEATURE__DATAOPERATIONFEATURE = eINSTANCE.getDataOperation__HasFeature__DataOperationFeature();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.DataOperationParameterImpl <em>Operation Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.DataOperationParameterImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getDataOperationParameter()
		 * @generated
		 */
		EClass DATA_OPERATION_PARAMETER = eINSTANCE.getDataOperationParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OPERATION_PARAMETER__NAME = eINSTANCE.getDataOperationParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OPERATION_PARAMETER__LOWER_BOUND = eINSTANCE.getDataOperationParameter_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OPERATION_PARAMETER__UPPER_BOUND = eINSTANCE.getDataOperationParameter_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Exchange Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OPERATION_PARAMETER__EXCHANGE_PATTERN = eINSTANCE.getDataOperationParameter_ExchangePattern();

		/**
		 * The meta object literal for the '<em><b>Complex Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OPERATION_PARAMETER__COMPLEX_TYPE = eINSTANCE.getDataOperationParameter_ComplexType();

		/**
		 * The meta object literal for the '<em><b>Imported Complex Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OPERATION_PARAMETER__IMPORTED_COMPLEX_TYPE = eINSTANCE.getDataOperationParameter_ImportedComplexType();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OPERATION_PARAMETER__PRIMITIVE_TYPE = eINSTANCE.getDataOperationParameter_PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Initialization Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OPERATION_PARAMETER__INITIALIZATION_VALUE = eINSTANCE.getDataOperationParameter_InitializationValue();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OPERATION_PARAMETER__OPERATION = eINSTANCE.getDataOperationParameter_Operation();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_OPERATION_PARAMETER___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getDataOperationParameter__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '<em><b>Build Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_OPERATION_PARAMETER___BUILD_QUALIFIED_NAME__STRING = eINSTANCE.getDataOperationParameter__BuildQualifiedName__String();

		/**
		 * The meta object literal for the '<em><b>Get Effective Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_OPERATION_PARAMETER___GET_EFFECTIVE_TYPE = eINSTANCE.getDataOperationParameter__GetEffectiveType();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.CollectionTypeImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getCollectionType()
		 * @generated
		 */
		EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TYPE__PRIMITIVE_TYPE = eINSTANCE.getCollectionType_PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Data Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TYPE__DATA_FIELDS = eINSTANCE.getCollectionType_DataFields();

		/**
		 * The meta object literal for the '<em><b>Compare Field Counts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLECTION_TYPE___COMPARE_FIELD_COUNTS__COLLECTIONTYPE = eINSTANCE.getCollectionType__CompareFieldCounts__CollectionType();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.DataFieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.DataFieldImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getDataField()
		 * @generated
		 */
		EClass DATA_FIELD = eINSTANCE.getDataField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FIELD__NAME = eINSTANCE.getDataField_Name();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FIELD__HIDDEN = eINSTANCE.getDataField_Hidden();

		/**
		 * The meta object literal for the '<em><b>Immutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FIELD__IMMUTABLE = eINSTANCE.getDataField_Immutable();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FIELD__LOWER_BOUND = eINSTANCE.getDataField_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FIELD__UPPER_BOUND = eINSTANCE.getDataField_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Complex Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FIELD__COMPLEX_TYPE = eINSTANCE.getDataField_ComplexType();

		/**
		 * The meta object literal for the '<em><b>Imported Complex Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FIELD__IMPORTED_COMPLEX_TYPE = eINSTANCE.getDataField_ImportedComplexType();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FIELD__PRIMITIVE_TYPE = eINSTANCE.getDataField_PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Initialization Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FIELD__INITIALIZATION_VALUE = eINSTANCE.getDataField_InitializationValue();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FIELD__FEATURES = eINSTANCE.getDataField_Features();

		/**
		 * The meta object literal for the '<em><b>Data Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FIELD__DATA_STRUCTURE = eINSTANCE.getDataField_DataStructure();

		/**
		 * The meta object literal for the '<em><b>Collection Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FIELD__COLLECTION_TYPE = eINSTANCE.getDataField_CollectionType();

		/**
		 * The meta object literal for the '<em><b>Get Effective Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FIELD___GET_EFFECTIVE_TYPE = eINSTANCE.getDataField__GetEffectiveType();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FIELD___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getDataField__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '<em><b>Build Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FIELD___BUILD_QUALIFIED_NAME__STRING = eINSTANCE.getDataField__BuildQualifiedName__String();

		/**
		 * The meta object literal for the '<em><b>Find Eponymous Super Field</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FIELD___FIND_EPONYMOUS_SUPER_FIELD = eINSTANCE.getDataField__FindEponymousSuperField();

		/**
		 * The meta object literal for the '<em><b>Has Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FIELD___HAS_FEATURE__DATAFIELDFEATURE = eINSTANCE.getDataField__HasFeature__DataFieldFeature();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.EnumerationImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__FIELDS = eINSTANCE.getEnumeration_Fields();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.EnumerationFieldImpl <em>Enumeration Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.EnumerationFieldImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getEnumerationField()
		 * @generated
		 */
		EClass ENUMERATION_FIELD = eINSTANCE.getEnumerationField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_FIELD__NAME = eINSTANCE.getEnumerationField_Name();

		/**
		 * The meta object literal for the '<em><b>Initialization Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_FIELD__INITIALIZATION_VALUE = eINSTANCE.getEnumerationField_InitializationValue();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_FIELD__ENUMERATION = eINSTANCE.getEnumerationField_Enumeration();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION_FIELD___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getEnumerationField__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '<em><b>Build Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION_FIELD___BUILD_QUALIFIED_NAME__STRING = eINSTANCE.getEnumerationField__BuildQualifiedName__String();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.ValueSpecificationImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.impl.PrimitiveValueImpl <em>Primitive Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.impl.PrimitiveValueImpl
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveValue()
		 * @generated
		 */
		EClass PRIMITIVE_VALUE = eINSTANCE.getPrimitiveValue();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_VALUE__STRING_VALUE = eINSTANCE.getPrimitiveValue_StringValue();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_VALUE__BOOLEAN_VALUE = eINSTANCE.getPrimitiveValue_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Numeric Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_VALUE__NUMERIC_VALUE = eINSTANCE.getPrimitiveValue_NumericValue();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_VALUE__LENGTH = eINSTANCE.getPrimitiveValue_Length();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___CONTAINS__STRING = eINSTANCE.getPrimitiveValue__Contains__String();

		/**
		 * The meta object literal for the '<em><b>Is In Closed Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___IS_IN_CLOSED_SET__BIGDECIMAL_BIGDECIMAL = eINSTANCE.getPrimitiveValue__IsInClosedSet__BigDecimal_BigDecimal();

		/**
		 * The meta object literal for the '<em><b>Has Decimals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___HAS_DECIMALS = eINSTANCE.getPrimitiveValue__HasDecimals();

		/**
		 * The meta object literal for the '<em><b>Is Of Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___IS_OF_TYPE__PRIMITIVETYPE = eINSTANCE.getPrimitiveValue__IsOfType__PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Has No Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___HAS_NO_VALUE = eINSTANCE.getPrimitiveValue__HasNoValue();

		/**
		 * The meta object literal for the '<em><b>As Value Of Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_VALUE_OF_TYPE__PRIMITIVETYPE = eINSTANCE.getPrimitiveValue__AsValueOfType__PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Value As String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___VALUE_AS_STRING = eINSTANCE.getPrimitiveValue__ValueAsString();

		/**
		 * The meta object literal for the '<em><b>As Boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_BOOLEAN = eINSTANCE.getPrimitiveValue__AsBoolean();

		/**
		 * The meta object literal for the '<em><b>As Byte</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_BYTE = eINSTANCE.getPrimitiveValue__AsByte();

		/**
		 * The meta object literal for the '<em><b>As Character</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_CHARACTER = eINSTANCE.getPrimitiveValue__AsCharacter();

		/**
		 * The meta object literal for the '<em><b>As Double</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_DOUBLE = eINSTANCE.getPrimitiveValue__AsDouble();

		/**
		 * The meta object literal for the '<em><b>As Float</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_FLOAT = eINSTANCE.getPrimitiveValue__AsFloat();

		/**
		 * The meta object literal for the '<em><b>As Integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_INTEGER = eINSTANCE.getPrimitiveValue__AsInteger();

		/**
		 * The meta object literal for the '<em><b>As Long</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_LONG = eINSTANCE.getPrimitiveValue__AsLong();

		/**
		 * The meta object literal for the '<em><b>As Short</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_SHORT = eINSTANCE.getPrimitiveValue__AsShort();

		/**
		 * The meta object literal for the '<em><b>As String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_STRING = eINSTANCE.getPrimitiveValue__AsString();

		/**
		 * The meta object literal for the '<em><b>Infer Compatible Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___INFER_COMPATIBLE_TYPES = eINSTANCE.getPrimitiveValue__InferCompatibleTypes();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.PrimitiveTypeConstants <em>Primitive Type Constants</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.PrimitiveTypeConstants
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getPrimitiveTypeConstants()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE_CONSTANTS = eINSTANCE.getPrimitiveTypeConstants();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.ComplexTypeFeature <em>Complex Type Feature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.ComplexTypeFeature
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getComplexTypeFeature()
		 * @generated
		 */
		EEnum COMPLEX_TYPE_FEATURE = eINSTANCE.getComplexTypeFeature();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.DataOperationFeature <em>Operation Feature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.DataOperationFeature
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getDataOperationFeature()
		 * @generated
		 */
		EEnum DATA_OPERATION_FEATURE = eINSTANCE.getDataOperationFeature();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.OperationType <em>Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.OperationType
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getOperationType()
		 * @generated
		 */
		EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.ExchangePattern <em>Exchange Pattern</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.ExchangePattern
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getExchangePattern()
		 * @generated
		 */
		EEnum EXCHANGE_PATTERN = eINSTANCE.getExchangePattern();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.data.DataFieldFeature <em>Field Feature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.data.DataFieldFeature
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getDataFieldFeature()
		 * @generated
		 */
		EEnum DATA_FIELD_FEATURE = eINSTANCE.getDataFieldFeature();

		/**
		 * The meta object literal for the '<em>Type Name Size Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see lemma.adapted.xcore.data.impl.DataPackageImpl#getTypeNameSizeMap()
		 * @generated
		 */
		EDataType TYPE_NAME_SIZE_MAP = eINSTANCE.getTypeNameSizeMap();

	}

} //DataPackage

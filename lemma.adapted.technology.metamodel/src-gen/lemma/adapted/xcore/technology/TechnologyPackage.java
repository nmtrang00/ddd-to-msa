/**
 */
package lemma.adapted.xcore.technology;

import lemma.adapted.xcore.data.DataPackage;

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
 * @see lemma.adapted.xcore.technology.TechnologyFactory
 * @model kind="package"
 * @generated
 */
public interface TechnologyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "technology";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/xcore/technology";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "technology";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TechnologyPackage eINSTANCE = lemma.adapted.xcore.technology.impl.TechnologyPackageImpl.init();

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.TechnologyImpl <em>Technology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.TechnologyImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getTechnology()
	 * @generated
	 */
	int TECHNOLOGY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Primitive Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__PRIMITIVE_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__COLLECTION_TYPES = 3;

	/**
	 * The feature id for the '<em><b>Data Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__DATA_STRUCTURES = 4;

	/**
	 * The feature id for the '<em><b>Compatibility Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__COMPATIBILITY_ENTRIES = 5;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__PROTOCOLS = 6;

	/**
	 * The feature id for the '<em><b>Service Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__SERVICE_ASPECTS = 7;

	/**
	 * The feature id for the '<em><b>Deployment Technologies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__DEPLOYMENT_TECHNOLOGIES = 8;

	/**
	 * The feature id for the '<em><b>Infrastructure Technologies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__INFRASTRUCTURE_TECHNOLOGIES = 9;

	/**
	 * The feature id for the '<em><b>Operation Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__OPERATION_ASPECTS = 10;

	/**
	 * The number of structural features of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.TechnologyImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.TechnologyImportImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getTechnologyImport()
	 * @generated
	 */
	int TECHNOLOGY_IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_IMPORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_IMPORT__IMPORT_URI = 1;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_IMPORT__TECHNOLOGY = 2;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_IMPORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.ProtocolImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Communication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__COMMUNICATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__DEFAULT = 2;

	/**
	 * The feature id for the '<em><b>Default Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__DEFAULT_FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Data Formats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__DATA_FORMATS = 4;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__TECHNOLOGY = 5;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL___GET_QUALIFIED_NAME_PARTS = 0;

	/**
	 * The number of operations of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.DataFormatImpl <em>Data Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.DataFormatImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getDataFormat()
	 * @generated
	 */
	int DATA_FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Format Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT__FORMAT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT__PROTOCOL = 1;

	/**
	 * The number of structural features of the '<em>Data Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.TechnologySpecificPrimitiveTypeImpl <em>Specific Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.TechnologySpecificPrimitiveTypeImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getTechnologySpecificPrimitiveType()
	 * @generated
	 */
	int TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__TYPE_NAME = DataPackage.PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__TYPE_SIZE = DataPackage.PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__NAME = DataPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__DEFAULT = DataPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__TECHNOLOGY = DataPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Basic Builtin Primitive Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__BASIC_BUILTIN_PRIMITIVE_TYPES = DataPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Specific Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE_FEATURE_COUNT = DataPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE = DataPackage.PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE = DataPackage.PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES = DataPackage.PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE___GET_QUALIFIED_NAME_PARTS = DataPackage.PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Build Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE___BUILD_QUALIFIED_NAME__STRING = DataPackage.PRIMITIVE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Specific Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE_OPERATION_COUNT = DataPackage.PRIMITIVE_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.TechnologySpecificCollectionTypeImpl <em>Specific Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.TechnologySpecificCollectionTypeImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getTechnologySpecificCollectionType()
	 * @generated
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE__NAME = DataPackage.COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE__FEATURES = DataPackage.COMPLEX_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE__DATA_MODEL = DataPackage.COMPLEX_TYPE__DATA_MODEL;

	/**
	 * The feature id for the '<em><b>Version</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE__VERSION = DataPackage.COMPLEX_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE__CONTEXT = DataPackage.COMPLEX_TYPE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE__IS_STRUCTURE = DataPackage.COMPLEX_TYPE__IS_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Is Primitive Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE__IS_PRIMITIVE_COLLECTION = DataPackage.COMPLEX_TYPE__IS_PRIMITIVE_COLLECTION;

	/**
	 * The feature id for the '<em><b>Is Structured Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE__IS_STRUCTURED_COLLECTION = DataPackage.COMPLEX_TYPE__IS_STRUCTURED_COLLECTION;

	/**
	 * The feature id for the '<em><b>Is Enumeration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE__IS_ENUMERATION = DataPackage.COMPLEX_TYPE__IS_ENUMERATION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE__TECHNOLOGY = DataPackage.COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specific Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE_FEATURE_COUNT = DataPackage.COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Closest Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE___GET_CLOSEST_NAMESPACE = DataPackage.COMPLEX_TYPE___GET_CLOSEST_NAMESPACE;

	/**
	 * The operation id for the '<em>Compare Field Counts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE___COMPARE_FIELD_COUNTS__ELIST_ELIST = DataPackage.COMPLEX_TYPE___COMPARE_FIELD_COUNTS__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE___HAS_FEATURE__COMPLEXTYPEFEATURE = DataPackage.COMPLEX_TYPE___HAS_FEATURE__COMPLEXTYPEFEATURE;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE___GET_QUALIFIED_NAME_PARTS = DataPackage.COMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Build Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE___BUILD_QUALIFIED_NAME__STRING = DataPackage.COMPLEX_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Specific Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_COLLECTION_TYPE_OPERATION_COUNT = DataPackage.COMPLEX_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.TechnologySpecificDataStructureImpl <em>Specific Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.TechnologySpecificDataStructureImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getTechnologySpecificDataStructure()
	 * @generated
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE__NAME = DataPackage.COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE__FEATURES = DataPackage.COMPLEX_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE__DATA_MODEL = DataPackage.COMPLEX_TYPE__DATA_MODEL;

	/**
	 * The feature id for the '<em><b>Version</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE__VERSION = DataPackage.COMPLEX_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE__CONTEXT = DataPackage.COMPLEX_TYPE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE__IS_STRUCTURE = DataPackage.COMPLEX_TYPE__IS_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Is Primitive Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE__IS_PRIMITIVE_COLLECTION = DataPackage.COMPLEX_TYPE__IS_PRIMITIVE_COLLECTION;

	/**
	 * The feature id for the '<em><b>Is Structured Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE__IS_STRUCTURED_COLLECTION = DataPackage.COMPLEX_TYPE__IS_STRUCTURED_COLLECTION;

	/**
	 * The feature id for the '<em><b>Is Enumeration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE__IS_ENUMERATION = DataPackage.COMPLEX_TYPE__IS_ENUMERATION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE__TECHNOLOGY = DataPackage.COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specific Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE_FEATURE_COUNT = DataPackage.COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Closest Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE___GET_CLOSEST_NAMESPACE = DataPackage.COMPLEX_TYPE___GET_CLOSEST_NAMESPACE;

	/**
	 * The operation id for the '<em>Compare Field Counts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE___COMPARE_FIELD_COUNTS__ELIST_ELIST = DataPackage.COMPLEX_TYPE___COMPARE_FIELD_COUNTS__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE___HAS_FEATURE__COMPLEXTYPEFEATURE = DataPackage.COMPLEX_TYPE___HAS_FEATURE__COMPLEXTYPEFEATURE;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE___GET_QUALIFIED_NAME_PARTS = DataPackage.COMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Build Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE___BUILD_QUALIFIED_NAME__STRING = DataPackage.COMPLEX_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Specific Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_DATA_STRUCTURE_OPERATION_COUNT = DataPackage.COMPLEX_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.CompatibilityMatrixEntryImpl <em>Compatibility Matrix Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.CompatibilityMatrixEntryImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getCompatibilityMatrixEntry()
	 * @generated
	 */
	int COMPATIBILITY_MATRIX_ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBILITY_MATRIX_ENTRY__DIRECTION = 0;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBILITY_MATRIX_ENTRY__MAPPING_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Compatible Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBILITY_MATRIX_ENTRY__COMPATIBLE_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBILITY_MATRIX_ENTRY__TECHNOLOGY = 3;

	/**
	 * The number of structural features of the '<em>Compatibility Matrix Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBILITY_MATRIX_ENTRY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Compatibility Matrix Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBILITY_MATRIX_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.PossiblyImportedTechnologySpecificTypeImpl <em>Possibly Imported Technology Specific Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.PossiblyImportedTechnologySpecificTypeImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getPossiblyImportedTechnologySpecificType()
	 * @generated
	 */
	int POSSIBLY_IMPORTED_TECHNOLOGY_SPECIFIC_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_TECHNOLOGY_SPECIFIC_TYPE__IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_TECHNOLOGY_SPECIFIC_TYPE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mapping Entry</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_TECHNOLOGY_SPECIFIC_TYPE__MAPPING_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Compatible Entry</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_TECHNOLOGY_SPECIFIC_TYPE__COMPATIBLE_ENTRY = 3;

	/**
	 * The number of structural features of the '<em>Possibly Imported Technology Specific Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_TECHNOLOGY_SPECIFIC_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Possibly Imported Technology Specific Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_TECHNOLOGY_SPECIFIC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.OperationTechnologyImpl <em>Operation Technology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.OperationTechnologyImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getOperationTechnology()
	 * @generated
	 */
	int OPERATION_TECHNOLOGY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TECHNOLOGY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Operation Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TECHNOLOGY__OPERATION_ENVIRONMENTS = 1;

	/**
	 * The feature id for the '<em><b>Service Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TECHNOLOGY__SERVICE_PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Operation Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TECHNOLOGY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TECHNOLOGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.OperationEnvironmentImpl <em>Operation Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.OperationEnvironmentImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getOperationEnvironment()
	 * @generated
	 */
	int OPERATION_ENVIRONMENT = 10;

	/**
	 * The feature id for the '<em><b>Environment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ENVIRONMENT__ENVIRONMENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ENVIRONMENT__DEFAULT = 1;

	/**
	 * The feature id for the '<em><b>Operation Technology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ENVIRONMENT__OPERATION_TECHNOLOGY = 2;

	/**
	 * The number of structural features of the '<em>Operation Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ENVIRONMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.TechnologySpecificPropertyImpl <em>Specific Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.TechnologySpecificPropertyImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getTechnologySpecificProperty()
	 * @generated
	 */
	int TECHNOLOGY_SPECIFIC_PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PROPERTY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PROPERTY__DEFAULT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PROPERTY__FEATURES = 3;

	/**
	 * The feature id for the '<em><b>Operation Technology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PROPERTY__OPERATION_TECHNOLOGY = 4;

	/**
	 * The feature id for the '<em><b>Technology Aspect</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PROPERTY__TECHNOLOGY_ASPECT = 5;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PROPERTY__IS_MANDATORY = 6;

	/**
	 * The number of structural features of the '<em>Specific Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PROPERTY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Specific Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.TechnologySpecificPropertyValueAssignmentImpl <em>Specific Property Value Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.TechnologySpecificPropertyValueAssignmentImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getTechnologySpecificPropertyValueAssignment()
	 * @generated
	 */
	int TECHNOLOGY_SPECIFIC_PROPERTY_VALUE_ASSIGNMENT = 12;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PROPERTY_VALUE_ASSIGNMENT__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PROPERTY_VALUE_ASSIGNMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Specific Property Value Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PROPERTY_VALUE_ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specific Property Value Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFIC_PROPERTY_VALUE_ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.DeploymentTechnologyImpl <em>Deployment Technology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.DeploymentTechnologyImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getDeploymentTechnology()
	 * @generated
	 */
	int DEPLOYMENT_TECHNOLOGY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TECHNOLOGY__NAME = OPERATION_TECHNOLOGY__NAME;

	/**
	 * The feature id for the '<em><b>Operation Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TECHNOLOGY__OPERATION_ENVIRONMENTS = OPERATION_TECHNOLOGY__OPERATION_ENVIRONMENTS;

	/**
	 * The feature id for the '<em><b>Service Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TECHNOLOGY__SERVICE_PROPERTIES = OPERATION_TECHNOLOGY__SERVICE_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TECHNOLOGY__TECHNOLOGY = OPERATION_TECHNOLOGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deployment Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TECHNOLOGY_FEATURE_COUNT = OPERATION_TECHNOLOGY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TECHNOLOGY___GET_QUALIFIED_NAME_PARTS = OPERATION_TECHNOLOGY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Build Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TECHNOLOGY___BUILD_QUALIFIED_NAME__STRING_BOOLEAN_BOOLEAN = OPERATION_TECHNOLOGY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Deployment Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TECHNOLOGY_OPERATION_COUNT = OPERATION_TECHNOLOGY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.InfrastructureTechnologyImpl <em>Infrastructure Technology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.InfrastructureTechnologyImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getInfrastructureTechnology()
	 * @generated
	 */
	int INFRASTRUCTURE_TECHNOLOGY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_TECHNOLOGY__NAME = OPERATION_TECHNOLOGY__NAME;

	/**
	 * The feature id for the '<em><b>Operation Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_TECHNOLOGY__OPERATION_ENVIRONMENTS = OPERATION_TECHNOLOGY__OPERATION_ENVIRONMENTS;

	/**
	 * The feature id for the '<em><b>Service Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_TECHNOLOGY__SERVICE_PROPERTIES = OPERATION_TECHNOLOGY__SERVICE_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_TECHNOLOGY__TECHNOLOGY = OPERATION_TECHNOLOGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Infrastructure Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_TECHNOLOGY_FEATURE_COUNT = OPERATION_TECHNOLOGY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_TECHNOLOGY___GET_QUALIFIED_NAME_PARTS = OPERATION_TECHNOLOGY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Build Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_TECHNOLOGY___BUILD_QUALIFIED_NAME__STRING_BOOLEAN_BOOLEAN = OPERATION_TECHNOLOGY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Infrastructure Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_TECHNOLOGY_OPERATION_COUNT = OPERATION_TECHNOLOGY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.TechnologyAspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.TechnologyAspectImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getTechnologyAspect()
	 * @generated
	 */
	int TECHNOLOGY_ASPECT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_ASPECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_ASPECT__FEATURES = 1;

	/**
	 * The feature id for the '<em><b>Join Points</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_ASPECT__JOIN_POINTS = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_ASPECT__PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Is Single Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_ASPECT__IS_SINGLE_VALUED = 4;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_ASPECT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_ASPECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.ServiceAspectImpl <em>Service Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.ServiceAspectImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getServiceAspect()
	 * @generated
	 */
	int SERVICE_ASPECT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT__NAME = TECHNOLOGY_ASPECT__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT__FEATURES = TECHNOLOGY_ASPECT__FEATURES;

	/**
	 * The feature id for the '<em><b>Join Points</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT__JOIN_POINTS = TECHNOLOGY_ASPECT__JOIN_POINTS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT__PROPERTIES = TECHNOLOGY_ASPECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Is Single Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT__IS_SINGLE_VALUED = TECHNOLOGY_ASPECT__IS_SINGLE_VALUED;

	/**
	 * The feature id for the '<em><b>Pointcut Selectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT__POINTCUT_SELECTORS = TECHNOLOGY_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT__TECHNOLOGY = TECHNOLOGY_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_FEATURE_COUNT = TECHNOLOGY_ASPECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT___GET_QUALIFIED_NAME_PARTS__BOOLEAN_BOOLEAN = TECHNOLOGY_ASPECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Build Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT___BUILD_QUALIFIED_NAME__STRING_BOOLEAN_BOOLEAN = TECHNOLOGY_ASPECT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Valid Selector For Join Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT___IS_VALID_SELECTOR_FOR_JOIN_POINT__JOINPOINTTYPE_SERVICEASPECTPOINTCUTSELECTOR = TECHNOLOGY_ASPECT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Valid Selector For Join Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT___IS_VALID_SELECTOR_FOR_JOIN_POINT__JOINPOINTTYPE_EXCHANGEPATTERN_COMMUNICATIONTYPE_PROTOCOL_DATAFORMAT = TECHNOLOGY_ASPECT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Has Matching Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT___HAS_MATCHING_SELECTOR__EXCHANGEPATTERN_COMMUNICATIONTYPE_PROTOCOL_DATAFORMAT = TECHNOLOGY_ASPECT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Service Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_OPERATION_COUNT = TECHNOLOGY_ASPECT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.ServiceAspectPointcutImpl <em>Service Aspect Pointcut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.ServiceAspectPointcutImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getServiceAspectPointcut()
	 * @generated
	 */
	int SERVICE_ASPECT_POINTCUT = 17;

	/**
	 * The feature id for the '<em><b>For Exchange Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT__FOR_EXCHANGE_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>For Communication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT__FOR_COMMUNICATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>For Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT__FOR_PROTOCOL = 2;

	/**
	 * The feature id for the '<em><b>For Data Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT__FOR_DATA_FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Exchange Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT__EXCHANGE_PATTERN = 4;

	/**
	 * The feature id for the '<em><b>Communication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT__COMMUNICATION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT__PROTOCOL = 6;

	/**
	 * The feature id for the '<em><b>Data Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT__DATA_FORMAT = 7;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT__SELECTOR = 8;

	/**
	 * The feature id for the '<em><b>Effective Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT__EFFECTIVE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Effective Selector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT__EFFECTIVE_SELECTOR_NAME = 10;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT__EFFECTIVE_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Printable Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT__PRINTABLE_EFFECTIVE_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Ordered Pointcut Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT__ORDERED_POINTCUT_TYPES = 13;

	/**
	 * The number of structural features of the '<em>Service Aspect Pointcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT_FEATURE_COUNT = 14;

	/**
	 * The operation id for the '<em>Is Valid Selector For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT___IS_VALID_SELECTOR_FOR__JOINPOINTTYPE = 0;

	/**
	 * The number of operations of the '<em>Service Aspect Pointcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.ServiceAspectPointcutSelectorImpl <em>Service Aspect Pointcut Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.ServiceAspectPointcutSelectorImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getServiceAspectPointcutSelector()
	 * @generated
	 */
	int SERVICE_ASPECT_POINTCUT_SELECTOR = 18;

	/**
	 * The feature id for the '<em><b>Pointcuts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT_SELECTOR__POINTCUTS = 0;

	/**
	 * The feature id for the '<em><b>Service Aspect</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT_SELECTOR__SERVICE_ASPECT = 1;

	/**
	 * The feature id for the '<em><b>Selector String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT_SELECTOR__SELECTOR_STRING = 2;

	/**
	 * The number of structural features of the '<em>Service Aspect Pointcut Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT_SELECTOR_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Ordered Selector Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT_SELECTOR___ORDERED_SELECTOR_VALUES = 0;

	/**
	 * The number of operations of the '<em>Service Aspect Pointcut Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASPECT_POINTCUT_SELECTOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.OperationAspectImpl <em>Operation Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.OperationAspectImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getOperationAspect()
	 * @generated
	 */
	int OPERATION_ASPECT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT__NAME = TECHNOLOGY_ASPECT__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT__FEATURES = TECHNOLOGY_ASPECT__FEATURES;

	/**
	 * The feature id for the '<em><b>Join Points</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT__JOIN_POINTS = TECHNOLOGY_ASPECT__JOIN_POINTS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT__PROPERTIES = TECHNOLOGY_ASPECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Is Single Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT__IS_SINGLE_VALUED = TECHNOLOGY_ASPECT__IS_SINGLE_VALUED;

	/**
	 * The feature id for the '<em><b>Pointcut Selectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT__POINTCUT_SELECTORS = TECHNOLOGY_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT__TECHNOLOGY = TECHNOLOGY_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_FEATURE_COUNT = TECHNOLOGY_ASPECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT___GET_QUALIFIED_NAME_PARTS__BOOLEAN_BOOLEAN = TECHNOLOGY_ASPECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Build Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT___BUILD_QUALIFIED_NAME__STRING_BOOLEAN_BOOLEAN = TECHNOLOGY_ASPECT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Matching Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT___HAS_MATCHING_SELECTOR__EOBJECT = TECHNOLOGY_ASPECT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_OPERATION_COUNT = TECHNOLOGY_ASPECT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.OperationAspectPointcutImpl <em>Operation Aspect Pointcut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.OperationAspectPointcutImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getOperationAspectPointcut()
	 * @generated
	 */
	int OPERATION_ASPECT_POINTCUT = 20;

	/**
	 * The feature id for the '<em><b>For Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_POINTCUT__FOR_TECHNOLOGY = 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_POINTCUT__TECHNOLOGY = 1;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_POINTCUT__SELECTOR = 2;

	/**
	 * The feature id for the '<em><b>Effective Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_POINTCUT__EFFECTIVE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Effective Selector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_POINTCUT__EFFECTIVE_SELECTOR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_POINTCUT__EFFECTIVE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Printable Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_POINTCUT__PRINTABLE_EFFECTIVE_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Ordered Pointcut Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_POINTCUT__ORDERED_POINTCUT_TYPES = 7;

	/**
	 * The number of structural features of the '<em>Operation Aspect Pointcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_POINTCUT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Operation Aspect Pointcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_POINTCUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.impl.OperationAspectPointcutSelectorImpl <em>Operation Aspect Pointcut Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.impl.OperationAspectPointcutSelectorImpl
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getOperationAspectPointcutSelector()
	 * @generated
	 */
	int OPERATION_ASPECT_POINTCUT_SELECTOR = 21;

	/**
	 * The feature id for the '<em><b>Pointcuts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_POINTCUT_SELECTOR__POINTCUTS = 0;

	/**
	 * The feature id for the '<em><b>Operation Aspect</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_POINTCUT_SELECTOR__OPERATION_ASPECT = 1;

	/**
	 * The feature id for the '<em><b>Selector String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_POINTCUT_SELECTOR__SELECTOR_STRING = 2;

	/**
	 * The number of structural features of the '<em>Operation Aspect Pointcut Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_POINTCUT_SELECTOR_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Ordered Selector Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_POINTCUT_SELECTOR___ORDERED_SELECTOR_VALUES = 0;

	/**
	 * The number of operations of the '<em>Operation Aspect Pointcut Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASPECT_POINTCUT_SELECTOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.ExchangePattern <em>Exchange Pattern</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.ExchangePattern
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getExchangePattern()
	 * @generated
	 */
	int EXCHANGE_PATTERN = 22;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.CommunicationType <em>Communication Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.CommunicationType
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getCommunicationType()
	 * @generated
	 */
	int COMMUNICATION_TYPE = 23;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.CompatibilityDirection <em>Compatibility Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.CompatibilityDirection
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getCompatibilityDirection()
	 * @generated
	 */
	int COMPATIBILITY_DIRECTION = 24;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.PropertyFeature <em>Property Feature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.PropertyFeature
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getPropertyFeature()
	 * @generated
	 */
	int PROPERTY_FEATURE = 25;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.JoinPointType <em>Join Point Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.JoinPointType
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getJoinPointType()
	 * @generated
	 */
	int JOIN_POINT_TYPE = 26;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.PointcutType <em>Pointcut Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.PointcutType
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getPointcutType()
	 * @generated
	 */
	int POINTCUT_TYPE = 27;

	/**
	 * The meta object id for the '{@link lemma.adapted.xcore.technology.AspectFeature <em>Aspect Feature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lemma.adapted.xcore.technology.AspectFeature
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getAspectFeature()
	 * @generated
	 */
	int ASPECT_FEATURE = 28;

	/**
	 * The meta object id for the '<em>Pointcut Type Strings Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getPointcutTypeStringsMap()
	 * @generated
	 */
	int POINTCUT_TYPE_STRINGS_MAP = 29;


	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.Technology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology</em>'.
	 * @see lemma.adapted.xcore.technology.Technology
	 * @generated
	 */
	EClass getTechnology();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.Technology#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lemma.adapted.xcore.technology.Technology#getName()
	 * @see #getTechnology()
	 * @generated
	 */
	EAttribute getTechnology_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.Technology#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see lemma.adapted.xcore.technology.Technology#getImports()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.Technology#getPrimitiveTypes <em>Primitive Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitive Types</em>'.
	 * @see lemma.adapted.xcore.technology.Technology#getPrimitiveTypes()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_PrimitiveTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.Technology#getCollectionTypes <em>Collection Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection Types</em>'.
	 * @see lemma.adapted.xcore.technology.Technology#getCollectionTypes()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_CollectionTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.Technology#getDataStructures <em>Data Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Structures</em>'.
	 * @see lemma.adapted.xcore.technology.Technology#getDataStructures()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_DataStructures();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.Technology#getCompatibilityEntries <em>Compatibility Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compatibility Entries</em>'.
	 * @see lemma.adapted.xcore.technology.Technology#getCompatibilityEntries()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_CompatibilityEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.Technology#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see lemma.adapted.xcore.technology.Technology#getProtocols()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_Protocols();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.Technology#getServiceAspects <em>Service Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Aspects</em>'.
	 * @see lemma.adapted.xcore.technology.Technology#getServiceAspects()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_ServiceAspects();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.Technology#getDeploymentTechnologies <em>Deployment Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment Technologies</em>'.
	 * @see lemma.adapted.xcore.technology.Technology#getDeploymentTechnologies()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_DeploymentTechnologies();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.Technology#getInfrastructureTechnologies <em>Infrastructure Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infrastructure Technologies</em>'.
	 * @see lemma.adapted.xcore.technology.Technology#getInfrastructureTechnologies()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_InfrastructureTechnologies();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.Technology#getOperationAspects <em>Operation Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Aspects</em>'.
	 * @see lemma.adapted.xcore.technology.Technology#getOperationAspects()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_OperationAspects();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.TechnologyImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologyImport
	 * @generated
	 */
	EClass getTechnologyImport();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.TechnologyImport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologyImport#getName()
	 * @see #getTechnologyImport()
	 * @generated
	 */
	EAttribute getTechnologyImport_Name();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.TechnologyImport#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologyImport#getImportURI()
	 * @see #getTechnologyImport()
	 * @generated
	 */
	EAttribute getTechnologyImport_ImportURI();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.TechnologyImport#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Technology</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologyImport#getTechnology()
	 * @see #getTechnologyImport()
	 * @generated
	 */
	EReference getTechnologyImport_Technology();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see lemma.adapted.xcore.technology.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.Protocol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lemma.adapted.xcore.technology.Protocol#getName()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Name();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.Protocol#getCommunicationType <em>Communication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Type</em>'.
	 * @see lemma.adapted.xcore.technology.Protocol#getCommunicationType()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_CommunicationType();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.Protocol#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see lemma.adapted.xcore.technology.Protocol#isDefault()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Default();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.technology.Protocol#getDefaultFormat <em>Default Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Format</em>'.
	 * @see lemma.adapted.xcore.technology.Protocol#getDefaultFormat()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_DefaultFormat();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.Protocol#getDataFormats <em>Data Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Formats</em>'.
	 * @see lemma.adapted.xcore.technology.Protocol#getDataFormats()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_DataFormats();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.Protocol#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Technology</em>'.
	 * @see lemma.adapted.xcore.technology.Protocol#getTechnology()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Technology();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.Protocol#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see lemma.adapted.xcore.technology.Protocol#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getProtocol__GetQualifiedNameParts();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.DataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Format</em>'.
	 * @see lemma.adapted.xcore.technology.DataFormat
	 * @generated
	 */
	EClass getDataFormat();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.DataFormat#getFormatName <em>Format Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Name</em>'.
	 * @see lemma.adapted.xcore.technology.DataFormat#getFormatName()
	 * @see #getDataFormat()
	 * @generated
	 */
	EAttribute getDataFormat_FormatName();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.DataFormat#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Protocol</em>'.
	 * @see lemma.adapted.xcore.technology.DataFormat#getProtocol()
	 * @see #getDataFormat()
	 * @generated
	 */
	EReference getDataFormat_Protocol();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType <em>Specific Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Primitive Type</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType
	 * @generated
	 */
	EClass getTechnologySpecificPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType#getName()
	 * @see #getTechnologySpecificPrimitiveType()
	 * @generated
	 */
	EAttribute getTechnologySpecificPrimitiveType_Name();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType#isDefault()
	 * @see #getTechnologySpecificPrimitiveType()
	 * @generated
	 */
	EAttribute getTechnologySpecificPrimitiveType_Default();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Technology</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType#getTechnology()
	 * @see #getTechnologySpecificPrimitiveType()
	 * @generated
	 */
	EReference getTechnologySpecificPrimitiveType_Technology();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType#getBasicBuiltinPrimitiveTypes <em>Basic Builtin Primitive Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Builtin Primitive Types</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType#getBasicBuiltinPrimitiveTypes()
	 * @see #getTechnologySpecificPrimitiveType()
	 * @generated
	 */
	EReference getTechnologySpecificPrimitiveType_BasicBuiltinPrimitiveTypes();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getTechnologySpecificPrimitiveType__GetQualifiedNameParts();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType#buildQualifiedName(java.lang.String) <em>Build Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Qualified Name</em>' operation.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType#buildQualifiedName(java.lang.String)
	 * @generated
	 */
	EOperation getTechnologySpecificPrimitiveType__BuildQualifiedName__String();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.TechnologySpecificCollectionType <em>Specific Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Collection Type</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificCollectionType
	 * @generated
	 */
	EClass getTechnologySpecificCollectionType();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.TechnologySpecificCollectionType#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Technology</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificCollectionType#getTechnology()
	 * @see #getTechnologySpecificCollectionType()
	 * @generated
	 */
	EReference getTechnologySpecificCollectionType_Technology();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.TechnologySpecificCollectionType#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificCollectionType#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getTechnologySpecificCollectionType__GetQualifiedNameParts();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.TechnologySpecificCollectionType#buildQualifiedName(java.lang.String) <em>Build Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Qualified Name</em>' operation.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificCollectionType#buildQualifiedName(java.lang.String)
	 * @generated
	 */
	EOperation getTechnologySpecificCollectionType__BuildQualifiedName__String();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.TechnologySpecificDataStructure <em>Specific Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Data Structure</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificDataStructure
	 * @generated
	 */
	EClass getTechnologySpecificDataStructure();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.TechnologySpecificDataStructure#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Technology</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificDataStructure#getTechnology()
	 * @see #getTechnologySpecificDataStructure()
	 * @generated
	 */
	EReference getTechnologySpecificDataStructure_Technology();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.TechnologySpecificDataStructure#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificDataStructure#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getTechnologySpecificDataStructure__GetQualifiedNameParts();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.TechnologySpecificDataStructure#buildQualifiedName(java.lang.String) <em>Build Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Qualified Name</em>' operation.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificDataStructure#buildQualifiedName(java.lang.String)
	 * @generated
	 */
	EOperation getTechnologySpecificDataStructure__BuildQualifiedName__String();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.CompatibilityMatrixEntry <em>Compatibility Matrix Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compatibility Matrix Entry</em>'.
	 * @see lemma.adapted.xcore.technology.CompatibilityMatrixEntry
	 * @generated
	 */
	EClass getCompatibilityMatrixEntry();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.CompatibilityMatrixEntry#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see lemma.adapted.xcore.technology.CompatibilityMatrixEntry#getDirection()
	 * @see #getCompatibilityMatrixEntry()
	 * @generated
	 */
	EAttribute getCompatibilityMatrixEntry_Direction();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.technology.CompatibilityMatrixEntry#getMappingType <em>Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping Type</em>'.
	 * @see lemma.adapted.xcore.technology.CompatibilityMatrixEntry#getMappingType()
	 * @see #getCompatibilityMatrixEntry()
	 * @generated
	 */
	EReference getCompatibilityMatrixEntry_MappingType();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.CompatibilityMatrixEntry#getCompatibleTypes <em>Compatible Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compatible Types</em>'.
	 * @see lemma.adapted.xcore.technology.CompatibilityMatrixEntry#getCompatibleTypes()
	 * @see #getCompatibilityMatrixEntry()
	 * @generated
	 */
	EReference getCompatibilityMatrixEntry_CompatibleTypes();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.CompatibilityMatrixEntry#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Technology</em>'.
	 * @see lemma.adapted.xcore.technology.CompatibilityMatrixEntry#getTechnology()
	 * @see #getCompatibilityMatrixEntry()
	 * @generated
	 */
	EReference getCompatibilityMatrixEntry_Technology();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.PossiblyImportedTechnologySpecificType <em>Possibly Imported Technology Specific Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possibly Imported Technology Specific Type</em>'.
	 * @see lemma.adapted.xcore.technology.PossiblyImportedTechnologySpecificType
	 * @generated
	 */
	EClass getPossiblyImportedTechnologySpecificType();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.technology.PossiblyImportedTechnologySpecificType#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see lemma.adapted.xcore.technology.PossiblyImportedTechnologySpecificType#getImport()
	 * @see #getPossiblyImportedTechnologySpecificType()
	 * @generated
	 */
	EReference getPossiblyImportedTechnologySpecificType_Import();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.technology.PossiblyImportedTechnologySpecificType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see lemma.adapted.xcore.technology.PossiblyImportedTechnologySpecificType#getType()
	 * @see #getPossiblyImportedTechnologySpecificType()
	 * @generated
	 */
	EReference getPossiblyImportedTechnologySpecificType_Type();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.PossiblyImportedTechnologySpecificType#getMappingEntry <em>Mapping Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Mapping Entry</em>'.
	 * @see lemma.adapted.xcore.technology.PossiblyImportedTechnologySpecificType#getMappingEntry()
	 * @see #getPossiblyImportedTechnologySpecificType()
	 * @generated
	 */
	EReference getPossiblyImportedTechnologySpecificType_MappingEntry();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.PossiblyImportedTechnologySpecificType#getCompatibleEntry <em>Compatible Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Compatible Entry</em>'.
	 * @see lemma.adapted.xcore.technology.PossiblyImportedTechnologySpecificType#getCompatibleEntry()
	 * @see #getPossiblyImportedTechnologySpecificType()
	 * @generated
	 */
	EReference getPossiblyImportedTechnologySpecificType_CompatibleEntry();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.OperationTechnology <em>Operation Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Technology</em>'.
	 * @see lemma.adapted.xcore.technology.OperationTechnology
	 * @generated
	 */
	EClass getOperationTechnology();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.OperationTechnology#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lemma.adapted.xcore.technology.OperationTechnology#getName()
	 * @see #getOperationTechnology()
	 * @generated
	 */
	EAttribute getOperationTechnology_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.OperationTechnology#getOperationEnvironments <em>Operation Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Environments</em>'.
	 * @see lemma.adapted.xcore.technology.OperationTechnology#getOperationEnvironments()
	 * @see #getOperationTechnology()
	 * @generated
	 */
	EReference getOperationTechnology_OperationEnvironments();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.OperationTechnology#getServiceProperties <em>Service Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Properties</em>'.
	 * @see lemma.adapted.xcore.technology.OperationTechnology#getServiceProperties()
	 * @see #getOperationTechnology()
	 * @generated
	 */
	EReference getOperationTechnology_ServiceProperties();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.OperationEnvironment <em>Operation Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Environment</em>'.
	 * @see lemma.adapted.xcore.technology.OperationEnvironment
	 * @generated
	 */
	EClass getOperationEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.OperationEnvironment#getEnvironmentName <em>Environment Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment Name</em>'.
	 * @see lemma.adapted.xcore.technology.OperationEnvironment#getEnvironmentName()
	 * @see #getOperationEnvironment()
	 * @generated
	 */
	EAttribute getOperationEnvironment_EnvironmentName();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.OperationEnvironment#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see lemma.adapted.xcore.technology.OperationEnvironment#isDefault()
	 * @see #getOperationEnvironment()
	 * @generated
	 */
	EAttribute getOperationEnvironment_Default();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.OperationEnvironment#getOperationTechnology <em>Operation Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation Technology</em>'.
	 * @see lemma.adapted.xcore.technology.OperationEnvironment#getOperationTechnology()
	 * @see #getOperationEnvironment()
	 * @generated
	 */
	EReference getOperationEnvironment_OperationTechnology();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.TechnologySpecificProperty <em>Specific Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Property</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificProperty
	 * @generated
	 */
	EClass getTechnologySpecificProperty();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.TechnologySpecificProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificProperty#getName()
	 * @see #getTechnologySpecificProperty()
	 * @generated
	 */
	EAttribute getTechnologySpecificProperty_Name();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.technology.TechnologySpecificProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificProperty#getType()
	 * @see #getTechnologySpecificProperty()
	 * @generated
	 */
	EReference getTechnologySpecificProperty_Type();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.technology.TechnologySpecificProperty#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificProperty#getDefaultValue()
	 * @see #getTechnologySpecificProperty()
	 * @generated
	 */
	EReference getTechnologySpecificProperty_DefaultValue();

	/**
	 * Returns the meta object for the attribute list '{@link lemma.adapted.xcore.technology.TechnologySpecificProperty#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Features</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificProperty#getFeatures()
	 * @see #getTechnologySpecificProperty()
	 * @generated
	 */
	EAttribute getTechnologySpecificProperty_Features();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.TechnologySpecificProperty#getOperationTechnology <em>Operation Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation Technology</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificProperty#getOperationTechnology()
	 * @see #getTechnologySpecificProperty()
	 * @generated
	 */
	EReference getTechnologySpecificProperty_OperationTechnology();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.TechnologySpecificProperty#getTechnologyAspect <em>Technology Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Technology Aspect</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificProperty#getTechnologyAspect()
	 * @see #getTechnologySpecificProperty()
	 * @generated
	 */
	EReference getTechnologySpecificProperty_TechnologyAspect();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.TechnologySpecificProperty#isIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificProperty#isIsMandatory()
	 * @see #getTechnologySpecificProperty()
	 * @generated
	 */
	EAttribute getTechnologySpecificProperty_IsMandatory();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.TechnologySpecificPropertyValueAssignment <em>Specific Property Value Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Property Value Assignment</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificPropertyValueAssignment
	 * @generated
	 */
	EClass getTechnologySpecificPropertyValueAssignment();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.technology.TechnologySpecificPropertyValueAssignment#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificPropertyValueAssignment#getProperty()
	 * @see #getTechnologySpecificPropertyValueAssignment()
	 * @generated
	 */
	EReference getTechnologySpecificPropertyValueAssignment_Property();

	/**
	 * Returns the meta object for the containment reference '{@link lemma.adapted.xcore.technology.TechnologySpecificPropertyValueAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificPropertyValueAssignment#getValue()
	 * @see #getTechnologySpecificPropertyValueAssignment()
	 * @generated
	 */
	EReference getTechnologySpecificPropertyValueAssignment_Value();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.DeploymentTechnology <em>Deployment Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Technology</em>'.
	 * @see lemma.adapted.xcore.technology.DeploymentTechnology
	 * @generated
	 */
	EClass getDeploymentTechnology();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.DeploymentTechnology#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Technology</em>'.
	 * @see lemma.adapted.xcore.technology.DeploymentTechnology#getTechnology()
	 * @see #getDeploymentTechnology()
	 * @generated
	 */
	EReference getDeploymentTechnology_Technology();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.DeploymentTechnology#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see lemma.adapted.xcore.technology.DeploymentTechnology#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getDeploymentTechnology__GetQualifiedNameParts();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.DeploymentTechnology#buildQualifiedName(java.lang.String, boolean, boolean) <em>Build Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Qualified Name</em>' operation.
	 * @see lemma.adapted.xcore.technology.DeploymentTechnology#buildQualifiedName(java.lang.String, boolean, boolean)
	 * @generated
	 */
	EOperation getDeploymentTechnology__BuildQualifiedName__String_boolean_boolean();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.InfrastructureTechnology <em>Infrastructure Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Technology</em>'.
	 * @see lemma.adapted.xcore.technology.InfrastructureTechnology
	 * @generated
	 */
	EClass getInfrastructureTechnology();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.InfrastructureTechnology#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Technology</em>'.
	 * @see lemma.adapted.xcore.technology.InfrastructureTechnology#getTechnology()
	 * @see #getInfrastructureTechnology()
	 * @generated
	 */
	EReference getInfrastructureTechnology_Technology();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.InfrastructureTechnology#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see lemma.adapted.xcore.technology.InfrastructureTechnology#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getInfrastructureTechnology__GetQualifiedNameParts();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.InfrastructureTechnology#buildQualifiedName(java.lang.String, boolean, boolean) <em>Build Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Qualified Name</em>' operation.
	 * @see lemma.adapted.xcore.technology.InfrastructureTechnology#buildQualifiedName(java.lang.String, boolean, boolean)
	 * @generated
	 */
	EOperation getInfrastructureTechnology__BuildQualifiedName__String_boolean_boolean();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.TechnologyAspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologyAspect
	 * @generated
	 */
	EClass getTechnologyAspect();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.TechnologyAspect#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologyAspect#getName()
	 * @see #getTechnologyAspect()
	 * @generated
	 */
	EAttribute getTechnologyAspect_Name();

	/**
	 * Returns the meta object for the attribute list '{@link lemma.adapted.xcore.technology.TechnologyAspect#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Features</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologyAspect#getFeatures()
	 * @see #getTechnologyAspect()
	 * @generated
	 */
	EAttribute getTechnologyAspect_Features();

	/**
	 * Returns the meta object for the attribute list '{@link lemma.adapted.xcore.technology.TechnologyAspect#getJoinPoints <em>Join Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Join Points</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologyAspect#getJoinPoints()
	 * @see #getTechnologyAspect()
	 * @generated
	 */
	EAttribute getTechnologyAspect_JoinPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.TechnologyAspect#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologyAspect#getProperties()
	 * @see #getTechnologyAspect()
	 * @generated
	 */
	EReference getTechnologyAspect_Properties();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.TechnologyAspect#isIsSingleValued <em>Is Single Valued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Single Valued</em>'.
	 * @see lemma.adapted.xcore.technology.TechnologyAspect#isIsSingleValued()
	 * @see #getTechnologyAspect()
	 * @generated
	 */
	EAttribute getTechnologyAspect_IsSingleValued();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.ServiceAspect <em>Service Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Aspect</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspect
	 * @generated
	 */
	EClass getServiceAspect();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.ServiceAspect#getPointcutSelectors <em>Pointcut Selectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointcut Selectors</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspect#getPointcutSelectors()
	 * @see #getServiceAspect()
	 * @generated
	 */
	EReference getServiceAspect_PointcutSelectors();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.ServiceAspect#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Technology</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspect#getTechnology()
	 * @see #getServiceAspect()
	 * @generated
	 */
	EReference getServiceAspect_Technology();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.ServiceAspect#getQualifiedNameParts(boolean, boolean) <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see lemma.adapted.xcore.technology.ServiceAspect#getQualifiedNameParts(boolean, boolean)
	 * @generated
	 */
	EOperation getServiceAspect__GetQualifiedNameParts__boolean_boolean();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.ServiceAspect#buildQualifiedName(java.lang.String, boolean, boolean) <em>Build Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Qualified Name</em>' operation.
	 * @see lemma.adapted.xcore.technology.ServiceAspect#buildQualifiedName(java.lang.String, boolean, boolean)
	 * @generated
	 */
	EOperation getServiceAspect__BuildQualifiedName__String_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.ServiceAspect#isValidSelectorForJoinPoint(lemma.adapted.xcore.technology.JoinPointType, lemma.adapted.xcore.technology.ServiceAspectPointcutSelector) <em>Is Valid Selector For Join Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Selector For Join Point</em>' operation.
	 * @see lemma.adapted.xcore.technology.ServiceAspect#isValidSelectorForJoinPoint(lemma.adapted.xcore.technology.JoinPointType, lemma.adapted.xcore.technology.ServiceAspectPointcutSelector)
	 * @generated
	 */
	EOperation getServiceAspect__IsValidSelectorForJoinPoint__JoinPointType_ServiceAspectPointcutSelector();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.ServiceAspect#isValidSelectorForJoinPoint(lemma.adapted.xcore.technology.JoinPointType, lemma.adapted.xcore.technology.ExchangePattern, lemma.adapted.xcore.technology.CommunicationType, lemma.adapted.xcore.technology.Protocol, lemma.adapted.xcore.technology.DataFormat) <em>Is Valid Selector For Join Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Selector For Join Point</em>' operation.
	 * @see lemma.adapted.xcore.technology.ServiceAspect#isValidSelectorForJoinPoint(lemma.adapted.xcore.technology.JoinPointType, lemma.adapted.xcore.technology.ExchangePattern, lemma.adapted.xcore.technology.CommunicationType, lemma.adapted.xcore.technology.Protocol, lemma.adapted.xcore.technology.DataFormat)
	 * @generated
	 */
	EOperation getServiceAspect__IsValidSelectorForJoinPoint__JoinPointType_ExchangePattern_CommunicationType_Protocol_DataFormat();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.ServiceAspect#hasMatchingSelector(lemma.adapted.xcore.technology.ExchangePattern, lemma.adapted.xcore.technology.CommunicationType, lemma.adapted.xcore.technology.Protocol, lemma.adapted.xcore.technology.DataFormat) <em>Has Matching Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Matching Selector</em>' operation.
	 * @see lemma.adapted.xcore.technology.ServiceAspect#hasMatchingSelector(lemma.adapted.xcore.technology.ExchangePattern, lemma.adapted.xcore.technology.CommunicationType, lemma.adapted.xcore.technology.Protocol, lemma.adapted.xcore.technology.DataFormat)
	 * @generated
	 */
	EOperation getServiceAspect__HasMatchingSelector__ExchangePattern_CommunicationType_Protocol_DataFormat();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut <em>Service Aspect Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Aspect Pointcut</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut
	 * @generated
	 */
	EClass getServiceAspectPointcut();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut#isForExchangePattern <em>For Exchange Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Exchange Pattern</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut#isForExchangePattern()
	 * @see #getServiceAspectPointcut()
	 * @generated
	 */
	EAttribute getServiceAspectPointcut_ForExchangePattern();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut#isForCommunicationType <em>For Communication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Communication Type</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut#isForCommunicationType()
	 * @see #getServiceAspectPointcut()
	 * @generated
	 */
	EAttribute getServiceAspectPointcut_ForCommunicationType();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut#isForProtocol <em>For Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Protocol</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut#isForProtocol()
	 * @see #getServiceAspectPointcut()
	 * @generated
	 */
	EAttribute getServiceAspectPointcut_ForProtocol();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut#isForDataFormat <em>For Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Data Format</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut#isForDataFormat()
	 * @see #getServiceAspectPointcut()
	 * @generated
	 */
	EAttribute getServiceAspectPointcut_ForDataFormat();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut#getExchangePattern <em>Exchange Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange Pattern</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut#getExchangePattern()
	 * @see #getServiceAspectPointcut()
	 * @generated
	 */
	EAttribute getServiceAspectPointcut_ExchangePattern();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut#getCommunicationType <em>Communication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Type</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut#getCommunicationType()
	 * @see #getServiceAspectPointcut()
	 * @generated
	 */
	EAttribute getServiceAspectPointcut_CommunicationType();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut#getProtocol()
	 * @see #getServiceAspectPointcut()
	 * @generated
	 */
	EReference getServiceAspectPointcut_Protocol();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut#getDataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Format</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut#getDataFormat()
	 * @see #getServiceAspectPointcut()
	 * @generated
	 */
	EReference getServiceAspectPointcut_DataFormat();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Selector</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut#getSelector()
	 * @see #getServiceAspectPointcut()
	 * @generated
	 */
	EReference getServiceAspectPointcut_Selector();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut#getEffectiveType <em>Effective Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Type</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut#getEffectiveType()
	 * @see #getServiceAspectPointcut()
	 * @generated
	 */
	EAttribute getServiceAspectPointcut_EffectiveType();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut#getEffectiveSelectorName <em>Effective Selector Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Selector Name</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut#getEffectiveSelectorName()
	 * @see #getServiceAspectPointcut()
	 * @generated
	 */
	EAttribute getServiceAspectPointcut_EffectiveSelectorName();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut#getEffectiveValue <em>Effective Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Value</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut#getEffectiveValue()
	 * @see #getServiceAspectPointcut()
	 * @generated
	 */
	EAttribute getServiceAspectPointcut_EffectiveValue();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut#getPrintableEffectiveValue <em>Printable Effective Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable Effective Value</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut#getPrintableEffectiveValue()
	 * @see #getServiceAspectPointcut()
	 * @generated
	 */
	EAttribute getServiceAspectPointcut_PrintableEffectiveValue();

	/**
	 * Returns the meta object for the attribute list '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut#getOrderedPointcutTypes <em>Ordered Pointcut Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ordered Pointcut Types</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut#getOrderedPointcutTypes()
	 * @see #getServiceAspectPointcut()
	 * @generated
	 */
	EAttribute getServiceAspectPointcut_OrderedPointcutTypes();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut#isValidSelectorFor(lemma.adapted.xcore.technology.JoinPointType) <em>Is Valid Selector For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Selector For</em>' operation.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut#isValidSelectorFor(lemma.adapted.xcore.technology.JoinPointType)
	 * @generated
	 */
	EOperation getServiceAspectPointcut__IsValidSelectorFor__JoinPointType();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.ServiceAspectPointcutSelector <em>Service Aspect Pointcut Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Aspect Pointcut Selector</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcutSelector
	 * @generated
	 */
	EClass getServiceAspectPointcutSelector();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.ServiceAspectPointcutSelector#getPointcuts <em>Pointcuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointcuts</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcutSelector#getPointcuts()
	 * @see #getServiceAspectPointcutSelector()
	 * @generated
	 */
	EReference getServiceAspectPointcutSelector_Pointcuts();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.ServiceAspectPointcutSelector#getServiceAspect <em>Service Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service Aspect</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcutSelector#getServiceAspect()
	 * @see #getServiceAspectPointcutSelector()
	 * @generated
	 */
	EReference getServiceAspectPointcutSelector_ServiceAspect();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.ServiceAspectPointcutSelector#getSelectorString <em>Selector String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector String</em>'.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcutSelector#getSelectorString()
	 * @see #getServiceAspectPointcutSelector()
	 * @generated
	 */
	EAttribute getServiceAspectPointcutSelector_SelectorString();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.ServiceAspectPointcutSelector#orderedSelectorValues() <em>Ordered Selector Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ordered Selector Values</em>' operation.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcutSelector#orderedSelectorValues()
	 * @generated
	 */
	EOperation getServiceAspectPointcutSelector__OrderedSelectorValues();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.OperationAspect <em>Operation Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Aspect</em>'.
	 * @see lemma.adapted.xcore.technology.OperationAspect
	 * @generated
	 */
	EClass getOperationAspect();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.OperationAspect#getPointcutSelectors <em>Pointcut Selectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointcut Selectors</em>'.
	 * @see lemma.adapted.xcore.technology.OperationAspect#getPointcutSelectors()
	 * @see #getOperationAspect()
	 * @generated
	 */
	EReference getOperationAspect_PointcutSelectors();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.OperationAspect#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Technology</em>'.
	 * @see lemma.adapted.xcore.technology.OperationAspect#getTechnology()
	 * @see #getOperationAspect()
	 * @generated
	 */
	EReference getOperationAspect_Technology();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.OperationAspect#getQualifiedNameParts(boolean, boolean) <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see lemma.adapted.xcore.technology.OperationAspect#getQualifiedNameParts(boolean, boolean)
	 * @generated
	 */
	EOperation getOperationAspect__GetQualifiedNameParts__boolean_boolean();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.OperationAspect#buildQualifiedName(java.lang.String, boolean, boolean) <em>Build Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Qualified Name</em>' operation.
	 * @see lemma.adapted.xcore.technology.OperationAspect#buildQualifiedName(java.lang.String, boolean, boolean)
	 * @generated
	 */
	EOperation getOperationAspect__BuildQualifiedName__String_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.OperationAspect#hasMatchingSelector(org.eclipse.emf.ecore.EObject) <em>Has Matching Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Matching Selector</em>' operation.
	 * @see lemma.adapted.xcore.technology.OperationAspect#hasMatchingSelector(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getOperationAspect__HasMatchingSelector__EObject();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.OperationAspectPointcut <em>Operation Aspect Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Aspect Pointcut</em>'.
	 * @see lemma.adapted.xcore.technology.OperationAspectPointcut
	 * @generated
	 */
	EClass getOperationAspectPointcut();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.OperationAspectPointcut#isForTechnology <em>For Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Technology</em>'.
	 * @see lemma.adapted.xcore.technology.OperationAspectPointcut#isForTechnology()
	 * @see #getOperationAspectPointcut()
	 * @generated
	 */
	EAttribute getOperationAspectPointcut_ForTechnology();

	/**
	 * Returns the meta object for the reference '{@link lemma.adapted.xcore.technology.OperationAspectPointcut#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Technology</em>'.
	 * @see lemma.adapted.xcore.technology.OperationAspectPointcut#getTechnology()
	 * @see #getOperationAspectPointcut()
	 * @generated
	 */
	EReference getOperationAspectPointcut_Technology();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.OperationAspectPointcut#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Selector</em>'.
	 * @see lemma.adapted.xcore.technology.OperationAspectPointcut#getSelector()
	 * @see #getOperationAspectPointcut()
	 * @generated
	 */
	EReference getOperationAspectPointcut_Selector();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.OperationAspectPointcut#getEffectiveType <em>Effective Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Type</em>'.
	 * @see lemma.adapted.xcore.technology.OperationAspectPointcut#getEffectiveType()
	 * @see #getOperationAspectPointcut()
	 * @generated
	 */
	EAttribute getOperationAspectPointcut_EffectiveType();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.OperationAspectPointcut#getEffectiveSelectorName <em>Effective Selector Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Selector Name</em>'.
	 * @see lemma.adapted.xcore.technology.OperationAspectPointcut#getEffectiveSelectorName()
	 * @see #getOperationAspectPointcut()
	 * @generated
	 */
	EAttribute getOperationAspectPointcut_EffectiveSelectorName();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.OperationAspectPointcut#getEffectiveValue <em>Effective Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Value</em>'.
	 * @see lemma.adapted.xcore.technology.OperationAspectPointcut#getEffectiveValue()
	 * @see #getOperationAspectPointcut()
	 * @generated
	 */
	EAttribute getOperationAspectPointcut_EffectiveValue();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.OperationAspectPointcut#getPrintableEffectiveValue <em>Printable Effective Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable Effective Value</em>'.
	 * @see lemma.adapted.xcore.technology.OperationAspectPointcut#getPrintableEffectiveValue()
	 * @see #getOperationAspectPointcut()
	 * @generated
	 */
	EAttribute getOperationAspectPointcut_PrintableEffectiveValue();

	/**
	 * Returns the meta object for the attribute list '{@link lemma.adapted.xcore.technology.OperationAspectPointcut#getOrderedPointcutTypes <em>Ordered Pointcut Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ordered Pointcut Types</em>'.
	 * @see lemma.adapted.xcore.technology.OperationAspectPointcut#getOrderedPointcutTypes()
	 * @see #getOperationAspectPointcut()
	 * @generated
	 */
	EAttribute getOperationAspectPointcut_OrderedPointcutTypes();

	/**
	 * Returns the meta object for class '{@link lemma.adapted.xcore.technology.OperationAspectPointcutSelector <em>Operation Aspect Pointcut Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Aspect Pointcut Selector</em>'.
	 * @see lemma.adapted.xcore.technology.OperationAspectPointcutSelector
	 * @generated
	 */
	EClass getOperationAspectPointcutSelector();

	/**
	 * Returns the meta object for the containment reference list '{@link lemma.adapted.xcore.technology.OperationAspectPointcutSelector#getPointcuts <em>Pointcuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointcuts</em>'.
	 * @see lemma.adapted.xcore.technology.OperationAspectPointcutSelector#getPointcuts()
	 * @see #getOperationAspectPointcutSelector()
	 * @generated
	 */
	EReference getOperationAspectPointcutSelector_Pointcuts();

	/**
	 * Returns the meta object for the container reference '{@link lemma.adapted.xcore.technology.OperationAspectPointcutSelector#getOperationAspect <em>Operation Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation Aspect</em>'.
	 * @see lemma.adapted.xcore.technology.OperationAspectPointcutSelector#getOperationAspect()
	 * @see #getOperationAspectPointcutSelector()
	 * @generated
	 */
	EReference getOperationAspectPointcutSelector_OperationAspect();

	/**
	 * Returns the meta object for the attribute '{@link lemma.adapted.xcore.technology.OperationAspectPointcutSelector#getSelectorString <em>Selector String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector String</em>'.
	 * @see lemma.adapted.xcore.technology.OperationAspectPointcutSelector#getSelectorString()
	 * @see #getOperationAspectPointcutSelector()
	 * @generated
	 */
	EAttribute getOperationAspectPointcutSelector_SelectorString();

	/**
	 * Returns the meta object for the '{@link lemma.adapted.xcore.technology.OperationAspectPointcutSelector#orderedSelectorValues() <em>Ordered Selector Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ordered Selector Values</em>' operation.
	 * @see lemma.adapted.xcore.technology.OperationAspectPointcutSelector#orderedSelectorValues()
	 * @generated
	 */
	EOperation getOperationAspectPointcutSelector__OrderedSelectorValues();

	/**
	 * Returns the meta object for enum '{@link lemma.adapted.xcore.technology.ExchangePattern <em>Exchange Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exchange Pattern</em>'.
	 * @see lemma.adapted.xcore.technology.ExchangePattern
	 * @generated
	 */
	EEnum getExchangePattern();

	/**
	 * Returns the meta object for enum '{@link lemma.adapted.xcore.technology.CommunicationType <em>Communication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Type</em>'.
	 * @see lemma.adapted.xcore.technology.CommunicationType
	 * @generated
	 */
	EEnum getCommunicationType();

	/**
	 * Returns the meta object for enum '{@link lemma.adapted.xcore.technology.CompatibilityDirection <em>Compatibility Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compatibility Direction</em>'.
	 * @see lemma.adapted.xcore.technology.CompatibilityDirection
	 * @generated
	 */
	EEnum getCompatibilityDirection();

	/**
	 * Returns the meta object for enum '{@link lemma.adapted.xcore.technology.PropertyFeature <em>Property Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Feature</em>'.
	 * @see lemma.adapted.xcore.technology.PropertyFeature
	 * @generated
	 */
	EEnum getPropertyFeature();

	/**
	 * Returns the meta object for enum '{@link lemma.adapted.xcore.technology.JoinPointType <em>Join Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Join Point Type</em>'.
	 * @see lemma.adapted.xcore.technology.JoinPointType
	 * @generated
	 */
	EEnum getJoinPointType();

	/**
	 * Returns the meta object for enum '{@link lemma.adapted.xcore.technology.PointcutType <em>Pointcut Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pointcut Type</em>'.
	 * @see lemma.adapted.xcore.technology.PointcutType
	 * @generated
	 */
	EEnum getPointcutType();

	/**
	 * Returns the meta object for enum '{@link lemma.adapted.xcore.technology.AspectFeature <em>Aspect Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aspect Feature</em>'.
	 * @see lemma.adapted.xcore.technology.AspectFeature
	 * @generated
	 */
	EEnum getAspectFeature();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Pointcut Type Strings Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * *
     * Wrapper type for maps that assign a pointcut type to a list of Strings
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Pointcut Type Strings Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map&lt;lemma.adapted.xcore.technology.PointcutType, java.util.List&lt;java.lang.String&gt;&gt;"
	 * @generated
	 */
	EDataType getPointcutTypeStringsMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TechnologyFactory getTechnologyFactory();

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
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.TechnologyImpl <em>Technology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.TechnologyImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getTechnology()
		 * @generated
		 */
		EClass TECHNOLOGY = eINSTANCE.getTechnology();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY__NAME = eINSTANCE.getTechnology_Name();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__IMPORTS = eINSTANCE.getTechnology_Imports();

		/**
		 * The meta object literal for the '<em><b>Primitive Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__PRIMITIVE_TYPES = eINSTANCE.getTechnology_PrimitiveTypes();

		/**
		 * The meta object literal for the '<em><b>Collection Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__COLLECTION_TYPES = eINSTANCE.getTechnology_CollectionTypes();

		/**
		 * The meta object literal for the '<em><b>Data Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__DATA_STRUCTURES = eINSTANCE.getTechnology_DataStructures();

		/**
		 * The meta object literal for the '<em><b>Compatibility Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__COMPATIBILITY_ENTRIES = eINSTANCE.getTechnology_CompatibilityEntries();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__PROTOCOLS = eINSTANCE.getTechnology_Protocols();

		/**
		 * The meta object literal for the '<em><b>Service Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__SERVICE_ASPECTS = eINSTANCE.getTechnology_ServiceAspects();

		/**
		 * The meta object literal for the '<em><b>Deployment Technologies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__DEPLOYMENT_TECHNOLOGIES = eINSTANCE.getTechnology_DeploymentTechnologies();

		/**
		 * The meta object literal for the '<em><b>Infrastructure Technologies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__INFRASTRUCTURE_TECHNOLOGIES = eINSTANCE.getTechnology_InfrastructureTechnologies();

		/**
		 * The meta object literal for the '<em><b>Operation Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__OPERATION_ASPECTS = eINSTANCE.getTechnology_OperationAspects();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.TechnologyImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.TechnologyImportImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getTechnologyImport()
		 * @generated
		 */
		EClass TECHNOLOGY_IMPORT = eINSTANCE.getTechnologyImport();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_IMPORT__NAME = eINSTANCE.getTechnologyImport_Name();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_IMPORT__IMPORT_URI = eINSTANCE.getTechnologyImport_ImportURI();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_IMPORT__TECHNOLOGY = eINSTANCE.getTechnologyImport_Technology();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.ProtocolImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__NAME = eINSTANCE.getProtocol_Name();

		/**
		 * The meta object literal for the '<em><b>Communication Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__COMMUNICATION_TYPE = eINSTANCE.getProtocol_CommunicationType();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__DEFAULT = eINSTANCE.getProtocol_Default();

		/**
		 * The meta object literal for the '<em><b>Default Format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__DEFAULT_FORMAT = eINSTANCE.getProtocol_DefaultFormat();

		/**
		 * The meta object literal for the '<em><b>Data Formats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__DATA_FORMATS = eINSTANCE.getProtocol_DataFormats();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__TECHNOLOGY = eINSTANCE.getProtocol_Technology();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROTOCOL___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getProtocol__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.DataFormatImpl <em>Data Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.DataFormatImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getDataFormat()
		 * @generated
		 */
		EClass DATA_FORMAT = eINSTANCE.getDataFormat();

		/**
		 * The meta object literal for the '<em><b>Format Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FORMAT__FORMAT_NAME = eINSTANCE.getDataFormat_FormatName();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FORMAT__PROTOCOL = eINSTANCE.getDataFormat_Protocol();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.TechnologySpecificPrimitiveTypeImpl <em>Specific Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.TechnologySpecificPrimitiveTypeImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getTechnologySpecificPrimitiveType()
		 * @generated
		 */
		EClass TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE = eINSTANCE.getTechnologySpecificPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__NAME = eINSTANCE.getTechnologySpecificPrimitiveType_Name();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__DEFAULT = eINSTANCE.getTechnologySpecificPrimitiveType_Default();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__TECHNOLOGY = eINSTANCE.getTechnologySpecificPrimitiveType_Technology();

		/**
		 * The meta object literal for the '<em><b>Basic Builtin Primitive Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__BASIC_BUILTIN_PRIMITIVE_TYPES = eINSTANCE.getTechnologySpecificPrimitiveType_BasicBuiltinPrimitiveTypes();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getTechnologySpecificPrimitiveType__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '<em><b>Build Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE___BUILD_QUALIFIED_NAME__STRING = eINSTANCE.getTechnologySpecificPrimitiveType__BuildQualifiedName__String();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.TechnologySpecificCollectionTypeImpl <em>Specific Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.TechnologySpecificCollectionTypeImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getTechnologySpecificCollectionType()
		 * @generated
		 */
		EClass TECHNOLOGY_SPECIFIC_COLLECTION_TYPE = eINSTANCE.getTechnologySpecificCollectionType();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SPECIFIC_COLLECTION_TYPE__TECHNOLOGY = eINSTANCE.getTechnologySpecificCollectionType_Technology();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TECHNOLOGY_SPECIFIC_COLLECTION_TYPE___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getTechnologySpecificCollectionType__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '<em><b>Build Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TECHNOLOGY_SPECIFIC_COLLECTION_TYPE___BUILD_QUALIFIED_NAME__STRING = eINSTANCE.getTechnologySpecificCollectionType__BuildQualifiedName__String();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.TechnologySpecificDataStructureImpl <em>Specific Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.TechnologySpecificDataStructureImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getTechnologySpecificDataStructure()
		 * @generated
		 */
		EClass TECHNOLOGY_SPECIFIC_DATA_STRUCTURE = eINSTANCE.getTechnologySpecificDataStructure();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SPECIFIC_DATA_STRUCTURE__TECHNOLOGY = eINSTANCE.getTechnologySpecificDataStructure_Technology();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TECHNOLOGY_SPECIFIC_DATA_STRUCTURE___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getTechnologySpecificDataStructure__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '<em><b>Build Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TECHNOLOGY_SPECIFIC_DATA_STRUCTURE___BUILD_QUALIFIED_NAME__STRING = eINSTANCE.getTechnologySpecificDataStructure__BuildQualifiedName__String();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.CompatibilityMatrixEntryImpl <em>Compatibility Matrix Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.CompatibilityMatrixEntryImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getCompatibilityMatrixEntry()
		 * @generated
		 */
		EClass COMPATIBILITY_MATRIX_ENTRY = eINSTANCE.getCompatibilityMatrixEntry();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPATIBILITY_MATRIX_ENTRY__DIRECTION = eINSTANCE.getCompatibilityMatrixEntry_Direction();

		/**
		 * The meta object literal for the '<em><b>Mapping Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBILITY_MATRIX_ENTRY__MAPPING_TYPE = eINSTANCE.getCompatibilityMatrixEntry_MappingType();

		/**
		 * The meta object literal for the '<em><b>Compatible Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBILITY_MATRIX_ENTRY__COMPATIBLE_TYPES = eINSTANCE.getCompatibilityMatrixEntry_CompatibleTypes();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBILITY_MATRIX_ENTRY__TECHNOLOGY = eINSTANCE.getCompatibilityMatrixEntry_Technology();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.PossiblyImportedTechnologySpecificTypeImpl <em>Possibly Imported Technology Specific Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.PossiblyImportedTechnologySpecificTypeImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getPossiblyImportedTechnologySpecificType()
		 * @generated
		 */
		EClass POSSIBLY_IMPORTED_TECHNOLOGY_SPECIFIC_TYPE = eINSTANCE.getPossiblyImportedTechnologySpecificType();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLY_IMPORTED_TECHNOLOGY_SPECIFIC_TYPE__IMPORT = eINSTANCE.getPossiblyImportedTechnologySpecificType_Import();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLY_IMPORTED_TECHNOLOGY_SPECIFIC_TYPE__TYPE = eINSTANCE.getPossiblyImportedTechnologySpecificType_Type();

		/**
		 * The meta object literal for the '<em><b>Mapping Entry</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLY_IMPORTED_TECHNOLOGY_SPECIFIC_TYPE__MAPPING_ENTRY = eINSTANCE.getPossiblyImportedTechnologySpecificType_MappingEntry();

		/**
		 * The meta object literal for the '<em><b>Compatible Entry</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLY_IMPORTED_TECHNOLOGY_SPECIFIC_TYPE__COMPATIBLE_ENTRY = eINSTANCE.getPossiblyImportedTechnologySpecificType_CompatibleEntry();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.OperationTechnologyImpl <em>Operation Technology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.OperationTechnologyImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getOperationTechnology()
		 * @generated
		 */
		EClass OPERATION_TECHNOLOGY = eINSTANCE.getOperationTechnology();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_TECHNOLOGY__NAME = eINSTANCE.getOperationTechnology_Name();

		/**
		 * The meta object literal for the '<em><b>Operation Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_TECHNOLOGY__OPERATION_ENVIRONMENTS = eINSTANCE.getOperationTechnology_OperationEnvironments();

		/**
		 * The meta object literal for the '<em><b>Service Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_TECHNOLOGY__SERVICE_PROPERTIES = eINSTANCE.getOperationTechnology_ServiceProperties();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.OperationEnvironmentImpl <em>Operation Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.OperationEnvironmentImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getOperationEnvironment()
		 * @generated
		 */
		EClass OPERATION_ENVIRONMENT = eINSTANCE.getOperationEnvironment();

		/**
		 * The meta object literal for the '<em><b>Environment Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_ENVIRONMENT__ENVIRONMENT_NAME = eINSTANCE.getOperationEnvironment_EnvironmentName();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_ENVIRONMENT__DEFAULT = eINSTANCE.getOperationEnvironment_Default();

		/**
		 * The meta object literal for the '<em><b>Operation Technology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ENVIRONMENT__OPERATION_TECHNOLOGY = eINSTANCE.getOperationEnvironment_OperationTechnology();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.TechnologySpecificPropertyImpl <em>Specific Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.TechnologySpecificPropertyImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getTechnologySpecificProperty()
		 * @generated
		 */
		EClass TECHNOLOGY_SPECIFIC_PROPERTY = eINSTANCE.getTechnologySpecificProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_SPECIFIC_PROPERTY__NAME = eINSTANCE.getTechnologySpecificProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SPECIFIC_PROPERTY__TYPE = eINSTANCE.getTechnologySpecificProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SPECIFIC_PROPERTY__DEFAULT_VALUE = eINSTANCE.getTechnologySpecificProperty_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_SPECIFIC_PROPERTY__FEATURES = eINSTANCE.getTechnologySpecificProperty_Features();

		/**
		 * The meta object literal for the '<em><b>Operation Technology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SPECIFIC_PROPERTY__OPERATION_TECHNOLOGY = eINSTANCE.getTechnologySpecificProperty_OperationTechnology();

		/**
		 * The meta object literal for the '<em><b>Technology Aspect</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SPECIFIC_PROPERTY__TECHNOLOGY_ASPECT = eINSTANCE.getTechnologySpecificProperty_TechnologyAspect();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_SPECIFIC_PROPERTY__IS_MANDATORY = eINSTANCE.getTechnologySpecificProperty_IsMandatory();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.TechnologySpecificPropertyValueAssignmentImpl <em>Specific Property Value Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.TechnologySpecificPropertyValueAssignmentImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getTechnologySpecificPropertyValueAssignment()
		 * @generated
		 */
		EClass TECHNOLOGY_SPECIFIC_PROPERTY_VALUE_ASSIGNMENT = eINSTANCE.getTechnologySpecificPropertyValueAssignment();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SPECIFIC_PROPERTY_VALUE_ASSIGNMENT__PROPERTY = eINSTANCE.getTechnologySpecificPropertyValueAssignment_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SPECIFIC_PROPERTY_VALUE_ASSIGNMENT__VALUE = eINSTANCE.getTechnologySpecificPropertyValueAssignment_Value();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.DeploymentTechnologyImpl <em>Deployment Technology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.DeploymentTechnologyImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getDeploymentTechnology()
		 * @generated
		 */
		EClass DEPLOYMENT_TECHNOLOGY = eINSTANCE.getDeploymentTechnology();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_TECHNOLOGY__TECHNOLOGY = eINSTANCE.getDeploymentTechnology_Technology();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPLOYMENT_TECHNOLOGY___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getDeploymentTechnology__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '<em><b>Build Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPLOYMENT_TECHNOLOGY___BUILD_QUALIFIED_NAME__STRING_BOOLEAN_BOOLEAN = eINSTANCE.getDeploymentTechnology__BuildQualifiedName__String_boolean_boolean();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.InfrastructureTechnologyImpl <em>Infrastructure Technology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.InfrastructureTechnologyImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getInfrastructureTechnology()
		 * @generated
		 */
		EClass INFRASTRUCTURE_TECHNOLOGY = eINSTANCE.getInfrastructureTechnology();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_TECHNOLOGY__TECHNOLOGY = eINSTANCE.getInfrastructureTechnology_Technology();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFRASTRUCTURE_TECHNOLOGY___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getInfrastructureTechnology__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '<em><b>Build Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFRASTRUCTURE_TECHNOLOGY___BUILD_QUALIFIED_NAME__STRING_BOOLEAN_BOOLEAN = eINSTANCE.getInfrastructureTechnology__BuildQualifiedName__String_boolean_boolean();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.TechnologyAspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.TechnologyAspectImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getTechnologyAspect()
		 * @generated
		 */
		EClass TECHNOLOGY_ASPECT = eINSTANCE.getTechnologyAspect();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_ASPECT__NAME = eINSTANCE.getTechnologyAspect_Name();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_ASPECT__FEATURES = eINSTANCE.getTechnologyAspect_Features();

		/**
		 * The meta object literal for the '<em><b>Join Points</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_ASPECT__JOIN_POINTS = eINSTANCE.getTechnologyAspect_JoinPoints();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_ASPECT__PROPERTIES = eINSTANCE.getTechnologyAspect_Properties();

		/**
		 * The meta object literal for the '<em><b>Is Single Valued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_ASPECT__IS_SINGLE_VALUED = eINSTANCE.getTechnologyAspect_IsSingleValued();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.ServiceAspectImpl <em>Service Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.ServiceAspectImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getServiceAspect()
		 * @generated
		 */
		EClass SERVICE_ASPECT = eINSTANCE.getServiceAspect();

		/**
		 * The meta object literal for the '<em><b>Pointcut Selectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_ASPECT__POINTCUT_SELECTORS = eINSTANCE.getServiceAspect_PointcutSelectors();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_ASPECT__TECHNOLOGY = eINSTANCE.getServiceAspect_Technology();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_ASPECT___GET_QUALIFIED_NAME_PARTS__BOOLEAN_BOOLEAN = eINSTANCE.getServiceAspect__GetQualifiedNameParts__boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Build Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_ASPECT___BUILD_QUALIFIED_NAME__STRING_BOOLEAN_BOOLEAN = eINSTANCE.getServiceAspect__BuildQualifiedName__String_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Is Valid Selector For Join Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_ASPECT___IS_VALID_SELECTOR_FOR_JOIN_POINT__JOINPOINTTYPE_SERVICEASPECTPOINTCUTSELECTOR = eINSTANCE.getServiceAspect__IsValidSelectorForJoinPoint__JoinPointType_ServiceAspectPointcutSelector();

		/**
		 * The meta object literal for the '<em><b>Is Valid Selector For Join Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_ASPECT___IS_VALID_SELECTOR_FOR_JOIN_POINT__JOINPOINTTYPE_EXCHANGEPATTERN_COMMUNICATIONTYPE_PROTOCOL_DATAFORMAT = eINSTANCE.getServiceAspect__IsValidSelectorForJoinPoint__JoinPointType_ExchangePattern_CommunicationType_Protocol_DataFormat();

		/**
		 * The meta object literal for the '<em><b>Has Matching Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_ASPECT___HAS_MATCHING_SELECTOR__EXCHANGEPATTERN_COMMUNICATIONTYPE_PROTOCOL_DATAFORMAT = eINSTANCE.getServiceAspect__HasMatchingSelector__ExchangePattern_CommunicationType_Protocol_DataFormat();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.ServiceAspectPointcutImpl <em>Service Aspect Pointcut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.ServiceAspectPointcutImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getServiceAspectPointcut()
		 * @generated
		 */
		EClass SERVICE_ASPECT_POINTCUT = eINSTANCE.getServiceAspectPointcut();

		/**
		 * The meta object literal for the '<em><b>For Exchange Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ASPECT_POINTCUT__FOR_EXCHANGE_PATTERN = eINSTANCE.getServiceAspectPointcut_ForExchangePattern();

		/**
		 * The meta object literal for the '<em><b>For Communication Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ASPECT_POINTCUT__FOR_COMMUNICATION_TYPE = eINSTANCE.getServiceAspectPointcut_ForCommunicationType();

		/**
		 * The meta object literal for the '<em><b>For Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ASPECT_POINTCUT__FOR_PROTOCOL = eINSTANCE.getServiceAspectPointcut_ForProtocol();

		/**
		 * The meta object literal for the '<em><b>For Data Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ASPECT_POINTCUT__FOR_DATA_FORMAT = eINSTANCE.getServiceAspectPointcut_ForDataFormat();

		/**
		 * The meta object literal for the '<em><b>Exchange Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ASPECT_POINTCUT__EXCHANGE_PATTERN = eINSTANCE.getServiceAspectPointcut_ExchangePattern();

		/**
		 * The meta object literal for the '<em><b>Communication Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ASPECT_POINTCUT__COMMUNICATION_TYPE = eINSTANCE.getServiceAspectPointcut_CommunicationType();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_ASPECT_POINTCUT__PROTOCOL = eINSTANCE.getServiceAspectPointcut_Protocol();

		/**
		 * The meta object literal for the '<em><b>Data Format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_ASPECT_POINTCUT__DATA_FORMAT = eINSTANCE.getServiceAspectPointcut_DataFormat();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_ASPECT_POINTCUT__SELECTOR = eINSTANCE.getServiceAspectPointcut_Selector();

		/**
		 * The meta object literal for the '<em><b>Effective Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ASPECT_POINTCUT__EFFECTIVE_TYPE = eINSTANCE.getServiceAspectPointcut_EffectiveType();

		/**
		 * The meta object literal for the '<em><b>Effective Selector Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ASPECT_POINTCUT__EFFECTIVE_SELECTOR_NAME = eINSTANCE.getServiceAspectPointcut_EffectiveSelectorName();

		/**
		 * The meta object literal for the '<em><b>Effective Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ASPECT_POINTCUT__EFFECTIVE_VALUE = eINSTANCE.getServiceAspectPointcut_EffectiveValue();

		/**
		 * The meta object literal for the '<em><b>Printable Effective Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ASPECT_POINTCUT__PRINTABLE_EFFECTIVE_VALUE = eINSTANCE.getServiceAspectPointcut_PrintableEffectiveValue();

		/**
		 * The meta object literal for the '<em><b>Ordered Pointcut Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ASPECT_POINTCUT__ORDERED_POINTCUT_TYPES = eINSTANCE.getServiceAspectPointcut_OrderedPointcutTypes();

		/**
		 * The meta object literal for the '<em><b>Is Valid Selector For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_ASPECT_POINTCUT___IS_VALID_SELECTOR_FOR__JOINPOINTTYPE = eINSTANCE.getServiceAspectPointcut__IsValidSelectorFor__JoinPointType();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.ServiceAspectPointcutSelectorImpl <em>Service Aspect Pointcut Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.ServiceAspectPointcutSelectorImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getServiceAspectPointcutSelector()
		 * @generated
		 */
		EClass SERVICE_ASPECT_POINTCUT_SELECTOR = eINSTANCE.getServiceAspectPointcutSelector();

		/**
		 * The meta object literal for the '<em><b>Pointcuts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_ASPECT_POINTCUT_SELECTOR__POINTCUTS = eINSTANCE.getServiceAspectPointcutSelector_Pointcuts();

		/**
		 * The meta object literal for the '<em><b>Service Aspect</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_ASPECT_POINTCUT_SELECTOR__SERVICE_ASPECT = eINSTANCE.getServiceAspectPointcutSelector_ServiceAspect();

		/**
		 * The meta object literal for the '<em><b>Selector String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ASPECT_POINTCUT_SELECTOR__SELECTOR_STRING = eINSTANCE.getServiceAspectPointcutSelector_SelectorString();

		/**
		 * The meta object literal for the '<em><b>Ordered Selector Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_ASPECT_POINTCUT_SELECTOR___ORDERED_SELECTOR_VALUES = eINSTANCE.getServiceAspectPointcutSelector__OrderedSelectorValues();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.OperationAspectImpl <em>Operation Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.OperationAspectImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getOperationAspect()
		 * @generated
		 */
		EClass OPERATION_ASPECT = eINSTANCE.getOperationAspect();

		/**
		 * The meta object literal for the '<em><b>Pointcut Selectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ASPECT__POINTCUT_SELECTORS = eINSTANCE.getOperationAspect_PointcutSelectors();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ASPECT__TECHNOLOGY = eINSTANCE.getOperationAspect_Technology();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION_ASPECT___GET_QUALIFIED_NAME_PARTS__BOOLEAN_BOOLEAN = eINSTANCE.getOperationAspect__GetQualifiedNameParts__boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Build Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION_ASPECT___BUILD_QUALIFIED_NAME__STRING_BOOLEAN_BOOLEAN = eINSTANCE.getOperationAspect__BuildQualifiedName__String_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Has Matching Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION_ASPECT___HAS_MATCHING_SELECTOR__EOBJECT = eINSTANCE.getOperationAspect__HasMatchingSelector__EObject();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.OperationAspectPointcutImpl <em>Operation Aspect Pointcut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.OperationAspectPointcutImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getOperationAspectPointcut()
		 * @generated
		 */
		EClass OPERATION_ASPECT_POINTCUT = eINSTANCE.getOperationAspectPointcut();

		/**
		 * The meta object literal for the '<em><b>For Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_ASPECT_POINTCUT__FOR_TECHNOLOGY = eINSTANCE.getOperationAspectPointcut_ForTechnology();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ASPECT_POINTCUT__TECHNOLOGY = eINSTANCE.getOperationAspectPointcut_Technology();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ASPECT_POINTCUT__SELECTOR = eINSTANCE.getOperationAspectPointcut_Selector();

		/**
		 * The meta object literal for the '<em><b>Effective Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_ASPECT_POINTCUT__EFFECTIVE_TYPE = eINSTANCE.getOperationAspectPointcut_EffectiveType();

		/**
		 * The meta object literal for the '<em><b>Effective Selector Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_ASPECT_POINTCUT__EFFECTIVE_SELECTOR_NAME = eINSTANCE.getOperationAspectPointcut_EffectiveSelectorName();

		/**
		 * The meta object literal for the '<em><b>Effective Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_ASPECT_POINTCUT__EFFECTIVE_VALUE = eINSTANCE.getOperationAspectPointcut_EffectiveValue();

		/**
		 * The meta object literal for the '<em><b>Printable Effective Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_ASPECT_POINTCUT__PRINTABLE_EFFECTIVE_VALUE = eINSTANCE.getOperationAspectPointcut_PrintableEffectiveValue();

		/**
		 * The meta object literal for the '<em><b>Ordered Pointcut Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_ASPECT_POINTCUT__ORDERED_POINTCUT_TYPES = eINSTANCE.getOperationAspectPointcut_OrderedPointcutTypes();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.impl.OperationAspectPointcutSelectorImpl <em>Operation Aspect Pointcut Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.impl.OperationAspectPointcutSelectorImpl
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getOperationAspectPointcutSelector()
		 * @generated
		 */
		EClass OPERATION_ASPECT_POINTCUT_SELECTOR = eINSTANCE.getOperationAspectPointcutSelector();

		/**
		 * The meta object literal for the '<em><b>Pointcuts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ASPECT_POINTCUT_SELECTOR__POINTCUTS = eINSTANCE.getOperationAspectPointcutSelector_Pointcuts();

		/**
		 * The meta object literal for the '<em><b>Operation Aspect</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ASPECT_POINTCUT_SELECTOR__OPERATION_ASPECT = eINSTANCE.getOperationAspectPointcutSelector_OperationAspect();

		/**
		 * The meta object literal for the '<em><b>Selector String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_ASPECT_POINTCUT_SELECTOR__SELECTOR_STRING = eINSTANCE.getOperationAspectPointcutSelector_SelectorString();

		/**
		 * The meta object literal for the '<em><b>Ordered Selector Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION_ASPECT_POINTCUT_SELECTOR___ORDERED_SELECTOR_VALUES = eINSTANCE.getOperationAspectPointcutSelector__OrderedSelectorValues();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.ExchangePattern <em>Exchange Pattern</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.ExchangePattern
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getExchangePattern()
		 * @generated
		 */
		EEnum EXCHANGE_PATTERN = eINSTANCE.getExchangePattern();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.CommunicationType <em>Communication Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.CommunicationType
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getCommunicationType()
		 * @generated
		 */
		EEnum COMMUNICATION_TYPE = eINSTANCE.getCommunicationType();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.CompatibilityDirection <em>Compatibility Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.CompatibilityDirection
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getCompatibilityDirection()
		 * @generated
		 */
		EEnum COMPATIBILITY_DIRECTION = eINSTANCE.getCompatibilityDirection();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.PropertyFeature <em>Property Feature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.PropertyFeature
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getPropertyFeature()
		 * @generated
		 */
		EEnum PROPERTY_FEATURE = eINSTANCE.getPropertyFeature();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.JoinPointType <em>Join Point Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.JoinPointType
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getJoinPointType()
		 * @generated
		 */
		EEnum JOIN_POINT_TYPE = eINSTANCE.getJoinPointType();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.PointcutType <em>Pointcut Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.PointcutType
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getPointcutType()
		 * @generated
		 */
		EEnum POINTCUT_TYPE = eINSTANCE.getPointcutType();

		/**
		 * The meta object literal for the '{@link lemma.adapted.xcore.technology.AspectFeature <em>Aspect Feature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lemma.adapted.xcore.technology.AspectFeature
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getAspectFeature()
		 * @generated
		 */
		EEnum ASPECT_FEATURE = eINSTANCE.getAspectFeature();

		/**
		 * The meta object literal for the '<em>Pointcut Type Strings Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see lemma.adapted.xcore.technology.impl.TechnologyPackageImpl#getPointcutTypeStringsMap()
		 * @generated
		 */
		EDataType POINTCUT_TYPE_STRINGS_MAP = eINSTANCE.getPointcutTypeStringsMap();

	}

} //TechnologyPackage

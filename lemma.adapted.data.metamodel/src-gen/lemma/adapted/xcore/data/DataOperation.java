/**
 */
package lemma.adapted.xcore.data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Represents an operation within a data structure
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.data.DataOperation#getName <em>Name</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.DataOperation#isHidden <em>Hidden</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.DataOperation#isHasNoReturnType <em>Has No Return Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.DataOperation#getFeatures <em>Features</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.DataOperation#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.DataOperation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.DataOperation#getDataStructure <em>Data Structure</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.DataOperation#isInherited <em>Inherited</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.data.DataPackage#getDataOperation()
 * @model
 * @generated
 */
public interface DataOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Implicit Constraints:
	 *     (C1) The operation must have a return type specification (which can be a complex return
	 *          type, a primitive return type, or an _explicit_ specification that the operation has
	 *          no return type) if either no operation with an equal name exists in a super data
	 *          structure, or if an eponymous super operation exists that is hidden.
	 *          Ensured by: DSL validator.
	 *     (C2) If an eponymous super operation exists that is not hidden, than this operation must
	 *          not have a return type specification, i.e., a visible super operation cannot be
	 *          redefined in a sub-structure.
	 *          Ensured by: DSL validator.
	 *     (C3) Name must be unique within a data structure.
	 *          Ensured by: DSL validator.
	 * ADAPTED: Return Type is specified via Params!!!
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lemma.adapted.xcore.data.DataPackage#getDataOperation_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.DataOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden</em>' attribute.
	 * @see #setHidden(boolean)
	 * @see lemma.adapted.xcore.data.DataPackage#getDataOperation_Hidden()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHidden();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.DataOperation#isHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden</em>' attribute.
	 * @see #isHidden()
	 * @generated
	 */
	void setHidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Has No Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has No Return Type</em>' attribute.
	 * @see #setHasNoReturnType(boolean)
	 * @see lemma.adapted.xcore.data.DataPackage#getDataOperation_HasNoReturnType()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHasNoReturnType();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.DataOperation#isHasNoReturnType <em>Has No Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has No Return Type</em>' attribute.
	 * @see #isHasNoReturnType()
	 * @generated
	 */
	void setHasNoReturnType(boolean value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' attribute list.
	 * The list contents are of type {@link lemma.adapted.xcore.data.DataOperationFeature}.
	 * The literals are from the enumeration {@link lemma.adapted.xcore.data.DataOperationFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' attribute list.
	 * @see lemma.adapted.xcore.data.DataOperationFeature
	 * @see lemma.adapted.xcore.data.DataPackage#getDataOperation_Features()
	 * @model unique="false"
	 * @generated
	 */
	EList<DataOperationFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link lemma.adapted.xcore.data.OperationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see lemma.adapted.xcore.data.OperationType
	 * @see #setOperationType(OperationType)
	 * @see lemma.adapted.xcore.data.DataPackage#getDataOperation_OperationType()
	 * @model unique="false"
	 * @generated
	 */
	OperationType getOperationType();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.DataOperation#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see lemma.adapted.xcore.data.OperationType
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(OperationType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.data.DataOperationParameter}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.data.DataOperationParameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see lemma.adapted.xcore.data.DataPackage#getDataOperation_Parameters()
	 * @see lemma.adapted.xcore.data.DataOperationParameter#getOperation
	 * @model opposite="operation" containment="true"
	 * @generated
	 */
	EList<DataOperationParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Data Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.data.DataStructure#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Structure</em>' container reference.
	 * @see #setDataStructure(DataStructure)
	 * @see lemma.adapted.xcore.data.DataPackage#getDataOperation_DataStructure()
	 * @see lemma.adapted.xcore.data.DataStructure#getOperations
	 * @model opposite="operations" transient="false"
	 * @generated
	 */
	DataStructure getDataStructure();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.DataOperation#getDataStructure <em>Data Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Structure</em>' container reference.
	 * @see #getDataStructure()
	 * @generated
	 */
	void setDataStructure(DataStructure value);

	/**
	 * Returns the value of the '<em><b>Inherited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Flag to indicate that this operation lacks a return type specification, i.e., it was not
	 * explicitly specified as having no return type and also does not return a primitive or complex
	 * type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherited</em>' attribute.
	 * @see lemma.adapted.xcore.data.DataPackage#getDataOperation_Inherited()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isInherited();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Get parts of the operation for creating a qualified name
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<String> getQualifiedNameParts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Build qualified name from qualified name parts
	 * <!-- end-model-doc -->
	 * @model unique="false" separatorUnique="false"
	 * @generated
	 */
	String buildQualifiedName(String separator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Find an eponymous operation in the inheritance hierarchy of this operations's data structure.
	 * Returns null, if this operation is not part of a data structure, as only data structures may
	 * extend other data structures.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	DataOperation findEponymousSuperOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Get the return type of the operation, if any. Will return null if the operation has no
	 * primitive or complex type.
	 * <!-- end-model-doc -->
	 * @model unique="false" featureUnique="false"
	 * @generated
	 */
	boolean hasFeature(DataOperationFeature feature);

} // DataOperation

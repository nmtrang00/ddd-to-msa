/**
 */
package lemma.adapted.xcore.data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.data.DataOperationParameter#getName <em>Name</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.DataOperationParameter#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.DataOperationParameter#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.DataOperationParameter#getExchangePattern <em>Exchange Pattern</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.DataOperationParameter#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.DataOperationParameter#getImportedComplexType <em>Imported Complex Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.DataOperationParameter#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.DataOperationParameter#getInitializationValue <em>Initialization Value</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.DataOperationParameter#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.data.DataPackage#getDataOperationParameter()
 * @model
 * @generated
 */
public interface DataOperationParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Implicit Constraints:
	 *     (C1) Must have exactly one type, either imported or primitive.
	 *          Ensured by: DSL grammar.
	 *     (C2) Imported types may only come from a data model.
	 *          Ensured by: DSL scope provider.
	 *     (C3) Name must be unique.
	 *          Ensured by: DSL validator.
	 * ADAPTED:
	 *     - Added lowerBound + upperBound for collection size. Direction is to distinguish the input and output
	 *     - Added Initialization Value for primitive parameter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lemma.adapted.xcore.data.DataPackage#getDataOperationParameter_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.DataOperationParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(Integer)
	 * @see lemma.adapted.xcore.data.DataPackage#getDataOperationParameter_LowerBound()
	 * @model unique="false"
	 * @generated
	 */
	Integer getLowerBound();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.DataOperationParameter#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Integer value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(Integer)
	 * @see lemma.adapted.xcore.data.DataPackage#getDataOperationParameter_UpperBound()
	 * @model unique="false"
	 * @generated
	 */
	Integer getUpperBound();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.DataOperationParameter#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Integer value);

	/**
	 * Returns the value of the '<em><b>Exchange Pattern</b></em>' attribute.
	 * The literals are from the enumeration {@link lemma.adapted.xcore.data.ExchangePattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Pattern</em>' attribute.
	 * @see lemma.adapted.xcore.data.ExchangePattern
	 * @see #setExchangePattern(ExchangePattern)
	 * @see lemma.adapted.xcore.data.DataPackage#getDataOperationParameter_ExchangePattern()
	 * @model unique="false"
	 * @generated
	 */
	ExchangePattern getExchangePattern();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.DataOperationParameter#getExchangePattern <em>Exchange Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Pattern</em>' attribute.
	 * @see lemma.adapted.xcore.data.ExchangePattern
	 * @see #getExchangePattern()
	 * @generated
	 */
	void setExchangePattern(ExchangePattern value);

	/**
	 * Returns the value of the '<em><b>Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Type</em>' reference.
	 * @see #setComplexType(ComplexType)
	 * @see lemma.adapted.xcore.data.DataPackage#getDataOperationParameter_ComplexType()
	 * @model
	 * @generated
	 */
	ComplexType getComplexType();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.DataOperationParameter#getComplexType <em>Complex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Type</em>' reference.
	 * @see #getComplexType()
	 * @generated
	 */
	void setComplexType(ComplexType value);

	/**
	 * Returns the value of the '<em><b>Imported Complex Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.data.ImportedComplexType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Complex Type</em>' containment reference.
	 * @see #setImportedComplexType(ImportedComplexType)
	 * @see lemma.adapted.xcore.data.DataPackage#getDataOperationParameter_ImportedComplexType()
	 * @see lemma.adapted.xcore.data.ImportedComplexType#getParameter
	 * @model opposite="parameter" containment="true"
	 * @generated
	 */
	ImportedComplexType getImportedComplexType();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.DataOperationParameter#getImportedComplexType <em>Imported Complex Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Complex Type</em>' containment reference.
	 * @see #getImportedComplexType()
	 * @generated
	 */
	void setImportedComplexType(ImportedComplexType value);

	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type</em>' containment reference.
	 * @see #setPrimitiveType(PrimitiveType)
	 * @see lemma.adapted.xcore.data.DataPackage#getDataOperationParameter_PrimitiveType()
	 * @model containment="true"
	 * @generated
	 */
	PrimitiveType getPrimitiveType();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.DataOperationParameter#getPrimitiveType <em>Primitive Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' containment reference.
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Initialization Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialization Value</em>' containment reference.
	 * @see #setInitializationValue(PrimitiveValue)
	 * @see lemma.adapted.xcore.data.DataPackage#getDataOperationParameter_InitializationValue()
	 * @model containment="true"
	 * @generated
	 */
	PrimitiveValue getInitializationValue();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.DataOperationParameter#getInitializationValue <em>Initialization Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialization Value</em>' containment reference.
	 * @see #getInitializationValue()
	 * @generated
	 */
	void setInitializationValue(PrimitiveValue value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.data.DataOperation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(DataOperation)
	 * @see lemma.adapted.xcore.data.DataPackage#getDataOperationParameter_Operation()
	 * @see lemma.adapted.xcore.data.DataOperation#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	DataOperation getOperation();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.DataOperationParameter#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(DataOperation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Get parts of the parameter for creating a qualified name
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
	 * Get effective type of parameter, i.e., the primitive or imported type (null otherwise)
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	Type getEffectiveType();

} // DataOperationParameter

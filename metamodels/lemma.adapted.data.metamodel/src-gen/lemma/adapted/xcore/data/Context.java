/**
 */
package lemma.adapted.xcore.data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Next to a version, a context may act as an additional, possibly subordinate, naming scope to
 * organize complex types
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.data.Context#getName <em>Name</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.Context#getComplexTypes <em>Complex Types</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.Context#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.Context#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.data.DataPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Implicit Constraints:
	 *     (C1) Name must be unique.
	 *          Ensured by: DSL validator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lemma.adapted.xcore.data.DataPackage#getContext_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.Context#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Complex Types</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.data.ComplexType}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.data.ComplexType#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Types</em>' containment reference list.
	 * @see lemma.adapted.xcore.data.DataPackage#getContext_ComplexTypes()
	 * @see lemma.adapted.xcore.data.ComplexType#getContext
	 * @model opposite="context" containment="true" required="true"
	 * @generated
	 */
	EList<ComplexType> getComplexTypes();

	/**
	 * Returns the value of the '<em><b>Data Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.data.DataModel#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Model</em>' container reference.
	 * @see #setDataModel(DataModel)
	 * @see lemma.adapted.xcore.data.DataPackage#getContext_DataModel()
	 * @see lemma.adapted.xcore.data.DataModel#getContexts
	 * @model opposite="contexts" transient="false"
	 * @generated
	 */
	DataModel getDataModel();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.Context#getDataModel <em>Data Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Model</em>' container reference.
	 * @see #getDataModel()
	 * @generated
	 */
	void setDataModel(DataModel value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.data.Version#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' container reference.
	 * @see #setVersion(Version)
	 * @see lemma.adapted.xcore.data.DataPackage#getContext_Version()
	 * @see lemma.adapted.xcore.data.Version#getContexts
	 * @model opposite="contexts" transient="false"
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.Context#getVersion <em>Version</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' container reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Get parts of the context for creating a qualified name
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

} // Context

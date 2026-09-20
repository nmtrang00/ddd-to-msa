/**
 */
package lemma.adapted.xcore.data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A version may represent an additional naming scope for several complex types, either directly or
 * indirectly, when they are organized in contexts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.data.Version#getName <em>Name</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.Version#getComplexTypes <em>Complex Types</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.Version#getContexts <em>Contexts</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.Version#getDataModel <em>Data Model</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.data.DataPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Implicit Constraints:
	 *     (C1) Either one (or none) of the complexTypes or contexts may have elements.
	 *          Ensured by: DSL grammar.
	 *     (C2) Name must be unique.
	 *          Ensured by: DSL validator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lemma.adapted.xcore.data.DataPackage#getVersion_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.Version#getName <em>Name</em>}' attribute.
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
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.data.ComplexType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Types</em>' containment reference list.
	 * @see lemma.adapted.xcore.data.DataPackage#getVersion_ComplexTypes()
	 * @see lemma.adapted.xcore.data.ComplexType#getVersion
	 * @model opposite="version" containment="true"
	 * @generated
	 */
	EList<ComplexType> getComplexTypes();

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.data.Context}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.data.Context#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see lemma.adapted.xcore.data.DataPackage#getVersion_Contexts()
	 * @see lemma.adapted.xcore.data.Context#getVersion
	 * @model opposite="version" containment="true"
	 * @generated
	 */
	EList<Context> getContexts();

	/**
	 * Returns the value of the '<em><b>Data Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.data.DataModel#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Model</em>' container reference.
	 * @see #setDataModel(DataModel)
	 * @see lemma.adapted.xcore.data.DataPackage#getVersion_DataModel()
	 * @see lemma.adapted.xcore.data.DataModel#getVersions
	 * @model opposite="versions" transient="false"
	 * @generated
	 */
	DataModel getDataModel();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.Version#getDataModel <em>Data Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Model</em>' container reference.
	 * @see #getDataModel()
	 * @generated
	 */
	void setDataModel(DataModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Get all ComplexTypes contained by the Version
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<ComplexType> getContainedComplexTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Get parts of the version for creating a qualified name
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<String> getQualifiedNameParts();

} // Version

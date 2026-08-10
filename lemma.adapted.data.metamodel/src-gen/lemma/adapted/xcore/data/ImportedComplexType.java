/**
 */
package lemma.adapted.xcore.data;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Represents a complex type that is imported from another data model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.data.ImportedComplexType#getImport <em>Import</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.ImportedComplexType#getImportedType <em>Imported Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.ImportedComplexType#getDataField <em>Data Field</em>}</li>
 *   <li>{@link lemma.adapted.xcore.data.ImportedComplexType#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.data.DataPackage#getImportedComplexType()
 * @model
 * @generated
 */
public interface ImportedComplexType extends EObject {
	/**
	 * Returns the value of the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' reference.
	 * @see #setImport(ComplexTypeImport)
	 * @see lemma.adapted.xcore.data.DataPackage#getImportedComplexType_Import()
	 * @model
	 * @generated
	 */
	ComplexTypeImport getImport();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.ImportedComplexType#getImport <em>Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import</em>' reference.
	 * @see #getImport()
	 * @generated
	 */
	void setImport(ComplexTypeImport value);

	/**
	 * Returns the value of the '<em><b>Imported Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Type</em>' reference.
	 * @see #setImportedType(Type)
	 * @see lemma.adapted.xcore.data.DataPackage#getImportedComplexType_ImportedType()
	 * @model
	 * @generated
	 */
	Type getImportedType();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.ImportedComplexType#getImportedType <em>Imported Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Type</em>' reference.
	 * @see #getImportedType()
	 * @generated
	 */
	void setImportedType(Type value);

	/**
	 * Returns the value of the '<em><b>Data Field</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.data.DataField#getImportedComplexType <em>Imported Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Field</em>' container reference.
	 * @see #setDataField(DataField)
	 * @see lemma.adapted.xcore.data.DataPackage#getImportedComplexType_DataField()
	 * @see lemma.adapted.xcore.data.DataField#getImportedComplexType
	 * @model opposite="importedComplexType" transient="false"
	 * @generated
	 */
	DataField getDataField();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.ImportedComplexType#getDataField <em>Data Field</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Field</em>' container reference.
	 * @see #getDataField()
	 * @generated
	 */
	void setDataField(DataField value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.data.DataOperationParameter#getImportedComplexType <em>Imported Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' container reference.
	 * @see #setParameter(DataOperationParameter)
	 * @see lemma.adapted.xcore.data.DataPackage#getImportedComplexType_Parameter()
	 * @see lemma.adapted.xcore.data.DataOperationParameter#getImportedComplexType
	 * @model opposite="importedComplexType" transient="false"
	 * @generated
	 */
	DataOperationParameter getParameter();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.data.ImportedComplexType#getParameter <em>Parameter</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' container reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(DataOperationParameter value);

} // ImportedComplexType

/**
 */
package lemma.adapted.xcore.behavior;

import lemma.adapted.xcore.data.DataOperationParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Data Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.ImportedDataParameter#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getImportedDataParameter()
 * @model
 * @generated
 */
public interface ImportedDataParameter extends ImportedParameter {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(DataOperationParameter)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getImportedDataParameter_Parameter()
	 * @model
	 * @generated
	 */
	DataOperationParameter getParameter();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ImportedDataParameter#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(DataOperationParameter value);

} // ImportedDataParameter

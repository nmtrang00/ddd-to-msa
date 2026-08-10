/**
 */
package lemma.adapted.xcore.behavior;

import lemma.adapted.xcore.service.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Interface Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.ImportedInterfaceParameter#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getImportedInterfaceParameter()
 * @model
 * @generated
 */
public interface ImportedInterfaceParameter extends ImportedParameter {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getImportedInterfaceParameter_Parameter()
	 * @model
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ImportedInterfaceParameter#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // ImportedInterfaceParameter

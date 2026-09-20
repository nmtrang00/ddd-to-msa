/**
 */
package dact;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.Variable#getAccessibleScopes <em>Accessible Scopes</em>}</li>
 *   <li>{@link dact.Variable#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends TransformationOnly, TypedMultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Accessible Scopes</b></em>' reference list.
	 * The list contents are of type {@link dact.Scope}.
	 * It is bidirectional and its opposite is '{@link dact.Scope#getInheritedVariables <em>Inherited Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessible Scopes</em>' reference list.
	 * @see dact.DactPackage#getVariable_AccessibleScopes()
	 * @see dact.Scope#getInheritedVariables
	 * @model opposite="inheritedVariables" ordered="false"
	 * @generated
	 */
	EList<Scope> getAccessibleScopes();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.Scope#getOwnedVariables <em>Owned Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' container reference.
	 * @see #setScope(Scope)
	 * @see dact.DactPackage#getVariable_Scope()
	 * @see dact.Scope#getOwnedVariables
	 * @model opposite="ownedVariables" transient="false"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link dact.Variable#getScope <em>Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' container reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

} // Variable

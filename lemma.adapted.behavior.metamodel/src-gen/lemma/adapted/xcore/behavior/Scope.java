/**
 */
package lemma.adapted.xcore.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.Scope#getParent <em>Parent</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.Scope#getChildren <em>Children</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.Scope#getInheritedVariables <em>Inherited Variables</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.Scope#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.Scope#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.Scope#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Scope)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getScope_Parent()
	 * @see lemma.adapted.xcore.behavior.Scope#getChildren
	 * @model opposite="children"
	 * @generated
	 */
	Scope getParent();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.Scope#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Scope value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.behavior.Scope}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.Scope#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getScope_Children()
	 * @see lemma.adapted.xcore.behavior.Scope#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Scope> getChildren();

	/**
	 * Returns the value of the '<em><b>Inherited Variables</b></em>' reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.behavior.Variable}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.Variable#getAccessibleScopes <em>Accessible Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited Variables</em>' reference list.
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getScope_InheritedVariables()
	 * @see lemma.adapted.xcore.behavior.Variable#getAccessibleScopes
	 * @model opposite="accessibleScopes"
	 * @generated
	 */
	EList<Variable> getInheritedVariables();

	/**
	 * Returns the value of the '<em><b>Owned Variables</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.behavior.Variable}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.Variable#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Variables</em>' containment reference list.
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getScope_OwnedVariables()
	 * @see lemma.adapted.xcore.behavior.Variable#getScope
	 * @model opposite="scope" containment="true"
	 * @generated
	 */
	EList<Variable> getOwnedVariables();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.ActivityGroup#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(ActivityGroup)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getScope_Group()
	 * @see lemma.adapted.xcore.behavior.ActivityGroup#getScope
	 * @model opposite="scope" transient="false"
	 * @generated
	 */
	ActivityGroup getGroup();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.Scope#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(ActivityGroup value);

} // Scope

/**
 */
package dact;

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
 *   <li>{@link dact.Scope#getName <em>Name</em>}</li>
 *   <li>{@link dact.Scope#getParent <em>Parent</em>}</li>
 *   <li>{@link dact.Scope#getChildren <em>Children</em>}</li>
 *   <li>{@link dact.Scope#getInheritedVariables <em>Inherited Variables</em>}</li>
 *   <li>{@link dact.Scope#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link dact.Scope#getGroup <em>Group</em>}</li>
 *   <li>{@link dact.Scope#getDomainObject <em>Domain Object</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see dact.DactPackage#getScope_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dact.Scope#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Scope)
	 * @see dact.DactPackage#getScope_Parent()
	 * @see dact.Scope#getChildren
	 * @model opposite="children"
	 * @generated
	 */
	Scope getParent();

	/**
	 * Sets the value of the '{@link dact.Scope#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Scope value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link dact.Scope}.
	 * It is bidirectional and its opposite is '{@link dact.Scope#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see dact.DactPackage#getScope_Children()
	 * @see dact.Scope#getParent
	 * @model opposite="parent" ordered="false"
	 * @generated
	 */
	EList<Scope> getChildren();

	/**
	 * Returns the value of the '<em><b>Inherited Variables</b></em>' reference list.
	 * The list contents are of type {@link dact.Variable}.
	 * It is bidirectional and its opposite is '{@link dact.Variable#getAccessibleScopes <em>Accessible Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited Variables</em>' reference list.
	 * @see dact.DactPackage#getScope_InheritedVariables()
	 * @see dact.Variable#getAccessibleScopes
	 * @model opposite="accessibleScopes" ordered="false"
	 * @generated
	 */
	EList<Variable> getInheritedVariables();

	/**
	 * Returns the value of the '<em><b>Owned Variables</b></em>' containment reference list.
	 * The list contents are of type {@link dact.Variable}.
	 * It is bidirectional and its opposite is '{@link dact.Variable#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Variables</em>' containment reference list.
	 * @see dact.DactPackage#getScope_OwnedVariables()
	 * @see dact.Variable#getScope
	 * @model opposite="scope" containment="true" ordered="false"
	 * @generated
	 */
	EList<Variable> getOwnedVariables();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.ActivityGroup#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(ActivityGroup)
	 * @see dact.DactPackage#getScope_Group()
	 * @see dact.ActivityGroup#getScope
	 * @model opposite="scope" transient="false"
	 * @generated
	 */
	ActivityGroup getGroup();

	/**
	 * Sets the value of the '{@link dact.Scope#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(ActivityGroup value);

	/**
	 * Returns the value of the '<em><b>Domain Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.DomainObject#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object</em>' container reference.
	 * @see #setDomainObject(DomainObject)
	 * @see dact.DactPackage#getScope_DomainObject()
	 * @see dact.DomainObject#getScope
	 * @model opposite="scope" transient="false"
	 * @generated
	 */
	DomainObject getDomainObject();

	/**
	 * Sets the value of the '{@link dact.Scope#getDomainObject <em>Domain Object</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Object</em>' container reference.
	 * @see #getDomainObject()
	 * @generated
	 */
	void setDomainObject(DomainObject value);

} // Scope

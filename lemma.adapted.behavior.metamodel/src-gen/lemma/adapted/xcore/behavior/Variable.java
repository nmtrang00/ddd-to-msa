/**
 */
package lemma.adapted.xcore.behavior;

import lemma.adapted.xcore.data.PrimitiveType;

import lemma.adapted.xcore.service.ImportedType;

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
 *   <li>{@link lemma.adapted.xcore.behavior.Variable#getImportedType <em>Imported Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.Variable#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.Variable#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.Variable#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.Variable#getAccessibleScopes <em>Accessible Scopes</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.Variable#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Imported Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Type</em>' containment reference.
	 * @see #setImportedType(ImportedType)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getVariable_ImportedType()
	 * @model containment="true"
	 * @generated
	 */
	ImportedType getImportedType();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.Variable#getImportedType <em>Imported Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Type</em>' containment reference.
	 * @see #getImportedType()
	 * @generated
	 */
	void setImportedType(ImportedType value);

	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type</em>' containment reference.
	 * @see #setPrimitiveType(PrimitiveType)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getVariable_PrimitiveType()
	 * @model containment="true"
	 * @generated
	 */
	PrimitiveType getPrimitiveType();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.Variable#getPrimitiveType <em>Primitive Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' containment reference.
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(Integer)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getVariable_UpperBound()
	 * @model default="1" unique="false"
	 * @generated
	 */
	Integer getUpperBound();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.Variable#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Integer value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(Integer)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getVariable_LowerBound()
	 * @model default="0" unique="false"
	 * @generated
	 */
	Integer getLowerBound();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.Variable#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Integer value);

	/**
	 * Returns the value of the '<em><b>Accessible Scopes</b></em>' reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.behavior.Scope}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.Scope#getInheritedVariables <em>Inherited Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessible Scopes</em>' reference list.
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getVariable_AccessibleScopes()
	 * @see lemma.adapted.xcore.behavior.Scope#getInheritedVariables
	 * @model opposite="inheritedVariables"
	 * @generated
	 */
	EList<Scope> getAccessibleScopes();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.Scope#getOwnedVariables <em>Owned Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' container reference.
	 * @see #setScope(Scope)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getVariable_Scope()
	 * @see lemma.adapted.xcore.behavior.Scope#getOwnedVariables
	 * @model opposite="ownedVariables" transient="false"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.Variable#getScope <em>Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' container reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

} // Variable

/**
 */
package dact;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.InstanceValue#getIsInstanceOf <em>Is Instance Of</em>}</li>
 *   <li>{@link dact.InstanceValue#getOwnedProperties <em>Owned Properties</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getInstanceValue()
 * @model
 * @generated
 */
public interface InstanceValue extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Is Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Instance Of</em>' reference.
	 * @see #setIsInstanceOf(DomainObject)
	 * @see dact.DactPackage#getInstanceValue_IsInstanceOf()
	 * @model
	 * @generated
	 */
	DomainObject getIsInstanceOf();

	/**
	 * Sets the value of the '{@link dact.InstanceValue#getIsInstanceOf <em>Is Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Instance Of</em>' reference.
	 * @see #getIsInstanceOf()
	 * @generated
	 */
	void setIsInstanceOf(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Owned Properties</b></em>' containment reference list.
	 * The list contents are of type {@link dact.InstanceProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Properties</em>' containment reference list.
	 * @see dact.DactPackage#getInstanceValue_OwnedProperties()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<InstanceProperty> getOwnedProperties();

} // InstanceValue

/**
 */
package dact;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.InstanceProperty#getIsInstanceOf <em>Is Instance Of</em>}</li>
 *   <li>{@link dact.InstanceProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getInstanceProperty()
 * @model
 * @generated
 */
public interface InstanceProperty extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Instance Of</em>' reference.
	 * @see #setIsInstanceOf(Property)
	 * @see dact.DactPackage#getInstanceProperty_IsInstanceOf()
	 * @model
	 * @generated
	 */
	Property getIsInstanceOf();

	/**
	 * Sets the value of the '{@link dact.InstanceProperty#getIsInstanceOf <em>Is Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Instance Of</em>' reference.
	 * @see #getIsInstanceOf()
	 * @generated
	 */
	void setIsInstanceOf(Property value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link dact.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see dact.DactPackage#getInstanceProperty_Value()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ValueSpecification> getValue();

} // InstanceProperty

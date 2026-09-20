/**
 */
package dact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Domain Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.SharedDomainObject#getAbstractedRoot <em>Abstracted Root</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getSharedDomainObject()
 * @model abstract="true"
 * @generated
 */
public interface SharedDomainObject extends DomainObject {
	/**
	 * Returns the value of the '<em><b>Abstracted Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstracted Root</em>' reference.
	 * @see #setAbstractedRoot(AggregateRoot)
	 * @see dact.DactPackage#getSharedDomainObject_AbstractedRoot()
	 * @model
	 * @generated
	 */
	AggregateRoot getAbstractedRoot();

	/**
	 * Sets the value of the '{@link dact.SharedDomainObject#getAbstractedRoot <em>Abstracted Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstracted Root</em>' reference.
	 * @see #getAbstractedRoot()
	 * @generated
	 */
	void setAbstractedRoot(AggregateRoot value);

} // SharedDomainObject

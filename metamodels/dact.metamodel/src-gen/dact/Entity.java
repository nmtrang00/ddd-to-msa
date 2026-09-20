/**
 */
package dact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.Entity#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends InternalDomainObject {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dact.Repository#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(Repository)
	 * @see dact.DactPackage#getEntity_Repository()
	 * @see dact.Repository#getEntity
	 * @model opposite="entity"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link dact.Entity#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

} // Entity

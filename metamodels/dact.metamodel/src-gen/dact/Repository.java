/**
 */
package dact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.Repository#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends Interface {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dact.Entity#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see dact.DactPackage#getRepository_Entity()
	 * @see dact.Entity#getRepository
	 * @model opposite="repository"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link dact.Repository#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // Repository

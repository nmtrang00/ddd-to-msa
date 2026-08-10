/**
 */
package dact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raise Entity Not Found Exception Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.RaiseEntityNotFoundExceptionAction#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getRaiseEntityNotFoundExceptionAction()
 * @model
 * @generated
 */
public interface RaiseEntityNotFoundExceptionAction extends RaiseExceptionAction {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see dact.DactPackage#getRaiseEntityNotFoundExceptionAction_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link dact.RaiseEntityNotFoundExceptionAction#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // RaiseEntityNotFoundExceptionAction

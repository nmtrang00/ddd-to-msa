/**
 */
package lemma.adapted.xcore.behavior;

import lemma.adapted.xcore.data.DataStructure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raise Entity Not Found Exception Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.RaiseEntityNotFoundExceptionAction#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getRaiseEntityNotFoundExceptionAction()
 * @model
 * @generated
 */
public interface RaiseEntityNotFoundExceptionAction extends RaiseExceptionAction {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(DataStructure)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getRaiseEntityNotFoundExceptionAction_Entity()
	 * @model
	 * @generated
	 */
	DataStructure getEntity();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.RaiseEntityNotFoundExceptionAction#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(DataStructure value);

} // RaiseEntityNotFoundExceptionAction

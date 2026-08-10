/**
 */
package lemma.adapted.xcore.behavior;

import lemma.adapted.xcore.service.ImportedType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raise Exception Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.RaiseExceptionAction#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getRaiseExceptionAction()
 * @model
 * @generated
 */
public interface RaiseExceptionAction extends ExecutableNode {
	/**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference.
	 * @see #setException(ImportedType)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getRaiseExceptionAction_Exception()
	 * @model containment="true"
	 * @generated
	 */
	ImportedType getException();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.RaiseExceptionAction#getException <em>Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' containment reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(ImportedType value);

} // RaiseExceptionAction

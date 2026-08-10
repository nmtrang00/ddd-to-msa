/**
 */
package lemma.adapted.xcore.behavior;

import lemma.adapted.xcore.data.ValueSpecification;

import lemma.adapted.xcore.service.ImportedType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.SignalAction#getEvent <em>Event</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.SignalAction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getSignalAction()
 * @model abstract="true"
 * @generated
 */
public interface SignalAction extends ExecutableNode {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(ImportedType)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getSignalAction_Event()
	 * @model containment="true"
	 * @generated
	 */
	ImportedType getEvent();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.SignalAction#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(ImportedType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueSpecification)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getSignalAction_Value()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getValue();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.SignalAction#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueSpecification value);

} // SignalAction

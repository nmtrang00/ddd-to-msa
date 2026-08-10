/**
 */
package lemma.adapted.xcore.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.ConditionalNode#getElseBody <em>Else Body</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getConditionalNode()
 * @model
 * @generated
 */
public interface ConditionalNode extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Else Body</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.ActivityGroup#getConditionalNode <em>Conditional Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Body</em>' containment reference.
	 * @see #setElseBody(ActivityGroup)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getConditionalNode_ElseBody()
	 * @see lemma.adapted.xcore.behavior.ActivityGroup#getConditionalNode
	 * @model opposite="conditionalNode" containment="true"
	 * @generated
	 */
	ActivityGroup getElseBody();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ConditionalNode#getElseBody <em>Else Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Body</em>' containment reference.
	 * @see #getElseBody()
	 * @generated
	 */
	void setElseBody(ActivityGroup value);

} // ConditionalNode

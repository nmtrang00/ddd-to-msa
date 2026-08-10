/**
 */
package lemma.adapted.xcore.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.StructuredActivityNode#getTest <em>Test</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.StructuredActivityNode#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getStructuredActivityNode()
 * @model
 * @generated
 */
public interface StructuredActivityNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference.
	 * @see #setTest(Expression)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getStructuredActivityNode_Test()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTest();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.StructuredActivityNode#getTest <em>Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' containment reference.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(Expression value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.ActivityGroup#getStructuredActivityNode <em>Structured Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(ActivityGroup)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getStructuredActivityNode_Body()
	 * @see lemma.adapted.xcore.behavior.ActivityGroup#getStructuredActivityNode
	 * @model opposite="structuredActivityNode" containment="true"
	 * @generated
	 */
	ActivityGroup getBody();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.StructuredActivityNode#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ActivityGroup value);

} // StructuredActivityNode

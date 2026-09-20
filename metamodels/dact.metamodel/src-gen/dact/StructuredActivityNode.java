/**
 */
package dact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.StructuredActivityNode#getTest <em>Test</em>}</li>
 *   <li>{@link dact.StructuredActivityNode#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getStructuredActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface StructuredActivityNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference.
	 * @see #setTest(Expression)
	 * @see dact.DactPackage#getStructuredActivityNode_Test()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTest();

	/**
	 * Sets the value of the '{@link dact.StructuredActivityNode#getTest <em>Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' containment reference.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(Expression value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link dact.ActivityGroup#getStructuredActivityNode <em>Structured Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(ActivityGroup)
	 * @see dact.DactPackage#getStructuredActivityNode_Body()
	 * @see dact.ActivityGroup#getStructuredActivityNode
	 * @model opposite="structuredActivityNode" containment="true"
	 * @generated
	 */
	ActivityGroup getBody();

	/**
	 * Sets the value of the '{@link dact.StructuredActivityNode#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ActivityGroup value);

} // StructuredActivityNode

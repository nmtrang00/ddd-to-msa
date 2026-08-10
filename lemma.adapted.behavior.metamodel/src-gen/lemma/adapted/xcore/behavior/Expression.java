/**
 */
package lemma.adapted.xcore.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.Expression#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(ExpressionChild)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getExpression_Child()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionChild getChild();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.Expression#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(ExpressionChild value);

} // Expression

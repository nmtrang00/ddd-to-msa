/**
 */
package lemma.adapted.xcore.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.NotExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getNotExpression()
 * @model
 * @generated
 */
public interface NotExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getNotExpression_Expr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.NotExpression#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // NotExpression

/**
 */
package lemma.adapted.xcore.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.BinaryExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.BinaryExpression#getLeftExpr <em>Left Expr</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.BinaryExpression#getRightExpr <em>Right Expr</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(Operator)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getBinaryExpression_Operator()
	 * @model containment="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.BinaryExpression#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Expr</em>' containment reference.
	 * @see #setLeftExpr(Expression)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getBinaryExpression_LeftExpr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeftExpr();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.BinaryExpression#getLeftExpr <em>Left Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Expr</em>' containment reference.
	 * @see #getLeftExpr()
	 * @generated
	 */
	void setLeftExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Expr</em>' containment reference.
	 * @see #setRightExpr(Expression)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getBinaryExpression_RightExpr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRightExpr();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.BinaryExpression#getRightExpr <em>Right Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Expr</em>' containment reference.
	 * @see #getRightExpr()
	 * @generated
	 */
	void setRightExpr(Expression value);

} // BinaryExpression

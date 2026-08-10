/**
 */
package dact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.Expression#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getExpression()
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
	 * @see dact.DactPackage#getExpression_Child()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionChild getChild();

	/**
	 * Sets the value of the '{@link dact.Expression#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(ExpressionChild value);

} // Expression

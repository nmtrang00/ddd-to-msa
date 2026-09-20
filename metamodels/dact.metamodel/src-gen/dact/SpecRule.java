/**
 */
package dact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.SpecRule#getRawString <em>Raw String</em>}</li>
 *   <li>{@link dact.SpecRule#getExpr <em>Expr</em>}</li>
 *   <li>{@link dact.SpecRule#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getSpecRule()
 * @model
 * @generated
 */
public interface SpecRule extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Raw String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw String</em>' attribute.
	 * @see #setRawString(String)
	 * @see dact.DactPackage#getSpecRule_RawString()
	 * @model unique="false"
	 * @generated
	 */
	String getRawString();

	/**
	 * Sets the value of the '{@link dact.SpecRule#getRawString <em>Raw String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw String</em>' attribute.
	 * @see #getRawString()
	 * @generated
	 */
	void setRawString(String value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see dact.DactPackage#getSpecRule_Expr()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link dact.SpecRule#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.SpecOperation#getOwnedRules <em>Owned Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(SpecOperation)
	 * @see dact.DactPackage#getSpecRule_Operation()
	 * @see dact.SpecOperation#getOwnedRules
	 * @model opposite="ownedRules" transient="false"
	 * @generated
	 */
	SpecOperation getOperation();

	/**
	 * Sets the value of the '{@link dact.SpecRule#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(SpecOperation value);

} // SpecRule

/**
 */
package dact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Real</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.LiteralReal#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getLiteralReal()
 * @model
 * @generated
 */
public interface LiteralReal extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see dact.DactPackage#getLiteralReal_Value()
	 * @model unique="false"
	 * @generated
	 */
	Double getValue();

	/**
	 * Sets the value of the '{@link dact.LiteralReal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Double value);

} // LiteralReal

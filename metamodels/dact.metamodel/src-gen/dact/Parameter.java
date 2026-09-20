/**
 */
package dact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.Parameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link dact.Parameter#getRole <em>Role</em>}</li>
 *   <li>{@link dact.Parameter#getOperation <em>Operation</em>}</li>
 *   <li>{@link dact.Parameter#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends TypedMultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"IN"</code>.
	 * The literals are from the enumeration {@link dact.ParameterDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see dact.ParameterDirection
	 * @see #setDirection(ParameterDirection)
	 * @see dact.DactPackage#getParameter_Direction()
	 * @model default="IN" unique="false"
	 * @generated
	 */
	ParameterDirection getDirection();

	/**
	 * Sets the value of the '{@link dact.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see dact.ParameterDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParameterDirection value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The default value is <code>"CORE"</code>.
	 * The literals are from the enumeration {@link dact.ParameterRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see dact.ParameterRole
	 * @see #setRole(ParameterRole)
	 * @see dact.DactPackage#getParameter_Role()
	 * @model default="CORE" unique="false"
	 * @generated
	 */
	ParameterRole getRole();

	/**
	 * Sets the value of the '{@link dact.Parameter#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see dact.ParameterRole
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ParameterRole value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.Operation#getOwnedParameters <em>Owned Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(Operation)
	 * @see dact.DactPackage#getParameter_Operation()
	 * @see dact.Operation#getOwnedParameters
	 * @model opposite="ownedParameters" transient="false"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link dact.Parameter#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.Activity#getOwnedParameters <em>Owned Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see dact.DactPackage#getParameter_Activity()
	 * @see dact.Activity#getOwnedParameters
	 * @model opposite="ownedParameters" transient="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link dact.Parameter#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // Parameter

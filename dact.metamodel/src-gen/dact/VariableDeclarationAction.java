/**
 */
package dact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.VariableDeclarationAction#getType <em>Type</em>}</li>
 *   <li>{@link dact.VariableDeclarationAction#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link dact.VariableDeclarationAction#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link dact.VariableDeclarationAction#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getVariableDeclarationAction()
 * @model
 * @generated
 */
public interface VariableDeclarationAction extends ExecutableNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see dact.DactPackage#getVariableDeclarationAction_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link dact.VariableDeclarationAction#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(Integer)
	 * @see dact.DactPackage#getVariableDeclarationAction_UpperBound()
	 * @model default="1" unique="false"
	 * @generated
	 */
	Integer getUpperBound();

	/**
	 * Sets the value of the '{@link dact.VariableDeclarationAction#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Integer value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(Integer)
	 * @see dact.DactPackage#getVariableDeclarationAction_LowerBound()
	 * @model default="0" unique="false"
	 * @generated
	 */
	Integer getLowerBound();

	/**
	 * Sets the value of the '{@link dact.VariableDeclarationAction#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Integer value);

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' containment reference.
	 * @see #setDeclaration(VariableAssignment)
	 * @see dact.DactPackage#getVariableDeclarationAction_Declaration()
	 * @model containment="true"
	 * @generated
	 */
	VariableAssignment getDeclaration();

	/**
	 * Sets the value of the '{@link dact.VariableDeclarationAction#getDeclaration <em>Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' containment reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(VariableAssignment value);

} // VariableDeclarationAction

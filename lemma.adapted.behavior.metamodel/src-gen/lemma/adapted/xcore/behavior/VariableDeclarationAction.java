/**
 */
package lemma.adapted.xcore.behavior;

import lemma.adapted.xcore.data.PrimitiveType;

import lemma.adapted.xcore.service.ImportedType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.VariableDeclarationAction#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.VariableDeclarationAction#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.VariableDeclarationAction#getImportedType <em>Imported Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.VariableDeclarationAction#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.VariableDeclarationAction#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getVariableDeclarationAction()
 * @model
 * @generated
 */
public interface VariableDeclarationAction extends ExecutableNode {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(Integer)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getVariableDeclarationAction_LowerBound()
	 * @model unique="false"
	 * @generated
	 */
	Integer getLowerBound();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.VariableDeclarationAction#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Integer value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(Integer)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getVariableDeclarationAction_UpperBound()
	 * @model unique="false"
	 * @generated
	 */
	Integer getUpperBound();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.VariableDeclarationAction#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Integer value);

	/**
	 * Returns the value of the '<em><b>Imported Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Type</em>' containment reference.
	 * @see #setImportedType(ImportedType)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getVariableDeclarationAction_ImportedType()
	 * @model containment="true"
	 * @generated
	 */
	ImportedType getImportedType();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.VariableDeclarationAction#getImportedType <em>Imported Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Type</em>' containment reference.
	 * @see #getImportedType()
	 * @generated
	 */
	void setImportedType(ImportedType value);

	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type</em>' containment reference.
	 * @see #setPrimitiveType(PrimitiveType)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getVariableDeclarationAction_PrimitiveType()
	 * @model containment="true"
	 * @generated
	 */
	PrimitiveType getPrimitiveType();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.VariableDeclarationAction#getPrimitiveType <em>Primitive Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' containment reference.
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' containment reference.
	 * @see #setDeclaration(VariableAssignment)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getVariableDeclarationAction_Declaration()
	 * @model containment="true"
	 * @generated
	 */
	VariableAssignment getDeclaration();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.VariableDeclarationAction#getDeclaration <em>Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' containment reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(VariableAssignment value);

} // VariableDeclarationAction

/**
 */
package lemma.adapted.xcore.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assignment Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.VariableAssignmentAction#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getVariableAssignmentAction()
 * @model
 * @generated
 */
public interface VariableAssignmentAction extends ExecutableNode {
	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' containment reference.
	 * @see #setAssignment(VariableAssignment)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getVariableAssignmentAction_Assignment()
	 * @model containment="true"
	 * @generated
	 */
	VariableAssignment getAssignment();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.VariableAssignmentAction#getAssignment <em>Assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment</em>' containment reference.
	 * @see #getAssignment()
	 * @generated
	 */
	void setAssignment(VariableAssignment value);

} // VariableAssignmentAction

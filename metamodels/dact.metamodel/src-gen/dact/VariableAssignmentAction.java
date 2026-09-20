/**
 */
package dact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assignment Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.VariableAssignmentAction#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getVariableAssignmentAction()
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
	 * @see dact.DactPackage#getVariableAssignmentAction_Assignment()
	 * @model containment="true"
	 * @generated
	 */
	VariableAssignment getAssignment();

	/**
	 * Sets the value of the '{@link dact.VariableAssignmentAction#getAssignment <em>Assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment</em>' containment reference.
	 * @see #getAssignment()
	 * @generated
	 */
	void setAssignment(VariableAssignment value);

} // VariableAssignmentAction

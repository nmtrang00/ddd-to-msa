/**
 */
package dact;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.ParallelNode#getFlows <em>Flows</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getParallelNode()
 * @model
 * @generated
 */
public interface ParallelNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference list.
	 * The list contents are of type {@link dact.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link dact.ActivityGroup#getParallelNode <em>Parallel Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows</em>' containment reference list.
	 * @see dact.DactPackage#getParallelNode_Flows()
	 * @see dact.ActivityGroup#getParallelNode
	 * @model opposite="parallelNode" containment="true"
	 * @generated
	 */
	EList<ActivityGroup> getFlows();

} // ParallelNode

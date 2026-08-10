/**
 */
package lemma.adapted.xcore.behavior;

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
 *   <li>{@link lemma.adapted.xcore.behavior.ParallelNode#getOwnedGroup <em>Owned Group</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getParallelNode()
 * @model
 * @generated
 */
public interface ParallelNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Owned Group</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.behavior.ActivityGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Group</em>' containment reference list.
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getParallelNode_OwnedGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityGroup> getOwnedGroup();

} // ParallelNode

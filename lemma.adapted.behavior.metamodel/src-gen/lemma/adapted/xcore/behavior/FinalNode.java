/**
 */
package lemma.adapted.xcore.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.FinalNode#getVariablesToReturn <em>Variables To Return</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getFinalNode()
 * @model abstract="true"
 * @generated
 */
public interface FinalNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Variables To Return</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.behavior.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables To Return</em>' containment reference list.
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getFinalNode_VariablesToReturn()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getVariablesToReturn();

} // FinalNode

/**
 */
package lemma.adapted.xcore.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.ActivityGroup#getOwnedNodes <em>Owned Nodes</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.ActivityGroup#getOwnedEdges <em>Owned Edges</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.ActivityGroup#getScope <em>Scope</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.ActivityGroup#getActivity <em>Activity</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.ActivityGroup#getStructuredActivityNode <em>Structured Activity Node</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.ActivityGroup#getConditionalNode <em>Conditional Node</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivityGroup()
 * @model
 * @generated
 */
public interface ActivityGroup extends NamedElement, Scope {
	/**
	 * Returns the value of the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.behavior.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.ActivityNode#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Nodes</em>' containment reference list.
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivityGroup_OwnedNodes()
	 * @see lemma.adapted.xcore.behavior.ActivityNode#getGroup
	 * @model opposite="group" containment="true"
	 * @generated
	 */
	EList<ActivityNode> getOwnedNodes();

	/**
	 * Returns the value of the '<em><b>Owned Edges</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.behavior.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.ActivityEdge#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Edges</em>' containment reference list.
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivityGroup_OwnedEdges()
	 * @see lemma.adapted.xcore.behavior.ActivityEdge#getGroup
	 * @model opposite="group" containment="true"
	 * @generated
	 */
	EList<ActivityEdge> getOwnedEdges();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.Scope#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(Scope)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivityGroup_Scope()
	 * @see lemma.adapted.xcore.behavior.Scope#getGroup
	 * @model opposite="group" containment="true"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ActivityGroup#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.Activity#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivityGroup_Activity()
	 * @see lemma.adapted.xcore.behavior.Activity#getRoot
	 * @model opposite="root" transient="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ActivityGroup#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Structured Activity Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.StructuredActivityNode#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Activity Node</em>' container reference.
	 * @see #setStructuredActivityNode(StructuredActivityNode)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivityGroup_StructuredActivityNode()
	 * @see lemma.adapted.xcore.behavior.StructuredActivityNode#getBody
	 * @model opposite="body" transient="false"
	 * @generated
	 */
	StructuredActivityNode getStructuredActivityNode();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ActivityGroup#getStructuredActivityNode <em>Structured Activity Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Activity Node</em>' container reference.
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	void setStructuredActivityNode(StructuredActivityNode value);

	/**
	 * Returns the value of the '<em><b>Conditional Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.ConditionalNode#getElseBody <em>Else Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Node</em>' container reference.
	 * @see #setConditionalNode(ConditionalNode)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivityGroup_ConditionalNode()
	 * @see lemma.adapted.xcore.behavior.ConditionalNode#getElseBody
	 * @model opposite="elseBody" transient="false"
	 * @generated
	 */
	ConditionalNode getConditionalNode();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ActivityGroup#getConditionalNode <em>Conditional Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Node</em>' container reference.
	 * @see #getConditionalNode()
	 * @generated
	 */
	void setConditionalNode(ConditionalNode value);

} // ActivityGroup

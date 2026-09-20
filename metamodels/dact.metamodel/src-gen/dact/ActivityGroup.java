/**
 */
package dact;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link dact.ActivityGroup#getOwnedNodes <em>Owned Nodes</em>}</li>
 *   <li>{@link dact.ActivityGroup#getOwnedEdges <em>Owned Edges</em>}</li>
 *   <li>{@link dact.ActivityGroup#getScope <em>Scope</em>}</li>
 *   <li>{@link dact.ActivityGroup#getActivity <em>Activity</em>}</li>
 *   <li>{@link dact.ActivityGroup#getStructuredActivityNode <em>Structured Activity Node</em>}</li>
 *   <li>{@link dact.ActivityGroup#getConditionalNode <em>Conditional Node</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getActivityGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SingleInitialNode SingleFinalNode NonEmptyGroup'"
 * @generated
 */
public interface ActivityGroup extends NamedElement, DiagnosticSupported {
	/**
	 * Returns the value of the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link dact.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link dact.ActivityNode#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Nodes</em>' containment reference list.
	 * @see dact.DactPackage#getActivityGroup_OwnedNodes()
	 * @see dact.ActivityNode#getGroup
	 * @model opposite="group" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getOwnedNodes();

	/**
	 * Returns the value of the '<em><b>Owned Edges</b></em>' containment reference list.
	 * The list contents are of type {@link dact.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link dact.ActivityEdge#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Edges</em>' containment reference list.
	 * @see dact.DactPackage#getActivityGroup_OwnedEdges()
	 * @see dact.ActivityEdge#getGroup
	 * @model opposite="group" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getOwnedEdges();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link dact.Scope#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(Scope)
	 * @see dact.DactPackage#getActivityGroup_Scope()
	 * @see dact.Scope#getGroup
	 * @model opposite="group" containment="true"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link dact.ActivityGroup#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.Activity#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see dact.DactPackage#getActivityGroup_Activity()
	 * @see dact.Activity#getRoot
	 * @model opposite="root" transient="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link dact.ActivityGroup#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Structured Activity Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.StructuredActivityNode#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Activity Node</em>' container reference.
	 * @see #setStructuredActivityNode(StructuredActivityNode)
	 * @see dact.DactPackage#getActivityGroup_StructuredActivityNode()
	 * @see dact.StructuredActivityNode#getBody
	 * @model opposite="body" transient="false"
	 * @generated
	 */
	StructuredActivityNode getStructuredActivityNode();

	/**
	 * Sets the value of the '{@link dact.ActivityGroup#getStructuredActivityNode <em>Structured Activity Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Activity Node</em>' container reference.
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	void setStructuredActivityNode(StructuredActivityNode value);

	/**
	 * Returns the value of the '<em><b>Conditional Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.ConditionalNode#getElseBody <em>Else Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Node</em>' container reference.
	 * @see #setConditionalNode(ConditionalNode)
	 * @see dact.DactPackage#getActivityGroup_ConditionalNode()
	 * @see dact.ConditionalNode#getElseBody
	 * @model opposite="elseBody" transient="false"
	 * @generated
	 */
	ConditionalNode getConditionalNode();

	/**
	 * Sets the value of the '{@link dact.ActivityGroup#getConditionalNode <em>Conditional Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Node</em>' container reference.
	 * @see #getConditionalNode()
	 * @generated
	 */
	void setConditionalNode(ConditionalNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean SingleInitialNode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean SingleFinalNode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean NonEmptyGroup(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ActivityGroup

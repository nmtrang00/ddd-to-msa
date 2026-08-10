/**
 */
package lemma.adapted.xcore.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.ActivityEdge#getSource <em>Source</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.ActivityEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.ActivityEdge#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivityEdge()
 * @model
 * @generated
 */
public interface ActivityEdge extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.ActivityNode#getSEdge <em>SEdge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityNode)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivityEdge_Source()
	 * @see lemma.adapted.xcore.behavior.ActivityNode#getSEdge
	 * @model opposite="sEdge"
	 * @generated
	 */
	ActivityNode getSource();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ActivityEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.ActivityNode#getTEdge <em>TEdge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActivityNode)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivityEdge_Target()
	 * @see lemma.adapted.xcore.behavior.ActivityNode#getTEdge
	 * @model opposite="tEdge"
	 * @generated
	 */
	ActivityNode getTarget();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ActivityEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.ActivityGroup#getOwnedEdges <em>Owned Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(ActivityGroup)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivityEdge_Group()
	 * @see lemma.adapted.xcore.behavior.ActivityGroup#getOwnedEdges
	 * @model opposite="ownedEdges" transient="false"
	 * @generated
	 */
	ActivityGroup getGroup();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ActivityEdge#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(ActivityGroup value);

} // ActivityEdge

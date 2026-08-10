/**
 */
package lemma.adapted.xcore.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.ActivityNode#getSEdge <em>SEdge</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.ActivityNode#getTEdge <em>TEdge</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.ActivityNode#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode extends NamedElement {
	/**
	 * Returns the value of the '<em><b>SEdge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SEdge</em>' reference.
	 * @see #setSEdge(ActivityEdge)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivityNode_SEdge()
	 * @see lemma.adapted.xcore.behavior.ActivityEdge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	ActivityEdge getSEdge();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ActivityNode#getSEdge <em>SEdge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SEdge</em>' reference.
	 * @see #getSEdge()
	 * @generated
	 */
	void setSEdge(ActivityEdge value);

	/**
	 * Returns the value of the '<em><b>TEdge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TEdge</em>' reference.
	 * @see #setTEdge(ActivityEdge)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivityNode_TEdge()
	 * @see lemma.adapted.xcore.behavior.ActivityEdge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	ActivityEdge getTEdge();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ActivityNode#getTEdge <em>TEdge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TEdge</em>' reference.
	 * @see #getTEdge()
	 * @generated
	 */
	void setTEdge(ActivityEdge value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.ActivityGroup#getOwnedNodes <em>Owned Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(ActivityGroup)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivityNode_Group()
	 * @see lemma.adapted.xcore.behavior.ActivityGroup#getOwnedNodes
	 * @model opposite="ownedNodes" transient="false"
	 * @generated
	 */
	ActivityGroup getGroup();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ActivityNode#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(ActivityGroup value);

} // ActivityNode

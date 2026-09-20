/**
 */
package dact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.ActivityNode#getSEdge <em>SEdge</em>}</li>
 *   <li>{@link dact.ActivityNode#getTEdge <em>TEdge</em>}</li>
 *   <li>{@link dact.ActivityNode#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode extends NamedElement {
	/**
	 * Returns the value of the '<em><b>SEdge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dact.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SEdge</em>' reference.
	 * @see #setSEdge(ActivityEdge)
	 * @see dact.DactPackage#getActivityNode_SEdge()
	 * @see dact.ActivityEdge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	ActivityEdge getSEdge();

	/**
	 * Sets the value of the '{@link dact.ActivityNode#getSEdge <em>SEdge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SEdge</em>' reference.
	 * @see #getSEdge()
	 * @generated
	 */
	void setSEdge(ActivityEdge value);

	/**
	 * Returns the value of the '<em><b>TEdge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dact.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TEdge</em>' reference.
	 * @see #setTEdge(ActivityEdge)
	 * @see dact.DactPackage#getActivityNode_TEdge()
	 * @see dact.ActivityEdge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	ActivityEdge getTEdge();

	/**
	 * Sets the value of the '{@link dact.ActivityNode#getTEdge <em>TEdge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TEdge</em>' reference.
	 * @see #getTEdge()
	 * @generated
	 */
	void setTEdge(ActivityEdge value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.ActivityGroup#getOwnedNodes <em>Owned Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(ActivityGroup)
	 * @see dact.DactPackage#getActivityNode_Group()
	 * @see dact.ActivityGroup#getOwnedNodes
	 * @model opposite="ownedNodes" transient="false"
	 * @generated
	 */
	ActivityGroup getGroup();

	/**
	 * Sets the value of the '{@link dact.ActivityNode#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(ActivityGroup value);

} // ActivityNode

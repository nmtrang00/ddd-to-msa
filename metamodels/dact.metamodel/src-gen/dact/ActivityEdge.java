/**
 */
package dact;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.ActivityEdge#getName <em>Name</em>}</li>
 *   <li>{@link dact.ActivityEdge#getEdgeName <em>Edge Name</em>}</li>
 *   <li>{@link dact.ActivityEdge#getSource <em>Source</em>}</li>
 *   <li>{@link dact.ActivityEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link dact.ActivityEdge#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getActivityEdge()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoSelfLoop NoEdgeIntoInitialNode NoEdgeOutOfFinalNode EndpointsInSameGroup'"
 * @generated
 */
public interface ActivityEdge extends DiagnosticSupported {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see dact.DactPackage#getActivityEdge_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Edge Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Name</em>' attribute.
	 * @see #setEdgeName(String)
	 * @see dact.DactPackage#getActivityEdge_EdgeName()
	 * @model unique="false"
	 * @generated
	 */
	String getEdgeName();

	/**
	 * Sets the value of the '{@link dact.ActivityEdge#getEdgeName <em>Edge Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Name</em>' attribute.
	 * @see #getEdgeName()
	 * @generated
	 */
	void setEdgeName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dact.ActivityNode#getSEdge <em>SEdge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityNode)
	 * @see dact.DactPackage#getActivityEdge_Source()
	 * @see dact.ActivityNode#getSEdge
	 * @model opposite="sEdge" required="true"
	 * @generated
	 */
	ActivityNode getSource();

	/**
	 * Sets the value of the '{@link dact.ActivityEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dact.ActivityNode#getTEdge <em>TEdge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActivityNode)
	 * @see dact.DactPackage#getActivityEdge_Target()
	 * @see dact.ActivityNode#getTEdge
	 * @model opposite="tEdge" required="true"
	 * @generated
	 */
	ActivityNode getTarget();

	/**
	 * Sets the value of the '{@link dact.ActivityEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.ActivityGroup#getOwnedEdges <em>Owned Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(ActivityGroup)
	 * @see dact.DactPackage#getActivityEdge_Group()
	 * @see dact.ActivityGroup#getOwnedEdges
	 * @model opposite="ownedEdges" transient="false"
	 * @generated
	 */
	ActivityGroup getGroup();

	/**
	 * Sets the value of the '{@link dact.ActivityEdge#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(ActivityGroup value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean NoSelfLoop(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean NoEdgeIntoInitialNode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean NoEdgeOutOfFinalNode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean EndpointsInSameGroup(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ActivityEdge

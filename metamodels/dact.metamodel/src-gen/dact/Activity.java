/**
 */
package dact;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.Activity#getToTransform <em>To Transform</em>}</li>
 *   <li>{@link dact.Activity#getOwnedParameters <em>Owned Parameters</em>}</li>
 *   <li>{@link dact.Activity#getParameterMappings <em>Parameter Mappings</em>}</li>
 *   <li>{@link dact.Activity#getRoot <em>Root</em>}</li>
 *   <li>{@link dact.Activity#getOwnedDomainNodes <em>Owned Domain Nodes</em>}</li>
 *   <li>{@link dact.Activity#getProcessedDomainNodeMappings <em>Processed Domain Node Mappings</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getActivity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MappingsOnlyWithSpecification MatchedParameterMappingsCount EachParameterIsMapped'"
 * @generated
 */
public interface Activity extends NamedElement, Behavior, DiagnosticSupported {
	/**
	 * Returns the value of the '<em><b>To Transform</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Transform</em>' attribute.
	 * @see #setToTransform(Boolean)
	 * @see dact.DactPackage#getActivity_ToTransform()
	 * @model default="true" unique="false"
	 * @generated
	 */
	Boolean getToTransform();

	/**
	 * Sets the value of the '{@link dact.Activity#getToTransform <em>To Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Transform</em>' attribute.
	 * @see #getToTransform()
	 * @generated
	 */
	void setToTransform(Boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link dact.Parameter}.
	 * It is bidirectional and its opposite is '{@link dact.Parameter#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameters</em>' containment reference list.
	 * @see dact.DactPackage#getActivity_OwnedParameters()
	 * @see dact.Parameter#getActivity
	 * @model opposite="activity" containment="true" ordered="false"
	 * @generated
	 */
	EList<Parameter> getOwnedParameters();

	/**
	 * Returns the value of the '<em><b>Parameter Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link dact.ParameterMapping}.
	 * It is bidirectional and its opposite is '{@link dact.ParameterMapping#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Mappings</em>' containment reference list.
	 * @see dact.DactPackage#getActivity_ParameterMappings()
	 * @see dact.ParameterMapping#getActivity
	 * @model opposite="activity" containment="true" ordered="false"
	 * @generated
	 */
	EList<ParameterMapping> getParameterMappings();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link dact.ActivityGroup#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(ActivityGroup)
	 * @see dact.DactPackage#getActivity_Root()
	 * @see dact.ActivityGroup#getActivity
	 * @model opposite="activity" containment="true"
	 * @generated
	 */
	ActivityGroup getRoot();

	/**
	 * Sets the value of the '{@link dact.Activity#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(ActivityGroup value);

	/**
	 * Returns the value of the '<em><b>Owned Domain Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link dact.DomainNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Domain Nodes</em>' containment reference list.
	 * @see dact.DactPackage#getActivity_OwnedDomainNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainNode> getOwnedDomainNodes();

	/**
	 * Returns the value of the '<em><b>Processed Domain Node Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link dact.DomainNodeOperationMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processed Domain Node Mappings</em>' containment reference list.
	 * @see dact.DactPackage#getActivity_ProcessedDomainNodeMappings()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DomainNodeOperationMapping> getProcessedDomainNodeMappings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean MappingsOnlyWithSpecification(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean MatchedParameterMappingsCount(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean EachParameterIsMapped(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Activity

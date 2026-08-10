/**
 */
package dact;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Node Operation Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.DomainNodeOperationMapping#getUsedByExternalContext <em>Used By External Context</em>}</li>
 *   <li>{@link dact.DomainNodeOperationMapping#getDomainNode <em>Domain Node</em>}</li>
 *   <li>{@link dact.DomainNodeOperationMapping#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getDomainNodeOperationMapping()
 * @model
 * @generated
 */
public interface DomainNodeOperationMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Used By External Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By External Context</em>' attribute.
	 * @see #setUsedByExternalContext(Boolean)
	 * @see dact.DactPackage#getDomainNodeOperationMapping_UsedByExternalContext()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getUsedByExternalContext();

	/**
	 * Sets the value of the '{@link dact.DomainNodeOperationMapping#getUsedByExternalContext <em>Used By External Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used By External Context</em>' attribute.
	 * @see #getUsedByExternalContext()
	 * @generated
	 */
	void setUsedByExternalContext(Boolean value);

	/**
	 * Returns the value of the '<em><b>Domain Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Node</em>' reference.
	 * @see #setDomainNode(DomainNode)
	 * @see dact.DactPackage#getDomainNodeOperationMapping_DomainNode()
	 * @model
	 * @generated
	 */
	DomainNode getDomainNode();

	/**
	 * Sets the value of the '{@link dact.DomainNodeOperationMapping#getDomainNode <em>Domain Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Node</em>' reference.
	 * @see #getDomainNode()
	 * @generated
	 */
	void setDomainNode(DomainNode value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see dact.DactPackage#getDomainNodeOperationMapping_Operation()
	 * @model
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link dact.DomainNodeOperationMapping#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // DomainNodeOperationMapping

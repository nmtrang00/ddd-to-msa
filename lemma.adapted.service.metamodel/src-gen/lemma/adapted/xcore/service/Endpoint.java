/**
 */
package lemma.adapted.xcore.service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Represents an endpoint, i.e., the assignment of physical addresses, e.g., URIs with a protocol,
 * e.g., REST/JSON.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.service.Endpoint#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.Endpoint#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.Endpoint#getMicroservice <em>Microservice</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.Endpoint#getInterface <em>Interface</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.Endpoint#getOperation <em>Operation</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.Endpoint#getReferredOperation <em>Referred Operation</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.service.ServicePackage#getEndpoint()
 * @model
 * @generated
 */
public interface Endpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Implicit Constraints:
	 *     (C1) Addresses must be unique.
	 *          Ensured by: DSL validator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addresses</em>' attribute list.
	 * @see lemma.adapted.xcore.service.ServicePackage#getEndpoint_Addresses()
	 * @model unique="false" required="true"
	 * @generated
	 */
	EList<String> getAddresses();

	/**
	 * Returns the value of the '<em><b>Protocols</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.service.ImportedProtocolAndDataFormat}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.service.ImportedProtocolAndDataFormat#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocols</em>' containment reference list.
	 * @see lemma.adapted.xcore.service.ServicePackage#getEndpoint_Protocols()
	 * @see lemma.adapted.xcore.service.ImportedProtocolAndDataFormat#getEndpoint
	 * @model opposite="endpoint" containment="true" required="true"
	 * @generated
	 */
	EList<ImportedProtocolAndDataFormat> getProtocols();

	/**
	 * Returns the value of the '<em><b>Microservice</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.service.Microservice#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservice</em>' container reference.
	 * @see #setMicroservice(Microservice)
	 * @see lemma.adapted.xcore.service.ServicePackage#getEndpoint_Microservice()
	 * @see lemma.adapted.xcore.service.Microservice#getEndpoints
	 * @model opposite="endpoints" transient="false"
	 * @generated
	 */
	Microservice getMicroservice();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.Endpoint#getMicroservice <em>Microservice</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microservice</em>' container reference.
	 * @see #getMicroservice()
	 * @generated
	 */
	void setMicroservice(Microservice value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.service.Interface#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' container reference.
	 * @see #setInterface(Interface)
	 * @see lemma.adapted.xcore.service.ServicePackage#getEndpoint_Interface()
	 * @see lemma.adapted.xcore.service.Interface#getEndpoints
	 * @model opposite="endpoints" transient="false"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.Endpoint#getInterface <em>Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' container reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.service.Operation#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(Operation)
	 * @see lemma.adapted.xcore.service.ServicePackage#getEndpoint_Operation()
	 * @see lemma.adapted.xcore.service.Operation#getEndpoints
	 * @model opposite="endpoints" transient="false"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.Endpoint#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Referred Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.service.ReferredOperation#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Operation</em>' container reference.
	 * @see #setReferredOperation(ReferredOperation)
	 * @see lemma.adapted.xcore.service.ServicePackage#getEndpoint_ReferredOperation()
	 * @see lemma.adapted.xcore.service.ReferredOperation#getEndpoints
	 * @model opposite="endpoints" transient="false"
	 * @generated
	 */
	ReferredOperation getReferredOperation();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.Endpoint#getReferredOperation <em>Referred Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Operation</em>' container reference.
	 * @see #getReferredOperation()
	 * @generated
	 */
	void setReferredOperation(ReferredOperation value);

} // Endpoint

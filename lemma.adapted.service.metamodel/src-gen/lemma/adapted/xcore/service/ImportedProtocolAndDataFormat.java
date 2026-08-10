/**
 */
package lemma.adapted.xcore.service;

import lemma.adapted.xcore.technology.DataFormat;
import lemma.adapted.xcore.technology.Protocol;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Protocol And Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Represents a protocol and data format imported from a technology model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.service.ImportedProtocolAndDataFormat#getImport <em>Import</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.ImportedProtocolAndDataFormat#getImportedProtocol <em>Imported Protocol</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.ImportedProtocolAndDataFormat#getDataFormat <em>Data Format</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.ImportedProtocolAndDataFormat#getSpecification <em>Specification</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.ImportedProtocolAndDataFormat#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.service.ServicePackage#getImportedProtocolAndDataFormat()
 * @model
 * @generated
 */
public interface ImportedProtocolAndDataFormat extends EObject {
	/**
	 * Returns the value of the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Implicit Constraints:
	 *     (C1) Data format must match protocol as specified in the technology model.
	 *          Ensured by: DSL scope provider.
	 *     (C2) Import must match annotated technology of parent microservice.
	 *          Ensured by: DSL scope provider.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Import</em>' reference.
	 * @see #setImport(Import)
	 * @see lemma.adapted.xcore.service.ServicePackage#getImportedProtocolAndDataFormat_Import()
	 * @model
	 * @generated
	 */
	Import getImport();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.ImportedProtocolAndDataFormat#getImport <em>Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import</em>' reference.
	 * @see #getImport()
	 * @generated
	 */
	void setImport(Import value);

	/**
	 * Returns the value of the '<em><b>Imported Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Protocol</em>' reference.
	 * @see #setImportedProtocol(Protocol)
	 * @see lemma.adapted.xcore.service.ServicePackage#getImportedProtocolAndDataFormat_ImportedProtocol()
	 * @model
	 * @generated
	 */
	Protocol getImportedProtocol();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.ImportedProtocolAndDataFormat#getImportedProtocol <em>Imported Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Protocol</em>' reference.
	 * @see #getImportedProtocol()
	 * @generated
	 */
	void setImportedProtocol(Protocol value);

	/**
	 * Returns the value of the '<em><b>Data Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Format</em>' reference.
	 * @see #setDataFormat(DataFormat)
	 * @see lemma.adapted.xcore.service.ServicePackage#getImportedProtocolAndDataFormat_DataFormat()
	 * @model
	 * @generated
	 */
	DataFormat getDataFormat();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.ImportedProtocolAndDataFormat#getDataFormat <em>Data Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Format</em>' reference.
	 * @see #getDataFormat()
	 * @generated
	 */
	void setDataFormat(DataFormat value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.service.ProtocolSpecification#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' container reference.
	 * @see #setSpecification(ProtocolSpecification)
	 * @see lemma.adapted.xcore.service.ServicePackage#getImportedProtocolAndDataFormat_Specification()
	 * @see lemma.adapted.xcore.service.ProtocolSpecification#getProtocol
	 * @model opposite="protocol" transient="false"
	 * @generated
	 */
	ProtocolSpecification getSpecification();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.ImportedProtocolAndDataFormat#getSpecification <em>Specification</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' container reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(ProtocolSpecification value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.service.Endpoint#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' container reference.
	 * @see #setEndpoint(Endpoint)
	 * @see lemma.adapted.xcore.service.ServicePackage#getImportedProtocolAndDataFormat_Endpoint()
	 * @see lemma.adapted.xcore.service.Endpoint#getProtocols
	 * @model opposite="protocols" transient="false"
	 * @generated
	 */
	Endpoint getEndpoint();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.ImportedProtocolAndDataFormat#getEndpoint <em>Endpoint</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' container reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(Endpoint value);

} // ImportedProtocolAndDataFormat

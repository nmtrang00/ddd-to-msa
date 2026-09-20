/**
 */
package dact;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.DomainObject#getOwnedProperties <em>Owned Properties</em>}</li>
 *   <li>{@link dact.DomainObject#getOwnedOperations <em>Owned Operations</em>}</li>
 *   <li>{@link dact.DomainObject#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getDomainObject()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueOperationNames UniquePropertyNames SingleInvariantOperation'"
 * @generated
 */
public interface DomainObject extends Type, DomainElement, DiagnosticSupported {
	/**
	 * Returns the value of the '<em><b>Owned Properties</b></em>' containment reference list.
	 * The list contents are of type {@link dact.Property}.
	 * It is bidirectional and its opposite is '{@link dact.Property#getDomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Properties</em>' containment reference list.
	 * @see dact.DactPackage#getDomainObject_OwnedProperties()
	 * @see dact.Property#getDomainObject
	 * @model opposite="domainObject" containment="true" ordered="false"
	 * @generated
	 */
	EList<Property> getOwnedProperties();

	/**
	 * Returns the value of the '<em><b>Owned Operations</b></em>' containment reference list.
	 * The list contents are of type {@link dact.Operation}.
	 * It is bidirectional and its opposite is '{@link dact.Operation#getDomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operations</em>' containment reference list.
	 * @see dact.DactPackage#getDomainObject_OwnedOperations()
	 * @see dact.Operation#getDomainObject
	 * @model opposite="domainObject" containment="true" ordered="false"
	 * @generated
	 */
	EList<Operation> getOwnedOperations();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link dact.Scope#getDomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(Scope)
	 * @see dact.DactPackage#getDomainObject_Scope()
	 * @see dact.Scope#getDomainObject
	 * @model opposite="domainObject" containment="true"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link dact.DomainObject#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean UniqueOperationNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean UniquePropertyNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean SingleInvariantOperation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DomainObject

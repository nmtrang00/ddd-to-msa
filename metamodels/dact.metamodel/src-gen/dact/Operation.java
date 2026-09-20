/**
 */
package dact;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.Operation#getToExpose <em>To Expose</em>}</li>
 *   <li>{@link dact.Operation#getType <em>Type</em>}</li>
 *   <li>{@link dact.Operation#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link dact.Operation#getOwnedParameters <em>Owned Parameters</em>}</li>
 *   <li>{@link dact.Operation#getInterface <em>Interface</em>}</li>
 *   <li>{@link dact.Operation#getDomainObject <em>Domain Object</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MatchedDomainOperationType MatchedRepositoryOperationType MatchedServiceOperationType NoBehaviorSpecification ConstructorMatchesProperties'"
 * @generated
 */
public interface Operation extends NamedElement, DefinesIdentityObject, DiagnosticSupported {
	/**
	 * Returns the value of the '<em><b>To Expose</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Expose</em>' attribute.
	 * @see #setToExpose(Boolean)
	 * @see dact.DactPackage#getOperation_ToExpose()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getToExpose();

	/**
	 * Sets the value of the '{@link dact.Operation#getToExpose <em>To Expose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Expose</em>' attribute.
	 * @see #getToExpose()
	 * @generated
	 */
	void setToExpose(Boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dact.OperationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dact.OperationType
	 * @see #setType(OperationType)
	 * @see dact.DactPackage#getOperation_Type()
	 * @model unique="false" required="true"
	 * @generated
	 */
	OperationType getType();

	/**
	 * Sets the value of the '{@link dact.Operation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dact.OperationType
	 * @see #getType()
	 * @generated
	 */
	void setType(OperationType value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dact.Behavior#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see dact.DactPackage#getOperation_Behavior()
	 * @see dact.Behavior#getSpecification
	 * @model opposite="specification"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link dact.Operation#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link dact.Parameter}.
	 * It is bidirectional and its opposite is '{@link dact.Parameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameters</em>' containment reference list.
	 * @see dact.DactPackage#getOperation_OwnedParameters()
	 * @see dact.Parameter#getOperation
	 * @model opposite="operation" containment="true" ordered="false"
	 * @generated
	 */
	EList<Parameter> getOwnedParameters();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.Interface#getOwnedOperations <em>Owned Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' container reference.
	 * @see #setInterface(Interface)
	 * @see dact.DactPackage#getOperation_Interface()
	 * @see dact.Interface#getOwnedOperations
	 * @model opposite="ownedOperations" transient="false"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link dact.Operation#getInterface <em>Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' container reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Domain Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.DomainObject#getOwnedOperations <em>Owned Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object</em>' container reference.
	 * @see #setDomainObject(DomainObject)
	 * @see dact.DactPackage#getOperation_DomainObject()
	 * @see dact.DomainObject#getOwnedOperations
	 * @model opposite="ownedOperations" transient="false"
	 * @generated
	 */
	DomainObject getDomainObject();

	/**
	 * Sets the value of the '{@link dact.Operation#getDomainObject <em>Domain Object</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Object</em>' container reference.
	 * @see #getDomainObject()
	 * @generated
	 */
	void setDomainObject(DomainObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean MatchedDomainOperationType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean MatchedRepositoryOperationType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean MatchedServiceOperationType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean NoBehaviorSpecification(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean ConstructorMatchesProperties(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Operation

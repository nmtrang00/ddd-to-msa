/**
 */
package dact;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.SpecOperation#getIsInvariant <em>Is Invariant</em>}</li>
 *   <li>{@link dact.SpecOperation#getOwnedRules <em>Owned Rules</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getSpecOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='BehaviorXorSpecification NoInputParameters OwnedByDomainObjectOnly UniqueRuleNames SingleBoolOutParameter'"
 * @generated
 */
public interface SpecOperation extends Operation, DiagnosticSupported {
	/**
	 * Returns the value of the '<em><b>Is Invariant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Invariant</em>' attribute.
	 * @see #setIsInvariant(Boolean)
	 * @see dact.DactPackage#getSpecOperation_IsInvariant()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getIsInvariant();

	/**
	 * Sets the value of the '{@link dact.SpecOperation#getIsInvariant <em>Is Invariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Invariant</em>' attribute.
	 * @see #getIsInvariant()
	 * @generated
	 */
	void setIsInvariant(Boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Rules</b></em>' containment reference list.
	 * The list contents are of type {@link dact.SpecRule}.
	 * It is bidirectional and its opposite is '{@link dact.SpecRule#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Rules</em>' containment reference list.
	 * @see dact.DactPackage#getSpecOperation_OwnedRules()
	 * @see dact.SpecRule#getOperation
	 * @model opposite="operation" containment="true"
	 * @generated
	 */
	EList<SpecRule> getOwnedRules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean BehaviorXorSpecification(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean NoInputParameters(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean OwnedByDomainObjectOnly(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean UniqueRuleNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean SingleBoolOutParameter(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SpecOperation

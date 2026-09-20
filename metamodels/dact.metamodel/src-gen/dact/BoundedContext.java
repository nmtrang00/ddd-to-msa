/**
 */
package dact;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounded Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.BoundedContext#getIsExternal <em>Is External</em>}</li>
 *   <li>{@link dact.BoundedContext#getOwnedElements <em>Owned Elements</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getBoundedContext()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueDomainElementNames'"
 * @generated
 */
public interface BoundedContext extends NamedElement, DiagnosticSupported {
	/**
	 * Returns the value of the '<em><b>Is External</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is External</em>' attribute.
	 * @see #setIsExternal(Boolean)
	 * @see dact.DactPackage#getBoundedContext_IsExternal()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getIsExternal();

	/**
	 * Sets the value of the '{@link dact.BoundedContext#getIsExternal <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is External</em>' attribute.
	 * @see #getIsExternal()
	 * @generated
	 */
	void setIsExternal(Boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' containment reference list.
	 * The list contents are of type {@link dact.DomainElement}.
	 * It is bidirectional and its opposite is '{@link dact.DomainElement#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' containment reference list.
	 * @see dact.DactPackage#getBoundedContext_OwnedElements()
	 * @see dact.DomainElement#getContext
	 * @model opposite="context" containment="true" ordered="false"
	 * @generated
	 */
	EList<DomainElement> getOwnedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean UniqueDomainElementNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // BoundedContext

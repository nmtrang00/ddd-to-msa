/**
 */
package dact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.DomainElement#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getDomainElement()
 * @model abstract="true"
 * @generated
 */
public interface DomainElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.BoundedContext#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(BoundedContext)
	 * @see dact.DactPackage#getDomainElement_Context()
	 * @see dact.BoundedContext#getOwnedElements
	 * @model opposite="ownedElements" transient="false"
	 * @generated
	 */
	BoundedContext getContext();

	/**
	 * Sets the value of the '{@link dact.DomainElement#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(BoundedContext value);

} // DomainElement

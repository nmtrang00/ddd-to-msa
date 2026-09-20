/**
 */
package dact;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.Property#getIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link dact.Property#getDomainObject <em>Domain Object</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getProperty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MandatoryType CompositeRequiresEntity AggregateIsNotComposed PrimitivePropertyRequiresName SharedObjectTypeRestriction'"
 * @generated
 */
public interface Property extends DefinesIdentityObject, TypedMultiplicityElement, DiagnosticSupported {
	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(Boolean)
	 * @see dact.DactPackage#getProperty_IsComposite()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getIsComposite();

	/**
	 * Sets the value of the '{@link dact.Property#getIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #getIsComposite()
	 * @generated
	 */
	void setIsComposite(Boolean value);

	/**
	 * Returns the value of the '<em><b>Domain Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.DomainObject#getOwnedProperties <em>Owned Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object</em>' container reference.
	 * @see #setDomainObject(DomainObject)
	 * @see dact.DactPackage#getProperty_DomainObject()
	 * @see dact.DomainObject#getOwnedProperties
	 * @model opposite="ownedProperties" transient="false"
	 * @generated
	 */
	DomainObject getDomainObject();

	/**
	 * Sets the value of the '{@link dact.Property#getDomainObject <em>Domain Object</em>}' container reference.
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
	boolean MandatoryType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean CompositeRequiresEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean AggregateIsNotComposed(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean PrimitivePropertyRequiresName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean SharedObjectTypeRestriction(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Property

/**
 */
package dact;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.Enumeration#getOwnedLiterals <em>Owned Literals</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends DataType, DomainElement {
	/**
	 * Returns the value of the '<em><b>Owned Literals</b></em>' containment reference list.
	 * The list contents are of type {@link dact.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Literals</em>' containment reference list.
	 * @see dact.DactPackage#getEnumeration_OwnedLiterals()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getOwnedLiterals();

} // Enumeration

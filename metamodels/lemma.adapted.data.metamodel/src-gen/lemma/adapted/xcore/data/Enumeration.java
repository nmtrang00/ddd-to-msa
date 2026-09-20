/**
 */
package lemma.adapted.xcore.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Represents an enumeration that can have a variety of fields with arbitrary initializing values
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.data.Enumeration#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.data.DataPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends ComplexType {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.data.EnumerationField}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.data.EnumerationField#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Implicit Constraints:
	 *     (C1) Field names must be unique.
	 *          Ensured by: DSL validator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see lemma.adapted.xcore.data.DataPackage#getEnumeration_Fields()
	 * @see lemma.adapted.xcore.data.EnumerationField#getEnumeration
	 * @model opposite="enumeration" containment="true" required="true"
	 * @generated
	 */
	EList<EnumerationField> getFields();

} // Enumeration

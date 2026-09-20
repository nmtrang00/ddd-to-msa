/**
 */
package dact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.Identifier#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getIdentifier()
 * @model
 * @generated
 */
public interface Identifier extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(Integer)
	 * @see dact.DactPackage#getIdentifier_Index()
	 * @model unique="false"
	 * @generated
	 */
	Integer getIndex();

	/**
	 * Sets the value of the '{@link dact.Identifier#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Integer value);

} // Identifier

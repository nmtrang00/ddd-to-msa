/**
 */
package lemma.adapted.xcore.behavior;

import lemma.adapted.xcore.data.DataOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Data Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.ImportedDataOperation#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getImportedDataOperation()
 * @model
 * @generated
 */
public interface ImportedDataOperation extends ImportedOperation {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(DataOperation)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getImportedDataOperation_Operation()
	 * @model
	 * @generated
	 */
	DataOperation getOperation();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ImportedDataOperation#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(DataOperation value);

} // ImportedDataOperation

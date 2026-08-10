/**
 */
package lemma.adapted.xcore.behavior;

import lemma.adapted.xcore.service.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Interface Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.ImportedInterfaceOperation#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getImportedInterfaceOperation()
 * @model
 * @generated
 */
public interface ImportedInterfaceOperation extends ImportedOperation {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getImportedInterfaceOperation_Operation()
	 * @model
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ImportedInterfaceOperation#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // ImportedInterfaceOperation

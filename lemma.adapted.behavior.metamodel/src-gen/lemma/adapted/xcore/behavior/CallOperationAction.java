/**
 */
package lemma.adapted.xcore.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Operation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.CallOperationAction#getDomainToDeclareResult <em>Domain To Declare Result</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.CallOperationAction#getImportedOperation <em>Imported Operation</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.CallOperationAction#getParameterMappings <em>Parameter Mappings</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getCallOperationAction()
 * @model
 * @generated
 */
public interface CallOperationAction extends ExecutableNode {
	/**
	 * Returns the value of the '<em><b>Domain To Declare Result</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain To Declare Result</em>' attribute.
	 * @see #setDomainToDeclareResult(Boolean)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getCallOperationAction_DomainToDeclareResult()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getDomainToDeclareResult();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.CallOperationAction#getDomainToDeclareResult <em>Domain To Declare Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain To Declare Result</em>' attribute.
	 * @see #getDomainToDeclareResult()
	 * @generated
	 */
	void setDomainToDeclareResult(Boolean value);

	/**
	 * Returns the value of the '<em><b>Imported Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Operation</em>' containment reference.
	 * @see #setImportedOperation(ImportedOperation)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getCallOperationAction_ImportedOperation()
	 * @model containment="true"
	 * @generated
	 */
	ImportedOperation getImportedOperation();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.CallOperationAction#getImportedOperation <em>Imported Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Operation</em>' containment reference.
	 * @see #getImportedOperation()
	 * @generated
	 */
	void setImportedOperation(ImportedOperation value);

	/**
	 * Returns the value of the '<em><b>Parameter Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.behavior.ParameterMapping}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.ParameterMapping#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Mappings</em>' containment reference list.
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getCallOperationAction_ParameterMappings()
	 * @see lemma.adapted.xcore.behavior.ParameterMapping#getAction
	 * @model opposite="action" containment="true"
	 * @generated
	 */
	EList<ParameterMapping> getParameterMappings();

} // CallOperationAction

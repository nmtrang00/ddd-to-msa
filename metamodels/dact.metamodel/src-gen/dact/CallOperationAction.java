/**
 */
package dact;

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
 *   <li>{@link dact.CallOperationAction#getToDeclareResult <em>To Declare Result</em>}</li>
 *   <li>{@link dact.CallOperationAction#getOperation <em>Operation</em>}</li>
 *   <li>{@link dact.CallOperationAction#getParameterMappings <em>Parameter Mappings</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getCallOperationAction()
 * @model
 * @generated
 */
public interface CallOperationAction extends ExecutableNode {
	/**
	 * Returns the value of the '<em><b>To Declare Result</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Declare Result</em>' attribute.
	 * @see #setToDeclareResult(Boolean)
	 * @see dact.DactPackage#getCallOperationAction_ToDeclareResult()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getToDeclareResult();

	/**
	 * Sets the value of the '{@link dact.CallOperationAction#getToDeclareResult <em>To Declare Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Declare Result</em>' attribute.
	 * @see #getToDeclareResult()
	 * @generated
	 */
	void setToDeclareResult(Boolean value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see dact.DactPackage#getCallOperationAction_Operation()
	 * @model required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link dact.CallOperationAction#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Parameter Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link dact.ParameterMapping}.
	 * It is bidirectional and its opposite is '{@link dact.ParameterMapping#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Mappings</em>' containment reference list.
	 * @see dact.DactPackage#getCallOperationAction_ParameterMappings()
	 * @see dact.ParameterMapping#getAction
	 * @model opposite="action" containment="true" ordered="false"
	 * @generated
	 */
	EList<ParameterMapping> getParameterMappings();

} // CallOperationAction

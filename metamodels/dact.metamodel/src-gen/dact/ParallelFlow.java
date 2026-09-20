/**
 */
package dact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.ParallelFlow#isIsPrimary <em>Is Primary</em>}</li>
 *   <li>{@link dact.ParallelFlow#getParallelNode <em>Parallel Node</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getParallelFlow()
 * @model
 * @generated
 */
public interface ParallelFlow extends ActivityGroup {
	/**
	 * Returns the value of the '<em><b>Is Primary</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary</em>' attribute.
	 * @see #setIsPrimary(boolean)
	 * @see dact.DactPackage#getParallelFlow_IsPrimary()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isIsPrimary();

	/**
	 * Sets the value of the '{@link dact.ParallelFlow#isIsPrimary <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary</em>' attribute.
	 * @see #isIsPrimary()
	 * @generated
	 */
	void setIsPrimary(boolean value);

	/**
	 * Returns the value of the '<em><b>Parallel Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.ParallelNode#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel Node</em>' container reference.
	 * @see #setParallelNode(ParallelNode)
	 * @see dact.DactPackage#getParallelFlow_ParallelNode()
	 * @see dact.ParallelNode#getFlows
	 * @model opposite="flows" required="true" transient="false"
	 * @generated
	 */
	ParallelNode getParallelNode();

	/**
	 * Sets the value of the '{@link dact.ParallelFlow#getParallelNode <em>Parallel Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel Node</em>' container reference.
	 * @see #getParallelNode()
	 * @generated
	 */
	void setParallelNode(ParallelNode value);

} // ParallelFlow

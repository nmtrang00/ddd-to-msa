/**
 */
package lemma.adapted.xcore.service;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api Parameter Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * API comment for an operation's parameter
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.service.ApiParameterComment#getComment <em>Comment</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.ApiParameterComment#isRequired <em>Required</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.ApiParameterComment#isReturned <em>Returned</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.ApiParameterComment#getParameter <em>Parameter</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.ApiParameterComment#getOperationComment <em>Operation Comment</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.service.ServicePackage#getApiParameterComment()
 * @model
 * @generated
 */
public interface ApiParameterComment extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see lemma.adapted.xcore.service.ServicePackage#getApiParameterComment_Comment()
	 * @model unique="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.ApiParameterComment#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see lemma.adapted.xcore.service.ServicePackage#getApiParameterComment_Required()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.ApiParameterComment#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returned</em>' attribute.
	 * @see #setReturned(boolean)
	 * @see lemma.adapted.xcore.service.ServicePackage#getApiParameterComment_Returned()
	 * @model unique="false"
	 * @generated
	 */
	boolean isReturned();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.ApiParameterComment#isReturned <em>Returned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returned</em>' attribute.
	 * @see #isReturned()
	 * @generated
	 */
	void setReturned(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see lemma.adapted.xcore.service.ServicePackage#getApiParameterComment_Parameter()
	 * @model
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.ApiParameterComment#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Operation Comment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.service.ApiOperationComment#getParameterComments <em>Parameter Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Comment</em>' container reference.
	 * @see #setOperationComment(ApiOperationComment)
	 * @see lemma.adapted.xcore.service.ServicePackage#getApiParameterComment_OperationComment()
	 * @see lemma.adapted.xcore.service.ApiOperationComment#getParameterComments
	 * @model opposite="parameterComments" transient="false"
	 * @generated
	 */
	ApiOperationComment getOperationComment();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.ApiParameterComment#getOperationComment <em>Operation Comment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Comment</em>' container reference.
	 * @see #getOperationComment()
	 * @generated
	 */
	void setOperationComment(ApiOperationComment value);

} // ApiParameterComment

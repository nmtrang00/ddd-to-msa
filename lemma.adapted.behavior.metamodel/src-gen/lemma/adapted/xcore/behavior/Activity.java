/**
 */
package lemma.adapted.xcore.behavior;

import lemma.adapted.xcore.service.Parameter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.Activity#getToTransform <em>To Transform</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.Activity#getOwnedParameters <em>Owned Parameters</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.Activity#getParameterMappings <em>Parameter Mappings</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.Activity#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends NamedElement, Behavior {
	/**
	 * Returns the value of the '<em><b>To Transform</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Transform</em>' attribute.
	 * @see #setToTransform(Boolean)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivity_ToTransform()
	 * @model default="true" unique="false"
	 * @generated
	 */
	Boolean getToTransform();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.Activity#getToTransform <em>To Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Transform</em>' attribute.
	 * @see #getToTransform()
	 * @generated
	 */
	void setToTransform(Boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.service.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameters</em>' containment reference list.
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivity_OwnedParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getOwnedParameters();

	/**
	 * Returns the value of the '<em><b>Parameter Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.behavior.ParameterMapping}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.ParameterMapping#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Mappings</em>' containment reference list.
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivity_ParameterMappings()
	 * @see lemma.adapted.xcore.behavior.ParameterMapping#getActivity
	 * @model opposite="activity" containment="true"
	 * @generated
	 */
	EList<ParameterMapping> getParameterMappings();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.ActivityGroup#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(ActivityGroup)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivity_Root()
	 * @see lemma.adapted.xcore.behavior.ActivityGroup#getActivity
	 * @model opposite="activity" containment="true"
	 * @generated
	 */
	ActivityGroup getRoot();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.Activity#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(ActivityGroup value);

} // Activity

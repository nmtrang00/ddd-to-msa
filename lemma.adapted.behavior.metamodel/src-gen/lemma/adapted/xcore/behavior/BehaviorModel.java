/**
 */
package lemma.adapted.xcore.behavior;

import lemma.adapted.xcore.service.Import;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.BehaviorModel#getT_modelUri <em>Tmodel Uri</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.BehaviorModel#getImports <em>Imports</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.BehaviorModel#getActivityModel <em>Activity Model</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getBehaviorModel()
 * @model
 * @generated
 */
public interface BehaviorModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Tmodel Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmodel Uri</em>' attribute.
	 * @see #setT_modelUri(String)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getBehaviorModel_T_modelUri()
	 * @model unique="false"
	 * @generated
	 */
	String getT_modelUri();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.BehaviorModel#getT_modelUri <em>Tmodel Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmodel Uri</em>' attribute.
	 * @see #getT_modelUri()
	 * @generated
	 */
	void setT_modelUri(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.service.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getBehaviorModel_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Activity Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Model</em>' containment reference.
	 * @see #setActivityModel(ActivityModel)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getBehaviorModel_ActivityModel()
	 * @model containment="true"
	 * @generated
	 */
	ActivityModel getActivityModel();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.BehaviorModel#getActivityModel <em>Activity Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Model</em>' containment reference.
	 * @see #getActivityModel()
	 * @generated
	 */
	void setActivityModel(ActivityModel value);

} // BehaviorModel

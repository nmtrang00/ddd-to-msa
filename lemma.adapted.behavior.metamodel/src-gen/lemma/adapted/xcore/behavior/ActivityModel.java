/**
 */
package lemma.adapted.xcore.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.ActivityModel#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivityModel()
 * @model
 * @generated
 */
public interface ActivityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.behavior.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getActivityModel_Activities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivities();

} // ActivityModel

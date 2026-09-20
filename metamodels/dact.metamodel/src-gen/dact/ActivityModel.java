/**
 */
package dact;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.ActivityModel#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getActivityModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueActivityNames'"
 * @generated
 */
public interface ActivityModel extends Model, DiagnosticSupported {
	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link dact.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see dact.DactPackage#getActivityModel_Activities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean UniqueActivityNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ActivityModel

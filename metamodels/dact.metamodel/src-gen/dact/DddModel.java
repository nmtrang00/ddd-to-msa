/**
 */
package dact;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddd Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.DddModel#getBoundedContexts <em>Bounded Contexts</em>}</li>
 *   <li>{@link dact.DddModel#getSharedDomainObjects <em>Shared Domain Objects</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getDddModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueBoundedContextNames UniqueSharedDomainObjectNames'"
 * @generated
 */
public interface DddModel extends Model, DiagnosticSupported {
	/**
	 * Returns the value of the '<em><b>Bounded Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link dact.BoundedContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounded Contexts</em>' containment reference list.
	 * @see dact.DactPackage#getDddModel_BoundedContexts()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BoundedContext> getBoundedContexts();

	/**
	 * Returns the value of the '<em><b>Shared Domain Objects</b></em>' containment reference list.
	 * The list contents are of type {@link dact.SharedDomainObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Domain Objects</em>' containment reference list.
	 * @see dact.DactPackage#getDddModel_SharedDomainObjects()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SharedDomainObject> getSharedDomainObjects();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean UniqueBoundedContextNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean UniqueSharedDomainObjectNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DddModel

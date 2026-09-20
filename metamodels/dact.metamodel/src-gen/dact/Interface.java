/**
 */
package dact;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.Interface#getOwnedOperations <em>Owned Operations</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getInterface()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueOperationNames'"
 * @generated
 */
public interface Interface extends DomainElement, DiagnosticSupported {
	/**
	 * Returns the value of the '<em><b>Owned Operations</b></em>' containment reference list.
	 * The list contents are of type {@link dact.Operation}.
	 * It is bidirectional and its opposite is '{@link dact.Operation#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operations</em>' containment reference list.
	 * @see dact.DactPackage#getInterface_OwnedOperations()
	 * @see dact.Operation#getInterface
	 * @model opposite="interface" containment="true" ordered="false"
	 * @generated
	 */
	EList<Operation> getOwnedOperations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean UniqueOperationNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Interface

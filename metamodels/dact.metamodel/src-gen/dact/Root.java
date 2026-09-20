/**
 */
package dact;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.Root#getDdd <em>Ddd</em>}</li>
 *   <li>{@link dact.Root#getActivity <em>Activity</em>}</li>
 *   <li>{@link dact.Root#getPrimitivesTypes <em>Primitives Types</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getRoot()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniquePrimitiveType'"
 * @generated
 */
public interface Root extends DiagnosticSupported {
	/**
	 * Returns the value of the '<em><b>Ddd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ddd</em>' containment reference.
	 * @see #setDdd(DddModel)
	 * @see dact.DactPackage#getRoot_Ddd()
	 * @model containment="true"
	 * @generated
	 */
	DddModel getDdd();

	/**
	 * Sets the value of the '{@link dact.Root#getDdd <em>Ddd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ddd</em>' containment reference.
	 * @see #getDdd()
	 * @generated
	 */
	void setDdd(DddModel value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(ActivityModel)
	 * @see dact.DactPackage#getRoot_Activity()
	 * @model containment="true"
	 * @generated
	 */
	ActivityModel getActivity();

	/**
	 * Sets the value of the '{@link dact.Root#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(ActivityModel value);

	/**
	 * Returns the value of the '<em><b>Primitives Types</b></em>' containment reference list.
	 * The list contents are of type {@link dact.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitives Types</em>' containment reference list.
	 * @see dact.DactPackage#getRoot_PrimitivesTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimitiveType> getPrimitivesTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean UniquePrimitiveType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Root

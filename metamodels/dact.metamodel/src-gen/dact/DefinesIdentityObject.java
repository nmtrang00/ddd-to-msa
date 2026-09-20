/**
 */
package dact;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defines Identity Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.DefinesIdentityObject#isDefinesIdentity <em>Defines Identity</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getDefinesIdentityObject()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SingleValuedPrimitiveProperty'"
 * @generated
 */
public interface DefinesIdentityObject extends DiagnosticSupported {
	/**
	 * Returns the value of the '<em><b>Defines Identity</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines Identity</em>' attribute.
	 * @see #setDefinesIdentity(boolean)
	 * @see dact.DactPackage#getDefinesIdentityObject_DefinesIdentity()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isDefinesIdentity();

	/**
	 * Sets the value of the '{@link dact.DefinesIdentityObject#isDefinesIdentity <em>Defines Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defines Identity</em>' attribute.
	 * @see #isDefinesIdentity()
	 * @generated
	 */
	void setDefinesIdentity(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean SingleValuedPrimitiveProperty(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DefinesIdentityObject

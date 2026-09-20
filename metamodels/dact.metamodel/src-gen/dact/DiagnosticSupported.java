/**
 */
package dact;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic Supported</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see dact.DactPackage#getDiagnosticSupported()
 * @model abstract="true"
 * @generated
 */
public interface DiagnosticSupported extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" errNameUnique="false" messageUnique="false"
	 * @generated
	 */
	boolean report(DiagnosticChain diagnostics, String errName, String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" warningNameUnique="false" messageUnique="false"
	 * @generated
	 */
	boolean warn(DiagnosticChain diagnostics, String warningName, String message);

} // DiagnosticSupported

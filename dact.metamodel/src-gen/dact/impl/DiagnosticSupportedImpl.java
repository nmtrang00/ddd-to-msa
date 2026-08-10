/**
 */
package dact.impl;

import dact.DactPackage;
import dact.DiagnosticSupported;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Supported</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DiagnosticSupportedImpl extends MinimalEObjectImpl.Container implements DiagnosticSupported {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticSupportedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.Literals.DIAGNOSTIC_SUPPORTED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean report(final DiagnosticChain diagnostics, final String message) {
		if ((diagnostics != null)) {
			BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, 
				"http://www.example.org/xcore/dact", 0, message, new Object[] { this });
			diagnostics.add(_basicDiagnostic);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DactPackage.DIAGNOSTIC_SUPPORTED___REPORT__DIAGNOSTICCHAIN_STRING:
				return report((DiagnosticChain)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DiagnosticSupportedImpl

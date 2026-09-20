/**
 */
package dact.impl;

import dact.DactPackage;
import dact.DiagnosticSupported;
import dact.Interface;
import dact.Operation;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.InterfaceImpl#getOwnedOperations <em>Owned Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InterfaceImpl extends DomainElementImpl implements Interface {
	/**
	 * The cached value of the '{@link #getOwnedOperations() <em>Owned Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.eINSTANCE.getInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operation> getOwnedOperations() {
		if (ownedOperations == null) {
			ownedOperations = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, DactPackage.INTERFACE__OWNED_OPERATIONS, DactPackage.OPERATION__INTERFACE);
		}
		return ownedOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean UniqueOperationNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final Function1<Operation, String> _function = new Function1<Operation, String>() {
			public String apply(final Operation it) {
				return it.getName();
			}
		};
		final List<String> names = IterableExtensions.<String>toList(IterableExtensions.<String>filterNull(XcoreEListExtensions.<Operation, String>map(this.getOwnedOperations(), _function)));
		int _size = names.size();
		int _size_1 = IterableExtensions.<String>toSet(names).size();
		boolean _tripleEquals = (_size == _size_1);
		if (_tripleEquals) {
			return true;
		}
		final Function1<String, Boolean> _function_1 = new Function1<String, Boolean>() {
			public Boolean apply(final String n) {
				final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
					public Boolean apply(final String it) {
						return Boolean.valueOf(Objects.equals(it, n));
					}
				};
				int _size = IterableExtensions.size(IterableExtensions.<String>filter(names, _function));
				return Boolean.valueOf((_size > 1));
			}
		};
		final String duplicates = IterableExtensions.join(IterableExtensions.<String>toSet(IterableExtensions.<String>filter(names, _function_1)), ", ");
		String _name = this.getName();
		String _plus = ("Operations of interface \'" + _name);
		String _plus_1 = (_plus + "\' must have unique ");
		String _plus_2 = (_plus_1 + 
			"names; duplicated: ");
		String _plus_3 = (_plus_2 + duplicates);
		String _plus_4 = (_plus_3 + ".");
		return this.report(diagnostics, 
			"UniqueOperationNames", _plus_4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean report(final DiagnosticChain diagnostics, final String errName, final String message) {
		if ((diagnostics != null)) {
			BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, 
				"http://www.example.org/xcore/dact", 0, ((errName + ": ") + message), new Object[] { this });
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
	public boolean warn(final DiagnosticChain diagnostics, final String warningName, final String message) {
		if ((diagnostics != null)) {
			BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.WARNING, 
				"http://www.example.org/xcore/dact", 0, ((warningName + ": ") + message), new Object[] { this });
			diagnostics.add(_basicDiagnostic);
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DactPackage.INTERFACE__OWNED_OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOperations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DactPackage.INTERFACE__OWNED_OPERATIONS:
				return ((InternalEList<?>)getOwnedOperations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DactPackage.INTERFACE__OWNED_OPERATIONS:
				return getOwnedOperations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DactPackage.INTERFACE__OWNED_OPERATIONS:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection<? extends Operation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DactPackage.INTERFACE__OWNED_OPERATIONS:
				getOwnedOperations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DactPackage.INTERFACE__OWNED_OPERATIONS:
				return ownedOperations != null && !ownedOperations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == DiagnosticSupported.class) {
			switch (baseOperationID) {
				case DactPackage.DIAGNOSTIC_SUPPORTED___REPORT__DIAGNOSTICCHAIN_STRING_STRING: return DactPackage.INTERFACE___REPORT__DIAGNOSTICCHAIN_STRING_STRING;
				case DactPackage.DIAGNOSTIC_SUPPORTED___WARN__DIAGNOSTICCHAIN_STRING_STRING: return DactPackage.INTERFACE___WARN__DIAGNOSTICCHAIN_STRING_STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DactPackage.INTERFACE___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP:
				return UniqueOperationNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.INTERFACE___REPORT__DIAGNOSTICCHAIN_STRING_STRING:
				return report((DiagnosticChain)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case DactPackage.INTERFACE___WARN__DIAGNOSTICCHAIN_STRING_STRING:
				return warn((DiagnosticChain)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //InterfaceImpl

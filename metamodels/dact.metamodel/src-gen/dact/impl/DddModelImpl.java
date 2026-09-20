/**
 */
package dact.impl;

import dact.BoundedContext;
import dact.DactPackage;
import dact.DddModel;
import dact.DiagnosticSupported;
import dact.SharedDomainObject;

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddd Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.DddModelImpl#getBoundedContexts <em>Bounded Contexts</em>}</li>
 *   <li>{@link dact.impl.DddModelImpl#getSharedDomainObjects <em>Shared Domain Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DddModelImpl extends ModelImpl implements DddModel {
	/**
	 * The cached value of the '{@link #getBoundedContexts() <em>Bounded Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundedContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundedContext> boundedContexts;

	/**
	 * The cached value of the '{@link #getSharedDomainObjects() <em>Shared Domain Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedDomainObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedDomainObject> sharedDomainObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DddModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.eINSTANCE.getDddModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoundedContext> getBoundedContexts() {
		if (boundedContexts == null) {
			boundedContexts = new EObjectContainmentEList<BoundedContext>(BoundedContext.class, this, DactPackage.DDD_MODEL__BOUNDED_CONTEXTS);
		}
		return boundedContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SharedDomainObject> getSharedDomainObjects() {
		if (sharedDomainObjects == null) {
			sharedDomainObjects = new EObjectContainmentEList<SharedDomainObject>(SharedDomainObject.class, this, DactPackage.DDD_MODEL__SHARED_DOMAIN_OBJECTS);
		}
		return sharedDomainObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean UniqueBoundedContextNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final Function1<BoundedContext, String> _function = new Function1<BoundedContext, String>() {
			public String apply(final BoundedContext it) {
				return it.getName();
			}
		};
		final List<String> names = IterableExtensions.<String>toList(IterableExtensions.<String>filterNull(XcoreEListExtensions.<BoundedContext, String>map(this.getBoundedContexts(), _function)));
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
		return this.report(diagnostics, 
			"UniqueBoundedContextNames", 
			(("Bounded context names must be unique; duplicated: " + duplicates) + "."));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean UniqueSharedDomainObjectNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final Function1<SharedDomainObject, String> _function = new Function1<SharedDomainObject, String>() {
			public String apply(final SharedDomainObject it) {
				return it.getName();
			}
		};
		final List<String> names = IterableExtensions.<String>toList(IterableExtensions.<String>filterNull(XcoreEListExtensions.<SharedDomainObject, String>map(this.getSharedDomainObjects(), _function)));
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
		return this.report(diagnostics, 
			"UniqueSharedDomainObjectNames", 
			(("Shared domain object names must be unique; duplicated: " + duplicates) + "."));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DactPackage.DDD_MODEL__BOUNDED_CONTEXTS:
				return ((InternalEList<?>)getBoundedContexts()).basicRemove(otherEnd, msgs);
			case DactPackage.DDD_MODEL__SHARED_DOMAIN_OBJECTS:
				return ((InternalEList<?>)getSharedDomainObjects()).basicRemove(otherEnd, msgs);
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
			case DactPackage.DDD_MODEL__BOUNDED_CONTEXTS:
				return getBoundedContexts();
			case DactPackage.DDD_MODEL__SHARED_DOMAIN_OBJECTS:
				return getSharedDomainObjects();
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
			case DactPackage.DDD_MODEL__BOUNDED_CONTEXTS:
				getBoundedContexts().clear();
				getBoundedContexts().addAll((Collection<? extends BoundedContext>)newValue);
				return;
			case DactPackage.DDD_MODEL__SHARED_DOMAIN_OBJECTS:
				getSharedDomainObjects().clear();
				getSharedDomainObjects().addAll((Collection<? extends SharedDomainObject>)newValue);
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
			case DactPackage.DDD_MODEL__BOUNDED_CONTEXTS:
				getBoundedContexts().clear();
				return;
			case DactPackage.DDD_MODEL__SHARED_DOMAIN_OBJECTS:
				getSharedDomainObjects().clear();
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
			case DactPackage.DDD_MODEL__BOUNDED_CONTEXTS:
				return boundedContexts != null && !boundedContexts.isEmpty();
			case DactPackage.DDD_MODEL__SHARED_DOMAIN_OBJECTS:
				return sharedDomainObjects != null && !sharedDomainObjects.isEmpty();
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
				case DactPackage.DIAGNOSTIC_SUPPORTED___REPORT__DIAGNOSTICCHAIN_STRING_STRING: return DactPackage.DDD_MODEL___REPORT__DIAGNOSTICCHAIN_STRING_STRING;
				case DactPackage.DIAGNOSTIC_SUPPORTED___WARN__DIAGNOSTICCHAIN_STRING_STRING: return DactPackage.DDD_MODEL___WARN__DIAGNOSTICCHAIN_STRING_STRING;
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
			case DactPackage.DDD_MODEL___UNIQUE_BOUNDED_CONTEXT_NAMES__DIAGNOSTICCHAIN_MAP:
				return UniqueBoundedContextNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.DDD_MODEL___UNIQUE_SHARED_DOMAIN_OBJECT_NAMES__DIAGNOSTICCHAIN_MAP:
				return UniqueSharedDomainObjectNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.DDD_MODEL___REPORT__DIAGNOSTICCHAIN_STRING_STRING:
				return report((DiagnosticChain)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case DactPackage.DDD_MODEL___WARN__DIAGNOSTICCHAIN_STRING_STRING:
				return warn((DiagnosticChain)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DddModelImpl

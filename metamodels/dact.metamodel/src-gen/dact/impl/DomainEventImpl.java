/**
 */
package dact.impl;

import com.google.common.collect.Iterables;

import dact.AggregateRoot;
import dact.BoundedContext;
import dact.DactPackage;
import dact.DiagnosticSupported;
import dact.DomainElement;
import dact.DomainEvent;
import dact.DomainObject;
import dact.Operation;
import dact.OperationType;
import dact.Parameter;
import dact.ParameterDirection;
import dact.Property;
import dact.Scope;
import dact.SharedDomainObject;
import dact.SpecOperation;
import dact.Type;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.DomainEventImpl#getContext <em>Context</em>}</li>
 *   <li>{@link dact.impl.DomainEventImpl#getOwnedProperties <em>Owned Properties</em>}</li>
 *   <li>{@link dact.impl.DomainEventImpl#getOwnedOperations <em>Owned Operations</em>}</li>
 *   <li>{@link dact.impl.DomainEventImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link dact.impl.DomainEventImpl#getAbstractedRoot <em>Abstracted Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainEventImpl extends NamedElementImpl implements DomainEvent {
	/**
	 * The cached value of the '{@link #getOwnedProperties() <em>Owned Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedProperties;

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
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected Scope scope;

	/**
	 * The cached value of the '{@link #getAbstractedRoot() <em>Abstracted Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractedRoot()
	 * @generated
	 * @ordered
	 */
	protected AggregateRoot abstractedRoot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.eINSTANCE.getDomainEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundedContext getContext() {
		if (eContainerFeatureID() != DactPackage.DOMAIN_EVENT__CONTEXT) return null;
		return (BoundedContext)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedContext basicGetContext() {
		if (eContainerFeatureID() != DactPackage.DOMAIN_EVENT__CONTEXT) return null;
		return (BoundedContext)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(BoundedContext newContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContext, DactPackage.DOMAIN_EVENT__CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(BoundedContext newContext) {
		if (newContext != eInternalContainer() || (eContainerFeatureID() != DactPackage.DOMAIN_EVENT__CONTEXT && newContext != null)) {
			if (EcoreUtil.isAncestor(this, newContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, DactPackage.BOUNDED_CONTEXT__OWNED_ELEMENTS, BoundedContext.class, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.DOMAIN_EVENT__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getOwnedProperties() {
		if (ownedProperties == null) {
			ownedProperties = new EObjectContainmentWithInverseEList<Property>(Property.class, this, DactPackage.DOMAIN_EVENT__OWNED_PROPERTIES, DactPackage.PROPERTY__DOMAIN_OBJECT);
		}
		return ownedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operation> getOwnedOperations() {
		if (ownedOperations == null) {
			ownedOperations = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, DactPackage.DOMAIN_EVENT__OWNED_OPERATIONS, DactPackage.OPERATION__DOMAIN_OBJECT);
		}
		return ownedOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(Scope newScope, NotificationChain msgs) {
		Scope oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DactPackage.DOMAIN_EVENT__SCOPE, oldScope, newScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(Scope newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, DactPackage.SCOPE__DOMAIN_OBJECT, Scope.class, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, DactPackage.SCOPE__DOMAIN_OBJECT, Scope.class, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.DOMAIN_EVENT__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggregateRoot getAbstractedRoot() {
		if (abstractedRoot != null && abstractedRoot.eIsProxy()) {
			InternalEObject oldAbstractedRoot = (InternalEObject)abstractedRoot;
			abstractedRoot = (AggregateRoot)eResolveProxy(oldAbstractedRoot);
			if (abstractedRoot != oldAbstractedRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.DOMAIN_EVENT__ABSTRACTED_ROOT, oldAbstractedRoot, abstractedRoot));
			}
		}
		return abstractedRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateRoot basicGetAbstractedRoot() {
		return abstractedRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstractedRoot(AggregateRoot newAbstractedRoot) {
		AggregateRoot oldAbstractedRoot = abstractedRoot;
		abstractedRoot = newAbstractedRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.DOMAIN_EVENT__ABSTRACTED_ROOT, oldAbstractedRoot, abstractedRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean UniqueOperationNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final Function1<Operation, Boolean> _function = new Function1<Operation, Boolean>() {
			public Boolean apply(final Operation o) {
				OperationType _type = o.getType();
				return Boolean.valueOf(Objects.equals(_type, OperationType.D0_CONSTRUCTOR));
			}
		};
		final List<Operation> constructors = IterableExtensions.<Operation>toList(IterableExtensions.<Operation>filter(IterableExtensions.<Operation>filterNull(this.getOwnedOperations()), _function));
		final Function1<Operation, String> _function_1 = new Function1<Operation, String>() {
			public String apply(final Operation it) {
				return it.getName();
			}
		};
		final Function1<String, Boolean> _function_2 = new Function1<String, Boolean>() {
			public Boolean apply(final String n) {
				final Function1<Operation, Boolean> _function = new Function1<Operation, Boolean>() {
					public Boolean apply(final Operation it) {
						String _name = it.getName();
						return Boolean.valueOf(Objects.equals(_name, n));
					}
				};
				int _size = IterableExtensions.size(IterableExtensions.<Operation>filter(constructors, _function));
				return Boolean.valueOf((_size > 1));
			}
		};
		final Set<String> overloadedCtorNames = IterableExtensions.<String>toSet(IterableExtensions.<String>filter(IterableExtensions.<String>filterNull(ListExtensions.<Operation, String>map(constructors, _function_1)), _function_2));
		final Function1<Operation, String> _function_3 = new Function1<Operation, String>() {
			public String apply(final Operation o) {
				String _xifexpression = null;
				if ((Objects.equals(o.getType(), OperationType.D0_CONSTRUCTOR) && overloadedCtorNames.contains(o.getName()))) {
					String _name = o.getName();
					String _plus = (_name + "/");
					final Function1<Parameter, Boolean> _function = new Function1<Parameter, Boolean>() {
						public Boolean apply(final Parameter it) {
							ParameterDirection _direction = it.getDirection();
							return Boolean.valueOf(Objects.equals(_direction, ParameterDirection.IN));
						}
					};
					int _size = IterableExtensions.size(IterableExtensions.<Parameter>filter(o.getOwnedParameters(), _function));
					_xifexpression = (_plus + Integer.valueOf(_size));
				}
				else {
					_xifexpression = o.getName();
				}
				return _xifexpression;
			}
		};
		final List<String> signatures = IterableExtensions.<String>toList(IterableExtensions.<String>filterNull(IterableExtensions.<Operation, String>map(IterableExtensions.<Operation>filterNull(this.getOwnedOperations()), _function_3)));
		int _size = signatures.size();
		int _size_1 = IterableExtensions.<String>toSet(signatures).size();
		boolean _tripleEquals = (_size == _size_1);
		if (_tripleEquals) {
			return true;
		}
		final Function1<String, Boolean> _function_4 = new Function1<String, Boolean>() {
			public Boolean apply(final String s) {
				final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
					public Boolean apply(final String it) {
						return Boolean.valueOf(Objects.equals(it, s));
					}
				};
				int _size = IterableExtensions.size(IterableExtensions.<String>filter(signatures, _function));
				return Boolean.valueOf((_size > 1));
			}
		};
		final Function1<String, String> _function_5 = new Function1<String, String>() {
			public String apply(final String it) {
				return IterableExtensions.<String>head(((Iterable<String>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(it.split("/"))));
			}
		};
		final String duplicates = IterableExtensions.join(IterableExtensions.<String>toSet(IterableExtensions.<String, String>map(IterableExtensions.<String>toSet(IterableExtensions.<String>filter(signatures, _function_4)), _function_5)), ", ");
		String _name = this.getName();
		String _plus = ("Operations of \'" + _name);
		String _plus_1 = (_plus + "\' must be uniquely identified; ");
		String _plus_2 = (_plus_1 + 
			"duplicated: ");
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
	public boolean UniquePropertyNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final Function1<Property, String> _function = new Function1<Property, String>() {
			public String apply(final Property it) {
				return it.getName();
			}
		};
		final List<String> names = IterableExtensions.<String>toList(IterableExtensions.<String>filterNull(XcoreEListExtensions.<Property, String>map(this.getOwnedProperties(), _function)));
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
		String _plus = ("Properties of \'" + _name);
		String _plus_1 = (_plus + "\' must have unique names; duplicated: ");
		String _plus_2 = (_plus_1 + duplicates);
		String _plus_3 = (_plus_2 + ".");
		return this.report(diagnostics, 
			"UniquePropertyNames", _plus_3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean SingleInvariantOperation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final Function1<SpecOperation, Boolean> _function = new Function1<SpecOperation, Boolean>() {
			public Boolean apply(final SpecOperation o) {
				return o.getIsInvariant();
			}
		};
		final Iterable<SpecOperation> invOps = IterableExtensions.<SpecOperation>filter(Iterables.<SpecOperation>filter(this.getOwnedOperations(), SpecOperation.class), _function);
		final int count = IterableExtensions.size(invOps);
		if ((count <= 1)) {
			return true;
		}
		final Function1<SpecOperation, String> _function_1 = new Function1<SpecOperation, String>() {
			public String apply(final SpecOperation it) {
				return it.getName();
			}
		};
		final String invOpNames = IterableExtensions.join(IterableExtensions.<SpecOperation, String>map(invOps, _function_1), ", ");
		String _name = this.getName();
		String _plus = ("Domain Object \'" + _name);
		String _plus_1 = (_plus + "\' can have at max one Invariant Operation, but ");
		String _plus_2 = (_plus_1 + Integer.valueOf(count));
		String _plus_3 = (_plus_2 + " defined: ");
		String _plus_4 = (_plus_3 + invOpNames);
		return this.report(diagnostics, 
			"SingleInvariantOperation", _plus_4);
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
			case DactPackage.DOMAIN_EVENT__CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContext((BoundedContext)otherEnd, msgs);
			case DactPackage.DOMAIN_EVENT__OWNED_PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedProperties()).basicAdd(otherEnd, msgs);
			case DactPackage.DOMAIN_EVENT__OWNED_OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOperations()).basicAdd(otherEnd, msgs);
			case DactPackage.DOMAIN_EVENT__SCOPE:
				if (scope != null)
					msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DactPackage.DOMAIN_EVENT__SCOPE, null, msgs);
				return basicSetScope((Scope)otherEnd, msgs);
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
			case DactPackage.DOMAIN_EVENT__CONTEXT:
				return basicSetContext(null, msgs);
			case DactPackage.DOMAIN_EVENT__OWNED_PROPERTIES:
				return ((InternalEList<?>)getOwnedProperties()).basicRemove(otherEnd, msgs);
			case DactPackage.DOMAIN_EVENT__OWNED_OPERATIONS:
				return ((InternalEList<?>)getOwnedOperations()).basicRemove(otherEnd, msgs);
			case DactPackage.DOMAIN_EVENT__SCOPE:
				return basicSetScope(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DactPackage.DOMAIN_EVENT__CONTEXT:
				return eInternalContainer().eInverseRemove(this, DactPackage.BOUNDED_CONTEXT__OWNED_ELEMENTS, BoundedContext.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DactPackage.DOMAIN_EVENT__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case DactPackage.DOMAIN_EVENT__OWNED_PROPERTIES:
				return getOwnedProperties();
			case DactPackage.DOMAIN_EVENT__OWNED_OPERATIONS:
				return getOwnedOperations();
			case DactPackage.DOMAIN_EVENT__SCOPE:
				return getScope();
			case DactPackage.DOMAIN_EVENT__ABSTRACTED_ROOT:
				if (resolve) return getAbstractedRoot();
				return basicGetAbstractedRoot();
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
			case DactPackage.DOMAIN_EVENT__CONTEXT:
				setContext((BoundedContext)newValue);
				return;
			case DactPackage.DOMAIN_EVENT__OWNED_PROPERTIES:
				getOwnedProperties().clear();
				getOwnedProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case DactPackage.DOMAIN_EVENT__OWNED_OPERATIONS:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case DactPackage.DOMAIN_EVENT__SCOPE:
				setScope((Scope)newValue);
				return;
			case DactPackage.DOMAIN_EVENT__ABSTRACTED_ROOT:
				setAbstractedRoot((AggregateRoot)newValue);
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
			case DactPackage.DOMAIN_EVENT__CONTEXT:
				setContext((BoundedContext)null);
				return;
			case DactPackage.DOMAIN_EVENT__OWNED_PROPERTIES:
				getOwnedProperties().clear();
				return;
			case DactPackage.DOMAIN_EVENT__OWNED_OPERATIONS:
				getOwnedOperations().clear();
				return;
			case DactPackage.DOMAIN_EVENT__SCOPE:
				setScope((Scope)null);
				return;
			case DactPackage.DOMAIN_EVENT__ABSTRACTED_ROOT:
				setAbstractedRoot((AggregateRoot)null);
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
			case DactPackage.DOMAIN_EVENT__CONTEXT:
				return basicGetContext() != null;
			case DactPackage.DOMAIN_EVENT__OWNED_PROPERTIES:
				return ownedProperties != null && !ownedProperties.isEmpty();
			case DactPackage.DOMAIN_EVENT__OWNED_OPERATIONS:
				return ownedOperations != null && !ownedOperations.isEmpty();
			case DactPackage.DOMAIN_EVENT__SCOPE:
				return scope != null;
			case DactPackage.DOMAIN_EVENT__ABSTRACTED_ROOT:
				return abstractedRoot != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DomainElement.class) {
			switch (derivedFeatureID) {
				case DactPackage.DOMAIN_EVENT__CONTEXT: return DactPackage.DOMAIN_ELEMENT__CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == DiagnosticSupported.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DomainObject.class) {
			switch (derivedFeatureID) {
				case DactPackage.DOMAIN_EVENT__OWNED_PROPERTIES: return DactPackage.DOMAIN_OBJECT__OWNED_PROPERTIES;
				case DactPackage.DOMAIN_EVENT__OWNED_OPERATIONS: return DactPackage.DOMAIN_OBJECT__OWNED_OPERATIONS;
				case DactPackage.DOMAIN_EVENT__SCOPE: return DactPackage.DOMAIN_OBJECT__SCOPE;
				default: return -1;
			}
		}
		if (baseClass == SharedDomainObject.class) {
			switch (derivedFeatureID) {
				case DactPackage.DOMAIN_EVENT__ABSTRACTED_ROOT: return DactPackage.SHARED_DOMAIN_OBJECT__ABSTRACTED_ROOT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DomainElement.class) {
			switch (baseFeatureID) {
				case DactPackage.DOMAIN_ELEMENT__CONTEXT: return DactPackage.DOMAIN_EVENT__CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == DiagnosticSupported.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DomainObject.class) {
			switch (baseFeatureID) {
				case DactPackage.DOMAIN_OBJECT__OWNED_PROPERTIES: return DactPackage.DOMAIN_EVENT__OWNED_PROPERTIES;
				case DactPackage.DOMAIN_OBJECT__OWNED_OPERATIONS: return DactPackage.DOMAIN_EVENT__OWNED_OPERATIONS;
				case DactPackage.DOMAIN_OBJECT__SCOPE: return DactPackage.DOMAIN_EVENT__SCOPE;
				default: return -1;
			}
		}
		if (baseClass == SharedDomainObject.class) {
			switch (baseFeatureID) {
				case DactPackage.SHARED_DOMAIN_OBJECT__ABSTRACTED_ROOT: return DactPackage.DOMAIN_EVENT__ABSTRACTED_ROOT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == DomainElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == DiagnosticSupported.class) {
			switch (baseOperationID) {
				case DactPackage.DIAGNOSTIC_SUPPORTED___REPORT__DIAGNOSTICCHAIN_STRING_STRING: return DactPackage.DOMAIN_EVENT___REPORT__DIAGNOSTICCHAIN_STRING_STRING;
				case DactPackage.DIAGNOSTIC_SUPPORTED___WARN__DIAGNOSTICCHAIN_STRING_STRING: return DactPackage.DOMAIN_EVENT___WARN__DIAGNOSTICCHAIN_STRING_STRING;
				default: return -1;
			}
		}
		if (baseClass == DomainObject.class) {
			switch (baseOperationID) {
				case DactPackage.DOMAIN_OBJECT___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP: return DactPackage.DOMAIN_EVENT___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP;
				case DactPackage.DOMAIN_OBJECT___UNIQUE_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP: return DactPackage.DOMAIN_EVENT___UNIQUE_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP;
				case DactPackage.DOMAIN_OBJECT___SINGLE_INVARIANT_OPERATION__DIAGNOSTICCHAIN_MAP: return DactPackage.DOMAIN_EVENT___SINGLE_INVARIANT_OPERATION__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		if (baseClass == SharedDomainObject.class) {
			switch (baseOperationID) {
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
			case DactPackage.DOMAIN_EVENT___UNIQUE_OPERATION_NAMES__DIAGNOSTICCHAIN_MAP:
				return UniqueOperationNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.DOMAIN_EVENT___UNIQUE_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP:
				return UniquePropertyNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.DOMAIN_EVENT___SINGLE_INVARIANT_OPERATION__DIAGNOSTICCHAIN_MAP:
				return SingleInvariantOperation((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.DOMAIN_EVENT___REPORT__DIAGNOSTICCHAIN_STRING_STRING:
				return report((DiagnosticChain)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case DactPackage.DOMAIN_EVENT___WARN__DIAGNOSTICCHAIN_STRING_STRING:
				return warn((DiagnosticChain)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DomainEventImpl

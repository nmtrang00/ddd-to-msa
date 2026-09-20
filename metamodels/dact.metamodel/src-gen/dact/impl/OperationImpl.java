/**
 */
package dact.impl;

import dact.Behavior;
import dact.DactPackage;
import dact.DefinesIdentityObject;
import dact.DiagnosticSupported;
import dact.DomainObject;
import dact.IntegerType;
import dact.Interface;
import dact.Operation;
import dact.OperationType;
import dact.Parameter;
import dact.ParameterDirection;
import dact.Property;
import dact.Repository;
import dact.Service;
import dact.SpecOperation;
import dact.StringType;
import dact.Type;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.OperationImpl#isDefinesIdentity <em>Defines Identity</em>}</li>
 *   <li>{@link dact.impl.OperationImpl#getToExpose <em>To Expose</em>}</li>
 *   <li>{@link dact.impl.OperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link dact.impl.OperationImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link dact.impl.OperationImpl#getOwnedParameters <em>Owned Parameters</em>}</li>
 *   <li>{@link dact.impl.OperationImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link dact.impl.OperationImpl#getDomainObject <em>Domain Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends NamedElementImpl implements Operation {
	/**
	 * The default value of the '{@link #isDefinesIdentity() <em>Defines Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefinesIdentity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFINES_IDENTITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefinesIdentity() <em>Defines Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefinesIdentity()
	 * @generated
	 * @ordered
	 */
	protected boolean definesIdentity = DEFINES_IDENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getToExpose() <em>To Expose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToExpose()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TO_EXPOSE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getToExpose() <em>To Expose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToExpose()
	 * @generated
	 * @ordered
	 */
	protected Boolean toExpose = TO_EXPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final OperationType TYPE_EDEFAULT = OperationType.S0_DOMAIN_SERVICE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OperationType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior behavior;

	/**
	 * The cached value of the '{@link #getOwnedParameters() <em>Owned Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.eINSTANCE.getOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDefinesIdentity() {
		return definesIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinesIdentity(boolean newDefinesIdentity) {
		boolean oldDefinesIdentity = definesIdentity;
		definesIdentity = newDefinesIdentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.OPERATION__DEFINES_IDENTITY, oldDefinesIdentity, definesIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getToExpose() {
		return toExpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToExpose(Boolean newToExpose) {
		Boolean oldToExpose = toExpose;
		toExpose = newToExpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.OPERATION__TO_EXPOSE, oldToExpose, toExpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(OperationType newType) {
		OperationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.OPERATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Behavior getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject)behavior;
			behavior = (Behavior)eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.OPERATION__BEHAVIOR, oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavior(Behavior newBehavior, NotificationChain msgs) {
		Behavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DactPackage.OPERATION__BEHAVIOR, oldBehavior, newBehavior);
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
	public void setBehavior(Behavior newBehavior) {
		if (newBehavior != behavior) {
			NotificationChain msgs = null;
			if (behavior != null)
				msgs = ((InternalEObject)behavior).eInverseRemove(this, DactPackage.BEHAVIOR__SPECIFICATION, Behavior.class, msgs);
			if (newBehavior != null)
				msgs = ((InternalEObject)newBehavior).eInverseAdd(this, DactPackage.BEHAVIOR__SPECIFICATION, Behavior.class, msgs);
			msgs = basicSetBehavior(newBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.OPERATION__BEHAVIOR, newBehavior, newBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getOwnedParameters() {
		if (ownedParameters == null) {
			ownedParameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, DactPackage.OPERATION__OWNED_PARAMETERS, DactPackage.PARAMETER__OPERATION);
		}
		return ownedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface getInterface() {
		if (eContainerFeatureID() != DactPackage.OPERATION__INTERFACE) return null;
		return (Interface)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetInterface() {
		if (eContainerFeatureID() != DactPackage.OPERATION__INTERFACE) return null;
		return (Interface)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInterface, DactPackage.OPERATION__INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterface(Interface newInterface) {
		if (newInterface != eInternalContainer() || (eContainerFeatureID() != DactPackage.OPERATION__INTERFACE && newInterface != null)) {
			if (EcoreUtil.isAncestor(this, newInterface))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, DactPackage.INTERFACE__OWNED_OPERATIONS, Interface.class, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.OPERATION__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObject getDomainObject() {
		if (eContainerFeatureID() != DactPackage.OPERATION__DOMAIN_OBJECT) return null;
		return (DomainObject)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject basicGetDomainObject() {
		if (eContainerFeatureID() != DactPackage.OPERATION__DOMAIN_OBJECT) return null;
		return (DomainObject)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainObject(DomainObject newDomainObject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomainObject, DactPackage.OPERATION__DOMAIN_OBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainObject(DomainObject newDomainObject) {
		if (newDomainObject != eInternalContainer() || (eContainerFeatureID() != DactPackage.OPERATION__DOMAIN_OBJECT && newDomainObject != null)) {
			if (EcoreUtil.isAncestor(this, newDomainObject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomainObject != null)
				msgs = ((InternalEObject)newDomainObject).eInverseAdd(this, DactPackage.DOMAIN_OBJECT__OWNED_OPERATIONS, DomainObject.class, msgs);
			msgs = basicSetDomainObject(newDomainObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.OPERATION__DOMAIN_OBJECT, newDomainObject, newDomainObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean MatchedDomainOperationType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final List<OperationType> domainTypes = java.util.Collections.<OperationType>unmodifiableList(org.eclipse.xtext.xbase.lib.CollectionLiterals.<OperationType>newArrayList(OperationType.D0_CONSTRUCTOR, OperationType.D2_COMPOUND_MUTATOR, OperationType.D4_COMPOUND_ACCESSOR, OperationType.D5_SPECIFICATION));
		DomainObject _domainObject = this.getDomainObject();
		boolean _tripleEquals = (_domainObject == null);
		if (_tripleEquals) {
			return true;
		}
		boolean _contains = domainTypes.contains(this.getType());
		boolean _not = (!_contains);
		if (_not) {
			String _name = this.getName();
			String _plus = ("Operation \'" + _name);
			String _plus_1 = (_plus + "\' is owned by domain object \'");
			String _name_1 = this.getDomainObject().getName();
			String _plus_2 = (_plus_1 + _name_1);
			String _plus_3 = (_plus_2 + "\', so its type must be one of the domain ");
			String _plus_4 = (_plus_3 + 
				"operation types, but is \'");
			OperationType _type = this.getType();
			String _plus_5 = (_plus_4 + _type);
			String _plus_6 = (_plus_5 + "\'.");
			return this.report(diagnostics, 
				"MatchedDomainOperationType", _plus_6);
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean MatchedRepositoryOperationType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		Interface _interface = this.getInterface();
		boolean _not = (!(_interface instanceof Repository));
		if (_not) {
			return true;
		}
		final List<OperationType> repositoryTypes = java.util.Collections.<OperationType>unmodifiableList(org.eclipse.xtext.xbase.lib.CollectionLiterals.<OperationType>newArrayList(OperationType.R0_REPOSITORY_CREATE, OperationType.R1_REPOSITORY_READ, OperationType.R2_REPOSITORY_UPDATE, OperationType.R3_REPOSITORY_DELETE, OperationType.R4_REPOSITORY_EXIST));
		boolean _contains = repositoryTypes.contains(this.getType());
		boolean _not_1 = (!_contains);
		if (_not_1) {
			String _name = this.getName();
			String _plus = ("Operation \'" + _name);
			String _plus_1 = (_plus + "\' is owned by repository \'");
			String _name_1 = this.getInterface().getName();
			String _plus_2 = (_plus_1 + _name_1);
			String _plus_3 = (_plus_2 + "\', so its type must be one of the repository ");
			String _plus_4 = (_plus_3 + 
				"operation types, but is \'");
			OperationType _type = this.getType();
			String _plus_5 = (_plus_4 + _type);
			String _plus_6 = (_plus_5 + "\'.");
			return this.report(diagnostics, 
				"MatchedRepositoryOperationType", _plus_6);
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean MatchedServiceOperationType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		Interface _interface = this.getInterface();
		boolean _not = (!(_interface instanceof Service));
		if (_not) {
			return true;
		}
		final List<OperationType> serviceTypes = java.util.Collections.<OperationType>unmodifiableList(org.eclipse.xtext.xbase.lib.CollectionLiterals.<OperationType>newArrayList(OperationType.S0_DOMAIN_SERVICE));
		boolean _contains = serviceTypes.contains(this.getType());
		boolean _not_1 = (!_contains);
		if (_not_1) {
			String _name = this.getName();
			String _plus = ("Operation \'" + _name);
			String _plus_1 = (_plus + "\' is owned by service \'");
			String _name_1 = this.getInterface().getName();
			String _plus_2 = (_plus_1 + _name_1);
			String _plus_3 = (_plus_2 + "\', so its type must be a domain or ");
			String _plus_4 = (_plus_3 + 
				"application service operation, but is \'");
			OperationType _type = this.getType();
			String _plus_5 = (_plus_4 + _type);
			String _plus_6 = (_plus_5 + "\'.");
			return this.report(diagnostics, 
				"MatchedServiceOperationType", _plus_6);
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NoBehaviorSpecification(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		OperationType _type = this.getType();
		boolean _tripleEquals = (_type == OperationType.D0_CONSTRUCTOR);
		if (_tripleEquals) {
			return true;
		}
		final boolean hasRules = ((this instanceof SpecOperation) && (!((SpecOperation) this).getOwnedRules().isEmpty()));
		if (((this.getBehavior() != null) || hasRules)) {
			return true;
		}
		String _name = this.getName();
		String _plus = ("Operation \'" + _name);
		String _plus_1 = (_plus + "\' defines neither a behavior nor a ");
		String _plus_2 = (_plus_1 + 
			"specification rule; a default body will be generated.");
		return this.warn(diagnostics, 
			"NoBehaviorSpecification", _plus_2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ConstructorMatchesProperties(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		OperationType _type = this.getType();
		boolean _tripleNotEquals = (_type != OperationType.D0_CONSTRUCTOR);
		if (_tripleNotEquals) {
			return true;
		}
		final EList<Property> properties = this.getDomainObject().getOwnedProperties();
		boolean isValid = true;
		final Function1<Parameter, Boolean> _function = new Function1<Parameter, Boolean>() {
			public Boolean apply(final Parameter it) {
				ParameterDirection _direction = it.getDirection();
				return Boolean.valueOf(Objects.equals(_direction, ParameterDirection.IN));
			}
		};
		Iterable<Parameter> _filter = IterableExtensions.<Parameter>filter(this.getOwnedParameters(), _function);
		for (final Parameter param : _filter) {
			{
				final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
					public Boolean apply(final Property it) {
						String _name = it.getName();
						String _name_1 = param.getName();
						return Boolean.valueOf(Objects.equals(_name, _name_1));
					}
				};
				final Property property = IterableExtensions.<Property>findFirst(properties, _function_1);
				if ((property == null)) {
					String _name = param.getName();
					String _plus = ("Parameter \'" + _name);
					String _plus_1 = (_plus + "\' of constructor \'");
					String _name_1 = this.getName();
					String _plus_2 = (_plus_1 + _name_1);
					String _plus_3 = (_plus_2 + 
						"\' does not correspond to any property of \'");
					String _name_2 = this.getDomainObject().getName();
					String _plus_4 = (_plus_3 + _name_2);
					String _plus_5 = (_plus_4 + "\'.");
					isValid = this.report(diagnostics, 
						"ConstructorMatchesProperties", _plus_5);
				}
				else {
					if ((((param.getType() != property.getType()) || (param.getLowerBound() != property.getLowerBound())) || (param.getUpperBound() != property.getUpperBound()))) {
						String _name_3 = param.getName();
						String _plus_6 = ("Parameter \'" + _name_3);
						String _plus_7 = (_plus_6 + "\' of constructor \'");
						String _name_4 = this.getName();
						String _plus_8 = (_plus_7 + _name_4);
						String _plus_9 = (_plus_8 + 
							"\' does not match property \'");
						String _name_5 = property.getName();
						String _plus_10 = (_plus_9 + _name_5);
						String _plus_11 = (_plus_10 + 
							"\' in type or multiplicity.");
						isValid = this.report(diagnostics, 
							"ConstructorMatchesProperties", _plus_11);
					}
				}
			}
		}
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean SingleValuedPrimitiveProperty(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		if ((!(this instanceof Property))) {
			return true;
		}
		final Property property = ((Property) this);
		boolean _isDefinesIdentity = property.isDefinesIdentity();
		boolean _not = (!_isDefinesIdentity);
		if (_not) {
			return true;
		}
		Type _type = property.getType();
		boolean _tripleEquals = (_type == null);
		if (_tripleEquals) {
			return true;
		}
		Integer _upperBound = property.getUpperBound();
		final boolean singleValued = ((_upperBound).intValue() == 1);
		final boolean primitiveTyped = ((property.getType() instanceof IntegerType) || (property.getType() instanceof StringType));
		if ((singleValued && primitiveTyped)) {
			return true;
		}
		String _name = property.getName();
		String _plus = ("Identity-defining property \'" + _name);
		String _plus_1 = (_plus + 
			"\' must be single-valued and of a integer or string type.");
		return this.report(diagnostics, 
			"SingleValuedPrimitiveProperty", _plus_1);
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
			case DactPackage.OPERATION__BEHAVIOR:
				if (behavior != null)
					msgs = ((InternalEObject)behavior).eInverseRemove(this, DactPackage.BEHAVIOR__SPECIFICATION, Behavior.class, msgs);
				return basicSetBehavior((Behavior)otherEnd, msgs);
			case DactPackage.OPERATION__OWNED_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedParameters()).basicAdd(otherEnd, msgs);
			case DactPackage.OPERATION__INTERFACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInterface((Interface)otherEnd, msgs);
			case DactPackage.OPERATION__DOMAIN_OBJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomainObject((DomainObject)otherEnd, msgs);
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
			case DactPackage.OPERATION__BEHAVIOR:
				return basicSetBehavior(null, msgs);
			case DactPackage.OPERATION__OWNED_PARAMETERS:
				return ((InternalEList<?>)getOwnedParameters()).basicRemove(otherEnd, msgs);
			case DactPackage.OPERATION__INTERFACE:
				return basicSetInterface(null, msgs);
			case DactPackage.OPERATION__DOMAIN_OBJECT:
				return basicSetDomainObject(null, msgs);
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
			case DactPackage.OPERATION__INTERFACE:
				return eInternalContainer().eInverseRemove(this, DactPackage.INTERFACE__OWNED_OPERATIONS, Interface.class, msgs);
			case DactPackage.OPERATION__DOMAIN_OBJECT:
				return eInternalContainer().eInverseRemove(this, DactPackage.DOMAIN_OBJECT__OWNED_OPERATIONS, DomainObject.class, msgs);
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
			case DactPackage.OPERATION__DEFINES_IDENTITY:
				return isDefinesIdentity();
			case DactPackage.OPERATION__TO_EXPOSE:
				return getToExpose();
			case DactPackage.OPERATION__TYPE:
				return getType();
			case DactPackage.OPERATION__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case DactPackage.OPERATION__OWNED_PARAMETERS:
				return getOwnedParameters();
			case DactPackage.OPERATION__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
			case DactPackage.OPERATION__DOMAIN_OBJECT:
				if (resolve) return getDomainObject();
				return basicGetDomainObject();
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
			case DactPackage.OPERATION__DEFINES_IDENTITY:
				setDefinesIdentity((Boolean)newValue);
				return;
			case DactPackage.OPERATION__TO_EXPOSE:
				setToExpose((Boolean)newValue);
				return;
			case DactPackage.OPERATION__TYPE:
				setType((OperationType)newValue);
				return;
			case DactPackage.OPERATION__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case DactPackage.OPERATION__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case DactPackage.OPERATION__INTERFACE:
				setInterface((Interface)newValue);
				return;
			case DactPackage.OPERATION__DOMAIN_OBJECT:
				setDomainObject((DomainObject)newValue);
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
			case DactPackage.OPERATION__DEFINES_IDENTITY:
				setDefinesIdentity(DEFINES_IDENTITY_EDEFAULT);
				return;
			case DactPackage.OPERATION__TO_EXPOSE:
				setToExpose(TO_EXPOSE_EDEFAULT);
				return;
			case DactPackage.OPERATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DactPackage.OPERATION__BEHAVIOR:
				setBehavior((Behavior)null);
				return;
			case DactPackage.OPERATION__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				return;
			case DactPackage.OPERATION__INTERFACE:
				setInterface((Interface)null);
				return;
			case DactPackage.OPERATION__DOMAIN_OBJECT:
				setDomainObject((DomainObject)null);
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
			case DactPackage.OPERATION__DEFINES_IDENTITY:
				return definesIdentity != DEFINES_IDENTITY_EDEFAULT;
			case DactPackage.OPERATION__TO_EXPOSE:
				return TO_EXPOSE_EDEFAULT == null ? toExpose != null : !TO_EXPOSE_EDEFAULT.equals(toExpose);
			case DactPackage.OPERATION__TYPE:
				return type != TYPE_EDEFAULT;
			case DactPackage.OPERATION__BEHAVIOR:
				return behavior != null;
			case DactPackage.OPERATION__OWNED_PARAMETERS:
				return ownedParameters != null && !ownedParameters.isEmpty();
			case DactPackage.OPERATION__INTERFACE:
				return basicGetInterface() != null;
			case DactPackage.OPERATION__DOMAIN_OBJECT:
				return basicGetDomainObject() != null;
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
		if (baseClass == DiagnosticSupported.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DefinesIdentityObject.class) {
			switch (derivedFeatureID) {
				case DactPackage.OPERATION__DEFINES_IDENTITY: return DactPackage.DEFINES_IDENTITY_OBJECT__DEFINES_IDENTITY;
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
		if (baseClass == DiagnosticSupported.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DefinesIdentityObject.class) {
			switch (baseFeatureID) {
				case DactPackage.DEFINES_IDENTITY_OBJECT__DEFINES_IDENTITY: return DactPackage.OPERATION__DEFINES_IDENTITY;
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
		if (baseClass == DiagnosticSupported.class) {
			switch (baseOperationID) {
				case DactPackage.DIAGNOSTIC_SUPPORTED___REPORT__DIAGNOSTICCHAIN_STRING_STRING: return DactPackage.OPERATION___REPORT__DIAGNOSTICCHAIN_STRING_STRING;
				case DactPackage.DIAGNOSTIC_SUPPORTED___WARN__DIAGNOSTICCHAIN_STRING_STRING: return DactPackage.OPERATION___WARN__DIAGNOSTICCHAIN_STRING_STRING;
				default: return -1;
			}
		}
		if (baseClass == DefinesIdentityObject.class) {
			switch (baseOperationID) {
				case DactPackage.DEFINES_IDENTITY_OBJECT___SINGLE_VALUED_PRIMITIVE_PROPERTY__DIAGNOSTICCHAIN_MAP: return DactPackage.OPERATION___SINGLE_VALUED_PRIMITIVE_PROPERTY__DIAGNOSTICCHAIN_MAP;
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
			case DactPackage.OPERATION___MATCHED_DOMAIN_OPERATION_TYPE__DIAGNOSTICCHAIN_MAP:
				return MatchedDomainOperationType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.OPERATION___MATCHED_REPOSITORY_OPERATION_TYPE__DIAGNOSTICCHAIN_MAP:
				return MatchedRepositoryOperationType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.OPERATION___MATCHED_SERVICE_OPERATION_TYPE__DIAGNOSTICCHAIN_MAP:
				return MatchedServiceOperationType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.OPERATION___NO_BEHAVIOR_SPECIFICATION__DIAGNOSTICCHAIN_MAP:
				return NoBehaviorSpecification((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.OPERATION___CONSTRUCTOR_MATCHES_PROPERTIES__DIAGNOSTICCHAIN_MAP:
				return ConstructorMatchesProperties((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.OPERATION___SINGLE_VALUED_PRIMITIVE_PROPERTY__DIAGNOSTICCHAIN_MAP:
				return SingleValuedPrimitiveProperty((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.OPERATION___REPORT__DIAGNOSTICCHAIN_STRING_STRING:
				return report((DiagnosticChain)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case DactPackage.OPERATION___WARN__DIAGNOSTICCHAIN_STRING_STRING:
				return warn((DiagnosticChain)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (definesIdentity: ");
		result.append(definesIdentity);
		result.append(", toExpose: ");
		result.append(toExpose);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //OperationImpl

/**
 */
package dact.impl;

import dact.AggregateRoot;
import dact.DactPackage;
import dact.DomainObject;
import dact.Entity;
import dact.Enumeration;
import dact.NamedElement;
import dact.PrimitiveType;
import dact.Property;
import dact.SharedDomainObject;
import dact.Type;
import dact.TypedMultiplicityElement;
import dact.ValueSpecification;
import dact.Variable;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link dact.impl.PropertyImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link dact.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link dact.impl.PropertyImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link dact.impl.PropertyImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link dact.impl.PropertyImpl#getIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link dact.impl.PropertyImpl#getDomainObject <em>Domain Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends DefinesIdentityObjectImpl implements Property {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification default_;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_BOUND_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Integer upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_BOUND_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Integer lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_COMPOSITE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsComposite()
	 * @generated
	 * @ordered
	 */
	protected Boolean isComposite = IS_COMPOSITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.eINSTANCE.getProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpecification getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefault(ValueSpecification newDefault, NotificationChain msgs) {
		ValueSpecification oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DactPackage.PROPERTY__DEFAULT, oldDefault, newDefault);
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
	public void setDefault(ValueSpecification newDefault) {
		if (newDefault != default_) {
			NotificationChain msgs = null;
			if (default_ != null)
				msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DactPackage.PROPERTY__DEFAULT, null, msgs);
			if (newDefault != null)
				msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DactPackage.PROPERTY__DEFAULT, null, msgs);
			msgs = basicSetDefault(newDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.PROPERTY__DEFAULT, newDefault, newDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.PROPERTY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperBound(Integer newUpperBound) {
		Integer oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.PROPERTY__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerBound(Integer newLowerBound) {
		Integer oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.PROPERTY__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsComposite(Boolean newIsComposite) {
		Boolean oldIsComposite = isComposite;
		isComposite = newIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.PROPERTY__IS_COMPOSITE, oldIsComposite, isComposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObject getDomainObject() {
		if (eContainerFeatureID() != DactPackage.PROPERTY__DOMAIN_OBJECT) return null;
		return (DomainObject)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject basicGetDomainObject() {
		if (eContainerFeatureID() != DactPackage.PROPERTY__DOMAIN_OBJECT) return null;
		return (DomainObject)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainObject(DomainObject newDomainObject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomainObject, DactPackage.PROPERTY__DOMAIN_OBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainObject(DomainObject newDomainObject) {
		if (newDomainObject != eInternalContainer() || (eContainerFeatureID() != DactPackage.PROPERTY__DOMAIN_OBJECT && newDomainObject != null)) {
			if (EcoreUtil.isAncestor(this, newDomainObject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomainObject != null)
				msgs = ((InternalEObject)newDomainObject).eInverseAdd(this, DactPackage.DOMAIN_OBJECT__OWNED_PROPERTIES, DomainObject.class, msgs);
			msgs = basicSetDomainObject(newDomainObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.PROPERTY__DOMAIN_OBJECT, newDomainObject, newDomainObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean MandatoryType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		Type _type = this.getType();
		final boolean hasType = (_type != null);
		if ((!hasType)) {
			String _name = this.getName();
			String _plus = ("Property \'" + _name);
			String _plus_1 = (_plus + "\' of \'");
			DomainObject _domainObject = this.getDomainObject();
			String _name_1 = null;
			if (_domainObject!=null) {
				_name_1=_domainObject.getName();
			}
			String _plus_2 = (_plus_1 + _name_1);
			String _plus_3 = (_plus_2 + 
				"\' must declare a type.");
			this.report(diagnostics, 
				"MandatoryType", _plus_3);
		}
		return hasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean CompositeRequiresEntity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final boolean isValid = ((!(this.getIsComposite()).booleanValue()) || ((this.getDomainObject() instanceof Entity) && (this.getType() instanceof Entity)));
		if ((!isValid)) {
			String _name = this.getName();
			String _plus = ("Property \'" + _name);
			String _plus_1 = (_plus + "\' cannot be composite: composition requires ");
			String _plus_2 = (_plus_1 + 
				"both the owning element and the declared type to be entities.");
			this.report(diagnostics, 
				"CompositeRequiresEntity", _plus_2);
		}
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean AggregateIsNotComposed(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final boolean isValid = ((!(this.getIsComposite()).booleanValue()) || (!(this.getType() instanceof AggregateRoot)));
		if ((!isValid)) {
			String _name = this.getName();
			String _plus = ("Property \'" + _name);
			String _plus_1 = (_plus + "\' cannot compose the aggregate root \'");
			Type _type = this.getType();
			String _name_1 = null;
			if (_type!=null) {
				_name_1=_type.getName();
			}
			String _plus_2 = (_plus_1 + _name_1);
			String _plus_3 = (_plus_2 + "\': aggregate roots are referenced, not owned.");
			this.report(diagnostics, 
				"AggregateIsNotComposed", _plus_3);
		}
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean PrimitivePropertyRequiresName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final boolean isValid = ((!(this.getType() instanceof PrimitiveType)) || 
			(!((this.getName() == null) || this.getName().trim().isEmpty())));
		if (((!isValid) && (diagnostics != null))) {
			Type _type = this.getType();
			String _name = null;
			if (_type!=null) {
				_name=_type.getName();
			}
			String _plus = ("A property of primitive type \'" + _name);
			String _plus_1 = (_plus + "\' in \'");
			DomainObject _domainObject = this.getDomainObject();
			String _name_1 = null;
			if (_domainObject!=null) {
				_name_1=_domainObject.getName();
			}
			String _plus_2 = (_plus_1 + _name_1);
			String _plus_3 = (_plus_2 + "\' must declare a name, since no ");
			String _plus_4 = (_plus_3 + 
				"meaningful name can be derived from a primitive type.");
			this.report(diagnostics, 
				"PrimitivePropertyRequiresName", _plus_4);
		}
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean SharedObjectTypeRestriction(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		DomainObject _domainObject = this.getDomainObject();
		boolean _not = (!(_domainObject instanceof SharedDomainObject));
		if (_not) {
			return true;
		}
		Type _type = this.getType();
		boolean _tripleEquals = (_type == null);
		if (_tripleEquals) {
			return true;
		}
		final boolean isValid = (((this.getType() instanceof PrimitiveType) || (this.getType() instanceof Enumeration)) || (this.getType() instanceof SharedDomainObject));
		if ((!isValid)) {
			String _name = this.getName();
			String _plus = ("Property \'" + _name);
			String _plus_1 = (_plus + "\' of shared domain object \'");
			String _name_1 = this.getDomainObject().getName();
			String _plus_2 = (_plus_1 + _name_1);
			String _plus_3 = (_plus_2 + "\' is typed by \'");
			String _name_2 = this.getType().getName();
			String _plus_4 = (_plus_3 + _name_2);
			String _plus_5 = (_plus_4 + 
				"\', which is internal to a bounded context. A shared domain ");
			String _plus_6 = (_plus_5 + 
				"object may only reference primitive types, enumerations, or ");
			String _plus_7 = (_plus_6 + 
				"other shared domain objects.");
			return this.report(diagnostics, 
				"SharedObjectTypeRestriction", _plus_7);
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NoDefaultForVariable(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		if ((this instanceof Variable)) {
			ValueSpecification _default = this.getDefault();
			boolean _tripleNotEquals = (_default != null);
			if (_tripleNotEquals) {
				return this.warn(diagnostics, 
					"NoDefaultForVariable", 
					"Default value of variable must be defined within the activity flow. This will be ignored.");
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSingle() {
		return ((((this.getLowerBound()).intValue() >= 0) && ((this.getLowerBound()).intValue() <= 1)) && ((this.getUpperBound()).intValue() == 1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCollection() {
		return (((this.getUpperBound()).intValue() < 0) || ((this.getUpperBound()).intValue() > 1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DactPackage.PROPERTY__DOMAIN_OBJECT:
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
			case DactPackage.PROPERTY__DEFAULT:
				return basicSetDefault(null, msgs);
			case DactPackage.PROPERTY__DOMAIN_OBJECT:
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
			case DactPackage.PROPERTY__DOMAIN_OBJECT:
				return eInternalContainer().eInverseRemove(this, DactPackage.DOMAIN_OBJECT__OWNED_PROPERTIES, DomainObject.class, msgs);
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
			case DactPackage.PROPERTY__NAME:
				return getName();
			case DactPackage.PROPERTY__DEFAULT:
				return getDefault();
			case DactPackage.PROPERTY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case DactPackage.PROPERTY__UPPER_BOUND:
				return getUpperBound();
			case DactPackage.PROPERTY__LOWER_BOUND:
				return getLowerBound();
			case DactPackage.PROPERTY__IS_COMPOSITE:
				return getIsComposite();
			case DactPackage.PROPERTY__DOMAIN_OBJECT:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DactPackage.PROPERTY__NAME:
				setName((String)newValue);
				return;
			case DactPackage.PROPERTY__DEFAULT:
				setDefault((ValueSpecification)newValue);
				return;
			case DactPackage.PROPERTY__TYPE:
				setType((Type)newValue);
				return;
			case DactPackage.PROPERTY__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case DactPackage.PROPERTY__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case DactPackage.PROPERTY__IS_COMPOSITE:
				setIsComposite((Boolean)newValue);
				return;
			case DactPackage.PROPERTY__DOMAIN_OBJECT:
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
			case DactPackage.PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DactPackage.PROPERTY__DEFAULT:
				setDefault((ValueSpecification)null);
				return;
			case DactPackage.PROPERTY__TYPE:
				setType((Type)null);
				return;
			case DactPackage.PROPERTY__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case DactPackage.PROPERTY__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case DactPackage.PROPERTY__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case DactPackage.PROPERTY__DOMAIN_OBJECT:
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
			case DactPackage.PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DactPackage.PROPERTY__DEFAULT:
				return default_ != null;
			case DactPackage.PROPERTY__TYPE:
				return type != null;
			case DactPackage.PROPERTY__UPPER_BOUND:
				return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
			case DactPackage.PROPERTY__LOWER_BOUND:
				return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
			case DactPackage.PROPERTY__IS_COMPOSITE:
				return IS_COMPOSITE_EDEFAULT == null ? isComposite != null : !IS_COMPOSITE_EDEFAULT.equals(isComposite);
			case DactPackage.PROPERTY__DOMAIN_OBJECT:
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case DactPackage.PROPERTY__NAME: return DactPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == TypedMultiplicityElement.class) {
			switch (derivedFeatureID) {
				case DactPackage.PROPERTY__DEFAULT: return DactPackage.TYPED_MULTIPLICITY_ELEMENT__DEFAULT;
				case DactPackage.PROPERTY__TYPE: return DactPackage.TYPED_MULTIPLICITY_ELEMENT__TYPE;
				case DactPackage.PROPERTY__UPPER_BOUND: return DactPackage.TYPED_MULTIPLICITY_ELEMENT__UPPER_BOUND;
				case DactPackage.PROPERTY__LOWER_BOUND: return DactPackage.TYPED_MULTIPLICITY_ELEMENT__LOWER_BOUND;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case DactPackage.NAMED_ELEMENT__NAME: return DactPackage.PROPERTY__NAME;
				default: return -1;
			}
		}
		if (baseClass == TypedMultiplicityElement.class) {
			switch (baseFeatureID) {
				case DactPackage.TYPED_MULTIPLICITY_ELEMENT__DEFAULT: return DactPackage.PROPERTY__DEFAULT;
				case DactPackage.TYPED_MULTIPLICITY_ELEMENT__TYPE: return DactPackage.PROPERTY__TYPE;
				case DactPackage.TYPED_MULTIPLICITY_ELEMENT__UPPER_BOUND: return DactPackage.PROPERTY__UPPER_BOUND;
				case DactPackage.TYPED_MULTIPLICITY_ELEMENT__LOWER_BOUND: return DactPackage.PROPERTY__LOWER_BOUND;
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
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TypedMultiplicityElement.class) {
			switch (baseOperationID) {
				case DactPackage.TYPED_MULTIPLICITY_ELEMENT___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP: return DactPackage.PROPERTY___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP;
				case DactPackage.TYPED_MULTIPLICITY_ELEMENT___IS_SINGLE: return DactPackage.PROPERTY___IS_SINGLE;
				case DactPackage.TYPED_MULTIPLICITY_ELEMENT___IS_COLLECTION: return DactPackage.PROPERTY___IS_COLLECTION;
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
			case DactPackage.PROPERTY___MANDATORY_TYPE__DIAGNOSTICCHAIN_MAP:
				return MandatoryType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.PROPERTY___COMPOSITE_REQUIRES_ENTITY__DIAGNOSTICCHAIN_MAP:
				return CompositeRequiresEntity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.PROPERTY___AGGREGATE_IS_NOT_COMPOSED__DIAGNOSTICCHAIN_MAP:
				return AggregateIsNotComposed((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.PROPERTY___PRIMITIVE_PROPERTY_REQUIRES_NAME__DIAGNOSTICCHAIN_MAP:
				return PrimitivePropertyRequiresName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.PROPERTY___SHARED_OBJECT_TYPE_RESTRICTION__DIAGNOSTICCHAIN_MAP:
				return SharedObjectTypeRestriction((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.PROPERTY___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP:
				return NoDefaultForVariable((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.PROPERTY___IS_SINGLE:
				return isSingle();
			case DactPackage.PROPERTY___IS_COLLECTION:
				return isCollection();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(", isComposite: ");
		result.append(isComposite);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl

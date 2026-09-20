/**
 */
package dact.impl;

import dact.DactPackage;
import dact.DiagnosticSupported;
import dact.NamedElement;
import dact.Scope;
import dact.Type;
import dact.TypedMultiplicityElement;
import dact.ValueSpecification;
import dact.Variable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link dact.impl.VariableImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link dact.impl.VariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link dact.impl.VariableImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link dact.impl.VariableImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link dact.impl.VariableImpl#getAccessibleScopes <em>Accessible Scopes</em>}</li>
 *   <li>{@link dact.impl.VariableImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends TransformationOnlyImpl implements Variable {
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
	 * The cached value of the '{@link #getAccessibleScopes() <em>Accessible Scopes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessibleScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<Scope> accessibleScopes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.eINSTANCE.getVariable();
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
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.VARIABLE__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DactPackage.VARIABLE__DEFAULT, oldDefault, newDefault);
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
				msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DactPackage.VARIABLE__DEFAULT, null, msgs);
			if (newDefault != null)
				msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DactPackage.VARIABLE__DEFAULT, null, msgs);
			msgs = basicSetDefault(newDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.VARIABLE__DEFAULT, newDefault, newDefault));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.VARIABLE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.VARIABLE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.VARIABLE__UPPER_BOUND, oldUpperBound, upperBound));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.VARIABLE__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scope> getAccessibleScopes() {
		if (accessibleScopes == null) {
			accessibleScopes = new EObjectWithInverseResolvingEList.ManyInverse<Scope>(Scope.class, this, DactPackage.VARIABLE__ACCESSIBLE_SCOPES, DactPackage.SCOPE__INHERITED_VARIABLES);
		}
		return accessibleScopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scope getScope() {
		if (eContainerFeatureID() != DactPackage.VARIABLE__SCOPE) return null;
		return (Scope)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope basicGetScope() {
		if (eContainerFeatureID() != DactPackage.VARIABLE__SCOPE) return null;
		return (Scope)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(Scope newScope, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScope, DactPackage.VARIABLE__SCOPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(Scope newScope) {
		if (newScope != eInternalContainer() || (eContainerFeatureID() != DactPackage.VARIABLE__SCOPE && newScope != null)) {
			if (EcoreUtil.isAncestor(this, newScope))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, DactPackage.SCOPE__OWNED_VARIABLES, Scope.class, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.VARIABLE__SCOPE, newScope, newScope));
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
			case DactPackage.VARIABLE__ACCESSIBLE_SCOPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccessibleScopes()).basicAdd(otherEnd, msgs);
			case DactPackage.VARIABLE__SCOPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case DactPackage.VARIABLE__DEFAULT:
				return basicSetDefault(null, msgs);
			case DactPackage.VARIABLE__ACCESSIBLE_SCOPES:
				return ((InternalEList<?>)getAccessibleScopes()).basicRemove(otherEnd, msgs);
			case DactPackage.VARIABLE__SCOPE:
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
			case DactPackage.VARIABLE__SCOPE:
				return eInternalContainer().eInverseRemove(this, DactPackage.SCOPE__OWNED_VARIABLES, Scope.class, msgs);
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
			case DactPackage.VARIABLE__NAME:
				return getName();
			case DactPackage.VARIABLE__DEFAULT:
				return getDefault();
			case DactPackage.VARIABLE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case DactPackage.VARIABLE__UPPER_BOUND:
				return getUpperBound();
			case DactPackage.VARIABLE__LOWER_BOUND:
				return getLowerBound();
			case DactPackage.VARIABLE__ACCESSIBLE_SCOPES:
				return getAccessibleScopes();
			case DactPackage.VARIABLE__SCOPE:
				if (resolve) return getScope();
				return basicGetScope();
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
			case DactPackage.VARIABLE__NAME:
				setName((String)newValue);
				return;
			case DactPackage.VARIABLE__DEFAULT:
				setDefault((ValueSpecification)newValue);
				return;
			case DactPackage.VARIABLE__TYPE:
				setType((Type)newValue);
				return;
			case DactPackage.VARIABLE__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case DactPackage.VARIABLE__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case DactPackage.VARIABLE__ACCESSIBLE_SCOPES:
				getAccessibleScopes().clear();
				getAccessibleScopes().addAll((Collection<? extends Scope>)newValue);
				return;
			case DactPackage.VARIABLE__SCOPE:
				setScope((Scope)newValue);
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
			case DactPackage.VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DactPackage.VARIABLE__DEFAULT:
				setDefault((ValueSpecification)null);
				return;
			case DactPackage.VARIABLE__TYPE:
				setType((Type)null);
				return;
			case DactPackage.VARIABLE__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case DactPackage.VARIABLE__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case DactPackage.VARIABLE__ACCESSIBLE_SCOPES:
				getAccessibleScopes().clear();
				return;
			case DactPackage.VARIABLE__SCOPE:
				setScope((Scope)null);
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
			case DactPackage.VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DactPackage.VARIABLE__DEFAULT:
				return default_ != null;
			case DactPackage.VARIABLE__TYPE:
				return type != null;
			case DactPackage.VARIABLE__UPPER_BOUND:
				return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
			case DactPackage.VARIABLE__LOWER_BOUND:
				return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
			case DactPackage.VARIABLE__ACCESSIBLE_SCOPES:
				return accessibleScopes != null && !accessibleScopes.isEmpty();
			case DactPackage.VARIABLE__SCOPE:
				return basicGetScope() != null;
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
				case DactPackage.VARIABLE__NAME: return DactPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == DiagnosticSupported.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypedMultiplicityElement.class) {
			switch (derivedFeatureID) {
				case DactPackage.VARIABLE__DEFAULT: return DactPackage.TYPED_MULTIPLICITY_ELEMENT__DEFAULT;
				case DactPackage.VARIABLE__TYPE: return DactPackage.TYPED_MULTIPLICITY_ELEMENT__TYPE;
				case DactPackage.VARIABLE__UPPER_BOUND: return DactPackage.TYPED_MULTIPLICITY_ELEMENT__UPPER_BOUND;
				case DactPackage.VARIABLE__LOWER_BOUND: return DactPackage.TYPED_MULTIPLICITY_ELEMENT__LOWER_BOUND;
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
				case DactPackage.NAMED_ELEMENT__NAME: return DactPackage.VARIABLE__NAME;
				default: return -1;
			}
		}
		if (baseClass == DiagnosticSupported.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypedMultiplicityElement.class) {
			switch (baseFeatureID) {
				case DactPackage.TYPED_MULTIPLICITY_ELEMENT__DEFAULT: return DactPackage.VARIABLE__DEFAULT;
				case DactPackage.TYPED_MULTIPLICITY_ELEMENT__TYPE: return DactPackage.VARIABLE__TYPE;
				case DactPackage.TYPED_MULTIPLICITY_ELEMENT__UPPER_BOUND: return DactPackage.VARIABLE__UPPER_BOUND;
				case DactPackage.TYPED_MULTIPLICITY_ELEMENT__LOWER_BOUND: return DactPackage.VARIABLE__LOWER_BOUND;
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
		if (baseClass == DiagnosticSupported.class) {
			switch (baseOperationID) {
				case DactPackage.DIAGNOSTIC_SUPPORTED___REPORT__DIAGNOSTICCHAIN_STRING_STRING: return DactPackage.VARIABLE___REPORT__DIAGNOSTICCHAIN_STRING_STRING;
				case DactPackage.DIAGNOSTIC_SUPPORTED___WARN__DIAGNOSTICCHAIN_STRING_STRING: return DactPackage.VARIABLE___WARN__DIAGNOSTICCHAIN_STRING_STRING;
				default: return -1;
			}
		}
		if (baseClass == TypedMultiplicityElement.class) {
			switch (baseOperationID) {
				case DactPackage.TYPED_MULTIPLICITY_ELEMENT___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP: return DactPackage.VARIABLE___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP;
				case DactPackage.TYPED_MULTIPLICITY_ELEMENT___IS_SINGLE: return DactPackage.VARIABLE___IS_SINGLE;
				case DactPackage.TYPED_MULTIPLICITY_ELEMENT___IS_COLLECTION: return DactPackage.VARIABLE___IS_COLLECTION;
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
			case DactPackage.VARIABLE___NO_DEFAULT_FOR_VARIABLE__DIAGNOSTICCHAIN_MAP:
				return NoDefaultForVariable((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.VARIABLE___IS_SINGLE:
				return isSingle();
			case DactPackage.VARIABLE___IS_COLLECTION:
				return isCollection();
			case DactPackage.VARIABLE___REPORT__DIAGNOSTICCHAIN_STRING_STRING:
				return report((DiagnosticChain)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case DactPackage.VARIABLE___WARN__DIAGNOSTICCHAIN_STRING_STRING:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(')');
		return result.toString();
	}

} //VariableImpl

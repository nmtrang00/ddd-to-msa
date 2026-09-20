/**
 */
package dact.impl;

import dact.Behavior;
import dact.BooleanType;
import dact.DactPackage;
import dact.Parameter;
import dact.ParameterDirection;
import dact.SpecOperation;
import dact.SpecRule;
import dact.Type;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.SpecOperationImpl#getIsInvariant <em>Is Invariant</em>}</li>
 *   <li>{@link dact.impl.SpecOperationImpl#getOwnedRules <em>Owned Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecOperationImpl extends OperationImpl implements SpecOperation {
	/**
	 * The default value of the '{@link #getIsInvariant() <em>Is Invariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInvariant()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_INVARIANT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsInvariant() <em>Is Invariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInvariant()
	 * @generated
	 * @ordered
	 */
	protected Boolean isInvariant = IS_INVARIANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedRules() <em>Owned Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRules()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecRule> ownedRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.eINSTANCE.getSpecOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsInvariant() {
		return isInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsInvariant(Boolean newIsInvariant) {
		Boolean oldIsInvariant = isInvariant;
		isInvariant = newIsInvariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.SPEC_OPERATION__IS_INVARIANT, oldIsInvariant, isInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpecRule> getOwnedRules() {
		if (ownedRules == null) {
			ownedRules = new EObjectContainmentWithInverseEList<SpecRule>(SpecRule.class, this, DactPackage.SPEC_OPERATION__OWNED_RULES, DactPackage.SPEC_RULE__OPERATION);
		}
		return ownedRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean BehaviorXorSpecification(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		Behavior _behavior = this.getBehavior();
		final boolean hasBehavior = (_behavior != null);
		boolean _isEmpty = this.getOwnedRules().isEmpty();
		final boolean hasSpec = (!_isEmpty);
		if ((hasBehavior && hasSpec)) {
			String _name = this.getName();
			String _plus = ("Operation \'" + _name);
			String _plus_1 = (_plus + "\' defines both a behavior and a ");
			String _plus_2 = (_plus_1 + 
				"specification; only one is allowed.");
			return this.report(diagnostics, 
				"BehaviorXorSpecification", _plus_2);
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean OwnedByDomainObjectOnly(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		if (((this.getDomainObject() != null) && (this.getInterface() == null))) {
			return true;
		}
		String _name = this.getName();
		String _plus = ("Specification Validation Operation \'" + _name);
		String _plus_1 = (_plus + 
			"\' must only be defined within Domain Object.");
		return this.report(diagnostics, 
			"OwnedByDomainObjectOnly", _plus_1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean UniqueRuleNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final Function1<SpecRule, String> _function = new Function1<SpecRule, String>() {
			public String apply(final SpecRule it) {
				return it.getName();
			}
		};
		final List<String> names = IterableExtensions.<String>toList(IterableExtensions.<String>filterNull(XcoreEListExtensions.<SpecRule, String>map(this.getOwnedRules(), _function)));
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
		String _plus = ("Rules of specification operation \'" + _name);
		String _plus_1 = (_plus + "\' must have unique ");
		String _plus_2 = (_plus_1 + 
			"names; duplicated: ");
		String _plus_3 = (_plus_2 + duplicates);
		String _plus_4 = (_plus_3 + ".");
		return this.report(diagnostics, 
			"UniqueRuleNames", _plus_4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean SingleBoolOutParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final Function1<Parameter, Boolean> _function = new Function1<Parameter, Boolean>() {
			public Boolean apply(final Parameter it) {
				ParameterDirection _direction = it.getDirection();
				return Boolean.valueOf(Objects.equals(_direction, ParameterDirection.OUT));
			}
		};
		final Iterable<Parameter> outParams = IterableExtensions.<Parameter>filter(this.getOwnedParameters(), _function);
		int _size = IterableExtensions.size(outParams);
		boolean _tripleNotEquals = (_size != 1);
		if (_tripleNotEquals) {
			String _name = this.getName();
			String _plus = ("Specification operation \'" + _name);
			String _plus_1 = (_plus + "\' must declare exactly ");
			String _plus_2 = (_plus_1 + 
				"one outgoing parameter of type Boolean, but declares ");
			int _size_1 = IterableExtensions.size(outParams);
			String _plus_3 = (_plus_2 + Integer.valueOf(_size_1));
			String _plus_4 = (_plus_3 + ".");
			return this.report(diagnostics, 
				"SingleBoolOutParameter", _plus_4);
		}
		final Parameter outParam = IterableExtensions.<Parameter>head(outParams);
		Type _type = outParam.getType();
		boolean _not = (!(_type instanceof BooleanType));
		if (_not) {
			String _name_1 = this.getName();
			String _plus_5 = ("The outgoing parameter of specification operation \'" + _name_1);
			String _plus_6 = (_plus_5 + 
				"\' must be of type Boolean, but is of type \'");
			Type _type_1 = outParam.getType();
			String _name_2 = null;
			if (_type_1!=null) {
				_name_2=_type_1.getName();
			}
			String _plus_7 = (_plus_6 + _name_2);
			String _plus_8 = (_plus_7 + "\'.");
			return this.report(diagnostics, 
				"SingleBoolOutParameter", _plus_8);
		}
		if ((((outParam.getLowerBound()).intValue() != 1) || ((outParam.getUpperBound()).intValue() != 1))) {
			String _name_3 = this.getName();
			String _plus_9 = ("The outgoing parameter of specification operation \'" + _name_3);
			String _plus_10 = (_plus_9 + 
				"\' must be single-valued.");
			return this.report(diagnostics, 
				"SingleBoolOutParameter", _plus_10);
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
			case DactPackage.SPEC_OPERATION__OWNED_RULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRules()).basicAdd(otherEnd, msgs);
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
			case DactPackage.SPEC_OPERATION__OWNED_RULES:
				return ((InternalEList<?>)getOwnedRules()).basicRemove(otherEnd, msgs);
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
			case DactPackage.SPEC_OPERATION__IS_INVARIANT:
				return getIsInvariant();
			case DactPackage.SPEC_OPERATION__OWNED_RULES:
				return getOwnedRules();
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
			case DactPackage.SPEC_OPERATION__IS_INVARIANT:
				setIsInvariant((Boolean)newValue);
				return;
			case DactPackage.SPEC_OPERATION__OWNED_RULES:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection<? extends SpecRule>)newValue);
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
			case DactPackage.SPEC_OPERATION__IS_INVARIANT:
				setIsInvariant(IS_INVARIANT_EDEFAULT);
				return;
			case DactPackage.SPEC_OPERATION__OWNED_RULES:
				getOwnedRules().clear();
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
			case DactPackage.SPEC_OPERATION__IS_INVARIANT:
				return IS_INVARIANT_EDEFAULT == null ? isInvariant != null : !IS_INVARIANT_EDEFAULT.equals(isInvariant);
			case DactPackage.SPEC_OPERATION__OWNED_RULES:
				return ownedRules != null && !ownedRules.isEmpty();
		}
		return super.eIsSet(featureID);
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
			case DactPackage.SPEC_OPERATION___BEHAVIOR_XOR_SPECIFICATION__DIAGNOSTICCHAIN_MAP:
				return BehaviorXorSpecification((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.SPEC_OPERATION___OWNED_BY_DOMAIN_OBJECT_ONLY__DIAGNOSTICCHAIN_MAP:
				return OwnedByDomainObjectOnly((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.SPEC_OPERATION___UNIQUE_RULE_NAMES__DIAGNOSTICCHAIN_MAP:
				return UniqueRuleNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.SPEC_OPERATION___SINGLE_BOOL_OUT_PARAMETER__DIAGNOSTICCHAIN_MAP:
				return SingleBoolOutParameter((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (isInvariant: ");
		result.append(isInvariant);
		result.append(')');
		return result.toString();
	}

} //SpecOperationImpl

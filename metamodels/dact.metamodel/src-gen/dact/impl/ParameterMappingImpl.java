/**
 */
package dact.impl;

import dact.Activity;
import dact.CallOperationAction;
import dact.DactPackage;
import dact.Identifier;
import dact.Parameter;
import dact.ParameterDirection;
import dact.ParameterMapping;
import dact.ParameterMappingType;
import dact.Type;
import dact.ValueSpecification;
import dact.Variable;

import java.lang.reflect.InvocationTargetException;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.ParameterMappingImpl#getType <em>Type</em>}</li>
 *   <li>{@link dact.impl.ParameterMappingImpl#getOperationParameter <em>Operation Parameter</em>}</li>
 *   <li>{@link dact.impl.ParameterMappingImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link dact.impl.ParameterMappingImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link dact.impl.ParameterMappingImpl#getActivityParameter <em>Activity Parameter</em>}</li>
 *   <li>{@link dact.impl.ParameterMappingImpl#getValue <em>Value</em>}</li>
 *   <li>{@link dact.impl.ParameterMappingImpl#getAction <em>Action</em>}</li>
 *   <li>{@link dact.impl.ParameterMappingImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterMappingImpl extends DiagnosticSupportedImpl implements ParameterMapping {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterMappingType TYPE_EDEFAULT = ParameterMappingType.ACTION_IN;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ParameterMappingType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperationParameter() <em>Operation Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter operationParameter;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The cached value of the '{@link #getActivityParameter() <em>Activity Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter activityParameter;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.eINSTANCE.getParameterMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterMappingType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ParameterMappingType newType) {
		ParameterMappingType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.PARAMETER_MAPPING__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getOperationParameter() {
		if (operationParameter != null && operationParameter.eIsProxy()) {
			InternalEObject oldOperationParameter = (InternalEObject)operationParameter;
			operationParameter = (Parameter)eResolveProxy(oldOperationParameter);
			if (operationParameter != oldOperationParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.PARAMETER_MAPPING__OPERATION_PARAMETER, oldOperationParameter, operationParameter));
			}
		}
		return operationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetOperationParameter() {
		return operationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationParameter(Parameter newOperationParameter) {
		Parameter oldOperationParameter = operationParameter;
		operationParameter = newOperationParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.PARAMETER_MAPPING__OPERATION_PARAMETER, oldOperationParameter, operationParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DactPackage.PARAMETER_MAPPING__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DactPackage.PARAMETER_MAPPING__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DactPackage.PARAMETER_MAPPING__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.PARAMETER_MAPPING__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.PARAMETER_MAPPING__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.PARAMETER_MAPPING__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getActivityParameter() {
		if (activityParameter != null && activityParameter.eIsProxy()) {
			InternalEObject oldActivityParameter = (InternalEObject)activityParameter;
			activityParameter = (Parameter)eResolveProxy(oldActivityParameter);
			if (activityParameter != oldActivityParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.PARAMETER_MAPPING__ACTIVITY_PARAMETER, oldActivityParameter, activityParameter));
			}
		}
		return activityParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetActivityParameter() {
		return activityParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivityParameter(Parameter newActivityParameter) {
		Parameter oldActivityParameter = activityParameter;
		activityParameter = newActivityParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.PARAMETER_MAPPING__ACTIVITY_PARAMETER, oldActivityParameter, activityParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpecification getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ValueSpecification newValue, NotificationChain msgs) {
		ValueSpecification oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DactPackage.PARAMETER_MAPPING__VALUE, oldValue, newValue);
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
	public void setValue(ValueSpecification newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DactPackage.PARAMETER_MAPPING__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DactPackage.PARAMETER_MAPPING__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.PARAMETER_MAPPING__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallOperationAction getAction() {
		if (eContainerFeatureID() != DactPackage.PARAMETER_MAPPING__ACTION) return null;
		return (CallOperationAction)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperationAction basicGetAction() {
		if (eContainerFeatureID() != DactPackage.PARAMETER_MAPPING__ACTION) return null;
		return (CallOperationAction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(CallOperationAction newAction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAction, DactPackage.PARAMETER_MAPPING__ACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(CallOperationAction newAction) {
		if (newAction != eInternalContainer() || (eContainerFeatureID() != DactPackage.PARAMETER_MAPPING__ACTION && newAction != null)) {
			if (EcoreUtil.isAncestor(this, newAction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, DactPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS, CallOperationAction.class, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.PARAMETER_MAPPING__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getActivity() {
		if (eContainerFeatureID() != DactPackage.PARAMETER_MAPPING__ACTIVITY) return null;
		return (Activity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		if (eContainerFeatureID() != DactPackage.PARAMETER_MAPPING__ACTIVITY) return null;
		return (Activity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivity, DactPackage.PARAMETER_MAPPING__ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivity(Activity newActivity) {
		if (newActivity != eInternalContainer() || (eContainerFeatureID() != DactPackage.PARAMETER_MAPPING__ACTIVITY && newActivity != null)) {
			if (EcoreUtil.isAncestor(this, newActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, DactPackage.ACTIVITY__PARAMETER_MAPPINGS, Activity.class, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.PARAMETER_MAPPING__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ConformingActivityOperationParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		if (((this.getActivityParameter() == null) || (this.getOperationParameter() == null))) {
			return true;
		}
		Type _type = this.getActivityParameter().getType();
		Type _type_1 = this.getOperationParameter().getType();
		final boolean sameType = (_type == _type_1);
		Integer _lowerBound = this.getActivityParameter().getLowerBound();
		Integer _lowerBound_1 = this.getOperationParameter().getLowerBound();
		final boolean sameLower = (_lowerBound == _lowerBound_1);
		Integer _upperBound = this.getActivityParameter().getUpperBound();
		Integer _upperBound_1 = this.getOperationParameter().getUpperBound();
		final boolean sameUpper = (_upperBound == _upperBound_1);
		ParameterDirection _direction = this.getActivityParameter().getDirection();
		ParameterDirection _direction_1 = this.getOperationParameter().getDirection();
		boolean sameDirection = (_direction == _direction_1);
		final boolean isValid = (((sameType && sameLower) && sameUpper) && sameDirection);
		if (((!isValid) && (diagnostics != null))) {
			String _name = this.getActivityParameter().getName();
			String _plus = ("Activity parameter \'" + _name);
			String _plus_1 = (_plus + 
				"\' does not conform to operation parameter \'");
			String _name_1 = this.getOperationParameter().getName();
			String _plus_2 = (_plus_1 + _name_1);
			String _plus_3 = (_plus_2 + 
				"\': type and multiplicity must be identical.");
			this.report(diagnostics, 
				"ConformingActivityOperationParameter", _plus_3);
		}
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ExclusiveMappingSource(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		Identifier _identifier = this.getIdentifier();
		Parameter _activityParameter = this.getActivityParameter();
		ValueSpecification _value = this.getValue();
		final List<? extends EObject> sources = java.util.Collections.<EObject>unmodifiableList(org.eclipse.xtext.xbase.lib.CollectionLiterals.<EObject>newArrayList(_identifier, _activityParameter, _value));
		final int count = IterableExtensions.size(IterableExtensions.filterNull(sources));
		final boolean isValid = (count == 1);
		if (((!isValid) && (diagnostics != null))) {
			String _xifexpression = null;
			if ((count == 0)) {
				Parameter _operationParameter = this.getOperationParameter();
				String _name = null;
				if (_operationParameter!=null) {
					_name=_operationParameter.getName();
				}
				String _plus = ("Parameter mapping for \'" + _name);
				String _plus_1 = (_plus + 
					"\' must define exactly one source: an identifier, a ");
				_xifexpression = (_plus_1 + 
					"variable, an activity parameter, or a value.");
			}
			else {
				Parameter _operationParameter_1 = this.getOperationParameter();
				String _name_1 = null;
				if (_operationParameter_1!=null) {
					_name_1=_operationParameter_1.getName();
				}
				String _plus_2 = ("Parameter mapping for \'" + _name_1);
				String _plus_3 = (_plus_2 + 
					"\' defines ");
				String _plus_4 = (_plus_3 + Integer.valueOf(count));
				_xifexpression = (_plus_4 + " sources; exactly one is allowed.");
			}
			final String message = _xifexpression;
			this.report(diagnostics, "ExclusiveMappingSource", message);
		}
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ValueOnlyInAction(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final boolean isValid = ((this.getValue() == null) || (this.getAction() != null));
		if (((!isValid) && (diagnostics != null))) {
			Parameter _operationParameter = this.getOperationParameter();
			String _name = null;
			if (_operationParameter!=null) {
				_name=_operationParameter.getName();
			}
			String _plus = ("Parameter mapping for \'" + _name);
			String _plus_1 = (_plus + 
				"\' may only map a literal value within a call operation ");
			String _plus_2 = (_plus_1 + 
				"action.");
			this.report(diagnostics, 
				"ValueOnlyInAction", _plus_2);
		}
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DactPackage.PARAMETER_MAPPING__ACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAction((CallOperationAction)otherEnd, msgs);
			case DactPackage.PARAMETER_MAPPING__ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivity((Activity)otherEnd, msgs);
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
			case DactPackage.PARAMETER_MAPPING__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case DactPackage.PARAMETER_MAPPING__VALUE:
				return basicSetValue(null, msgs);
			case DactPackage.PARAMETER_MAPPING__ACTION:
				return basicSetAction(null, msgs);
			case DactPackage.PARAMETER_MAPPING__ACTIVITY:
				return basicSetActivity(null, msgs);
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
			case DactPackage.PARAMETER_MAPPING__ACTION:
				return eInternalContainer().eInverseRemove(this, DactPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS, CallOperationAction.class, msgs);
			case DactPackage.PARAMETER_MAPPING__ACTIVITY:
				return eInternalContainer().eInverseRemove(this, DactPackage.ACTIVITY__PARAMETER_MAPPINGS, Activity.class, msgs);
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
			case DactPackage.PARAMETER_MAPPING__TYPE:
				return getType();
			case DactPackage.PARAMETER_MAPPING__OPERATION_PARAMETER:
				if (resolve) return getOperationParameter();
				return basicGetOperationParameter();
			case DactPackage.PARAMETER_MAPPING__IDENTIFIER:
				return getIdentifier();
			case DactPackage.PARAMETER_MAPPING__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case DactPackage.PARAMETER_MAPPING__ACTIVITY_PARAMETER:
				if (resolve) return getActivityParameter();
				return basicGetActivityParameter();
			case DactPackage.PARAMETER_MAPPING__VALUE:
				return getValue();
			case DactPackage.PARAMETER_MAPPING__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case DactPackage.PARAMETER_MAPPING__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
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
			case DactPackage.PARAMETER_MAPPING__TYPE:
				setType((ParameterMappingType)newValue);
				return;
			case DactPackage.PARAMETER_MAPPING__OPERATION_PARAMETER:
				setOperationParameter((Parameter)newValue);
				return;
			case DactPackage.PARAMETER_MAPPING__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case DactPackage.PARAMETER_MAPPING__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case DactPackage.PARAMETER_MAPPING__ACTIVITY_PARAMETER:
				setActivityParameter((Parameter)newValue);
				return;
			case DactPackage.PARAMETER_MAPPING__VALUE:
				setValue((ValueSpecification)newValue);
				return;
			case DactPackage.PARAMETER_MAPPING__ACTION:
				setAction((CallOperationAction)newValue);
				return;
			case DactPackage.PARAMETER_MAPPING__ACTIVITY:
				setActivity((Activity)newValue);
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
			case DactPackage.PARAMETER_MAPPING__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DactPackage.PARAMETER_MAPPING__OPERATION_PARAMETER:
				setOperationParameter((Parameter)null);
				return;
			case DactPackage.PARAMETER_MAPPING__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case DactPackage.PARAMETER_MAPPING__VARIABLE:
				setVariable((Variable)null);
				return;
			case DactPackage.PARAMETER_MAPPING__ACTIVITY_PARAMETER:
				setActivityParameter((Parameter)null);
				return;
			case DactPackage.PARAMETER_MAPPING__VALUE:
				setValue((ValueSpecification)null);
				return;
			case DactPackage.PARAMETER_MAPPING__ACTION:
				setAction((CallOperationAction)null);
				return;
			case DactPackage.PARAMETER_MAPPING__ACTIVITY:
				setActivity((Activity)null);
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
			case DactPackage.PARAMETER_MAPPING__TYPE:
				return type != TYPE_EDEFAULT;
			case DactPackage.PARAMETER_MAPPING__OPERATION_PARAMETER:
				return operationParameter != null;
			case DactPackage.PARAMETER_MAPPING__IDENTIFIER:
				return identifier != null;
			case DactPackage.PARAMETER_MAPPING__VARIABLE:
				return variable != null;
			case DactPackage.PARAMETER_MAPPING__ACTIVITY_PARAMETER:
				return activityParameter != null;
			case DactPackage.PARAMETER_MAPPING__VALUE:
				return value != null;
			case DactPackage.PARAMETER_MAPPING__ACTION:
				return basicGetAction() != null;
			case DactPackage.PARAMETER_MAPPING__ACTIVITY:
				return basicGetActivity() != null;
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
			case DactPackage.PARAMETER_MAPPING___CONFORMING_ACTIVITY_OPERATION_PARAMETER__DIAGNOSTICCHAIN_MAP:
				return ConformingActivityOperationParameter((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.PARAMETER_MAPPING___EXCLUSIVE_MAPPING_SOURCE__DIAGNOSTICCHAIN_MAP:
				return ExclusiveMappingSource((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.PARAMETER_MAPPING___VALUE_ONLY_IN_ACTION__DIAGNOSTICCHAIN_MAP:
				return ValueOnlyInAction((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ParameterMappingImpl

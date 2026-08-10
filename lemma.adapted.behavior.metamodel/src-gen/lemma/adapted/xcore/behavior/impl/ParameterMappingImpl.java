/**
 */
package lemma.adapted.xcore.behavior.impl;

import lemma.adapted.xcore.behavior.Activity;
import lemma.adapted.xcore.behavior.BehaviorPackage;
import lemma.adapted.xcore.behavior.CallOperationAction;
import lemma.adapted.xcore.behavior.Identifier;
import lemma.adapted.xcore.behavior.ImportedParameter;
import lemma.adapted.xcore.behavior.ParameterMapping;
import lemma.adapted.xcore.behavior.ParameterMappingType;
import lemma.adapted.xcore.behavior.Variable;

import lemma.adapted.xcore.data.ValueSpecification;

import lemma.adapted.xcore.service.Parameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ParameterMappingImpl#getType <em>Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ParameterMappingImpl#getOperationParameter <em>Operation Parameter</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ParameterMappingImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ParameterMappingImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ParameterMappingImpl#getActivityParameter <em>Activity Parameter</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ParameterMappingImpl#getValue <em>Value</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ParameterMappingImpl#getAction <em>Action</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ParameterMappingImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterMappingImpl extends MinimalEObjectImpl.Container implements ParameterMapping {
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
	 * The cached value of the '{@link #getOperationParameter() <em>Operation Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationParameter()
	 * @generated
	 * @ordered
	 */
	protected ImportedParameter operationParameter;

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
		return BehaviorPackage.Literals.PARAMETER_MAPPING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.PARAMETER_MAPPING__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportedParameter getOperationParameter() {
		return operationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationParameter(ImportedParameter newOperationParameter, NotificationChain msgs) {
		ImportedParameter oldOperationParameter = operationParameter;
		operationParameter = newOperationParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.PARAMETER_MAPPING__OPERATION_PARAMETER, oldOperationParameter, newOperationParameter);
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
	public void setOperationParameter(ImportedParameter newOperationParameter) {
		if (newOperationParameter != operationParameter) {
			NotificationChain msgs = null;
			if (operationParameter != null)
				msgs = ((InternalEObject)operationParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.PARAMETER_MAPPING__OPERATION_PARAMETER, null, msgs);
			if (newOperationParameter != null)
				msgs = ((InternalEObject)newOperationParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.PARAMETER_MAPPING__OPERATION_PARAMETER, null, msgs);
			msgs = basicSetOperationParameter(newOperationParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.PARAMETER_MAPPING__OPERATION_PARAMETER, newOperationParameter, newOperationParameter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.PARAMETER_MAPPING__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.PARAMETER_MAPPING__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.PARAMETER_MAPPING__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.PARAMETER_MAPPING__IDENTIFIER, newIdentifier, newIdentifier));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.PARAMETER_MAPPING__VARIABLE, oldVariable, variable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.PARAMETER_MAPPING__VARIABLE, oldVariable, variable));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.PARAMETER_MAPPING__ACTIVITY_PARAMETER, oldActivityParameter, activityParameter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.PARAMETER_MAPPING__ACTIVITY_PARAMETER, oldActivityParameter, activityParameter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.PARAMETER_MAPPING__VALUE, oldValue, newValue);
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
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.PARAMETER_MAPPING__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.PARAMETER_MAPPING__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.PARAMETER_MAPPING__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallOperationAction getAction() {
		if (eContainerFeatureID() != BehaviorPackage.PARAMETER_MAPPING__ACTION) return null;
		return (CallOperationAction)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperationAction basicGetAction() {
		if (eContainerFeatureID() != BehaviorPackage.PARAMETER_MAPPING__ACTION) return null;
		return (CallOperationAction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(CallOperationAction newAction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAction, BehaviorPackage.PARAMETER_MAPPING__ACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(CallOperationAction newAction) {
		if (newAction != eInternalContainer() || (eContainerFeatureID() != BehaviorPackage.PARAMETER_MAPPING__ACTION && newAction != null)) {
			if (EcoreUtil.isAncestor(this, newAction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, BehaviorPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS, CallOperationAction.class, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.PARAMETER_MAPPING__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getActivity() {
		if (eContainerFeatureID() != BehaviorPackage.PARAMETER_MAPPING__ACTIVITY) return null;
		return (Activity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		if (eContainerFeatureID() != BehaviorPackage.PARAMETER_MAPPING__ACTIVITY) return null;
		return (Activity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivity, BehaviorPackage.PARAMETER_MAPPING__ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivity(Activity newActivity) {
		if (newActivity != eInternalContainer() || (eContainerFeatureID() != BehaviorPackage.PARAMETER_MAPPING__ACTIVITY && newActivity != null)) {
			if (EcoreUtil.isAncestor(this, newActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, BehaviorPackage.ACTIVITY__PARAMETER_MAPPINGS, Activity.class, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.PARAMETER_MAPPING__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.PARAMETER_MAPPING__ACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAction((CallOperationAction)otherEnd, msgs);
			case BehaviorPackage.PARAMETER_MAPPING__ACTIVITY:
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
			case BehaviorPackage.PARAMETER_MAPPING__OPERATION_PARAMETER:
				return basicSetOperationParameter(null, msgs);
			case BehaviorPackage.PARAMETER_MAPPING__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case BehaviorPackage.PARAMETER_MAPPING__VALUE:
				return basicSetValue(null, msgs);
			case BehaviorPackage.PARAMETER_MAPPING__ACTION:
				return basicSetAction(null, msgs);
			case BehaviorPackage.PARAMETER_MAPPING__ACTIVITY:
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
			case BehaviorPackage.PARAMETER_MAPPING__ACTION:
				return eInternalContainer().eInverseRemove(this, BehaviorPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS, CallOperationAction.class, msgs);
			case BehaviorPackage.PARAMETER_MAPPING__ACTIVITY:
				return eInternalContainer().eInverseRemove(this, BehaviorPackage.ACTIVITY__PARAMETER_MAPPINGS, Activity.class, msgs);
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
			case BehaviorPackage.PARAMETER_MAPPING__TYPE:
				return getType();
			case BehaviorPackage.PARAMETER_MAPPING__OPERATION_PARAMETER:
				return getOperationParameter();
			case BehaviorPackage.PARAMETER_MAPPING__IDENTIFIER:
				return getIdentifier();
			case BehaviorPackage.PARAMETER_MAPPING__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case BehaviorPackage.PARAMETER_MAPPING__ACTIVITY_PARAMETER:
				if (resolve) return getActivityParameter();
				return basicGetActivityParameter();
			case BehaviorPackage.PARAMETER_MAPPING__VALUE:
				return getValue();
			case BehaviorPackage.PARAMETER_MAPPING__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case BehaviorPackage.PARAMETER_MAPPING__ACTIVITY:
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
			case BehaviorPackage.PARAMETER_MAPPING__TYPE:
				setType((ParameterMappingType)newValue);
				return;
			case BehaviorPackage.PARAMETER_MAPPING__OPERATION_PARAMETER:
				setOperationParameter((ImportedParameter)newValue);
				return;
			case BehaviorPackage.PARAMETER_MAPPING__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case BehaviorPackage.PARAMETER_MAPPING__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case BehaviorPackage.PARAMETER_MAPPING__ACTIVITY_PARAMETER:
				setActivityParameter((Parameter)newValue);
				return;
			case BehaviorPackage.PARAMETER_MAPPING__VALUE:
				setValue((ValueSpecification)newValue);
				return;
			case BehaviorPackage.PARAMETER_MAPPING__ACTION:
				setAction((CallOperationAction)newValue);
				return;
			case BehaviorPackage.PARAMETER_MAPPING__ACTIVITY:
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
			case BehaviorPackage.PARAMETER_MAPPING__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BehaviorPackage.PARAMETER_MAPPING__OPERATION_PARAMETER:
				setOperationParameter((ImportedParameter)null);
				return;
			case BehaviorPackage.PARAMETER_MAPPING__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case BehaviorPackage.PARAMETER_MAPPING__VARIABLE:
				setVariable((Variable)null);
				return;
			case BehaviorPackage.PARAMETER_MAPPING__ACTIVITY_PARAMETER:
				setActivityParameter((Parameter)null);
				return;
			case BehaviorPackage.PARAMETER_MAPPING__VALUE:
				setValue((ValueSpecification)null);
				return;
			case BehaviorPackage.PARAMETER_MAPPING__ACTION:
				setAction((CallOperationAction)null);
				return;
			case BehaviorPackage.PARAMETER_MAPPING__ACTIVITY:
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
			case BehaviorPackage.PARAMETER_MAPPING__TYPE:
				return type != TYPE_EDEFAULT;
			case BehaviorPackage.PARAMETER_MAPPING__OPERATION_PARAMETER:
				return operationParameter != null;
			case BehaviorPackage.PARAMETER_MAPPING__IDENTIFIER:
				return identifier != null;
			case BehaviorPackage.PARAMETER_MAPPING__VARIABLE:
				return variable != null;
			case BehaviorPackage.PARAMETER_MAPPING__ACTIVITY_PARAMETER:
				return activityParameter != null;
			case BehaviorPackage.PARAMETER_MAPPING__VALUE:
				return value != null;
			case BehaviorPackage.PARAMETER_MAPPING__ACTION:
				return basicGetAction() != null;
			case BehaviorPackage.PARAMETER_MAPPING__ACTIVITY:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ParameterMappingImpl

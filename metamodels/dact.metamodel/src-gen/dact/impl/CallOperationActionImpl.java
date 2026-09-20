/**
 */
package dact.impl;

import dact.CallOperationAction;
import dact.DactPackage;
import dact.Operation;
import dact.ParameterMapping;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Operation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.CallOperationActionImpl#getToDeclareResult <em>To Declare Result</em>}</li>
 *   <li>{@link dact.impl.CallOperationActionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link dact.impl.CallOperationActionImpl#getParameterMappings <em>Parameter Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallOperationActionImpl extends ExecutableNodeImpl implements CallOperationAction {
	/**
	 * The default value of the '{@link #getToDeclareResult() <em>To Declare Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDeclareResult()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TO_DECLARE_RESULT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getToDeclareResult() <em>To Declare Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDeclareResult()
	 * @generated
	 * @ordered
	 */
	protected Boolean toDeclareResult = TO_DECLARE_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

	/**
	 * The cached value of the '{@link #getParameterMappings() <em>Parameter Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterMapping> parameterMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallOperationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.eINSTANCE.getCallOperationAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getToDeclareResult() {
		return toDeclareResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToDeclareResult(Boolean newToDeclareResult) {
		Boolean oldToDeclareResult = toDeclareResult;
		toDeclareResult = newToDeclareResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.CALL_OPERATION_ACTION__TO_DECLARE_RESULT, oldToDeclareResult, toDeclareResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (Operation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.CALL_OPERATION_ACTION__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperation(Operation newOperation) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.CALL_OPERATION_ACTION__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterMapping> getParameterMappings() {
		if (parameterMappings == null) {
			parameterMappings = new EObjectContainmentWithInverseEList<ParameterMapping>(ParameterMapping.class, this, DactPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS, DactPackage.PARAMETER_MAPPING__ACTION);
		}
		return parameterMappings;
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
			case DactPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterMappings()).basicAdd(otherEnd, msgs);
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
			case DactPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS:
				return ((InternalEList<?>)getParameterMappings()).basicRemove(otherEnd, msgs);
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
			case DactPackage.CALL_OPERATION_ACTION__TO_DECLARE_RESULT:
				return getToDeclareResult();
			case DactPackage.CALL_OPERATION_ACTION__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case DactPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS:
				return getParameterMappings();
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
			case DactPackage.CALL_OPERATION_ACTION__TO_DECLARE_RESULT:
				setToDeclareResult((Boolean)newValue);
				return;
			case DactPackage.CALL_OPERATION_ACTION__OPERATION:
				setOperation((Operation)newValue);
				return;
			case DactPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS:
				getParameterMappings().clear();
				getParameterMappings().addAll((Collection<? extends ParameterMapping>)newValue);
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
			case DactPackage.CALL_OPERATION_ACTION__TO_DECLARE_RESULT:
				setToDeclareResult(TO_DECLARE_RESULT_EDEFAULT);
				return;
			case DactPackage.CALL_OPERATION_ACTION__OPERATION:
				setOperation((Operation)null);
				return;
			case DactPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS:
				getParameterMappings().clear();
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
			case DactPackage.CALL_OPERATION_ACTION__TO_DECLARE_RESULT:
				return TO_DECLARE_RESULT_EDEFAULT == null ? toDeclareResult != null : !TO_DECLARE_RESULT_EDEFAULT.equals(toDeclareResult);
			case DactPackage.CALL_OPERATION_ACTION__OPERATION:
				return operation != null;
			case DactPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS:
				return parameterMappings != null && !parameterMappings.isEmpty();
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
		result.append(" (toDeclareResult: ");
		result.append(toDeclareResult);
		result.append(')');
		return result.toString();
	}

} //CallOperationActionImpl

/**
 */
package lemma.adapted.xcore.behavior.impl;

import java.util.Collection;

import lemma.adapted.xcore.behavior.BehaviorPackage;
import lemma.adapted.xcore.behavior.CallOperationAction;
import lemma.adapted.xcore.behavior.ImportedOperation;
import lemma.adapted.xcore.behavior.ParameterMapping;

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
 *   <li>{@link lemma.adapted.xcore.behavior.impl.CallOperationActionImpl#getDomainToDeclareResult <em>Domain To Declare Result</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.CallOperationActionImpl#getImportedOperation <em>Imported Operation</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.CallOperationActionImpl#getParameterMappings <em>Parameter Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallOperationActionImpl extends ExecutableNodeImpl implements CallOperationAction {
	/**
	 * The default value of the '{@link #getDomainToDeclareResult() <em>Domain To Declare Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainToDeclareResult()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DOMAIN_TO_DECLARE_RESULT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getDomainToDeclareResult() <em>Domain To Declare Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainToDeclareResult()
	 * @generated
	 * @ordered
	 */
	protected Boolean domainToDeclareResult = DOMAIN_TO_DECLARE_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImportedOperation() <em>Imported Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedOperation()
	 * @generated
	 * @ordered
	 */
	protected ImportedOperation importedOperation;

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
		return BehaviorPackage.Literals.CALL_OPERATION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDomainToDeclareResult() {
		return domainToDeclareResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainToDeclareResult(Boolean newDomainToDeclareResult) {
		Boolean oldDomainToDeclareResult = domainToDeclareResult;
		domainToDeclareResult = newDomainToDeclareResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.CALL_OPERATION_ACTION__DOMAIN_TO_DECLARE_RESULT, oldDomainToDeclareResult, domainToDeclareResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportedOperation getImportedOperation() {
		return importedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedOperation(ImportedOperation newImportedOperation, NotificationChain msgs) {
		ImportedOperation oldImportedOperation = importedOperation;
		importedOperation = newImportedOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.CALL_OPERATION_ACTION__IMPORTED_OPERATION, oldImportedOperation, newImportedOperation);
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
	public void setImportedOperation(ImportedOperation newImportedOperation) {
		if (newImportedOperation != importedOperation) {
			NotificationChain msgs = null;
			if (importedOperation != null)
				msgs = ((InternalEObject)importedOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.CALL_OPERATION_ACTION__IMPORTED_OPERATION, null, msgs);
			if (newImportedOperation != null)
				msgs = ((InternalEObject)newImportedOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.CALL_OPERATION_ACTION__IMPORTED_OPERATION, null, msgs);
			msgs = basicSetImportedOperation(newImportedOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.CALL_OPERATION_ACTION__IMPORTED_OPERATION, newImportedOperation, newImportedOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterMapping> getParameterMappings() {
		if (parameterMappings == null) {
			parameterMappings = new EObjectContainmentWithInverseEList<ParameterMapping>(ParameterMapping.class, this, BehaviorPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS, BehaviorPackage.PARAMETER_MAPPING__ACTION);
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
			case BehaviorPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS:
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
			case BehaviorPackage.CALL_OPERATION_ACTION__IMPORTED_OPERATION:
				return basicSetImportedOperation(null, msgs);
			case BehaviorPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS:
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
			case BehaviorPackage.CALL_OPERATION_ACTION__DOMAIN_TO_DECLARE_RESULT:
				return getDomainToDeclareResult();
			case BehaviorPackage.CALL_OPERATION_ACTION__IMPORTED_OPERATION:
				return getImportedOperation();
			case BehaviorPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS:
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
			case BehaviorPackage.CALL_OPERATION_ACTION__DOMAIN_TO_DECLARE_RESULT:
				setDomainToDeclareResult((Boolean)newValue);
				return;
			case BehaviorPackage.CALL_OPERATION_ACTION__IMPORTED_OPERATION:
				setImportedOperation((ImportedOperation)newValue);
				return;
			case BehaviorPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS:
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
			case BehaviorPackage.CALL_OPERATION_ACTION__DOMAIN_TO_DECLARE_RESULT:
				setDomainToDeclareResult(DOMAIN_TO_DECLARE_RESULT_EDEFAULT);
				return;
			case BehaviorPackage.CALL_OPERATION_ACTION__IMPORTED_OPERATION:
				setImportedOperation((ImportedOperation)null);
				return;
			case BehaviorPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS:
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
			case BehaviorPackage.CALL_OPERATION_ACTION__DOMAIN_TO_DECLARE_RESULT:
				return DOMAIN_TO_DECLARE_RESULT_EDEFAULT == null ? domainToDeclareResult != null : !DOMAIN_TO_DECLARE_RESULT_EDEFAULT.equals(domainToDeclareResult);
			case BehaviorPackage.CALL_OPERATION_ACTION__IMPORTED_OPERATION:
				return importedOperation != null;
			case BehaviorPackage.CALL_OPERATION_ACTION__PARAMETER_MAPPINGS:
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
		result.append(" (domainToDeclareResult: ");
		result.append(domainToDeclareResult);
		result.append(')');
		return result.toString();
	}

} //CallOperationActionImpl

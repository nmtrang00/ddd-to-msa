/**
 */
package dact.impl;

import dact.DactPackage;
import dact.DomainNode;
import dact.DomainNodeOperationMapping;
import dact.Operation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Node Operation Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.DomainNodeOperationMappingImpl#getUsedByExternalContext <em>Used By External Context</em>}</li>
 *   <li>{@link dact.impl.DomainNodeOperationMappingImpl#getDomainNode <em>Domain Node</em>}</li>
 *   <li>{@link dact.impl.DomainNodeOperationMappingImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainNodeOperationMappingImpl extends TransformationOnlyImpl implements DomainNodeOperationMapping {
	/**
	 * The default value of the '{@link #getUsedByExternalContext() <em>Used By External Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedByExternalContext()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USED_BY_EXTERNAL_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsedByExternalContext() <em>Used By External Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedByExternalContext()
	 * @generated
	 * @ordered
	 */
	protected Boolean usedByExternalContext = USED_BY_EXTERNAL_CONTEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomainNode() <em>Domain Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainNode()
	 * @generated
	 * @ordered
	 */
	protected DomainNode domainNode;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainNodeOperationMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.eINSTANCE.getDomainNodeOperationMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUsedByExternalContext() {
		return usedByExternalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedByExternalContext(Boolean newUsedByExternalContext) {
		Boolean oldUsedByExternalContext = usedByExternalContext;
		usedByExternalContext = newUsedByExternalContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.DOMAIN_NODE_OPERATION_MAPPING__USED_BY_EXTERNAL_CONTEXT, oldUsedByExternalContext, usedByExternalContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainNode getDomainNode() {
		if (domainNode != null && domainNode.eIsProxy()) {
			InternalEObject oldDomainNode = (InternalEObject)domainNode;
			domainNode = (DomainNode)eResolveProxy(oldDomainNode);
			if (domainNode != oldDomainNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.DOMAIN_NODE_OPERATION_MAPPING__DOMAIN_NODE, oldDomainNode, domainNode));
			}
		}
		return domainNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainNode basicGetDomainNode() {
		return domainNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainNode(DomainNode newDomainNode) {
		DomainNode oldDomainNode = domainNode;
		domainNode = newDomainNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.DOMAIN_NODE_OPERATION_MAPPING__DOMAIN_NODE, oldDomainNode, domainNode));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.DOMAIN_NODE_OPERATION_MAPPING__OPERATION, oldOperation, operation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.DOMAIN_NODE_OPERATION_MAPPING__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DactPackage.DOMAIN_NODE_OPERATION_MAPPING__USED_BY_EXTERNAL_CONTEXT:
				return getUsedByExternalContext();
			case DactPackage.DOMAIN_NODE_OPERATION_MAPPING__DOMAIN_NODE:
				if (resolve) return getDomainNode();
				return basicGetDomainNode();
			case DactPackage.DOMAIN_NODE_OPERATION_MAPPING__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
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
			case DactPackage.DOMAIN_NODE_OPERATION_MAPPING__USED_BY_EXTERNAL_CONTEXT:
				setUsedByExternalContext((Boolean)newValue);
				return;
			case DactPackage.DOMAIN_NODE_OPERATION_MAPPING__DOMAIN_NODE:
				setDomainNode((DomainNode)newValue);
				return;
			case DactPackage.DOMAIN_NODE_OPERATION_MAPPING__OPERATION:
				setOperation((Operation)newValue);
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
			case DactPackage.DOMAIN_NODE_OPERATION_MAPPING__USED_BY_EXTERNAL_CONTEXT:
				setUsedByExternalContext(USED_BY_EXTERNAL_CONTEXT_EDEFAULT);
				return;
			case DactPackage.DOMAIN_NODE_OPERATION_MAPPING__DOMAIN_NODE:
				setDomainNode((DomainNode)null);
				return;
			case DactPackage.DOMAIN_NODE_OPERATION_MAPPING__OPERATION:
				setOperation((Operation)null);
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
			case DactPackage.DOMAIN_NODE_OPERATION_MAPPING__USED_BY_EXTERNAL_CONTEXT:
				return USED_BY_EXTERNAL_CONTEXT_EDEFAULT == null ? usedByExternalContext != null : !USED_BY_EXTERNAL_CONTEXT_EDEFAULT.equals(usedByExternalContext);
			case DactPackage.DOMAIN_NODE_OPERATION_MAPPING__DOMAIN_NODE:
				return domainNode != null;
			case DactPackage.DOMAIN_NODE_OPERATION_MAPPING__OPERATION:
				return operation != null;
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
		result.append(" (usedByExternalContext: ");
		result.append(usedByExternalContext);
		result.append(')');
		return result.toString();
	}

} //DomainNodeOperationMappingImpl

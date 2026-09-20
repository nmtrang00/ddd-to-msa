/**
 */
package dact.impl;

import dact.DactPackage;
import dact.ParallelFlow;
import dact.ParallelNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.ParallelFlowImpl#isIsPrimary <em>Is Primary</em>}</li>
 *   <li>{@link dact.impl.ParallelFlowImpl#getParallelNode <em>Parallel Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParallelFlowImpl extends ActivityGroupImpl implements ParallelFlow {
	/**
	 * The default value of the '{@link #isIsPrimary() <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIMARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPrimary() <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimary()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrimary = IS_PRIMARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.eINSTANCE.getParallelFlow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPrimary() {
		return isPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPrimary(boolean newIsPrimary) {
		boolean oldIsPrimary = isPrimary;
		isPrimary = newIsPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.PARALLEL_FLOW__IS_PRIMARY, oldIsPrimary, isPrimary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParallelNode getParallelNode() {
		if (eContainerFeatureID() != DactPackage.PARALLEL_FLOW__PARALLEL_NODE) return null;
		return (ParallelNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelNode basicGetParallelNode() {
		if (eContainerFeatureID() != DactPackage.PARALLEL_FLOW__PARALLEL_NODE) return null;
		return (ParallelNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParallelNode(ParallelNode newParallelNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParallelNode, DactPackage.PARALLEL_FLOW__PARALLEL_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParallelNode(ParallelNode newParallelNode) {
		if (newParallelNode != eInternalContainer() || (eContainerFeatureID() != DactPackage.PARALLEL_FLOW__PARALLEL_NODE && newParallelNode != null)) {
			if (EcoreUtil.isAncestor(this, newParallelNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParallelNode != null)
				msgs = ((InternalEObject)newParallelNode).eInverseAdd(this, DactPackage.PARALLEL_NODE__FLOWS, ParallelNode.class, msgs);
			msgs = basicSetParallelNode(newParallelNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.PARALLEL_FLOW__PARALLEL_NODE, newParallelNode, newParallelNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DactPackage.PARALLEL_FLOW__PARALLEL_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParallelNode((ParallelNode)otherEnd, msgs);
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
			case DactPackage.PARALLEL_FLOW__PARALLEL_NODE:
				return basicSetParallelNode(null, msgs);
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
			case DactPackage.PARALLEL_FLOW__PARALLEL_NODE:
				return eInternalContainer().eInverseRemove(this, DactPackage.PARALLEL_NODE__FLOWS, ParallelNode.class, msgs);
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
			case DactPackage.PARALLEL_FLOW__IS_PRIMARY:
				return isIsPrimary();
			case DactPackage.PARALLEL_FLOW__PARALLEL_NODE:
				if (resolve) return getParallelNode();
				return basicGetParallelNode();
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
			case DactPackage.PARALLEL_FLOW__IS_PRIMARY:
				setIsPrimary((Boolean)newValue);
				return;
			case DactPackage.PARALLEL_FLOW__PARALLEL_NODE:
				setParallelNode((ParallelNode)newValue);
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
			case DactPackage.PARALLEL_FLOW__IS_PRIMARY:
				setIsPrimary(IS_PRIMARY_EDEFAULT);
				return;
			case DactPackage.PARALLEL_FLOW__PARALLEL_NODE:
				setParallelNode((ParallelNode)null);
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
			case DactPackage.PARALLEL_FLOW__IS_PRIMARY:
				return isPrimary != IS_PRIMARY_EDEFAULT;
			case DactPackage.PARALLEL_FLOW__PARALLEL_NODE:
				return basicGetParallelNode() != null;
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
		result.append(" (isPrimary: ");
		result.append(isPrimary);
		result.append(')');
		return result.toString();
	}

} //ParallelFlowImpl

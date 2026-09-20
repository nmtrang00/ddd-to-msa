/**
 */
package dact.impl;

import dact.ActivityEdge;
import dact.ActivityGroup;
import dact.ActivityNode;
import dact.DactPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.ActivityNodeImpl#getSEdge <em>SEdge</em>}</li>
 *   <li>{@link dact.impl.ActivityNodeImpl#getTEdge <em>TEdge</em>}</li>
 *   <li>{@link dact.impl.ActivityNodeImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityNodeImpl extends NamedElementImpl implements ActivityNode {
	/**
	 * The cached value of the '{@link #getSEdge() <em>SEdge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEdge()
	 * @generated
	 * @ordered
	 */
	protected ActivityEdge sEdge;

	/**
	 * The cached value of the '{@link #getTEdge() <em>TEdge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTEdge()
	 * @generated
	 * @ordered
	 */
	protected ActivityEdge tEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.eINSTANCE.getActivityNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityEdge getSEdge() {
		if (sEdge != null && sEdge.eIsProxy()) {
			InternalEObject oldSEdge = (InternalEObject)sEdge;
			sEdge = (ActivityEdge)eResolveProxy(oldSEdge);
			if (sEdge != oldSEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.ACTIVITY_NODE__SEDGE, oldSEdge, sEdge));
			}
		}
		return sEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge basicGetSEdge() {
		return sEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSEdge(ActivityEdge newSEdge, NotificationChain msgs) {
		ActivityEdge oldSEdge = sEdge;
		sEdge = newSEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY_NODE__SEDGE, oldSEdge, newSEdge);
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
	public void setSEdge(ActivityEdge newSEdge) {
		if (newSEdge != sEdge) {
			NotificationChain msgs = null;
			if (sEdge != null)
				msgs = ((InternalEObject)sEdge).eInverseRemove(this, DactPackage.ACTIVITY_EDGE__SOURCE, ActivityEdge.class, msgs);
			if (newSEdge != null)
				msgs = ((InternalEObject)newSEdge).eInverseAdd(this, DactPackage.ACTIVITY_EDGE__SOURCE, ActivityEdge.class, msgs);
			msgs = basicSetSEdge(newSEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY_NODE__SEDGE, newSEdge, newSEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityEdge getTEdge() {
		if (tEdge != null && tEdge.eIsProxy()) {
			InternalEObject oldTEdge = (InternalEObject)tEdge;
			tEdge = (ActivityEdge)eResolveProxy(oldTEdge);
			if (tEdge != oldTEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.ACTIVITY_NODE__TEDGE, oldTEdge, tEdge));
			}
		}
		return tEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge basicGetTEdge() {
		return tEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTEdge(ActivityEdge newTEdge, NotificationChain msgs) {
		ActivityEdge oldTEdge = tEdge;
		tEdge = newTEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY_NODE__TEDGE, oldTEdge, newTEdge);
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
	public void setTEdge(ActivityEdge newTEdge) {
		if (newTEdge != tEdge) {
			NotificationChain msgs = null;
			if (tEdge != null)
				msgs = ((InternalEObject)tEdge).eInverseRemove(this, DactPackage.ACTIVITY_EDGE__TARGET, ActivityEdge.class, msgs);
			if (newTEdge != null)
				msgs = ((InternalEObject)newTEdge).eInverseAdd(this, DactPackage.ACTIVITY_EDGE__TARGET, ActivityEdge.class, msgs);
			msgs = basicSetTEdge(newTEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY_NODE__TEDGE, newTEdge, newTEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityGroup getGroup() {
		if (eContainerFeatureID() != DactPackage.ACTIVITY_NODE__GROUP) return null;
		return (ActivityGroup)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup basicGetGroup() {
		if (eContainerFeatureID() != DactPackage.ACTIVITY_NODE__GROUP) return null;
		return (ActivityGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(ActivityGroup newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, DactPackage.ACTIVITY_NODE__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(ActivityGroup newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != DactPackage.ACTIVITY_NODE__GROUP && newGroup != null)) {
			if (EcoreUtil.isAncestor(this, newGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, DactPackage.ACTIVITY_GROUP__OWNED_NODES, ActivityGroup.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY_NODE__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DactPackage.ACTIVITY_NODE__SEDGE:
				if (sEdge != null)
					msgs = ((InternalEObject)sEdge).eInverseRemove(this, DactPackage.ACTIVITY_EDGE__SOURCE, ActivityEdge.class, msgs);
				return basicSetSEdge((ActivityEdge)otherEnd, msgs);
			case DactPackage.ACTIVITY_NODE__TEDGE:
				if (tEdge != null)
					msgs = ((InternalEObject)tEdge).eInverseRemove(this, DactPackage.ACTIVITY_EDGE__TARGET, ActivityEdge.class, msgs);
				return basicSetTEdge((ActivityEdge)otherEnd, msgs);
			case DactPackage.ACTIVITY_NODE__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((ActivityGroup)otherEnd, msgs);
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
			case DactPackage.ACTIVITY_NODE__SEDGE:
				return basicSetSEdge(null, msgs);
			case DactPackage.ACTIVITY_NODE__TEDGE:
				return basicSetTEdge(null, msgs);
			case DactPackage.ACTIVITY_NODE__GROUP:
				return basicSetGroup(null, msgs);
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
			case DactPackage.ACTIVITY_NODE__GROUP:
				return eInternalContainer().eInverseRemove(this, DactPackage.ACTIVITY_GROUP__OWNED_NODES, ActivityGroup.class, msgs);
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
			case DactPackage.ACTIVITY_NODE__SEDGE:
				if (resolve) return getSEdge();
				return basicGetSEdge();
			case DactPackage.ACTIVITY_NODE__TEDGE:
				if (resolve) return getTEdge();
				return basicGetTEdge();
			case DactPackage.ACTIVITY_NODE__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
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
			case DactPackage.ACTIVITY_NODE__SEDGE:
				setSEdge((ActivityEdge)newValue);
				return;
			case DactPackage.ACTIVITY_NODE__TEDGE:
				setTEdge((ActivityEdge)newValue);
				return;
			case DactPackage.ACTIVITY_NODE__GROUP:
				setGroup((ActivityGroup)newValue);
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
			case DactPackage.ACTIVITY_NODE__SEDGE:
				setSEdge((ActivityEdge)null);
				return;
			case DactPackage.ACTIVITY_NODE__TEDGE:
				setTEdge((ActivityEdge)null);
				return;
			case DactPackage.ACTIVITY_NODE__GROUP:
				setGroup((ActivityGroup)null);
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
			case DactPackage.ACTIVITY_NODE__SEDGE:
				return sEdge != null;
			case DactPackage.ACTIVITY_NODE__TEDGE:
				return tEdge != null;
			case DactPackage.ACTIVITY_NODE__GROUP:
				return basicGetGroup() != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityNodeImpl

/**
 */
package dact.impl;

import dact.AggregateRoot;
import dact.DactPackage;
import dact.SharedDomainObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shared Domain Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.SharedDomainObjectImpl#getAbstractedRoot <em>Abstracted Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SharedDomainObjectImpl extends DomainObjectImpl implements SharedDomainObject {
	/**
	 * The cached value of the '{@link #getAbstractedRoot() <em>Abstracted Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractedRoot()
	 * @generated
	 * @ordered
	 */
	protected AggregateRoot abstractedRoot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedDomainObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.eINSTANCE.getSharedDomainObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggregateRoot getAbstractedRoot() {
		if (abstractedRoot != null && abstractedRoot.eIsProxy()) {
			InternalEObject oldAbstractedRoot = (InternalEObject)abstractedRoot;
			abstractedRoot = (AggregateRoot)eResolveProxy(oldAbstractedRoot);
			if (abstractedRoot != oldAbstractedRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.SHARED_DOMAIN_OBJECT__ABSTRACTED_ROOT, oldAbstractedRoot, abstractedRoot));
			}
		}
		return abstractedRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateRoot basicGetAbstractedRoot() {
		return abstractedRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstractedRoot(AggregateRoot newAbstractedRoot) {
		AggregateRoot oldAbstractedRoot = abstractedRoot;
		abstractedRoot = newAbstractedRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.SHARED_DOMAIN_OBJECT__ABSTRACTED_ROOT, oldAbstractedRoot, abstractedRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DactPackage.SHARED_DOMAIN_OBJECT__ABSTRACTED_ROOT:
				if (resolve) return getAbstractedRoot();
				return basicGetAbstractedRoot();
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
			case DactPackage.SHARED_DOMAIN_OBJECT__ABSTRACTED_ROOT:
				setAbstractedRoot((AggregateRoot)newValue);
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
			case DactPackage.SHARED_DOMAIN_OBJECT__ABSTRACTED_ROOT:
				setAbstractedRoot((AggregateRoot)null);
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
			case DactPackage.SHARED_DOMAIN_OBJECT__ABSTRACTED_ROOT:
				return abstractedRoot != null;
		}
		return super.eIsSet(featureID);
	}

} //SharedDomainObjectImpl

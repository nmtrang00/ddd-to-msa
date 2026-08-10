/**
 */
package lemma.adapted.xcore.behavior.impl;

import java.util.Collection;

import lemma.adapted.xcore.behavior.ActivityGroup;
import lemma.adapted.xcore.behavior.BehaviorPackage;
import lemma.adapted.xcore.behavior.ParallelNode;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ParallelNodeImpl#getOwnedGroup <em>Owned Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParallelNodeImpl extends ControlNodeImpl implements ParallelNode {
	/**
	 * The cached value of the '{@link #getOwnedGroup() <em>Owned Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityGroup> ownedGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.PARALLEL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityGroup> getOwnedGroup() {
		if (ownedGroup == null) {
			ownedGroup = new EObjectContainmentEList<ActivityGroup>(ActivityGroup.class, this, BehaviorPackage.PARALLEL_NODE__OWNED_GROUP);
		}
		return ownedGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.PARALLEL_NODE__OWNED_GROUP:
				return ((InternalEList<?>)getOwnedGroup()).basicRemove(otherEnd, msgs);
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
			case BehaviorPackage.PARALLEL_NODE__OWNED_GROUP:
				return getOwnedGroup();
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
			case BehaviorPackage.PARALLEL_NODE__OWNED_GROUP:
				getOwnedGroup().clear();
				getOwnedGroup().addAll((Collection<? extends ActivityGroup>)newValue);
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
			case BehaviorPackage.PARALLEL_NODE__OWNED_GROUP:
				getOwnedGroup().clear();
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
			case BehaviorPackage.PARALLEL_NODE__OWNED_GROUP:
				return ownedGroup != null && !ownedGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParallelNodeImpl

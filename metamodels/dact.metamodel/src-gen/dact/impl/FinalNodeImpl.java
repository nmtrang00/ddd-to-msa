/**
 */
package dact.impl;

import dact.DactPackage;
import dact.FinalNode;
import dact.Identifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.FinalNodeImpl#getVariablesToReturn <em>Variables To Return</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FinalNodeImpl extends ControlNodeImpl implements FinalNode {
	/**
	 * The cached value of the '{@link #getVariablesToReturn() <em>Variables To Return</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariablesToReturn()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> variablesToReturn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.eINSTANCE.getFinalNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getVariablesToReturn() {
		if (variablesToReturn == null) {
			variablesToReturn = new EObjectContainmentEList<Identifier>(Identifier.class, this, DactPackage.FINAL_NODE__VARIABLES_TO_RETURN);
		}
		return variablesToReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DactPackage.FINAL_NODE__VARIABLES_TO_RETURN:
				return ((InternalEList<?>)getVariablesToReturn()).basicRemove(otherEnd, msgs);
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
			case DactPackage.FINAL_NODE__VARIABLES_TO_RETURN:
				return getVariablesToReturn();
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
			case DactPackage.FINAL_NODE__VARIABLES_TO_RETURN:
				getVariablesToReturn().clear();
				getVariablesToReturn().addAll((Collection<? extends Identifier>)newValue);
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
			case DactPackage.FINAL_NODE__VARIABLES_TO_RETURN:
				getVariablesToReturn().clear();
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
			case DactPackage.FINAL_NODE__VARIABLES_TO_RETURN:
				return variablesToReturn != null && !variablesToReturn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FinalNodeImpl

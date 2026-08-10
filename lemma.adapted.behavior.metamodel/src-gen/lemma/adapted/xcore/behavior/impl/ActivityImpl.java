/**
 */
package lemma.adapted.xcore.behavior.impl;

import java.util.Collection;

import lemma.adapted.xcore.behavior.Activity;
import lemma.adapted.xcore.behavior.ActivityGroup;
import lemma.adapted.xcore.behavior.Behavior;
import lemma.adapted.xcore.behavior.BehaviorPackage;
import lemma.adapted.xcore.behavior.ImportedOperation;
import lemma.adapted.xcore.behavior.ParameterMapping;

import lemma.adapted.xcore.service.Parameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ActivityImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ActivityImpl#getToTransform <em>To Transform</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ActivityImpl#getOwnedParameters <em>Owned Parameters</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ActivityImpl#getParameterMappings <em>Parameter Mappings</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ActivityImpl#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends NamedElementImpl implements Activity {
	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected ImportedOperation specification;

	/**
	 * The default value of the '{@link #getToTransform() <em>To Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTransform()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TO_TRANSFORM_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getToTransform() <em>To Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTransform()
	 * @generated
	 * @ordered
	 */
	protected Boolean toTransform = TO_TRANSFORM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedParameters() <em>Owned Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParameters;

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
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected ActivityGroup root;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportedOperation getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(ImportedOperation newSpecification, NotificationChain msgs) {
		ImportedOperation oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.ACTIVITY__SPECIFICATION, oldSpecification, newSpecification);
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
	public void setSpecification(ImportedOperation newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.ACTIVITY__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.ACTIVITY__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.ACTIVITY__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getToTransform() {
		return toTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToTransform(Boolean newToTransform) {
		Boolean oldToTransform = toTransform;
		toTransform = newToTransform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.ACTIVITY__TO_TRANSFORM, oldToTransform, toTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getOwnedParameters() {
		if (ownedParameters == null) {
			ownedParameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, BehaviorPackage.ACTIVITY__OWNED_PARAMETERS);
		}
		return ownedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterMapping> getParameterMappings() {
		if (parameterMappings == null) {
			parameterMappings = new EObjectContainmentWithInverseEList<ParameterMapping>(ParameterMapping.class, this, BehaviorPackage.ACTIVITY__PARAMETER_MAPPINGS, BehaviorPackage.PARAMETER_MAPPING__ACTIVITY);
		}
		return parameterMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityGroup getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(ActivityGroup newRoot, NotificationChain msgs) {
		ActivityGroup oldRoot = root;
		root = newRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.ACTIVITY__ROOT, oldRoot, newRoot);
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
	public void setRoot(ActivityGroup newRoot) {
		if (newRoot != root) {
			NotificationChain msgs = null;
			if (root != null)
				msgs = ((InternalEObject)root).eInverseRemove(this, BehaviorPackage.ACTIVITY_GROUP__ACTIVITY, ActivityGroup.class, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, BehaviorPackage.ACTIVITY_GROUP__ACTIVITY, ActivityGroup.class, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.ACTIVITY__ROOT, newRoot, newRoot));
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
			case BehaviorPackage.ACTIVITY__PARAMETER_MAPPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterMappings()).basicAdd(otherEnd, msgs);
			case BehaviorPackage.ACTIVITY__ROOT:
				if (root != null)
					msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.ACTIVITY__ROOT, null, msgs);
				return basicSetRoot((ActivityGroup)otherEnd, msgs);
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
			case BehaviorPackage.ACTIVITY__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case BehaviorPackage.ACTIVITY__OWNED_PARAMETERS:
				return ((InternalEList<?>)getOwnedParameters()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.ACTIVITY__PARAMETER_MAPPINGS:
				return ((InternalEList<?>)getParameterMappings()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.ACTIVITY__ROOT:
				return basicSetRoot(null, msgs);
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
			case BehaviorPackage.ACTIVITY__SPECIFICATION:
				return getSpecification();
			case BehaviorPackage.ACTIVITY__TO_TRANSFORM:
				return getToTransform();
			case BehaviorPackage.ACTIVITY__OWNED_PARAMETERS:
				return getOwnedParameters();
			case BehaviorPackage.ACTIVITY__PARAMETER_MAPPINGS:
				return getParameterMappings();
			case BehaviorPackage.ACTIVITY__ROOT:
				return getRoot();
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
			case BehaviorPackage.ACTIVITY__SPECIFICATION:
				setSpecification((ImportedOperation)newValue);
				return;
			case BehaviorPackage.ACTIVITY__TO_TRANSFORM:
				setToTransform((Boolean)newValue);
				return;
			case BehaviorPackage.ACTIVITY__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case BehaviorPackage.ACTIVITY__PARAMETER_MAPPINGS:
				getParameterMappings().clear();
				getParameterMappings().addAll((Collection<? extends ParameterMapping>)newValue);
				return;
			case BehaviorPackage.ACTIVITY__ROOT:
				setRoot((ActivityGroup)newValue);
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
			case BehaviorPackage.ACTIVITY__SPECIFICATION:
				setSpecification((ImportedOperation)null);
				return;
			case BehaviorPackage.ACTIVITY__TO_TRANSFORM:
				setToTransform(TO_TRANSFORM_EDEFAULT);
				return;
			case BehaviorPackage.ACTIVITY__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				return;
			case BehaviorPackage.ACTIVITY__PARAMETER_MAPPINGS:
				getParameterMappings().clear();
				return;
			case BehaviorPackage.ACTIVITY__ROOT:
				setRoot((ActivityGroup)null);
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
			case BehaviorPackage.ACTIVITY__SPECIFICATION:
				return specification != null;
			case BehaviorPackage.ACTIVITY__TO_TRANSFORM:
				return TO_TRANSFORM_EDEFAULT == null ? toTransform != null : !TO_TRANSFORM_EDEFAULT.equals(toTransform);
			case BehaviorPackage.ACTIVITY__OWNED_PARAMETERS:
				return ownedParameters != null && !ownedParameters.isEmpty();
			case BehaviorPackage.ACTIVITY__PARAMETER_MAPPINGS:
				return parameterMappings != null && !parameterMappings.isEmpty();
			case BehaviorPackage.ACTIVITY__ROOT:
				return root != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Behavior.class) {
			switch (derivedFeatureID) {
				case BehaviorPackage.ACTIVITY__SPECIFICATION: return BehaviorPackage.BEHAVIOR__SPECIFICATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Behavior.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.BEHAVIOR__SPECIFICATION: return BehaviorPackage.ACTIVITY__SPECIFICATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (toTransform: ");
		result.append(toTransform);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl

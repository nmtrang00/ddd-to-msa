/**
 */
package lemma.adapted.xcore.behavior.impl;

import java.util.Collection;

import lemma.adapted.xcore.behavior.ActivityModel;
import lemma.adapted.xcore.behavior.BehaviorModel;
import lemma.adapted.xcore.behavior.BehaviorPackage;

import lemma.adapted.xcore.service.Import;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.BehaviorModelImpl#getT_modelUri <em>Tmodel Uri</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.BehaviorModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.BehaviorModelImpl#getActivityModel <em>Activity Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorModelImpl extends MinimalEObjectImpl.Container implements BehaviorModel {
	/**
	 * The default value of the '{@link #getT_modelUri() <em>Tmodel Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_modelUri()
	 * @generated
	 * @ordered
	 */
	protected static final String TMODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getT_modelUri() <em>Tmodel Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_modelUri()
	 * @generated
	 * @ordered
	 */
	protected String t_modelUri = TMODEL_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getActivityModel() <em>Activity Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityModel()
	 * @generated
	 * @ordered
	 */
	protected ActivityModel activityModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.BEHAVIOR_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getT_modelUri() {
		return t_modelUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setT_modelUri(String newT_modelUri) {
		String oldT_modelUri = t_modelUri;
		t_modelUri = newT_modelUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR_MODEL__TMODEL_URI, oldT_modelUri, t_modelUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, BehaviorPackage.BEHAVIOR_MODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityModel getActivityModel() {
		return activityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityModel(ActivityModel newActivityModel, NotificationChain msgs) {
		ActivityModel oldActivityModel = activityModel;
		activityModel = newActivityModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR_MODEL__ACTIVITY_MODEL, oldActivityModel, newActivityModel);
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
	public void setActivityModel(ActivityModel newActivityModel) {
		if (newActivityModel != activityModel) {
			NotificationChain msgs = null;
			if (activityModel != null)
				msgs = ((InternalEObject)activityModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.BEHAVIOR_MODEL__ACTIVITY_MODEL, null, msgs);
			if (newActivityModel != null)
				msgs = ((InternalEObject)newActivityModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.BEHAVIOR_MODEL__ACTIVITY_MODEL, null, msgs);
			msgs = basicSetActivityModel(newActivityModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR_MODEL__ACTIVITY_MODEL, newActivityModel, newActivityModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.BEHAVIOR_MODEL__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.BEHAVIOR_MODEL__ACTIVITY_MODEL:
				return basicSetActivityModel(null, msgs);
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
			case BehaviorPackage.BEHAVIOR_MODEL__TMODEL_URI:
				return getT_modelUri();
			case BehaviorPackage.BEHAVIOR_MODEL__IMPORTS:
				return getImports();
			case BehaviorPackage.BEHAVIOR_MODEL__ACTIVITY_MODEL:
				return getActivityModel();
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
			case BehaviorPackage.BEHAVIOR_MODEL__TMODEL_URI:
				setT_modelUri((String)newValue);
				return;
			case BehaviorPackage.BEHAVIOR_MODEL__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case BehaviorPackage.BEHAVIOR_MODEL__ACTIVITY_MODEL:
				setActivityModel((ActivityModel)newValue);
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
			case BehaviorPackage.BEHAVIOR_MODEL__TMODEL_URI:
				setT_modelUri(TMODEL_URI_EDEFAULT);
				return;
			case BehaviorPackage.BEHAVIOR_MODEL__IMPORTS:
				getImports().clear();
				return;
			case BehaviorPackage.BEHAVIOR_MODEL__ACTIVITY_MODEL:
				setActivityModel((ActivityModel)null);
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
			case BehaviorPackage.BEHAVIOR_MODEL__TMODEL_URI:
				return TMODEL_URI_EDEFAULT == null ? t_modelUri != null : !TMODEL_URI_EDEFAULT.equals(t_modelUri);
			case BehaviorPackage.BEHAVIOR_MODEL__IMPORTS:
				return imports != null && !imports.isEmpty();
			case BehaviorPackage.BEHAVIOR_MODEL__ACTIVITY_MODEL:
				return activityModel != null;
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
		result.append(" (t_modelUri: ");
		result.append(t_modelUri);
		result.append(')');
		return result.toString();
	}

} //BehaviorModelImpl

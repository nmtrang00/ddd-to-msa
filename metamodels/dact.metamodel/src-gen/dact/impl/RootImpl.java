/**
 */
package dact.impl;

import dact.ActivityModel;
import dact.DactPackage;
import dact.DddModel;
import dact.PrimitiveType;
import dact.Root;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.RootImpl#getDdd <em>Ddd</em>}</li>
 *   <li>{@link dact.impl.RootImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link dact.impl.RootImpl#getPrimitivesTypes <em>Primitives Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends DiagnosticSupportedImpl implements Root {
	/**
	 * The cached value of the '{@link #getDdd() <em>Ddd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdd()
	 * @generated
	 * @ordered
	 */
	protected DddModel ddd;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected ActivityModel activity;

	/**
	 * The cached value of the '{@link #getPrimitivesTypes() <em>Primitives Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitivesTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimitiveType> primitivesTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.eINSTANCE.getRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DddModel getDdd() {
		return ddd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDdd(DddModel newDdd, NotificationChain msgs) {
		DddModel oldDdd = ddd;
		ddd = newDdd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DactPackage.ROOT__DDD, oldDdd, newDdd);
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
	public void setDdd(DddModel newDdd) {
		if (newDdd != ddd) {
			NotificationChain msgs = null;
			if (ddd != null)
				msgs = ((InternalEObject)ddd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DactPackage.ROOT__DDD, null, msgs);
			if (newDdd != null)
				msgs = ((InternalEObject)newDdd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DactPackage.ROOT__DDD, null, msgs);
			msgs = basicSetDdd(newDdd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.ROOT__DDD, newDdd, newDdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityModel getActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(ActivityModel newActivity, NotificationChain msgs) {
		ActivityModel oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DactPackage.ROOT__ACTIVITY, oldActivity, newActivity);
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
	public void setActivity(ActivityModel newActivity) {
		if (newActivity != activity) {
			NotificationChain msgs = null;
			if (activity != null)
				msgs = ((InternalEObject)activity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DactPackage.ROOT__ACTIVITY, null, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DactPackage.ROOT__ACTIVITY, null, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.ROOT__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrimitiveType> getPrimitivesTypes() {
		if (primitivesTypes == null) {
			primitivesTypes = new EObjectContainmentEList<PrimitiveType>(PrimitiveType.class, this, DactPackage.ROOT__PRIMITIVES_TYPES);
		}
		return primitivesTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean UniquePrimitiveType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final Function1<PrimitiveType, EClass> _function = new Function1<PrimitiveType, EClass>() {
			public EClass apply(final PrimitiveType it) {
				EClass _eClass = null;
				if (it!=null) {
					_eClass=it.eClass();
				}
				return _eClass;
			}
		};
		final List<EClass> typesList = IterableExtensions.<EClass>toList(IterableExtensions.<EClass>filterNull(XcoreEListExtensions.<PrimitiveType, EClass>map(this.getPrimitivesTypes(), _function)));
		int _size = typesList.size();
		int _size_1 = IterableExtensions.<EClass>toSet(typesList).size();
		final boolean isUnique = (_size == _size_1);
		if (((!isUnique) && (diagnostics != null))) {
			this.report(diagnostics, 
				"UniquePrimitiveType", 
				"Duplicate primitive types detected.");
		}
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DactPackage.ROOT__DDD:
				return basicSetDdd(null, msgs);
			case DactPackage.ROOT__ACTIVITY:
				return basicSetActivity(null, msgs);
			case DactPackage.ROOT__PRIMITIVES_TYPES:
				return ((InternalEList<?>)getPrimitivesTypes()).basicRemove(otherEnd, msgs);
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
			case DactPackage.ROOT__DDD:
				return getDdd();
			case DactPackage.ROOT__ACTIVITY:
				return getActivity();
			case DactPackage.ROOT__PRIMITIVES_TYPES:
				return getPrimitivesTypes();
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
			case DactPackage.ROOT__DDD:
				setDdd((DddModel)newValue);
				return;
			case DactPackage.ROOT__ACTIVITY:
				setActivity((ActivityModel)newValue);
				return;
			case DactPackage.ROOT__PRIMITIVES_TYPES:
				getPrimitivesTypes().clear();
				getPrimitivesTypes().addAll((Collection<? extends PrimitiveType>)newValue);
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
			case DactPackage.ROOT__DDD:
				setDdd((DddModel)null);
				return;
			case DactPackage.ROOT__ACTIVITY:
				setActivity((ActivityModel)null);
				return;
			case DactPackage.ROOT__PRIMITIVES_TYPES:
				getPrimitivesTypes().clear();
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
			case DactPackage.ROOT__DDD:
				return ddd != null;
			case DactPackage.ROOT__ACTIVITY:
				return activity != null;
			case DactPackage.ROOT__PRIMITIVES_TYPES:
				return primitivesTypes != null && !primitivesTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DactPackage.ROOT___UNIQUE_PRIMITIVE_TYPE__DIAGNOSTICCHAIN_MAP:
				return UniquePrimitiveType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RootImpl

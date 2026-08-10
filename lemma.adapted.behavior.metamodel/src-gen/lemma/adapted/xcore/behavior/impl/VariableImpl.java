/**
 */
package lemma.adapted.xcore.behavior.impl;

import java.util.Collection;

import lemma.adapted.xcore.behavior.BehaviorPackage;
import lemma.adapted.xcore.behavior.Scope;
import lemma.adapted.xcore.behavior.Variable;

import lemma.adapted.xcore.data.PrimitiveType;

import lemma.adapted.xcore.service.ImportedType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.VariableImpl#getImportedType <em>Imported Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.VariableImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.VariableImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.VariableImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.VariableImpl#getAccessibleScopes <em>Accessible Scopes</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.VariableImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends NamedElementImpl implements Variable {
	/**
	 * The cached value of the '{@link #getImportedType() <em>Imported Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedType()
	 * @generated
	 * @ordered
	 */
	protected ImportedType importedType;

	/**
	 * The cached value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType primitiveType;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_BOUND_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Integer upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_BOUND_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Integer lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessibleScopes() <em>Accessible Scopes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessibleScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<Scope> accessibleScopes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportedType getImportedType() {
		return importedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedType(ImportedType newImportedType, NotificationChain msgs) {
		ImportedType oldImportedType = importedType;
		importedType = newImportedType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE__IMPORTED_TYPE, oldImportedType, newImportedType);
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
	public void setImportedType(ImportedType newImportedType) {
		if (newImportedType != importedType) {
			NotificationChain msgs = null;
			if (importedType != null)
				msgs = ((InternalEObject)importedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.VARIABLE__IMPORTED_TYPE, null, msgs);
			if (newImportedType != null)
				msgs = ((InternalEObject)newImportedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.VARIABLE__IMPORTED_TYPE, null, msgs);
			msgs = basicSetImportedType(newImportedType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE__IMPORTED_TYPE, newImportedType, newImportedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType getPrimitiveType() {
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimitiveType(PrimitiveType newPrimitiveType, NotificationChain msgs) {
		PrimitiveType oldPrimitiveType = primitiveType;
		primitiveType = newPrimitiveType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE__PRIMITIVE_TYPE, oldPrimitiveType, newPrimitiveType);
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
	public void setPrimitiveType(PrimitiveType newPrimitiveType) {
		if (newPrimitiveType != primitiveType) {
			NotificationChain msgs = null;
			if (primitiveType != null)
				msgs = ((InternalEObject)primitiveType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.VARIABLE__PRIMITIVE_TYPE, null, msgs);
			if (newPrimitiveType != null)
				msgs = ((InternalEObject)newPrimitiveType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.VARIABLE__PRIMITIVE_TYPE, null, msgs);
			msgs = basicSetPrimitiveType(newPrimitiveType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE__PRIMITIVE_TYPE, newPrimitiveType, newPrimitiveType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperBound(Integer newUpperBound) {
		Integer oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerBound(Integer newLowerBound) {
		Integer oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scope> getAccessibleScopes() {
		if (accessibleScopes == null) {
			accessibleScopes = new EObjectWithInverseResolvingEList.ManyInverse<Scope>(Scope.class, this, BehaviorPackage.VARIABLE__ACCESSIBLE_SCOPES, BehaviorPackage.SCOPE__INHERITED_VARIABLES);
		}
		return accessibleScopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scope getScope() {
		if (eContainerFeatureID() != BehaviorPackage.VARIABLE__SCOPE) return null;
		return (Scope)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope basicGetScope() {
		if (eContainerFeatureID() != BehaviorPackage.VARIABLE__SCOPE) return null;
		return (Scope)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(Scope newScope, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScope, BehaviorPackage.VARIABLE__SCOPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(Scope newScope) {
		if (newScope != eInternalContainer() || (eContainerFeatureID() != BehaviorPackage.VARIABLE__SCOPE && newScope != null)) {
			if (EcoreUtil.isAncestor(this, newScope))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, BehaviorPackage.SCOPE__OWNED_VARIABLES, Scope.class, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE__SCOPE, newScope, newScope));
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
			case BehaviorPackage.VARIABLE__ACCESSIBLE_SCOPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccessibleScopes()).basicAdd(otherEnd, msgs);
			case BehaviorPackage.VARIABLE__SCOPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScope((Scope)otherEnd, msgs);
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
			case BehaviorPackage.VARIABLE__IMPORTED_TYPE:
				return basicSetImportedType(null, msgs);
			case BehaviorPackage.VARIABLE__PRIMITIVE_TYPE:
				return basicSetPrimitiveType(null, msgs);
			case BehaviorPackage.VARIABLE__ACCESSIBLE_SCOPES:
				return ((InternalEList<?>)getAccessibleScopes()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.VARIABLE__SCOPE:
				return basicSetScope(null, msgs);
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
			case BehaviorPackage.VARIABLE__SCOPE:
				return eInternalContainer().eInverseRemove(this, BehaviorPackage.SCOPE__OWNED_VARIABLES, Scope.class, msgs);
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
			case BehaviorPackage.VARIABLE__IMPORTED_TYPE:
				return getImportedType();
			case BehaviorPackage.VARIABLE__PRIMITIVE_TYPE:
				return getPrimitiveType();
			case BehaviorPackage.VARIABLE__UPPER_BOUND:
				return getUpperBound();
			case BehaviorPackage.VARIABLE__LOWER_BOUND:
				return getLowerBound();
			case BehaviorPackage.VARIABLE__ACCESSIBLE_SCOPES:
				return getAccessibleScopes();
			case BehaviorPackage.VARIABLE__SCOPE:
				if (resolve) return getScope();
				return basicGetScope();
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
			case BehaviorPackage.VARIABLE__IMPORTED_TYPE:
				setImportedType((ImportedType)newValue);
				return;
			case BehaviorPackage.VARIABLE__PRIMITIVE_TYPE:
				setPrimitiveType((PrimitiveType)newValue);
				return;
			case BehaviorPackage.VARIABLE__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case BehaviorPackage.VARIABLE__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case BehaviorPackage.VARIABLE__ACCESSIBLE_SCOPES:
				getAccessibleScopes().clear();
				getAccessibleScopes().addAll((Collection<? extends Scope>)newValue);
				return;
			case BehaviorPackage.VARIABLE__SCOPE:
				setScope((Scope)newValue);
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
			case BehaviorPackage.VARIABLE__IMPORTED_TYPE:
				setImportedType((ImportedType)null);
				return;
			case BehaviorPackage.VARIABLE__PRIMITIVE_TYPE:
				setPrimitiveType((PrimitiveType)null);
				return;
			case BehaviorPackage.VARIABLE__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case BehaviorPackage.VARIABLE__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case BehaviorPackage.VARIABLE__ACCESSIBLE_SCOPES:
				getAccessibleScopes().clear();
				return;
			case BehaviorPackage.VARIABLE__SCOPE:
				setScope((Scope)null);
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
			case BehaviorPackage.VARIABLE__IMPORTED_TYPE:
				return importedType != null;
			case BehaviorPackage.VARIABLE__PRIMITIVE_TYPE:
				return primitiveType != null;
			case BehaviorPackage.VARIABLE__UPPER_BOUND:
				return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
			case BehaviorPackage.VARIABLE__LOWER_BOUND:
				return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
			case BehaviorPackage.VARIABLE__ACCESSIBLE_SCOPES:
				return accessibleScopes != null && !accessibleScopes.isEmpty();
			case BehaviorPackage.VARIABLE__SCOPE:
				return basicGetScope() != null;
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
		result.append(" (upperBound: ");
		result.append(upperBound);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(')');
		return result.toString();
	}

} //VariableImpl

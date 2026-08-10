/**
 */
package lemma.adapted.xcore.behavior.impl;

import java.util.Collection;

import lemma.adapted.xcore.behavior.ActivityGroup;
import lemma.adapted.xcore.behavior.BehaviorPackage;
import lemma.adapted.xcore.behavior.Scope;
import lemma.adapted.xcore.behavior.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ScopeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ScopeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ScopeImpl#getInheritedVariables <em>Inherited Variables</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ScopeImpl#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ScopeImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeImpl extends MinimalEObjectImpl.Container implements Scope {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Scope parent;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Scope> children;

	/**
	 * The cached value of the '{@link #getInheritedVariables() <em>Inherited Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> inheritedVariables;

	/**
	 * The cached value of the '{@link #getOwnedVariables() <em>Owned Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> ownedVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scope getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Scope)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SCOPE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Scope newParent, NotificationChain msgs) {
		Scope oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCOPE__PARENT, oldParent, newParent);
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
	public void setParent(Scope newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, BehaviorPackage.SCOPE__CHILDREN, Scope.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, BehaviorPackage.SCOPE__CHILDREN, Scope.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCOPE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scope> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseResolvingEList<Scope>(Scope.class, this, BehaviorPackage.SCOPE__CHILDREN, BehaviorPackage.SCOPE__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getInheritedVariables() {
		if (inheritedVariables == null) {
			inheritedVariables = new EObjectWithInverseResolvingEList.ManyInverse<Variable>(Variable.class, this, BehaviorPackage.SCOPE__INHERITED_VARIABLES, BehaviorPackage.VARIABLE__ACCESSIBLE_SCOPES);
		}
		return inheritedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getOwnedVariables() {
		if (ownedVariables == null) {
			ownedVariables = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, BehaviorPackage.SCOPE__OWNED_VARIABLES, BehaviorPackage.VARIABLE__SCOPE);
		}
		return ownedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityGroup getGroup() {
		if (eContainerFeatureID() != BehaviorPackage.SCOPE__GROUP) return null;
		return (ActivityGroup)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup basicGetGroup() {
		if (eContainerFeatureID() != BehaviorPackage.SCOPE__GROUP) return null;
		return (ActivityGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(ActivityGroup newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, BehaviorPackage.SCOPE__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(ActivityGroup newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != BehaviorPackage.SCOPE__GROUP && newGroup != null)) {
			if (EcoreUtil.isAncestor(this, newGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, BehaviorPackage.ACTIVITY_GROUP__SCOPE, ActivityGroup.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCOPE__GROUP, newGroup, newGroup));
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
			case BehaviorPackage.SCOPE__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, BehaviorPackage.SCOPE__CHILDREN, Scope.class, msgs);
				return basicSetParent((Scope)otherEnd, msgs);
			case BehaviorPackage.SCOPE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case BehaviorPackage.SCOPE__INHERITED_VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInheritedVariables()).basicAdd(otherEnd, msgs);
			case BehaviorPackage.SCOPE__OWNED_VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedVariables()).basicAdd(otherEnd, msgs);
			case BehaviorPackage.SCOPE__GROUP:
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
			case BehaviorPackage.SCOPE__PARENT:
				return basicSetParent(null, msgs);
			case BehaviorPackage.SCOPE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.SCOPE__INHERITED_VARIABLES:
				return ((InternalEList<?>)getInheritedVariables()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.SCOPE__OWNED_VARIABLES:
				return ((InternalEList<?>)getOwnedVariables()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.SCOPE__GROUP:
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
			case BehaviorPackage.SCOPE__GROUP:
				return eInternalContainer().eInverseRemove(this, BehaviorPackage.ACTIVITY_GROUP__SCOPE, ActivityGroup.class, msgs);
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
			case BehaviorPackage.SCOPE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case BehaviorPackage.SCOPE__CHILDREN:
				return getChildren();
			case BehaviorPackage.SCOPE__INHERITED_VARIABLES:
				return getInheritedVariables();
			case BehaviorPackage.SCOPE__OWNED_VARIABLES:
				return getOwnedVariables();
			case BehaviorPackage.SCOPE__GROUP:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviorPackage.SCOPE__PARENT:
				setParent((Scope)newValue);
				return;
			case BehaviorPackage.SCOPE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Scope>)newValue);
				return;
			case BehaviorPackage.SCOPE__INHERITED_VARIABLES:
				getInheritedVariables().clear();
				getInheritedVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case BehaviorPackage.SCOPE__OWNED_VARIABLES:
				getOwnedVariables().clear();
				getOwnedVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case BehaviorPackage.SCOPE__GROUP:
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
			case BehaviorPackage.SCOPE__PARENT:
				setParent((Scope)null);
				return;
			case BehaviorPackage.SCOPE__CHILDREN:
				getChildren().clear();
				return;
			case BehaviorPackage.SCOPE__INHERITED_VARIABLES:
				getInheritedVariables().clear();
				return;
			case BehaviorPackage.SCOPE__OWNED_VARIABLES:
				getOwnedVariables().clear();
				return;
			case BehaviorPackage.SCOPE__GROUP:
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
			case BehaviorPackage.SCOPE__PARENT:
				return parent != null;
			case BehaviorPackage.SCOPE__CHILDREN:
				return children != null && !children.isEmpty();
			case BehaviorPackage.SCOPE__INHERITED_VARIABLES:
				return inheritedVariables != null && !inheritedVariables.isEmpty();
			case BehaviorPackage.SCOPE__OWNED_VARIABLES:
				return ownedVariables != null && !ownedVariables.isEmpty();
			case BehaviorPackage.SCOPE__GROUP:
				return basicGetGroup() != null;
		}
		return super.eIsSet(featureID);
	}

} //ScopeImpl

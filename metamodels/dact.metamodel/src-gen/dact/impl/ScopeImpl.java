/**
 */
package dact.impl;

import dact.ActivityGroup;
import dact.DactPackage;
import dact.DomainObject;
import dact.Scope;
import dact.Variable;

import java.util.Collection;

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
 *   <li>{@link dact.impl.ScopeImpl#getName <em>Name</em>}</li>
 *   <li>{@link dact.impl.ScopeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link dact.impl.ScopeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link dact.impl.ScopeImpl#getInheritedVariables <em>Inherited Variables</em>}</li>
 *   <li>{@link dact.impl.ScopeImpl#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link dact.impl.ScopeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link dact.impl.ScopeImpl#getDomainObject <em>Domain Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeImpl extends MinimalEObjectImpl.Container implements Scope {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
		return DactPackage.eINSTANCE.getScope();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		DomainObject _domainObject = this.getDomainObject();
		boolean _tripleNotEquals = (_domainObject != null);
		if (_tripleNotEquals) {
			return this.getDomainObject().getName();
		}
		ActivityGroup _group = this.getGroup();
		boolean _tripleNotEquals_1 = (_group != null);
		if (_tripleNotEquals_1) {
			return this.getGroup().getName();
		}
		return "?";
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.SCOPE__PARENT, oldParent, parent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DactPackage.SCOPE__PARENT, oldParent, newParent);
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
				msgs = ((InternalEObject)parent).eInverseRemove(this, DactPackage.SCOPE__CHILDREN, Scope.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DactPackage.SCOPE__CHILDREN, Scope.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.SCOPE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scope> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseResolvingEList<Scope>(Scope.class, this, DactPackage.SCOPE__CHILDREN, DactPackage.SCOPE__PARENT);
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
			inheritedVariables = new EObjectWithInverseResolvingEList.ManyInverse<Variable>(Variable.class, this, DactPackage.SCOPE__INHERITED_VARIABLES, DactPackage.VARIABLE__ACCESSIBLE_SCOPES);
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
			ownedVariables = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, DactPackage.SCOPE__OWNED_VARIABLES, DactPackage.VARIABLE__SCOPE);
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
		if (eContainerFeatureID() != DactPackage.SCOPE__GROUP) return null;
		return (ActivityGroup)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup basicGetGroup() {
		if (eContainerFeatureID() != DactPackage.SCOPE__GROUP) return null;
		return (ActivityGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(ActivityGroup newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, DactPackage.SCOPE__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(ActivityGroup newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != DactPackage.SCOPE__GROUP && newGroup != null)) {
			if (EcoreUtil.isAncestor(this, newGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, DactPackage.ACTIVITY_GROUP__SCOPE, ActivityGroup.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.SCOPE__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObject getDomainObject() {
		if (eContainerFeatureID() != DactPackage.SCOPE__DOMAIN_OBJECT) return null;
		return (DomainObject)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject basicGetDomainObject() {
		if (eContainerFeatureID() != DactPackage.SCOPE__DOMAIN_OBJECT) return null;
		return (DomainObject)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainObject(DomainObject newDomainObject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomainObject, DactPackage.SCOPE__DOMAIN_OBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainObject(DomainObject newDomainObject) {
		if (newDomainObject != eInternalContainer() || (eContainerFeatureID() != DactPackage.SCOPE__DOMAIN_OBJECT && newDomainObject != null)) {
			if (EcoreUtil.isAncestor(this, newDomainObject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomainObject != null)
				msgs = ((InternalEObject)newDomainObject).eInverseAdd(this, DactPackage.DOMAIN_OBJECT__SCOPE, DomainObject.class, msgs);
			msgs = basicSetDomainObject(newDomainObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.SCOPE__DOMAIN_OBJECT, newDomainObject, newDomainObject));
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
			case DactPackage.SCOPE__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, DactPackage.SCOPE__CHILDREN, Scope.class, msgs);
				return basicSetParent((Scope)otherEnd, msgs);
			case DactPackage.SCOPE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case DactPackage.SCOPE__INHERITED_VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInheritedVariables()).basicAdd(otherEnd, msgs);
			case DactPackage.SCOPE__OWNED_VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedVariables()).basicAdd(otherEnd, msgs);
			case DactPackage.SCOPE__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((ActivityGroup)otherEnd, msgs);
			case DactPackage.SCOPE__DOMAIN_OBJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomainObject((DomainObject)otherEnd, msgs);
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
			case DactPackage.SCOPE__PARENT:
				return basicSetParent(null, msgs);
			case DactPackage.SCOPE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case DactPackage.SCOPE__INHERITED_VARIABLES:
				return ((InternalEList<?>)getInheritedVariables()).basicRemove(otherEnd, msgs);
			case DactPackage.SCOPE__OWNED_VARIABLES:
				return ((InternalEList<?>)getOwnedVariables()).basicRemove(otherEnd, msgs);
			case DactPackage.SCOPE__GROUP:
				return basicSetGroup(null, msgs);
			case DactPackage.SCOPE__DOMAIN_OBJECT:
				return basicSetDomainObject(null, msgs);
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
			case DactPackage.SCOPE__GROUP:
				return eInternalContainer().eInverseRemove(this, DactPackage.ACTIVITY_GROUP__SCOPE, ActivityGroup.class, msgs);
			case DactPackage.SCOPE__DOMAIN_OBJECT:
				return eInternalContainer().eInverseRemove(this, DactPackage.DOMAIN_OBJECT__SCOPE, DomainObject.class, msgs);
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
			case DactPackage.SCOPE__NAME:
				return getName();
			case DactPackage.SCOPE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case DactPackage.SCOPE__CHILDREN:
				return getChildren();
			case DactPackage.SCOPE__INHERITED_VARIABLES:
				return getInheritedVariables();
			case DactPackage.SCOPE__OWNED_VARIABLES:
				return getOwnedVariables();
			case DactPackage.SCOPE__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case DactPackage.SCOPE__DOMAIN_OBJECT:
				if (resolve) return getDomainObject();
				return basicGetDomainObject();
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
			case DactPackage.SCOPE__PARENT:
				setParent((Scope)newValue);
				return;
			case DactPackage.SCOPE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Scope>)newValue);
				return;
			case DactPackage.SCOPE__INHERITED_VARIABLES:
				getInheritedVariables().clear();
				getInheritedVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case DactPackage.SCOPE__OWNED_VARIABLES:
				getOwnedVariables().clear();
				getOwnedVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case DactPackage.SCOPE__GROUP:
				setGroup((ActivityGroup)newValue);
				return;
			case DactPackage.SCOPE__DOMAIN_OBJECT:
				setDomainObject((DomainObject)newValue);
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
			case DactPackage.SCOPE__PARENT:
				setParent((Scope)null);
				return;
			case DactPackage.SCOPE__CHILDREN:
				getChildren().clear();
				return;
			case DactPackage.SCOPE__INHERITED_VARIABLES:
				getInheritedVariables().clear();
				return;
			case DactPackage.SCOPE__OWNED_VARIABLES:
				getOwnedVariables().clear();
				return;
			case DactPackage.SCOPE__GROUP:
				setGroup((ActivityGroup)null);
				return;
			case DactPackage.SCOPE__DOMAIN_OBJECT:
				setDomainObject((DomainObject)null);
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
			case DactPackage.SCOPE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case DactPackage.SCOPE__PARENT:
				return parent != null;
			case DactPackage.SCOPE__CHILDREN:
				return children != null && !children.isEmpty();
			case DactPackage.SCOPE__INHERITED_VARIABLES:
				return inheritedVariables != null && !inheritedVariables.isEmpty();
			case DactPackage.SCOPE__OWNED_VARIABLES:
				return ownedVariables != null && !ownedVariables.isEmpty();
			case DactPackage.SCOPE__GROUP:
				return basicGetGroup() != null;
			case DactPackage.SCOPE__DOMAIN_OBJECT:
				return basicGetDomainObject() != null;
		}
		return super.eIsSet(featureID);
	}

} //ScopeImpl

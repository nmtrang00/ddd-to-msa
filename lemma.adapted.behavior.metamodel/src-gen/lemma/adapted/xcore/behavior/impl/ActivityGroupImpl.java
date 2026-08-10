/**
 */
package lemma.adapted.xcore.behavior.impl;

import java.util.Collection;

import lemma.adapted.xcore.behavior.Activity;
import lemma.adapted.xcore.behavior.ActivityEdge;
import lemma.adapted.xcore.behavior.ActivityGroup;
import lemma.adapted.xcore.behavior.ActivityNode;
import lemma.adapted.xcore.behavior.BehaviorPackage;
import lemma.adapted.xcore.behavior.ConditionalNode;
import lemma.adapted.xcore.behavior.Scope;
import lemma.adapted.xcore.behavior.StructuredActivityNode;
import lemma.adapted.xcore.behavior.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ActivityGroupImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ActivityGroupImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ActivityGroupImpl#getInheritedVariables <em>Inherited Variables</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ActivityGroupImpl#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ActivityGroupImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ActivityGroupImpl#getOwnedNodes <em>Owned Nodes</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ActivityGroupImpl#getOwnedEdges <em>Owned Edges</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ActivityGroupImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ActivityGroupImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ActivityGroupImpl#getStructuredActivityNode <em>Structured Activity Node</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.ActivityGroupImpl#getConditionalNode <em>Conditional Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityGroupImpl extends NamedElementImpl implements ActivityGroup {
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
	 * The cached value of the '{@link #getOwnedNodes() <em>Owned Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> ownedNodes;

	/**
	 * The cached value of the '{@link #getOwnedEdges() <em>Owned Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> ownedEdges;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected Scope scope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.ACTIVITY_GROUP;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.ACTIVITY_GROUP__PARENT, oldParent, parent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.ACTIVITY_GROUP__PARENT, oldParent, newParent);
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.ACTIVITY_GROUP__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scope> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseResolvingEList<Scope>(Scope.class, this, BehaviorPackage.ACTIVITY_GROUP__CHILDREN, BehaviorPackage.SCOPE__PARENT);
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
			inheritedVariables = new EObjectWithInverseResolvingEList.ManyInverse<Variable>(Variable.class, this, BehaviorPackage.ACTIVITY_GROUP__INHERITED_VARIABLES, BehaviorPackage.VARIABLE__ACCESSIBLE_SCOPES);
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
			ownedVariables = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, BehaviorPackage.ACTIVITY_GROUP__OWNED_VARIABLES, BehaviorPackage.VARIABLE__SCOPE);
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
		if (eContainerFeatureID() != BehaviorPackage.ACTIVITY_GROUP__GROUP) return null;
		return (ActivityGroup)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup basicGetGroup() {
		if (eContainerFeatureID() != BehaviorPackage.ACTIVITY_GROUP__GROUP) return null;
		return (ActivityGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(ActivityGroup newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, BehaviorPackage.ACTIVITY_GROUP__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(ActivityGroup newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != BehaviorPackage.ACTIVITY_GROUP__GROUP && newGroup != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.ACTIVITY_GROUP__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityNode> getOwnedNodes() {
		if (ownedNodes == null) {
			ownedNodes = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, BehaviorPackage.ACTIVITY_GROUP__OWNED_NODES, BehaviorPackage.ACTIVITY_NODE__GROUP);
		}
		return ownedNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityEdge> getOwnedEdges() {
		if (ownedEdges == null) {
			ownedEdges = new EObjectContainmentWithInverseEList<ActivityEdge>(ActivityEdge.class, this, BehaviorPackage.ACTIVITY_GROUP__OWNED_EDGES, BehaviorPackage.ACTIVITY_EDGE__GROUP);
		}
		return ownedEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(Scope newScope, NotificationChain msgs) {
		Scope oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.ACTIVITY_GROUP__SCOPE, oldScope, newScope);
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
	public void setScope(Scope newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, BehaviorPackage.SCOPE__GROUP, Scope.class, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, BehaviorPackage.SCOPE__GROUP, Scope.class, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.ACTIVITY_GROUP__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getActivity() {
		if (eContainerFeatureID() != BehaviorPackage.ACTIVITY_GROUP__ACTIVITY) return null;
		return (Activity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		if (eContainerFeatureID() != BehaviorPackage.ACTIVITY_GROUP__ACTIVITY) return null;
		return (Activity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivity, BehaviorPackage.ACTIVITY_GROUP__ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivity(Activity newActivity) {
		if (newActivity != eInternalContainer() || (eContainerFeatureID() != BehaviorPackage.ACTIVITY_GROUP__ACTIVITY && newActivity != null)) {
			if (EcoreUtil.isAncestor(this, newActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, BehaviorPackage.ACTIVITY__ROOT, Activity.class, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.ACTIVITY_GROUP__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuredActivityNode getStructuredActivityNode() {
		if (eContainerFeatureID() != BehaviorPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE) return null;
		return (StructuredActivityNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode basicGetStructuredActivityNode() {
		if (eContainerFeatureID() != BehaviorPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE) return null;
		return (StructuredActivityNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredActivityNode(StructuredActivityNode newStructuredActivityNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStructuredActivityNode, BehaviorPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStructuredActivityNode(StructuredActivityNode newStructuredActivityNode) {
		if (newStructuredActivityNode != eInternalContainer() || (eContainerFeatureID() != BehaviorPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE && newStructuredActivityNode != null)) {
			if (EcoreUtil.isAncestor(this, newStructuredActivityNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStructuredActivityNode != null)
				msgs = ((InternalEObject)newStructuredActivityNode).eInverseAdd(this, BehaviorPackage.STRUCTURED_ACTIVITY_NODE__BODY, StructuredActivityNode.class, msgs);
			msgs = basicSetStructuredActivityNode(newStructuredActivityNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE, newStructuredActivityNode, newStructuredActivityNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalNode getConditionalNode() {
		if (eContainerFeatureID() != BehaviorPackage.ACTIVITY_GROUP__CONDITIONAL_NODE) return null;
		return (ConditionalNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalNode basicGetConditionalNode() {
		if (eContainerFeatureID() != BehaviorPackage.ACTIVITY_GROUP__CONDITIONAL_NODE) return null;
		return (ConditionalNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalNode(ConditionalNode newConditionalNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConditionalNode, BehaviorPackage.ACTIVITY_GROUP__CONDITIONAL_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditionalNode(ConditionalNode newConditionalNode) {
		if (newConditionalNode != eInternalContainer() || (eContainerFeatureID() != BehaviorPackage.ACTIVITY_GROUP__CONDITIONAL_NODE && newConditionalNode != null)) {
			if (EcoreUtil.isAncestor(this, newConditionalNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConditionalNode != null)
				msgs = ((InternalEObject)newConditionalNode).eInverseAdd(this, BehaviorPackage.CONDITIONAL_NODE__ELSE_BODY, ConditionalNode.class, msgs);
			msgs = basicSetConditionalNode(newConditionalNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.ACTIVITY_GROUP__CONDITIONAL_NODE, newConditionalNode, newConditionalNode));
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
			case BehaviorPackage.ACTIVITY_GROUP__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, BehaviorPackage.SCOPE__CHILDREN, Scope.class, msgs);
				return basicSetParent((Scope)otherEnd, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__INHERITED_VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInheritedVariables()).basicAdd(otherEnd, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedVariables()).basicAdd(otherEnd, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((ActivityGroup)otherEnd, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedNodes()).basicAdd(otherEnd, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedEdges()).basicAdd(otherEnd, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__SCOPE:
				if (scope != null)
					msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.ACTIVITY_GROUP__SCOPE, null, msgs);
				return basicSetScope((Scope)otherEnd, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivity((Activity)otherEnd, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStructuredActivityNode((StructuredActivityNode)otherEnd, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__CONDITIONAL_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConditionalNode((ConditionalNode)otherEnd, msgs);
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
			case BehaviorPackage.ACTIVITY_GROUP__PARENT:
				return basicSetParent(null, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__INHERITED_VARIABLES:
				return ((InternalEList<?>)getInheritedVariables()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_VARIABLES:
				return ((InternalEList<?>)getOwnedVariables()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__GROUP:
				return basicSetGroup(null, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_NODES:
				return ((InternalEList<?>)getOwnedNodes()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_EDGES:
				return ((InternalEList<?>)getOwnedEdges()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__SCOPE:
				return basicSetScope(null, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__ACTIVITY:
				return basicSetActivity(null, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE:
				return basicSetStructuredActivityNode(null, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__CONDITIONAL_NODE:
				return basicSetConditionalNode(null, msgs);
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
			case BehaviorPackage.ACTIVITY_GROUP__GROUP:
				return eInternalContainer().eInverseRemove(this, BehaviorPackage.ACTIVITY_GROUP__SCOPE, ActivityGroup.class, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__ACTIVITY:
				return eInternalContainer().eInverseRemove(this, BehaviorPackage.ACTIVITY__ROOT, Activity.class, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE:
				return eInternalContainer().eInverseRemove(this, BehaviorPackage.STRUCTURED_ACTIVITY_NODE__BODY, StructuredActivityNode.class, msgs);
			case BehaviorPackage.ACTIVITY_GROUP__CONDITIONAL_NODE:
				return eInternalContainer().eInverseRemove(this, BehaviorPackage.CONDITIONAL_NODE__ELSE_BODY, ConditionalNode.class, msgs);
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
			case BehaviorPackage.ACTIVITY_GROUP__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case BehaviorPackage.ACTIVITY_GROUP__CHILDREN:
				return getChildren();
			case BehaviorPackage.ACTIVITY_GROUP__INHERITED_VARIABLES:
				return getInheritedVariables();
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_VARIABLES:
				return getOwnedVariables();
			case BehaviorPackage.ACTIVITY_GROUP__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_NODES:
				return getOwnedNodes();
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_EDGES:
				return getOwnedEdges();
			case BehaviorPackage.ACTIVITY_GROUP__SCOPE:
				return getScope();
			case BehaviorPackage.ACTIVITY_GROUP__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
			case BehaviorPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE:
				if (resolve) return getStructuredActivityNode();
				return basicGetStructuredActivityNode();
			case BehaviorPackage.ACTIVITY_GROUP__CONDITIONAL_NODE:
				if (resolve) return getConditionalNode();
				return basicGetConditionalNode();
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
			case BehaviorPackage.ACTIVITY_GROUP__PARENT:
				setParent((Scope)newValue);
				return;
			case BehaviorPackage.ACTIVITY_GROUP__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Scope>)newValue);
				return;
			case BehaviorPackage.ACTIVITY_GROUP__INHERITED_VARIABLES:
				getInheritedVariables().clear();
				getInheritedVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_VARIABLES:
				getOwnedVariables().clear();
				getOwnedVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case BehaviorPackage.ACTIVITY_GROUP__GROUP:
				setGroup((ActivityGroup)newValue);
				return;
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_NODES:
				getOwnedNodes().clear();
				getOwnedNodes().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_EDGES:
				getOwnedEdges().clear();
				getOwnedEdges().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case BehaviorPackage.ACTIVITY_GROUP__SCOPE:
				setScope((Scope)newValue);
				return;
			case BehaviorPackage.ACTIVITY_GROUP__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case BehaviorPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE:
				setStructuredActivityNode((StructuredActivityNode)newValue);
				return;
			case BehaviorPackage.ACTIVITY_GROUP__CONDITIONAL_NODE:
				setConditionalNode((ConditionalNode)newValue);
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
			case BehaviorPackage.ACTIVITY_GROUP__PARENT:
				setParent((Scope)null);
				return;
			case BehaviorPackage.ACTIVITY_GROUP__CHILDREN:
				getChildren().clear();
				return;
			case BehaviorPackage.ACTIVITY_GROUP__INHERITED_VARIABLES:
				getInheritedVariables().clear();
				return;
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_VARIABLES:
				getOwnedVariables().clear();
				return;
			case BehaviorPackage.ACTIVITY_GROUP__GROUP:
				setGroup((ActivityGroup)null);
				return;
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_NODES:
				getOwnedNodes().clear();
				return;
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_EDGES:
				getOwnedEdges().clear();
				return;
			case BehaviorPackage.ACTIVITY_GROUP__SCOPE:
				setScope((Scope)null);
				return;
			case BehaviorPackage.ACTIVITY_GROUP__ACTIVITY:
				setActivity((Activity)null);
				return;
			case BehaviorPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE:
				setStructuredActivityNode((StructuredActivityNode)null);
				return;
			case BehaviorPackage.ACTIVITY_GROUP__CONDITIONAL_NODE:
				setConditionalNode((ConditionalNode)null);
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
			case BehaviorPackage.ACTIVITY_GROUP__PARENT:
				return parent != null;
			case BehaviorPackage.ACTIVITY_GROUP__CHILDREN:
				return children != null && !children.isEmpty();
			case BehaviorPackage.ACTIVITY_GROUP__INHERITED_VARIABLES:
				return inheritedVariables != null && !inheritedVariables.isEmpty();
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_VARIABLES:
				return ownedVariables != null && !ownedVariables.isEmpty();
			case BehaviorPackage.ACTIVITY_GROUP__GROUP:
				return basicGetGroup() != null;
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_NODES:
				return ownedNodes != null && !ownedNodes.isEmpty();
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_EDGES:
				return ownedEdges != null && !ownedEdges.isEmpty();
			case BehaviorPackage.ACTIVITY_GROUP__SCOPE:
				return scope != null;
			case BehaviorPackage.ACTIVITY_GROUP__ACTIVITY:
				return basicGetActivity() != null;
			case BehaviorPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE:
				return basicGetStructuredActivityNode() != null;
			case BehaviorPackage.ACTIVITY_GROUP__CONDITIONAL_NODE:
				return basicGetConditionalNode() != null;
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
		if (baseClass == Scope.class) {
			switch (derivedFeatureID) {
				case BehaviorPackage.ACTIVITY_GROUP__PARENT: return BehaviorPackage.SCOPE__PARENT;
				case BehaviorPackage.ACTIVITY_GROUP__CHILDREN: return BehaviorPackage.SCOPE__CHILDREN;
				case BehaviorPackage.ACTIVITY_GROUP__INHERITED_VARIABLES: return BehaviorPackage.SCOPE__INHERITED_VARIABLES;
				case BehaviorPackage.ACTIVITY_GROUP__OWNED_VARIABLES: return BehaviorPackage.SCOPE__OWNED_VARIABLES;
				case BehaviorPackage.ACTIVITY_GROUP__GROUP: return BehaviorPackage.SCOPE__GROUP;
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
		if (baseClass == Scope.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.SCOPE__PARENT: return BehaviorPackage.ACTIVITY_GROUP__PARENT;
				case BehaviorPackage.SCOPE__CHILDREN: return BehaviorPackage.ACTIVITY_GROUP__CHILDREN;
				case BehaviorPackage.SCOPE__INHERITED_VARIABLES: return BehaviorPackage.ACTIVITY_GROUP__INHERITED_VARIABLES;
				case BehaviorPackage.SCOPE__OWNED_VARIABLES: return BehaviorPackage.ACTIVITY_GROUP__OWNED_VARIABLES;
				case BehaviorPackage.SCOPE__GROUP: return BehaviorPackage.ACTIVITY_GROUP__GROUP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActivityGroupImpl

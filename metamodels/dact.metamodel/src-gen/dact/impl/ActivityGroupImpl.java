/**
 */
package dact.impl;

import com.google.common.collect.Iterables;

import dact.Activity;
import dact.ActivityEdge;
import dact.ActivityGroup;
import dact.ActivityNode;
import dact.ConditionalNode;
import dact.DactPackage;
import dact.DiagnosticSupported;
import dact.FinalNode;
import dact.InitialNode;
import dact.Scope;
import dact.StructuredActivityNode;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.ActivityGroupImpl#getOwnedNodes <em>Owned Nodes</em>}</li>
 *   <li>{@link dact.impl.ActivityGroupImpl#getOwnedEdges <em>Owned Edges</em>}</li>
 *   <li>{@link dact.impl.ActivityGroupImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link dact.impl.ActivityGroupImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link dact.impl.ActivityGroupImpl#getStructuredActivityNode <em>Structured Activity Node</em>}</li>
 *   <li>{@link dact.impl.ActivityGroupImpl#getConditionalNode <em>Conditional Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityGroupImpl extends NamedElementImpl implements ActivityGroup {
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
		return DactPackage.eINSTANCE.getActivityGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityNode> getOwnedNodes() {
		if (ownedNodes == null) {
			ownedNodes = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, DactPackage.ACTIVITY_GROUP__OWNED_NODES, DactPackage.ACTIVITY_NODE__GROUP);
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
			ownedEdges = new EObjectContainmentWithInverseEList<ActivityEdge>(ActivityEdge.class, this, DactPackage.ACTIVITY_GROUP__OWNED_EDGES, DactPackage.ACTIVITY_EDGE__GROUP);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY_GROUP__SCOPE, oldScope, newScope);
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
				msgs = ((InternalEObject)scope).eInverseRemove(this, DactPackage.SCOPE__GROUP, Scope.class, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, DactPackage.SCOPE__GROUP, Scope.class, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY_GROUP__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getActivity() {
		if (eContainerFeatureID() != DactPackage.ACTIVITY_GROUP__ACTIVITY) return null;
		return (Activity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		if (eContainerFeatureID() != DactPackage.ACTIVITY_GROUP__ACTIVITY) return null;
		return (Activity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivity, DactPackage.ACTIVITY_GROUP__ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivity(Activity newActivity) {
		if (newActivity != eInternalContainer() || (eContainerFeatureID() != DactPackage.ACTIVITY_GROUP__ACTIVITY && newActivity != null)) {
			if (EcoreUtil.isAncestor(this, newActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, DactPackage.ACTIVITY__ROOT, Activity.class, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY_GROUP__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuredActivityNode getStructuredActivityNode() {
		if (eContainerFeatureID() != DactPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE) return null;
		return (StructuredActivityNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode basicGetStructuredActivityNode() {
		if (eContainerFeatureID() != DactPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE) return null;
		return (StructuredActivityNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredActivityNode(StructuredActivityNode newStructuredActivityNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStructuredActivityNode, DactPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStructuredActivityNode(StructuredActivityNode newStructuredActivityNode) {
		if (newStructuredActivityNode != eInternalContainer() || (eContainerFeatureID() != DactPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE && newStructuredActivityNode != null)) {
			if (EcoreUtil.isAncestor(this, newStructuredActivityNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStructuredActivityNode != null)
				msgs = ((InternalEObject)newStructuredActivityNode).eInverseAdd(this, DactPackage.STRUCTURED_ACTIVITY_NODE__BODY, StructuredActivityNode.class, msgs);
			msgs = basicSetStructuredActivityNode(newStructuredActivityNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE, newStructuredActivityNode, newStructuredActivityNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalNode getConditionalNode() {
		if (eContainerFeatureID() != DactPackage.ACTIVITY_GROUP__CONDITIONAL_NODE) return null;
		return (ConditionalNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalNode basicGetConditionalNode() {
		if (eContainerFeatureID() != DactPackage.ACTIVITY_GROUP__CONDITIONAL_NODE) return null;
		return (ConditionalNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalNode(ConditionalNode newConditionalNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConditionalNode, DactPackage.ACTIVITY_GROUP__CONDITIONAL_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditionalNode(ConditionalNode newConditionalNode) {
		if (newConditionalNode != eInternalContainer() || (eContainerFeatureID() != DactPackage.ACTIVITY_GROUP__CONDITIONAL_NODE && newConditionalNode != null)) {
			if (EcoreUtil.isAncestor(this, newConditionalNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConditionalNode != null)
				msgs = ((InternalEObject)newConditionalNode).eInverseAdd(this, DactPackage.CONDITIONAL_NODE__ELSE_BODY, ConditionalNode.class, msgs);
			msgs = basicSetConditionalNode(newConditionalNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY_GROUP__CONDITIONAL_NODE, newConditionalNode, newConditionalNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean SingleInitialNode(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		int _size = this.getOwnedNodes().size();
		boolean _tripleEquals = (_size == 0);
		if (_tripleEquals) {
			return true;
		}
		final int count = IterableExtensions.size(Iterables.<InitialNode>filter(this.getOwnedNodes(), InitialNode.class));
		if ((count == 1)) {
			return true;
		}
		String _name = this.getName();
		String _plus = ("Activity group \'" + _name);
		String _plus_1 = (_plus + "\' contains ");
		String _plus_2 = (_plus_1 + Integer.valueOf(count));
		String _plus_3 = (_plus_2 + 
			" initial nodes; exactly one is required.");
		return this.report(diagnostics, 
			"SingleInitialNode", _plus_3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean SingleFinalNode(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		int _size = this.getOwnedNodes().size();
		boolean _tripleEquals = (_size == 0);
		if (_tripleEquals) {
			return true;
		}
		final int count = IterableExtensions.size(Iterables.<FinalNode>filter(this.getOwnedNodes(), FinalNode.class));
		if ((count == 1)) {
			return true;
		}
		String _name = this.getName();
		String _plus = ("Activity group \'" + _name);
		String _plus_1 = (_plus + "\' contains ");
		String _plus_2 = (_plus_1 + Integer.valueOf(count));
		String _plus_3 = (_plus_2 + 
			" final nodes; exactly one is required.");
		return this.report(diagnostics, 
			"SingleFinalNode", _plus_3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NonEmptyGroup(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final Function1<ActivityNode, Boolean> _function = new Function1<ActivityNode, Boolean>() {
			public Boolean apply(final ActivityNode it) {
				return Boolean.valueOf(((!(it instanceof InitialNode)) && (!(it instanceof FinalNode))));
			}
		};
		final boolean hasContent = IterableExtensions.<ActivityNode>exists(this.getOwnedNodes(), _function);
		if (hasContent) {
			return true;
		}
		String _name = this.getName();
		String _plus = ("Activity group \'" + _name);
		String _plus_1 = (_plus + "\' contains no nodes.");
		return this.warn(diagnostics, 
			"NonEmptyGroup", _plus_1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean report(final DiagnosticChain diagnostics, final String errName, final String message) {
		if ((diagnostics != null)) {
			BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, 
				"http://www.example.org/xcore/dact", 0, ((errName + ": ") + message), new Object[] { this });
			diagnostics.add(_basicDiagnostic);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean warn(final DiagnosticChain diagnostics, final String warningName, final String message) {
		if ((diagnostics != null)) {
			BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.WARNING, 
				"http://www.example.org/xcore/dact", 0, ((warningName + ": ") + message), new Object[] { this });
			diagnostics.add(_basicDiagnostic);
		}
		return true;
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
			case DactPackage.ACTIVITY_GROUP__OWNED_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedNodes()).basicAdd(otherEnd, msgs);
			case DactPackage.ACTIVITY_GROUP__OWNED_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedEdges()).basicAdd(otherEnd, msgs);
			case DactPackage.ACTIVITY_GROUP__SCOPE:
				if (scope != null)
					msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DactPackage.ACTIVITY_GROUP__SCOPE, null, msgs);
				return basicSetScope((Scope)otherEnd, msgs);
			case DactPackage.ACTIVITY_GROUP__ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivity((Activity)otherEnd, msgs);
			case DactPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStructuredActivityNode((StructuredActivityNode)otherEnd, msgs);
			case DactPackage.ACTIVITY_GROUP__CONDITIONAL_NODE:
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
			case DactPackage.ACTIVITY_GROUP__OWNED_NODES:
				return ((InternalEList<?>)getOwnedNodes()).basicRemove(otherEnd, msgs);
			case DactPackage.ACTIVITY_GROUP__OWNED_EDGES:
				return ((InternalEList<?>)getOwnedEdges()).basicRemove(otherEnd, msgs);
			case DactPackage.ACTIVITY_GROUP__SCOPE:
				return basicSetScope(null, msgs);
			case DactPackage.ACTIVITY_GROUP__ACTIVITY:
				return basicSetActivity(null, msgs);
			case DactPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE:
				return basicSetStructuredActivityNode(null, msgs);
			case DactPackage.ACTIVITY_GROUP__CONDITIONAL_NODE:
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
			case DactPackage.ACTIVITY_GROUP__ACTIVITY:
				return eInternalContainer().eInverseRemove(this, DactPackage.ACTIVITY__ROOT, Activity.class, msgs);
			case DactPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE:
				return eInternalContainer().eInverseRemove(this, DactPackage.STRUCTURED_ACTIVITY_NODE__BODY, StructuredActivityNode.class, msgs);
			case DactPackage.ACTIVITY_GROUP__CONDITIONAL_NODE:
				return eInternalContainer().eInverseRemove(this, DactPackage.CONDITIONAL_NODE__ELSE_BODY, ConditionalNode.class, msgs);
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
			case DactPackage.ACTIVITY_GROUP__OWNED_NODES:
				return getOwnedNodes();
			case DactPackage.ACTIVITY_GROUP__OWNED_EDGES:
				return getOwnedEdges();
			case DactPackage.ACTIVITY_GROUP__SCOPE:
				return getScope();
			case DactPackage.ACTIVITY_GROUP__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
			case DactPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE:
				if (resolve) return getStructuredActivityNode();
				return basicGetStructuredActivityNode();
			case DactPackage.ACTIVITY_GROUP__CONDITIONAL_NODE:
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
			case DactPackage.ACTIVITY_GROUP__OWNED_NODES:
				getOwnedNodes().clear();
				getOwnedNodes().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case DactPackage.ACTIVITY_GROUP__OWNED_EDGES:
				getOwnedEdges().clear();
				getOwnedEdges().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case DactPackage.ACTIVITY_GROUP__SCOPE:
				setScope((Scope)newValue);
				return;
			case DactPackage.ACTIVITY_GROUP__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case DactPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE:
				setStructuredActivityNode((StructuredActivityNode)newValue);
				return;
			case DactPackage.ACTIVITY_GROUP__CONDITIONAL_NODE:
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
			case DactPackage.ACTIVITY_GROUP__OWNED_NODES:
				getOwnedNodes().clear();
				return;
			case DactPackage.ACTIVITY_GROUP__OWNED_EDGES:
				getOwnedEdges().clear();
				return;
			case DactPackage.ACTIVITY_GROUP__SCOPE:
				setScope((Scope)null);
				return;
			case DactPackage.ACTIVITY_GROUP__ACTIVITY:
				setActivity((Activity)null);
				return;
			case DactPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE:
				setStructuredActivityNode((StructuredActivityNode)null);
				return;
			case DactPackage.ACTIVITY_GROUP__CONDITIONAL_NODE:
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
			case DactPackage.ACTIVITY_GROUP__OWNED_NODES:
				return ownedNodes != null && !ownedNodes.isEmpty();
			case DactPackage.ACTIVITY_GROUP__OWNED_EDGES:
				return ownedEdges != null && !ownedEdges.isEmpty();
			case DactPackage.ACTIVITY_GROUP__SCOPE:
				return scope != null;
			case DactPackage.ACTIVITY_GROUP__ACTIVITY:
				return basicGetActivity() != null;
			case DactPackage.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE:
				return basicGetStructuredActivityNode() != null;
			case DactPackage.ACTIVITY_GROUP__CONDITIONAL_NODE:
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == DiagnosticSupported.class) {
			switch (baseOperationID) {
				case DactPackage.DIAGNOSTIC_SUPPORTED___REPORT__DIAGNOSTICCHAIN_STRING_STRING: return DactPackage.ACTIVITY_GROUP___REPORT__DIAGNOSTICCHAIN_STRING_STRING;
				case DactPackage.DIAGNOSTIC_SUPPORTED___WARN__DIAGNOSTICCHAIN_STRING_STRING: return DactPackage.ACTIVITY_GROUP___WARN__DIAGNOSTICCHAIN_STRING_STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case DactPackage.ACTIVITY_GROUP___SINGLE_INITIAL_NODE__DIAGNOSTICCHAIN_MAP:
				return SingleInitialNode((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.ACTIVITY_GROUP___SINGLE_FINAL_NODE__DIAGNOSTICCHAIN_MAP:
				return SingleFinalNode((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.ACTIVITY_GROUP___NON_EMPTY_GROUP__DIAGNOSTICCHAIN_MAP:
				return NonEmptyGroup((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.ACTIVITY_GROUP___REPORT__DIAGNOSTICCHAIN_STRING_STRING:
				return report((DiagnosticChain)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case DactPackage.ACTIVITY_GROUP___WARN__DIAGNOSTICCHAIN_STRING_STRING:
				return warn((DiagnosticChain)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ActivityGroupImpl

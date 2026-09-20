/**
 */
package dact.impl;

import dact.ActivityEdge;
import dact.ActivityGroup;
import dact.ActivityNode;
import dact.DactPackage;
import dact.FinalNode;
import dact.InitialNode;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.ActivityEdgeImpl#getName <em>Name</em>}</li>
 *   <li>{@link dact.impl.ActivityEdgeImpl#getEdgeName <em>Edge Name</em>}</li>
 *   <li>{@link dact.impl.ActivityEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link dact.impl.ActivityEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link dact.impl.ActivityEdgeImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityEdgeImpl extends DiagnosticSupportedImpl implements ActivityEdge {
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
	 * The default value of the '{@link #getEdgeName() <em>Edge Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdgeName() <em>Edge Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeName()
	 * @generated
	 * @ordered
	 */
	protected String edgeName = EDGE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.eINSTANCE.getActivityEdge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		String _elvis = null;
		ActivityNode _source = this.getSource();
		String _name = null;
		if (_source!=null) {
			_name=_source.getName();
		}
		if (_name != null) {
			_elvis = _name;
		} else {
			_elvis = "?";
		}
		String _plus = (_elvis + "->");
		String _elvis_1 = null;
		ActivityNode _target = this.getTarget();
		String _name_1 = null;
		if (_target!=null) {
			_name_1=_target.getName();
		}
		if (_name_1 != null) {
			_elvis_1 = _name_1;
		} else {
			_elvis_1 = "?";
		}
		return (_plus + _elvis_1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEdgeName() {
		return edgeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEdgeName(String newEdgeName) {
		String oldEdgeName = edgeName;
		edgeName = newEdgeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY_EDGE__EDGE_NAME, oldEdgeName, edgeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ActivityNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.ACTIVITY_EDGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ActivityNode newSource, NotificationChain msgs) {
		ActivityNode oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY_EDGE__SOURCE, oldSource, newSource);
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
	public void setSource(ActivityNode newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, DactPackage.ACTIVITY_NODE__SEDGE, ActivityNode.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, DactPackage.ACTIVITY_NODE__SEDGE, ActivityNode.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY_EDGE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ActivityNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.ACTIVITY_EDGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ActivityNode newTarget, NotificationChain msgs) {
		ActivityNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY_EDGE__TARGET, oldTarget, newTarget);
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
	public void setTarget(ActivityNode newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, DactPackage.ACTIVITY_NODE__TEDGE, ActivityNode.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, DactPackage.ACTIVITY_NODE__TEDGE, ActivityNode.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY_EDGE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityGroup getGroup() {
		if (eContainerFeatureID() != DactPackage.ACTIVITY_EDGE__GROUP) return null;
		return (ActivityGroup)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup basicGetGroup() {
		if (eContainerFeatureID() != DactPackage.ACTIVITY_EDGE__GROUP) return null;
		return (ActivityGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(ActivityGroup newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, DactPackage.ACTIVITY_EDGE__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(ActivityGroup newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != DactPackage.ACTIVITY_EDGE__GROUP && newGroup != null)) {
			if (EcoreUtil.isAncestor(this, newGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, DactPackage.ACTIVITY_GROUP__OWNED_EDGES, ActivityGroup.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY_EDGE__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NoSelfLoop(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		if (((this.getSource() == null) || (this.getTarget() == null))) {
			return true;
		}
		ActivityNode _source = this.getSource();
		ActivityNode _target = this.getTarget();
		boolean _tripleEquals = (_source == _target);
		if (_tripleEquals) {
			String _name = this.getName();
			String _plus = ("Edge \'" + _name);
			String _plus_1 = (_plus + "\' in group \'");
			ActivityGroup _group = this.getGroup();
			String _name_1 = null;
			if (_group!=null) {
				_name_1=_group.getName();
			}
			String _plus_2 = (_plus_1 + _name_1);
			String _plus_3 = (_plus_2 + 
				"\' connects node \'");
			String _name_2 = this.getSource().getName();
			String _plus_4 = (_plus_3 + _name_2);
			String _plus_5 = (_plus_4 + "\' to itself.");
			return this.report(diagnostics, 
				"NoSelfLoop", _plus_5);
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NoEdgeIntoInitialNode(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		ActivityNode _target = this.getTarget();
		final boolean isValid = (!(_target instanceof InitialNode));
		if (((!isValid) && (diagnostics != null))) {
			String _name = this.getName();
			String _plus = ("Edge \'" + _name);
			String _plus_1 = (_plus + "\' targets the initial node of group \'");
			ActivityGroup _group = this.getGroup();
			String _name_1 = null;
			if (_group!=null) {
				_name_1=_group.getName();
			}
			String _plus_2 = (_plus_1 + _name_1);
			String _plus_3 = (_plus_2 + "\': an initial node cannot have incoming edges.");
			this.report(diagnostics, 
				"NoEdgeIntoInitialNode", _plus_3);
		}
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NoEdgeOutOfFinalNode(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		ActivityNode _source = this.getSource();
		final boolean isValid = (!(_source instanceof FinalNode));
		if (((!isValid) && (diagnostics != null))) {
			String _name = this.getName();
			String _plus = ("Edge \'" + _name);
			String _plus_1 = (_plus + "\' originates from a final node in group \'");
			ActivityGroup _group = this.getGroup();
			String _name_1 = null;
			if (_group!=null) {
				_name_1=_group.getName();
			}
			String _plus_2 = (_plus_1 + _name_1);
			String _plus_3 = (_plus_2 + "\': a final node cannot have outgoing edges.");
			this.report(diagnostics, 
				"NoEdgeOutOfFinalNode", _plus_3);
		}
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean EndpointsInSameGroup(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		if (((this.getSource() == null) || (this.getTarget() == null))) {
			String _name = this.getName();
			String _plus = ("Edge \'" + _name);
			String _plus_1 = (_plus + "\' in group \'");
			ActivityGroup _group = this.getGroup();
			String _name_1 = null;
			if (_group!=null) {
				_name_1=_group.getName();
			}
			String _plus_2 = (_plus_1 + _name_1);
			String _plus_3 = (_plus_2 + 
				"\' must declare both a source and a target node.");
			return this.report(diagnostics, 
				"EndpointsInSameGroup", _plus_3);
		}
		if (((this.getSource().getGroup() != this.getGroup()) || (this.getTarget().getGroup() != this.getGroup()))) {
			String _name_2 = this.getName();
			String _plus_4 = ("Edge \'" + _name_2);
			String _plus_5 = (_plus_4 + "\' connects nodes outside its own group \'");
			ActivityGroup _group_1 = this.getGroup();
			String _name_3 = null;
			if (_group_1!=null) {
				_name_3=_group_1.getName();
			}
			String _plus_6 = (_plus_5 + _name_3);
			String _plus_7 = (_plus_6 + "\': an edge may only connect nodes contained ");
			String _plus_8 = (_plus_7 + 
				"in the same activity group.");
			return this.report(diagnostics, 
				"EndpointsInSameGroup", _plus_8);
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DactPackage.ACTIVITY_EDGE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, DactPackage.ACTIVITY_NODE__SEDGE, ActivityNode.class, msgs);
				return basicSetSource((ActivityNode)otherEnd, msgs);
			case DactPackage.ACTIVITY_EDGE__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, DactPackage.ACTIVITY_NODE__TEDGE, ActivityNode.class, msgs);
				return basicSetTarget((ActivityNode)otherEnd, msgs);
			case DactPackage.ACTIVITY_EDGE__GROUP:
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
			case DactPackage.ACTIVITY_EDGE__SOURCE:
				return basicSetSource(null, msgs);
			case DactPackage.ACTIVITY_EDGE__TARGET:
				return basicSetTarget(null, msgs);
			case DactPackage.ACTIVITY_EDGE__GROUP:
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
			case DactPackage.ACTIVITY_EDGE__GROUP:
				return eInternalContainer().eInverseRemove(this, DactPackage.ACTIVITY_GROUP__OWNED_EDGES, ActivityGroup.class, msgs);
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
			case DactPackage.ACTIVITY_EDGE__NAME:
				return getName();
			case DactPackage.ACTIVITY_EDGE__EDGE_NAME:
				return getEdgeName();
			case DactPackage.ACTIVITY_EDGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case DactPackage.ACTIVITY_EDGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case DactPackage.ACTIVITY_EDGE__GROUP:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DactPackage.ACTIVITY_EDGE__EDGE_NAME:
				setEdgeName((String)newValue);
				return;
			case DactPackage.ACTIVITY_EDGE__SOURCE:
				setSource((ActivityNode)newValue);
				return;
			case DactPackage.ACTIVITY_EDGE__TARGET:
				setTarget((ActivityNode)newValue);
				return;
			case DactPackage.ACTIVITY_EDGE__GROUP:
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
			case DactPackage.ACTIVITY_EDGE__EDGE_NAME:
				setEdgeName(EDGE_NAME_EDEFAULT);
				return;
			case DactPackage.ACTIVITY_EDGE__SOURCE:
				setSource((ActivityNode)null);
				return;
			case DactPackage.ACTIVITY_EDGE__TARGET:
				setTarget((ActivityNode)null);
				return;
			case DactPackage.ACTIVITY_EDGE__GROUP:
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
			case DactPackage.ACTIVITY_EDGE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case DactPackage.ACTIVITY_EDGE__EDGE_NAME:
				return EDGE_NAME_EDEFAULT == null ? edgeName != null : !EDGE_NAME_EDEFAULT.equals(edgeName);
			case DactPackage.ACTIVITY_EDGE__SOURCE:
				return source != null;
			case DactPackage.ACTIVITY_EDGE__TARGET:
				return target != null;
			case DactPackage.ACTIVITY_EDGE__GROUP:
				return basicGetGroup() != null;
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
			case DactPackage.ACTIVITY_EDGE___NO_SELF_LOOP__DIAGNOSTICCHAIN_MAP:
				return NoSelfLoop((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.ACTIVITY_EDGE___NO_EDGE_INTO_INITIAL_NODE__DIAGNOSTICCHAIN_MAP:
				return NoEdgeIntoInitialNode((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.ACTIVITY_EDGE___NO_EDGE_OUT_OF_FINAL_NODE__DIAGNOSTICCHAIN_MAP:
				return NoEdgeOutOfFinalNode((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.ACTIVITY_EDGE___ENDPOINTS_IN_SAME_GROUP__DIAGNOSTICCHAIN_MAP:
				return EndpointsInSameGroup((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (edgeName: ");
		result.append(edgeName);
		result.append(')');
		return result.toString();
	}

} //ActivityEdgeImpl

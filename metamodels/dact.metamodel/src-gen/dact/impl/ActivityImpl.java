/**
 */
package dact.impl;

import dact.Activity;
import dact.ActivityGroup;
import dact.Behavior;
import dact.DactPackage;
import dact.DiagnosticSupported;
import dact.DomainNode;
import dact.DomainNodeOperationMapping;
import dact.Operation;
import dact.Parameter;
import dact.ParameterMapping;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.ActivityImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link dact.impl.ActivityImpl#getToTransform <em>To Transform</em>}</li>
 *   <li>{@link dact.impl.ActivityImpl#getOwnedParameters <em>Owned Parameters</em>}</li>
 *   <li>{@link dact.impl.ActivityImpl#getParameterMappings <em>Parameter Mappings</em>}</li>
 *   <li>{@link dact.impl.ActivityImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link dact.impl.ActivityImpl#getOwnedDomainNodes <em>Owned Domain Nodes</em>}</li>
 *   <li>{@link dact.impl.ActivityImpl#getProcessedDomainNodeMappings <em>Processed Domain Node Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends NamedElementImpl implements Activity {
	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected Operation specification;

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
	 * The cached value of the '{@link #getOwnedDomainNodes() <em>Owned Domain Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDomainNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainNode> ownedDomainNodes;

	/**
	 * The cached value of the '{@link #getProcessedDomainNodeMappings() <em>Processed Domain Node Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessedDomainNodeMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainNodeOperationMapping> processedDomainNodeMappings;

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
		return DactPackage.eINSTANCE.getActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getSpecification() {
		if (specification != null && specification.eIsProxy()) {
			InternalEObject oldSpecification = (InternalEObject)specification;
			specification = (Operation)eResolveProxy(oldSpecification);
			if (specification != oldSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.ACTIVITY__SPECIFICATION, oldSpecification, specification));
			}
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(Operation newSpecification, NotificationChain msgs) {
		Operation oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY__SPECIFICATION, oldSpecification, newSpecification);
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
	public void setSpecification(Operation newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, DactPackage.OPERATION__BEHAVIOR, Operation.class, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, DactPackage.OPERATION__BEHAVIOR, Operation.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY__SPECIFICATION, newSpecification, newSpecification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY__TO_TRANSFORM, oldToTransform, toTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getOwnedParameters() {
		if (ownedParameters == null) {
			ownedParameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, DactPackage.ACTIVITY__OWNED_PARAMETERS, DactPackage.PARAMETER__ACTIVITY);
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
			parameterMappings = new EObjectContainmentWithInverseEList<ParameterMapping>(ParameterMapping.class, this, DactPackage.ACTIVITY__PARAMETER_MAPPINGS, DactPackage.PARAMETER_MAPPING__ACTIVITY);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY__ROOT, oldRoot, newRoot);
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
				msgs = ((InternalEObject)root).eInverseRemove(this, DactPackage.ACTIVITY_GROUP__ACTIVITY, ActivityGroup.class, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, DactPackage.ACTIVITY_GROUP__ACTIVITY, ActivityGroup.class, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.ACTIVITY__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainNode> getOwnedDomainNodes() {
		if (ownedDomainNodes == null) {
			ownedDomainNodes = new EObjectContainmentEList<DomainNode>(DomainNode.class, this, DactPackage.ACTIVITY__OWNED_DOMAIN_NODES);
		}
		return ownedDomainNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainNodeOperationMapping> getProcessedDomainNodeMappings() {
		if (processedDomainNodeMappings == null) {
			processedDomainNodeMappings = new EObjectContainmentEList<DomainNodeOperationMapping>(DomainNodeOperationMapping.class, this, DactPackage.ACTIVITY__PROCESSED_DOMAIN_NODE_MAPPINGS);
		}
		return processedDomainNodeMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean MappingsOnlyWithSpecification(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		if (((this.getSpecification() == null) && (!this.getParameterMappings().isEmpty()))) {
			String _name = this.getName();
			String _plus = ("Activity \'" + _name);
			String _plus_1 = (_plus + 
				"\' declares parameter mappings but specifies no operation.");
			return this.report(diagnostics, 
				"MappingsOnlyWithSpecification", _plus_1);
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean MatchedParameterMappingsCount(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		Operation _specification = this.getSpecification();
		boolean _tripleEquals = (_specification == null);
		if (_tripleEquals) {
			return true;
		}
		final EList<Parameter> opParams = this.getSpecification().getOwnedParameters();
		if (((this.getParameterMappings().size() != this.getOwnedParameters().size()) || 
			(this.getParameterMappings().size() != opParams.size()))) {
			String _name = this.getName();
			String _plus = ("Activity \'" + _name);
			String _plus_1 = (_plus + "\' declares ");
			int _size = this.getParameterMappings().size();
			String _plus_2 = (_plus_1 + Integer.valueOf(_size));
			String _plus_3 = (_plus_2 + " parameter mappings for ");
			int _size_1 = this.getOwnedParameters().size();
			String _plus_4 = (_plus_3 + Integer.valueOf(_size_1));
			String _plus_5 = (_plus_4 + " activity parameters and ");
			int _size_2 = opParams.size();
			String _plus_6 = (_plus_5 + Integer.valueOf(_size_2));
			String _plus_7 = (_plus_6 + " operation parameters; all three must ");
			String _plus_8 = (_plus_7 + 
				"be equal.");
			return this.report(diagnostics, 
				"MatchedParameterMappingsCount", _plus_8);
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean EachParameterIsMapped(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		Operation _specification = this.getSpecification();
		boolean _tripleEquals = (_specification == null);
		if (_tripleEquals) {
			return true;
		}
		final EList<Parameter> opParams = this.getSpecification().getOwnedParameters();
		final Function1<ParameterMapping, Parameter> _function = new Function1<ParameterMapping, Parameter>() {
			public Parameter apply(final ParameterMapping it) {
				return it.getOperationParameter();
			}
		};
		final List<Parameter> mappedOpParams = IterableExtensions.<Parameter>toList(IterableExtensions.<Parameter>filterNull(XcoreEListExtensions.<ParameterMapping, Parameter>map(this.getParameterMappings(), _function)));
		final Function1<ParameterMapping, Parameter> _function_1 = new Function1<ParameterMapping, Parameter>() {
			public Parameter apply(final ParameterMapping it) {
				return it.getActivityParameter();
			}
		};
		final List<Parameter> mappedActParams = IterableExtensions.<Parameter>toList(IterableExtensions.<Parameter>filterNull(XcoreEListExtensions.<ParameterMapping, Parameter>map(this.getParameterMappings(), _function_1)));
		boolean isValid = true;
		if (((mappedOpParams.size() != IterableExtensions.<Parameter>toSet(mappedOpParams).size()) || 
			(!mappedOpParams.containsAll(opParams)))) {
			String _name = this.getSpecification().getName();
			String _plus = ("Each operation parameter of \'" + _name);
			String _plus_1 = (_plus + "\' must be covered by exactly one ");
			String _plus_2 = (_plus_1 + 
				"mapping in activity \'");
			String _name_1 = this.getName();
			String _plus_3 = (_plus_2 + _name_1);
			String _plus_4 = (_plus_3 + "\'.");
			isValid = this.report(diagnostics, 
				"EachParameterIsMapped", _plus_4);
		}
		if (((mappedActParams.size() != IterableExtensions.<Parameter>toSet(mappedActParams).size()) || 
			(!mappedActParams.containsAll(this.getOwnedParameters())))) {
			String _name_2 = this.getName();
			String _plus_5 = ("Each parameter of activity \'" + _name_2);
			String _plus_6 = (_plus_5 + "\' must be covered by exactly one mapping.");
			isValid = this.report(diagnostics, 
				"EachParameterIsMapped", _plus_6);
		}
		return isValid;
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
			case DactPackage.ACTIVITY__SPECIFICATION:
				if (specification != null)
					msgs = ((InternalEObject)specification).eInverseRemove(this, DactPackage.OPERATION__BEHAVIOR, Operation.class, msgs);
				return basicSetSpecification((Operation)otherEnd, msgs);
			case DactPackage.ACTIVITY__OWNED_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedParameters()).basicAdd(otherEnd, msgs);
			case DactPackage.ACTIVITY__PARAMETER_MAPPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterMappings()).basicAdd(otherEnd, msgs);
			case DactPackage.ACTIVITY__ROOT:
				if (root != null)
					msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DactPackage.ACTIVITY__ROOT, null, msgs);
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
			case DactPackage.ACTIVITY__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case DactPackage.ACTIVITY__OWNED_PARAMETERS:
				return ((InternalEList<?>)getOwnedParameters()).basicRemove(otherEnd, msgs);
			case DactPackage.ACTIVITY__PARAMETER_MAPPINGS:
				return ((InternalEList<?>)getParameterMappings()).basicRemove(otherEnd, msgs);
			case DactPackage.ACTIVITY__ROOT:
				return basicSetRoot(null, msgs);
			case DactPackage.ACTIVITY__OWNED_DOMAIN_NODES:
				return ((InternalEList<?>)getOwnedDomainNodes()).basicRemove(otherEnd, msgs);
			case DactPackage.ACTIVITY__PROCESSED_DOMAIN_NODE_MAPPINGS:
				return ((InternalEList<?>)getProcessedDomainNodeMappings()).basicRemove(otherEnd, msgs);
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
			case DactPackage.ACTIVITY__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case DactPackage.ACTIVITY__TO_TRANSFORM:
				return getToTransform();
			case DactPackage.ACTIVITY__OWNED_PARAMETERS:
				return getOwnedParameters();
			case DactPackage.ACTIVITY__PARAMETER_MAPPINGS:
				return getParameterMappings();
			case DactPackage.ACTIVITY__ROOT:
				return getRoot();
			case DactPackage.ACTIVITY__OWNED_DOMAIN_NODES:
				return getOwnedDomainNodes();
			case DactPackage.ACTIVITY__PROCESSED_DOMAIN_NODE_MAPPINGS:
				return getProcessedDomainNodeMappings();
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
			case DactPackage.ACTIVITY__SPECIFICATION:
				setSpecification((Operation)newValue);
				return;
			case DactPackage.ACTIVITY__TO_TRANSFORM:
				setToTransform((Boolean)newValue);
				return;
			case DactPackage.ACTIVITY__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case DactPackage.ACTIVITY__PARAMETER_MAPPINGS:
				getParameterMappings().clear();
				getParameterMappings().addAll((Collection<? extends ParameterMapping>)newValue);
				return;
			case DactPackage.ACTIVITY__ROOT:
				setRoot((ActivityGroup)newValue);
				return;
			case DactPackage.ACTIVITY__OWNED_DOMAIN_NODES:
				getOwnedDomainNodes().clear();
				getOwnedDomainNodes().addAll((Collection<? extends DomainNode>)newValue);
				return;
			case DactPackage.ACTIVITY__PROCESSED_DOMAIN_NODE_MAPPINGS:
				getProcessedDomainNodeMappings().clear();
				getProcessedDomainNodeMappings().addAll((Collection<? extends DomainNodeOperationMapping>)newValue);
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
			case DactPackage.ACTIVITY__SPECIFICATION:
				setSpecification((Operation)null);
				return;
			case DactPackage.ACTIVITY__TO_TRANSFORM:
				setToTransform(TO_TRANSFORM_EDEFAULT);
				return;
			case DactPackage.ACTIVITY__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				return;
			case DactPackage.ACTIVITY__PARAMETER_MAPPINGS:
				getParameterMappings().clear();
				return;
			case DactPackage.ACTIVITY__ROOT:
				setRoot((ActivityGroup)null);
				return;
			case DactPackage.ACTIVITY__OWNED_DOMAIN_NODES:
				getOwnedDomainNodes().clear();
				return;
			case DactPackage.ACTIVITY__PROCESSED_DOMAIN_NODE_MAPPINGS:
				getProcessedDomainNodeMappings().clear();
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
			case DactPackage.ACTIVITY__SPECIFICATION:
				return specification != null;
			case DactPackage.ACTIVITY__TO_TRANSFORM:
				return TO_TRANSFORM_EDEFAULT == null ? toTransform != null : !TO_TRANSFORM_EDEFAULT.equals(toTransform);
			case DactPackage.ACTIVITY__OWNED_PARAMETERS:
				return ownedParameters != null && !ownedParameters.isEmpty();
			case DactPackage.ACTIVITY__PARAMETER_MAPPINGS:
				return parameterMappings != null && !parameterMappings.isEmpty();
			case DactPackage.ACTIVITY__ROOT:
				return root != null;
			case DactPackage.ACTIVITY__OWNED_DOMAIN_NODES:
				return ownedDomainNodes != null && !ownedDomainNodes.isEmpty();
			case DactPackage.ACTIVITY__PROCESSED_DOMAIN_NODE_MAPPINGS:
				return processedDomainNodeMappings != null && !processedDomainNodeMappings.isEmpty();
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
				case DactPackage.ACTIVITY__SPECIFICATION: return DactPackage.BEHAVIOR__SPECIFICATION;
				default: return -1;
			}
		}
		if (baseClass == DiagnosticSupported.class) {
			switch (derivedFeatureID) {
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
				case DactPackage.BEHAVIOR__SPECIFICATION: return DactPackage.ACTIVITY__SPECIFICATION;
				default: return -1;
			}
		}
		if (baseClass == DiagnosticSupported.class) {
			switch (baseFeatureID) {
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Behavior.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == DiagnosticSupported.class) {
			switch (baseOperationID) {
				case DactPackage.DIAGNOSTIC_SUPPORTED___REPORT__DIAGNOSTICCHAIN_STRING_STRING: return DactPackage.ACTIVITY___REPORT__DIAGNOSTICCHAIN_STRING_STRING;
				case DactPackage.DIAGNOSTIC_SUPPORTED___WARN__DIAGNOSTICCHAIN_STRING_STRING: return DactPackage.ACTIVITY___WARN__DIAGNOSTICCHAIN_STRING_STRING;
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
			case DactPackage.ACTIVITY___MAPPINGS_ONLY_WITH_SPECIFICATION__DIAGNOSTICCHAIN_MAP:
				return MappingsOnlyWithSpecification((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.ACTIVITY___MATCHED_PARAMETER_MAPPINGS_COUNT__DIAGNOSTICCHAIN_MAP:
				return MatchedParameterMappingsCount((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.ACTIVITY___EACH_PARAMETER_IS_MAPPED__DIAGNOSTICCHAIN_MAP:
				return EachParameterIsMapped((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.ACTIVITY___REPORT__DIAGNOSTICCHAIN_STRING_STRING:
				return report((DiagnosticChain)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case DactPackage.ACTIVITY___WARN__DIAGNOSTICCHAIN_STRING_STRING:
				return warn((DiagnosticChain)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
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
		result.append(" (toTransform: ");
		result.append(toTransform);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl

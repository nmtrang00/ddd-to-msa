/**
 */
package dact.impl;

import dact.AggregateRoot;
import dact.BinaryExpression;
import dact.DactPackage;
import dact.DiagnosticSupported;
import dact.DomainExistAction;
import dact.DomainFindAction;
import dact.DomainNode;
import dact.Entity;
import dact.Expression;
import dact.Identifier;
import dact.Property;
import dact.UnaryExpression;

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.DomainNodeImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link dact.impl.DomainNodeImpl#getResult <em>Result</em>}</li>
 *   <li>{@link dact.impl.DomainNodeImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link dact.impl.DomainNodeImpl#getMainExpr <em>Main Expr</em>}</li>
 *   <li>{@link dact.impl.DomainNodeImpl#getPropertyChain <em>Property Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DomainNodeImpl extends ExecutableNodeImpl implements DomainNode {
	/**
	 * The cached value of the '{@link #getAggregate() <em>Aggregate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregate()
	 * @generated
	 * @ordered
	 */
	protected AggregateRoot aggregate;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected Identifier result;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * The cached value of the '{@link #getMainExpr() <em>Main Expr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainExpr()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> mainExpr;

	/**
	 * The cached value of the '{@link #getPropertyChain() <em>Property Chain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyChain()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> propertyChain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.Literals.DOMAIN_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggregateRoot getAggregate() {
		if (aggregate != null && aggregate.eIsProxy()) {
			InternalEObject oldAggregate = (InternalEObject)aggregate;
			aggregate = (AggregateRoot)eResolveProxy(oldAggregate);
			if (aggregate != oldAggregate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.DOMAIN_NODE__AGGREGATE, oldAggregate, aggregate));
			}
		}
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateRoot basicGetAggregate() {
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregate(AggregateRoot newAggregate) {
		AggregateRoot oldAggregate = aggregate;
		aggregate = newAggregate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.DOMAIN_NODE__AGGREGATE, oldAggregate, aggregate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(Identifier newResult, NotificationChain msgs) {
		Identifier oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DactPackage.DOMAIN_NODE__RESULT, oldResult, newResult);
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
	public void setResult(Identifier newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DactPackage.DOMAIN_NODE__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DactPackage.DOMAIN_NODE__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.DOMAIN_NODE__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (Entity)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DactPackage.DOMAIN_NODE__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity(Entity newEntity) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.DOMAIN_NODE__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getMainExpr() {
		if (mainExpr == null) {
			mainExpr = new EObjectContainmentEList<Expression>(Expression.class, this, DactPackage.DOMAIN_NODE__MAIN_EXPR);
		}
		return mainExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getPropertyChain() {
		if (propertyChain == null) {
			propertyChain = new EObjectResolvingEList<Property>(Property.class, this, DactPackage.DOMAIN_NODE__PROPERTY_CHAIN);
		}
		return propertyChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean RequiresMainExpression(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final boolean isValid = (((this instanceof DomainFindAction) && (!(this instanceof DomainExistAction))) || (!this.getMainExpr().isEmpty()));
		if (((!isValid) && (diagnostics != null))) {
			String _name = this.getName();
			String _plus = ("Domain node \'" + _name);
			String _plus_1 = (_plus + "\' must declare at least one main ");
			String _plus_2 = (_plus_1 + 
				"expression to identify the target aggregate or the value ");
			String _plus_3 = (_plus_2 + 
				"to be written.");
			this.report(diagnostics, _plus_3);
		}
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean SelfAnchoredBinaryExpression(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		boolean isValid = true;
		EList<Expression> _mainExpr = this.getMainExpr();
		for (final Expression expr : _mainExpr) {
			{
				final Expression binary = expr;
				if ((!(binary instanceof BinaryExpression))) {
					String _name = null;
					if (expr!=null) {
						_name=expr.getName();
					}
					String _plus = ("Expression \'" + _name);
					String _plus_1 = (_plus + "\' of node \'");
					String _name_1 = this.getName();
					String _plus_2 = (_plus_1 + _name_1);
					String _plus_3 = (_plus_2 + 
						"\' must be a binary expression.");
					isValid = this.report(diagnostics, _plus_3);
				}
				else {
					final Expression left = ((BinaryExpression) binary).getLeftExpr();
					if ((!(left instanceof UnaryExpression))) {
						String _name_2 = null;
						if (expr!=null) {
							_name_2=expr.getName();
						}
						String _plus_4 = ("The left operand of expression \'" + _name_2);
						String _plus_5 = (_plus_4 + 
							"\' must be a unary expression.");
						isValid = this.report(diagnostics, _plus_5);
					}
					else {
						final Identifier identifier = ((UnaryExpression) left).getIdentifier();
						if (((identifier == null) || (!identifier.getName().startsWith("self")))) {
							String _name_3 = null;
							if (expr!=null) {
								_name_3=expr.getName();
							}
							String _plus_6 = ("The left operand of expression \'" + _name_3);
							String _plus_7 = (_plus_6 + 
								"\' must be an identifier anchored at \'self\'.");
							isValid = this.report(diagnostics, _plus_7);
						}
					}
				}
			}
		}
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean report(final DiagnosticChain diagnostics, final String message) {
		if ((diagnostics != null)) {
			BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, 
				"http://www.example.org/xcore/dact", 0, message, new Object[] { this });
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
	public boolean warn(final DiagnosticChain diagnostics, final String message) {
		if ((diagnostics != null)) {
			BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.WARNING, 
				"http://www.example.org/xcore/dact", 0, message, new Object[] { this });
			diagnostics.add(_basicDiagnostic);
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DactPackage.DOMAIN_NODE__RESULT:
				return basicSetResult(null, msgs);
			case DactPackage.DOMAIN_NODE__MAIN_EXPR:
				return ((InternalEList<?>)getMainExpr()).basicRemove(otherEnd, msgs);
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
			case DactPackage.DOMAIN_NODE__AGGREGATE:
				if (resolve) return getAggregate();
				return basicGetAggregate();
			case DactPackage.DOMAIN_NODE__RESULT:
				return getResult();
			case DactPackage.DOMAIN_NODE__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case DactPackage.DOMAIN_NODE__MAIN_EXPR:
				return getMainExpr();
			case DactPackage.DOMAIN_NODE__PROPERTY_CHAIN:
				return getPropertyChain();
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
			case DactPackage.DOMAIN_NODE__AGGREGATE:
				setAggregate((AggregateRoot)newValue);
				return;
			case DactPackage.DOMAIN_NODE__RESULT:
				setResult((Identifier)newValue);
				return;
			case DactPackage.DOMAIN_NODE__ENTITY:
				setEntity((Entity)newValue);
				return;
			case DactPackage.DOMAIN_NODE__MAIN_EXPR:
				getMainExpr().clear();
				getMainExpr().addAll((Collection<? extends Expression>)newValue);
				return;
			case DactPackage.DOMAIN_NODE__PROPERTY_CHAIN:
				getPropertyChain().clear();
				getPropertyChain().addAll((Collection<? extends Property>)newValue);
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
			case DactPackage.DOMAIN_NODE__AGGREGATE:
				setAggregate((AggregateRoot)null);
				return;
			case DactPackage.DOMAIN_NODE__RESULT:
				setResult((Identifier)null);
				return;
			case DactPackage.DOMAIN_NODE__ENTITY:
				setEntity((Entity)null);
				return;
			case DactPackage.DOMAIN_NODE__MAIN_EXPR:
				getMainExpr().clear();
				return;
			case DactPackage.DOMAIN_NODE__PROPERTY_CHAIN:
				getPropertyChain().clear();
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
			case DactPackage.DOMAIN_NODE__AGGREGATE:
				return aggregate != null;
			case DactPackage.DOMAIN_NODE__RESULT:
				return result != null;
			case DactPackage.DOMAIN_NODE__ENTITY:
				return entity != null;
			case DactPackage.DOMAIN_NODE__MAIN_EXPR:
				return mainExpr != null && !mainExpr.isEmpty();
			case DactPackage.DOMAIN_NODE__PROPERTY_CHAIN:
				return propertyChain != null && !propertyChain.isEmpty();
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
				case DactPackage.DIAGNOSTIC_SUPPORTED___REPORT__DIAGNOSTICCHAIN_STRING: return DactPackage.DOMAIN_NODE___REPORT__DIAGNOSTICCHAIN_STRING;
				case DactPackage.DIAGNOSTIC_SUPPORTED___WARN__DIAGNOSTICCHAIN_STRING: return DactPackage.DOMAIN_NODE___WARN__DIAGNOSTICCHAIN_STRING;
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
			case DactPackage.DOMAIN_NODE___REQUIRES_MAIN_EXPRESSION__DIAGNOSTICCHAIN_MAP:
				return RequiresMainExpression((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.DOMAIN_NODE___SELF_ANCHORED_BINARY_EXPRESSION__DIAGNOSTICCHAIN_MAP:
				return SelfAnchoredBinaryExpression((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DactPackage.DOMAIN_NODE___REPORT__DIAGNOSTICCHAIN_STRING:
				return report((DiagnosticChain)arguments.get(0), (String)arguments.get(1));
			case DactPackage.DOMAIN_NODE___WARN__DIAGNOSTICCHAIN_STRING:
				return warn((DiagnosticChain)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DomainNodeImpl

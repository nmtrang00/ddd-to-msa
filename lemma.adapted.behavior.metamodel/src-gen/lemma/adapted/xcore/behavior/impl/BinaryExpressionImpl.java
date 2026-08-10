/**
 */
package lemma.adapted.xcore.behavior.impl;

import lemma.adapted.xcore.behavior.BehaviorPackage;
import lemma.adapted.xcore.behavior.BinaryExpression;
import lemma.adapted.xcore.behavior.Expression;
import lemma.adapted.xcore.behavior.Operator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.BinaryExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.BinaryExpressionImpl#getLeftExpr <em>Left Expr</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.BinaryExpressionImpl#getRightExpr <em>Right Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryExpressionImpl extends ExpressionChildImpl implements BinaryExpression {
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator operator;

	/**
	 * The cached value of the '{@link #getLeftExpr() <em>Left Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression leftExpr;

	/**
	 * The cached value of the '{@link #getRightExpr() <em>Right Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression rightExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(Operator newOperator, NotificationChain msgs) {
		Operator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.BINARY_EXPRESSION__OPERATOR, oldOperator, newOperator);
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
	public void setOperator(Operator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.BINARY_EXPRESSION__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.BINARY_EXPRESSION__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BINARY_EXPRESSION__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getLeftExpr() {
		return leftExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftExpr(Expression newLeftExpr, NotificationChain msgs) {
		Expression oldLeftExpr = leftExpr;
		leftExpr = newLeftExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.BINARY_EXPRESSION__LEFT_EXPR, oldLeftExpr, newLeftExpr);
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
	public void setLeftExpr(Expression newLeftExpr) {
		if (newLeftExpr != leftExpr) {
			NotificationChain msgs = null;
			if (leftExpr != null)
				msgs = ((InternalEObject)leftExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.BINARY_EXPRESSION__LEFT_EXPR, null, msgs);
			if (newLeftExpr != null)
				msgs = ((InternalEObject)newLeftExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.BINARY_EXPRESSION__LEFT_EXPR, null, msgs);
			msgs = basicSetLeftExpr(newLeftExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BINARY_EXPRESSION__LEFT_EXPR, newLeftExpr, newLeftExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getRightExpr() {
		return rightExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightExpr(Expression newRightExpr, NotificationChain msgs) {
		Expression oldRightExpr = rightExpr;
		rightExpr = newRightExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.BINARY_EXPRESSION__RIGHT_EXPR, oldRightExpr, newRightExpr);
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
	public void setRightExpr(Expression newRightExpr) {
		if (newRightExpr != rightExpr) {
			NotificationChain msgs = null;
			if (rightExpr != null)
				msgs = ((InternalEObject)rightExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.BINARY_EXPRESSION__RIGHT_EXPR, null, msgs);
			if (newRightExpr != null)
				msgs = ((InternalEObject)newRightExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.BINARY_EXPRESSION__RIGHT_EXPR, null, msgs);
			msgs = basicSetRightExpr(newRightExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BINARY_EXPRESSION__RIGHT_EXPR, newRightExpr, newRightExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.BINARY_EXPRESSION__OPERATOR:
				return basicSetOperator(null, msgs);
			case BehaviorPackage.BINARY_EXPRESSION__LEFT_EXPR:
				return basicSetLeftExpr(null, msgs);
			case BehaviorPackage.BINARY_EXPRESSION__RIGHT_EXPR:
				return basicSetRightExpr(null, msgs);
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
			case BehaviorPackage.BINARY_EXPRESSION__OPERATOR:
				return getOperator();
			case BehaviorPackage.BINARY_EXPRESSION__LEFT_EXPR:
				return getLeftExpr();
			case BehaviorPackage.BINARY_EXPRESSION__RIGHT_EXPR:
				return getRightExpr();
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
			case BehaviorPackage.BINARY_EXPRESSION__OPERATOR:
				setOperator((Operator)newValue);
				return;
			case BehaviorPackage.BINARY_EXPRESSION__LEFT_EXPR:
				setLeftExpr((Expression)newValue);
				return;
			case BehaviorPackage.BINARY_EXPRESSION__RIGHT_EXPR:
				setRightExpr((Expression)newValue);
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
			case BehaviorPackage.BINARY_EXPRESSION__OPERATOR:
				setOperator((Operator)null);
				return;
			case BehaviorPackage.BINARY_EXPRESSION__LEFT_EXPR:
				setLeftExpr((Expression)null);
				return;
			case BehaviorPackage.BINARY_EXPRESSION__RIGHT_EXPR:
				setRightExpr((Expression)null);
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
			case BehaviorPackage.BINARY_EXPRESSION__OPERATOR:
				return operator != null;
			case BehaviorPackage.BINARY_EXPRESSION__LEFT_EXPR:
				return leftExpr != null;
			case BehaviorPackage.BINARY_EXPRESSION__RIGHT_EXPR:
				return rightExpr != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryExpressionImpl

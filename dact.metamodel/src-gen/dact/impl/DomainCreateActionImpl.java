/**
 */
package dact.impl;

import dact.BinaryExpression;
import dact.DactFactory;
import dact.DactPackage;
import dact.DomainCreateAction;
import dact.Expression;
import dact.Identifier;
import dact.UnaryExpression;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Create Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DomainCreateActionImpl extends DomainNodeImpl implements DomainCreateAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainCreateActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.Literals.DOMAIN_CREATE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void init() {
		final Expression expr = DactFactory.eINSTANCE.createExpression();
		expr.setName("Main");
		final BinaryExpression child = DactFactory.eINSTANCE.createBinaryExpression();
		child.setOperator(DactFactory.eINSTANCE.createEq());
		final Expression leftExpr = DactFactory.eINSTANCE.createExpression();
		final UnaryExpression leftExprChild = DactFactory.eINSTANCE.createUnaryExpression();
		leftExprChild.setIdentifier(DactFactory.eINSTANCE.createIdentifier());
		Identifier _identifier = leftExprChild.getIdentifier();
		_identifier.setName("EntityPath");
		leftExpr.setChild(leftExprChild);
		child.setLeftExpr(leftExpr);
		final Expression rightExpr = DactFactory.eINSTANCE.createExpression();
		final UnaryExpression rightExprChild = DactFactory.eINSTANCE.createUnaryExpression();
		rightExprChild.setIdentifier(DactFactory.eINSTANCE.createIdentifier());
		Identifier _identifier_1 = rightExprChild.getIdentifier();
		_identifier_1.setName("IdentifierToAssignHere");
		rightExpr.setChild(rightExprChild);
		child.setRightExpr(rightExpr);
		expr.setChild(child);
		this.getMainExpr().add(expr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DactPackage.DOMAIN_CREATE_ACTION___INIT:
				init();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DomainCreateActionImpl

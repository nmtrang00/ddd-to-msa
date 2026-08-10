/**
 */
package dact.impl;

import com.google.common.collect.Iterators;

import dact.BooleanType;
import dact.DactFactory;
import dact.DactPackage;
import dact.Expression;
import dact.InvariantOperation;
import dact.OperationType;
import dact.Parameter;
import dact.ParameterDirection;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invariant Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InvariantOperationImpl extends OperationImpl implements InvariantOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvariantOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.Literals.INVARIANT_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void init() {
		this.setName("isValid");
		this.setType(OperationType.D5_SPECIFICATION);
		this.setValidatesSpec(Boolean.valueOf(true));
		this.setSideEffectFree(Boolean.valueOf(true));
		final Expression expr = DactFactory.eINSTANCE.createExpression();
		String _name = this.getDomainObject().getName();
		String _plus = (_name + "Rule0");
		expr.setName(_plus);
		this.getValidatesSpecExpr().add(expr);
		final Parameter outParam = DactFactory.eINSTANCE.createParameter();
		outParam.setName("result");
		Resource _eResource = this.eResource();
		boolean _tripleNotEquals = (_eResource != null);
		if (_tripleNotEquals) {
			final BooleanType globalBoolean = IteratorExtensions.<BooleanType>head(Iterators.<BooleanType>filter(this.eResource().getAllContents(), BooleanType.class));
			if ((globalBoolean != null)) {
				outParam.setType(globalBoolean);
			}
		}
		outParam.setDirection(ParameterDirection.OUT);
		outParam.setLowerBound(Integer.valueOf(1));
		outParam.setUpperBound(Integer.valueOf(1));
		this.getOwnedParameters().add(outParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DactPackage.INVARIANT_OPERATION___INIT:
				init();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //InvariantOperationImpl

/**
 */
package lemma.adapted.xcore.behavior.util;

import lemma.adapted.xcore.behavior.*;

import lemma.adapted.xcore.data.DataOperation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see lemma.adapted.xcore.behavior.BehaviorPackage
 * @generated
 */
public class BehaviorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorSwitch() {
		if (modelPackage == null) {
			modelPackage = BehaviorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BehaviorPackage.BEHAVIOR_MODEL: {
				BehaviorModel behaviorModel = (BehaviorModel)theEObject;
				T result = caseBehaviorModel(behaviorModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.ACTIVITY_MODEL: {
				ActivityModel activityModel = (ActivityModel)theEObject;
				T result = caseActivityModel(activityModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.SPEC_DATA_OPERATION: {
				SpecDataOperation specDataOperation = (SpecDataOperation)theEObject;
				T result = caseSpecDataOperation(specDataOperation);
				if (result == null) result = caseDataOperation(specDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.SPEC_RULE: {
				SpecRule specRule = (SpecRule)theEObject;
				T result = caseSpecRule(specRule);
				if (result == null) result = caseNamedElement(specRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.IMPORTED_OPERATION: {
				ImportedOperation importedOperation = (ImportedOperation)theEObject;
				T result = caseImportedOperation(importedOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.IMPORTED_INTERFACE_OPERATION: {
				ImportedInterfaceOperation importedInterfaceOperation = (ImportedInterfaceOperation)theEObject;
				T result = caseImportedInterfaceOperation(importedInterfaceOperation);
				if (result == null) result = caseImportedOperation(importedInterfaceOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.IMPORTED_DATA_OPERATION: {
				ImportedDataOperation importedDataOperation = (ImportedDataOperation)theEObject;
				T result = caseImportedDataOperation(importedDataOperation);
				if (result == null) result = caseImportedOperation(importedDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.IMPORTED_PARAMETER: {
				ImportedParameter importedParameter = (ImportedParameter)theEObject;
				T result = caseImportedParameter(importedParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.IMPORTED_INTERFACE_PARAMETER: {
				ImportedInterfaceParameter importedInterfaceParameter = (ImportedInterfaceParameter)theEObject;
				T result = caseImportedInterfaceParameter(importedInterfaceParameter);
				if (result == null) result = caseImportedParameter(importedInterfaceParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.IMPORTED_DATA_PARAMETER: {
				ImportedDataParameter importedDataParameter = (ImportedDataParameter)theEObject;
				T result = caseImportedDataParameter(importedDataParameter);
				if (result == null) result = caseImportedParameter(importedDataParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.BEHAVIOR: {
				Behavior behavior = (Behavior)theEObject;
				T result = caseBehavior(behavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseNamedElement(activity);
				if (result == null) result = caseBehavior(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.SCOPE: {
				Scope scope = (Scope)theEObject;
				T result = caseScope(scope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.IDENTIFIER: {
				Identifier identifier = (Identifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = caseNamedElement(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.ACTIVITY_GROUP: {
				ActivityGroup activityGroup = (ActivityGroup)theEObject;
				T result = caseActivityGroup(activityGroup);
				if (result == null) result = caseNamedElement(activityGroup);
				if (result == null) result = caseScope(activityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseNamedElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.ACTIVITY_NODE: {
				ActivityNode activityNode = (ActivityNode)theEObject;
				T result = caseActivityNode(activityNode);
				if (result == null) result = caseNamedElement(activityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.ACTIVITY_EDGE: {
				ActivityEdge activityEdge = (ActivityEdge)theEObject;
				T result = caseActivityEdge(activityEdge);
				if (result == null) result = caseNamedElement(activityEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.INITIAL_NODE: {
				InitialNode initialNode = (InitialNode)theEObject;
				T result = caseInitialNode(initialNode);
				if (result == null) result = caseControlNode(initialNode);
				if (result == null) result = caseActivityNode(initialNode);
				if (result == null) result = caseNamedElement(initialNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.CONTROL_NODE: {
				ControlNode controlNode = (ControlNode)theEObject;
				T result = caseControlNode(controlNode);
				if (result == null) result = caseActivityNode(controlNode);
				if (result == null) result = caseNamedElement(controlNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.EXECUTABLE_NODE: {
				ExecutableNode executableNode = (ExecutableNode)theEObject;
				T result = caseExecutableNode(executableNode);
				if (result == null) result = caseActivityNode(executableNode);
				if (result == null) result = caseNamedElement(executableNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.FINAL_NODE: {
				FinalNode finalNode = (FinalNode)theEObject;
				T result = caseFinalNode(finalNode);
				if (result == null) result = caseControlNode(finalNode);
				if (result == null) result = caseActivityNode(finalNode);
				if (result == null) result = caseNamedElement(finalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.ACTIVITY_FINAL_NODE: {
				ActivityFinalNode activityFinalNode = (ActivityFinalNode)theEObject;
				T result = caseActivityFinalNode(activityFinalNode);
				if (result == null) result = caseFinalNode(activityFinalNode);
				if (result == null) result = caseControlNode(activityFinalNode);
				if (result == null) result = caseActivityNode(activityFinalNode);
				if (result == null) result = caseNamedElement(activityFinalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.FLOW_FINAL_NODE: {
				FlowFinalNode flowFinalNode = (FlowFinalNode)theEObject;
				T result = caseFlowFinalNode(flowFinalNode);
				if (result == null) result = caseFinalNode(flowFinalNode);
				if (result == null) result = caseControlNode(flowFinalNode);
				if (result == null) result = caseActivityNode(flowFinalNode);
				if (result == null) result = caseNamedElement(flowFinalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.STRUCTURED_ACTIVITY_NODE: {
				StructuredActivityNode structuredActivityNode = (StructuredActivityNode)theEObject;
				T result = caseStructuredActivityNode(structuredActivityNode);
				if (result == null) result = caseControlNode(structuredActivityNode);
				if (result == null) result = caseActivityNode(structuredActivityNode);
				if (result == null) result = caseNamedElement(structuredActivityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.CONDITIONAL_NODE: {
				ConditionalNode conditionalNode = (ConditionalNode)theEObject;
				T result = caseConditionalNode(conditionalNode);
				if (result == null) result = caseStructuredActivityNode(conditionalNode);
				if (result == null) result = caseControlNode(conditionalNode);
				if (result == null) result = caseActivityNode(conditionalNode);
				if (result == null) result = caseNamedElement(conditionalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.LOOP_NODE: {
				LoopNode loopNode = (LoopNode)theEObject;
				T result = caseLoopNode(loopNode);
				if (result == null) result = caseStructuredActivityNode(loopNode);
				if (result == null) result = caseControlNode(loopNode);
				if (result == null) result = caseActivityNode(loopNode);
				if (result == null) result = caseNamedElement(loopNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.CALL_OPERATION_ACTION: {
				CallOperationAction callOperationAction = (CallOperationAction)theEObject;
				T result = caseCallOperationAction(callOperationAction);
				if (result == null) result = caseExecutableNode(callOperationAction);
				if (result == null) result = caseActivityNode(callOperationAction);
				if (result == null) result = caseNamedElement(callOperationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION: {
				VariableDeclarationAction variableDeclarationAction = (VariableDeclarationAction)theEObject;
				T result = caseVariableDeclarationAction(variableDeclarationAction);
				if (result == null) result = caseExecutableNode(variableDeclarationAction);
				if (result == null) result = caseActivityNode(variableDeclarationAction);
				if (result == null) result = caseNamedElement(variableDeclarationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.VARIABLE_ASSIGNMENT_ACTION: {
				VariableAssignmentAction variableAssignmentAction = (VariableAssignmentAction)theEObject;
				T result = caseVariableAssignmentAction(variableAssignmentAction);
				if (result == null) result = caseExecutableNode(variableAssignmentAction);
				if (result == null) result = caseActivityNode(variableAssignmentAction);
				if (result == null) result = caseNamedElement(variableAssignmentAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.VARIABLE_ASSIGNMENT: {
				VariableAssignment variableAssignment = (VariableAssignment)theEObject;
				T result = caseVariableAssignment(variableAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.RAISE_EXCEPTION_ACTION: {
				RaiseExceptionAction raiseExceptionAction = (RaiseExceptionAction)theEObject;
				T result = caseRaiseExceptionAction(raiseExceptionAction);
				if (result == null) result = caseExecutableNode(raiseExceptionAction);
				if (result == null) result = caseActivityNode(raiseExceptionAction);
				if (result == null) result = caseNamedElement(raiseExceptionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION: {
				RaiseEntityNotFoundExceptionAction raiseEntityNotFoundExceptionAction = (RaiseEntityNotFoundExceptionAction)theEObject;
				T result = caseRaiseEntityNotFoundExceptionAction(raiseEntityNotFoundExceptionAction);
				if (result == null) result = caseRaiseExceptionAction(raiseEntityNotFoundExceptionAction);
				if (result == null) result = caseExecutableNode(raiseEntityNotFoundExceptionAction);
				if (result == null) result = caseActivityNode(raiseEntityNotFoundExceptionAction);
				if (result == null) result = caseNamedElement(raiseEntityNotFoundExceptionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.SEND_SIGNAL_ACTION: {
				SendSignalAction sendSignalAction = (SendSignalAction)theEObject;
				T result = caseSendSignalAction(sendSignalAction);
				if (result == null) result = caseSignalAction(sendSignalAction);
				if (result == null) result = caseExecutableNode(sendSignalAction);
				if (result == null) result = caseActivityNode(sendSignalAction);
				if (result == null) result = caseNamedElement(sendSignalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.RECEIVE_SIGNAL_ACTION: {
				ReceiveSignalAction receiveSignalAction = (ReceiveSignalAction)theEObject;
				T result = caseReceiveSignalAction(receiveSignalAction);
				if (result == null) result = caseSignalAction(receiveSignalAction);
				if (result == null) result = caseExecutableNode(receiveSignalAction);
				if (result == null) result = caseActivityNode(receiveSignalAction);
				if (result == null) result = caseNamedElement(receiveSignalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.PARALLEL_NODE: {
				ParallelNode parallelNode = (ParallelNode)theEObject;
				T result = caseParallelNode(parallelNode);
				if (result == null) result = caseControlNode(parallelNode);
				if (result == null) result = caseActivityNode(parallelNode);
				if (result == null) result = caseNamedElement(parallelNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.SIGNAL_ACTION: {
				SignalAction signalAction = (SignalAction)theEObject;
				T result = caseSignalAction(signalAction);
				if (result == null) result = caseExecutableNode(signalAction);
				if (result == null) result = caseActivityNode(signalAction);
				if (result == null) result = caseNamedElement(signalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.PARAMETER_MAPPING: {
				ParameterMapping parameterMapping = (ParameterMapping)theEObject;
				T result = caseParameterMapping(parameterMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseNamedElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = caseNamedElement(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				T result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseExpression(binaryExpression);
				if (result == null) result = caseNamedElement(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.NOT_EXPRESSION: {
				NotExpression notExpression = (NotExpression)theEObject;
				T result = caseNotExpression(notExpression);
				if (result == null) result = caseExpression(notExpression);
				if (result == null) result = caseNamedElement(notExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.INTEGER_OPERATOR: {
				IntegerOperator integerOperator = (IntegerOperator)theEObject;
				T result = caseIntegerOperator(integerOperator);
				if (result == null) result = caseOperator(integerOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.DIVIDE: {
				Divide divide = (Divide)theEObject;
				T result = caseDivide(divide);
				if (result == null) result = caseIntegerOperator(divide);
				if (result == null) result = caseOperator(divide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.TIMES: {
				Times times = (Times)theEObject;
				T result = caseTimes(times);
				if (result == null) result = caseIntegerOperator(times);
				if (result == null) result = caseOperator(times);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.PLUS: {
				Plus plus = (Plus)theEObject;
				T result = casePlus(plus);
				if (result == null) result = caseIntegerOperator(plus);
				if (result == null) result = caseOperator(plus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.MINUS: {
				Minus minus = (Minus)theEObject;
				T result = caseMinus(minus);
				if (result == null) result = caseIntegerOperator(minus);
				if (result == null) result = caseOperator(minus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.LOGICAL_OPERATOR: {
				LogicalOperator logicalOperator = (LogicalOperator)theEObject;
				T result = caseLogicalOperator(logicalOperator);
				if (result == null) result = caseOperator(logicalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.GT: {
				Gt gt = (Gt)theEObject;
				T result = caseGt(gt);
				if (result == null) result = caseLogicalOperator(gt);
				if (result == null) result = caseOperator(gt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.LT: {
				Lt lt = (Lt)theEObject;
				T result = caseLt(lt);
				if (result == null) result = caseLogicalOperator(lt);
				if (result == null) result = caseOperator(lt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.GE: {
				Ge ge = (Ge)theEObject;
				T result = caseGe(ge);
				if (result == null) result = caseLogicalOperator(ge);
				if (result == null) result = caseOperator(ge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.LE: {
				Le le = (Le)theEObject;
				T result = caseLe(le);
				if (result == null) result = caseLogicalOperator(le);
				if (result == null) result = caseOperator(le);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.EQ: {
				Eq eq = (Eq)theEObject;
				T result = caseEq(eq);
				if (result == null) result = caseLogicalOperator(eq);
				if (result == null) result = caseOperator(eq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.NE: {
				Ne ne = (Ne)theEObject;
				T result = caseNe(ne);
				if (result == null) result = caseLogicalOperator(ne);
				if (result == null) result = caseOperator(ne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseLogicalOperator(and);
				if (result == null) result = caseOperator(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseLogicalOperator(or);
				if (result == null) result = caseOperator(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.TYPED_MULTIPLICITY_ELEMENT: {
				TypedMultiplicityElement typedMultiplicityElement = (TypedMultiplicityElement)theEObject;
				T result = caseTypedMultiplicityElement(typedMultiplicityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorModel(BehaviorModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityModel(ActivityModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Data Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecDataOperation(SpecDataOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecRule(SpecRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imported Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imported Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportedOperation(ImportedOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imported Interface Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imported Interface Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportedInterfaceOperation(ImportedInterfaceOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imported Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imported Data Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportedDataOperation(ImportedDataOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imported Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imported Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportedParameter(ImportedParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imported Interface Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imported Interface Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportedInterfaceParameter(ImportedInterfaceParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imported Data Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imported Data Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportedDataParameter(ImportedDataParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScope(Scope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityGroup(ActivityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode(ActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdge(ActivityEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialNode(InitialNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlNode(ControlNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableNode(ExecutableNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalNode(FinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityFinalNode(ActivityFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowFinalNode(FlowFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredActivityNode(StructuredActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalNode(ConditionalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopNode(LoopNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Operation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallOperationAction(CallOperationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationAction(VariableDeclarationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Assignment Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Assignment Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableAssignmentAction(VariableAssignmentAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableAssignment(VariableAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raise Exception Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raise Exception Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaiseExceptionAction(RaiseExceptionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raise Entity Not Found Exception Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raise Entity Not Found Exception Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaiseEntityNotFoundExceptionAction(RaiseEntityNotFoundExceptionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Signal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendSignalAction(SendSignalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Signal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveSignalAction(ReceiveSignalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelNode(ParallelNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalAction(SignalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterMapping(ParameterMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotExpression(NotExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerOperator(IntegerOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivide(Divide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Times</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Times</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimes(Times object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlus(Plus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinus(Minus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalOperator(LogicalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGt(Gt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLt(Lt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGe(Ge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Le</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Le</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLe(Le object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEq(Eq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe(Ne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedMultiplicityElement(TypedMultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataOperation(DataOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BehaviorSwitch

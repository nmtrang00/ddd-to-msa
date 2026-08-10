/**
 */
package lemma.adapted.xcore.behavior.impl;

import lemma.adapted.xcore.behavior.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorFactoryImpl extends EFactoryImpl implements BehaviorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorFactory init() {
		try {
			BehaviorFactory theBehaviorFactory = (BehaviorFactory)EPackage.Registry.INSTANCE.getEFactory(BehaviorPackage.eNS_URI);
			if (theBehaviorFactory != null) {
				return theBehaviorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BehaviorPackage.BEHAVIOR_MODEL: return createBehaviorModel();
			case BehaviorPackage.ACTIVITY_MODEL: return createActivityModel();
			case BehaviorPackage.INVARIANT_DATA_OPERATION: return createInvariantDataOperation();
			case BehaviorPackage.IMPORTED_INTERFACE_OPERATION: return createImportedInterfaceOperation();
			case BehaviorPackage.IMPORTED_DATA_OPERATION: return createImportedDataOperation();
			case BehaviorPackage.IMPORTED_INTERFACE_PARAMETER: return createImportedInterfaceParameter();
			case BehaviorPackage.IMPORTED_DATA_PARAMETER: return createImportedDataParameter();
			case BehaviorPackage.ACTIVITY: return createActivity();
			case BehaviorPackage.SCOPE: return createScope();
			case BehaviorPackage.IDENTIFIER: return createIdentifier();
			case BehaviorPackage.ACTIVITY_GROUP: return createActivityGroup();
			case BehaviorPackage.VARIABLE: return createVariable();
			case BehaviorPackage.ACTIVITY_EDGE: return createActivityEdge();
			case BehaviorPackage.INITIAL_NODE: return createInitialNode();
			case BehaviorPackage.ACTIVITY_FINAL_NODE: return createActivityFinalNode();
			case BehaviorPackage.FLOW_FINAL_NODE: return createFlowFinalNode();
			case BehaviorPackage.STRUCTURED_ACTIVITY_NODE: return createStructuredActivityNode();
			case BehaviorPackage.CONDITIONAL_NODE: return createConditionalNode();
			case BehaviorPackage.LOOP_NODE: return createLoopNode();
			case BehaviorPackage.CALL_OPERATION_ACTION: return createCallOperationAction();
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION: return createVariableDeclarationAction();
			case BehaviorPackage.VARIABLE_ASSIGNMENT_ACTION: return createVariableAssignmentAction();
			case BehaviorPackage.VARIABLE_ASSIGNMENT: return createVariableAssignment();
			case BehaviorPackage.RAISE_EXCEPTION_ACTION: return createRaiseExceptionAction();
			case BehaviorPackage.RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION: return createRaiseEntityNotFoundExceptionAction();
			case BehaviorPackage.SEND_SIGNAL_ACTION: return createSendSignalAction();
			case BehaviorPackage.RECEIVE_SIGNAL_ACTION: return createReceiveSignalAction();
			case BehaviorPackage.PARALLEL_NODE: return createParallelNode();
			case BehaviorPackage.PARAMETER_MAPPING: return createParameterMapping();
			case BehaviorPackage.EXPRESSION: return createExpression();
			case BehaviorPackage.UNARY_EXPRESSION: return createUnaryExpression();
			case BehaviorPackage.BINARY_EXPRESSION: return createBinaryExpression();
			case BehaviorPackage.NOT_EXPRESSION: return createNotExpression();
			case BehaviorPackage.DIVIDE: return createDivide();
			case BehaviorPackage.TIMES: return createTimes();
			case BehaviorPackage.PLUS: return createPlus();
			case BehaviorPackage.MINUS: return createMinus();
			case BehaviorPackage.GT: return createGt();
			case BehaviorPackage.LT: return createLt();
			case BehaviorPackage.GE: return createGe();
			case BehaviorPackage.LE: return createLe();
			case BehaviorPackage.EQ: return createEq();
			case BehaviorPackage.NE: return createNe();
			case BehaviorPackage.AND: return createAnd();
			case BehaviorPackage.OR: return createOr();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BehaviorPackage.PARAMETER_MAPPING_TYPE:
				return createParameterMappingTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BehaviorPackage.PARAMETER_MAPPING_TYPE:
				return convertParameterMappingTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviorModel createBehaviorModel() {
		BehaviorModelImpl behaviorModel = new BehaviorModelImpl();
		return behaviorModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityModel createActivityModel() {
		ActivityModelImpl activityModel = new ActivityModelImpl();
		return activityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvariantDataOperation createInvariantDataOperation() {
		InvariantDataOperationImpl invariantDataOperation = new InvariantDataOperationImpl();
		return invariantDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportedInterfaceOperation createImportedInterfaceOperation() {
		ImportedInterfaceOperationImpl importedInterfaceOperation = new ImportedInterfaceOperationImpl();
		return importedInterfaceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportedDataOperation createImportedDataOperation() {
		ImportedDataOperationImpl importedDataOperation = new ImportedDataOperationImpl();
		return importedDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportedInterfaceParameter createImportedInterfaceParameter() {
		ImportedInterfaceParameterImpl importedInterfaceParameter = new ImportedInterfaceParameterImpl();
		return importedInterfaceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportedDataParameter createImportedDataParameter() {
		ImportedDataParameterImpl importedDataParameter = new ImportedDataParameterImpl();
		return importedDataParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scope createScope() {
		ScopeImpl scope = new ScopeImpl();
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier createIdentifier() {
		IdentifierImpl identifier = new IdentifierImpl();
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityGroup createActivityGroup() {
		ActivityGroupImpl activityGroup = new ActivityGroupImpl();
		return activityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityEdge createActivityEdge() {
		ActivityEdgeImpl activityEdge = new ActivityEdgeImpl();
		return activityEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialNode createInitialNode() {
		InitialNodeImpl initialNode = new InitialNodeImpl();
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityFinalNode createActivityFinalNode() {
		ActivityFinalNodeImpl activityFinalNode = new ActivityFinalNodeImpl();
		return activityFinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowFinalNode createFlowFinalNode() {
		FlowFinalNodeImpl flowFinalNode = new FlowFinalNodeImpl();
		return flowFinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuredActivityNode createStructuredActivityNode() {
		StructuredActivityNodeImpl structuredActivityNode = new StructuredActivityNodeImpl();
		return structuredActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalNode createConditionalNode() {
		ConditionalNodeImpl conditionalNode = new ConditionalNodeImpl();
		return conditionalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoopNode createLoopNode() {
		LoopNodeImpl loopNode = new LoopNodeImpl();
		return loopNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallOperationAction createCallOperationAction() {
		CallOperationActionImpl callOperationAction = new CallOperationActionImpl();
		return callOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationAction createVariableDeclarationAction() {
		VariableDeclarationActionImpl variableDeclarationAction = new VariableDeclarationActionImpl();
		return variableDeclarationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableAssignmentAction createVariableAssignmentAction() {
		VariableAssignmentActionImpl variableAssignmentAction = new VariableAssignmentActionImpl();
		return variableAssignmentAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableAssignment createVariableAssignment() {
		VariableAssignmentImpl variableAssignment = new VariableAssignmentImpl();
		return variableAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RaiseExceptionAction createRaiseExceptionAction() {
		RaiseExceptionActionImpl raiseExceptionAction = new RaiseExceptionActionImpl();
		return raiseExceptionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RaiseEntityNotFoundExceptionAction createRaiseEntityNotFoundExceptionAction() {
		RaiseEntityNotFoundExceptionActionImpl raiseEntityNotFoundExceptionAction = new RaiseEntityNotFoundExceptionActionImpl();
		return raiseEntityNotFoundExceptionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SendSignalAction createSendSignalAction() {
		SendSignalActionImpl sendSignalAction = new SendSignalActionImpl();
		return sendSignalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReceiveSignalAction createReceiveSignalAction() {
		ReceiveSignalActionImpl receiveSignalAction = new ReceiveSignalActionImpl();
		return receiveSignalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParallelNode createParallelNode() {
		ParallelNodeImpl parallelNode = new ParallelNodeImpl();
		return parallelNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterMapping createParameterMapping() {
		ParameterMappingImpl parameterMapping = new ParameterMappingImpl();
		return parameterMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotExpression createNotExpression() {
		NotExpressionImpl notExpression = new NotExpressionImpl();
		return notExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Divide createDivide() {
		DivideImpl divide = new DivideImpl();
		return divide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Times createTimes() {
		TimesImpl times = new TimesImpl();
		return times;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gt createGt() {
		GtImpl gt = new GtImpl();
		return gt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lt createLt() {
		LtImpl lt = new LtImpl();
		return lt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ge createGe() {
		GeImpl ge = new GeImpl();
		return ge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Le createLe() {
		LeImpl le = new LeImpl();
		return le;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Eq createEq() {
		EqImpl eq = new EqImpl();
		return eq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne createNe() {
		NeImpl ne = new NeImpl();
		return ne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMappingType createParameterMappingTypeFromString(EDataType eDataType, String initialValue) {
		ParameterMappingType result = ParameterMappingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterMappingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviorPackage getBehaviorPackage() {
		return (BehaviorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviorPackage getPackage() {
		return BehaviorPackage.eINSTANCE;
	}

} //BehaviorFactoryImpl

/**
 */
package dact.util;

import dact.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see dact.DactPackage
 * @generated
 */
public class DactValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DactValidator INSTANCE = new DactValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "dact";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Primitive Type' of 'Root'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROOT__UNIQUE_PRIMITIVE_TYPE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Mandatory Type' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__MANDATORY_TYPE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Composite Requires Entity' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__COMPOSITE_REQUIRES_ENTITY = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Aggregate Is Not Composed' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__AGGREGATE_IS_NOT_COMPOSED = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Primitive Property Requires Name' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__PRIMITIVE_PROPERTY_REQUIRES_NAME = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Behavior Xor Specification' of 'Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION__BEHAVIOR_XOR_SPECIFICATION = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Matched Parameter Mappings' of 'Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY__MATCHED_PARAMETER_MAPPINGS = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Self Anchored Binary Expression' of 'Domain Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DOMAIN_NODE__SELF_ANCHORED_BINARY_EXPRESSION = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Exclusive Event Source' of 'Signal Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIGNAL_ACTION__EXCLUSIVE_EVENT_SOURCE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Conforming Activity Operation Parameter' of 'Parameter Mapping'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARAMETER_MAPPING__CONFORMING_ACTIVITY_OPERATION_PARAMETER = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Exclusive Mapping Source' of 'Parameter Mapping'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARAMETER_MAPPING__EXCLUSIVE_MAPPING_SOURCE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Value Only In Action' of 'Parameter Mapping'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARAMETER_MAPPING__VALUE_ONLY_IN_ACTION = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DactValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DactPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DactPackage.DIAGNOSTIC_SUPPORTED:
				return validateDiagnosticSupported((DiagnosticSupported)value, diagnostics, context);
			case DactPackage.ROOT:
				return validateRoot((Root)value, diagnostics, context);
			case DactPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case DactPackage.TYPED_MULTIPLICITY_ELEMENT:
				return validateTypedMultiplicityElement((TypedMultiplicityElement)value, diagnostics, context);
			case DactPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case DactPackage.DDD_MODEL:
				return validateDddModel((DddModel)value, diagnostics, context);
			case DactPackage.ACTIVITY_MODEL:
				return validateActivityModel((ActivityModel)value, diagnostics, context);
			case DactPackage.DOMAIN_NODE_OPERATION_MAPPING:
				return validateDomainNodeOperationMapping((DomainNodeOperationMapping)value, diagnostics, context);
			case DactPackage.BOUNDED_CONTEXT:
				return validateBoundedContext((BoundedContext)value, diagnostics, context);
			case DactPackage.DOMAIN_ELEMENT:
				return validateDomainElement((DomainElement)value, diagnostics, context);
			case DactPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case DactPackage.VALUE_OBJECT:
				return validateValueObject((ValueObject)value, diagnostics, context);
			case DactPackage.SHARED_VALUE_OBJECT:
				return validateSharedValueObject((SharedValueObject)value, diagnostics, context);
			case DactPackage.AGGREGATE_ROOT:
				return validateAggregateRoot((AggregateRoot)value, diagnostics, context);
			case DactPackage.REPOSITORY:
				return validateRepository((Repository)value, diagnostics, context);
			case DactPackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case DactPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case DactPackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case DactPackage.INVARIANT_OPERATION:
				return validateInvariantOperation((InvariantOperation)value, diagnostics, context);
			case DactPackage.INTERNAL_DOMAIN_OBJECT:
				return validateInternalDomainObject((InternalDomainObject)value, diagnostics, context);
			case DactPackage.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case DactPackage.DEFINES_IDENTITY_OBJECT:
				return validateDefinesIdentityObject((DefinesIdentityObject)value, diagnostics, context);
			case DactPackage.DOMAIN_OBJECT:
				return validateDomainObject((DomainObject)value, diagnostics, context);
			case DactPackage.SHARED_DOMAIN_OBJECT:
				return validateSharedDomainObject((SharedDomainObject)value, diagnostics, context);
			case DactPackage.PRIMITIVE_TYPE:
				return validatePrimitiveType((PrimitiveType)value, diagnostics, context);
			case DactPackage.STRING_TYPE:
				return validateStringType((StringType)value, diagnostics, context);
			case DactPackage.BOOLEAN_TYPE:
				return validateBooleanType((BooleanType)value, diagnostics, context);
			case DactPackage.INTEGER_TYPE:
				return validateIntegerType((IntegerType)value, diagnostics, context);
			case DactPackage.REAL_TYPE:
				return validateRealType((RealType)value, diagnostics, context);
			case DactPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case DactPackage.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			case DactPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case DactPackage.ENUMERATION_LITERAL:
				return validateEnumerationLiteral((EnumerationLiteral)value, diagnostics, context);
			case DactPackage.LITERAL:
				return validateLiteral((Literal)value, diagnostics, context);
			case DactPackage.LITERAL_NULL:
				return validateLiteralNull((LiteralNull)value, diagnostics, context);
			case DactPackage.LITERAL_STRING:
				return validateLiteralString((LiteralString)value, diagnostics, context);
			case DactPackage.LITERAL_INTEGER:
				return validateLiteralInteger((LiteralInteger)value, diagnostics, context);
			case DactPackage.LITERAL_BOOLEAN:
				return validateLiteralBoolean((LiteralBoolean)value, diagnostics, context);
			case DactPackage.LITERAL_REAL:
				return validateLiteralReal((LiteralReal)value, diagnostics, context);
			case DactPackage.DOMAIN_EVENT:
				return validateDomainEvent((DomainEvent)value, diagnostics, context);
			case DactPackage.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case DactPackage.SCOPE:
				return validateScope((Scope)value, diagnostics, context);
			case DactPackage.IDENTIFIER:
				return validateIdentifier((Identifier)value, diagnostics, context);
			case DactPackage.ACTIVITY_GROUP:
				return validateActivityGroup((ActivityGroup)value, diagnostics, context);
			case DactPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case DactPackage.INSTANCE_VALUE:
				return validateInstanceValue((InstanceValue)value, diagnostics, context);
			case DactPackage.INSTANCE_PROPERTY:
				return validateInstanceProperty((InstanceProperty)value, diagnostics, context);
			case DactPackage.VALUE_SPECIFICATION:
				return validateValueSpecification((ValueSpecification)value, diagnostics, context);
			case DactPackage.ACTIVITY_NODE:
				return validateActivityNode((ActivityNode)value, diagnostics, context);
			case DactPackage.ACTIVITY_EDGE:
				return validateActivityEdge((ActivityEdge)value, diagnostics, context);
			case DactPackage.INITIAL_NODE:
				return validateInitialNode((InitialNode)value, diagnostics, context);
			case DactPackage.CONTROL_NODE:
				return validateControlNode((ControlNode)value, diagnostics, context);
			case DactPackage.EXECUTABLE_NODE:
				return validateExecutableNode((ExecutableNode)value, diagnostics, context);
			case DactPackage.FINAL_NODE:
				return validateFinalNode((FinalNode)value, diagnostics, context);
			case DactPackage.ACTIVITY_FINAL_NODE:
				return validateActivityFinalNode((ActivityFinalNode)value, diagnostics, context);
			case DactPackage.FLOW_FINAL_NODE:
				return validateFlowFinalNode((FlowFinalNode)value, diagnostics, context);
			case DactPackage.STRUCTURED_ACTIVITY_NODE:
				return validateStructuredActivityNode((StructuredActivityNode)value, diagnostics, context);
			case DactPackage.CONDITIONAL_NODE:
				return validateConditionalNode((ConditionalNode)value, diagnostics, context);
			case DactPackage.LOOP_NODE:
				return validateLoopNode((LoopNode)value, diagnostics, context);
			case DactPackage.OCL_EXPRESSION:
				return validateOCLExpression((OCLExpression)value, diagnostics, context);
			case DactPackage.BEHAVIOR:
				return validateBehavior((Behavior)value, diagnostics, context);
			case DactPackage.CALL_OPERATION_ACTION:
				return validateCallOperationAction((CallOperationAction)value, diagnostics, context);
			case DactPackage.VARIABLE_DECLARATION_ACTION:
				return validateVariableDeclarationAction((VariableDeclarationAction)value, diagnostics, context);
			case DactPackage.VARIABLE_ASSIGNMENT:
				return validateVariableAssignment((VariableAssignment)value, diagnostics, context);
			case DactPackage.RAISE_EXCEPTION_ACTION:
				return validateRaiseExceptionAction((RaiseExceptionAction)value, diagnostics, context);
			case DactPackage.RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION:
				return validateRaiseEntityNotFoundExceptionAction((RaiseEntityNotFoundExceptionAction)value, diagnostics, context);
			case DactPackage.SEND_SIGNAL_ACTION:
				return validateSendSignalAction((SendSignalAction)value, diagnostics, context);
			case DactPackage.RECEIVE_SIGNAL_ACTION:
				return validateReceiveSignalAction((ReceiveSignalAction)value, diagnostics, context);
			case DactPackage.VARIABLE_ASSIGNMENT_ACTION:
				return validateVariableAssignmentAction((VariableAssignmentAction)value, diagnostics, context);
			case DactPackage.PARALLEL_NODE:
				return validateParallelNode((ParallelNode)value, diagnostics, context);
			case DactPackage.DOMAIN_NODE:
				return validateDomainNode((DomainNode)value, diagnostics, context);
			case DactPackage.DOMAIN_EXIST_ACTION:
				return validateDomainExistAction((DomainExistAction)value, diagnostics, context);
			case DactPackage.DOMAIN_FIND_ACTION:
				return validateDomainFindAction((DomainFindAction)value, diagnostics, context);
			case DactPackage.DOMAIN_CREATE_ACTION:
				return validateDomainCreateAction((DomainCreateAction)value, diagnostics, context);
			case DactPackage.DOMAIN_UPDATE_ACTION:
				return validateDomainUpdateAction((DomainUpdateAction)value, diagnostics, context);
			case DactPackage.DOMAIN_DELETE_ACTION:
				return validateDomainDeleteAction((DomainDeleteAction)value, diagnostics, context);
			case DactPackage.SIGNAL_ACTION:
				return validateSignalAction((SignalAction)value, diagnostics, context);
			case DactPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case DactPackage.PARAMETER_MAPPING:
				return validateParameterMapping((ParameterMapping)value, diagnostics, context);
			case DactPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case DactPackage.EXPRESSION_CHILD:
				return validateExpressionChild((ExpressionChild)value, diagnostics, context);
			case DactPackage.UNARY_EXPRESSION:
				return validateUnaryExpression((UnaryExpression)value, diagnostics, context);
			case DactPackage.BINARY_EXPRESSION:
				return validateBinaryExpression((BinaryExpression)value, diagnostics, context);
			case DactPackage.NOT_EXPRESSION:
				return validateNotExpression((NotExpression)value, diagnostics, context);
			case DactPackage.OPERATOR:
				return validateOperator((Operator)value, diagnostics, context);
			case DactPackage.INTEGER_OPERATOR:
				return validateIntegerOperator((IntegerOperator)value, diagnostics, context);
			case DactPackage.DIVIDE:
				return validateDivide((Divide)value, diagnostics, context);
			case DactPackage.TIMES:
				return validateTimes((Times)value, diagnostics, context);
			case DactPackage.PLUS:
				return validatePlus((Plus)value, diagnostics, context);
			case DactPackage.MINUS:
				return validateMinus((Minus)value, diagnostics, context);
			case DactPackage.LOGICAL_OPERATOR:
				return validateLogicalOperator((LogicalOperator)value, diagnostics, context);
			case DactPackage.GT:
				return validateGt((Gt)value, diagnostics, context);
			case DactPackage.LT:
				return validateLt((Lt)value, diagnostics, context);
			case DactPackage.GE:
				return validateGe((Ge)value, diagnostics, context);
			case DactPackage.LE:
				return validateLe((Le)value, diagnostics, context);
			case DactPackage.EQ:
				return validateEq((Eq)value, diagnostics, context);
			case DactPackage.NE:
				return validateNe((Ne)value, diagnostics, context);
			case DactPackage.AND:
				return validateAnd((And)value, diagnostics, context);
			case DactPackage.OR:
				return validateOr((Or)value, diagnostics, context);
			case DactPackage.OPERATION_TYPE:
				return validateOperationType((OperationType)value, diagnostics, context);
			case DactPackage.PARAMETER_DIRECTION:
				return validateParameterDirection((ParameterDirection)value, diagnostics, context);
			case DactPackage.PARAMETER_ROLE:
				return validateParameterRole((ParameterRole)value, diagnostics, context);
			case DactPackage.PARAMETER_MAPPING_TYPE:
				return validateParameterMappingType((ParameterMappingType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticSupported(DiagnosticSupported diagnosticSupported, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticSupported, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoot(Root root, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(root, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(root, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoot_UniquePrimitiveType(root, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniquePrimitiveType constraint of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoot_UniquePrimitiveType(Root root, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return root.UniquePrimitiveType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedMultiplicityElement(TypedMultiplicityElement typedMultiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typedMultiplicityElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(model, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDddModel(DddModel dddModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dddModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityModel(ActivityModel activityModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainNodeOperationMapping(DomainNodeOperationMapping domainNodeOperationMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainNodeOperationMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundedContext(BoundedContext boundedContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundedContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainElement(DomainElement domainElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueObject(ValueObject valueObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSharedValueObject(SharedValueObject sharedValueObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sharedValueObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregateRoot(AggregateRoot aggregateRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregateRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepository(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(service, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(property, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_MandatoryType(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_CompositeRequiresEntity(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_AggregateIsNotComposed(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_PrimitivePropertyRequiresName(property, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MandatoryType constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_MandatoryType(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return property.MandatoryType(diagnostics, context);
	}

	/**
	 * Validates the CompositeRequiresEntity constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_CompositeRequiresEntity(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return property.CompositeRequiresEntity(diagnostics, context);
	}

	/**
	 * Validates the AggregateIsNotComposed constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_AggregateIsNotComposed(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return property.AggregateIsNotComposed(diagnostics, context);
	}

	/**
	 * Validates the PrimitivePropertyRequiresName constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_PrimitivePropertyRequiresName(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return property.PrimitivePropertyRequiresName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_BehaviorXorSpecification(operation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the BehaviorXorSpecification constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_BehaviorXorSpecification(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return operation.BehaviorXorSpecification(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvariantOperation(InvariantOperation invariantOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(invariantOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(invariantOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(invariantOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(invariantOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(invariantOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(invariantOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(invariantOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(invariantOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(invariantOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_BehaviorXorSpecification(invariantOperation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalDomainObject(InternalDomainObject internalDomainObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(internalDomainObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interface_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinesIdentityObject(DefinesIdentityObject definesIdentityObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definesIdentityObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainObject(DomainObject domainObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSharedDomainObject(SharedDomainObject sharedDomainObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sharedDomainObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveType(PrimitiveType primitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primitiveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringType(StringType stringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanType(BooleanType booleanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerType(IntegerType integerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealType(RealType realType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumeration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationLiteral(EnumerationLiteral enumerationLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteral(Literal literal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralNull(LiteralNull literalNull, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literalNull, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralString(LiteralString literalString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literalString, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralInteger(LiteralInteger literalInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literalInteger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralBoolean(LiteralBoolean literalBoolean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literalBoolean, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralReal(LiteralReal literalReal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literalReal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainEvent(DomainEvent domainEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_MatchedParameterMappings(activity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MatchedParameterMappings constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity_MatchedParameterMappings(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activity.MatchedParameterMappings(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScope(Scope scope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scope, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifier(Identifier identifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityGroup(ActivityGroup activityGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceValue(InstanceValue instanceValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instanceValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceProperty(InstanceProperty instanceProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instanceProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecification(ValueSpecification valueSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityNode(ActivityNode activityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityEdge(ActivityEdge activityEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialNode(InitialNode initialNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(initialNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlNode(ControlNode controlNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutableNode(ExecutableNode executableNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executableNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalNode(FinalNode finalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(finalNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityFinalNode(ActivityFinalNode activityFinalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityFinalNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowFinalNode(FlowFinalNode flowFinalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowFinalNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredActivityNode(StructuredActivityNode structuredActivityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuredActivityNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalNode(ConditionalNode conditionalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionalNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopNode(LoopNode loopNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loopNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLExpression(OCLExpression oclExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallOperationAction(CallOperationAction callOperationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(callOperationAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableDeclarationAction(VariableDeclarationAction variableDeclarationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableDeclarationAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableAssignment(VariableAssignment variableAssignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableAssignment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaiseExceptionAction(RaiseExceptionAction raiseExceptionAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(raiseExceptionAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaiseEntityNotFoundExceptionAction(RaiseEntityNotFoundExceptionAction raiseEntityNotFoundExceptionAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(raiseEntityNotFoundExceptionAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendSignalAction(SendSignalAction sendSignalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sendSignalAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateSignalAction_ExclusiveEventSource(sendSignalAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceiveSignalAction(ReceiveSignalAction receiveSignalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(receiveSignalAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(receiveSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(receiveSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(receiveSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(receiveSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(receiveSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(receiveSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(receiveSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(receiveSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateSignalAction_ExclusiveEventSource(receiveSignalAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableAssignmentAction(VariableAssignmentAction variableAssignmentAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableAssignmentAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParallelNode(ParallelNode parallelNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parallelNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainNode(DomainNode domainNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainNode_SelfAnchoredBinaryExpression(domainNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SelfAnchoredBinaryExpression constraint of '<em>Domain Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainNode_SelfAnchoredBinaryExpression(DomainNode domainNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return domainNode.SelfAnchoredBinaryExpression(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainExistAction(DomainExistAction domainExistAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainExistAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainExistAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainExistAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainExistAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainExistAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainExistAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainExistAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainExistAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainExistAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainNode_SelfAnchoredBinaryExpression(domainExistAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainFindAction(DomainFindAction domainFindAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainFindAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainFindAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainFindAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainFindAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainFindAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainFindAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainFindAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainFindAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainFindAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainNode_SelfAnchoredBinaryExpression(domainFindAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainCreateAction(DomainCreateAction domainCreateAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainCreateAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainCreateAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainCreateAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainCreateAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainCreateAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainCreateAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainCreateAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainCreateAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainCreateAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainNode_SelfAnchoredBinaryExpression(domainCreateAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainUpdateAction(DomainUpdateAction domainUpdateAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainUpdateAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainUpdateAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainUpdateAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainUpdateAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainUpdateAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainUpdateAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainUpdateAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainUpdateAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainUpdateAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainNode_SelfAnchoredBinaryExpression(domainUpdateAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainDeleteAction(DomainDeleteAction domainDeleteAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainDeleteAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainDeleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainDeleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainDeleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainDeleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainDeleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainDeleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainDeleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainDeleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainNode_SelfAnchoredBinaryExpression(domainDeleteAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalAction(SignalAction signalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(signalAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(signalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(signalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(signalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(signalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(signalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(signalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(signalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(signalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateSignalAction_ExclusiveEventSource(signalAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ExclusiveEventSource constraint of '<em>Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalAction_ExclusiveEventSource(SignalAction signalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return signalAction.ExclusiveEventSource(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterMapping(ParameterMapping parameterMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterMapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameterMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameterMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameterMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameterMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameterMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterMapping_ConformingActivityOperationParameter(parameterMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterMapping_ExclusiveMappingSource(parameterMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterMapping_ValueOnlyInAction(parameterMapping, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConformingActivityOperationParameter constraint of '<em>Parameter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterMapping_ConformingActivityOperationParameter(ParameterMapping parameterMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return parameterMapping.ConformingActivityOperationParameter(diagnostics, context);
	}

	/**
	 * Validates the ExclusiveMappingSource constraint of '<em>Parameter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterMapping_ExclusiveMappingSource(ParameterMapping parameterMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return parameterMapping.ExclusiveMappingSource(diagnostics, context);
	}

	/**
	 * Validates the ValueOnlyInAction constraint of '<em>Parameter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterMapping_ValueOnlyInAction(ParameterMapping parameterMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return parameterMapping.ValueOnlyInAction(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionChild(ExpressionChild expressionChild, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expressionChild, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryExpression(UnaryExpression unaryExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unaryExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryExpression(BinaryExpression binaryExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotExpression(NotExpression notExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator(Operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerOperator(IntegerOperator integerOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDivide(Divide divide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(divide, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimes(Times times, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(times, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlus(Plus plus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinus(Minus minus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(minus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalOperator(LogicalOperator logicalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGt(Gt gt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLt(Lt lt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGe(Ge ge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLe(Le le, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(le, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEq(Eq eq, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eq, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe(Ne ne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnd(And and, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(and, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOr(Or or, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(or, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationType(OperationType operationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterDirection(ParameterDirection parameterDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterRole(ParameterRole parameterRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterMappingType(ParameterMappingType parameterMappingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DactValidator

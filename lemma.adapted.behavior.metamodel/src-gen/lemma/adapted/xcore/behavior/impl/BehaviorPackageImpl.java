/**
 */
package lemma.adapted.xcore.behavior.impl;

import lemma.adapted.xcore.behavior.Activity;
import lemma.adapted.xcore.behavior.ActivityEdge;
import lemma.adapted.xcore.behavior.ActivityFinalNode;
import lemma.adapted.xcore.behavior.ActivityGroup;
import lemma.adapted.xcore.behavior.ActivityModel;
import lemma.adapted.xcore.behavior.ActivityNode;
import lemma.adapted.xcore.behavior.And;
import lemma.adapted.xcore.behavior.Behavior;
import lemma.adapted.xcore.behavior.BehaviorFactory;
import lemma.adapted.xcore.behavior.BehaviorModel;
import lemma.adapted.xcore.behavior.BehaviorPackage;
import lemma.adapted.xcore.behavior.BinaryExpression;
import lemma.adapted.xcore.behavior.CallOperationAction;
import lemma.adapted.xcore.behavior.ConditionalNode;
import lemma.adapted.xcore.behavior.ControlNode;
import lemma.adapted.xcore.behavior.Divide;
import lemma.adapted.xcore.behavior.Eq;
import lemma.adapted.xcore.behavior.ExecutableNode;
import lemma.adapted.xcore.behavior.Expression;
import lemma.adapted.xcore.behavior.FinalNode;
import lemma.adapted.xcore.behavior.FlowFinalNode;
import lemma.adapted.xcore.behavior.Ge;
import lemma.adapted.xcore.behavior.Gt;
import lemma.adapted.xcore.behavior.Identifier;
import lemma.adapted.xcore.behavior.ImportedDataOperation;
import lemma.adapted.xcore.behavior.ImportedDataParameter;
import lemma.adapted.xcore.behavior.ImportedInterfaceOperation;
import lemma.adapted.xcore.behavior.ImportedInterfaceParameter;
import lemma.adapted.xcore.behavior.ImportedOperation;
import lemma.adapted.xcore.behavior.ImportedParameter;
import lemma.adapted.xcore.behavior.InitialNode;
import lemma.adapted.xcore.behavior.IntegerOperator;
import lemma.adapted.xcore.behavior.Le;
import lemma.adapted.xcore.behavior.LogicalOperator;
import lemma.adapted.xcore.behavior.LoopNode;
import lemma.adapted.xcore.behavior.Lt;
import lemma.adapted.xcore.behavior.Minus;
import lemma.adapted.xcore.behavior.NamedElement;
import lemma.adapted.xcore.behavior.Ne;
import lemma.adapted.xcore.behavior.NotExpression;
import lemma.adapted.xcore.behavior.Operator;
import lemma.adapted.xcore.behavior.Or;
import lemma.adapted.xcore.behavior.ParallelNode;
import lemma.adapted.xcore.behavior.ParameterMapping;
import lemma.adapted.xcore.behavior.ParameterMappingType;
import lemma.adapted.xcore.behavior.Plus;
import lemma.adapted.xcore.behavior.RaiseEntityNotFoundExceptionAction;
import lemma.adapted.xcore.behavior.RaiseExceptionAction;
import lemma.adapted.xcore.behavior.ReceiveSignalAction;
import lemma.adapted.xcore.behavior.Scope;
import lemma.adapted.xcore.behavior.SendSignalAction;
import lemma.adapted.xcore.behavior.SignalAction;
import lemma.adapted.xcore.behavior.SpecDataOperation;
import lemma.adapted.xcore.behavior.SpecRule;
import lemma.adapted.xcore.behavior.StructuredActivityNode;
import lemma.adapted.xcore.behavior.Times;
import lemma.adapted.xcore.behavior.TypedMultiplicityElement;
import lemma.adapted.xcore.behavior.UnaryExpression;
import lemma.adapted.xcore.behavior.Variable;
import lemma.adapted.xcore.behavior.VariableAssignment;
import lemma.adapted.xcore.behavior.VariableAssignmentAction;
import lemma.adapted.xcore.behavior.VariableDeclarationAction;

import lemma.adapted.xcore.data.DataPackage;

import lemma.adapted.xcore.service.ServicePackage;

import lemma.adapted.xcore.technology.TechnologyPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorPackageImpl extends EPackageImpl implements BehaviorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specDataOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importedOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importedInterfaceOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importedDataOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importedParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importedInterfaceParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importedDataParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredActivityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callOperationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignmentActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raiseExceptionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raiseEntityNotFoundExceptionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendSignalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveSignalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedMultiplicityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterMappingTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BehaviorPackageImpl() {
		super(eNS_URI, BehaviorFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BehaviorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BehaviorPackage init() {
		if (isInited) return (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBehaviorPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BehaviorPackageImpl theBehaviorPackage = registeredBehaviorPackage instanceof BehaviorPackageImpl ? (BehaviorPackageImpl)registeredBehaviorPackage : new BehaviorPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		ServicePackage.eINSTANCE.eClass();
		DataPackage.eINSTANCE.eClass();
		TechnologyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBehaviorPackage.createPackageContents();

		// Initialize created meta-data
		theBehaviorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBehaviorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BehaviorPackage.eNS_URI, theBehaviorPackage);
		return theBehaviorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehaviorModel() {
		return behaviorModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviorModel_T_modelUri() {
		return (EAttribute)behaviorModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorModel_Imports() {
		return (EReference)behaviorModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorModel_ActivityModel() {
		return (EReference)behaviorModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityModel() {
		return activityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityModel_Activities() {
		return (EReference)activityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecDataOperation() {
		return specDataOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecDataOperation_IsInvariant() {
		return (EAttribute)specDataOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecDataOperation_OwnedRules() {
		return (EReference)specDataOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecRule() {
		return specRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRule_RawString() {
		return (EAttribute)specRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecRule_Expr() {
		return (EReference)specRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportedOperation() {
		return importedOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportedOperation_Import() {
		return (EReference)importedOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportedInterfaceOperation() {
		return importedInterfaceOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportedInterfaceOperation_Operation() {
		return (EReference)importedInterfaceOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportedDataOperation() {
		return importedDataOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportedDataOperation_Operation() {
		return (EReference)importedDataOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportedParameter() {
		return importedParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportedParameter_Import() {
		return (EReference)importedParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportedInterfaceParameter() {
		return importedInterfaceParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportedInterfaceParameter_Parameter() {
		return (EReference)importedInterfaceParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportedDataParameter() {
		return importedDataParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportedDataParameter_Parameter() {
		return (EReference)importedDataParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehavior() {
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehavior_Specification() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_ToTransform() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_OwnedParameters() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_ParameterMappings() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Root() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScope() {
		return scopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScope_Parent() {
		return (EReference)scopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScope_Children() {
		return (EReference)scopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScope_InheritedVariables() {
		return (EReference)scopeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScope_OwnedVariables() {
		return (EReference)scopeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScope_Group() {
		return (EReference)scopeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifier() {
		return identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifier_Index() {
		return (EAttribute)identifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityGroup() {
		return activityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityGroup_OwnedNodes() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityGroup_OwnedEdges() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityGroup_Scope() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityGroup_Activity() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityGroup_StructuredActivityNode() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityGroup_ConditionalNode() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariable_ImportedType() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariable_PrimitiveType() {
		return (EReference)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_UpperBound() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_LowerBound() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariable_AccessibleScopes() {
		return (EReference)variableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariable_Scope() {
		return (EReference)variableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityNode() {
		return activityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityNode_SEdge() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityNode_TEdge() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityNode_Group() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityEdge() {
		return activityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityEdge_Source() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityEdge_Target() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityEdge_Group() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialNode() {
		return initialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlNode() {
		return controlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutableNode() {
		return executableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinalNode() {
		return finalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinalNode_VariablesToReturn() {
		return (EReference)finalNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityFinalNode() {
		return activityFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowFinalNode() {
		return flowFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStructuredActivityNode() {
		return structuredActivityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructuredActivityNode_Test() {
		return (EReference)structuredActivityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructuredActivityNode_Body() {
		return (EReference)structuredActivityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalNode() {
		return conditionalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalNode_ElseBody() {
		return (EReference)conditionalNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoopNode() {
		return loopNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoopNode_Setup() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallOperationAction() {
		return callOperationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallOperationAction_DomainToDeclareResult() {
		return (EAttribute)callOperationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallOperationAction_ImportedOperation() {
		return (EReference)callOperationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallOperationAction_ParameterMappings() {
		return (EReference)callOperationActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclarationAction() {
		return variableDeclarationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableDeclarationAction_LowerBound() {
		return (EAttribute)variableDeclarationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableDeclarationAction_UpperBound() {
		return (EAttribute)variableDeclarationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationAction_ImportedType() {
		return (EReference)variableDeclarationActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationAction_PrimitiveType() {
		return (EReference)variableDeclarationActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationAction_Declaration() {
		return (EReference)variableDeclarationActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableAssignmentAction() {
		return variableAssignmentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableAssignmentAction_Assignment() {
		return (EReference)variableAssignmentActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableAssignment() {
		return variableAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableAssignment_Identifier() {
		return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableAssignment_Expr() {
		return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRaiseExceptionAction() {
		return raiseExceptionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRaiseExceptionAction_Exception() {
		return (EReference)raiseExceptionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRaiseEntityNotFoundExceptionAction() {
		return raiseEntityNotFoundExceptionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRaiseEntityNotFoundExceptionAction_Entity() {
		return (EReference)raiseEntityNotFoundExceptionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSendSignalAction() {
		return sendSignalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReceiveSignalAction() {
		return receiveSignalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParallelNode() {
		return parallelNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelNode_OwnedGroup() {
		return (EReference)parallelNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignalAction() {
		return signalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignalAction_Event() {
		return (EReference)signalActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignalAction_Value() {
		return (EReference)signalActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterMapping() {
		return parameterMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterMapping_Type() {
		return (EAttribute)parameterMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterMapping_OperationParameter() {
		return (EReference)parameterMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterMapping_Identifier() {
		return (EReference)parameterMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterMapping_Variable() {
		return (EReference)parameterMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterMapping_ActivityParameter() {
		return (EReference)parameterMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterMapping_Value() {
		return (EReference)parameterMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterMapping_Action() {
		return (EReference)parameterMappingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterMapping_Activity() {
		return (EReference)parameterMappingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryExpression_Value() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryExpression_Identifier() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryExpression_Operator() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryExpression_LeftExpr() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryExpression_RightExpr() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotExpression() {
		return notExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNotExpression_Expr() {
		return (EReference)notExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegerOperator() {
		return integerOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDivide() {
		return divideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimes() {
		return timesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlus() {
		return plusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMinus() {
		return minusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalOperator() {
		return logicalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGt() {
		return gtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLt() {
		return ltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGe() {
		return geEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLe() {
		return leEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEq() {
		return eqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNe() {
		return neEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypedMultiplicityElement() {
		return typedMultiplicityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypedMultiplicityElement_Default() {
		return (EReference)typedMultiplicityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypedMultiplicityElement_Type() {
		return (EReference)typedMultiplicityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypedMultiplicityElement_UpperBound() {
		return (EAttribute)typedMultiplicityElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypedMultiplicityElement_LowerBound() {
		return (EAttribute)typedMultiplicityElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getParameterMappingType() {
		return parameterMappingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviorFactory getBehaviorFactory() {
		return (BehaviorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		behaviorModelEClass = createEClass(BEHAVIOR_MODEL);
		createEAttribute(behaviorModelEClass, BEHAVIOR_MODEL__TMODEL_URI);
		createEReference(behaviorModelEClass, BEHAVIOR_MODEL__IMPORTS);
		createEReference(behaviorModelEClass, BEHAVIOR_MODEL__ACTIVITY_MODEL);

		activityModelEClass = createEClass(ACTIVITY_MODEL);
		createEReference(activityModelEClass, ACTIVITY_MODEL__ACTIVITIES);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		specDataOperationEClass = createEClass(SPEC_DATA_OPERATION);
		createEAttribute(specDataOperationEClass, SPEC_DATA_OPERATION__IS_INVARIANT);
		createEReference(specDataOperationEClass, SPEC_DATA_OPERATION__OWNED_RULES);

		specRuleEClass = createEClass(SPEC_RULE);
		createEAttribute(specRuleEClass, SPEC_RULE__RAW_STRING);
		createEReference(specRuleEClass, SPEC_RULE__EXPR);

		importedOperationEClass = createEClass(IMPORTED_OPERATION);
		createEReference(importedOperationEClass, IMPORTED_OPERATION__IMPORT);

		importedInterfaceOperationEClass = createEClass(IMPORTED_INTERFACE_OPERATION);
		createEReference(importedInterfaceOperationEClass, IMPORTED_INTERFACE_OPERATION__OPERATION);

		importedDataOperationEClass = createEClass(IMPORTED_DATA_OPERATION);
		createEReference(importedDataOperationEClass, IMPORTED_DATA_OPERATION__OPERATION);

		importedParameterEClass = createEClass(IMPORTED_PARAMETER);
		createEReference(importedParameterEClass, IMPORTED_PARAMETER__IMPORT);

		importedInterfaceParameterEClass = createEClass(IMPORTED_INTERFACE_PARAMETER);
		createEReference(importedInterfaceParameterEClass, IMPORTED_INTERFACE_PARAMETER__PARAMETER);

		importedDataParameterEClass = createEClass(IMPORTED_DATA_PARAMETER);
		createEReference(importedDataParameterEClass, IMPORTED_DATA_PARAMETER__PARAMETER);

		behaviorEClass = createEClass(BEHAVIOR);
		createEReference(behaviorEClass, BEHAVIOR__SPECIFICATION);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__TO_TRANSFORM);
		createEReference(activityEClass, ACTIVITY__OWNED_PARAMETERS);
		createEReference(activityEClass, ACTIVITY__PARAMETER_MAPPINGS);
		createEReference(activityEClass, ACTIVITY__ROOT);

		scopeEClass = createEClass(SCOPE);
		createEReference(scopeEClass, SCOPE__PARENT);
		createEReference(scopeEClass, SCOPE__CHILDREN);
		createEReference(scopeEClass, SCOPE__INHERITED_VARIABLES);
		createEReference(scopeEClass, SCOPE__OWNED_VARIABLES);
		createEReference(scopeEClass, SCOPE__GROUP);

		identifierEClass = createEClass(IDENTIFIER);
		createEAttribute(identifierEClass, IDENTIFIER__INDEX);

		activityGroupEClass = createEClass(ACTIVITY_GROUP);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__OWNED_NODES);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__OWNED_EDGES);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__SCOPE);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__ACTIVITY);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__CONDITIONAL_NODE);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__IMPORTED_TYPE);
		createEReference(variableEClass, VARIABLE__PRIMITIVE_TYPE);
		createEAttribute(variableEClass, VARIABLE__UPPER_BOUND);
		createEAttribute(variableEClass, VARIABLE__LOWER_BOUND);
		createEReference(variableEClass, VARIABLE__ACCESSIBLE_SCOPES);
		createEReference(variableEClass, VARIABLE__SCOPE);

		activityNodeEClass = createEClass(ACTIVITY_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__SEDGE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__TEDGE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__GROUP);

		activityEdgeEClass = createEClass(ACTIVITY_EDGE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__SOURCE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__TARGET);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__GROUP);

		initialNodeEClass = createEClass(INITIAL_NODE);

		controlNodeEClass = createEClass(CONTROL_NODE);

		executableNodeEClass = createEClass(EXECUTABLE_NODE);

		finalNodeEClass = createEClass(FINAL_NODE);
		createEReference(finalNodeEClass, FINAL_NODE__VARIABLES_TO_RETURN);

		activityFinalNodeEClass = createEClass(ACTIVITY_FINAL_NODE);

		flowFinalNodeEClass = createEClass(FLOW_FINAL_NODE);

		structuredActivityNodeEClass = createEClass(STRUCTURED_ACTIVITY_NODE);
		createEReference(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__TEST);
		createEReference(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__BODY);

		conditionalNodeEClass = createEClass(CONDITIONAL_NODE);
		createEReference(conditionalNodeEClass, CONDITIONAL_NODE__ELSE_BODY);

		loopNodeEClass = createEClass(LOOP_NODE);
		createEReference(loopNodeEClass, LOOP_NODE__SETUP);

		callOperationActionEClass = createEClass(CALL_OPERATION_ACTION);
		createEAttribute(callOperationActionEClass, CALL_OPERATION_ACTION__DOMAIN_TO_DECLARE_RESULT);
		createEReference(callOperationActionEClass, CALL_OPERATION_ACTION__IMPORTED_OPERATION);
		createEReference(callOperationActionEClass, CALL_OPERATION_ACTION__PARAMETER_MAPPINGS);

		variableDeclarationActionEClass = createEClass(VARIABLE_DECLARATION_ACTION);
		createEAttribute(variableDeclarationActionEClass, VARIABLE_DECLARATION_ACTION__LOWER_BOUND);
		createEAttribute(variableDeclarationActionEClass, VARIABLE_DECLARATION_ACTION__UPPER_BOUND);
		createEReference(variableDeclarationActionEClass, VARIABLE_DECLARATION_ACTION__IMPORTED_TYPE);
		createEReference(variableDeclarationActionEClass, VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE);
		createEReference(variableDeclarationActionEClass, VARIABLE_DECLARATION_ACTION__DECLARATION);

		variableAssignmentActionEClass = createEClass(VARIABLE_ASSIGNMENT_ACTION);
		createEReference(variableAssignmentActionEClass, VARIABLE_ASSIGNMENT_ACTION__ASSIGNMENT);

		variableAssignmentEClass = createEClass(VARIABLE_ASSIGNMENT);
		createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__IDENTIFIER);
		createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__EXPR);

		raiseExceptionActionEClass = createEClass(RAISE_EXCEPTION_ACTION);
		createEReference(raiseExceptionActionEClass, RAISE_EXCEPTION_ACTION__EXCEPTION);

		raiseEntityNotFoundExceptionActionEClass = createEClass(RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION);
		createEReference(raiseEntityNotFoundExceptionActionEClass, RAISE_ENTITY_NOT_FOUND_EXCEPTION_ACTION__ENTITY);

		sendSignalActionEClass = createEClass(SEND_SIGNAL_ACTION);

		receiveSignalActionEClass = createEClass(RECEIVE_SIGNAL_ACTION);

		parallelNodeEClass = createEClass(PARALLEL_NODE);
		createEReference(parallelNodeEClass, PARALLEL_NODE__OWNED_GROUP);

		signalActionEClass = createEClass(SIGNAL_ACTION);
		createEReference(signalActionEClass, SIGNAL_ACTION__EVENT);
		createEReference(signalActionEClass, SIGNAL_ACTION__VALUE);

		parameterMappingEClass = createEClass(PARAMETER_MAPPING);
		createEAttribute(parameterMappingEClass, PARAMETER_MAPPING__TYPE);
		createEReference(parameterMappingEClass, PARAMETER_MAPPING__OPERATION_PARAMETER);
		createEReference(parameterMappingEClass, PARAMETER_MAPPING__IDENTIFIER);
		createEReference(parameterMappingEClass, PARAMETER_MAPPING__VARIABLE);
		createEReference(parameterMappingEClass, PARAMETER_MAPPING__ACTIVITY_PARAMETER);
		createEReference(parameterMappingEClass, PARAMETER_MAPPING__VALUE);
		createEReference(parameterMappingEClass, PARAMETER_MAPPING__ACTION);
		createEReference(parameterMappingEClass, PARAMETER_MAPPING__ACTIVITY);

		expressionEClass = createEClass(EXPRESSION);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__VALUE);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__IDENTIFIER);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__OPERATOR);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT_EXPR);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT_EXPR);

		notExpressionEClass = createEClass(NOT_EXPRESSION);
		createEReference(notExpressionEClass, NOT_EXPRESSION__EXPR);

		operatorEClass = createEClass(OPERATOR);

		integerOperatorEClass = createEClass(INTEGER_OPERATOR);

		divideEClass = createEClass(DIVIDE);

		timesEClass = createEClass(TIMES);

		plusEClass = createEClass(PLUS);

		minusEClass = createEClass(MINUS);

		logicalOperatorEClass = createEClass(LOGICAL_OPERATOR);

		gtEClass = createEClass(GT);

		ltEClass = createEClass(LT);

		geEClass = createEClass(GE);

		leEClass = createEClass(LE);

		eqEClass = createEClass(EQ);

		neEClass = createEClass(NE);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);

		typedMultiplicityElementEClass = createEClass(TYPED_MULTIPLICITY_ELEMENT);
		createEReference(typedMultiplicityElementEClass, TYPED_MULTIPLICITY_ELEMENT__DEFAULT);
		createEReference(typedMultiplicityElementEClass, TYPED_MULTIPLICITY_ELEMENT__TYPE);
		createEAttribute(typedMultiplicityElementEClass, TYPED_MULTIPLICITY_ELEMENT__UPPER_BOUND);
		createEAttribute(typedMultiplicityElementEClass, TYPED_MULTIPLICITY_ELEMENT__LOWER_BOUND);

		// Create enums
		parameterMappingTypeEEnum = createEEnum(PARAMETER_MAPPING_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		specDataOperationEClass.getESuperTypes().add(theDataPackage.getDataOperation());
		specRuleEClass.getESuperTypes().add(this.getNamedElement());
		importedInterfaceOperationEClass.getESuperTypes().add(this.getImportedOperation());
		importedDataOperationEClass.getESuperTypes().add(this.getImportedOperation());
		importedInterfaceParameterEClass.getESuperTypes().add(this.getImportedParameter());
		importedDataParameterEClass.getESuperTypes().add(this.getImportedParameter());
		activityEClass.getESuperTypes().add(this.getNamedElement());
		activityEClass.getESuperTypes().add(this.getBehavior());
		identifierEClass.getESuperTypes().add(this.getNamedElement());
		activityGroupEClass.getESuperTypes().add(this.getNamedElement());
		activityGroupEClass.getESuperTypes().add(this.getScope());
		variableEClass.getESuperTypes().add(this.getNamedElement());
		activityNodeEClass.getESuperTypes().add(this.getNamedElement());
		activityEdgeEClass.getESuperTypes().add(this.getNamedElement());
		initialNodeEClass.getESuperTypes().add(this.getControlNode());
		controlNodeEClass.getESuperTypes().add(this.getActivityNode());
		executableNodeEClass.getESuperTypes().add(this.getActivityNode());
		finalNodeEClass.getESuperTypes().add(this.getControlNode());
		activityFinalNodeEClass.getESuperTypes().add(this.getFinalNode());
		flowFinalNodeEClass.getESuperTypes().add(this.getFinalNode());
		structuredActivityNodeEClass.getESuperTypes().add(this.getControlNode());
		conditionalNodeEClass.getESuperTypes().add(this.getStructuredActivityNode());
		loopNodeEClass.getESuperTypes().add(this.getStructuredActivityNode());
		callOperationActionEClass.getESuperTypes().add(this.getExecutableNode());
		variableDeclarationActionEClass.getESuperTypes().add(this.getExecutableNode());
		variableAssignmentActionEClass.getESuperTypes().add(this.getExecutableNode());
		raiseExceptionActionEClass.getESuperTypes().add(this.getExecutableNode());
		raiseEntityNotFoundExceptionActionEClass.getESuperTypes().add(this.getRaiseExceptionAction());
		sendSignalActionEClass.getESuperTypes().add(this.getSignalAction());
		receiveSignalActionEClass.getESuperTypes().add(this.getSignalAction());
		parallelNodeEClass.getESuperTypes().add(this.getControlNode());
		signalActionEClass.getESuperTypes().add(this.getExecutableNode());
		expressionEClass.getESuperTypes().add(this.getNamedElement());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		notExpressionEClass.getESuperTypes().add(this.getExpression());
		integerOperatorEClass.getESuperTypes().add(this.getOperator());
		divideEClass.getESuperTypes().add(this.getIntegerOperator());
		timesEClass.getESuperTypes().add(this.getIntegerOperator());
		plusEClass.getESuperTypes().add(this.getIntegerOperator());
		minusEClass.getESuperTypes().add(this.getIntegerOperator());
		logicalOperatorEClass.getESuperTypes().add(this.getOperator());
		gtEClass.getESuperTypes().add(this.getLogicalOperator());
		ltEClass.getESuperTypes().add(this.getLogicalOperator());
		geEClass.getESuperTypes().add(this.getLogicalOperator());
		leEClass.getESuperTypes().add(this.getLogicalOperator());
		eqEClass.getESuperTypes().add(this.getLogicalOperator());
		neEClass.getESuperTypes().add(this.getLogicalOperator());
		andEClass.getESuperTypes().add(this.getLogicalOperator());
		orEClass.getESuperTypes().add(this.getLogicalOperator());

		// Initialize classes, features, and operations; add parameters
		initEClass(behaviorModelEClass, BehaviorModel.class, "BehaviorModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehaviorModel_T_modelUri(), theEcorePackage.getEString(), "t_modelUri", null, 0, 1, BehaviorModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorModel_Imports(), theServicePackage.getImport(), null, "imports", null, 0, -1, BehaviorModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorModel_ActivityModel(), this.getActivityModel(), null, "activityModel", null, 0, 1, BehaviorModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityModelEClass, ActivityModel.class, "ActivityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityModel_Activities(), this.getActivity(), null, "activities", null, 0, -1, ActivityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specDataOperationEClass, SpecDataOperation.class, "SpecDataOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecDataOperation_IsInvariant(), theEcorePackage.getEBooleanObject(), "isInvariant", "false", 0, 1, SpecDataOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecDataOperation_OwnedRules(), this.getSpecRule(), null, "ownedRules", null, 0, -1, SpecDataOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specRuleEClass, SpecRule.class, "SpecRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecRule_RawString(), theEcorePackage.getEString(), "rawString", null, 0, 1, SpecRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecRule_Expr(), this.getExpression(), null, "expr", null, 0, 1, SpecRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importedOperationEClass, ImportedOperation.class, "ImportedOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportedOperation_Import(), theServicePackage.getImport(), null, "import", null, 0, 1, ImportedOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importedInterfaceOperationEClass, ImportedInterfaceOperation.class, "ImportedInterfaceOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportedInterfaceOperation_Operation(), theServicePackage.getOperation(), null, "operation", null, 0, 1, ImportedInterfaceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importedDataOperationEClass, ImportedDataOperation.class, "ImportedDataOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportedDataOperation_Operation(), theDataPackage.getDataOperation(), null, "operation", null, 0, 1, ImportedDataOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importedParameterEClass, ImportedParameter.class, "ImportedParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportedParameter_Import(), theServicePackage.getImport(), null, "import", null, 0, 1, ImportedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importedInterfaceParameterEClass, ImportedInterfaceParameter.class, "ImportedInterfaceParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportedInterfaceParameter_Parameter(), theServicePackage.getParameter(), null, "parameter", null, 0, 1, ImportedInterfaceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importedDataParameterEClass, ImportedDataParameter.class, "ImportedDataParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportedDataParameter_Parameter(), theDataPackage.getDataOperationParameter(), null, "parameter", null, 0, 1, ImportedDataParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavior_Specification(), this.getImportedOperation(), null, "specification", null, 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_ToTransform(), theEcorePackage.getEBooleanObject(), "toTransform", "true", 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_OwnedParameters(), theServicePackage.getParameter(), null, "ownedParameters", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_ParameterMappings(), this.getParameterMapping(), this.getParameterMapping_Activity(), "parameterMappings", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Root(), this.getActivityGroup(), this.getActivityGroup_Activity(), "root", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeEClass, Scope.class, "Scope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScope_Parent(), this.getScope(), this.getScope_Children(), "parent", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScope_Children(), this.getScope(), this.getScope_Parent(), "children", null, 0, -1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScope_InheritedVariables(), this.getVariable(), this.getVariable_AccessibleScopes(), "inheritedVariables", null, 0, -1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScope_OwnedVariables(), this.getVariable(), this.getVariable_Scope(), "ownedVariables", null, 0, -1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScope_Group(), this.getActivityGroup(), this.getActivityGroup_Scope(), "group", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierEClass, Identifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifier_Index(), theEcorePackage.getEString(), "index", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityGroupEClass, ActivityGroup.class, "ActivityGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityGroup_OwnedNodes(), this.getActivityNode(), this.getActivityNode_Group(), "ownedNodes", null, 0, -1, ActivityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityGroup_OwnedEdges(), this.getActivityEdge(), this.getActivityEdge_Group(), "ownedEdges", null, 0, -1, ActivityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityGroup_Scope(), this.getScope(), this.getScope_Group(), "scope", null, 0, 1, ActivityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityGroup_Activity(), this.getActivity(), this.getActivity_Root(), "activity", null, 0, 1, ActivityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityGroup_StructuredActivityNode(), this.getStructuredActivityNode(), this.getStructuredActivityNode_Body(), "structuredActivityNode", null, 0, 1, ActivityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityGroup_ConditionalNode(), this.getConditionalNode(), this.getConditionalNode_ElseBody(), "conditionalNode", null, 0, 1, ActivityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_ImportedType(), theServicePackage.getImportedType(), null, "importedType", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_PrimitiveType(), theDataPackage.getPrimitiveType(), null, "primitiveType", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_UpperBound(), theEcorePackage.getEIntegerObject(), "upperBound", "1", 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_LowerBound(), theEcorePackage.getEIntegerObject(), "lowerBound", "0", 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_AccessibleScopes(), this.getScope(), this.getScope_InheritedVariables(), "accessibleScopes", null, 0, -1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Scope(), this.getScope(), this.getScope_OwnedVariables(), "scope", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityNodeEClass, ActivityNode.class, "ActivityNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_SEdge(), this.getActivityEdge(), this.getActivityEdge_Source(), "sEdge", null, 0, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_TEdge(), this.getActivityEdge(), this.getActivityEdge_Target(), "tEdge", null, 0, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_Group(), this.getActivityGroup(), this.getActivityGroup_OwnedNodes(), "group", null, 0, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEdgeEClass, ActivityEdge.class, "ActivityEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdge_Source(), this.getActivityNode(), this.getActivityNode_SEdge(), "source", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Target(), this.getActivityNode(), this.getActivityNode_TEdge(), "target", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Group(), this.getActivityGroup(), this.getActivityGroup_OwnedEdges(), "group", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialNodeEClass, InitialNode.class, "InitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlNodeEClass, ControlNode.class, "ControlNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executableNodeEClass, ExecutableNode.class, "ExecutableNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalNodeEClass, FinalNode.class, "FinalNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinalNode_VariablesToReturn(), this.getIdentifier(), null, "variablesToReturn", null, 0, -1, FinalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityFinalNodeEClass, ActivityFinalNode.class, "ActivityFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowFinalNodeEClass, FlowFinalNode.class, "FlowFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuredActivityNodeEClass, StructuredActivityNode.class, "StructuredActivityNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredActivityNode_Test(), this.getExpression(), null, "test", null, 0, 1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredActivityNode_Body(), this.getActivityGroup(), this.getActivityGroup_StructuredActivityNode(), "body", null, 0, 1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalNodeEClass, ConditionalNode.class, "ConditionalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalNode_ElseBody(), this.getActivityGroup(), this.getActivityGroup_ConditionalNode(), "elseBody", null, 0, 1, ConditionalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopNodeEClass, LoopNode.class, "LoopNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoopNode_Setup(), this.getActivityGroup(), null, "setup", null, 0, 1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callOperationActionEClass, CallOperationAction.class, "CallOperationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallOperationAction_DomainToDeclareResult(), theEcorePackage.getEBooleanObject(), "domainToDeclareResult", "false", 0, 1, CallOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallOperationAction_ImportedOperation(), this.getImportedOperation(), null, "importedOperation", null, 0, 1, CallOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallOperationAction_ParameterMappings(), this.getParameterMapping(), this.getParameterMapping_Action(), "parameterMappings", null, 0, -1, CallOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDeclarationActionEClass, VariableDeclarationAction.class, "VariableDeclarationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableDeclarationAction_LowerBound(), theEcorePackage.getEIntegerObject(), "lowerBound", null, 0, 1, VariableDeclarationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableDeclarationAction_UpperBound(), theEcorePackage.getEIntegerObject(), "upperBound", null, 0, 1, VariableDeclarationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDeclarationAction_ImportedType(), theServicePackage.getImportedType(), null, "importedType", null, 0, 1, VariableDeclarationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDeclarationAction_PrimitiveType(), theDataPackage.getPrimitiveType(), null, "primitiveType", null, 0, 1, VariableDeclarationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDeclarationAction_Declaration(), this.getVariableAssignment(), null, "declaration", null, 0, 1, VariableDeclarationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableAssignmentActionEClass, VariableAssignmentAction.class, "VariableAssignmentAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAssignmentAction_Assignment(), this.getVariableAssignment(), null, "assignment", null, 0, 1, VariableAssignmentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableAssignmentEClass, VariableAssignment.class, "VariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAssignment_Identifier(), this.getIdentifier(), null, "identifier", null, 0, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableAssignment_Expr(), this.getExpression(), null, "expr", null, 0, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(raiseExceptionActionEClass, RaiseExceptionAction.class, "RaiseExceptionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRaiseExceptionAction_Exception(), theServicePackage.getImportedType(), null, "exception", null, 0, 1, RaiseExceptionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(raiseEntityNotFoundExceptionActionEClass, RaiseEntityNotFoundExceptionAction.class, "RaiseEntityNotFoundExceptionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRaiseEntityNotFoundExceptionAction_Entity(), theDataPackage.getDataStructure(), null, "entity", null, 0, 1, RaiseEntityNotFoundExceptionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendSignalActionEClass, SendSignalAction.class, "SendSignalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(receiveSignalActionEClass, ReceiveSignalAction.class, "ReceiveSignalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelNodeEClass, ParallelNode.class, "ParallelNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParallelNode_OwnedGroup(), this.getActivityGroup(), null, "ownedGroup", null, 0, -1, ParallelNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalActionEClass, SignalAction.class, "SignalAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalAction_Event(), theServicePackage.getImportedType(), null, "event", null, 0, 1, SignalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalAction_Value(), theDataPackage.getValueSpecification(), null, "value", null, 0, 1, SignalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterMappingEClass, ParameterMapping.class, "ParameterMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterMapping_Type(), this.getParameterMappingType(), "type", null, 0, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterMapping_OperationParameter(), this.getImportedParameter(), null, "operationParameter", null, 0, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterMapping_Identifier(), this.getIdentifier(), null, "identifier", null, 0, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterMapping_Variable(), this.getVariable(), null, "variable", null, 0, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterMapping_ActivityParameter(), theServicePackage.getParameter(), null, "activityParameter", null, 0, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterMapping_Value(), theDataPackage.getValueSpecification(), null, "value", null, 0, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterMapping_Action(), this.getCallOperationAction(), this.getCallOperationAction_ParameterMappings(), "action", null, 0, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterMapping_Activity(), this.getActivity(), this.getActivity_ParameterMappings(), "activity", null, 0, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryExpression_Value(), theDataPackage.getValueSpecification(), null, "value", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryExpression_Identifier(), this.getIdentifier(), null, "identifier", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_Operator(), this.getOperator(), null, "operator", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_LeftExpr(), this.getExpression(), null, "leftExpr", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_RightExpr(), this.getExpression(), null, "rightExpr", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notExpressionEClass, NotExpression.class, "NotExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotExpression_Expr(), this.getExpression(), null, "expr", null, 0, 1, NotExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerOperatorEClass, IntegerOperator.class, "IntegerOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divideEClass, Divide.class, "Divide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timesEClass, Times.class, "Times", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalOperatorEClass, LogicalOperator.class, "LogicalOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gtEClass, Gt.class, "Gt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ltEClass, Lt.class, "Lt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(geEClass, Ge.class, "Ge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leEClass, Le.class, "Le", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eqEClass, Eq.class, "Eq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(neEClass, Ne.class, "Ne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedMultiplicityElementEClass, TypedMultiplicityElement.class, "TypedMultiplicityElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedMultiplicityElement_Default(), theDataPackage.getValueSpecification(), null, "default", null, 0, 1, TypedMultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedMultiplicityElement_Type(), theServicePackage.getImportedType(), null, "type", null, 0, 1, TypedMultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedMultiplicityElement_UpperBound(), theEcorePackage.getEIntegerObject(), "upperBound", "1", 0, 1, TypedMultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedMultiplicityElement_LowerBound(), theEcorePackage.getEIntegerObject(), "lowerBound", "0", 0, 1, TypedMultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parameterMappingTypeEEnum, ParameterMappingType.class, "ParameterMappingType");
		addEEnumLiteral(parameterMappingTypeEEnum, ParameterMappingType.ACTION_IN);
		addEEnumLiteral(parameterMappingTypeEEnum, ParameterMappingType.ACTION_OUT);
		addEEnumLiteral(parameterMappingTypeEEnum, ParameterMappingType.ACTIVITY_IN);
		addEEnumLiteral(parameterMappingTypeEEnum, ParameterMappingType.ACTIVITY_OUT);

		// Create resource
		createResource(eNS_URI);
	}

} //BehaviorPackageImpl

/**
 */
package lemma.adapted.xcore.behavior;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lemma.adapted.xcore.behavior.BehaviorPackage
 * @generated
 */
public interface BehaviorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorFactory eINSTANCE = lemma.adapted.xcore.behavior.impl.BehaviorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	BehaviorModel createBehaviorModel();

	/**
	 * Returns a new object of class '<em>Activity Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Model</em>'.
	 * @generated
	 */
	ActivityModel createActivityModel();

	/**
	 * Returns a new object of class '<em>Spec Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Data Operation</em>'.
	 * @generated
	 */
	SpecDataOperation createSpecDataOperation();

	/**
	 * Returns a new object of class '<em>Spec Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Rule</em>'.
	 * @generated
	 */
	SpecRule createSpecRule();

	/**
	 * Returns a new object of class '<em>Imported Interface Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imported Interface Operation</em>'.
	 * @generated
	 */
	ImportedInterfaceOperation createImportedInterfaceOperation();

	/**
	 * Returns a new object of class '<em>Imported Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imported Data Operation</em>'.
	 * @generated
	 */
	ImportedDataOperation createImportedDataOperation();

	/**
	 * Returns a new object of class '<em>Imported Interface Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imported Interface Parameter</em>'.
	 * @generated
	 */
	ImportedInterfaceParameter createImportedInterfaceParameter();

	/**
	 * Returns a new object of class '<em>Imported Data Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imported Data Parameter</em>'.
	 * @generated
	 */
	ImportedDataParameter createImportedDataParameter();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope</em>'.
	 * @generated
	 */
	Scope createScope();

	/**
	 * Returns a new object of class '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifier</em>'.
	 * @generated
	 */
	Identifier createIdentifier();

	/**
	 * Returns a new object of class '<em>Activity Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Group</em>'.
	 * @generated
	 */
	ActivityGroup createActivityGroup();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Edge</em>'.
	 * @generated
	 */
	ActivityEdge createActivityEdge();

	/**
	 * Returns a new object of class '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Node</em>'.
	 * @generated
	 */
	InitialNode createInitialNode();

	/**
	 * Returns a new object of class '<em>Activity Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Final Node</em>'.
	 * @generated
	 */
	ActivityFinalNode createActivityFinalNode();

	/**
	 * Returns a new object of class '<em>Flow Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Final Node</em>'.
	 * @generated
	 */
	FlowFinalNode createFlowFinalNode();

	/**
	 * Returns a new object of class '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Activity Node</em>'.
	 * @generated
	 */
	StructuredActivityNode createStructuredActivityNode();

	/**
	 * Returns a new object of class '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Node</em>'.
	 * @generated
	 */
	ConditionalNode createConditionalNode();

	/**
	 * Returns a new object of class '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Node</em>'.
	 * @generated
	 */
	LoopNode createLoopNode();

	/**
	 * Returns a new object of class '<em>Call Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Operation Action</em>'.
	 * @generated
	 */
	CallOperationAction createCallOperationAction();

	/**
	 * Returns a new object of class '<em>Variable Declaration Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Declaration Action</em>'.
	 * @generated
	 */
	VariableDeclarationAction createVariableDeclarationAction();

	/**
	 * Returns a new object of class '<em>Variable Assignment Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Assignment Action</em>'.
	 * @generated
	 */
	VariableAssignmentAction createVariableAssignmentAction();

	/**
	 * Returns a new object of class '<em>Variable Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Assignment</em>'.
	 * @generated
	 */
	VariableAssignment createVariableAssignment();

	/**
	 * Returns a new object of class '<em>Raise Exception Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raise Exception Action</em>'.
	 * @generated
	 */
	RaiseExceptionAction createRaiseExceptionAction();

	/**
	 * Returns a new object of class '<em>Raise Entity Not Found Exception Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raise Entity Not Found Exception Action</em>'.
	 * @generated
	 */
	RaiseEntityNotFoundExceptionAction createRaiseEntityNotFoundExceptionAction();

	/**
	 * Returns a new object of class '<em>Send Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Signal Action</em>'.
	 * @generated
	 */
	SendSignalAction createSendSignalAction();

	/**
	 * Returns a new object of class '<em>Receive Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Signal Action</em>'.
	 * @generated
	 */
	ReceiveSignalAction createReceiveSignalAction();

	/**
	 * Returns a new object of class '<em>Parallel Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Node</em>'.
	 * @generated
	 */
	ParallelNode createParallelNode();

	/**
	 * Returns a new object of class '<em>Parameter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Mapping</em>'.
	 * @generated
	 */
	ParameterMapping createParameterMapping();

	/**
	 * Returns a new object of class '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Expression</em>'.
	 * @generated
	 */
	UnaryExpression createUnaryExpression();

	/**
	 * Returns a new object of class '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Expression</em>'.
	 * @generated
	 */
	BinaryExpression createBinaryExpression();

	/**
	 * Returns a new object of class '<em>Not Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Expression</em>'.
	 * @generated
	 */
	NotExpression createNotExpression();

	/**
	 * Returns a new object of class '<em>Divide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Divide</em>'.
	 * @generated
	 */
	Divide createDivide();

	/**
	 * Returns a new object of class '<em>Times</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Times</em>'.
	 * @generated
	 */
	Times createTimes();

	/**
	 * Returns a new object of class '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plus</em>'.
	 * @generated
	 */
	Plus createPlus();

	/**
	 * Returns a new object of class '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minus</em>'.
	 * @generated
	 */
	Minus createMinus();

	/**
	 * Returns a new object of class '<em>Gt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gt</em>'.
	 * @generated
	 */
	Gt createGt();

	/**
	 * Returns a new object of class '<em>Lt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lt</em>'.
	 * @generated
	 */
	Lt createLt();

	/**
	 * Returns a new object of class '<em>Ge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ge</em>'.
	 * @generated
	 */
	Ge createGe();

	/**
	 * Returns a new object of class '<em>Le</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Le</em>'.
	 * @generated
	 */
	Le createLe();

	/**
	 * Returns a new object of class '<em>Eq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eq</em>'.
	 * @generated
	 */
	Eq createEq();

	/**
	 * Returns a new object of class '<em>Ne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ne</em>'.
	 * @generated
	 */
	Ne createNe();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BehaviorPackage getBehaviorPackage();

} //BehaviorFactory

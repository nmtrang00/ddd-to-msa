# Metamodel Definition Statistics: dact

## Overview
* **Package Name:** dact
* **Ns URI:** http://www.example.org/xcore/dact
* **Total EClasses:** 99
* **Total Enumerations:** 4
* **Total Data Types:** 4

---

## 1. Class Breakdown

| Class Name | Abstract | Interface | Attributes | References | Operations |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Activity** | false | false | 1 | 5 | 3 |
| **ActivityEdge** | false | false | 2 | 3 | 3 |
| **ActivityFinalNode** | false | false | 0 | 0 | 0 |
| **ActivityGroup** | false | false | 0 | 7 | 3 |
| **ActivityModel** | false | false | 0 | 1 | 1 |
| **ActivityNode** | true | false | 0 | 3 | 0 |
| **AggregateRoot** | false | false | 0 | 0 | 0 |
| **And** | false | false | 0 | 0 | 0 |
| **Behavior** | true | false | 0 | 1 | 0 |
| **BinaryExpression** | false | false | 0 | 3 | 0 |
| **BooleanType** | false | false | 0 | 0 | 0 |
| **BoundedContext** | false | false | 1 | 1 | 0 |
| **CallOperationAction** | false | false | 1 | 2 | 0 |
| **ConditionalNode** | false | false | 0 | 1 | 0 |
| **ControlNode** | true | false | 0 | 0 | 0 |
| **DataType** | true | false | 0 | 0 | 0 |
| **DddModel** | false | false | 0 | 2 | 2 |
| **DefinesIdentityObject** | true | false | 1 | 0 | 0 |
| **DiagnosticSupported** | true | false | 0 | 0 | 2 |
| **Divide** | false | false | 0 | 0 | 0 |
| **DomainCreateAction** | false | false | 0 | 0 | 0 |
| **DomainDeleteAction** | false | false | 0 | 0 | 0 |
| **DomainElement** | true | false | 0 | 1 | 0 |
| **DomainEvent** | false | false | 0 | 0 | 0 |
| **DomainExistAction** | false | false | 0 | 0 | 0 |
| **DomainFindAction** | false | false | 0 | 0 | 0 |
| **DomainNode** | true | false | 0 | 5 | 2 |
| **DomainNodeOperationMapping** | false | false | 1 | 2 | 0 |
| **DomainObject** | true | false | 0 | 2 | 3 |
| **DomainUpdateAction** | false | false | 0 | 0 | 0 |
| **Entity** | false | false | 0 | 1 | 0 |
| **Enumeration** | false | false | 0 | 1 | 0 |
| **EnumerationLiteral** | false | false | 0 | 0 | 0 |
| **Eq** | false | false | 0 | 0 | 0 |
| **ExecutableNode** | true | false | 0 | 0 | 0 |
| **Expression** | true | false | 0 | 0 | 0 |
| **FinalNode** | true | false | 0 | 1 | 0 |
| **FlowFinalNode** | false | false | 0 | 0 | 0 |
| **Ge** | false | false | 0 | 0 | 0 |
| **Gt** | false | false | 0 | 0 | 0 |
| **Identifier** | false | false | 1 | 0 | 0 |
| **In** | false | false | 0 | 0 | 0 |
| **InitialNode** | false | false | 1 | 0 | 0 |
| **InstanceProperty** | false | false | 0 | 2 | 0 |
| **InstanceValue** | false | false | 0 | 2 | 0 |
| **IntegerOperator** | true | false | 0 | 0 | 0 |
| **IntegerType** | false | false | 0 | 0 | 0 |
| **Interface** | true | false | 0 | 1 | 1 |
| **InternalDomainObject** | true | false | 0 | 0 | 0 |
| **Le** | false | false | 0 | 0 | 0 |
| **Literal** | true | false | 0 | 0 | 0 |
| **LiteralBoolean** | false | false | 1 | 0 | 0 |
| **LiteralInteger** | false | false | 1 | 0 | 0 |
| **LiteralNull** | false | false | 0 | 0 | 0 |
| **LiteralReal** | false | false | 1 | 0 | 0 |
| **LiteralString** | false | false | 2 | 0 | 1 |
| **LogicalOperator** | true | false | 0 | 0 | 0 |
| **LoopNode** | false | false | 0 | 1 | 0 |
| **Lt** | false | false | 0 | 0 | 0 |
| **Minus** | false | false | 0 | 0 | 0 |
| **Model** | true | false | 0 | 0 | 0 |
| **NamedElement** | true | false | 1 | 0 | 0 |
| **Ne** | false | false | 0 | 0 | 0 |
| **NotExpression** | false | false | 0 | 1 | 0 |
| **Operation** | false | false | 2 | 4 | 0 |
| **Operator** | true | false | 0 | 0 | 0 |
| **Or** | false | false | 0 | 0 | 0 |
| **ParallelNode** | false | false | 0 | 1 | 0 |
| **Parameter** | false | false | 2 | 2 | 0 |
| **ParameterMapping** | false | false | 1 | 7 | 3 |
| **Plus** | false | false | 0 | 0 | 0 |
| **PrimitiveType** | true | false | 0 | 0 | 0 |
| **Property** | false | false | 1 | 1 | 4 |
| **RaiseEntityNotFoundExceptionAction** | false | false | 0 | 1 | 0 |
| **RaiseExceptionAction** | false | false | 1 | 0 | 0 |
| **RealType** | false | false | 0 | 0 | 0 |
| **ReceiveSignalAction** | false | false | 0 | 0 | 0 |
| **Repository** | false | false | 0 | 1 | 0 |
| **Root** | false | false | 0 | 3 | 1 |
| **Scope** | false | false | 1 | 5 | 0 |
| **SendSignalAction** | false | false | 0 | 0 | 0 |
| **Service** | false | false | 0 | 0 | 0 |
| **SharedDomainObject** | true | false | 0 | 1 | 0 |
| **SharedValueObject** | false | false | 0 | 0 | 0 |
| **SignalAction** | true | false | 0 | 4 | 1 |
| **SpecOperation** | false | false | 1 | 1 | 5 |
| **SpecRule** | false | false | 1 | 2 | 0 |
| **StringType** | false | false | 0 | 0 | 0 |
| **StructuredActivityNode** | true | false | 0 | 2 | 0 |
| **Times** | false | false | 0 | 0 | 0 |
| **Type** | true | false | 0 | 0 | 0 |
| **TypedMultiplicityElement** | true | false | 2 | 2 | 0 |
| **UnaryExpression** | false | false | 0 | 2 | 0 |
| **ValueObject** | false | false | 0 | 0 | 0 |
| **ValueSpecification** | true | false | 0 | 0 | 0 |
| **Variable** | false | false | 2 | 3 | 0 |
| **VariableAssignment** | false | false | 0 | 2 | 0 |
| **VariableAssignmentAction** | false | false | 0 | 1 | 0 |
| **VariableDeclarationAction** | false | false | 2 | 2 | 0 |

---

## 2. Feature Totals across Metamodel

* **Total Attributes (`EAttribute`):** 31
* **Total Containment References:** 49
* **Total Non-Containment References:** 47
* **Total Operations (`EOperation`):** 35
* **Total Parameters (`EParameter`):** 69

---

## 3. Enumerations Detail

### Enum: OperationType
* **Literals (12):** S0_DOMAIN_SERVICE, R0_REPOSITORY_CREATE, R1_REPOSITORY_READ, R2_REPOSITORY_UPDATE, R3_REPOSITORY_DELETE, R4_REPOSITORY_EXIST, D0_CONSTRUCTOR, D1_SIMPLE_MUTATOR, D2_COMPOUND_MUTATOR, D3_SIMPLE_ACCESSOR, D4_COMPOUND_ACCESSOR, D5_SPECIFICATION
### Enum: ParameterDirection
* **Literals (2):** IN, OUT
### Enum: ParameterMappingType
* **Literals (4):** ACTION_IN, ACTION_OUT, ACTIVITY_IN, ACTIVITY_OUT
### Enum: ParameterRole
* **Literals (2):** CORE, SUPPORTING


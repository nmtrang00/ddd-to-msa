package dact.validation;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.eclipse.emf.common.util.DiagnosticException;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;
import java.util.List;

import dact.*;
import dact.design.*;

/**
 * Correctness tests for Phase 1: Preprocess DACT
 */
@DisplayName("Phase 1: Preprocessing")
public class TestPhaseOne{
    private Path QVTO_FILE =  ValidatorHelper.bundleRoot().getParent()
            .resolve("dact-to-lemma/transforms/DactPreprocess.qvto");
 
    private Root root;
    private BooleanType BOOL;
    private StringType STR;
    private IntegerType INT;
    private RealType REAL;

    @TempDir
    Path tempDir;
    
    @BeforeEach
    void setUp() {
        root = DactFactory.eINSTANCE.createRoot();

        // 1. Populate default sub-models
        root.setDdd(DactFactory.eINSTANCE.createDddModel());
        root.setActivity(DactFactory.eINSTANCE.createActivityModel());

        // 2. Populate default primitive types
        STR = DactFactory.eINSTANCE.createStringType();
        STR.setName("String");
        root.getPrimitivesTypes().add(STR);

        BOOL = DactFactory.eINSTANCE.createBooleanType();
        BOOL.setName("Boolean");
        root.getPrimitivesTypes().add(BOOL);

        INT = DactFactory.eINSTANCE.createIntegerType();
        INT.setName("Integer");
        root.getPrimitivesTypes().add(INT);

        REAL = DactFactory.eINSTANCE.createRealType();
        REAL.setName("Real");
        root.getPrimitivesTypes().add(REAL);
    }


    // ------------------------------------------------------------------
    // Step 1.1: Structural Resolution - Add missing Id - Weak Normal
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Step 1.1: Structural Resolution - Add missing Id - Weak Normal")
    class AddMissingId{
    	private BoundedContext context;
    	
    	@BeforeEach
    	void setup() {
            context = DactFactory.eINSTANCE.createBoundedContext();
            context.setName("CustomerContext");
            root.getDdd().getBoundedContexts().add(context);
    	}
    	@Test
        @DisplayName("Valid: Missing ID -> Generates Single-Valued ID")
        void testMissingIdSingleValued() throws Exception {
            Entity entity = DactFactory.eINSTANCE.createEntity();
            entity.setName("Customer");
            context.getOwnedElements().add(entity);

            // Transformation executed on entity with no ID
            Root resultRoot = ValidatorHelper.executeTransformation(QVTO_FILE, root, tempDir);

            Entity resEntity = (Entity) resultRoot.getDdd().getBoundedContexts().get(0).getOwnedElements().get(0);
            
            // Assert ID generated with single-valued bounds (lower = 1, upper = 1)
            Property idProp = resEntity.getOwnedProperties().stream()
                    .filter(p -> p.isDefinesIdentity())
                    .findFirst()
                    .orElse(null);

            assertNotNull(idProp, "An ID property should be generated when missing");
            assertEquals(1, idProp.getLowerBound(), "Generated ID lower bound should be 1");
            assertEquals(1, idProp.getUpperBound(), "Generated ID upper bound should be 1");
        }

        @Test
        @DisplayName("Valid: Existing -> Preserves Existing ID")
        void testExistingSingleValuedIdPreserved() throws Exception {
            Entity entity = DactFactory.eINSTANCE.createEntity();
            entity.setName("Customer");

            Property customId = DactFactory.eINSTANCE.createProperty();
            customId.setName("customerId");
            customId.setType(STR);
            customId.setDefinesIdentity(true);
            customId.setLowerBound(1);
            customId.setUpperBound(1);
            entity.getOwnedProperties().add(customId);

            context.getOwnedElements().add(entity);

            Root resultRoot = ValidatorHelper.executeTransformation(QVTO_FILE, root, tempDir);

            Entity resEntity = (Entity) resultRoot.getDdd().getBoundedContexts().get(0).getOwnedElements().get(0);
            
            long idCount = resEntity.getOwnedProperties().stream().filter(p->p.isDefinesIdentity()).count();
            assertEquals(1, idCount, "Should not create duplicate IDs if single-valued ID exists");
            assertEquals("customerId", resEntity.getOwnedProperties().get(0).getName(), "Existing ID property name must be preserved");
        }
    }
    
    // ------------------------------------------------------------------
    // Step 1.1: Structural Resolution - Add missing property name - Weak Normal
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Step 1.1: Structural Resolution - Add missing property name - Weak Normal")
    class AddMissingPropertyName{
    	private Entity entity;
    	private BoundedContext context;
    	
    	@BeforeEach
    	void setUp() {
            context = DactFactory.eINSTANCE.createBoundedContext();
            context.setName("CustomerContext");
            root.getDdd().getBoundedContexts().add(context);

            entity = DactFactory.eINSTANCE.createEntity();
            entity.setName("Customer");
            context.getOwnedElements().add(entity);
        }
    	
    	@Test
        @DisplayName("Valid: Unnamed + Single-Valued (upper=1) -> Singular Name")
        void testUnnamedSingleValued() throws Exception {
    		Entity subAccount = DactFactory.eINSTANCE.createEntity();
        	subAccount.setName("SubAccount");
        	context.getOwnedElements().add(subAccount);
        	
    		Property prop = DactFactory.eINSTANCE.createProperty();
            prop.setType(subAccount);
            prop.setLowerBound(0);
            prop.setUpperBound(1); // Single-valued
            entity.getOwnedProperties().add(prop);

            Root resultRoot = ValidatorHelper.executeTransformation(QVTO_FILE, root, tempDir);

            Entity resEntity = (Entity) resultRoot.getDdd().getBoundedContexts().get(0).getOwnedElements().get(0);
            Property resProp = resEntity.getOwnedProperties().get(0);

            assertNotNull(resProp.getName(), "Name should be populated for unnamed single property");
            assertEquals("subAccount", resProp.getName(), "Single-valued property should get a singular name");
        }

        @Test
        @DisplayName("Valid: Unnamed + Collection (upper=-1) -> Property ")
        void testUnnamedCollection() throws Exception {
        	Entity subAccount = DactFactory.eINSTANCE.createEntity();
        	subAccount.setName("SubAccount");
        	context.getOwnedElements().add(subAccount);
        	
            Property prop = DactFactory.eINSTANCE.createProperty();
            prop.setType(subAccount);
            prop.setLowerBound(0);
            prop.setUpperBound(-1); // Collection
            entity.getOwnedProperties().add(prop);

            Root resultRoot = ValidatorHelper.executeTransformation(QVTO_FILE, root, tempDir);

            Entity resEntity = (Entity) resultRoot.getDdd().getBoundedContexts().get(0).getOwnedElements().get(0);
            Property resProp = resEntity.getOwnedProperties().get(0);

            assertNotNull(resProp.getName(), "Name should be populated for unnamed collection property");
            assertEquals(resProp.getName(), "subAccountCollection",
                       "Collection property should receive a pluralized/collection name. Given: " +resProp.getName());
        }

        @Test
        @DisplayName("Valid: Named + Single-Valued (upper=1) -> Preserves Name")
        void testNamedSingleValued() throws Exception {
            Property prop = DactFactory.eINSTANCE.createProperty();
            prop.setName("customSingle");
            prop.setType(STR);
            prop.setLowerBound(0);
            prop.setUpperBound(1); // Single-valued
            entity.getOwnedProperties().add(prop);

            Root resultRoot = ValidatorHelper.executeTransformation(QVTO_FILE, root, tempDir);

            Entity resEntity = (Entity) resultRoot.getDdd().getBoundedContexts().get(0).getOwnedElements().get(0);
            Property resProp = resEntity.getOwnedProperties().get(0);

            assertEquals("customSingle", resProp.getName(), "Existing name on single-valued property must not change");
        }
        
        @Test
        @DisplayName("Valid: Named + Collection (upper=-1) -> Preserves Name")
        void testNamedCollection() throws Exception {
            Property prop = DactFactory.eINSTANCE.createProperty();
            prop.setName("customCollection");
            prop.setType(STR);
            prop.setLowerBound(0);
            prop.setUpperBound(-1); // Collection
            entity.getOwnedProperties().add(prop);

            Root resultRoot = ValidatorHelper.executeTransformation(QVTO_FILE, root, tempDir);

            Entity resEntity = (Entity) resultRoot.getDdd().getBoundedContexts().get(0).getOwnedElements().get(0);
            Property resProp = resEntity.getOwnedProperties().get(0);

            assertEquals("customCollection", resProp.getName(), "Existing name on collection property must not change");
        }
    }
    
    // ------------------------------------------------------------------
    // Step 1.2: Validation of SpecRule - Weak Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName(" Step 1.2: Validation of SpecRule - Weak Robust")
    class SpecRuleValidation{
    	private BoundedContext context;
        private Entity entity;
        private SpecOperation specOp;

        @BeforeEach
        void setUp() {
            DactFactory factory = DactFactory.eINSTANCE;
            
            context = factory.createBoundedContext();
            context.setName("OrderContext");
            root.getDdd().getBoundedContexts().add(context);

            entity = factory.createEntity();
            entity.setName("Customer");
            context.getOwnedElements().add(entity);

            specOp = factory.createSpecOperation();
            specOp.setName("isEligibleForDiscount");
            specOp.setType(OperationType.D5_SPECIFICATION);
            entity.getOwnedOperations().add(specOp);
            
            Parameter outParam = factory.createParameter();
            outParam.setName("result");
            outParam.setType(BOOL);
            outParam.setLowerBound(1);
            outParam.setUpperBound(1);
            outParam.setDirection(ParameterDirection.OUT);
            specOp.getOwnedParameters().add(outParam);
        }
        
        // ---  Validity of the Expression ---
        @Test
        @DisplayName("Valid: Property exists on 'self' and evaluates to BOOL[1..1]")
        void testExistingPropertyOnSelfPasses() throws Exception {
            // Add existing boolean property to entity: customer.isActive: BOOL[1..1]
            Property isActiveProp = DactFactory.eINSTANCE.createProperty();
            isActiveProp.setName("isActive");
            isActiveProp.setType(BOOL);
            isActiveProp.setLowerBound(1);
            isActiveProp.setUpperBound(1);
            entity.getOwnedProperties().add(isActiveProp);

            // Expression referencing self.isActive
            Identifier ref = DactFactory.eINSTANCE.createIdentifier();
            ref.setName("self.isActive");

            UnaryExpression expr = DactFactory.eINSTANCE.createUnaryExpression();
            expr.setIdentifier(ref);

            SpecRule rule = DactFactory.eINSTANCE.createSpecRule();
            rule.setName("SelfPropertyRule");
            rule.setExpr(expr);
            specOp.getOwnedRules().add(rule);

            assertTransformationPasses(QVTO_FILE, root, tempDir);
        }

        @Test
        @DisplayName("Valid: Parameter exists in operation and evaluates to BOOL[1..1]")
        void testExistingParameterPasses() throws Exception {
            Parameter param = DactFactory.eINSTANCE.createParameter();
            param.setName("isValidUser");
            param.setType(BOOL);
            param.setLowerBound(1);
            param.setUpperBound(1);
            param.setDirection(ParameterDirection.IN);
            specOp.getOwnedParameters().add(param);
            
            Identifier ref = DactFactory.eINSTANCE.createIdentifier();
            ref.setName("isValidUser");

            UnaryExpression expr = DactFactory.eINSTANCE.createUnaryExpression();
            expr.setIdentifier(ref);

            SpecRule rule = DactFactory.eINSTANCE.createSpecRule();
            rule.setName("ValidParameterRule");
            rule.setExpr(expr);
            specOp.getOwnedRules().add(rule);

            assertTransformationPasses(QVTO_FILE, root, tempDir);
        }

        @Test
        @DisplayName("Invalid: Referenced Parameter does NOT exist in SpecOperation")
        void testNonExistentParameterFails() {
            // Reference 'nonExistentParam' which was never added to specOp.ownedParameters
            Identifier ref = DactFactory.eINSTANCE.createIdentifier();
            ref.setName("nonExistentParam");

            UnaryExpression expr = DactFactory.eINSTANCE.createUnaryExpression();
            expr.setIdentifier(ref);

            SpecRule rule = DactFactory.eINSTANCE.createSpecRule();
            rule.setName("MissingParamRule");
            rule.setExpr(expr);
            specOp.getOwnedRules().add(rule);

            assertTransformationFails(
            		QVTO_FILE, 
            		root, 
            		tempDir,
            		"VariableYetDeclared");
        }

        @Test
        @DisplayName("Invalid: Property does NOT exist on 'self' DomainObject")
        void testNonExistentPropertyOnSelfFails() {
            // Entity only has no properties, but expression asks for 'self.nonExistentProp'
            Identifier ref = DactFactory.eINSTANCE.createIdentifier();
            ref.setName("self.nonExistentProp");

            UnaryExpression expr = DactFactory.eINSTANCE.createUnaryExpression();
            expr.setIdentifier(ref);

            SpecRule rule = DactFactory.eINSTANCE.createSpecRule();
            rule.setName("MissingPropertyRule");
            rule.setExpr(expr);
            specOp.getOwnedRules().add(rule);

            assertTransformationFails(
            		QVTO_FILE, 
            		root, 
            		tempDir,
            		"InvalidIdentifierAccess");
        }

        @Test
        @DisplayName("Invalid: Property exist on 'self' DomainObject but property path chains primitive type property")
        void testInvalidPropertyPathType() throws Exception {
        	// Add existing boolean property to entity: customer.isActive: BOOL[1..1]
            Property isActiveProp = DactFactory.eINSTANCE.createProperty();
            isActiveProp.setName("isActive");
            isActiveProp.setType(BOOL);
            isActiveProp.setLowerBound(1);
            isActiveProp.setUpperBound(1);
            entity.getOwnedProperties().add(isActiveProp);

            // Expression referencing self.isActive
            Identifier ref = DactFactory.eINSTANCE.createIdentifier();
            ref.setName("self.isActive.test");

            UnaryExpression expr = DactFactory.eINSTANCE.createUnaryExpression();
            expr.setIdentifier(ref);

            SpecRule rule = DactFactory.eINSTANCE.createSpecRule();
            rule.setName("SelfPropertyRule");
            rule.setExpr(expr);
            specOp.getOwnedRules().add(rule);

            assertTransformationFails(
            		QVTO_FILE, 
            		root, 
            		tempDir,
            		"InvalidIdentifierAccess");
        }
        
        @Test
        @DisplayName("Invalid: Property exist on 'self' DomainObject but property path chains non existing child")
        void testInvalidPropertyPathSubNotExists() throws Exception {
        	// Add existing boolean property to entity: customer.isActive: BOOL[1..1]
            ValueObject profile = DactFactory.eINSTANCE.createValueObject();
            profile.setName("UserProfile");
            Property customerName = DactFactory.eINSTANCE.createProperty();
            customerName.setName("name");
            profile.getOwnedProperties().add(customerName);
            context.getOwnedElements().add(profile);
            
        	Property profileProp = DactFactory.eINSTANCE.createProperty();
        	profileProp.setName("profile");
        	profileProp.setType(profile);
        	profileProp.setLowerBound(1);
        	profileProp.setUpperBound(1);
            entity.getOwnedProperties().add(profileProp);

            // Expression referencing self.isActive
            Identifier ref = DactFactory.eINSTANCE.createIdentifier();
            ref.setName("self.profile.name1");

            UnaryExpression expr = DactFactory.eINSTANCE.createUnaryExpression();
            expr.setIdentifier(ref);

            SpecRule rule = DactFactory.eINSTANCE.createSpecRule();
            rule.setName("SelfPropertyRule");
            rule.setExpr(expr);
            specOp.getOwnedRules().add(rule);

            assertTransformationFails(
            		QVTO_FILE, 
            		root, 
            		tempDir,
            		"InvalidIdentifierAccess");
        }
        
        // --- Result Type & Multiplicity Failures ---

        @Test
        @DisplayName("Invalid: Identifier exists but returns Non-Boolean (INT) -> Triggers assert fatal")
        void testPropertyReturningNonBooleanFails() {
            Property ageProp = DactFactory.eINSTANCE.createProperty();
            ageProp.setName("age");
            ageProp.setType(INT);
            ageProp.setLowerBound(1);
            ageProp.setUpperBound(1);
            entity.getOwnedProperties().add(ageProp);

            Identifier ref = DactFactory.eINSTANCE.createIdentifier();
            ref.setName("self.age");

            UnaryExpression expr = DactFactory.eINSTANCE.createUnaryExpression();
            expr.setIdentifier(ref);

            SpecRule rule = DactFactory.eINSTANCE.createSpecRule();
            rule.setName("NonBooleanPropertyRule");
            rule.setExpr(expr);
            specOp.getOwnedRules().add(rule);

            assertTransformationFails(
            		QVTO_FILE, 
            		root, 
            		tempDir,
            		"NonBooleanSpecificationRule");
        }
    }
   
    // ------------------------------------------------------------------
    // Step 1.3: Variable Resolution
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Step 1.3: Variable Resolution")
    class VariableResolution{
    	Activity activity;
    	ActivityGroup rootGroup;
    	Scope rootScope;
    	InitialNode rootInitial;
		StructuredActivityNodeServices structuredNodeSrv ;
		
    	@BeforeEach
    	void setup() {
    		activity = DactFactory.eINSTANCE.createActivity();
    		activity.setName("Test Activity");
    		root.getActivity().getActivities().add(activity);
    		
    		rootGroup = DactFactory.eINSTANCE.createActivityGroup();
    		rootGroup.setName("Root");
    		activity.setRoot(rootGroup);
    		
    		rootScope = DactFactory.eINSTANCE.createScope();
    		rootGroup.setScope(rootScope);
    		
    		rootInitial = DactFactory.eINSTANCE.createInitialNode();
    		rootGroup.getOwnedNodes().add(rootInitial);
    		
    		structuredNodeSrv = new StructuredActivityNodeServices();
    	}
    	
    	@Nested
    	@DisplayName("Control Flow Traversal - Strong Robust")
    	class ControlFlowTraversal{
    		@Test
    		@DisplayName("Valid: Root Group + Explicit Final Node")
    		void RootGroupAndExplicitFinalNode() {
    			ActivityFinalNode finalNode = DactFactory.eINSTANCE.createActivityFinalNode();
    			ActivityEdge edge= DactFactory.eINSTANCE.createActivityEdge();
    			edge.setSource(rootInitial);
    			edge.setTarget(finalNode);
    			rootGroup.getOwnedNodes().add(finalNode);
    			rootGroup.getOwnedEdges().add(edge);
    			
    			assertTransformationPasses(QVTO_FILE, root, tempDir);
    		}
    		
    		@Test
    		@DisplayName("Invalid: Root Group + Dead-end")
    		void RootGroupAndNonExplicitFinalNode() {
    			assertTransformationFails(QVTO_FILE, root, tempDir,"TraversalDeadEnd");
    		}
    		
    		@Test
    		@DisplayName("Valid: Conditional Body Group + Unwind to Parent")
    		void ConditionalBodyAndUnwind() {
    			// Create a new conditional node: Init -> Conditional Node -> Final Node
    			ConditionalNode cnode = structuredNodeSrv.createANewConditionalNode(rootGroup);
    			assertNotNull(cnode.getBody());
    			assertNotNull(cnode.getElseBody());
    			ActivityFinalNode finalNode = DactFactory.eINSTANCE.createActivityFinalNode();
    			ActivityEdge edge1 = DactFactory.eINSTANCE.createActivityEdge();
    			edge1.setEdgeName("edge1");
    			edge1.setSource(rootInitial);
    			edge1.setTarget(cnode);
    			
    			ActivityEdge edge2 = DactFactory.eINSTANCE.createActivityEdge();
    			edge2.setEdgeName("edge2");
    			edge2.setSource(cnode);
    			edge2.setTarget(finalNode);
    			rootGroup.getOwnedNodes().add(cnode);
    			rootGroup.getOwnedNodes().add(finalNode);
    			rootGroup.getOwnedEdges().add(edge1);
    			rootGroup.getOwnedEdges().add(edge2);
    			
    			// Create a variable in the root scope
    			Variable var1 = DactFactory.eINSTANCE.createVariable();
    			var1.setName("var1");
    			rootScope.getOwnedVariables().add(var1);
    			System.out.println("Root var" + rootScope.getOwnedVariables());
    			System.out.println("Root var" + rootScope.getInheritedVariables());
    			
    			// Create a variable in the main body of the structured node
    			Variable var2 = DactFactory.eINSTANCE.createVariable();
    			var2.setName("var2");
    			ActivityGroup cBody = cnode.getBody();
    			cBody.getScope().getOwnedVariables().add(var2);
    			System.out.println("Con var" + cBody.getScope().getOwnedVariables());
    			
    			// Create a simple group with main body
    			InitialNode nestedInitial = DactFactory.eINSTANCE.createInitialNode();
    			FlowFinalNode nestedFinalNode = DactFactory.eINSTANCE.createFlowFinalNode();
    			ActivityEdge nestedEdge = DactFactory.eINSTANCE.createActivityEdge();
    			nestedEdge.setEdgeName("nestedEdge");
    			nestedEdge.setSource(nestedInitial);
    			nestedEdge.setTarget(nestedFinalNode);
    			cBody.getOwnedNodes().add(nestedInitial);
    			cBody.getOwnedNodes().add(nestedFinalNode);
    			cBody.getOwnedEdges().add(nestedEdge);
    			
    			// Assert run no error
    			var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);
    			System.out.print(pRoot);
    			// Assert variable scope
    			var pActivity = pRoot.getActivity().getActivities().get(0);
    			var pRootGroup = pActivity.getRoot();
    			ConditionalNode pCNode = pRootGroup.getOwnedNodes().stream()
    					.filter(ConditionalNode.class::isInstance)
    					.map(ConditionalNode.class::cast)
    					.findFirst()
    					.orElse(null);
    			assertNotNull(pCNode);
    			var pCBodyScope = pCNode.getBody().getScope();
    			var pCElseBodyScope = pCNode.getElseBody().getScope();

    			// Variable 1 is inherited by both bodies
    			System.out.println("P Body inherited var" + pCBodyScope.getInheritedVariables());
    			System.out.println("P ElseBody inherited var" + pCElseBodyScope.getInheritedVariables());
    			var pBodyVar1 = pCBodyScope.getInheritedVariables().get(0);
    			var pElseBodyVar1 = pCElseBodyScope.getInheritedVariables().get(0);
    			
    			assertEquals(pBodyVar1.getName(),"var1","var1 must be inherited and accessible from the Body of ConditionalNode");
    			assertEquals(pElseBodyVar1.getName(),"var1","var1 must be inherited and accessible from the ElseBody of ConditionalNode");
    			
    			// Variable 2 is accessible from main body only
    			System.out.println("P Body var" + pCBodyScope.getOwnedVariables());
    			System.out.println("P ElseBody var" + pCElseBodyScope.getOwnedVariables());
    			var pBodyVar2 = pCBodyScope.getOwnedVariables().get(0);
    			
    			assertEquals(pBodyVar2.getName(),"var2", "var2 must be accessible from the Body of ConditionalNode");
    			assertEquals(pCElseBodyScope.getOwnedVariables().size(),0, "var2 must not be accessible from the ElseBody of ConditionalNode");
    			
    		}
    		
    		@Test
    		@DisplayName("Invalid: Conditional ElseBody Group + Dead-end")
    		void ConditionalBodyAndDeadedn() {
    			// Create a new conditional node: Init -> Conditional Node -> Final Node
    			ConditionalNode cnode = structuredNodeSrv.createANewConditionalNode(rootGroup);
    			assertNotNull(cnode.getBody());
    			assertNotNull(cnode.getElseBody());
    			ActivityFinalNode finalNode = DactFactory.eINSTANCE.createActivityFinalNode();
    			ActivityEdge edge1 = DactFactory.eINSTANCE.createActivityEdge();
    			edge1.setEdgeName("edge1");
    			edge1.setSource(rootInitial);
    			edge1.setTarget(cnode);
    			
    			ActivityEdge edge2 = DactFactory.eINSTANCE.createActivityEdge();
    			edge2.setEdgeName("edge2");
    			edge2.setSource(cnode);
    			edge2.setTarget(finalNode);
    			rootGroup.getOwnedNodes().add(cnode);
    			rootGroup.getOwnedNodes().add(finalNode);
    			rootGroup.getOwnedEdges().add(edge1);
    			rootGroup.getOwnedEdges().add(edge2);
    			
    			// Create a variable in the root scope
    			Variable var1 = DactFactory.eINSTANCE.createVariable();
    			var1.setName("var1");
    			rootScope.getOwnedVariables().add(var1);
    			System.out.println("Root var" + rootScope.getOwnedVariables());
    			System.out.println("Root var" + rootScope.getInheritedVariables());
    			
    			// Create a variable in the main body of the structured node
    			Variable var2 = DactFactory.eINSTANCE.createVariable();
    			var2.setName("var2");
    			ActivityGroup cBody = cnode.getBody();
    			cBody.getScope().getOwnedVariables().add(var2);
    			System.out.println("Con var" + cBody.getScope().getOwnedVariables());
    			
    			// Create a simple group with main body
    			InitialNode nestedInitial = DactFactory.eINSTANCE.createInitialNode();
    			cBody.getOwnedNodes().add(nestedInitial);
    			
    			// Assert run no error
    			assertTransformationFails(QVTO_FILE, root, tempDir,"TraversalDeadEnd");
    			
    		}
    		
    		@Test
    		@DisplayName("Valid: Conditional ElseBody Group + Unwind to Parent")
    		void ConditionalElseBodyAndUnwind() {
    			// Create a new conditional node: Init -> Conditional Node -> Final Node
    			ConditionalNode cnode = structuredNodeSrv.createANewConditionalNode(rootGroup);
    			assertNotNull(cnode.getBody());
    			assertNotNull(cnode.getElseBody());
    			ActivityFinalNode finalNode = DactFactory.eINSTANCE.createActivityFinalNode();
    			ActivityEdge edge1 = DactFactory.eINSTANCE.createActivityEdge();
    			edge1.setEdgeName("edge1");
    			edge1.setSource(rootInitial);
    			edge1.setTarget(cnode);
    			
    			ActivityEdge edge2 = DactFactory.eINSTANCE.createActivityEdge();
    			edge2.setEdgeName("edge2");
    			edge2.setSource(cnode);
    			edge2.setTarget(finalNode);
    			rootGroup.getOwnedNodes().add(cnode);
    			rootGroup.getOwnedNodes().add(finalNode);
    			rootGroup.getOwnedEdges().add(edge1);
    			rootGroup.getOwnedEdges().add(edge2);
    			
    			// Create a variable in the root scope
    			Variable var1 = DactFactory.eINSTANCE.createVariable();
    			var1.setName("var1");
    			rootScope.getOwnedVariables().add(var1);
    			System.out.println("Root var" + rootScope.getOwnedVariables());
    			System.out.println("Root var" + rootScope.getInheritedVariables());
    			
    			// Create a variable in the else body of the structured node
    			Variable var2 = DactFactory.eINSTANCE.createVariable();
    			var2.setName("var2");
    			ActivityGroup cElseBody = cnode.getElseBody();
    			cElseBody.getScope().getOwnedVariables().add(var2);
    			System.out.println("Con var" + cElseBody.getScope().getOwnedVariables());
    			
    			// Create a simple group with main body
    			InitialNode nestedInitial = DactFactory.eINSTANCE.createInitialNode();
    			FlowFinalNode nestedFinalNode = DactFactory.eINSTANCE.createFlowFinalNode();
    			ActivityEdge nestedEdge = DactFactory.eINSTANCE.createActivityEdge();
    			nestedEdge.setEdgeName("nestedEdge");
    			nestedEdge.setSource(nestedInitial);
    			nestedEdge.setTarget(nestedFinalNode);
    			cElseBody.getOwnedNodes().add(nestedInitial);
    			cElseBody.getOwnedNodes().add(nestedFinalNode);
    			cElseBody.getOwnedEdges().add(nestedEdge);
    			
    			// Assert run no error
    			var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);
    			System.out.print(pRoot);
    			// Assert variable scope
    			var pActivity = pRoot.getActivity().getActivities().get(0);
    			var pRootGroup = pActivity.getRoot();
    			ConditionalNode pCNode = pRootGroup.getOwnedNodes().stream()
    					.filter(ConditionalNode.class::isInstance)
    					.map(ConditionalNode.class::cast)
    					.findFirst()
    					.orElse(null);
    			assertNotNull(pCNode);
    			var pCBodyScope = pCNode.getBody().getScope();
    			var pCElseBodyScope = pCNode.getElseBody().getScope();

    			// Variable 1 is inherited by both bodies
    			System.out.println("P Body inherited var" + pCBodyScope.getInheritedVariables());
    			System.out.println("P ElseBody inherited var" + pCElseBodyScope.getInheritedVariables());
    			var pBodyVar1 = pCBodyScope.getInheritedVariables().get(0);
    			var pElseBodyVar1 = pCElseBodyScope.getInheritedVariables().get(0);
    			
    			assertEquals(pBodyVar1.getName(),"var1","var1 must be inherited and accessible from the Body of ConditionalNode");
    			assertEquals(pElseBodyVar1.getName(),"var1","var1 must be inherited and accessible from the ElseBody of ConditionalNode");
    			
    			// Variable 2 is accessible from else body only
    			System.out.println("P Body var" + pCBodyScope.getOwnedVariables());
    			System.out.println("P ElseBody var" + pCElseBodyScope.getOwnedVariables());
    			var pElseBodyVar2 = pCElseBodyScope.getOwnedVariables().get(0);
    			
    			assertEquals(pCBodyScope.getOwnedVariables().size(),0, "var2 must not be accessible from the Body of ConditionalNode");
    			assertEquals(pElseBodyVar2.getName(),"var2", "var2 must be accessible from the ElseBody of ConditionalNode");
    			
    		}
    		
    		@Test
    		@DisplayName("Invalid: Conditional ElseBody Group + Dead-end")
    		void ConditionalElseBodyAndDeadedn() {
    	
    			// Create a new conditional node: Init -> Conditional Node -> Final Node
    			ConditionalNode cnode = structuredNodeSrv.createANewConditionalNode(rootGroup);
    			assertNotNull(cnode.getBody());
    			assertNotNull(cnode.getElseBody());
    			ActivityFinalNode finalNode = DactFactory.eINSTANCE.createActivityFinalNode();
    			ActivityEdge edge1 = DactFactory.eINSTANCE.createActivityEdge();
    			edge1.setEdgeName("edge1");
    			edge1.setSource(rootInitial);
    			edge1.setTarget(cnode);
    			
    			ActivityEdge edge2 = DactFactory.eINSTANCE.createActivityEdge();
    			edge2.setEdgeName("edge2");
    			edge2.setSource(cnode);
    			edge2.setTarget(finalNode);
    			rootGroup.getOwnedNodes().add(cnode);
    			rootGroup.getOwnedNodes().add(finalNode);
    			rootGroup.getOwnedEdges().add(edge1);
    			rootGroup.getOwnedEdges().add(edge2);
    			
    			// Create a variable in the root scope
    			Variable var1 = DactFactory.eINSTANCE.createVariable();
    			var1.setName("var1");
    			rootScope.getOwnedVariables().add(var1);
    			System.out.println("Root var" + rootScope.getOwnedVariables());
    			System.out.println("Root var" + rootScope.getInheritedVariables());
    			
    			// Create a variable in the else body of the structured node
    			Variable var2 = DactFactory.eINSTANCE.createVariable();
    			var2.setName("var2");
    			ActivityGroup cElseBody = cnode.getBody();
    			cElseBody.getScope().getOwnedVariables().add(var2);
    			System.out.println("Con var" + cElseBody.getScope().getOwnedVariables());
    			
    			// Create a simple group with main body
    			InitialNode nestedInitial = DactFactory.eINSTANCE.createInitialNode();
    			cElseBody.getOwnedNodes().add(nestedInitial);
    			
    			// Assert run with error
    			assertTransformationFails(QVTO_FILE, root, tempDir, "TraversalDeadEnd");
    		}
    	}
    	
    	@Nested
    	@DisplayName("Variable Creation - Weak Robust")
    	class VariableCreation{
    		ActivityEdge edge1;
    		ActivityEdge edge2;
    		
    		@BeforeEach
    		void setup() {
    			ActivityFinalNode finalNode = DactFactory.eINSTANCE.createActivityFinalNode();
    			rootGroup.getOwnedNodes().add(finalNode);
    			
    			edge1 = DactFactory.eINSTANCE.createActivityEdge();
    			edge1.setSource(rootInitial);
    			rootGroup.getOwnedEdges().add(edge1);
    			
    			edge2 = DactFactory.eINSTANCE.createActivityEdge();
    			edge2.setTarget(finalNode);
    			rootGroup.getOwnedEdges().add(edge2);
    			
    			// Declare variable
    			VariableDeclarationAction vNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
    			VariableAssignment assignment = DactFactory.eINSTANCE.createVariableAssignment();
    			Identifier identifier = DactFactory.eINSTANCE.createIdentifier();
    			identifier.setName("var1");
    			assignment.setIdentifier(identifier);
    			vNode.setType(BOOL);
    			vNode.setLowerBound(0);
    			vNode.setUpperBound(1);
    			vNode.setDeclaration(assignment);
    			
    			rootGroup.getOwnedNodes().add(vNode);
    			edge1.setTarget(vNode);
    			edge2.setSource(vNode);	
    		}
    		
    		@Test
    		@DisplayName("Valid: Variable has not existed")
    		void CreateANewVariable() {
    			// Assert run no error
    			var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);
    			
    			var pActivity = pRoot.getActivity().getActivities().get(0);
    			var pScope = pActivity.getRoot().getScope();
    			var pVar = pScope.getOwnedVariables().get(0);
    			
    			assertEquals(pVar.getName(),"var1","A variable must be created with name 'var1'");
    			assertTrue(pVar.getType() instanceof BooleanType,"A variable must be created with type BOOL");
    			assertEquals(pVar.getLowerBound(),0,"A variable must be created with lower bound of 0");
    			assertEquals(pVar.getUpperBound(),1,"A variable must be created with upper bound of 1");
    			
    		}
    		
    		@Test
    		@DisplayName("Invalid: Variable has existed")
    		void CreateDuplicateVariable() {
    			// Create a variable before hand
    			Variable var1 = DactFactory.eINSTANCE.createVariable();
    			var1.setName("var1");
    			var1.setLowerBound(0);
    			var1.setUpperBound(1);
    			var1.setType(BOOL);
    			rootScope.getOwnedVariables().add(var1);
    			
    			// Assert error
    			assertTransformationFails(QVTO_FILE, root, tempDir,"DuplicateVariable");
    		}
    	}
    	
    	@Nested
    	@DisplayName("Variable Lookup - Weak Robust")
    	class VariableLookup{
    		Variable var1;
    		VariableAssignmentAction varAssignmentNode;
    		ActivityFinalNode rootFinal;
    		
    		@BeforeEach
    		void setup() {
    			varAssignmentNode = DactFactory.eINSTANCE.createVariableAssignmentAction();
    			VariableAssignment va = DactFactory.eINSTANCE.createVariableAssignment();
    			Identifier identifier = DactFactory.eINSTANCE.createIdentifier();
    			identifier.setName("var1");
    			va.setIdentifier(identifier);
    			varAssignmentNode.setAssignment(va);
    			
    			rootFinal = DactFactory.eINSTANCE.createActivityFinalNode();
    			rootGroup.getOwnedNodes().add(rootFinal);
    		}
    		
    		void createVariable() {
    			var1 = DactFactory.eINSTANCE.createVariable();
    			var1.setName("var1");
    			var1.setLowerBound(0);
    			var1.setUpperBound(1);
    			var1.setType(BOOL);
    			rootScope.getOwnedVariables().add(var1);
    		}
    		@Test
    		@DisplayName("Valid: Exists in Immediate Scope")
    		void VariableExistsInImmediateScope() {
    			// Add Variable in the scope
    			createVariable();
    			
    			// Add Node tin the Root group
    			rootGroup.getOwnedNodes().add(varAssignmentNode);
    			
    			// Variable Assignment
    			ActivityEdge edge1 = DactFactory.eINSTANCE.createActivityEdge();
    			edge1.setSource(rootInitial);
    			edge1.setTarget(varAssignmentNode);
    			rootGroup.getOwnedEdges().add(edge1);
    			
    			ActivityEdge edge2 = DactFactory.eINSTANCE.createActivityEdge();
    			edge2.setSource(varAssignmentNode);
    			edge2.setTarget(rootFinal);
    			rootGroup.getOwnedEdges().add(edge2);
    			
    			// Assert run no error
    			assertTransformationPasses(QVTO_FILE, root, tempDir);
    		}
    		
    		@Test
    		@DisplayName("Valid: Exists in Inherited Scope")
    		void VariablsExistsInInheritedScope() {
    			// Add Variable in the scope
    			createVariable();
    			
    			// Create a conditional node
    			ConditionalNode cNode = structuredNodeSrv.createANewConditionalNode(rootGroup);
    			rootGroup.getOwnedNodes().add(cNode);
    			
    			// Variable Assignment
    			ActivityEdge edge1 = DactFactory.eINSTANCE.createActivityEdge();
    			edge1.setSource(rootInitial);
    			edge1.setTarget(cNode);
    			rootGroup.getOwnedEdges().add(edge1);
    			
    			ActivityEdge edge2 = DactFactory.eINSTANCE.createActivityEdge();
    			edge2.setSource(cNode);
    			edge2.setTarget(rootFinal);
    			rootGroup.getOwnedEdges().add(edge2);
    			
    			// Create Body flow
    			ActivityGroup cBody = cNode.getBody();
    			cBody.getOwnedNodes().add(varAssignmentNode);
    			
    			InitialNode nestedInitial = DactFactory.eINSTANCE.createInitialNode();
    			FlowFinalNode nestedFinal = DactFactory.eINSTANCE.createFlowFinalNode();
    			cBody.getOwnedNodes().add(nestedInitial);
    			cBody.getOwnedNodes().add(nestedFinal);
    			
    			ActivityEdge nestedEdge1 = DactFactory.eINSTANCE.createActivityEdge();
    			nestedEdge1.setSource(nestedInitial);
    			nestedEdge1.setTarget(varAssignmentNode);
    			cBody.getOwnedEdges().add(nestedEdge1);
    			
    			ActivityEdge nestedEdge2 = DactFactory.eINSTANCE.createActivityEdge();
    			nestedEdge2.setSource(varAssignmentNode);
    			nestedEdge2.setTarget(nestedFinal);
    			cBody.getOwnedEdges().add(nestedEdge2);
    			
    			// Assert run with no error
    			assertTransformationPasses(QVTO_FILE, root, tempDir);
    		}
    		
    		@Test
    		@DisplayName("Invalid: Yet Declared")
    		void VariableYetDeclared() {
    			// Add Node tin the Root group
    			rootGroup.getOwnedNodes().add(varAssignmentNode);
    			
    			// Variable Assignment
    			ActivityEdge edge1 = DactFactory.eINSTANCE.createActivityEdge();
    			edge1.setSource(rootInitial);
    			edge1.setTarget(varAssignmentNode);
    			rootGroup.getOwnedEdges().add(edge1);
    			
    			ActivityEdge edge2 = DactFactory.eINSTANCE.createActivityEdge();
    			edge2.setSource(varAssignmentNode);
    			edge2.setTarget(rootFinal);
    			rootGroup.getOwnedEdges().add(edge2);
    			
    			// Assert run with error
    			assertTransformationFails(QVTO_FILE, root, tempDir,"VariableYetDeclared");
    		}
    	}
    }

    // ------------------------------------------------------------------
    // Step 1.4: Domain Node Conversion
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Step 1.4: Domain Node Conversion - Weak Robust")
    class DomainNodeConversion{
    	DomainNode dNode;
    	AggregateRoot customer;
    	DomainNodeServices dnSrv;
    	ActivityEdge edge1;
    	ActivityEdge edge2;
    	ActivityGroup rootGroup;
    	Activity activity;
    	
    	@BeforeEach
    	void setup() {
    		dnSrv = new DomainNodeServices();
    		
    		// Ddd
    		BoundedContext customerContext = DactFactory.eINSTANCE.createBoundedContext();
    		customerContext.setName("Customer");
    		root.getDdd().getBoundedContexts().add(customerContext);
    		customer = DactFactory.eINSTANCE.createAggregateRoot();
    		customer.setName("Customer");
    		customerContext.getOwnedElements().add(customer);
    		String[] propNames = {"customerId","name","email"};
    		for(String propName:propNames) {
    			Property prop = DactFactory.eINSTANCE.createProperty();
    			prop.setName(propName);
    			prop.setType(STR);
    			prop.setLowerBound(1);
    			prop.setUpperBound(1);
    			if (propName == "customerId") {
    				prop.setDefinesIdentity(true);
    			};
    			customer.getOwnedProperties().add(prop);
    		}
    		
    		// Activity
    		ActivityServices activitySrv = new ActivityServices();
    		
    		activity = activitySrv.createANewActivity(root.getActivity());
    		rootGroup = activity.getRoot();
    		
    		InitialNode initialNode = DactFactory.eINSTANCE.createInitialNode();
    		rootGroup.getOwnedNodes().add(initialNode);
    		ActivityFinalNode finalNode = DactFactory.eINSTANCE.createActivityFinalNode();
    		rootGroup.getOwnedNodes().add(finalNode);
    		
    		edge1 = DactFactory.eINSTANCE.createActivityEdge();
    		edge1.setSource(initialNode);
    		edge1.setTarget(dNode);
    		rootGroup.getOwnedEdges().add(edge1);
    		
    		edge2 = DactFactory.eINSTANCE.createActivityEdge();
    		edge2.setSource(dNode);
    		edge2.setTarget(finalNode);
    		rootGroup.getOwnedEdges().add(edge2);		
    	}
    	
    	void connectDomainNode(DomainNode dNode) {
    		edge1.setTarget(dNode);
    		edge2.setSource(dNode);
    	}
    	
    	@Nested
    	@DisplayName("Domain Node Type")
    	class DomainNodeType{
    		@Test
    		@DisplayName("Domain Find Action - Single")
    		void TestDomainFindActionSingle() throws DiagnosticException{
    			Parameter param = DactFactory.eINSTANCE.createParameter();
    			param.setName("customerId");
    			param.setType(STR);
    			param.setLowerBound(1);
    			param.setUpperBound(1);
    			param.setDirection(ParameterDirection.IN);
    			activity.getOwnedParameters().add(param);
    			
    			dNode = DactFactory.eINSTANCE.createDomainFindAction();
    			dNode.setAggregate(customer);
    			connectDomainNode(dNode);
    			dNode.setName("Find Customer By Id");
    			dnSrv.updateExpr(dNode, null, "self.customerId == customerId");
    			rootGroup.getOwnedNodes().add(dNode);
    			
    			var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);
    			var pContext = pRoot.getDdd().getBoundedContexts().get(0);
    			assertEquals(pContext.getName(),"Customer");
    			var customerAgg = pContext.getOwnedElements()
    					.stream()
    					.filter(AggregateRoot.class::isInstance)
    					.map(AggregateRoot.class::cast)
    	                .findFirst().orElse(null);
    			assertNotNull(customerAgg);
    			var pRepo = pContext.getOwnedElements()
    					.stream()
    					.filter(Repository.class::isInstance)
    	                .map(Repository.class::cast)
    	                .findFirst().orElse(null);
    			assertEquals(pRepo.getName(),"CustomerRepository");
    			var pOp = pRepo.getOwnedOperations().get(0);
    			assertEquals(pOp.getName(),"findByCustomerId","Repository Operation name is wrong");
    			assertEquals(pOp.getType(),OperationType.R1_REPOSITORY_READ,"Repository Operation type is wrong.");
    			var pInParams = pOp.getOwnedParameters()
    								.stream()
    								.filter(p -> p.getDirection() == ParameterDirection.IN)
    								.toList();
    			assertEquals(pInParams.size(),1,"Repository Operation must have a single IN param");
    			var pInParam = pInParams.get(0);
    			assertEquals(pInParam.getName(),"customerId","In param mismatches");
    			assertTrue(pInParam.getType() instanceof StringType,"'customerId' param must of type string");
    			assertEquals(pInParam.getLowerBound(),1,"'customerId' have lower bound of 1");
    			assertEquals(pInParam.getUpperBound(),1,"'customerId' have upper bound of 1");
    			
    			var pOutParams = pOp.getOwnedParameters()
						.stream()
						.filter(p -> p.getDirection() == ParameterDirection.OUT)
						.toList();
    			assertEquals(pOutParams.size(),1);
    			var pOutParam = pOutParams.get(0);
    			assertEquals("result",pOutParam.getName(),"Out param mismatches");
    			assertEquals(customerAgg,pOutParam.getType(),"'result' param must of type customer");
    			assertEquals(0,pOutParam.getLowerBound(),"'result'must have lower bound of 0");
    			assertEquals(1,pOutParam.getUpperBound(),"'result'must have upper bound of 1");
    		}
    		
    		@Test
    		@DisplayName("Domain Find Action - Multiple")
    		void TestDomainFindActionMulti() throws DiagnosticException {
    			String[] paramNames = {"customerName","customerEmail"};
    			for(String paramName: paramNames) {
	    			Parameter param = DactFactory.eINSTANCE.createParameter();
	    			param.setName(paramName);
	    			param.setType(STR);
	    			param.setLowerBound(1);
	    			param.setUpperBound(1);
	    			param.setDirection(ParameterDirection.IN);
	    			activity.getOwnedParameters().add(param);
    			}
    			
    			dNode = DactFactory.eINSTANCE.createDomainFindAction();
    			dNode.setAggregate(customer);
    			connectDomainNode(dNode);
    			dNode.setName("Find Customer");
    			dnSrv.updateExpr(dNode, null, "self.name == customerName");
    			dnSrv.updateExpr(dNode, null, "self.email == customerEmail");
    			rootGroup.getOwnedNodes().add(dNode);
    			
    			var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);
    			var pContext = pRoot.getDdd().getBoundedContexts().get(0);
    			assertEquals(pContext.getName(),"Customer");
    			var customerAgg = pContext.getOwnedElements()
    					.stream()
    					.filter(AggregateRoot.class::isInstance)
    					.map(AggregateRoot.class::cast)
    	                .findFirst().orElse(null);
    			assertNotNull(customerAgg);
    			var pRepo = pContext.getOwnedElements()
    					.stream()
    					.filter(Repository.class::isInstance)
    	                .map(Repository.class::cast)
    	                .findFirst().orElse(null);
    			assertEquals(pRepo.getName(),"CustomerRepository");
    			var pOp = pRepo.getOwnedOperations().get(0);
    			assertEquals(pOp.getName(),"findByEmailAndName","Repository Operation name is wrong");
    			assertEquals(pOp.getType(),OperationType.R1_REPOSITORY_READ,"Repository Operation type is wrong.");
    			var pInParams = pOp.getOwnedParameters()
    								.stream()
    								.filter(p -> p.getDirection() == ParameterDirection.IN)
    								.toList();
    			assertEquals(pInParams.size(),2,"Repository Operation must have a single IN param");
    			System.out.println("In Param"+pInParams);
    			String[] expectedParamNames = {"name","email"};
    			for (String paramName:expectedParamNames) {
    			    var param = pInParams.stream()
    			    		.filter(p->paramName.equals(p.getName()))
    			    		.findFirst()
    			    		.orElse(null);
    			    assertNotNull(param,"Cannot find param with name '"+paramName+"'");
    			        
    			    assertTrue(param.getType() instanceof StringType, 
    			        "'" + paramName + "' param must be of type StringType");
    			        
    			    assertEquals(1, param.getLowerBound(), 
    			        "'" + paramName + "' lower bound mismatch");
    			        
    			    assertEquals(1, param.getUpperBound(), 
    			        "'" + paramName + "' upper bound mismatch");
    			};
    			
    			var pOutParams = pOp.getOwnedParameters()
						.stream()
						.filter(p -> p.getDirection() == ParameterDirection.OUT)
						.toList();
    			assertEquals(pOutParams.size(),1);
    			var pOutParam = pOutParams.get(0);
    			assertEquals("result",pOutParam.getName(),"Out param mismatches");
    			assertEquals(customerAgg,pOutParam.getType(),"'result' param must of type customer");
    			assertEquals(0,pOutParam.getLowerBound(),"'result'must have lower bound of 0");
    			assertEquals(-1,pOutParam.getUpperBound(),"'result'must have upper bound of -1");
    		}
    		
    		@Test
    		@DisplayName("Domain Exist Action - Single")
    		void TestDomainExistActionSingle() throws DiagnosticException{
    			Parameter param = DactFactory.eINSTANCE.createParameter();
    			param.setName("customerId");
    			param.setType(STR);
    			param.setLowerBound(1);
    			param.setUpperBound(1);
    			param.setDirection(ParameterDirection.IN);
    			activity.getOwnedParameters().add(param);
    			
    			dNode = DactFactory.eINSTANCE.createDomainExistAction();
    			dNode.setAggregate(customer);
    			connectDomainNode(dNode);
    			dNode.setName("Exists By Customer Id");
    			dnSrv.updateExpr(dNode, null, "self.customerId == customerId");
    			rootGroup.getOwnedNodes().add(dNode);
    			
    			var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);
    			var pContext = pRoot.getDdd().getBoundedContexts().get(0);
    			assertEquals(pContext.getName(),"Customer");
    			var customerAgg = pContext.getOwnedElements()
    					.stream()
    					.filter(AggregateRoot.class::isInstance)
    					.map(AggregateRoot.class::cast)
    	                .findFirst().orElse(null);
    			assertNotNull(customerAgg);
    			var pRepo = pContext.getOwnedElements()
    					.stream()
    					.filter(Repository.class::isInstance)
    	                .map(Repository.class::cast)
    	                .findFirst().orElse(null);
    			assertEquals(pRepo.getName(),"CustomerRepository");
    			var pOp = pRepo.getOwnedOperations().get(0);
    			assertEquals("existsByCustomerId",pOp.getName(),"Repository Operation name is wrong");
    			assertEquals(pOp.getType(),OperationType.R4_REPOSITORY_EXIST,"Repository Operation type is wrong.");
    			var pInParams = pOp.getOwnedParameters()
    								.stream()
    								.filter(p -> p.getDirection() == ParameterDirection.IN)
    								.toList();
    			assertEquals(pInParams.size(),1,"Repository Operation must have a single IN param");
    			var pInParam = pInParams.get(0);
    			assertEquals(pInParam.getName(),"customerId","In param mismatches");
    			assertTrue(pInParam.getType() instanceof StringType,"'customerId' param must of type string");
    			assertEquals(pInParam.getLowerBound(),1,"'customerId' have lower bound of 1");
    			assertEquals(pInParam.getUpperBound(),1,"'customerId' have upper bound of 1");
    			
    			var pOutParams = pOp.getOwnedParameters()
						.stream()
						.filter(p -> p.getDirection() == ParameterDirection.OUT)
						.toList();
    			assertEquals(pOutParams.size(),1);
    			var pOutParam = pOutParams.get(0);
    			assertEquals("result",pOutParam.getName(),"Out param mismatches");
    			assertTrue(pOutParam.getType() instanceof BooleanType,"'result' param must of type Boolean");
    			assertEquals(1,pOutParam.getLowerBound(),"'result'must have lower bound of 1");
    			assertEquals(1,pOutParam.getUpperBound(),"'result'must have upper bound of 1");
    		}
    		
    		@Test
    		@DisplayName("Domain Create Action")
    		void TestDomainCreateActionMulti() throws DiagnosticException{
    			Parameter param = DactFactory.eINSTANCE.createParameter();
    			param.setName("customer");
    			param.setType(customer);
    			param.setLowerBound(1);
    			param.setUpperBound(1);
    			param.setDirection(ParameterDirection.IN);
    			activity.getOwnedParameters().add(param);
    			
    			dNode = DactFactory.eINSTANCE.createDomainCreateAction();
    			dNode.setAggregate(customer);
    			connectDomainNode(dNode);
    			dNode.setName("Create Customer");
    			dnSrv.updateExpr(dNode, null, "self == customer");
    			rootGroup.getOwnedNodes().add(dNode);
    			
    			var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);
    			var pContext = pRoot.getDdd().getBoundedContexts().get(0);
    			assertEquals(pContext.getName(),"Customer");
    			var customerAgg = pContext.getOwnedElements()
    					.stream()
    					.filter(AggregateRoot.class::isInstance)
    					.map(AggregateRoot.class::cast)
    	                .findFirst().orElse(null);
    			assertNotNull(customerAgg);
    			var pRepo = pContext.getOwnedElements()
    					.stream()
    					.filter(Repository.class::isInstance)
    	                .map(Repository.class::cast)
    	                .findFirst().orElse(null);
    			assertEquals(pRepo.getName(),"CustomerRepository");
    			var pOp = pRepo.getOwnedOperations().get(0);
    			assertEquals("createCustomer",pOp.getName(),"Repository Operation name is wrong");
    			assertEquals(OperationType.R0_REPOSITORY_CREATE,pOp.getType(),"Repository Operation type is wrong.");
    			var pInParams = pOp.getOwnedParameters()
    								.stream()
    								.filter(p -> p.getDirection() == ParameterDirection.IN)
    								.toList();
    			assertEquals(pInParams.size(),1,"Repository Operation must have a single IN param");
    			var pInParam = pInParams.get(0);
    			assertEquals(pInParam.getName(),"customer","In param mismatches");
    			assertEquals(customerAgg,pInParam.getType(),"'customer' param must of type 'Customer'");
    			assertEquals(pInParam.getLowerBound(),1,"'customer' have lower bound of 1");
    			assertEquals(pInParam.getUpperBound(),1,"'customer' have upper bound of 1");
    			
    			var pOutParams = pOp.getOwnedParameters()
						.stream()
						.filter(p -> p.getDirection() == ParameterDirection.OUT)
						.toList();
    			assertEquals(pOutParams.size(),1);
    			var pOutParam = pOutParams.get(0);
    			assertEquals("result",pOutParam.getName(),"Out param mismatches");
    			assertEquals(customerAgg,pOutParam.getType(),"'result' param must of type 'Customer'");
    			assertEquals(0,pOutParam.getLowerBound(),"'result'must have lower bound of 0");
    			assertEquals(1,pOutParam.getUpperBound(),"'result'must have upper bound of 1");
    		}
    		
    		@Test
    		@DisplayName("Domain Update Action")
    		void TestDomainUpdateActionMulti() throws  DiagnosticException{
    			Parameter param = DactFactory.eINSTANCE.createParameter();
    			param.setName("customer");
    			param.setType(customer);
    			param.setLowerBound(1);
    			param.setUpperBound(1);
    			param.setDirection(ParameterDirection.IN);
    			activity.getOwnedParameters().add(param);
    			
    			dNode = DactFactory.eINSTANCE.createDomainUpdateAction();
    			dNode.setAggregate(customer);
    			connectDomainNode(dNode);
    			dNode.setName("Update Customer");
    			dnSrv.updateExpr(dNode, null, "self == customer");
    			rootGroup.getOwnedNodes().add(dNode);
    			
    			var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);
    			var pContext = pRoot.getDdd().getBoundedContexts().get(0);
    			assertEquals(pContext.getName(),"Customer");
    			var customerAgg = pContext.getOwnedElements()
    					.stream()
    					.filter(AggregateRoot.class::isInstance)
    					.map(AggregateRoot.class::cast)
    	                .findFirst().orElse(null);
    			assertNotNull(customerAgg);
    			var pRepo = pContext.getOwnedElements()
    					.stream()
    					.filter(Repository.class::isInstance)
    	                .map(Repository.class::cast)
    	                .findFirst().orElse(null);
    			assertEquals(pRepo.getName(),"CustomerRepository");
    			var pOp = pRepo.getOwnedOperations().get(0);
    			assertEquals("updateCustomer",pOp.getName(),"Repository Operation name is wrong");
    			assertEquals(OperationType.R2_REPOSITORY_UPDATE,pOp.getType(),"Repository Operation type is wrong.");
    			var pInParams = pOp.getOwnedParameters()
    								.stream()
    								.filter(p -> p.getDirection() == ParameterDirection.IN)
    								.toList();
    			assertEquals(pInParams.size(),1,"Repository Operation must have a single IN param");
    			var pInParam = pInParams.get(0);
    			assertEquals(pInParam.getName(),"customer","In param mismatches");
    			assertEquals(customerAgg,pInParam.getType(),"'customer' param must of type 'Customer'");
    			assertEquals(pInParam.getLowerBound(),1,"'customer' have lower bound of 1");
    			assertEquals(pInParam.getUpperBound(),1,"'customer' have upper bound of 1");
    			
    			var pOutParams = pOp.getOwnedParameters()
						.stream()
						.filter(p -> p.getDirection() == ParameterDirection.OUT)
						.toList();
    			assertEquals(pOutParams.size(),1);
    			var pOutParam = pOutParams.get(0);
    			assertEquals("result",pOutParam.getName(),"Out param mismatches");
    			assertEquals(customerAgg,pOutParam.getType(),"'result' param must of type 'Customer'");
    			assertEquals(0,pOutParam.getLowerBound(),"'result'must have lower bound of 0");
    			assertEquals(1,pOutParam.getUpperBound(),"'result'must have upper bound of 1");
    		}
    		
    		@Test
    		@DisplayName("Domain Delete Action - Single")
    		void TestDomainDeleteActionMulti() throws DiagnosticException{
    			Parameter param = DactFactory.eINSTANCE.createParameter();
    			param.setName("customerId");
    			param.setType(STR);
    			param.setLowerBound(1);
    			param.setUpperBound(1);
    			param.setDirection(ParameterDirection.IN);
    			activity.getOwnedParameters().add(param);
    			
    			dNode = DactFactory.eINSTANCE.createDomainDeleteAction();
    			dNode.setAggregate(customer);
    			connectDomainNode(dNode);
    			dNode.setName("Delete Customer By Id");
    			dnSrv.updateExpr(dNode, null, "self.customerId == customerId");
    			rootGroup.getOwnedNodes().add(dNode);
    			
    			var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);
    			var pContext = pRoot.getDdd().getBoundedContexts().get(0);
    			assertEquals(pContext.getName(),"Customer");
    			var customerAgg = pContext.getOwnedElements()
    					.stream()
    					.filter(AggregateRoot.class::isInstance)
    					.map(AggregateRoot.class::cast)
    	                .findFirst().orElse(null);
    			assertNotNull(customerAgg);
    			var pRepo = pContext.getOwnedElements()
    					.stream()
    					.filter(Repository.class::isInstance)
    	                .map(Repository.class::cast)
    	                .findFirst().orElse(null);
    			assertEquals(pRepo.getName(),"CustomerRepository");
    			var pOp = pRepo.getOwnedOperations().get(0);
    			assertEquals(pOp.getName(),"deleteByCustomerId","Repository Operation name is wrong");
    			assertEquals(pOp.getType(),OperationType.R3_REPOSITORY_DELETE,"Repository Operation type is wrong.");
    			var pInParams = pOp.getOwnedParameters()
    								.stream()
    								.filter(p -> p.getDirection() == ParameterDirection.IN)
    								.toList();
    			assertEquals(pInParams.size(),1,"Repository Operation must have a single IN param");
    			var pInParam = pInParams.get(0);
    			assertEquals(pInParam.getName(),"customerId","In param mismatches");
    			assertTrue(pInParam.getType() instanceof StringType,"'customerId' param must of type string");
    			assertEquals(pInParam.getLowerBound(),1,"'customerId' have lower bound of 1");
    			assertEquals(pInParam.getUpperBound(),1,"'customerId' have upper bound of 1");
    			
    			var pOutParams = pOp.getOwnedParameters()
						.stream()
						.filter(p -> p.getDirection() == ParameterDirection.OUT)
						.toList();
    			assertEquals(pOutParams.size(),1);
    			var pOutParam = pOutParams.get(0);
    			assertEquals("result",pOutParam.getName(),"Out param mismatches");
    			assertEquals(customerAgg,pOutParam.getType(),"'result' param must of type customer");
    			assertEquals(0,pOutParam.getLowerBound(),"'result'must have lower bound of 0");
    			assertEquals(1,pOutParam.getUpperBound(),"'result'must have upper bound of 1");
    		}
    	}
    	
    	@Nested
    	@DisplayName("Operation Existence")
    	class OperationExistence{
    		@Test
    		@DisplayName("Operation Yet Existed")
    		void OperationYetExisted() throws DiagnosticException{
    			Parameter param = DactFactory.eINSTANCE.createParameter();
    			param.setName("customerId");
    			param.setType(STR);
    			param.setLowerBound(1);
    			param.setUpperBound(1);
    			param.setDirection(ParameterDirection.IN);
    			activity.getOwnedParameters().add(param);
    			
    			dNode = DactFactory.eINSTANCE.createDomainFindAction();
    			dNode.setAggregate(customer);
    			connectDomainNode(dNode);
    			dNode.setName("Find Customer By Id");
    			dnSrv.updateExpr(dNode, null, "self.customerId == customerId");
    			rootGroup.getOwnedNodes().add(dNode);
    			
    			var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);
    			var pContext = pRoot.getDdd().getBoundedContexts().get(0);
    			assertEquals(pContext.getName(),"Customer");
    			var customerAgg = pContext.getOwnedElements()
    					.stream()
    					.filter(AggregateRoot.class::isInstance)
    					.map(AggregateRoot.class::cast)
    	                .findFirst().orElse(null);
    			assertNotNull(customerAgg);
    			var pRepo = pContext.getOwnedElements()
    					.stream()
    					.filter(Repository.class::isInstance)
    	                .map(Repository.class::cast)
    	                .findFirst().orElse(null);
    			assertEquals(pRepo.getName(),"CustomerRepository");
    			var pOp = pRepo.getOwnedOperations().get(0);
    			
    			var pActivity = pRoot.getActivity().getActivities().get(0);
    			assertNotNull(pActivity);
    			var pRootGroup = pActivity.getRoot();
    			var pCallOpAction = pRootGroup.getOwnedNodes()
    					.stream()
    					.filter(CallOperationAction.class::isInstance)
    					.map(CallOperationAction.class::cast)
    					.findFirst()
    					.orElse(null);
    			assertNotNull(pCallOpAction);
    			assertEquals(pOp,pCallOpAction.getOperation(),"Operation must match");
    			
    			var pInitNode = pRootGroup.getOwnedNodes()
    					.stream()
    					.filter(InitialNode.class::isInstance)
    					.map(InitialNode.class::cast)
    					.findFirst()
    					.orElse(null);
    			assertNotNull(pInitNode);
    			
    			var pFinalNode = pRootGroup.getOwnedNodes()
    					.stream()
    					.filter(FinalNode.class::isInstance)
    					.map(FinalNode.class::cast)
    					.findFirst()
    					.orElse(null);
    			assertNotNull(pFinalNode);
    			assertEquals(pInitNode, pCallOpAction.getTEdge().getSource(),"InitialNode must be before CallOperationNode");
    			assertEquals(pFinalNode, pCallOpAction.getSEdge().getTarget(),"FinalNode must be after CallOperationNode");
    		}
    		
    		@Test
    		@DisplayName("Operation Exists")
    		void OperationExists() throws DiagnosticException{
    			Parameter param = DactFactory.eINSTANCE.createParameter();
    			param.setName("customerId");
    			param.setType(STR);
    			param.setLowerBound(1);
    			param.setUpperBound(1);
    			param.setDirection(ParameterDirection.IN);
    			activity.getOwnedParameters().add(param);
    			
    			dNode = DactFactory.eINSTANCE.createDomainFindAction();
    			dNode.setAggregate(customer);
    			dNode.setName("Find Customer By Id");
    			dnSrv.updateExpr(dNode, null, "self.customerId == customerId");
    			rootGroup.getOwnedNodes().add(dNode);
    			
    			var dNodeDup = DactFactory.eINSTANCE.createDomainFindAction();
    			dNodeDup.setAggregate(customer);
    			dNodeDup.setName("Find Customer By Id Dup");
    			dnSrv.updateExpr(dNodeDup, null, "self.customerId == customerId");
    			rootGroup.getOwnedNodes().add(dNodeDup);
    			
    			var newEdge = DactFactory.eINSTANCE.createActivityEdge();
    			rootGroup.getOwnedEdges().add(newEdge);
    			
    			edge1.setTarget(dNode);
    			newEdge.setSource(dNode);
    			newEdge.setTarget(dNodeDup);
    			edge2.setSource(dNodeDup);
    			
    			var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);
    			var pContext = pRoot.getDdd().getBoundedContexts().get(0);
    			assertEquals(pContext.getName(),"Customer");
    			var customerAgg = pContext.getOwnedElements()
    					.stream()
    					.filter(AggregateRoot.class::isInstance)
    					.map(AggregateRoot.class::cast)
    	                .findFirst().orElse(null);
    			assertNotNull(customerAgg);
    			var pRepo = pContext.getOwnedElements()
    					.stream()
    					.filter(Repository.class::isInstance)
    	                .map(Repository.class::cast)
    	                .findFirst().orElse(null);
    			assertEquals(pRepo.getName(),"CustomerRepository");
    			assertEquals(1,pRepo.getOwnedOperations().size(),"Operation must be created once.");
    			var pOp = pRepo.getOwnedOperations().get(0);
    			
    			var pActivity = pRoot.getActivity().getActivities().get(0);
    			assertNotNull(pActivity);
    			var pRootGroup = pActivity.getRoot();
    			var pCallOpActions = pRootGroup.getOwnedNodes()
    					.stream()
    					.filter(CallOperationAction.class::isInstance)
    					.map(CallOperationAction.class::cast)
    					.toList();
    			assertEquals(2,pCallOpActions.size());
    			for (CallOperationAction node: pCallOpActions) {
    				assertEquals(pOp,node.getOperation(),"Operation must match");
    			}
    		}
    	}
    	
    	@Nested
    	@DisplayName("Variable Existence")
    	class VariableExistence{
    		@BeforeEach
    		void createNode() throws DiagnosticException{
    			Parameter param = DactFactory.eINSTANCE.createParameter();
    			param.setName("customerId");
    			param.setType(STR);
    			param.setLowerBound(1);
    			param.setUpperBound(1);
    			param.setDirection(ParameterDirection.IN);
    			activity.getOwnedParameters().add(param);
    			
    			dNode = DactFactory.eINSTANCE.createDomainExistAction();
    			dNode.setAggregate(customer);
    			connectDomainNode(dNode);
    			dNode.setName("Exist By Customer Id");
    			Identifier identifier = DactFactory.eINSTANCE.createIdentifier();
    			identifier.setName("customerExists");
    			dNode.setResult(identifier);
    			dnSrv.updateExpr(dNode, null, "self.customerId == customerId");
    			rootGroup.getOwnedNodes().add(dNode);
    			
    		}
    		
    		@Test
    		@DisplayName("Variable Yet Existed")
    		void VariableYetExisted() {
    			var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);
    			var pActivity = pRoot.getActivity().getActivities().get(0);
    			var pScope = pActivity.getRoot().getScope();
    			assertNotNull(pScope);
    			assertEquals(2,pScope.getOwnedVariables().size()); // 1 for input param, 1 for result
    			var relVar = pScope.getOwnedVariables()
    					.stream()
    					.filter(p->p.getName().equals("customerExists"))
    					.findFirst().orElse(null);
    			assertNotNull(relVar);
    			assertTrue(relVar.getType() instanceof BooleanType);
    			assertEquals(1,relVar.getLowerBound());
    			assertEquals(1,relVar.getUpperBound());
    		}
    		
    		@Test
    		@DisplayName("Variable Exists")
    		void VariableExists() {
    			var customerExists = DactFactory.eINSTANCE.createVariable();
    			customerExists.setName("customerExists");
    			customerExists.setType(BOOL);
    			customerExists.setLowerBound(0);
    			customerExists.setUpperBound(1);
    			rootGroup.getScope().getOwnedVariables().add(customerExists);
    			
    			var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);
    			var pActivity = pRoot.getActivity().getActivities().get(0);
    			var pScope = pActivity.getRoot().getScope();
    			assertNotNull(pScope);
    			assertEquals(2,pScope.getOwnedVariables().size()); // 1 for input param, 1 for the already exists var
    			var relVars = pScope.getOwnedVariables()
    					.stream()
    					.filter(p->p.getName().equals("customerExists"))
    					.toList();
    			assertEquals(1,relVars.size());
    			var relVar = relVars.get(0);
    			assertNotNull(relVar);
    			assertTrue(relVar.getType() instanceof BooleanType);
    			assertEquals(0,relVar.getLowerBound());
    			assertEquals(1,relVar.getUpperBound());
    		}
    	}
    	
    }
    
    // ------------------------------------------------------------------
    // Step 1.5: BoundedContext Assignment
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Step 1.5: BoundedContext Assignment - Weak Robust")
    class BoundedContextAssignment {

        Activity activity;
        ActivityGroup rootGroup;
        BoundedContext customerContext;
        AggregateRoot customer;
        DomainNodeServices dnSrv;
        ActivityEdge edge1;
        ActivityEdge edge2;

        @BeforeEach
        void setup() {
            dnSrv = new DomainNodeServices();

            // 1. Setup DDD Structure (Bounded Context + Aggregate)
            customerContext = DactFactory.eINSTANCE.createBoundedContext();
            customerContext.setName("Customer");
            root.getDdd().getBoundedContexts().add(customerContext);

            customer = DactFactory.eINSTANCE.createAggregateRoot();
            customer.setName("Customer");
            customerContext.getOwnedElements().add(customer);

            String[] propNames = {"customerId", "name", "email"};
            for (String propName : propNames) {
                Property prop = DactFactory.eINSTANCE.createProperty();
                prop.setName(propName);
                prop.setType(STR);
                prop.setLowerBound(1);
                prop.setUpperBound(1);
                if ("customerId".equals(propName)) {
                    prop.setDefinesIdentity(true);
                }
                customer.getOwnedProperties().add(prop);
            }

            // 2. Setup Activity baseline
            ActivityServices activitySrv = new ActivityServices();
            activity = activitySrv.createANewActivity(root.getActivity());
            rootGroup = activity.getRoot();

            InitialNode initialNode = DactFactory.eINSTANCE.createInitialNode();
            rootGroup.getOwnedNodes().add(initialNode);
            ActivityFinalNode finalNode = DactFactory.eINSTANCE.createActivityFinalNode();
            rootGroup.getOwnedNodes().add(finalNode);

            edge1 = DactFactory.eINSTANCE.createActivityEdge();
            edge1.setSource(initialNode);
            rootGroup.getOwnedEdges().add(edge1);

            edge2 = DactFactory.eINSTANCE.createActivityEdge();
            edge2.setTarget(finalNode);
            rootGroup.getOwnedEdges().add(edge2);
        }

        void connectChain(ActivityNode first, ActivityNode second) {
            ActivityEdge middleEdge = DactFactory.eINSTANCE.createActivityEdge();
            middleEdge.setSource(first);
            middleEdge.setTarget(second);
            rootGroup.getOwnedEdges().add(middleEdge);
            
            edge1.setTarget(first);
            edge2.setSource(second);
        }

        @Test
        @DisplayName("Specification Operation Existence - Activity inherits existing operation BoundedContext")
        void testSpecificationOperationExistence() throws DiagnosticException {
            Parameter param2 = DactFactory.eINSTANCE.createParameter();
            param2.setName("targetCustomer");
            param2.setType(customer);
            param2.setLowerBound(1);
            param2.setUpperBound(1);
            param2.setDirection(ParameterDirection.IN);
            activity.getOwnedParameters().add(param2);
            
        	Service srv = DactFactory.eINSTANCE.createService();
            srv.setName("CustomerService");
            customerContext.getOwnedElements().add(srv);
        	Operation op = DactFactory.eINSTANCE.createOperation();
        	op.setName("registerCustomer");
        	op.setType(null);
        	op.setType(OperationType.S0_DOMAIN_SERVICE);
            customer.getOwnedOperations().add(op);
            srv.getOwnedOperations().add(op);
            Parameter opParam = DactFactory.eINSTANCE.createParameter();
            opParam.setName("targetCustomer");
            opParam.setType(customer);
            opParam.setLowerBound(1);
            opParam.setUpperBound(1);
            opParam.setDirection(ParameterDirection.IN);
            op.getOwnedParameters().add(opParam);
            
            
            ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
            mapping.setActivityParameter(param2);
            mapping.setOperationParameter(opParam);
            activity.getParameterMappings().add(mapping);
            activity.setSpecification(op);

            DomainCreateAction createAction = DactFactory.eINSTANCE.createDomainCreateAction();
            createAction.setName("Create Customer Action");
            createAction.setAggregate(customer);
            dnSrv.updateExpr(createAction, null, "self == targetCustomer");
            rootGroup.getOwnedNodes().add(createAction);

            edge1.setTarget(createAction);
            edge2.setSource(createAction);

            var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);
            var pContext = pRoot.getDdd().getBoundedContexts().get(0);
            assertEquals("Customer", pContext.getName(), "BoundedContext name mismatch");

            var pActivity = pRoot.getActivity().getActivities().get(0);
            assertNotNull(pActivity.getSpecification(), "Activity specification operation should be set");
            assertEquals("registerCustomer", pActivity.getSpecification().getName(), "Activity should point to pre-existing operation");
        }

        @Test
        @DisplayName("Domain Node Composition - Mixture Dominated by Mutating Node")
        void testMixtureDominatedByMutatingNode() throws DiagnosticException {
            
            Parameter param1 = DactFactory.eINSTANCE.createParameter();
            param1.setName("customerId");
            param1.setType(STR);
            param1.setLowerBound(1);
            param1.setUpperBound(1);
            param1.setDirection(ParameterDirection.IN);
            activity.getOwnedParameters().add(param1);
            
            Parameter param2 = DactFactory.eINSTANCE.createParameter();
            param2.setName("targetCustomer");
            param2.setType(customer);
            param2.setLowerBound(1);
            param2.setUpperBound(1);
            param2.setDirection(ParameterDirection.IN);
            activity.getOwnedParameters().add(param2);
            
        	DomainFindAction findAction = DactFactory.eINSTANCE.createDomainFindAction();
            findAction.setName("Find Action");
            findAction.setAggregate(customer);
            dnSrv.updateExpr(findAction, null, "self.customerId == customerId");

            DomainCreateAction createAction = DactFactory.eINSTANCE.createDomainCreateAction();
            createAction.setName("Create Action");
            createAction.setAggregate(customer);
            dnSrv.updateExpr(createAction, null, "self == targetCustomer");

            rootGroup.getOwnedNodes().add(findAction);
            rootGroup.getOwnedNodes().add(createAction);
            connectChain(findAction, createAction);

            var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);
            var pContext = pRoot.getDdd().getBoundedContexts().get(0);
            assertEquals("Customer", pContext.getName(), "BoundedContext should resolve to dominant mutating aggregate's context");

            var pAgg = pContext.getOwnedElements().stream()
                    .filter(AggregateRoot.class::isInstance)
                    .map(AggregateRoot.class::cast)
                    .findFirst().orElse(null);

            assertNotNull(pAgg, "Aggregate root must exist in target BoundedContext");
            assertEquals("Customer", pAgg.getName(), "Aggregate name mismatch");
        }

        @Test
        @DisplayName("Domain Node Composition - Equal Strength Nodes Resolved by Declaration Order")
        void testEqualStrengthNodesDeclarationOrder() throws DiagnosticException {
            BoundedContext orderContext = DactFactory.eINSTANCE.createBoundedContext();
            orderContext.setName("Order");
            root.getDdd().getBoundedContexts().add(orderContext);

            AggregateRoot order = DactFactory.eINSTANCE.createAggregateRoot();
            order.setName("Order");
            orderContext.getOwnedElements().add(order);

            DomainCreateAction firstMutatingNode = DactFactory.eINSTANCE.createDomainCreateAction();
            firstMutatingNode.setName("Create Customer First");
            firstMutatingNode.setAggregate(customer);
            dnSrv.updateExpr(firstMutatingNode, null, "self == customer");

            DomainCreateAction secondMutatingNode = DactFactory.eINSTANCE.createDomainCreateAction();
            secondMutatingNode.setName("Create Order Second");
            secondMutatingNode.setAggregate(order);
            dnSrv.updateExpr(secondMutatingNode, null, "self == order");

            rootGroup.getOwnedNodes().add(firstMutatingNode);
            rootGroup.getOwnedNodes().add(secondMutatingNode);
            connectChain(firstMutatingNode, secondMutatingNode);

            var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);
            var pActivity = pRoot.getActivity();
            assertNotNull(pActivity, "Activity should pass transformation");

            var pContext = pRoot.getDdd().getBoundedContexts().stream()
                    .filter(bc -> "Customer".equals(bc.getName()))
                    .findFirst().orElse(null);

            assertNotNull(pContext, "Customer context should be assigned as primary context by declaration order");
        }
    }
    // ------------------------------------------------------------------
    // Step 1.6: SharedDomainObject Localization
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Step 1.6: SharedDomainObject Localization - Weak Normal")
    class SharedDomainObjectLocalization {

        Activity activity;
        ActivityGroup rootGroup;
        BoundedContext sourceContext;
        BoundedContext targetContext;
        AggregateRoot sharedCustomer;
        AggregateRoot sharedAddress;
        AggregateRoot order;
        DomainNodeServices dnSrv;
        ActivityEdge edge1;
        ActivityEdge edge2;

        @BeforeEach
        void setup() {
            dnSrv = new DomainNodeServices();

            // 1. Setup Shared Bounded Context with Shared Domain Objects
            sourceContext = DactFactory.eINSTANCE.createBoundedContext();
            sourceContext.setName("SharedContext");
            root.getDdd().getBoundedContexts().add(sourceContext);

            // Nested shared object (Address - primitives only)
            sharedAddress = DactFactory.eINSTANCE.createAggregateRoot();
            sharedAddress.setName("Address");
            sourceContext.getOwnedElements().add(sharedAddress);

            Property streetProp = DactFactory.eINSTANCE.createProperty();
            streetProp.setName("street");
            streetProp.setType(STR);
            streetProp.setLowerBound(1);
            streetProp.setUpperBound(1);
            sharedAddress.getOwnedProperties().add(streetProp);

            // Parent shared object (Customer - holds primitive + reference to Address)
            sharedCustomer = DactFactory.eINSTANCE.createAggregateRoot();
            sharedCustomer.setName("SharedCustomer");
            sourceContext.getOwnedElements().add(sharedCustomer);

            Property nameProp = DactFactory.eINSTANCE.createProperty();
            nameProp.setName("name");
            nameProp.setType(STR);
            nameProp.setLowerBound(1);
            nameProp.setUpperBound(1);
            sharedCustomer.getOwnedProperties().add(nameProp);

            // Reference property pointing to another shared domain object
            Property addressProp = DactFactory.eINSTANCE.createProperty();
            addressProp.setName("address");
            addressProp.setType(sharedAddress);
            addressProp.setLowerBound(1);
            addressProp.setUpperBound(1);
            sharedCustomer.getOwnedProperties().add(addressProp);

            // 2. Setup Target Bounded Context (Order)
            targetContext = DactFactory.eINSTANCE.createBoundedContext();
            targetContext.setName("OrderContext");
            root.getDdd().getBoundedContexts().add(targetContext);

            order = DactFactory.eINSTANCE.createAggregateRoot();
            order.setName("Order");
            targetContext.getOwnedElements().add(order);

            // 3. Setup Activity graph baseline
            ActivityServices activitySrv = new ActivityServices();
            activity = activitySrv.createANewActivity(root.getActivity());
            rootGroup = activity.getRoot();

            InitialNode initialNode = DactFactory.eINSTANCE.createInitialNode();
            rootGroup.getOwnedNodes().add(initialNode);
            ActivityFinalNode finalNode = DactFactory.eINSTANCE.createActivityFinalNode();
            rootGroup.getOwnedNodes().add(finalNode);

            edge1 = DactFactory.eINSTANCE.createActivityEdge();
            edge1.setSource(initialNode);
            rootGroup.getOwnedEdges().add(edge1);

            edge2 = DactFactory.eINSTANCE.createActivityEdge();
            edge2.setTarget(finalNode);
            rootGroup.getOwnedEdges().add(edge2);
        }

        @Nested
        @DisplayName("Containing Element Class")
        class ContainingElementClass {

            @Test
            @DisplayName("Localize Parameter typed with Shared Domain Object")
            void testLocalizeParameter() throws DiagnosticException {
                // Parameter in Target Context referencing Shared Domain Object
                Parameter param = DactFactory.eINSTANCE.createParameter();
                param.setName("customerParam");
                param.setType(sharedAddress); // Shared Primitive-only object
                param.setDirection(ParameterDirection.IN);
                param.setLowerBound(1);
                param.setUpperBound(1);
                activity.getOwnedParameters().add(param);

                DomainCreateAction action = DactFactory.eINSTANCE.createDomainCreateAction();
                action.setName("Create Order");
                action.setAggregate(order);
                dnSrv.updateExpr(action, null, "self == order");
                rootGroup.getOwnedNodes().add(action);

                edge1.setTarget(action);
                edge2.setSource(action);

                var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);

                // Assert: Parameter type is localized to target BoundedContext
                var pTargetContext = pRoot.getDdd().getBoundedContexts().stream()
                        .filter(bc -> "OrderContext".equals(bc.getName()))
                        .findFirst().orElse(null);
                assertNotNull(pTargetContext, "Target Bounded Context must exist");

                var pActivity = pRoot.getActivity().getActivities().get(0);
                var pParam = pActivity.getOwnedParameters().get(0);
                
                assertNotEquals(sharedAddress, pParam.getType(), "Parameter type should no longer point to source shared context");
                assertEquals("Address", pParam.getType().getName(), "Localized parameter type name mismatch");
            }

            @Test
            @DisplayName("Localize Variable typed with Shared Domain Object")
            void testLocalizeVariable() throws DiagnosticException {
                // Variable inside Activity Group referencing Shared Domain Object
                Variable var = DactFactory.eINSTANCE.createVariable();
                var.setName("customerVar");
                var.setType(sharedAddress);
                var.setLowerBound(1);
                var.setUpperBound(1);
                rootGroup.getScope().getOwnedVariables().add(var);

                DomainCreateAction action = DactFactory.eINSTANCE.createDomainCreateAction();
                action.setName("Create Order");
                action.setAggregate(order);
                dnSrv.updateExpr(action, null, "self == order");
                rootGroup.getOwnedNodes().add(action);

                edge1.setTarget(action);
                edge2.setSource(action);

                var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);

                // Assert: Variable type is localized into target context
                var pGroup = pRoot.getActivity().getActivities().get(0).getRoot();
                var pVar = pGroup.getScope().getOwnedVariables().get(0);

                assertNotEquals(sharedAddress, pVar.getType(), "Variable type should be localized to target context");
                assertEquals("Address", pVar.getType().getName(), "Localized variable type name mismatch");
            }

            @Test
            @DisplayName("Localize Property typed with Shared Domain Object")
            void testLocalizeProperty() throws DiagnosticException {
                // Target Aggregate property pointing to Shared Domain Object
                Property targetProp = DactFactory.eINSTANCE.createProperty();
                targetProp.setName("shippingAddress");
                targetProp.setType(sharedAddress);
                targetProp.setLowerBound(1);
                targetProp.setUpperBound(1);
                order.getOwnedProperties().add(targetProp);

                DomainCreateAction action = DactFactory.eINSTANCE.createDomainCreateAction();
                action.setName("Create Order");
                action.setAggregate(order);
                dnSrv.updateExpr(action, null, "self == order");
                rootGroup.getOwnedNodes().add(action);

                edge1.setTarget(action);
                edge2.setSource(action);

                var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);

                var pOrderContext = pRoot.getDdd().getBoundedContexts().stream()
                        .filter(bc -> "OrderContext".equals(bc.getName()))
                        .findFirst().orElse(null);
                assertNotNull(pOrderContext);

                var pOrder = pOrderContext.getOwnedElements().stream()
                        .filter(AggregateRoot.class::isInstance)
                        .map(AggregateRoot.class::cast)
                        .findFirst().orElse(null);
                assertNotNull(pOrder);

                var pProp = pOrder.getOwnedProperties().stream()
                        .filter(p -> "shippingAddress".equals(p.getName()))
                        .findFirst().orElse(null);
                assertNotNull(pProp);

                assertNotEquals(sharedAddress, pProp.getType(), "Property type should be localized");
                assertEquals("Address", pProp.getType().getName(), "Localized property type name mismatch");
            }
        }

        @Nested
        @DisplayName("Domain Object Composition")
        class DomainObjectComposition {

            @Test
            @DisplayName("Primitive-Only Properties - Direct Localization")
            void testPrimitiveOnlyLocalization() throws DiagnosticException {
                // Address contains only primitive properties (street)
                Variable var = DactFactory.eINSTANCE.createVariable();
                var.setName("addressVar");
                var.setType(sharedAddress);
                rootGroup.getScope().getOwnedVariables().add(var);

                DomainCreateAction action = DactFactory.eINSTANCE.createDomainCreateAction();
                action.setName("Create Order");
                action.setAggregate(order);
                dnSrv.updateExpr(action, null, "self == order");
                rootGroup.getOwnedNodes().add(action);

                edge1.setTarget(action);
                edge2.setSource(action);

                var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);
                var pActivity = pRoot.getActivity().getActivities().get(0);
                var pVar = pActivity.getRoot().getScope().getOwnedVariables().get(0);
                var localizedType = pVar.getType();

                assertTrue(localizedType instanceof Entity || localizedType instanceof ValueObject || localizedType instanceof AggregateRoot, 
                        "Localized object must be a domain element");
                
                if (localizedType instanceof DomainObject domainObj) {
                    var localizedProps = domainObj.getOwnedProperties();
                    assertEquals(2, localizedProps.size(), "Localized object should have 2 primitive properties");

                    // 1. Verify 'addressId' property (identity)
                    var addressIdProp = localizedProps.stream()
                            .filter(p -> "addressId".equals(p.getName()))
                            .findFirst()
                            .orElse(null);
                    assertNotNull(addressIdProp, "Property 'addressId' must exist");
                    assertTrue(addressIdProp.getType() instanceof StringType, "'addressId' type must be StringType");
                    assertEquals(1, addressIdProp.getLowerBound(), "'addressId' lower bound must be 1");
                    assertEquals(1, addressIdProp.getUpperBound(), "'addressId' upper bound must be 1");
                    assertTrue(addressIdProp.isDefinesIdentity(), "'addressId' must be marked as defining identity");

                    // 2. Verify original 'street' property
                    var streetProp = localizedProps.stream()
                            .filter(p -> "street".equals(p.getName()))
                            .findFirst()
                            .orElse(null);
                    assertNotNull(streetProp, "Property 'street' must exist");
                    assertTrue(streetProp.getType() instanceof StringType, "'street' type must be StringType");
                    assertEquals(1, streetProp.getLowerBound(), "'street' lower bound must be 1");
                    assertEquals(1, streetProp.getUpperBound(), "'street' upper bound must be 1");
                }
             }

            @Test
            @DisplayName("Reference to Shared Object - Transitive Localization")
            void testTransitiveLocalization() throws DiagnosticException {
                // SharedCustomer contains primitive (name) AND reference to sharedAddress
                Variable var = DactFactory.eINSTANCE.createVariable();
                var.setName("customerVar");
                var.setType(sharedCustomer); // Points to parent shared object
                rootGroup.getScope().getOwnedVariables().add(var);

                DomainCreateAction action = DactFactory.eINSTANCE.createDomainCreateAction();
                action.setName("Create Order");
                action.setAggregate(order);
                dnSrv.updateExpr(action, null, "self == order");
                rootGroup.getOwnedNodes().add(action);

                edge1.setTarget(action);
                edge2.setSource(action);

                var pRoot = assertTransformationPasses(QVTO_FILE, root, tempDir);

                // 1. Verify primary object localization (SharedCustomer -> Local Customer)
                
                var pActivity = pRoot.getActivity().getActivities().get(0);
                var pVar = pActivity.getRoot().getScope().getOwnedVariables().get(0);
                
                var localizedCustomer = pVar.getType();
                
                assertNotEquals(sharedCustomer, localizedCustomer, "Primary shared object must be localized");
                assertEquals("SharedCustomer", localizedCustomer.getName());

                // 2. Verify transitive object localization (Address property on Customer)
                var addressProp = ((DomainObject) localizedCustomer).getOwnedProperties().stream()
                        .filter(p -> "address".equals(p.getName()))
                        .findFirst().orElse(null);

                assertNotNull(addressProp, "Transitive property 'address' must exist on localized type");
                assertNotEquals(sharedAddress, addressProp.getType(), "Referenced shared object must be transitively localized");
                assertEquals("Address", addressProp.getType().getName(), "Transitively localized type name mismatch");
            }
        }
    }
    // ------------------------------------------------------------------
    // Helper
    // ------------------------------------------------------------------
    public static Root assertTransformationPasses(
            Path qvtoFile, 
            Root modelRoot, 
            Path targetDir) {
    	List<String> violations = ValidatorHelper.validate(modelRoot);
        assertTrue(violations.isEmpty(),
            "Input model should be well-formed but reported: "
                + String.join("; ", violations));
        
        return assertDoesNotThrow(() -> 
	        ValidatorHelper.executeTransformation(qvtoFile, modelRoot, targetDir)
	    );
    }
    
    public static void assertTransformationFails(
            Path qvtoFile, 
            Root modelRoot, 
            Path targetDir, 
            String expectedError) {
        
        Exception exception = assertThrows(
            IllegalStateException.class, 
            () -> ValidatorHelper.executeTransformation(qvtoFile, modelRoot, targetDir),
            "Transformation was expected to fail with '" + expectedError + "', but executed without throwing an exception."
        );

        String actualMessage = exception.getMessage() != null ? exception.getMessage() : "";

        assertTrue(
            actualMessage.contains(expectedError),
            String.format("Expected error to contain '%s', but received: '%s'", expectedError, actualMessage)
        );
    }
}
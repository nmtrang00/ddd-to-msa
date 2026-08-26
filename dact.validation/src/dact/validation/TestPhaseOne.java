package dact.validation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Correctness tests for Phase 1: Preprocess DACT
 */
@DisplayName("Phase 1: Preprocessing")
public class TestPhaseOne extends TestTemplate {

    @Override
    protected String qvtoFile() { return "DactPreprocess.qvto"; }

    @Override
    protected String phase() { return "phase1"; }

    // ------------------------------------------------------------------
    // Step 1.1: Structural Completion
    // ------------------------------------------------------------------

    @Test
    @DisplayName("Step 1.1: Strutural Completion - Happy")
    void structuralCompletion() throws Exception {
        assertStepProduces("StructuralCompletionHappy");
    }

    // ------------------------------------------------------------------
    // Step 1.2: Shared Object Localization
    // ------------------------------------------------------------------

    @Test
    @DisplayName("Step 1.2: Shared Object Localization - Happy")
    void sharedObjectLocalisation() throws Exception {
        assertStepProduces("SharedObjectLocalizationHappy");
    }
    
    // ------------------------------------------------------------------
    // Step 1.3: Specification Rule Validation
    // ------------------------------------------------------------------

    @Test
    @DisplayName("Step 1.3: Specification Rule Validation - Happy")
    void specificationRuleHappy() throws Exception {
        assertStepProduces("SpecificationRuleHappy");
    }
    
    @Test
    @DisplayName("Step 1.3: Specification Rule Validation - Unhappy")
    void specificationRuleUnhappy() throws Exception {
    	assertStepFails("SpecificationRuleUnhappy","NonBooleanSpecificationRule");
    }
    

    // ------------------------------------------------------------------
    // Step 1.4: Activity Parsing: Variable Declaration
    // ------------------------------------------------------------------

    @Test
    @DisplayName("Step 1.4: Variable Declaration - Happy")
    void variableDeclarationHappy() throws Exception {
        assertStepProduces("VariableDeclarationHappy");
    }
    
    // ------------------------------------------------------------------
    // Step 1.4: Activity Parsing: Variable Resolution
    // ------------------------------------------------------------------

    @Test
    @DisplayName("Step 1.4: Variable Resolution - Happy")
    void variableResolutionHappy() throws Exception {
        assertStepProduces("VariableResolutionHappy");
    }
    
    @Test
    @DisplayName("Step 1.4: Variable Resolution - Unhappy - Yet Declared")
    void variableResolutionUnhappyYetDeclared() throws Exception {
    	assertStepFails("VariableResolutionUnhappyYetDeclared","VariableYetDeclared");
    }
    
    @Test
    @DisplayName("Step 1.4: Variable Resolution - Unhappy - Refencing to Variable in Nested Scope")
    void variableResolutionUnhappyWrongReference() throws Exception {
    	assertStepFails("variableResolutionUnhappyWrongReference","VariableYetDeclared");
    }
    
    // ------------------------------------------------------------------
    // Step 1.4: Activity Parsing: Variable Assignment
    // ------------------------------------------------------------------

    @Test
    @DisplayName("Step 1.4: Variable Assignment - Happy")
    void variableAssignmentHappy() throws Exception {
        assertStepProduces("VariableAssignmentHappy");
    }
    
    @Test
    @DisplayName("Step 1.4: Variable Assignment - Unhappy - Type Mismatch")
    void variableAssignmentUnhappyTypeMismatch() throws Exception {
    	assertStepFails("VariableAssignmentUnhappyTypeMismatch","AssignmentTypeMismatch");
    }
    
    @Test
    @DisplayName("Step 1.4: Variable Assignment - Unhappy - Bound Mismatch")
    void variableAssignmentUnhappyBoundMismatch() throws Exception {
    	assertStepFails("VariableAssignmentUnhappyBoundMismatch","AssignmentBoundMismatch");
    }
    
    // ------------------------------------------------------------------
    // Step 1.4: Activity Parsing: Domain Find Node
    // ------------------------------------------------------------------

    @Test
    @DisplayName("Step 1.4: Domain Find Node - Happy - No Query")
    void domainFindNodeHappyNoQuery() throws Exception {
        assertStepProduces("DomainFindNodeHappyNoQuery");
    }
    
    @Test
    @DisplayName("Step 1.4: Domain Find Node - Happy - One Query")
    void domainFindNodeHappyOneQuery() throws Exception {
        assertStepProduces("DomainFindNodeHappyOneQuery");
    }
    
    @Test
    @DisplayName("Step 1.4: Domain Find Node - Happy - Two Queries")
    void domainFindNodeHappyTwoQueries() throws Exception {
        assertStepProduces("DomainFindNodeHappyTwoQueries");
    }
    
    @Test
    @DisplayName("Step 1.4: Domain Find Node - Happy - Repeat Actions")
    void domainFindNodeHappyRepeateActions() throws Exception {
        assertStepProduces("DomainFindNodeHappyRepeatActions");
    }
    
    @Test
    @DisplayName("Step 1.4: Domain Find Node - Unhappy - Non Existing Prop")
    void domainFindNodeUnhappyNonExistingProp() throws Exception {
        assertStepFails("DomainFindNodeUnhappyNonExistingProp","QueryOnNonExistentProperty");
    }

    // ------------------------------------------------------------------
    // Step 1.4: Activity Parsing: Domain Exist Node
    // ------------------------------------------------------------------
    @Test
    @DisplayName("Step 1.4: Domain Exist Node - Happy")
    void domainExistNodeHappy() throws Exception {
        assertStepProduces("DomainExistNodeHappy");
    }
    
    // ------------------------------------------------------------------
    // Step 1.4: Activity Parsing: Domain Create Node
    // ------------------------------------------------------------------
    @Test
    @DisplayName("Step 1.4: Domain Create Node - Happy")
    void domainCreateNodeHappy() throws Exception {
        assertStepProduces("DomainCreateNodeHappy");
    }
    
    @Test
    @DisplayName("Step 1.4: Domain Create Node - Unhappy - Type Mismatch")
    void domainCreateNodeUnhappyTypeMismatch() throws Exception {
        assertStepFails("DomainCreateNodeUnhappyTypeMismatch","MappingTypeMismatch");
    }
    
    
    // ------------------------------------------------------------------
    // Step 1.4: Activity Parsing: Domain Update Node
    // ------------------------------------------------------------------
    @Test
    @DisplayName("Step 1.4: Domain Update Node - Happy")
    void domainUpdateNodeHappy() throws Exception {
        assertStepProduces("DomainUpdateNodeHappy");
    }
    
    // ------------------------------------------------------------------
    // Step 1.4: Activity Parsing: Domain Delete Node
    // ------------------------------------------------------------------
    @Test
    @DisplayName("Step 1.4: Domain Delete Node - Happy")
    void domainDeleteNodeHappy() throws Exception {
        assertStepProduces("DomainDeleteNodeHappy");
    }
    
    // ------------------------------------------------------------------
    // Step 1.4: Activity Parsing: Specification Assignment
    // ------------------------------------------------------------------
    @Test
    @DisplayName("Step 1.4: Specification Assignment - Mutation Dominates")
    void specAssignmentMutationDominates() throws Exception {
        assertStepProduces("SpecAssignmentMutationDominates");
    }
    
    @Test
    @DisplayName("Step 1.4: Specification Assignment - Retrieval Only")
    void specAssignmentRetrievalOnly() throws Exception {
        assertStepProduces("SpecAssignmentRetrievalOnly");
    }
    
    @Test
    @DisplayName("Step 1.4: Specification Assignment - Already Defined")
    void specAssignmentAlreadyDefined() throws Exception {
        assertStepProduces("SpecAssignmentAlreadyDefined");
    }
    

}
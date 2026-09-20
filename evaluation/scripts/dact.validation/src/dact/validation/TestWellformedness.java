package dact.validation;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static  org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Nested;

import dact.*;

/**
 * Tests for DACT Wellformed-ness
 */
@DisplayName("DACT Wellformed-ness")
public class TestWellformedness{
	private Root root;
	private BooleanType BOOL;
	private StringType STR;
	private IntegerType INT;
	private RealType REAL;
	
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
    // Root - UniquePrimitiveType - Weak Robust 
    // ------------------------------------------------------------------
	@Nested
	@DisplayName("Root - UniquePrimitiveType - Weak Robust ")
	class UniquePrimitiveType{
	    @Test
	    @DisplayName("UniquePrimitiveType - Valid - Unique")
	    void RootUniquePrimitiveTypeControl() throws Exception {
	    	assertValid(root);
	    }
	    
	    @Test
	    @DisplayName("UniquePrimitiveType - Invalid - Duplicate")
	    void RootUniquePrimitiveTypeTest() throws Exception {
	    	// Setup
	    	RealType dupRealType = DactFactory.eINSTANCE.createRealType();
	    	root.getPrimitivesTypes().add(dupRealType);
	    	
	    	// Assert
	    	assertError(root,"UniquePrimitiveType");
	    }
	}

    // ------------------------------------------------------------------
    // TypedMultiplicityElement - NoDefaultForVariable - Weak Robust
    // ------------------------------------------------------------------
	@Nested
	@DisplayName("TypedMultiplicityElement - NoDefaultForVariable - Weak Robust")
	class NoDefaultForVariable{
	    @Test
	    @DisplayName("NoDefaultForVariable - Valid - Without default")
	    void NoDefaultForVariableControl() throws Exception {
	    	// Setup
	    	Variable variable = DactFactory.eINSTANCE.createVariable();
	    	
	    	// Assert
	    	assertValid(variable);
	    }
	    
	    @Test
	    @DisplayName("NoDefaultForVariable - Invalid - With default")
	    void NoDefaultForVariableTest() throws Exception {
	    	// Setup
	    	Variable variable = DactFactory.eINSTANCE.createVariable();
	    	LiteralBoolean bool = DactFactory.eINSTANCE.createLiteralBoolean();
	    	bool.setValue(false);
	    	variable.setDefault(bool);
	    	
	    	// Assert
	    	assertWarning(variable, "NoDefaultForVariable");
	    }
	}
    
	// ------------------------------------------------------------------
    // DddModel - UniqueBoundedContextNames - Weak Robust
    // ------------------------------------------------------------------
	@Nested
	@DisplayName("DddModel - UniqueBoundedContextNames - Weak Robust")
	class UniqueBoundedContextNames{
		@Test
	    @DisplayName("UniqueBoundedContextNames - Valid - Unique")
	    void UniqueBoundedContextNamesControl() throws Exception {
	    	// Setup
	    	DddModel dddModel = root.getDdd();
	    	BoundedContext cargoContext = DactFactory.eINSTANCE.createBoundedContext();
	    	cargoContext.setName("Cargo");
	    	dddModel.getBoundedContexts().add(cargoContext);
	    	
	    	BoundedContext cargoDupContext = DactFactory.eINSTANCE.createBoundedContext();
	    	cargoDupContext.setName("CargoDup");
	    	dddModel.getBoundedContexts().add(cargoDupContext);
	    	
	    	// Assert
	    	assertValid(dddModel);
	    }
	    
	    @Test
	    @DisplayName("UniqueBoundedContextNames - Invalid - Duplicate")
	    void UniqueBoundedContextNamesTest() throws Exception {
	    	// Setup
	    	DddModel dddModel = root.getDdd();
	    	BoundedContext cargoContext = DactFactory.eINSTANCE.createBoundedContext();
	    	cargoContext.setName("Cargo");
	    	dddModel.getBoundedContexts().add(cargoContext);
	    	
	    	BoundedContext cargoDupContext = DactFactory.eINSTANCE.createBoundedContext();
	    	cargoDupContext.setName("Cargo");
	    	dddModel.getBoundedContexts().add(cargoDupContext);
	    	
	    	// Assert
	    	assertError(dddModel, "UniqueBoundedContextNames");
	    }
	}
	
    // ------------------------------------------------------------------
    // DddModel - UniqueSharedDomainObjectNames - Weak Robust
    // ------------------------------------------------------------------
	@Nested
	@DisplayName("DddModel - UniqueSharedDomainObjectNames - Weak Robust")
	class UniqueSharedDomainObjectNames{
		@Test
	    @DisplayName("UniqueSharedDomainObjectNames - Valid - Unqiue")
	    void UniqueSharedDomainObjectNamesControl() throws Exception {
	    	// Setup
	    	DddModel dddModel = root.getDdd();
	    	SharedValueObject locationShared = DactFactory.eINSTANCE.createSharedValueObject();
	    	locationShared.setName("LocationShared");
	    	dddModel.getSharedDomainObjects().add(locationShared);
	    	
	    	DomainEvent locationSharedEvent = DactFactory.eINSTANCE.createDomainEvent();
	    	locationSharedEvent.setName("LocationSharedEvent");
	    	dddModel.getSharedDomainObjects().add(locationSharedEvent);
	    	
	    	// Assert
	    	assertValid(dddModel);
	    }
	    
	    @Test
	    @DisplayName("UniqueSharedDomainObjectNames - Invalid - Duplicate")
	    void UniqueSharedDomainObjectNamesTest() throws Exception {
	    	// Setup
	    	DddModel dddModel = root.getDdd();
	    	SharedValueObject locationShared = DactFactory.eINSTANCE.createSharedValueObject();
	    	locationShared.setName("LocationShared");
	    	dddModel.getSharedDomainObjects().add(locationShared);
	    	
	    	DomainEvent locationSharedEvent = DactFactory.eINSTANCE.createDomainEvent();
	    	locationSharedEvent.setName("LocationShared");
	    	dddModel.getSharedDomainObjects().add(locationSharedEvent);
	    	
	    	// Assert
	    	assertError(dddModel, "UniqueSharedDomainObjectNames");
	    }
	}
	
    // ------------------------------------------------------------------
    // ActivityModel - UniqueActivityNames - Weak Robust
    // ------------------------------------------------------------------
	@Nested
	@DisplayName("ActivityModel - UniqueActivityNames - Weak Robust")
	class UniqueActivityNames{
		@Test
	    @DisplayName("UniqueActivityNames - Valid - Unique")
	    void UniqueActivityNamesControl() throws Exception {
	    	// Setup
	    	ActivityModel activityModel = root.getActivity();
	    	Activity act1 = DactFactory.eINSTANCE.createActivity();
	    	act1.setName("Activity1");
	    	activityModel.getActivities().add(act1);
	    	
	    	Activity act2 = DactFactory.eINSTANCE.createActivity();
	    	act2.setName("Activity2");
	    	activityModel.getActivities().add(act2);
	    	
	    	// Assert
	    	assertValid(activityModel);
	    }
	    
	    @Test
	    @DisplayName("UniqueActivityNames - Invalid - Duplicate")
	    void UniqueActivityNamesTest() throws Exception {
	    	// Setup
	    	ActivityModel activityModel = root.getActivity();
	    	Activity act1 = DactFactory.eINSTANCE.createActivity();
	    	act1.setName("Activity1");
	    	activityModel.getActivities().add(act1);
	    	
	    	Activity act2 = DactFactory.eINSTANCE.createActivity();
	    	act2.setName("Activity1");
	    	activityModel.getActivities().add(act2);
	    	
	    	// Assert
	    	assertError(activityModel,"UniqueActivityNames");
	    }
	}
	
    // ------------------------------------------------------------------
    // BoundedContext - UniqueDomainElementNames - Weak Robust
    // ------------------------------------------------------------------
	@Nested
	@DisplayName("BoundedContext - UniqueDomainElementNames - Weak Robust")
	class UniqueDomainElementNames{
		@Test
	    @DisplayName("UniqueDomainElementNames - Valid - Unique")
	    void UniqueDomainElementNamesControl() throws Exception {
	    	// Setup
	    	BoundedContext context = DactFactory.eINSTANCE.createBoundedContext();
	    	Entity cargo = DactFactory.eINSTANCE.createEntity();
	    	cargo.setName("Cargo");
	    	context.getOwnedElements().add(cargo);
	    	
	    	ValueObject cargoDup = DactFactory.eINSTANCE.createValueObject();
	    	cargoDup.setName("CargoDup");
	    	context.getOwnedElements().add(cargoDup);
	    	
	    	// Assert
	    	assertValid(context);
	    }
	    
	    @Test
	    @DisplayName("UniqueDomainElementNames - Invalid - Duplicate")
	    void UniqueDomainElementNamesTest() throws Exception {
	    	// Setup
	    	BoundedContext context = DactFactory.eINSTANCE.createBoundedContext();
	    	Entity cargo = DactFactory.eINSTANCE.createEntity();
	    	cargo.setName("Cargo");
	    	context.getOwnedElements().add(cargo);
	    	
	    	ValueObject cargoDup = DactFactory.eINSTANCE.createValueObject();
	    	cargoDup.setName("Cargo");
	    	context.getOwnedElements().add(cargoDup);
	    	
	    	// Assert
	    	assertError(context,"UniqueDomainElementNames");
	    }
	}
	
    // ------------------------------------------------------------------
    // Property - MandatoryType - Weak Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Property - MandatoryType - Weak Robust")
    class MandatoryType{
		@Test
	    @DisplayName("MandatoryType - Valid - With Type")
	    void MandatoryTypeControl() throws Exception {
	    	// Setup
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setName("testProp");
	    	property.setType(INT);
	 
	    	// Assert
	    	assertValid(property);
	    }
	    
	    @Test
	    @DisplayName("MandatoryType - Invalid - Without Type")
	    void MandatoryTypeTest() throws Exception {
	    	// Setup
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setName("testProp");
	    	
	    	// Assert
	    	assertError(property,"MandatoryType");
	    }
    }
    
    // ------------------------------------------------------------------
    // Property - CompositeRequiresEntity - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Property - CompositeRequiresEntity - Strong Robust")
    class CompositeRequiresEntity{
	    @Test
	    @DisplayName("CompositeRequiresEntity - Valid - Not composite + Entity src + Non-Entity dest")
	    void CompositeRequiresEntity0xx() throws Exception {
	    	// Setup
	    	Entity src = DactFactory.eINSTANCE.createEntity();
	    	ValueObject dest = DactFactory.eINSTANCE.createValueObject();
	    	
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setIsComposite(false);
	    	property.setType(dest);
	    	src.getOwnedProperties().add(property);
	    	
	    	// Assert
	    	assertValid(property);
	    }
	    
	    @Test
	    @DisplayName("CompositeRequiresEntity - Invalid - Composite + Non-Entity src + Non-Entity dest")
	    void CompositeRequiresEntity100() throws Exception {
	    	// Setup
	    	ValueObject src = DactFactory.eINSTANCE.createValueObject();
	    	ValueObject dest = DactFactory.eINSTANCE.createValueObject();
	    	
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setIsComposite(true);
	    	property.setType(dest);
	    	src.getOwnedProperties().add(property);
	    	
	    	// Assert
	    	assertError(property, "CompositeRequiresEntity");
	    }
	    
	    @Test
	    @DisplayName("CompositeRequiresEntity - Invalid - Composite + Non-Entity src + Entity dest")
	    void CompositeRequiresEntity101() throws Exception {
	    	// Setup
	    	ValueObject src = DactFactory.eINSTANCE.createValueObject();
	    	Entity dest = DactFactory.eINSTANCE.createEntity();
	    	
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setIsComposite(true);
	    	property.setType(dest);
	    	src.getOwnedProperties().add(property);
	    	
	    	// Assert
	    	assertError(property, "CompositeRequiresEntity");
	    }
	    
	    @Test
	    @DisplayName("CompositeRequiresEntity - Invalid - Composite + Entity src + Non-Entity dest")
	    void CompositeRequiresEntity110() throws Exception {
	    	// Setup
	    	Entity src = DactFactory.eINSTANCE.createEntity();
	    	ValueObject dest = DactFactory.eINSTANCE.createValueObject();
	    	
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setIsComposite(true);
	    	property.setType(dest);
	    	src.getOwnedProperties().add(property);
	    	
	    	// Assert
	    	assertError(property, "CompositeRequiresEntity");
	    }
	    
	    @Test
	    @DisplayName("CompositeRequiresEntity - Valid - Composite + Entity src + Entity dest")
	    void CompositeRequiresEntity111() throws Exception {
	    	// Setup
	    	Entity src = DactFactory.eINSTANCE.createEntity();
	    	Entity dest = DactFactory.eINSTANCE.createEntity();
	    	
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setIsComposite(true);
	    	property.setType(dest);
	    	src.getOwnedProperties().add(property);
	    	
	    	// Assert
	    	assertValid(property);
	    }
    }
    
    // ------------------------------------------------------------------
    // Property - AggregateIsNotComposed - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Property - AggregateIsNotComposed - Strong Robust")
    class AggregateIsNotComposed{
	    @Test
	    @DisplayName("AggregateIsNotComposed - Valid - Not Composite + Aggregate dest")
	    void AggregateIsNotComposedControl0x() throws Exception {
	    	// Setup
	    	AggregateRoot dest = DactFactory.eINSTANCE.createAggregateRoot();
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setIsComposite(false);
	    	property.setType(dest);
	    	
	    	// Assert
	    	assertValid(property);
	    }
	    
	    @Test
	    @DisplayName("AggregateIsNotComposed - Valid - Composite + Non-Aggregate dest")
	    void AggregateIsNotComposedTest10() throws Exception {
	    	// Setup
	    	Entity src = DactFactory.eINSTANCE.createEntity();
	    	Entity dest = DactFactory.eINSTANCE.createEntity();
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setIsComposite(true);
	    	property.setType(dest);
	    	src.getOwnedProperties().add(property);
	    	
	    	// Assert
	    	assertValid(property);
	    }
	    
	    @Test
	    @DisplayName("AggregateIsNotComposed - Invalid - Composite + Aggregate dest")
	    void AggregateIsNotComposedTest11() throws Exception {
	    	// Setup
	    	Entity src = DactFactory.eINSTANCE.createEntity();
	    	AggregateRoot dest = DactFactory.eINSTANCE.createAggregateRoot();
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setIsComposite(true);
	    	property.setType(dest);
	    	src.getOwnedProperties().add(property);
	    	
	    	// Assert
	    	assertError(property,"AggregateIsNotComposed");
	    }
    }
    
    // ------------------------------------------------------------------
    // Property - PrimitivePropertyRequiresName - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Property - PrimitivePropertyRequiresName - Strong Robust")
    class PrimitivePropertyRequiresName{ 
	    @Test
	    @DisplayName("PrimitivePropertyRequiresName - Valid - Non-Primitive + Without Name")
	    void PrimitivePropertyRequiresName0x() throws Exception {
	    	// Setup
	    	ValueObject dest = DactFactory.eINSTANCE.createValueObject();
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setType(dest);
	    	
	    	// Assert
	    	assertValid(property);
	    }
	    
	    @Test
	    @DisplayName("PrimitivePropertyRequiresName - Invalid - Primitive + Without Name")
	    void PrimitivePropertyRequiresName10() throws Exception {
	    	// Setup
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setType(INT);
	    	
	    	// Assert
	    	assertError(property,"PrimitivePropertyRequiresName");
	    }
	    
	    @Test
	    @DisplayName("PrimitivePropertyRequiresName - Valid - Primitive + With Name")
	    void PrimitivePropertyRequiresName11() throws Exception {
	    	// Setup
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setType(INT);
	    	property.setName("trackingId");
	    	
	    	// Assert
	    	assertValid(property);
	    }
    }
    
    // ------------------------------------------------------------------
    // Property - SharedObjectTypeRestriction - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Property - SharedObjectTypeRestriction - Strong Robust")
    class SharedObjectTypeRestriction{
	    @Test
	    @DisplayName("SharedObjectTypeRestriction - Valid - Internal src + Internal dest")
	    void SharedObjectTypeRestriction0x() throws Exception {
	    	// Setup
	    	BoundedContext cargoContext = DactFactory.eINSTANCE.createBoundedContext();
	    	Entity cargo = DactFactory.eINSTANCE.createEntity();
	    	cargoContext.getOwnedElements().add(cargo);
	    	
	    	Entity history = DactFactory.eINSTANCE.createEntity();
	    	cargoContext.getOwnedElements().add(history);
	    	
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setType(history);
	    	cargo.getOwnedProperties().add(property);
	    	
	    	// Assert
	    	assertValid(property);
	    }
	    
	    @Test
	    @DisplayName("SharedObjectTypeRestriction - Invalid - Shared src + Internal object dest")
	    void SharedObjectTypeRestriction10() throws Exception {
	    	// Setup
	    	DddModel dddModel = root.getDdd();
	    	SharedValueObject sharedCargo = DactFactory.eINSTANCE.createSharedValueObject();
	    	dddModel.getSharedDomainObjects().add(sharedCargo);
	    	
	    	BoundedContext cargoContext = DactFactory.eINSTANCE.createBoundedContext();
	    	dddModel.getBoundedContexts().add(cargoContext);
	    	Entity history = DactFactory.eINSTANCE.createEntity();
	    	cargoContext.getOwnedElements().add(history);
	    	
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setType(history);
	    	sharedCargo.getOwnedProperties().add(property);
	    	
	    	// Assert
	    	assertError(property, "SharedObjectTypeRestriction");
	    }
	    
	    @Test
	    @DisplayName("SharedObjectTypeRestriction - Valid - Shared src + Shared dest")
	    void SharedObjectTypeRestriction11() throws Exception {
	    	// Setup
	    	DddModel dddModel = root.getDdd();
	    	SharedValueObject sharedCargo = DactFactory.eINSTANCE.createSharedValueObject();
	    	dddModel.getSharedDomainObjects().add(sharedCargo);
	 
	    	SharedValueObject sharedHistory = DactFactory.eINSTANCE.createSharedValueObject();
	    	dddModel.getSharedDomainObjects().add(sharedHistory);
	    	 
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setType(sharedHistory);
	    	sharedCargo.getOwnedProperties().add(property);
	    	
	    	// Assert
	    	assertValid(property);
	    }
	    
	    @Test
	    @DisplayName("SharedObjectTypeRestriction - Valid - Shared src + Primitive dest")
	    void SharedObjectTypeRestriction12() throws Exception {
	    	// Setup
	    	DddModel dddModel = root.getDdd();
	    	SharedValueObject sharedCargo = DactFactory.eINSTANCE.createSharedValueObject();
	    	dddModel.getSharedDomainObjects().add(sharedCargo);
	
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setType(BOOL);
	    	property.setName("TestProp");
	    	sharedCargo.getOwnedProperties().add(property);
	    	
	    	// Assert
	    	assertValid(property);
	    }
	    
	    @Test
	    @DisplayName("SharedObjectTypeRestriction - Invalid - Shared src + Enum dest")
	    void SharedObjectTypeRestriction13() throws Exception {
	    	// Setup
	    	DddModel dddModel = root.getDdd();
	    	SharedValueObject sharedCargo = DactFactory.eINSTANCE.createSharedValueObject();
	    	dddModel.getSharedDomainObjects().add(sharedCargo);
	    	
	    	BoundedContext cargoContext = DactFactory.eINSTANCE.createBoundedContext();
	    	dddModel.getBoundedContexts().add(cargoContext);
	    	Enumeration cargoStatus = DactFactory.eINSTANCE.createEnumeration();
	    	cargoContext.getOwnedElements().add(cargoStatus);
	    	
	    	Property property = DactFactory.eINSTANCE.createProperty();
	    	property.setType(cargoStatus);
	    	sharedCargo.getOwnedProperties().add(property);
	    	
	    	// Assert
	    	assertValid(property);
	    }
    }
    
    // ------------------------------------------------------------------
    // DefinesIdentityObject - SingleValuedPrimitiveProperty - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Property - SingleValuedPrimitiveProperty - Strong Robust")
    class DefinesIdentityObject{
    	Property property;
    	
    	@BeforeEach
    	void setup() {
    		property = DactFactory.eINSTANCE.createProperty();
    	}

        @Test
        @DisplayName("Valid: !definesIdentity + Wrong type (regardless of type or bounds)")
        void testDefinesIdentityFalse_Passes() throws Exception{ 
            property.setName("nonIdentityProp");
            property.setDefinesIdentity(false);
            property.setUpperBound(-1); // Multi-valued
            property.setType(BOOL); // Invalid type if evaluated

            assertValid(property, "SingleValuedPrimitiveProperty");
        }

        @Test
        @DisplayName("Valid: definesIdentity + Type is NULL (deferred to MandatoryType constraint)")
        void testNullType_Passes() throws Exception{
            property.setName("nullTypeProp");
            property.setDefinesIdentity(true);
            property.setUpperBound(1);
            property.setType(null);

            assertValid(property, "SingleValuedPrimitiveProperty");
        }

        @Test
        @DisplayName("Valid: definesIdentity + Single-valued + IntegerType")
        void testSingleValuedIntegerType_Passes() throws Exception{
            property.setName("id");
            property.setDefinesIdentity(true);
            property.setUpperBound(1);
            property.setType(INT);
            
            assertValid(property, "SingleValuedPrimitiveProperty");
        }

        @Test
        @DisplayName("Valid: definesIdentity + Single-valued + StringType")
        void testSingleValuedStringType_Passes() throws Exception{
            property.setName("uuid");
            property.setDefinesIdentity(true);
            property.setUpperBound(1);
            property.setType(STR);

            assertValid(property, "SingleValuedPrimitiveProperty");
        }
       

        @ParameterizedTest(name = "Invalid: definesIdentity + Multi-valued + Integer")
        @ValueSource(ints = { -1, 0, 2, 5 })
        void testMultiValuedProperty_Fails(int upperBound) throws Exception{
            property.setName("invalidBoundsProp");
            property.setDefinesIdentity(true);
            property.setUpperBound(upperBound);
            property.setType(INT);

            assertError(property,"SingleValuedPrimitiveProperty");
        }

        @Test
        @DisplayName("Invalid: definesIdentity + Single-valued + Non-Integer/String")
        void testNonIntegerOrStringType_Fails() throws Exception{
            property.setName("activeFlag");
            property.setDefinesIdentity(true);
            property.setUpperBound(1);
            property.setType(BOOL);
            
            assertError(property,"SingleValuedPrimitiveProperty");
        }

        @Test
        @DisplayName("Invalid: definesIdentity + Multi-valued + Non-Integer/String type")
        void testMultiValuedAndInvalidType_Fails() throws Exception{
            property.setName("tags");
            property.setDefinesIdentity(true);
            property.setUpperBound(-1);
            property.setType(BOOL);
            
            assertError(property,"SingleValuedPrimitiveProperty");
        }
        
    }
    
    // ------------------------------------------------------------------
    // Operation - MatchedDomainOperationType - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Operation - MatchedDomainOperationType - Strong Robust")
    class MatchedDomainOperationType{
	    @Test
	    @DisplayName("MatchedDomainOperationType - Valid - Domain Object + Domain Op")
	    void MatchedDomainOperationType11() throws Exception {
	    	// Setup
	    	Entity cargo = DactFactory.eINSTANCE.createEntity();
	    	Operation op = DactFactory.eINSTANCE.createOperation();
	    	op.setType(OperationType.D0_CONSTRUCTOR);
	    	cargo.getOwnedOperations().add(op);
	    	
	    	// Assert
	    	assertValid(op);
	    }
	    
	    @Test
	    @DisplayName("MatchedDomainOperationType - Invalid - Domain Object + Non-Domain Op")
	    void MatchedDomainOperationType10() throws Exception {
	    	// Setup
	    	Entity cargo = DactFactory.eINSTANCE.createEntity();
	    	Operation op = DactFactory.eINSTANCE.createOperation();
	    	op.setType(OperationType.R0_REPOSITORY_CREATE);
	    	cargo.getOwnedOperations().add(op);
	    	
	    	// Assert
	    	assertError(op,"MatchedDomainOperationType");
	    }
	    
	    @Test
	    @DisplayName("MatchedDomainOperationType - Valid - Non-Domain Object + Domain Op")
	    void MatchedDomainOperationType0x() throws Exception {
	    	// Setup
	    	Repository cargo = DactFactory.eINSTANCE.createRepository();
	    	Operation op = DactFactory.eINSTANCE.createOperation();
	    	op.setType(OperationType.D0_CONSTRUCTOR);
	    	cargo.getOwnedOperations().add(op);
	    	
	    	// Assert
	    	assertValid(op,"MatchedDomainOperationType");
	    }
    }
    
    // ------------------------------------------------------------------
    // Operation - MatchedRepositoryOperationType - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Operation - MatchedRepositoryOperationType - Strong Robust")
    class MatchedRepositoryOperationType{
	    @Test
	    @DisplayName("MatchedRepositoryOperationType - Valid - Repo + Repo Op")
	    void MatchedRepositoryOperationType11() throws Exception {
	    	// Setup
	    	Repository cargo = DactFactory.eINSTANCE.createRepository();
	    	Operation op = DactFactory.eINSTANCE.createOperation();
	    	op.setType(OperationType.R0_REPOSITORY_CREATE);
	    	cargo.getOwnedOperations().add(op);
	    	
	    	// Assert
	    	assertValid(op);
	    }
	    
	    @Test
	    @DisplayName("MatchedRepositoryOperationType - Invalid - Repo + Non-Repo Op")
	    void MatchedRepositoryOperationType10() throws Exception {
	    	// Setup
	    	Repository cargo = DactFactory.eINSTANCE.createRepository();
	    	Operation op = DactFactory.eINSTANCE.createOperation();
	    	op.setType(OperationType.S0_DOMAIN_SERVICE);
	    	cargo.getOwnedOperations().add(op);
	    	
	    	// Assert
	    	assertError(op,"MatchedRepositoryOperationType");
	    }
	    
	    @Test
	    @DisplayName("MatchedRepositoryOperationType - Valid - Non-Repo + Repo Op")
	    void MatchedRepositoryOperationType0x() throws Exception {
	    	// Setup
	    	Service cargo = DactFactory.eINSTANCE.createService();
	    	Operation op = DactFactory.eINSTANCE.createOperation();
	    	op.setType(OperationType.R0_REPOSITORY_CREATE);
	    	cargo.getOwnedOperations().add(op);
	    	
	    	// Assert
	    	assertValid(op,"MatchedRepositoryOperationType");
	    }
    }
    
    // ------------------------------------------------------------------
    // Operation - MatchedServiceOperationType - Strong Robust
    // ------------------------------------------------------------------ 
    @Nested
    @DisplayName("Operation - MatchedServiceOperationType - Strong Robust")
    class MatchedServiceOperationType{
	    @Test
	    @DisplayName("MatchedServiceOperationType - Valid - Service + Service Op")
	    void MatchedServiceOperationType11() throws Exception {
	    	// Setup
	    	Service cargo = DactFactory.eINSTANCE.createService();
	    	Operation op = DactFactory.eINSTANCE.createOperation();
	    	op.setType(OperationType.S0_DOMAIN_SERVICE);
	    	cargo.getOwnedOperations().add(op);
	    	
	    	// Assert
	    	assertValid(op);
	    }
	    
	    @Test
	    @DisplayName("MatchedServiceOperationType - Invalid - Service + Non-Service Op")
	    void MatchedServiceOperationType10() throws Exception {
	    	// Setup
	    	Service cargo = DactFactory.eINSTANCE.createService();
	    	Operation op = DactFactory.eINSTANCE.createOperation();
	    	op.setType(OperationType.R1_REPOSITORY_READ);
	    	cargo.getOwnedOperations().add(op);
	    	
	    	// Assert
	    	assertError(op,"MatchedServiceOperationType");
	    }
	    
	    @Test
	    @DisplayName("MatchedServiceOperationType - Valid - Non-Service + Service Op")
	    void MatchedServiceOperationType0x() throws Exception {
	    	// Setup
	    	DomainObject cargo = DactFactory.eINSTANCE.createEntity();
	    	Operation op = DactFactory.eINSTANCE.createOperation();
	    	op.setType(OperationType.S0_DOMAIN_SERVICE);
	    	cargo.getOwnedOperations().add(op);
	    	
	    	// Assert
	    	assertValid(op,"MatchedServiceOperationType");
	    }
    }
    
    // ------------------------------------------------------------------
    // Operation - NoBehaviorSpecification - Strong Robust
    // ------------------------------------------------------------------ 
    @Nested
    @DisplayName("Operation - NoBehaviorSpecification - Strong Robust")
    class NoBehaviorSpecification{
	    @Test
	    @DisplayName("NoBehaviorSpecification - Invalid - Spec + None")
	    void NoBehaviorSpecification10() throws Exception {
	    	// Setup
	    	SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	    	
	    	// Assert
	    	assertWarning(specOp, "NoBehaviorSpecification");
	    }
	    
	    @Test
	    @DisplayName("NoBehaviorSpecification - Valid - Spec + Behavior")
	    void NoBehaviorSpecification11() throws Exception {
	    	// Setup
	    	SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	    	Activity activity = DactFactory.eINSTANCE.createActivity();
	    	specOp.setBehavior(activity);
	    	
	    	// Assert
	    	assertValid(specOp,"NoBehaviorSpecification");
	    }
	    
	    @Test
	    @DisplayName("NoBehaviorSpecification - Valid - Spec + Rule")
	    void NoBehaviorSpecification12() throws Exception {
	    	// Setup
	    	SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	    	SpecRule rule = DactFactory.eINSTANCE.createSpecRule();
	    	specOp.getOwnedRules().add(rule);
	    	
	    	// Assert
	    	assertValid(specOp,"NoBehaviorSpecification");
	    }
	    
	    @Test
	    @DisplayName("NoBehaviorSpecification - Invalid - Non-Spec + None")
	    void NoBehaviorSpecification00() throws Exception {
	    	// Setup 
	    	Operation op = DactFactory.eINSTANCE.createOperation();
	    	
	    	// Assert
	    	assertWarning(op,"NoBehaviorSpecification");
	    }
	    
	    @Test
	    @DisplayName("NoBehaviorSpecification - Valid - Non-Spec + Behavior")
	    void NoBehaviorSpecification01() throws Exception {
	    	// Setup
	    	Operation op = DactFactory.eINSTANCE.createOperation();
	    	Activity activity = DactFactory.eINSTANCE.createActivity();
	    	op.setBehavior(activity);
	    	
	    	// Assert
	    	assertValid(op, "NoBehaviorSpecification");
	    }
    }
    // ------------------------------------------------------------------
    // Operation - ConstructorMatchesProperties - Strong Robust
    // ------------------------------------------------------------------ 
    @Nested
    @DisplayName("Operation - ConstructorMatchesProperties - Strong Robust")
    class ConstructorMatchesProperties{
	    @Test
	    @DisplayName("ConstructorMatchesProperties - Valid - Non-Constructor")
	    void ConstructorMatchesProperties0x() throws Exception {
	    	// Setup
	    	Operation op = DactFactory.eINSTANCE.createOperation();
	    	op.setType(OperationType.D2_COMPOUND_MUTATOR);
	    	
	    	// Assert
	    	assertValid(op,"ConstructorMatchesProperties");
	    }
	    
	    @Test
	    @DisplayName("ConstructorMatchesProperties - Valid - Ideal")
	    void ConstructorMatchesPropertiesIdeal() throws Exception {
	    	// Setup
	    	Entity customer = DactFactory.eINSTANCE.createEntity();
	    	customer.setName("Customer");
	    	String[] propNames = {"name","email"};
	    	for(String propName : propNames){
	    		Property prop = DactFactory.eINSTANCE.createProperty();
	    		prop.setName(propName);
	    		prop.setType(STR);
	    		prop.setLowerBound(1);
	    		prop.setUpperBound(1);
	    		customer.getOwnedProperties().add(prop);
	    	};
	    	
	    	Operation op = DactFactory.eINSTANCE.createOperation();
	    	op.setType(OperationType.D0_CONSTRUCTOR);
	    	for(String propName : propNames) {
	    		Parameter param = DactFactory.eINSTANCE.createParameter();
	    		param.setName(propName);
	    		param.setType(STR);
	    		param.setLowerBound(1);
	    		param.setUpperBound(1);
	    		op.getOwnedParameters().add(param);
	    	}
	    	customer.getOwnedOperations().add(op);
	    	
	    	// Assert
	    	assertValid(op,"ConstructorMatchesProperties");
	    }
	    
	    @Test
	    @DisplayName("ConstructorMatchesProperties - Invalid - Missing Property")
	    void ConstructorMatchesPropertiesMissingProperty() throws Exception {
	        // Setup
	        Entity customer = DactFactory.eINSTANCE.createEntity();
	        customer.setName("Customer");
	
	        // Property only has 'name'
	        Property prop = DactFactory.eINSTANCE.createProperty();
	        prop.setName("name");
	        prop.setType(STR);
	        prop.setLowerBound(1);
	        prop.setUpperBound(1);
	        customer.getOwnedProperties().add(prop);
	
	        Operation op = DactFactory.eINSTANCE.createOperation();
	        op.setType(OperationType.D0_CONSTRUCTOR);
	
	        // Parameter has 'email' which does not exist on Entity
	        Parameter param = DactFactory.eINSTANCE.createParameter();
	        param.setName("email");
	        param.setType(STR);
	        param.setLowerBound(1);
	        param.setUpperBound(1);
	        op.getOwnedParameters().add(param);
	
	        customer.getOwnedOperations().add(op);
	
	        // Assert
	        assertError(op, "ConstructorMatchesProperties");
	    }
	
	    @Test
	    @DisplayName("ConstructorMatchesProperties - Invalid - Type Mismatch")
	    void ConstructorMatchesPropertiesTypeMismatch() throws Exception {
	        // Setup
	        Entity customer = DactFactory.eINSTANCE.createEntity();
	        customer.setName("Customer");
	
	        Property prop = DactFactory.eINSTANCE.createProperty();
	        prop.setName("age");
	        prop.setType(INT); // Property is INT
	        prop.setLowerBound(1);
	        prop.setUpperBound(1);
	        customer.getOwnedProperties().add(prop);
	
	        Operation op = DactFactory.eINSTANCE.createOperation();
	        op.setType(OperationType.D0_CONSTRUCTOR);
	
	        Parameter param = DactFactory.eINSTANCE.createParameter();
	        param.setName("age");
	        param.setType(STR); // Param is STR (Mismatch)
	        param.setLowerBound(1);
	        param.setUpperBound(1);
	        op.getOwnedParameters().add(param);
	
	        customer.getOwnedOperations().add(op);
	
	        // Assert
	        assertError(op, "ConstructorMatchesProperties");
	    }
	
	    @Test
	    @DisplayName("ConstructorMatchesProperties - Invalid - Lower Bound Mismatch")
	    void ConstructorMatchesPropertiesLowerBoundMismatch() throws Exception {
	        // Setup
	        Entity customer = DactFactory.eINSTANCE.createEntity();
	        customer.setName("Customer");
	
	        Property prop = DactFactory.eINSTANCE.createProperty();
	        prop.setName("email");
	        prop.setType(STR);
	        prop.setLowerBound(0); // Property lower bound is 0
	        prop.setUpperBound(1);
	        customer.getOwnedProperties().add(prop);
	
	        Operation op = DactFactory.eINSTANCE.createOperation();
	        op.setType(OperationType.D0_CONSTRUCTOR);
	
	        Parameter param = DactFactory.eINSTANCE.createParameter();
	        param.setName("email");
	        param.setType(STR);
	        param.setLowerBound(1); // Param lower bound is 1 (Mismatch)
	        param.setUpperBound(1);
	        op.getOwnedParameters().add(param);
	
	        customer.getOwnedOperations().add(op);
	
	        // Assert
	        assertError(op, "ConstructorMatchesProperties");
	    }
	
	    @Test
	    @DisplayName("ConstructorMatchesProperties - Invalid - Upper Bound Mismatch")
	    void ConstructorMatchesPropertiesUpperBoundMismatch() throws Exception {
	        // Setup
	        Entity customer = DactFactory.eINSTANCE.createEntity();
	        customer.setName("Customer");
	
	        Property prop = DactFactory.eINSTANCE.createProperty();
	        prop.setName("tags");
	        prop.setType(STR);
	        prop.setLowerBound(0);
	        prop.setUpperBound(-1); // Property upper bound is unbounded (* / -1)
	        customer.getOwnedProperties().add(prop);
	
	        Operation op = DactFactory.eINSTANCE.createOperation();
	        op.setType(OperationType.D0_CONSTRUCTOR);
	
	        Parameter param = DactFactory.eINSTANCE.createParameter();
	        param.setName("tags");
	        param.setType(STR);
	        param.setLowerBound(0);
	        param.setUpperBound(1); // Param upper bound is 1 (Mismatch)
	        op.getOwnedParameters().add(param);
	
	        customer.getOwnedOperations().add(op);
	
	        // Assert
	        assertError(op, "ConstructorMatchesProperties");
	    }
	
	    @Test
	    @DisplayName("ConstructorMatchesProperties - Invalid - Multiple Faults")
	    void ConstructorMatchesPropertiesMultipleFaults() throws Exception {
	        // Setup
	        Entity customer = DactFactory.eINSTANCE.createEntity();
	        customer.setName("Customer");
	
	        Property prop = DactFactory.eINSTANCE.createProperty();
	        prop.setName("score");
	        prop.setType(INT);
	        prop.setLowerBound(1);
	        prop.setUpperBound(1);
	        customer.getOwnedProperties().add(prop);
	
	        Operation op = DactFactory.eINSTANCE.createOperation();
	        op.setType(OperationType.D0_CONSTRUCTOR);
	
	        Parameter param = DactFactory.eINSTANCE.createParameter();
	        param.setName("score");
	        param.setType(STR); // Mismatch
	        param.setLowerBound(0); // Mismatch
	        param.setUpperBound(5); // Mismatch
	        op.getOwnedParameters().add(param);
	
	        customer.getOwnedOperations().add(op);
	
	        // Assert
	        assertError(op, "ConstructorMatchesProperties");
	    }
	
	    @Test
	    @DisplayName("ConstructorMatchesProperties - Invalid - Multi Parameter Fault Accumulation")
	    void ConstructorMatchesPropertiesMultiParamFaultAccumulation() throws Exception {
	        // Setup
	        Entity customer = DactFactory.eINSTANCE.createEntity();
	        customer.setName("Customer");
	
	        Property prop1 = DactFactory.eINSTANCE.createProperty();
	        prop1.setName("id");
	        prop1.setType(INT);
	        prop1.setLowerBound(1);
	        prop1.setUpperBound(1);
	        customer.getOwnedProperties().add(prop1);
	
	        Operation op = DactFactory.eINSTANCE.createOperation();
	        op.setType(OperationType.D0_CONSTRUCTOR);
	
	        // Param 1: Missing corresponding property
	        Parameter param1 = DactFactory.eINSTANCE.createParameter();
	        param1.setName("unknownField");
	        param1.setType(STR);
	        param1.setLowerBound(1);
	        param1.setUpperBound(1);
	        op.getOwnedParameters().add(param1);
	
	        // Param 2: Type mismatch
	        Parameter param2 = DactFactory.eINSTANCE.createParameter();
	        param2.setName("id");
	        param2.setType(STR); // Mismatch
	        param2.setLowerBound(1);
	        param2.setUpperBound(1);
	        op.getOwnedParameters().add(param2);
	
	        customer.getOwnedOperations().add(op);
	
	        // Assert
	        assertError(op, "ConstructorMatchesProperties");
	    }
    }
    
    // ------------------------------------------------------------------
    // SpecOperation - BehaviorXorSpecification - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("SpecOperation - BehaviorXorSpecification - Strong Robust")
    class BehaviorXorSpecification{
	    @Test
	    @DisplayName("BehaviorXorSpecification - Valid - Neither Present")
	    void BehaviorXorSpecificationNeither() throws Exception {
	        // Setup
	        SpecOperation op = DactFactory.eINSTANCE.createSpecOperation();
	        op.setName("doSomething");
	        op.setBehavior(null);
	        op.getOwnedRules().clear();
	
	        // Assert
	        assertValid(op, "BehaviorXorSpecification");
	    }
	
	    @Test
	    @DisplayName("BehaviorXorSpecification - Valid - Behavior Only")
	    void BehaviorXorSpecificationBehaviorOnly() throws Exception {
	        // Setup
	        Operation op = DactFactory.eINSTANCE.createOperation();
	        op.setName("doSomething");
	        
	        Activity behavior = DactFactory.eINSTANCE.createActivity();
	        op.setBehavior(behavior);
	
	        // Assert
	        assertValid(op, "BehaviorXorSpecification");
	    }
	
	    @Test
	    @DisplayName("BehaviorXorSpecification - Valid - Specification (OwnedRules) Only")
	    void BehaviorXorSpecificationSpecificationOnly() throws Exception {
	        // Setup
	        SpecOperation op = DactFactory.eINSTANCE.createSpecOperation();
	        op.setName("doSomething");
	        
	        SpecRule rule = DactFactory.eINSTANCE.createSpecRule();
	        op.getOwnedRules().add(rule);
	
	        // Assert
	        assertValid(op, "BehaviorXorSpecification");
	    }
	
	    @Test
	    @DisplayName("BehaviorXorSpecification - Invalid - Both Behavior and Specification Present")
	    void BehaviorXorSpecificationBothPresent() throws Exception {
	        // Setup
	        SpecOperation op = DactFactory.eINSTANCE.createSpecOperation();
	        op.setName("doSomething");
	        
	        Activity behavior = DactFactory.eINSTANCE.createActivity();
	        SpecRule rule = DactFactory.eINSTANCE.createSpecRule();
	        
	        op.setBehavior(behavior);
	        op.getOwnedRules().add(rule);
	
	        // Assert
	        assertError(op, "BehaviorXorSpecification");
	    }
    }
    
    // ------------------------------------------------------------------
    // SpecOperation - OwnedByDomainObjectOnly - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("SpecOperation - OwnedByDomainObjectOnly - Strong Robust")
    class OwnedByDomainObjectOnly{
	    @Test
	    @DisplayName("OwnedByDomainObjectOnly - Valid - Owned By Domain Object Only")
	    void OwnedByDomainObjectOnlyValidDomainObject() throws Exception {
	        // Setup
	        Entity domainObject = DactFactory.eINSTANCE.createEntity();
	        domainObject.setName("Order");
	
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        specOp.setName("validateOrder");
	        domainObject.getOwnedOperations().add(specOp);
	        
	        // Assert
	        assertValid(specOp, "OwnedByDomainObjectOnly");
	    }
	
	    @Test
	    @DisplayName("OwnedByDomainObjectOnly - Invalid - Owned By Interface Only")
	    void OwnedByDomainObjectOnlyInterfaceOnly() throws Exception {
	        // Setup
	        Repository repo = DactFactory.eINSTANCE.createRepository();
	
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        specOp.setName("validateOrder");
	        repo.getOwnedOperations().add(specOp);
	
	        // Assert
	        assertError(specOp, "OwnedByDomainObjectOnly");
	    }
	
	    @Test
	    @DisplayName("OwnedByDomainObjectOnly - Invalid - No Owner")
	    void OwnedByDomainObjectOnlyNoOwner() throws Exception {
	        // Setup
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        specOp.setName("validateOrder");
	
	        // Assert
	        assertError(specOp, "OwnedByDomainObjectOnly");
	    }
    }
    
    // ------------------------------------------------------------------
    // SpecOperation - UniqueRuleNames - Weak Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("SpecOperation - UniqueRuleNames - Weak Robust")
    class UniqueRuleNames{
	    @Test
	    @DisplayName("UniqueRuleNames - Valid - Unique")
	    void UniqueRuleNamesControl() throws Exception {
	    	// Setup
	    	SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	    	SpecRule rule1 = DactFactory.eINSTANCE.createSpecRule();
	    	rule1.setName("rule1");
	    	specOp.getOwnedRules().add(rule1);
	    	
	    	SpecRule rule2 = DactFactory.eINSTANCE.createSpecRule();
	    	rule2.setName("rule2");
	    	specOp.getOwnedRules().add(rule2);
	    	
	    	// Assert
	    	assertValid(specOp, "UniqueRuleNames");
	    }
	    
	    @Test
	    @DisplayName("UniqueRuleNames - Invalid - Duplicate")
	    void UniqueRuleNamesTest() throws Exception {
	    	// Setup
	    	SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	    	SpecRule rule1 = DactFactory.eINSTANCE.createSpecRule();
	    	rule1.setName("rule");
	    	specOp.getOwnedRules().add(rule1);
	    	
	    	SpecRule rule2 = DactFactory.eINSTANCE.createSpecRule();
	    	rule2.setName("rule");
	    	specOp.getOwnedRules().add(rule2);
	    	
	    	// Assert
	    	assertError(specOp, "UniqueRuleNames");
	    }
    }
    
    // ------------------------------------------------------------------
    // SpecOperation - SingleBoolOutParameter - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("SpecOperation - SingleBoolOutParameter - Strong Robust")
    class SingleBoolOutParameter{
	    @Test
	    @DisplayName("SingleBoolOutParameter - Valid - Ideal Single Boolean OUT Parameter")
	    void SingleBoolOutParameterIdeal() throws Exception {
	        // Setup
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        specOp.setName("isValid");
	
	        Parameter outParam = DactFactory.eINSTANCE.createParameter();
	        outParam.setName("result");
	        outParam.setDirection(ParameterDirection.OUT);
	        outParam.setType(BOOL);
	        outParam.setLowerBound(1);
	        outParam.setUpperBound(1);
	        specOp.getOwnedParameters().add(outParam);
	
	        // Assert
	        assertValid(specOp, "SingleBoolOutParameter");
	    }
	
	    @Test
	    @DisplayName("SingleBoolOutParameter - Invalid - Zero OUT Parameters")
	    void SingleBoolOutParameterZeroOutParams() throws Exception {
	        // Setup
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        specOp.setName("isValid");
	
	        // Only IN parameter added
	        Parameter inParam = DactFactory.eINSTANCE.createParameter();
	        inParam.setName("input");
	        inParam.setDirection(ParameterDirection.IN);
	        specOp.getOwnedParameters().add(inParam);
	
	        // Assert
	        assertError(specOp, "SingleBoolOutParameter");
	    }
	
	    @Test
	    @DisplayName("SingleBoolOutParameter - Invalid - Multiple OUT Parameters")
	    void SingleBoolOutParameterMultipleOutParams() throws Exception {
	        // Setup
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        specOp.setName("isValid");
	
	        for (int i = 1; i <= 2; i++) {
	            Parameter outParam = DactFactory.eINSTANCE.createParameter();
	            outParam.setName("result" + i);
	            outParam.setDirection(ParameterDirection.OUT);
	            outParam.setType(BOOL);
	            outParam.setLowerBound(1);
	            outParam.setUpperBound(1);
	            specOp.getOwnedParameters().add(outParam);
	        }
	
	        // Assert
	        assertError(specOp, "SingleBoolOutParameter");
	    }
	
	    @Test
	    @DisplayName("SingleBoolOutParameter - Invalid - OUT Parameter Type Mismatch")
	    void SingleBoolOutParameterTypeMismatch() throws Exception {
	        // Setup
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        specOp.setName("isValid");
	        
	        Parameter outParam = DactFactory.eINSTANCE.createParameter();
	        outParam.setName("result");
	        outParam.setDirection(ParameterDirection.OUT);
	        outParam.setType(STR); // StringType instead of BooleanType
	        outParam.setLowerBound(1);
	        outParam.setUpperBound(1);
	        specOp.getOwnedParameters().add(outParam);
	
	        // Assert
	        assertError(specOp, "SingleBoolOutParameter");
	    }
	
	    @Test
	    @DisplayName("SingleBoolOutParameter - Invalid - Lower Bound Mismatch")
	    void SingleBoolOutParameterLowerBoundMismatch() throws Exception {
	        // Setup
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        specOp.setName("isValid");
	
	        Parameter outParam = DactFactory.eINSTANCE.createParameter();
	        outParam.setName("result");
	        outParam.setDirection(ParameterDirection.OUT);
	        outParam.setType(BOOL);
	        outParam.setLowerBound(0); // Invalid lower bound
	        outParam.setUpperBound(1);
	        specOp.getOwnedParameters().add(outParam);
	
	        // Assert
	        assertError(specOp, "SingleBoolOutParameter");
	    }
	
	    @Test
	    @DisplayName("SingleBoolOutParameter - Invalid - Upper Bound Mismatch")
	    void SingleBoolOutParameterUpperBoundMismatch() throws Exception {
	        // Setup
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        specOp.setName("isValid");
	
	        Parameter outParam = DactFactory.eINSTANCE.createParameter();
	        outParam.setName("result");
	        outParam.setDirection(ParameterDirection.OUT);
	        outParam.setType(BOOL);
	        outParam.setLowerBound(1);
	        outParam.setUpperBound(-1); // Unbounded / Invalid upper bound
	        specOp.getOwnedParameters().add(outParam);
	
	        // Assert
	        assertError(specOp, "SingleBoolOutParameter");
	    }
	
	    @Test
	    @DisplayName("SingleBoolOutParameter - Valid - Non-OUT Parameters Ignored")
	    void SingleBoolOutParameterWithInParameters() throws Exception {
	        // Setup
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        specOp.setName("isValid");
	
	        // IN parameters
	        Parameter inParam = DactFactory.eINSTANCE.createParameter();
	        inParam.setName("inputData");
	        inParam.setDirection(ParameterDirection.IN);
	        inParam.setType(STR);
	        specOp.getOwnedParameters().add(inParam);
	
	        // Single OUT parameter
	        Parameter outParam = DactFactory.eINSTANCE.createParameter();
	        outParam.setName("result");
	        outParam.setDirection(ParameterDirection.OUT);
	        outParam.setType(BOOL);
	        outParam.setLowerBound(1);
	        outParam.setUpperBound(1);
	        specOp.getOwnedParameters().add(outParam);
	
	        // Assert
	        assertValid(specOp, "SingleBoolOutParameter");
	    }
    }
    
    // ------------------------------------------------------------------
    // Interface - UniqueOperationNames - Weak Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Interface - UniqueOperationNames - Weak Robust")
    class InterfaceUniqueOperationNames{
	    @Test
	    @DisplayName("UniqueOperationNames - Valid - Unique")
	    void InterfaceUniqueOperationNamesControl() throws Exception {
	    	// Setup 
	    	Service service = DactFactory.eINSTANCE.createService();
	    	Operation op1 = DactFactory.eINSTANCE.createOperation();
	    	op1.setName("Op1");
	    	service.getOwnedOperations().add(op1);
	    	
	    	Operation op2 = DactFactory.eINSTANCE.createOperation();
	    	op2.setName("Op2");
	    	service.getOwnedOperations().add(op2);
	    	
	    	// Assert
	    	assertValid(service, "UniqueOperationNames");
	    }
	    
	    @Test
	    @DisplayName("UniqueOperationNames - Invalid - Duplicate")
	    void InterfaceUniqueOperationNamesTest() throws Exception {
	    	// Setup 
	    	Service service = DactFactory.eINSTANCE.createService();
	    	Operation op1 = DactFactory.eINSTANCE.createOperation();
	    	op1.setName("Op");
	    	service.getOwnedOperations().add(op1);
	    	
	    	Operation op2 = DactFactory.eINSTANCE.createOperation();
	    	op2.setName("Op");
	    	service.getOwnedOperations().add(op2);
	    	
	    	// Assert
	    	assertError(service, "UniqueOperationNames");
	    }
    }
    
    // ------------------------------------------------------------------
    // DomainObject - UniqueOperationNames - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("DomainObject - UniqueOperationNames - Strong Robust")
    class DomainObjectUniqueOperationNames{
	    @Test
	    @DisplayName("UniqueOperationNames - Valid - Unique Non-Constructor Operations")
	    void UniqueOperationNamesUniqueNonConstructors() throws Exception {
	        // Setup
	        Entity entity = DactFactory.eINSTANCE.createEntity();
	        entity.setName("Customer");
	
	        Operation op1 = DactFactory.eINSTANCE.createOperation();
	        op1.setName("getName");
	        op1.setType(OperationType.D2_COMPOUND_MUTATOR);
	
	        Operation op2 = DactFactory.eINSTANCE.createOperation();
	        op2.setName("setEmail");
	        op2.setType(OperationType.D2_COMPOUND_MUTATOR);
	
	        entity.getOwnedOperations().add(op1);
	        entity.getOwnedOperations().add(op2);
	
	        // Assert
	        assertValid(entity, "UniqueOperationNames");
	    }
	
	    @Test
	    @DisplayName("UniqueOperationNames - Valid - Overloaded Constructors with Different IN Param Counts")
	    void UniqueOperationNamesValidConstructorOverloading() throws Exception {
	        // Setup
	        Entity entity = DactFactory.eINSTANCE.createEntity();
	        entity.setName("Customer");
	
	        // Constructor 1: 1 IN parameter
	        Operation ctor1 = DactFactory.eINSTANCE.createOperation();
	        ctor1.setName("createCustomer");
	        ctor1.setType(OperationType.D0_CONSTRUCTOR);
	
	        Parameter param1 = DactFactory.eINSTANCE.createParameter();
	        param1.setName("id");
	        param1.setDirection(ParameterDirection.IN);
	        ctor1.getOwnedParameters().add(param1);
	
	        // Constructor 2: 2 IN parameters
	        Operation ctor2 = DactFactory.eINSTANCE.createOperation();
	        ctor2.setName("createCustomer");
	        ctor2.setType(OperationType.D0_CONSTRUCTOR);
	
	        Parameter param2a = DactFactory.eINSTANCE.createParameter();
	        param2a.setName("id");
	        param2a.setDirection(ParameterDirection.IN);
	        Parameter param2b = DactFactory.eINSTANCE.createParameter();
	        param2b.setName("name");
	        param2b.setDirection(ParameterDirection.IN);
	
	        ctor2.getOwnedParameters().add(param2a);
	        ctor2.getOwnedParameters().add(param2b);
	
	        entity.getOwnedOperations().add(ctor1);
	        entity.getOwnedOperations().add(ctor2);
	
	        // Assert
	        assertValid(entity, "UniqueOperationNames");
	    }
	
	    @Test
	    @DisplayName("UniqueOperationNames - Invalid - Duplicate Non-Constructor Names")
	    void UniqueOperationNamesDuplicateNonConstructors() throws Exception {
	        // Setup
	        Entity entity = DactFactory.eINSTANCE.createEntity();
	        entity.setName("Customer");
	
	        Operation op1 = DactFactory.eINSTANCE.createOperation();
	        op1.setName("doSomething");
	        op1.setType(OperationType.D2_COMPOUND_MUTATOR);
	
	        Operation op2 = DactFactory.eINSTANCE.createOperation();
	        op2.setName("doSomething");
	        op2.setType(OperationType.D2_COMPOUND_MUTATOR);
	
	        entity.getOwnedOperations().add(op1);
	        entity.getOwnedOperations().add(op2);
	
	        // Assert
	        assertError(entity, "UniqueOperationNames");
	    }
	
	    @Test
	    @DisplayName("UniqueOperationNames - Invalid - Duplicate Constructors with Same IN Param Count")
	    void UniqueOperationNamesDuplicateConstructors() throws Exception {
	        // Setup
	        Entity entity = DactFactory.eINSTANCE.createEntity();
	        entity.setName("Customer");
	
	        // Constructor 1: 1 IN parameter
	        Operation ctor1 = DactFactory.eINSTANCE.createOperation();
	        ctor1.setName("createCustomer");
	        ctor1.setType(OperationType.D0_CONSTRUCTOR);
	
	        Parameter param1 = DactFactory.eINSTANCE.createParameter();
	        param1.setName("id");
	        param1.setDirection(ParameterDirection.IN);
	        ctor1.getOwnedParameters().add(param1);
	
	        // Constructor 2: 1 IN parameter (Duplicate signature)
	        Operation ctor2 = DactFactory.eINSTANCE.createOperation();
	        ctor2.setName("createCustomer");
	        ctor2.setType(OperationType.D0_CONSTRUCTOR);
	
	        Parameter param2 = DactFactory.eINSTANCE.createParameter();
	        param2.setName("email");
	        param2.setDirection(ParameterDirection.IN);
	        ctor2.getOwnedParameters().add(param2);
	
	        entity.getOwnedOperations().add(ctor1);
	        entity.getOwnedOperations().add(ctor2);
	
	        // Assert
	        assertError(entity, "UniqueOperationNames");
	    }
	
	    @Test
	    @DisplayName("UniqueOperationNames - Invalid - Name Collision Between Constructor and Non-Constructor")
	    void UniqueOperationNamesConstructorAndMutatorCollision() throws Exception {
	        // Setup
	        Entity entity = DactFactory.eINSTANCE.createEntity();
	        entity.setName("Customer");
	
	        // Constructor named "reset"
	        Operation ctor = DactFactory.eINSTANCE.createOperation();
	        ctor.setName("reset");
	        ctor.setType(OperationType.D0_CONSTRUCTOR);
	        entity.getOwnedOperations().add(ctor);
	
	        // Mutator named "reset"
	        Operation op = DactFactory.eINSTANCE.createOperation();
	        op.setName("reset");
	        op.setType(OperationType.D2_COMPOUND_MUTATOR);
	        entity.getOwnedOperations().add(op);
	
	
	        // Assert
	        assertError(entity, "UniqueOperationNames");
	    }
	
	    @Test
	    @DisplayName("UniqueOperationNames - Invalid - Non-IN Parameters Do Not Resolve Constructor Overloads")
	    void UniqueOperationNamesNonInParamsIgnoredForConstructors() throws Exception {
	        // Setup
	        Entity entity = DactFactory.eINSTANCE.createEntity();
	        entity.setName("Customer");
	
	        // Constructor 1: 1 IN parameter
	        Operation ctor1 = DactFactory.eINSTANCE.createOperation();
	        ctor1.setName("createCustomer");
	        ctor1.setType(OperationType.D0_CONSTRUCTOR);
	
	        Parameter param1 = DactFactory.eINSTANCE.createParameter();
	        param1.setName("id");
	        param1.setDirection(ParameterDirection.IN);
	        ctor1.getOwnedParameters().add(param1);
	
	        // Constructor 2: 1 IN parameter + 1 OUT parameter (IN count is still 1 -> Collision)
	        Operation ctor2 = DactFactory.eINSTANCE.createOperation();
	        ctor2.setName("createCustomer");
	        ctor2.setType(OperationType.D0_CONSTRUCTOR);
	
	        Parameter param2In = DactFactory.eINSTANCE.createParameter();
	        param2In.setName("id");
	        param2In.setDirection(ParameterDirection.IN);
	        ctor2.getOwnedParameters().add(param2In);
	
	        Parameter param2Out = DactFactory.eINSTANCE.createParameter();
	        param2Out.setName("result");
	        param2Out.setDirection(ParameterDirection.OUT);
	        ctor2.getOwnedParameters().add(param2Out);
	
	        entity.getOwnedOperations().add(ctor1);
	        entity.getOwnedOperations().add(ctor2);
	
	        // Assert
	        assertError(entity, "UniqueOperationNames");
	    }
    }
    
    // ------------------------------------------------------------------
    // DomainObject - UniquePropertyNames - Weak Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("DomainObject - UniquePropertyNames - Weak Robust")
    class UniquePropertyNames{
	    @Test
	    @DisplayName("UniquePropertyNames - Valid - Unique")
	    void UniquePropertyNamesControl() throws Exception {
	        // Setup
	        Entity customer = DactFactory.eINSTANCE.createEntity();
	        customer.setName("Customer");
	
	        Property prop1 = DactFactory.eINSTANCE.createProperty();
	        prop1.setName("id");
	        customer.getOwnedProperties().add(prop1);
	
	        Property prop2 = DactFactory.eINSTANCE.createProperty();
	        prop2.setName("email");
	        customer.getOwnedProperties().add(prop2);
	
	        // Assert
	        assertValid(customer, "UniquePropertyNames");
	    }
	
	    @Test
	    @DisplayName("UniquePropertyNames - Invalid - Duplicate")
	    void UniquePropertyNamesDuplicateNames() throws Exception {
	        // Setup
	        Entity customer = DactFactory.eINSTANCE.createEntity();
	        customer.setName("Customer");
	
	        Property prop1 = DactFactory.eINSTANCE.createProperty();
	        prop1.setName("email");
	        customer.getOwnedProperties().add(prop1);
	
	        Property prop2 = DactFactory.eINSTANCE.createProperty();
	        prop2.setName("email"); // Duplicate name
	        customer.getOwnedProperties().add(prop2);
	
	        // Assert
	        assertError(customer, "UniquePropertyNames");
	    }
    }
    
    // ------------------------------------------------------------------
    // DomainObject - SingleInvariantOperation - Weak Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("DomainObject - SingleInvariantOperation - Weak Robust")
    class SingleInvariantOperation{
	    @Test
	    @DisplayName("SingleInvariantOperation - Valid - Zero Invariants")
	    void SingleInvariantOperationZero() throws Exception {
	        // Setup
	        Entity customer = DactFactory.eINSTANCE.createEntity();
	        customer.setName("Customer");
	
	        // Non-invariant SpecOperation
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        specOp.setName("validateData");
	        specOp.setIsInvariant(false);
	        customer.getOwnedOperations().add(specOp);
	
	        // Assert
	        assertValid(customer, "SingleInvariantOperation");
	    }
	
	    @Test
	    @DisplayName("SingleInvariantOperation - Valid - Exactly One Invariant")
	    void SingleInvariantOperationSingle() throws Exception {
	        // Setup
	        Entity customer = DactFactory.eINSTANCE.createEntity();
	        customer.setName("Customer");
	
	        SpecOperation invOp = DactFactory.eINSTANCE.createSpecOperation();
	        invOp.setName("checkInvariants");
	        invOp.setIsInvariant(true);
	        customer.getOwnedOperations().add(invOp);
	
	        // Assert
	        assertValid(customer, "SingleInvariantOperation");
	    }
	
	    @Test
	    @DisplayName("SingleInvariantOperation - Invalid - Multiple Invariant Operations")
	    void SingleInvariantOperationMultiple() throws Exception {
	        // Setup
	        Entity customer = DactFactory.eINSTANCE.createEntity();
	        customer.setName("Customer");
	
	        SpecOperation invOp1 = DactFactory.eINSTANCE.createSpecOperation();
	        invOp1.setName("checkInvariants1");
	        invOp1.setIsInvariant(true);
	
	        SpecOperation invOp2 = DactFactory.eINSTANCE.createSpecOperation();
	        invOp2.setName("checkInvariants2");
	        invOp2.setIsInvariant(true);
	
	        customer.getOwnedOperations().add(invOp1);
	        customer.getOwnedOperations().add(invOp2);
	
	        // Assert
	        assertError(customer, "SingleInvariantOperation");
	    }
	
	    @Test
	    @DisplayName("SingleInvariantOperation - Valid - Mixed Invariants and Standard Operations")
	    void SingleInvariantOperationMixedOperations() throws Exception {
	        // Setup
	        Entity customer = DactFactory.eINSTANCE.createEntity();
	        customer.setName("Customer");
	
	        // 1 Invariant SpecOperation
	        SpecOperation invOp = DactFactory.eINSTANCE.createSpecOperation();
	        invOp.setName("checkInvariants");
	        invOp.setIsInvariant(true);
	
	        // 1 Non-Invariant SpecOperation
	        SpecOperation normalSpecOp = DactFactory.eINSTANCE.createSpecOperation();
	        normalSpecOp.setName("validateAge");
	        normalSpecOp.setIsInvariant(false);
	
	        // 1 Standard Operation
	        Operation stdOp = DactFactory.eINSTANCE.createOperation();
	        stdOp.setName("updateCustomer");
	
	        customer.getOwnedOperations().add(invOp);
	        customer.getOwnedOperations().add(normalSpecOp);
	        customer.getOwnedOperations().add(stdOp);
	
	        // Assert
	        assertValid(customer, "SingleInvariantOperation");
	    }    
    }
    
    // ------------------------------------------------------------------
    // Activity - MappingsOnlyWithSpecification - Weak Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Activity - MappingsOnlyWithSpecification - Weak Robust")
    class MappingsOnlyWithSpecification{
	    @Test
	    @DisplayName("MappingsOnlyWithSpecification - Valid - Has Specification and Parameter Mappings")
	    void MappingsOnlyWithSpecificationIdeal() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        activity.setName("processOrder");
	
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        activity.setSpecification(specOp);
	
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	        activity.getParameterMappings().add(mapping);
	
	        // Assert
	        assertValid(activity, "MappingsOnlyWithSpecification");
	    }
	
	    @Test
	    @DisplayName("MappingsOnlyWithSpecification - Valid - No Specification and No Mappings")
	    void MappingsOnlyWithSpecificationNoSpecNoMappings() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        activity.setName("processOrder");
	
	        activity.setSpecification(null);
	        activity.getParameterMappings().clear();
	
	        // Assert
	        assertValid(activity, "MappingsOnlyWithSpecification");
	    }
	
	    @Test
	    @DisplayName("MappingsOnlyWithSpecification - Valid - Has Specification and No Mappings")
	    void MappingsOnlyWithSpecificationSpecOnly() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        activity.setName("processOrder");
	
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        activity.setSpecification(specOp);
	        activity.getParameterMappings().clear();
	
	        // Assert
	        assertValid(activity, "MappingsOnlyWithSpecification");
	    }
	
	    @Test
	    @DisplayName("MappingsOnlyWithSpecification - Invalid - Parameter Mappings Without Specification")
	    void MappingsOnlyWithSpecificationMappingsWithoutSpec() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        activity.setName("processOrder");
	
	        activity.setSpecification(null);
	
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	        activity.getParameterMappings().add(mapping);
	
	        // Assert
	        assertError(activity, "MappingsOnlyWithSpecification");
	    }
    }
    
    // ------------------------------------------------------------------
    // Activity - MatchedParameterMappingsCount - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Activity - MatchedParameterMappingsCount - Strong Robust")
    class MatchedParameterMappingsCount{
	    @Test
	    @DisplayName("MatchedParameterMappingsCount - Valid - Specification Is Null")
	    void MatchedParameterMappingsCountNullSpecification() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        activity.setName("processOrder");
	        activity.setSpecification(null);
	
	        // Activity has 1 parameter, but 0 mappings (would fail if spec was present)
	        Parameter actParam = DactFactory.eINSTANCE.createParameter();
	        activity.getOwnedParameters().add(actParam);
	
	        // Assert
	        assertValid(activity, "MatchedParameterMappingsCount");
	    }
	
	    @Test
	    @DisplayName("MatchedParameterMappingsCount - Valid - All Parameter Counts Match")
	    void MatchedParameterMappingsCountIdeal() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        activity.setName("processOrder");
	
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        activity.setSpecification(specOp);
	
	        // 2 Spec Parameters
	        Parameter opParam1 = DactFactory.eINSTANCE.createParameter();
	        Parameter opParam2 = DactFactory.eINSTANCE.createParameter();
	        specOp.getOwnedParameters().add(opParam1);
	        specOp.getOwnedParameters().add(opParam2);
	
	        // 2 Activity Parameters
	        Parameter actParam1 = DactFactory.eINSTANCE.createParameter();
	        Parameter actParam2 = DactFactory.eINSTANCE.createParameter();
	        activity.getOwnedParameters().add(actParam1);
	        activity.getOwnedParameters().add(actParam2);
	
	        // 2 Parameter Mappings
	        ParameterMapping map1 = DactFactory.eINSTANCE.createParameterMapping();
	        ParameterMapping map2 = DactFactory.eINSTANCE.createParameterMapping();
	        activity.getParameterMappings().add(map1);
	        activity.getParameterMappings().add(map2);
	
	        // Assert
	        assertValid(activity, "MatchedParameterMappingsCount");
	    }
	
	    @Test
	    @DisplayName("MatchedParameterMappingsCount - Invalid - Parameter Mappings Mismatch Activity Parameters")
	    void MatchedParameterMappingsCountMismatchActivityParameters() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        activity.setName("processOrder");
	
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        activity.setSpecification(specOp);
	
	        // 2 Spec Parameters
	        specOp.getOwnedParameters().add(DactFactory.eINSTANCE.createParameter());
	        specOp.getOwnedParameters().add(DactFactory.eINSTANCE.createParameter());
	
	        // 1 Activity Parameter (Mismatch!)
	        activity.getOwnedParameters().add(DactFactory.eINSTANCE.createParameter());
	
	        // 2 Parameter Mappings
	        activity.getParameterMappings().add(DactFactory.eINSTANCE.createParameterMapping());
	        activity.getParameterMappings().add(DactFactory.eINSTANCE.createParameterMapping());
	
	        // Assert
	        assertError(activity, "MatchedParameterMappingsCount");
	    }
	
	    @Test
	    @DisplayName("MatchedParameterMappingsCount - Invalid - Parameter Mappings Mismatch Operation Parameters")
	    void MatchedParameterMappingsCountMismatchOperationParameters() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        activity.setName("processOrder");
	
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        activity.setSpecification(specOp);
	
	        // 1 Spec Parameter (Mismatch!)
	        specOp.getOwnedParameters().add(DactFactory.eINSTANCE.createParameter());
	
	        // 2 Activity Parameters
	        activity.getOwnedParameters().add(DactFactory.eINSTANCE.createParameter());
	        activity.getOwnedParameters().add(DactFactory.eINSTANCE.createParameter());
	
	        // 2 Parameter Mappings
	        activity.getParameterMappings().add(DactFactory.eINSTANCE.createParameterMapping());
	        activity.getParameterMappings().add(DactFactory.eINSTANCE.createParameterMapping());
	
	        // Assert
	        assertError(activity, "MatchedParameterMappingsCount");
	    }
	
	    @Test
	    @DisplayName("MatchedParameterMappingsCount - Invalid - All Parameter Counts Differ")
	    void MatchedParameterMappingsCountAllCountsDiffer() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        activity.setName("processOrder");
	
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        activity.setSpecification(specOp);
	
	        // 1 Spec Parameter
	        specOp.getOwnedParameters().add(DactFactory.eINSTANCE.createParameter());
	
	        // 2 Activity Parameters
	        activity.getOwnedParameters().add(DactFactory.eINSTANCE.createParameter());
	        activity.getOwnedParameters().add(DactFactory.eINSTANCE.createParameter());
	
	        // 3 Parameter Mappings
	        activity.getParameterMappings().add(DactFactory.eINSTANCE.createParameterMapping());
	        activity.getParameterMappings().add(DactFactory.eINSTANCE.createParameterMapping());
	        activity.getParameterMappings().add(DactFactory.eINSTANCE.createParameterMapping());
	
	        // Assert
	        assertError(activity, "MatchedParameterMappingsCount");
	    }
    }
    
    // ------------------------------------------------------------------
    // Activity - EachParameterIsMapped - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("Activity - EachParameterIsMapped - Strong Robust")
    class EachParameterIsMapped{
	    @Test
	    @DisplayName("EachParameterIsMapped - Valid - Specification Is Null")
	    void EachParameterIsMappedNullSpecification() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        activity.setName("processOrder");
	        activity.setSpecification(null);
	
	        Parameter actParam = DactFactory.eINSTANCE.createParameter();
	        activity.getOwnedParameters().add(actParam);
	
	        // Assert
	        assertValid(activity, "EachParameterIsMapped");
	    }
	
	    @Test
	    @DisplayName("EachParameterIsMapped - Valid - Ideal Bijective Mapping")
	    void EachParameterIsMappedIdeal() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        activity.setName("processOrder");
	
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        specOp.setName("specOrder");
	        activity.setSpecification(specOp);
	
	        Parameter opParam1 = DactFactory.eINSTANCE.createParameter();
	        Parameter opParam2 = DactFactory.eINSTANCE.createParameter();
	        specOp.getOwnedParameters().add(opParam1);
	        specOp.getOwnedParameters().add(opParam2);
	
	        Parameter actParam1 = DactFactory.eINSTANCE.createParameter();
	        Parameter actParam2 = DactFactory.eINSTANCE.createParameter();
	        activity.getOwnedParameters().add(actParam1);
	        activity.getOwnedParameters().add(actParam2);
	
	        // Mapping 1
	        ParameterMapping map1 = DactFactory.eINSTANCE.createParameterMapping();
	        map1.setOperationParameter(opParam1);
	        map1.setActivityParameter(actParam1);
	
	        // Mapping 2
	        ParameterMapping map2 = DactFactory.eINSTANCE.createParameterMapping();
	        map2.setOperationParameter(opParam2);
	        map2.setActivityParameter(actParam2);
	
	        activity.getParameterMappings().add(map1);
	        activity.getParameterMappings().add(map2);
	
	        // Assert
	        assertValid(activity, "EachParameterIsMapped");
	    }
	
	    @Test
	    @DisplayName("EachParameterIsMapped - Invalid - Duplicate Operation Parameter Mapped")
	    void EachParameterIsMappedDuplicateOperationParameter() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        activity.setName("processOrder");
	
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        specOp.setName("specOrder");
	        activity.setSpecification(specOp);
	
	        Parameter opParam1 = DactFactory.eINSTANCE.createParameter();
	        specOp.getOwnedParameters().add(opParam1);
	
	        Parameter actParam1 = DactFactory.eINSTANCE.createParameter();
	        Parameter actParam2 = DactFactory.eINSTANCE.createParameter();
	        activity.getOwnedParameters().add(actParam1);
	        activity.getOwnedParameters().add(actParam2);
	
	        // Both mappings point to the same operation parameter opParam1
	        ParameterMapping map1 = DactFactory.eINSTANCE.createParameterMapping();
	        map1.setOperationParameter(opParam1);
	        map1.setActivityParameter(actParam1);
	
	        ParameterMapping map2 = DactFactory.eINSTANCE.createParameterMapping();
	        map2.setOperationParameter(opParam1);
	        map2.setActivityParameter(actParam2);
	
	        activity.getParameterMappings().add(map1);
	        activity.getParameterMappings().add(map2);
	
	        // Assert
	        assertError(activity, "EachParameterIsMapped");
	    }
	
	    @Test
	    @DisplayName("EachParameterIsMapped - Invalid - Missing Operation Parameter Coverage")
	    void EachParameterIsMappedMissingOperationParameter() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        activity.setName("processOrder");
	
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        specOp.setName("specOrder");
	        activity.setSpecification(specOp);
	
	        Parameter opParam1 = DactFactory.eINSTANCE.createParameter();
	        Parameter opParam2 = DactFactory.eINSTANCE.createParameter(); // Unmapped!
	        specOp.getOwnedParameters().add(opParam1);
	        specOp.getOwnedParameters().add(opParam2);
	
	        Parameter actParam1 = DactFactory.eINSTANCE.createParameter();
	        activity.getOwnedParameters().add(actParam1);
	
	        ParameterMapping map1 = DactFactory.eINSTANCE.createParameterMapping();
	        map1.setOperationParameter(opParam1);
	        map1.setActivityParameter(actParam1);
	
	        activity.getParameterMappings().add(map1);
	
	        // Assert
	        assertError(activity, "EachParameterIsMapped");
	    }
	
	    @Test
	    @DisplayName("EachParameterIsMapped - Invalid - Duplicate Activity Parameter Mapped")
	    void EachParameterIsMappedDuplicateActivityParameter() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        activity.setName("processOrder");
	
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        specOp.setName("specOrder");
	        activity.setSpecification(specOp);
	
	        Parameter opParam1 = DactFactory.eINSTANCE.createParameter();
	        Parameter opParam2 = DactFactory.eINSTANCE.createParameter();
	        specOp.getOwnedParameters().add(opParam1);
	        specOp.getOwnedParameters().add(opParam2);
	
	        Parameter actParam1 = DactFactory.eINSTANCE.createParameter();
	        activity.getOwnedParameters().add(actParam1);
	
	        // Both mappings point to the same activity parameter actParam1
	        ParameterMapping map1 = DactFactory.eINSTANCE.createParameterMapping();
	        map1.setOperationParameter(opParam1);
	        map1.setActivityParameter(actParam1);
	
	        ParameterMapping map2 = DactFactory.eINSTANCE.createParameterMapping();
	        map2.setOperationParameter(opParam2);
	        map2.setActivityParameter(actParam1);
	
	        activity.getParameterMappings().add(map1);
	        activity.getParameterMappings().add(map2);
	
	        // Assert
	        assertError(activity, "EachParameterIsMapped");
	    }
	
	    @Test
	    @DisplayName("EachParameterIsMapped - Invalid - Missing Activity Parameter Coverage")
	    void EachParameterIsMappedMissingActivityParameter() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        activity.setName("processOrder");
	
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        specOp.setName("specOrder");
	        activity.setSpecification(specOp);
	
	        Parameter opParam1 = DactFactory.eINSTANCE.createParameter();
	        specOp.getOwnedParameters().add(opParam1);
	
	        Parameter actParam1 = DactFactory.eINSTANCE.createParameter();
	        Parameter actParam2 = DactFactory.eINSTANCE.createParameter(); // Unmapped!
	        activity.getOwnedParameters().add(actParam1);
	        activity.getOwnedParameters().add(actParam2);
	
	        ParameterMapping map1 = DactFactory.eINSTANCE.createParameterMapping();
	        map1.setOperationParameter(opParam1);
	        map1.setActivityParameter(actParam1);
	
	        activity.getParameterMappings().add(map1);
	
	        // Assert
	        assertError(activity, "EachParameterIsMapped");
	    }
	
	    @Test
	    @DisplayName("EachParameterIsMapped - Invalid - Incomplete Mappings On Both Sides")
	    void EachParameterIsMappedIncompleteBothSides() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        activity.setName("processOrder");
	
	        SpecOperation specOp = DactFactory.eINSTANCE.createSpecOperation();
	        specOp.setName("specOrder");
	        activity.setSpecification(specOp);
	
	        Parameter opParam1 = DactFactory.eINSTANCE.createParameter();
	        Parameter opParam2 = DactFactory.eINSTANCE.createParameter();
	        specOp.getOwnedParameters().add(opParam1);
	        specOp.getOwnedParameters().add(opParam2);
	
	        Parameter actParam1 = DactFactory.eINSTANCE.createParameter();
	        Parameter actParam2 = DactFactory.eINSTANCE.createParameter();
	        activity.getOwnedParameters().add(actParam1);
	        activity.getOwnedParameters().add(actParam2);
	
	        // Empty mappings list means neither side is covered
	        activity.getParameterMappings().clear();
	
	        // Assert
	        assertError(activity, "EachParameterIsMapped");
	    }
    }
    
    // ------------------------------------------------------------------
    // ActivityGroup - SingleInitialNode - Weak Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("ActivityGroup - SingleInitialNode - Weak Robust")
    class SingleInitialNode{
	    @Test
	    @DisplayName("SingleInitialNode - Valid - Empty Owned Nodes")
	    void SingleInitialNodeEmptyNodes() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("processOrder");
	        group.getOwnedNodes().clear();
	
	        // Assert
	        assertValid(group, "SingleInitialNode");
	    }
	
	    @Test
	    @DisplayName("SingleInitialNode - Valid - Exactly One Initial Node")
	    void SingleInitialNodeSingleInitial() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("processOrder");
	
	        InitialNode initialNode = DactFactory.eINSTANCE.createInitialNode();
	        group.getOwnedNodes().add(initialNode);
	
	        // Assert
	        assertValid(group, "SingleInitialNode");
	    }
	
	    @Test
	    @DisplayName("SingleInitialNode - Valid - One Initial Node with Other Activity Nodes")
	    void SingleInitialNodeMixedNodes() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("processOrder");
	
	        InitialNode initialNode = DactFactory.eINSTANCE.createInitialNode();
	        ExecutableNode actionNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	
	        group.getOwnedNodes().add(initialNode);
	        group.getOwnedNodes().add(actionNode);
	
	        // Assert
	        assertValid(group, "SingleInitialNode");
	    }
	
	    @Test
	    @DisplayName("SingleInitialNode - Invalid - Zero Initial Nodes")
	    void SingleInitialNodeZeroInitialNodes() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("processOrder");
	
	        // Nodes present, but none are InitialNode
	        ExecutableNode actionNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        group.getOwnedNodes().add(actionNode);
	
	        // Assert
	        assertError(group, "SingleInitialNode");
	    }
	
	    @Test
	    @DisplayName("SingleInitialNode - Invalid - Multiple Initial Nodes")
	    void SingleInitialNodeMultipleInitialNodes() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("processOrder");
	
	        InitialNode initialNode1 = DactFactory.eINSTANCE.createInitialNode();
	        InitialNode initialNode2 = DactFactory.eINSTANCE.createInitialNode();
	
	        group.getOwnedNodes().add(initialNode1);
	        group.getOwnedNodes().add(initialNode2);
	
	        // Assert
	        assertError(group, "SingleInitialNode");
	    }
    }
    
    // ------------------------------------------------------------------
    // ActivityGroup - SingleFinalNode - Weak Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("ActivityGroup - SingleFinalNode - Weak Robust")
    class SingleFinalNode{
	    @Test
	    @DisplayName("SingleFinalNode - Valid - Empty Owned Nodes")
	    void SingleFinalNodeEmptyNodes() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("processOrder");
	        group.getOwnedNodes().clear();
	
	        // Assert
	        assertValid(group, "SingleFinalNode");
	    }
	
	    @Test
	    @DisplayName("SingleFinalNode - Valid - Exactly One Final Node")
	    void SingleFinalNodeSingleFinal() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("processOrder");
	
	        FinalNode finalNode = DactFactory.eINSTANCE.createActivityFinalNode();
	        group.getOwnedNodes().add(finalNode);
	
	        // Assert
	        assertValid(group, "SingleFinalNode");
	    }
	
	    @Test
	    @DisplayName("SingleFinalNode - Valid - One Final Node with Other Activity Nodes")
	    void SingleFinalNodeMixedNodes() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("processOrder");
	
	        FinalNode finalNode = DactFactory.eINSTANCE.createActivityFinalNode();
	        ExecutableNode actionNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	
	        group.getOwnedNodes().add(finalNode);
	        group.getOwnedNodes().add(actionNode);
	
	        // Assert
	        assertValid(group, "SingleFinalNode");
	    }
	
	    @Test
	    @DisplayName("SingleFinalNode - Invalid - Zero Final Nodes")
	    void SingleFinalNodeZeroFinalNodes() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("processOrder");
	
	        // Nodes present, but none are FinalNode
	        ExecutableNode actionNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        group.getOwnedNodes().add(actionNode);
	
	        // Assert
	        assertError(group, "SingleFinalNode");
	    }
	
	    @Test
	    @DisplayName("SingleFinalNode - Invalid - Multiple Final Nodes")
	    void SingleFinalNodeMultipleFinalNodes() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("processOrder");
	
	        FinalNode finalNode1 = DactFactory.eINSTANCE.createActivityFinalNode();
	        FinalNode finalNode2 = DactFactory.eINSTANCE.createFlowFinalNode();
	
	        group.getOwnedNodes().add(finalNode1);
	        group.getOwnedNodes().add(finalNode2);
	
	        // Assert
	        assertError(group, "SingleFinalNode");
	    }
    }
    
    // ------------------------------------------------------------------
    // ActivityGroup - NonEmptyGroup - Weak Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("ActivityGroup - NonEmptyGroup - Weak Robust")
    class NonEmptyGroup{
	    @Test
	    @DisplayName("NonEmptyGroup - Valid - Contains Executable Node")
	    void NonEmptyGroupWithExecutableNode() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("processOrder");
	
	        ExecutableNode actionNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        group.getOwnedNodes().add(actionNode);
	
	        // Assert
	        assertValid(group, "NonEmptyGroup");
	    }
	
	    @Test
	    @DisplayName("NonEmptyGroup - Valid - Full Graph with Control and Action Nodes")
	    void NonEmptyGroupFullGraph() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("processOrder");
	
	        InitialNode initialNode = DactFactory.eINSTANCE.createInitialNode();
	        ExecutableNode actionNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        FinalNode finalNode = DactFactory.eINSTANCE.createActivityFinalNode();
	
	        group.getOwnedNodes().add(initialNode);
	        group.getOwnedNodes().add(actionNode);
	        group.getOwnedNodes().add(finalNode);
	
	        // Assert
	        assertValid(group, "NonEmptyGroup");
	    }
	
	    @Test
	    @DisplayName("NonEmptyGroup - Warning - Completely Empty Nodes List")
	    void NonEmptyGroupEmptyList() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("processOrder");
	
	        // Assert
	        assertWarning(group, "NonEmptyGroup");
	    }
	
	    @Test
	    @DisplayName("NonEmptyGroup - Warning - Control Endpoints Only (Initial and Final)")
	    void NonEmptyGroupOnlyEndpoints() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("processOrder");
	
	        InitialNode initialNode = DactFactory.eINSTANCE.createInitialNode();
	        FinalNode finalNode = DactFactory.eINSTANCE.createActivityFinalNode();
	
	        group.getOwnedNodes().add(initialNode);
	        group.getOwnedNodes().add(finalNode);
	
	        // Assert
	        assertWarning(group, "NonEmptyGroup");
	    }
    }
    
    // ------------------------------------------------------------------
    // ActivityEdge - NoSelfLoop - Weak Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("ActivityEdge - NoSelfLoop - Weak Robust")
    class NoSelfLoop{
	    @Test
	    @DisplayName("NoSelfLoop - Valid - Source Is Null")
	    void NoSelfLoopSourceNull() throws Exception {
	        // Setup
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        ExecutableNode targetNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        targetNode.setName("NodeB");
	
	        edge.setSource(null);
	        edge.setTarget(targetNode);
	
	        // Assert
	        assertValid(edge, "NoSelfLoop");
	    }
	
	    @Test
	    @DisplayName("NoSelfLoop - Valid - Target Is Null")
	    void NoSelfLoopTargetNull() throws Exception {
	        // Setup
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        ExecutableNode sourceNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        sourceNode.setName("NodeA");
	
	        edge.setSource(sourceNode);
	        edge.setTarget(null);
	
	        // Assert
	        assertValid(edge, "NoSelfLoop");
	    }
	
	    @Test
	    @DisplayName("NoSelfLoop - Valid - Both Source and Target Are Null")
	    void NoSelfLoopBothNull() throws Exception {
	        // Setup
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        edge.setSource(null);
	        edge.setTarget(null);
	
	        // Assert
	        assertValid(edge, "NoSelfLoop");
	    }
	
	    @Test
	    @DisplayName("NoSelfLoop - Valid - Distinct Source and Target Nodes")
	    void NoSelfLoopDistinctNodes() throws Exception {
	        // Setup
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	
	        ExecutableNode sourceNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        sourceNode.setName("NodeA");
	
	        ExecutableNode targetNode = DactFactory.eINSTANCE.createVariableAssignmentAction();
	        targetNode.setName("NodeB");
	
	        edge.setSource(sourceNode);
	        edge.setTarget(targetNode);
	
	        // Assert
	        assertValid(edge, "NoSelfLoop");
	    }
	
	    @Test
	    @DisplayName("NoSelfLoop - Invalid - Self-Loop Detected (Source Equals Target)")
	    void NoSelfLoopSelfLoopDetected() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("OrderProcessingGroup");
	
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	
	        ExecutableNode nodeA = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        nodeA.setName("NodeA");
	
	        edge.setSource(nodeA);
	        edge.setTarget(nodeA); // Self-loop!
	
	        group.getOwnedEdges().add(edge);
	
	        // Assert
	        assertError(edge, "NoSelfLoop");
	    }
    }
    
    // ------------------------------------------------------------------
    // ActivityEdge - NoEdgeIntoInitialNode - Weak Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("ActivityEdge - NoEdgeIntoInitialNode - Weak Robust")
    class NoEdgeIntoInitialNode{
	    @Test
	    @DisplayName("NoEdgeIntoInitialNode - Valid - Target is ExecutableNode")
	    void NoEdgeIntoInitialNodeTargetExecutableNode() throws Exception {
	        // Setup
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        ExecutableNode actionNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        actionNode.setName("ActionNode");
	
	        edge.setTarget(actionNode);
	
	        // Assert
	        assertValid(edge, "NoEdgeIntoInitialNode");
	    }
	
	    @Test
	    @DisplayName("NoEdgeIntoInitialNode - Valid - Target is FinalNode")
	    void NoEdgeIntoInitialNodeTargetFinalNode() throws Exception {
	        // Setup
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        FinalNode finalNode = DactFactory.eINSTANCE.createActivityFinalNode();
	        finalNode.setName("FinalNode");
	
	        edge.setTarget(finalNode);
	
	        // Assert
	        assertValid(edge, "NoEdgeIntoInitialNode");
	    }
	
	    @Test
	    @DisplayName("NoEdgeIntoInitialNode - Valid - Target is Null")
	    void NoEdgeIntoInitialNodeTargetNull() throws Exception {
	        // Setup
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        edge.setTarget(null);
	
	        // Assert
	        assertValid(edge, "NoEdgeIntoInitialNode");
	    }
	
	    @Test
	    @DisplayName("NoEdgeIntoInitialNode - Invalid - Target is InitialNode")
	    void NoEdgeIntoInitialNodeTargetInitialNode() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("OrderProcessingGroup");
	
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        InitialNode initialNode = DactFactory.eINSTANCE.createInitialNode();
	        initialNode.setName("StartNode");
	
	        edge.setTarget(initialNode); // Invalid incoming edge to initial node
	        group.getOwnedEdges().add(edge);
	
	        // Assert
	        assertError(edge, "NoEdgeIntoInitialNode");
	    }
    }
    
    // ------------------------------------------------------------------
    // ActivityEdge - NoEdgeOutOfFinalNode - Weak Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("ActivityEdge - NoEdgeOutOfFinalNode - Weak Robust")
    class NoEdgeOutOfFinalNode{
	    @Test
	    @DisplayName("NoEdgeOutOfFinalNode - Valid - Source is ExecutableNode")
	    void NoEdgeOutOfFinalNodeSourceExecutableNode() throws Exception {
	        // Setup
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        ExecutableNode actionNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        actionNode.setName("ActionNode");
	
	        edge.setSource(actionNode);
	
	        // Assert
	        assertValid(edge, "NoEdgeOutOfFinalNode");
	    }
	
	    @Test
	    @DisplayName("NoEdgeOutOfFinalNode - Valid - Source is InitialNode")
	    void NoEdgeOutOfFinalNodeSourceInitialNode() throws Exception {
	        // Setup
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        InitialNode initialNode = DactFactory.eINSTANCE.createInitialNode();
	        initialNode.setName("StartNode");
	
	        edge.setSource(initialNode);
	
	        // Assert
	        assertValid(edge, "NoEdgeOutOfFinalNode");
	    }
	
	    @Test
	    @DisplayName("NoEdgeOutOfFinalNode - Valid - Source is Null")
	    void NoEdgeOutOfFinalNodeSourceNull() throws Exception {
	        // Setup
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        edge.setSource(null);
	
	        // Assert
	        assertValid(edge, "NoEdgeOutOfFinalNode");
	    }
	
	    @Test
	    @DisplayName("NoEdgeOutOfFinalNode - Invalid - Source is FinalNode")
	    void NoEdgeOutOfFinalNodeSourceFinalNode() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("OrderProcessingGroup");
	
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        FinalNode finalNode = DactFactory.eINSTANCE.createActivityFinalNode();
	        finalNode.setName("EndNode");
	
	        edge.setSource(finalNode); // Invalid outgoing edge from final node
	        group.getOwnedEdges().add(edge);
	
	        // Assert
	        assertError(edge, "NoEdgeOutOfFinalNode");
	    }
    }
    
    // ------------------------------------------------------------------
    // ActivityEdge - EndpointsInSameGroup - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("ActivityEdge - EndpointsInSameGroup - Strong Robust")
    class EndpointsInSameGroup{
	    @Test
	    @DisplayName("EndpointsInSameGroup - Valid - Both Source and Target Belong to Edge Group")
	    void EndpointsInSameGroupIdeal() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("OrderProcessingGroup");
	
	        ExecutableNode sourceNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        sourceNode.setName("NodeA");
	
	        ExecutableNode targetNode = DactFactory.eINSTANCE.createVariableAssignmentAction();
	        targetNode.setName("NodeB");
	
	        group.getOwnedNodes().add(sourceNode);
	        group.getOwnedNodes().add(targetNode);
	
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        edge.setSource(sourceNode);
	        edge.setTarget(targetNode);
	
	        group.getOwnedEdges().add(edge);
	
	        // Assert
	        assertValid(edge, "EndpointsInSameGroup");
	    }
	
	    @Test
	    @DisplayName("EndpointsInSameGroup - Invalid - Source Is Null")
	    void EndpointsInSameGroupSourceNull() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("OrderProcessingGroup");
	
	        ExecutableNode targetNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        targetNode.setName("NodeB");
	        group.getOwnedNodes().add(targetNode);
	
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        edge.setSource(null);
	        edge.setTarget(targetNode);
	
	        group.getOwnedEdges().add(edge);
	
	        // Assert
	        assertError(edge, "EndpointsInSameGroup");
	    }
	
	    @Test
	    @DisplayName("EndpointsInSameGroup - Invalid - Target Is Null")
	    void EndpointsInSameGroupTargetNull() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("OrderProcessingGroup");
	
	        ExecutableNode sourceNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        sourceNode.setName("NodeA");
	        group.getOwnedNodes().add(sourceNode);
	
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        edge.setSource(sourceNode);
	        edge.setTarget(null);
	
	        group.getOwnedEdges().add(edge);
	
	        // Assert
	        assertError(edge, "EndpointsInSameGroup");
	    }
	
	    @Test
	    @DisplayName("EndpointsInSameGroup - Invalid - Both Source and Target Are Null")
	    void EndpointsInSameGroupBothNull() throws Exception {
	        // Setup
	        ActivityGroup group = DactFactory.eINSTANCE.createActivityGroup();
	        group.setName("OrderProcessingGroup");
	
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        edge.setSource(null);
	        edge.setTarget(null);
	
	        group.getOwnedEdges().add(edge);
	
	        // Assert
	        assertError(edge, "EndpointsInSameGroup");
	    }
	
	    @Test
	    @DisplayName("EndpointsInSameGroup - Invalid - Source Node Belongs to Other Group")
	    void EndpointsInSameGroupSourceOutsideGroup() throws Exception {
	        // Setup
	        ActivityGroup edgeGroup = DactFactory.eINSTANCE.createActivityGroup();
	        edgeGroup.setName("MainGroup");
	
	        ActivityGroup otherGroup = DactFactory.eINSTANCE.createActivityGroup();
	        otherGroup.setName("OtherGroup");
	
	        ExecutableNode sourceNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        sourceNode.setName("NodeA");
	        otherGroup.getOwnedNodes().add(sourceNode); // Source in external group
	
	        ExecutableNode targetNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        targetNode.setName("NodeB");
	        edgeGroup.getOwnedNodes().add(targetNode); // Target in edge group
	
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        edge.setSource(sourceNode);
	        edge.setTarget(targetNode);
	
	        edgeGroup.getOwnedEdges().add(edge);
	
	        // Assert
	        assertError(edge, "EndpointsInSameGroup");
	    }
	
	    @Test
	    @DisplayName("EndpointsInSameGroup - Invalid - Target Node Belongs to Other Group")
	    void EndpointsInSameGroupTargetOutsideGroup() throws Exception {
	        // Setup
	        ActivityGroup edgeGroup = DactFactory.eINSTANCE.createActivityGroup();
	        edgeGroup.setName("MainGroup");
	
	        ActivityGroup otherGroup = DactFactory.eINSTANCE.createActivityGroup();
	        otherGroup.setName("OtherGroup");
	
	        ExecutableNode sourceNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        sourceNode.setName("NodeA");
	        edgeGroup.getOwnedNodes().add(sourceNode); // Source in edge group
	
	        ExecutableNode targetNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        targetNode.setName("NodeB");
	        otherGroup.getOwnedNodes().add(targetNode); // Target in external group
	
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        edge.setSource(sourceNode);
	        edge.setTarget(targetNode);
	
	        edgeGroup.getOwnedEdges().add(edge);
	
	        // Assert
	        assertError(edge, "EndpointsInSameGroup");
	    }
	
	    @Test
	    @DisplayName("EndpointsInSameGroup - Invalid - Both Nodes Belong to External Groups")
	    void EndpointsInSameGroupBothNodesOutsideGroup() throws Exception {
	        // Setup
	        ActivityGroup edgeGroup = DactFactory.eINSTANCE.createActivityGroup();
	        edgeGroup.setName("MainGroup");
	
	        ActivityGroup otherGroup1 = DactFactory.eINSTANCE.createActivityGroup();
	        otherGroup1.setName("OtherGroup1");
	
	        ActivityGroup otherGroup2 = DactFactory.eINSTANCE.createActivityGroup();
	        otherGroup2.setName("OtherGroup2");
	
	        ExecutableNode sourceNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        sourceNode.setName("NodeA");
	        otherGroup1.getOwnedNodes().add(sourceNode);
	
	        ExecutableNode targetNode = DactFactory.eINSTANCE.createVariableDeclarationAction();
	        targetNode.setName("NodeB");
	        otherGroup2.getOwnedNodes().add(targetNode);
	
	        ActivityEdge edge = DactFactory.eINSTANCE.createActivityEdge();
	        edge.setSource(sourceNode);
	        edge.setTarget(targetNode);
	
	        edgeGroup.getOwnedEdges().add(edge);
	
	        // Assert
	        assertError(edge, "EndpointsInSameGroup");
	    }
    }
    
    // ------------------------------------------------------------------
    // DomainNode - RequiresMainExpression - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("DomainNode - RequiresMainExpression - Strong Robust")
    class RequiresMainExpression{
	    @Test
	    @DisplayName("RequiresMainExpression - Valid - DomainFindAction with Empty MainExpression")
	    void RequiresMainExpressionDomainFindActionEmpty() throws Exception {
	        // Setup
	        DomainFindAction findAction = DactFactory.eINSTANCE.createDomainFindAction();
	        findAction.setName("findAllCustomers");
	        findAction.getMainExpr().clear(); // Allowed for FindAction (Get All)
	
	        // Assert
	        assertValid(findAction, "RequiresMainExpression");
	    }
	
	    @Test
	    @DisplayName("RequiresMainExpression - Valid - DomainFindAction with Non-Empty MainExpression")
	    void RequiresMainExpressionDomainFindActionNonEmpty() throws Exception {
	        // Setup
	        DomainFindAction findAction = DactFactory.eINSTANCE.createDomainFindAction();
	        findAction.setName("findCustomerById");
	
	        Expression expr = DactFactory.eINSTANCE.createBinaryExpression();
	        findAction.getMainExpr().add(expr);
	
	        // Assert
	        assertValid(findAction, "RequiresMainExpression");
	    }
	
	    @Test
	    @DisplayName("RequiresMainExpression - Valid - DomainExistAction with Non-Empty MainExpression")
	    void RequiresMainExpressionDomainExistActionNonEmpty() throws Exception {
	        // Setup
	        DomainExistAction existAction = DactFactory.eINSTANCE.createDomainExistAction();
	        existAction.setName("checkCustomerExists");
	
	        Expression expr = DactFactory.eINSTANCE.createBinaryExpression();
	        existAction.getMainExpr().add(expr);
	
	        // Assert
	        assertValid(existAction, "RequiresMainExpression");
	    }
	
	    @Test
	    @DisplayName("RequiresMainExpression - Invalid - DomainExistAction with Empty MainExpression")
	    void RequiresMainExpressionDomainExistActionEmpty() throws Exception {
	        // Setup
	        DomainExistAction existAction = DactFactory.eINSTANCE.createDomainExistAction();
	        existAction.setName("checkCustomerExists");
	        existAction.getMainExpr().clear(); // Invalid! ExistAction requires an expression
	
	        // Assert
	        assertError(existAction, "RequiresMainExpression");
	    }
	
	    @Test
	    @DisplayName("RequiresMainExpression - Valid - General DomainAction with Non-Empty MainExpression")
	    void RequiresMainExpressionGeneralActionNonEmpty() throws Exception {
	        // Setup
	        DomainUpdateAction updateAction = DactFactory.eINSTANCE.createDomainUpdateAction();
	        updateAction.setName("updateStatus");
	
	        Expression expr = DactFactory.eINSTANCE.createBinaryExpression();
	        updateAction.getMainExpr().add(expr);
	
	        // Assert
	        assertValid(updateAction, "RequiresMainExpression");
	    }
	
	    @Test
	    @DisplayName("RequiresMainExpression - Invalid - General DomainAction with Empty MainExpression")
	    void RequiresMainExpressionGeneralActionEmpty() throws Exception {
	        // Setup
	        DomainUpdateAction updateAction = DactFactory.eINSTANCE.createDomainUpdateAction();
	        updateAction.setName("updateStatus");
	        updateAction.getMainExpr().clear(); // Invalid! Standard action requires an expression
	
	        // Assert
	        assertError(updateAction, "RequiresMainExpression");
	    }
    }
    
    // ------------------------------------------------------------------
    // DomainNode - SelfAnchoredBinaryExpression - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("DomainNode - SelfAnchoredBinaryExpression - Strong Robust")
    class SelfAnchoredBinaryExpression{
	    @Test
	    @DisplayName("SelfAnchoredBinaryExpression - Valid - Empty Main Expressions")
	    void SelfAnchoredBinaryExpressionEmptyList() throws Exception {
	        // Setup
	        DomainNode node = DactFactory.eINSTANCE.createDomainExistAction();
	        node.setName("validateCustomer");
	   
	        // Assert
	        assertValid(node, "SelfAnchoredBinaryExpression");
	    }
	
	    @Test
	    @DisplayName("SelfAnchoredBinaryExpression - Valid - Correct Self-Anchored Binary Expression")
	    void SelfAnchoredBinaryExpressionValidSelf() throws Exception {
	        // Setup
	        DomainNode node = DactFactory.eINSTANCE.createDomainExistAction();
	        node.setName("validateCustomer");
	
	        // AST Construction: self.age > 18
	        Identifier identifier = DactFactory.eINSTANCE.createIdentifier();
	        identifier.setName("self.age");
	
	        UnaryExpression leftUnary = DactFactory.eINSTANCE.createUnaryExpression();
	        leftUnary.setIdentifier(identifier);
	
	        
	        
	        BinaryExpression binaryExpr = DactFactory.eINSTANCE.createBinaryExpression();
	        binaryExpr.setName("ageCheck");
	        binaryExpr.setLeftExpr(leftUnary);
	        
	        Eq eq = DactFactory.eINSTANCE.createEq();
	        binaryExpr.setOperator(eq);
	        
	        node.getMainExpr().add(binaryExpr);
	
	        // Assert
	        assertValid(node, "SelfAnchoredBinaryExpression");
	    }
	
	    @Test
	    @DisplayName("SelfAnchoredBinaryExpression - Invalid - Expression Is Not A BinaryExpression")
	    void SelfAnchoredBinaryExpressionNotBinary() throws Exception {
	        // Setup
	        DomainNode node = DactFactory.eINSTANCE.createDomainExistAction();
	        node.setName("validateCustomer");
	
	        // Root expression is UnaryExpression instead of BinaryExpression
	        UnaryExpression unaryExpr = DactFactory.eINSTANCE.createUnaryExpression();
	        unaryExpr.setName("invalidRoot");
	
	        node.getMainExpr().add(unaryExpr);
	
	        // Assert
	        assertError(node, "SelfAnchoredBinaryExpression");
	    }
	
	    @Test
	    @DisplayName("SelfAnchoredBinaryExpression - Invalid - Left Operand Is Not A UnaryExpression")
	    void SelfAnchoredBinaryExpressionLeftNotUnary() throws Exception {
	        // Setup
	        DomainNode node = DactFactory.eINSTANCE.createDomainExistAction();
	        node.setName("validateCustomer");
	
	        // Binary expression whose left child is another BinaryExpression
	        BinaryExpression nestedLeft = DactFactory.eINSTANCE.createBinaryExpression();
	        BinaryExpression rootBinary = DactFactory.eINSTANCE.createBinaryExpression();
	        rootBinary.setName("nestedExpr");
	        rootBinary.setLeftExpr(nestedLeft);
	        
	        node.getMainExpr().add(rootBinary);
	
	        // Assert
	        assertError(node, "SelfAnchoredBinaryExpression");
	    }
	
	    @Test
	    @DisplayName("SelfAnchoredBinaryExpression - Invalid - Left Operand Identifier Is Null")
	    void SelfAnchoredBinaryExpressionNullIdentifier() throws Exception {
	        // Setup
	        DomainNode node = DactFactory.eINSTANCE.createDomainExistAction();
	        node.setName("validateCustomer");
	
	        UnaryExpression leftUnary = DactFactory.eINSTANCE.createUnaryExpression();
	        leftUnary.setIdentifier(null); // Null identifier
	
	        BinaryExpression binaryExpr = DactFactory.eINSTANCE.createBinaryExpression();
	        binaryExpr.setName("nullIdentExpr");
	        binaryExpr.setLeftExpr(leftUnary);
	
	        node.getMainExpr().add(binaryExpr);
	
	        // Assert
	        assertError(node, "SelfAnchoredBinaryExpression");
	    }
	
	    @Test
	    @DisplayName("SelfAnchoredBinaryExpression - Invalid - Identifier Does Not Start With 'self'")
	    void SelfAnchoredBinaryExpressionNotSelfAnchored() throws Exception {
	        // Setup
	        DomainNode node = DactFactory.eINSTANCE.createDomainExistAction();
	        node.setName("validateCustomer");
	
	        Identifier identifier = DactFactory.eINSTANCE.createIdentifier();
	        identifier.setName("other.age"); // Anchored to "other" instead of "self"
	
	        UnaryExpression leftUnary = DactFactory.eINSTANCE.createUnaryExpression();
	        leftUnary.setIdentifier(identifier);
	
	        BinaryExpression binaryExpr = DactFactory.eINSTANCE.createBinaryExpression();
	        binaryExpr.setName("otherAnchorExpr");
	        binaryExpr.setLeftExpr(leftUnary);
	
	        node.getMainExpr().add(binaryExpr);
	
	        // Assert
	        assertError(node, "SelfAnchoredBinaryExpression");
	    }
	
	    @Test
	    @DisplayName("SelfAnchoredBinaryExpression - Invalid - Multiple Expressions Containing One Failure")
	    void SelfAnchoredBinaryExpressionMultipleExpressionsWithFailure() throws Exception {
	        // Setup
	        DomainNode node = DactFactory.eINSTANCE.createDomainExistAction();
	        node.setName("validateCustomer");
	
	        // 1. Valid Expression
	        Identifier validIdent = DactFactory.eINSTANCE.createIdentifier();
	        validIdent.setName("self.status");
	        UnaryExpression validUnary = DactFactory.eINSTANCE.createUnaryExpression();
	        validUnary.setIdentifier(validIdent);
	        BinaryExpression validBinary = DactFactory.eINSTANCE.createBinaryExpression();
	        validBinary.setName("validExpr");
	        validBinary.setLeftExpr(validUnary);
	
	        // 2. Invalid Expression (Not binary)
	        UnaryExpression invalidExpr = DactFactory.eINSTANCE.createUnaryExpression();
	        invalidExpr.setName("invalidExpr");
	
	        node.getMainExpr().add(validBinary);
	        node.getMainExpr().add(invalidExpr);
	
	        // Assert
	        assertError(node, "SelfAnchoredBinaryExpression");
	    }
    }
    
    // ------------------------------------------------------------------
    // SignalAction - ExclusiveEventSource - Weak Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("SignalAction - ExclusiveEventSource - Weak Robust")
    class ExclusiveEventSource{
	    @Test
	    @DisplayName("ExclusiveEventSource - Valid - Identifier Specified Only")
	    void ExclusiveEventSourceIdentifierOnly() throws Exception {
	        // Setup - Concrete SignalAction instance
	        SendSignalAction action = DactFactory.eINSTANCE.createSendSignalAction();
	        action.setName("sendOrderEvent");
	
	        DomainEvent event = DactFactory.eINSTANCE.createDomainEvent();
	        event.setName("OrderCreated");
	        action.setEvent(event);
	
	        Identifier identifier = DactFactory.eINSTANCE.createIdentifier();
	        identifier.setName("orderId");
	
	        action.setIdentifier(identifier);
	        action.setValue(null);
	
	        // Assert
	        assertValid(action, "ExclusiveEventSource");
	    }
	
	    @Test
	    @DisplayName("ExclusiveEventSource - Valid - ValueSpecification Specified Only")
	    void ExclusiveEventSourceValueOnly() throws Exception {
	        // Setup
	        SendSignalAction action = DactFactory.eINSTANCE.createSendSignalAction();
	        action.setName("sendOrderEvent");
	
	        DomainEvent event = DactFactory.eINSTANCE.createDomainEvent();
	        event.setName("OrderCreated");
	        action.setEvent(event);
	
	        ValueSpecification value = DactFactory.eINSTANCE.createInstanceValue();
	
	        action.setIdentifier(null);
	        action.setValue(value);
	
	        // Assert
	        assertValid(action, "ExclusiveEventSource");
	    }
	
	    @Test
	    @DisplayName("ExclusiveEventSource - Invalid - Neither Identifier Nor Value Specified")
	    void ExclusiveEventSourceNeitherSpecified() throws Exception {
	        // Setup
	        SendSignalAction action = DactFactory.eINSTANCE.createSendSignalAction();
	        action.setName("sendOrderEvent");
	
	        DomainEvent event = DactFactory.eINSTANCE.createDomainEvent();
	        event.setName("OrderCreated");
	        action.setEvent(event);
	
	        action.setIdentifier(null);
	        action.setValue(null);
	
	        // Assert
	        assertError(action, "ExclusiveEventSource");
	    }
	
	    @Test
	    @DisplayName("ExclusiveEventSource - Invalid - Both Identifier and Value Specified")
	    void ExclusiveEventSourceBothSpecified() throws Exception {
	        // Setup
	        SendSignalAction action = DactFactory.eINSTANCE.createSendSignalAction();
	        action.setName("sendOrderEvent");
	
	        DomainEvent event = DactFactory.eINSTANCE.createDomainEvent();
	        event.setName("OrderCreated");
	        action.setEvent(event);
	
	        Identifier identifier = DactFactory.eINSTANCE.createIdentifier();
	        identifier.setName("orderId");
	
	        ValueSpecification value = DactFactory.eINSTANCE.createInstanceValue();
	
	        action.setIdentifier(identifier);
	        action.setValue(value);
	
	        // Assert
	        assertError(action, "ExclusiveEventSource");
	    }
    }
    
    // ------------------------------------------------------------------
    // ParameterMapping - ConformingActivityOperationParameter - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("ParameterMapping - ConformingActivityOperationParameter - Strong Robust")
    class ConformingActivityOperationParameter{
	    @Test
	    @DisplayName("ConformingActivityOperationParameter - Valid - Activity Parameter Is Null")
	    void ConformingActivityOperationParameterActivityParamNull() throws Exception {
	        // Setup
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	
	        mapping.setActivityParameter(null);
	        mapping.setOperationParameter(opParam);
	
	        // Assert
	        assertValid(mapping, "ConformingActivityOperationParameter");
	    }
	
	    @Test
	    @DisplayName("ConformingActivityOperationParameter - Valid - Operation Parameter Is Null")
	    void ConformingActivityOperationParameterOperationParamNull() throws Exception {
	        // Setup
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	        Parameter actParam = DactFactory.eINSTANCE.createParameter();
	
	        mapping.setActivityParameter(actParam);
	        mapping.setOperationParameter(null);
	
	        // Assert
	        assertValid(mapping, "ConformingActivityOperationParameter");
	    }
	
	    @Test
	    @DisplayName("ConformingActivityOperationParameter - Valid - Both Parameters Are Null")
	    void ConformingActivityOperationParameterBothNull() throws Exception {
	        // Setup
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	        mapping.setActivityParameter(null);
	        mapping.setOperationParameter(null);
	
	        // Assert
	        assertValid(mapping, "ConformingActivityOperationParameter");
	    }
	
	    @Test
	    @DisplayName("ConformingActivityOperationParameter - Valid - Identical Type, Bounds, and Direction")
	    void ConformingActivityOperationParameterIdeal() throws Exception {
	        // Setup
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	        
	        Parameter actParam = DactFactory.eINSTANCE.createParameter();
	        actParam.setName("inputAct");
	        actParam.setType(STR);
	        actParam.setLowerBound(1);
	        actParam.setUpperBound(1);
	        actParam.setDirection(ParameterDirection.IN);
	
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	        opParam.setName("inputOp");
	        opParam.setType(STR);
	        opParam.setLowerBound(1);
	        opParam.setUpperBound(1);
	        opParam.setDirection(ParameterDirection.IN);
	
	        mapping.setActivityParameter(actParam);
	        mapping.setOperationParameter(opParam);
	
	        // Assert
	        assertValid(mapping, "ConformingActivityOperationParameter");
	    }
	
	    @Test
	    @DisplayName("ConformingActivityOperationParameter - Invalid - Type Mismatch")
	    void ConformingActivityOperationParameterTypeMismatch() throws Exception {
	        // Setup
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	
	        Parameter actParam = DactFactory.eINSTANCE.createParameter();
	        actParam.setName("param1");
	        actParam.setType(STR); // String
	        actParam.setLowerBound(1);
	        actParam.setUpperBound(1);
	        actParam.setDirection(ParameterDirection.IN);
	
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	        opParam.setName("param2");
	        opParam.setType(INT); // Integer (Mismatch)
	        opParam.setLowerBound(1);
	        opParam.setUpperBound(1);
	        opParam.setDirection(ParameterDirection.IN);
	
	        mapping.setActivityParameter(actParam);
	        mapping.setOperationParameter(opParam);
	
	        // Assert
	        assertError(mapping, "ConformingActivityOperationParameter");
	    }
	
	    @Test
	    @DisplayName("ConformingActivityOperationParameter - Invalid - Lower Bound Mismatch")
	    void ConformingActivityOperationParameterLowerBoundMismatch() throws Exception {
	        // Setup
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	
	        Parameter actParam = DactFactory.eINSTANCE.createParameter();
	        actParam.setName("param1");
	        actParam.setType(INT);
	        actParam.setLowerBound(0); // 0 (Mismatch)
	        actParam.setUpperBound(1);
	        actParam.setDirection(ParameterDirection.IN);
	
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	        opParam.setName("param2");
	        opParam.setType(INT);
	        opParam.setLowerBound(1); // 1
	        opParam.setUpperBound(1);
	        opParam.setDirection(ParameterDirection.IN);
	
	        mapping.setActivityParameter(actParam);
	        mapping.setOperationParameter(opParam);
	
	        // Assert
	        assertError(mapping, "ConformingActivityOperationParameter");
	    }
	
	    @Test
	    @DisplayName("ConformingActivityOperationParameter - Invalid - Upper Bound Mismatch")
	    void ConformingActivityOperationParameterUpperBoundMismatch() throws Exception {
	        // Setup
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	
	        Parameter actParam = DactFactory.eINSTANCE.createParameter();
	        actParam.setName("param1");
	        actParam.setType(INT);
	        actParam.setLowerBound(1);
	        actParam.setUpperBound(1); // 1 (Mismatch)
	        actParam.setDirection(ParameterDirection.IN);
	
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	        opParam.setName("param2");
	        opParam.setType(INT);
	        opParam.setLowerBound(1);
	        opParam.setUpperBound(-1); // * / Unlimited (-1)
	        opParam.setDirection(ParameterDirection.IN);
	
	        mapping.setActivityParameter(actParam);
	        mapping.setOperationParameter(opParam);
	
	        // Assert
	        assertError(mapping, "ConformingActivityOperationParameter");
	    }
	
	    @Test
	    @DisplayName("ConformingActivityOperationParameter - Invalid - Direction Mismatch")
	    void ConformingActivityOperationParameterDirectionMismatch() throws Exception {
	        // Setup
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	
	        Parameter actParam = DactFactory.eINSTANCE.createParameter();
	        actParam.setName("param1");
	        actParam.setType(STR);
	        actParam.setLowerBound(1);
	        actParam.setUpperBound(1);
	        actParam.setDirection(ParameterDirection.IN); // IN (Mismatch)
	
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	        opParam.setName("param2");
	        opParam.setType(STR);
	        opParam.setLowerBound(1);
	        opParam.setUpperBound(1);
	        opParam.setDirection(ParameterDirection.OUT); // OUT
	
	        mapping.setActivityParameter(actParam);
	        mapping.setOperationParameter(opParam);
	
	        // Assert
	        assertError(mapping, "ConformingActivityOperationParameter");
	    }
	
	    @Test
	    @DisplayName("ConformingActivityOperationParameter - Invalid - All Attributes Mismatch")
	    void ConformingActivityOperationParameterAllAttributesMismatch() throws Exception {
	        // Setup
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	
	        Parameter actParam = DactFactory.eINSTANCE.createParameter();
	        actParam.setName("param1");
	        actParam.setType(INT);
	        actParam.setLowerBound(0);
	        actParam.setUpperBound(1);
	        actParam.setDirection(ParameterDirection.IN);
	
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	        opParam.setName("param2");
	        opParam.setType(BOOL);
	        opParam.setLowerBound(1);
	        opParam.setUpperBound(-1);
	        opParam.setDirection(ParameterDirection.OUT);
	
	        mapping.setActivityParameter(actParam);
	        mapping.setOperationParameter(opParam);
	
	        // Assert
	        assertError(mapping, "ConformingActivityOperationParameter");
	    }
    }
    
    // ------------------------------------------------------------------
    // ParameterMapping - ExclusiveMappingSource - Weak Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("ParameterMapping - ExclusiveMappingSource - Weak Robust")
    class ExclusiveMappingSource{
	    @Test
	    @DisplayName("ExclusiveMappingSource - Valid - Identifier Source Only")
	    void ExclusiveMappingSourceIdentifierOnly() throws Exception {
	        // Setup
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	        opParam.setName("targetParam");
	        mapping.setOperationParameter(opParam);
	
	        Identifier identifier = DactFactory.eINSTANCE.createIdentifier();
	        identifier.setName("sourceVar");
	
	        mapping.setIdentifier(identifier);
	        mapping.setActivityParameter(null);
	        mapping.setValue(null);
	
	        // Assert
	        assertValid(mapping, "ExclusiveMappingSource");
	    }
	
	    @Test
	    @DisplayName("ExclusiveMappingSource - Valid - ActivityParameter Source Only")
	    void ExclusiveMappingSourceActivityParameterOnly() throws Exception {
	        // Setup
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	        opParam.setName("targetParam");
	        mapping.setOperationParameter(opParam);
	
	        Parameter actParam = DactFactory.eINSTANCE.createParameter();
	        actParam.setName("inputActParam");
	
	        mapping.setIdentifier(null);
	        mapping.setActivityParameter(actParam);
	        mapping.setValue(null);
	
	        // Assert
	        assertValid(mapping, "ExclusiveMappingSource");
	    }
	
	    @Test
	    @DisplayName("ExclusiveMappingSource - Valid - ValueSpecification Source Only")
	    void ExclusiveMappingSourceValueOnly() throws Exception {
	        // Setup
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	        opParam.setName("targetParam");
	        mapping.setOperationParameter(opParam);
	
	        ValueSpecification value = DactFactory.eINSTANCE.createInstanceValue();
	
	        mapping.setIdentifier(null);
	        mapping.setActivityParameter(null);
	        mapping.setValue(value);
	
	        // Assert
	        assertValid(mapping, "ExclusiveMappingSource");
	    }
	
	    @Test
	    @DisplayName("ExclusiveMappingSource - Invalid - No Sources Specified (Count 0)")
	    void ExclusiveMappingSourceNoSourceSpecified() throws Exception {
	        // Setup
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	        opParam.setName("targetParam");
	        mapping.setOperationParameter(opParam);
	
	        mapping.setIdentifier(null);
	        mapping.setActivityParameter(null);
	        mapping.setValue(null);
	
	        // Assert
	        assertError(mapping, "ExclusiveMappingSource");
	    }
	
	    @Test
	    @DisplayName("ExclusiveMappingSource - Invalid - Two Sources Specified (Count 2)")
	    void ExclusiveMappingSourceTwoSourcesSpecified() throws Exception {
	        // Setup
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	        opParam.setName("targetParam");
	        mapping.setOperationParameter(opParam);
	
	        Identifier identifier = DactFactory.eINSTANCE.createIdentifier();
	        identifier.setName("sourceVar");
	
	        Parameter actParam = DactFactory.eINSTANCE.createParameter();
	        actParam.setName("inputActParam");
	
	        mapping.setIdentifier(identifier);
	        mapping.setActivityParameter(actParam);
	        mapping.setValue(null);
	
	        // Assert
	        assertError(mapping, "ExclusiveMappingSource");
	    }
	
	    @Test
	    @DisplayName("ExclusiveMappingSource - Invalid - Three Sources Specified (Count 3)")
	    void ExclusiveMappingSourceThreeSourcesSpecified() throws Exception {
	        // Setup
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	        opParam.setName("targetParam");
	        mapping.setOperationParameter(opParam);
	
	        Identifier identifier = DactFactory.eINSTANCE.createIdentifier();
	        identifier.setName("sourceVar");
	
	        Parameter actParam = DactFactory.eINSTANCE.createParameter();
	        actParam.setName("inputActParam");
	
	        ValueSpecification value = DactFactory.eINSTANCE.createLiteralBoolean();
	
	        mapping.setIdentifier(identifier);
	        mapping.setActivityParameter(actParam);
	        mapping.setValue(value);
	
	        // Assert
	        assertError(mapping, "ExclusiveMappingSource");
	    }
    }
    // ------------------------------------------------------------------
    // ParameterMapping - ValueOnlyInAction - Strong Robust
    // ------------------------------------------------------------------
    @Nested
    @DisplayName("ParameterMapping - ValueOnlyInAction - Strong Robust")
    class ValueOnlyInAction{ 
	    @Test
	    @DisplayName("ValueOnlyInAction - Valid - Value Is Null Inside CallOperationAction")
	    void ValueOnlyInActionValueNullInAction() throws Exception {
	        // Setup
	        CallOperationAction action = DactFactory.eINSTANCE.createCallOperationAction();
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	        opParam.setName("targetParam");
	
	        mapping.setOperationParameter(opParam);
	        mapping.setValue(null);
	
	        action.getParameterMappings().add(mapping); // action !== null
	
	        // Assert
	        assertValid(mapping, "ValueOnlyInAction");
	    }
	
	    @Test
	    @DisplayName("ValueOnlyInAction - Valid - Value Is Null Inside Activity")
	    void ValueOnlyInActionValueNullInActivity() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	        opParam.setName("targetParam");
	
	        mapping.setOperationParameter(opParam);
	        mapping.setValue(null);
	
	        activity.getParameterMappings().add(mapping); // action === null, but value === null
	
	        // Assert
	        assertValid(mapping, "ValueOnlyInAction");
	    }
	
	    @Test
	    @DisplayName("ValueOnlyInAction - Valid - Value Present Inside CallOperationAction")
	    void ValueOnlyInActionValuePresentInAction() throws Exception {
	        // Setup
	        CallOperationAction action = DactFactory.eINSTANCE.createCallOperationAction();
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	        opParam.setName("targetParam");
	
	        ValueSpecification value = DactFactory.eINSTANCE.createLiteralString();
	
	        mapping.setOperationParameter(opParam);
	        mapping.setValue(value);
	
	        action.getParameterMappings().add(mapping); // action !== null and value !== null
	
	        // Assert
	        assertValid(mapping, "ValueOnlyInAction");
	    }
	
	    @Test
	    @DisplayName("ValueOnlyInAction - Invalid - Value Present Inside Activity")
	    void ValueOnlyInActionValuePresentInActivity() throws Exception {
	        // Setup
	        Activity activity = DactFactory.eINSTANCE.createActivity();
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	        opParam.setName("targetParam");
	
	        ValueSpecification value = DactFactory.eINSTANCE.createLiteralReal();
	
	        mapping.setOperationParameter(opParam);
	        mapping.setValue(value);
	
	        activity.getParameterMappings().add(mapping); // Contained in Activity (action === null)
	
	        // Assert
	        assertError(mapping, "ValueOnlyInAction");
	    }
	
	    @Test
	    @DisplayName("ValueOnlyInAction - Invalid - Value Present with No Container Action")
	    void ValueOnlyInActionValuePresentUncontained() throws Exception {
	        // Setup
	        ParameterMapping mapping = DactFactory.eINSTANCE.createParameterMapping();
	
	        Parameter opParam = DactFactory.eINSTANCE.createParameter();
	        opParam.setName("targetParam");
	
	        ValueSpecification value = DactFactory.eINSTANCE.createLiteralReal();
	
	        mapping.setOperationParameter(opParam);
	        mapping.setValue(value);
	        // Uncontained (action === null)
	
	        // Assert
	        assertError(mapping, "ValueOnlyInAction");
	    }
    }
    
    // ------------------------------------------------------------------
    // Helper
    // ------------------------------------------------------------------
    protected void assertValid(EObject object, String constraintName) throws Exception {
    	List<Diagnostic> violations = ValidatorHelper.validateWithDiagnostics(object);

        Diagnostic matchedViolation = violations.stream()
        		.filter(v -> (v.getSeverity() == Diagnostic.ERROR ||  v.getSeverity() == Diagnostic.WARNING))
        		.filter(v -> v.getMessage() != null)
        		.filter(v -> v.getMessage().contains(constraintName))
                .findFirst()
                .orElse(null);
       
        assertNull(matchedViolation,
                "Expected no ERROR/WARNING message containing '" + constraintName
                        + "' but got: " + violations.stream()
                        .map(v -> severityName(v.getSeverity()) + ": " + v.getMessage())
                        .collect(Collectors.joining("\n  ", "\n  ", "")));
    }
    
    protected void assertValid(EObject object)
            throws Exception {

        List<String> violations = ValidatorHelper.validate(object);
        assertTrue(violations.isEmpty(),
            "Input model is not well-formed: " + String.join("; ", violations));
    }
    
    protected void assertError(EObject object, String constraintName) throws Exception {
    	assertError(object,constraintName,"");
    }
    protected void assertError(EObject object, String constraintName, String expectedMessageFragment)
            throws Exception {
    	List<Diagnostic> violations = ValidatorHelper.validateWithDiagnostics(object);

        Diagnostic matchedViolation = violations.stream()
        		.filter(v -> v.getSeverity() == Diagnostic.ERROR)
        		.filter(v -> v.getMessage() != null)
        		.filter(v -> v.getMessage().contains(constraintName))
                .filter(v -> expectedMessageFragment == "" || v.getMessage().contains(expectedMessageFragment))
                .findFirst()
                .orElse(null);

        assertNotNull(matchedViolation,
                "Expected an ERROR message containing '" + constraintName
                        + "' but got: " + violations.stream()
                                .map(v -> severityName(v.getSeverity()) + ": " + v.getMessage())
                                .collect(Collectors.joining("\n  ", "\n  ", "")));
    }
    
    protected void assertWarning(EObject object,String constraintName) throws Exception {
    	assertWarning(object,constraintName,"");
    }
    protected void assertWarning(EObject object,String constraintName, String expectedMessageFragment)
            throws Exception {
    
        List<Diagnostic> violations = ValidatorHelper.validateWithDiagnostics(object);

        Diagnostic matchedViolation = violations.stream()
        		.filter(v -> v.getSeverity() == Diagnostic.WARNING)
        		.filter(v -> v.getMessage() != null)
        		.filter(v -> v.getMessage().contains(constraintName))
                .filter(v -> expectedMessageFragment == "" || v.getMessage().contains(expectedMessageFragment))
                .findFirst()
                .orElse(null);

        assertNotNull(matchedViolation,
                "Expected a WARNING message containing '" + constraintName
                        + "' but got: " + violations.stream()
                                .map(v -> severityName(v.getSeverity()) + ": " + v.getMessage())
                                .collect(Collectors.joining("\n  ", "\n  ", "")));
    }
    
    private static String severityName(int severity) {
        switch (severity) {
            case Diagnostic.OK:      return "OK";
            case Diagnostic.INFO:    return "INFO";
            case Diagnostic.WARNING: return "WARNING";
            case Diagnostic.ERROR:   return "ERROR";
            case Diagnostic.CANCEL:  return "CANCEL";
            default:                 return "UNKNOWN(" + severity + ")";
        }
    }
}
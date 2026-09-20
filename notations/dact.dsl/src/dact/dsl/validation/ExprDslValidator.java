package dact.dsl.validation;

//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.util.EcoreUtil;
//import org.eclipse.xtext.validation.Check;
//import org.eclipse.xtext.nodemodel.INode;
//import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
//import org.eclipse.xtext.validation.ValidationMessageAcceptor;
//
//import java.util.List;
//
//// Domain / AST imports
//import dact.DactPackage;
//import dact.Identifier;
//import dact.Operation;
//import dact.Property;
//import dact.DomainObject;
//import dact.Type;

public class ExprDslValidator extends AbstractExprDslValidator {

//    @Check
//    public void checkIdentifierScopeAndComposition(Identifier identifier) {
//    	System.out.println("[DEBUG-DSL] Running check on: " + identifier);
//    	error("Stupid",identifier,null);
//    	
//        // Only run the root check on the outermost Identifier in a navigation chain
//        if (identifier.eContainer() instanceof NavigationExpression nav && nav.getTarget() == identifier) {
//            return; // Skip intermediate targets; validation cascades from the root
//        }
//        
//        if (identifier instanceof NavigationExpression nav) {
//            Property property = nav.getProperty();
//
//            // 1. Property was not provided (syntax error or incomplete input)
//            if (property == null) {
//                error("Navigation expression is missing a property to target.",
//                        nav,
//                        DactPackage.Literals.NAVIGATION_EXPRESSION__PROPERTY);
//                return;
//            }
//
//            // 2. Property reference is unresolved (linking error / proxy object)
//            if (property.eIsProxy()) {
//                // Extract the original text/node that failed to link
//                List<INode> nodes = NodeModelUtils.findNodesForFeature(nav, DactPackage.Literals.NAVIGATION_EXPRESSION__PROPERTY);
//                String unresolvedText = !nodes.isEmpty() ? nodes.get(0).getText().trim() : "unknown";
//
//                error("Unresolved property reference: '" + unresolvedText + "'",
//                        nav,
//                        DactPackage.Literals.NAVIGATION_EXPRESSION__PROPERTY,
//                        ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
//            }
//        }
//
//        // 1. Validate the Root Identifier (SelfIdentifier vs VariableIdentifier)
//        Identifier root = getRootIdentifier(identifier);
//        Type rootType = null;
//        
//        if (root instanceof SelfIdentifier selfId) {
//            rootType = validateSelfScope(selfId);
//        } else if (root instanceof VariableIdentifier varId) {
//            rootType = validateVariableScope(varId);
//        }
//
//        // 2. Validate Navigation Chain (Composition / Member existence): 
//        if (identifier instanceof NavigationExpression navExpr) {
//            validateNavigationChain(rootType, navExpr); // CURRENTLY WRONG
//        }
//    }
//
//    /**
//     * Traverses up to the primary root (SelfIdentifier or VariableIdentifier)
//     */
//    private Identifier getRootIdentifier(Identifier identifier) {
//        if (identifier instanceof NavigationExpression nav) {
//            return getRootIdentifier(nav.getTarget());
//        }
//        return identifier;
//    }
//
//    /**
//     * Validates that SelfIdentifier is evaluated within an context that owns valid properties.
//     */
//    private DomainObject validateSelfScope(SelfIdentifier selfId) {
//        EObject contextModel = EcoreUtil.getRootContainer(selfId);
//        Operation operation = getEnclosingOperation(selfId);
//
//        if (operation == null && contextModel == null) {
//            error("Cannot resolve 'self': missing contextual operational scope.",
//                  selfId,
//                  null);
//        }
//        
//        return operation.getDomainObject();
//    }
//
//    /**
//     * Validates that VariableIdentifier is defined in the current scope or operation parameters.
//     */
//    private Type validateVariableScope(VariableIdentifier varId) {
//    	return null;
////        String varName = varId.getName();
////        Operation operation = getEnclosingOperation(varId);
////
////        if (operation == null) {
////            return; // In-memory parse detached from resource set
////        }
////
////        // Collect valid accessible variable names in current scope
////        Set<String> accessibleVariables = getAccessibleVariables(operation);
////
////        if (!accessibleVariables.contains(varName)) {
////            error("Variable '" + varName + "' is not accessible in the current scope. " +
////                  "Available variables: " + accessibleVariables,
////                  varId,
////                  DactPackage.Literals.VARIABLE_IDENTIFIER__NAME);
////        }
//    }
//
//    /**
//     * Validates property existence along each dot in a NavigationExpression chain.
//     */
//    private void validateNavigationChain(Type parentType, NavigationExpression nav) {
//    	// 0. Non Domain Object type cannot have nested property
//    	String currentPropertyName = nav.getName();
//
//    	if (parentType  instanceof DomainObject pDomainObject) {
//	        // 1. Get property by name
//	        Property currentProperty = findProperty(pDomainObject, currentPropertyName);
//	        if (currentProperty == null) {
//		          error("Property '" + currentPropertyName + "' does not exist on type '" + pDomainObject.getName() + "'.",
//		                nav,
//		                DactPackage.Literals.NAVIGATION_EXPRESSION__PROPERTY);
//		      } else {
//		          // 3. Multiplicity Check: Prevent chaining on 0..* or 1..* collections
//		          if (isOneToMany(currentProperty)) {
//		              error("Cannot access nested property '" + currentPropertyName + "' via '.' operator because the relationship between'" 
//		                    + pDomainObject.getName() +"' and '"+currentPropertyName + "' is multi-valued [0..*]. Consider using a collection operation.",
//		                    nav,
//		                    DactPackage.Literals.NAVIGATION_EXPRESSION__PROPERTY);
//		          }
//		      }
//	
//	        // 2. Recursively check nesting
//	        
//	        if (nav.getTarget() instanceof NavigationExpression targetNav) {
//	            validateNavigationChain(currentProperty.getType(), targetNav);
//	        }
//    	}{
//    		 error("Cannot access nested property '" + currentPropertyName + "' via '.' operator because parent type'" 
//	                + parentType.getName() + "' is not Domain Object. It is " + parentType.eClass().getName(),
//	                nav,
//	                DactPackage.Literals.NAVIGATION_EXPRESSION__PROPERTY);
//    	}
//
//    }
//
//    // -------------------------------------------------------------------
//    // Helper Methods for Scope & Type Lookup
//    // -------------------------------------------------------------------
//
//    private boolean isOneToMany(Property p) {
//    	Integer upperBound = p.getUpperBound();
//    	return upperBound >1 || upperBound < 0;
//    }
//    
//    private Operation getEnclosingOperation(EObject element) {
//        EObject current = element;
//        while (current != null) {
//            if (current instanceof Operation op) {
//                return op;
//            }
//            current = current.eContainer();
//        }
//        return null;
//    }
//
//    private Property findProperty(DomainObject targetType, String memberName) {
//        if (targetType != null && memberName != null) {
//            return targetType.getOwnedProperties()
//                    .stream()
//                    .filter(p -> memberName.equals(p.getName()))
//                    .findFirst()
//                    .orElse(null);
//        }
//        return null; 
//    }

}
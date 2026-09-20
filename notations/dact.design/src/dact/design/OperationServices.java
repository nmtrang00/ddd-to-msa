package dact.design;

import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import dact.DactPackage;
import dact.SpecOperation;
import dact.Expression;
import dact.SpecRule;
import dact.Type;
import dact.Root;
import dact.Parameter;
import dact.ParameterDirection;
import dact.Property;
import dact.Operation;
import dact.OperationType;
import dact.Activity;
import dact.BoundedContext;
import dact.SharedDomainObject;
import dact.Service;
import dact.DomainObject;

/**
 * The services class used by VSM.
 */
public class OperationServices {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
	
    private static DslHelper dslHelper;

    private synchronized DslHelper getDslHelper() {
        if (dslHelper == null) {
            dslHelper = new DslHelper(); // Or retrieve via Guice injector if DslHelper needs injection
        }
        return dslHelper;
    }
    
    public String getFullQualifiedName(Operation op) {
    	return getFullQualifiedName(op,"::");
    }
    
    public String getFullQualifiedName(Operation op, String sep) {
    	String parentName = null;
    	String contextName = null;
    	
    	// Parent
    	if (op.getDomainObject() != null) {
    		parentName = op.getDomainObject().getName();
    	}else if (op.getInterface() != null) {
    		parentName = op.getInterface().getName();
    	}else {
    		parentName = "UNDEFINED";
    	}
    	// Context
    	BoundedContext context = getContext(op);
    	if (context != null) {
    		contextName = context.getName();
    	}else if(op.getDomainObject() instanceof SharedDomainObject) {
    		SharedDomainObject domainObject = (SharedDomainObject) op.getDomainObject();
    		contextName = domainObject.getAbstractedRoot().getContext().getName();
    	}
    	else {
    		contextName = "UNDEFINED";
    	}
    	return contextName+sep+parentName+sep+op.getName()+"()";
    }
    
    
    
    public List<Operation> getAvailableOperations(EObject object) {
        EObject root = EcoreUtil.getRootContainer(object);
        Iterable<EObject> iterable = () -> EcoreUtil.getAllContents(root, true);

        // Service Operations
        List<Operation> allOperations = StreamSupport.stream(iterable.spliterator(), false)
                .filter(Operation.class::isInstance)
                .map(Operation.class::cast)
                .filter(op -> op.eContainer() instanceof Service)
                .collect(Collectors.toList());
       
        // Domain Object Operations
        List<Operation> constructorOps = StreamSupport.stream(iterable.spliterator(), false)
                .filter(Operation.class::isInstance)
                .map(Operation.class::cast)
                .filter(op -> (
                		op.getType() == OperationType.D0_CONSTRUCTOR ||
                		op.getType() == OperationType.D2_COMPOUND_MUTATOR ||
                		op.getType() == OperationType.D4_COMPOUND_ACCESSOR ||
                		op.getType() == OperationType.D5_SPECIFICATION))
                .collect(Collectors.toList());
        allOperations.addAll(constructorOps);
        
   
        allOperations.add(null);
        return allOperations;
    }

    public List<Type> getAvailableOpParamTypes(Parameter param){
    	DactPackage pkg = DactPackage.eINSTANCE;
    	List<Type> availableTypes = new ArrayList<>();
    	
    	// Primitive Types
    	EObject root = EcoreUtil.getRootContainer(param);

        if (root instanceof Root) {
        	availableTypes.addAll(((Root) root).getPrimitivesTypes());
        }
        
        // Only allow primitive types for SharedDomainObject now
        if (getDomainParent(param) instanceof SharedDomainObject) {
        	return availableTypes;
        }
        
        // Internal Types
        BoundedContext context = getContext(param.getOperation());
        availableTypes.addAll(
        	EcoreUtil.getObjectsByType(context.getOwnedElements(), pkg.getInternalDomainObject())
        );
        
        // Shared Domain Objects
        if (root instanceof Root) {
        	availableTypes.addAll(((Root) root).getDdd().getSharedDomainObjects());
        }
        
        // Enumeration
        availableTypes.addAll(
            	EcoreUtil.getObjectsByType(context.getOwnedElements(), pkg.getEnumeration())
        );
    	return availableTypes;
    }
    public EObject getDomainParent(Parameter param) {
    	Operation op = param.getOperation();
    	if (op.getDomainObject() != null) {
    		return op.getDomainObject();
    	}else if (op.getInterface() != null) {
    		return op.getInterface();
    	}
    	return null;
    }
    
    public BoundedContext getContext(Operation operation) {
    	if (operation.getDomainObject() != null) {
    		return operation.getDomainObject().getContext();
    	}else if(operation.getInterface() != null) {
    		return operation.getInterface().getContext();
    	}
    	return null;
    }

    public EObject updateSpecExpr(EObject targetRule, String dslText) throws DiagnosticException {
        
        if (!(targetRule instanceof SpecRule rule)) {
            System.err.println("Target EObject is not a SpecRule.");
            return targetRule;
        }
        
        SpecOperation operation = rule.getOperation();
        dslHelper = getDslHelper();
        Expression parsedExpr = dslHelper.parseExpr(dslText);
        if (parsedExpr == null) {
        	rule.setRawString(dslText);
	        rule.setExpr(null);
	        return operation;
        }
        
        rule.setRawString(dslText);
        rule.setExpr(parsedExpr);
        return operation;
    }
    
    public List<Activity> getAllAvailableActivities(Operation operation) {
        if (operation == null) {
            return List.of();
        }

        EObject root = EcoreUtil.getRootContainer(operation);
        Iterable<EObject> iterable = () -> EcoreUtil.getAllContents(root, true);

        List<Activity> allActivities = StreamSupport.stream(iterable.spliterator(), false)
                .filter(Activity.class::isInstance)
                .map(Activity.class::cast)
                .collect(Collectors.toList());
        allActivities.add(null);
        return allActivities;
    }
    
    public void createConstuctorOp(DomainObject object) {
    	Operation constructorOp = dact.DactFactory.eINSTANCE.createOperation();
    	constructorOp.setName(object.getName());
    	constructorOp.setType(OperationType.D0_CONSTRUCTOR);
    	
    	for (Property property : object.getOwnedProperties()) {
    		  Parameter param = dact.DactFactory.eINSTANCE.createParameter();
    		  param.setName(property.getName());
    		  param.setDirection(ParameterDirection.IN);
    		  param.setType(property.getType());
    		  param.setLowerBound(property.getLowerBound());
    		  param.setUpperBound(property.getUpperBound());
    		  constructorOp.getOwnedParameters().add(param);
    	}
    	Parameter outParam = dact.DactFactory.eINSTANCE.createParameter();
    	outParam.setName("self");
    	outParam.setDirection(ParameterDirection.OUT);
    	outParam.setType(object);
    	outParam.setLowerBound(1);
    	outParam.setUpperBound(1);
    	constructorOp.getOwnedParameters().add(outParam);
		
    	object.getOwnedOperations().add(constructorOp);
    }
    
    public static String toCamelCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        // Split by non-alphanumeric characters (spaces, underscores, hyphens)
        String[] words = str.split("[\\s_\\-]+");
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.isEmpty()) continue;
            
            if (i == 0) {
                builder.append(word.toLowerCase());
            } else {
                builder.append(Character.toUpperCase(word.charAt(0)))
                       .append(word.substring(1).toLowerCase());
            }
        }
        return builder.toString();
    }

}

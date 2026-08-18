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
import dact.Operation;
import dact.BoundedContext;
import dact.SharedDomainObject;
import dact.Service;

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
    	}else {
    		contextName = "UNDEFINED";
    	}
    	return contextName+sep+parentName+sep+op.getName()+"()";
    }
    
    
    
    public List<Operation> getAvailableOperations(EObject object) {
        EObject root = EcoreUtil.getRootContainer(object);
        Iterable<EObject> iterable = () -> EcoreUtil.getAllContents(root, true);

        List<Operation> allOperations = StreamSupport.stream(iterable.spliterator(), false)
                .filter(Operation.class::isInstance)
                .map(Operation.class::cast)
                .filter(op -> op.eContainer() instanceof Service)
                .collect(Collectors.toList());
        allOperations.add(null);
        return allOperations;
    }

    public List<Type> getAvailableOpParamTypes(Parameter param){
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
        	EcoreUtil.getObjectsByType(context.getOwnedElements(), DactPackage.Literals.INTERNAL_DOMAIN_OBJECT)
        );
        
        // Shared Domain Objects
        if (root instanceof Root) {
        	availableTypes.addAll(((Root) root).getDdd().getSharedDomainObjects());
        }
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
}

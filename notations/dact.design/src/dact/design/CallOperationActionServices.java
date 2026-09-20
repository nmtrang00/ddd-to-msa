package dact.design;

import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.ecore.EObject;

import java.util.List;
import java.util.Optional;

import dact.DactFactory;
import dact.Expression;
import dact.CallOperationAction;
import dact.Identifier;
import dact.ParameterMapping;
import dact.ParameterMappingType;
import dact.Parameter;
import dact.ParameterDirection;
import dact.ValueSpecification;
import dact.UnaryExpression;
/**
 * The services class used by VSM.
 */
public class CallOperationActionServices {
	private static DslHelper dslHelper;

    private synchronized DslHelper getDslHelper() {
        if (dslHelper == null) {
            dslHelper = new DslHelper(); // Or retrieve via Guice injector if DslHelper needs injection
        }
        return dslHelper;
    }
    
    public String readParameterMapping(ParameterMapping mapping) {
    	if (mapping.getIdentifier() != null) {
    		return mapping.getIdentifier().getName();
    	} 
    	
    	if (mapping.getValue() != null) {
    		ValueSpecificationHelper helper = new ValueSpecificationHelper();			
			return helper.readValue(mapping.getValue(),true);
    	}
    	
    	return "";
    }
    
	public String readMappedElement(CallOperationAction node, Parameter param) {
		EObject elem = getMappedElement(node,param);
		System.out.println("[DEBUG] Mapping Element Found: "+elem);
		
		if (elem instanceof Identifier i) {
			return i.getName();
		}
		if (elem instanceof ValueSpecification v) {
			ValueSpecificationHelper helper = new ValueSpecificationHelper();			
			return helper.readValue(v);
		}
		return "";
	}
	
	public EObject getMappedElement(CallOperationAction node, Parameter param) {
		if (!node.getOperation().getOwnedParameters().contains(param)) {
			System.err.println("[ERROR] Given parameter does not belong to the called operation!");
			return null;
		}
		
		ParameterMapping matchedMapping = getMatchedMapping(node, param);
		
		if (matchedMapping == null) {
			System.out.println("[DEBUG] Parameter has not been mapped.");
			return null;
		}
		
		if (matchedMapping.getIdentifier() != null) {			
			return matchedMapping.getIdentifier();
		}
		return matchedMapping.getValue();
	}
	
	public void updateMapping(CallOperationAction node, Parameter param, String dslText) throws DiagnosticException{
		System.out.println("[DEBUG] New input string: "+ dslText);
		
		// 1. Get Parameter Mapping. If not exist, create.
		ParameterMapping matchedMapping = getMatchedMapping(node, param);
		if (matchedMapping == null) {
			System.out.println("[DEBUG] Parameter Mapping Not Found.");
			matchedMapping = DactFactory.eINSTANCE.createParameterMapping();
			matchedMapping.setOperationParameter(param);
			if (param.getDirection() == ParameterDirection.IN) {
				matchedMapping.setType(ParameterMappingType.ACTION_IN);
			}else {
				matchedMapping.setType(ParameterMappingType.ACTION_OUT);
			}
			node.getParameterMappings().add(matchedMapping);
			System.out.println("[DEBUG] A new Mapping is created: "+matchedMapping);
		}else {
			System.out.println("[DEBUG] Parameter Mapping Found: "+matchedMapping);
		}
		
		// 2. Parse new value
		dslHelper = getDslHelper();
        Expression parsedExpr = dslHelper.parseExpr(dslText);
        
        if (parsedExpr == null) {
        	matchedMapping.setValue(null);
        	matchedMapping.setIdentifier(null);
        	return;
        }
        
        if (!(parsedExpr instanceof UnaryExpression uExpr)) {
        	System.err.println("[ERROR] Input string is not a valid identifier or value:" + parsedExpr);
        	return;
        }
        
        System.out.println("[DEBUG] Parsed expression: "+ uExpr);
        if (uExpr.getIdentifier() != null) {
        	System.out.println("[DEBUG] Parsed identifier: "+uExpr.getIdentifier());
        	matchedMapping.setIdentifier(uExpr.getIdentifier());
        	matchedMapping.setValue(null);
        }else if (uExpr.getValue() != null) {
        	System.out.println("[DEBUG] Parsed value: "+uExpr.getValue());
        	matchedMapping.setValue(uExpr.getValue());
        	matchedMapping.setIdentifier(null);
        	System.out.println("[DEBUG] Parsed value added: "+matchedMapping.getValue());
        }
	}
	
	public ParameterMapping getMatchedMapping(CallOperationAction node, Parameter param) {
		List<ParameterMapping> mappings = node.getParameterMappings();
		Optional<ParameterMapping> matchedMapping = mappings.stream()
											.filter(m -> m.getOperationParameter() == param)
											.findFirst();
											
		if (matchedMapping.isPresent()) return matchedMapping.get();
		return null;
	}
}
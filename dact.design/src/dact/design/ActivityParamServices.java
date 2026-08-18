package dact.design;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import dact.DactFactory;
import dact.Type;
import dact.Parameter;
import dact.ParameterDirection;
import dact.Operation;
import dact.Activity;
import dact.ParameterMapping;
import dact.ParameterMappingType;
/**
 * The services class used by VSM.
 */
public class ActivityParamServices {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
   
    public void setOpParamForActivity(Parameter aParam, Parameter oParam) {
        String errString = null;
        
        if (aParam == null || oParam == null) {
            errString = "[MAPPING-FAILED] One or both parameters are null.";
            System.err.println(errString);
            return;
        }

        String aParamName = aParam.getName() != null ? aParam.getName() : "unnamedActParam";
        String oParamName = oParam.getName() != null ? oParam.getName() : "unnamedOpParam";

        if (aParam.getActivity() == null) {
            errString = String.format("[MAPPING-FAILED] Parameter '%s' is not an activity parameter.", aParamName);
            System.err.println(errString);
            return;
        }
        
        if (oParam.getOperation() == null) {
            errString = String.format("[MAPPING-FAILED] Parameter '%s' is not an operation parameter.", oParamName);
            System.err.println(errString);
            return;
        }
        
        Activity activity = aParam.getActivity();
        
        Optional<ParameterMapping> foundMapping = activity.getParameterMappings()
                    .stream()
                    .filter(m -> m.getActivityParameter() == aParam)
                    .findFirst();
        if (foundMapping.isEmpty()) {
        	System.out.println("Activity Param has been mapped. Create a new mapping!");
            // 1. Create a new instance using the EMF factory 
            ParameterMapping newMapping = DactFactory.eINSTANCE.createParameterMapping();
            
            // 2. Set the references
            newMapping.setActivityParameter(aParam);
            newMapping.setOperationParameter(oParam); 
            //Validate direction!!!
            if (aParam.getDirection() != oParam.getDirection()) {
            	System.err.println("Direction Mismatched !!!");
            	return;
            }
            if (aParam.getDirection() == ParameterDirection.IN) {
            	newMapping.setType(ParameterMappingType.ACTIVITY_IN);
            }else {
            	newMapping.setType(ParameterMappingType.ACTIVITY_OUT);
            }
            // 3. Add the mapping to the activity container
            activity.getParameterMappings().add(newMapping);
        } else {
            // Optional: Update existing mapping if it's already found
            System.out.println("Activity Param has been mapped. Map to new OParam: "+ oParam.getName());
            foundMapping.get().setOperationParameter(oParam);
        }
    }
    
    
    public List<Parameter> getAvailableOpParamsToMapForActivitiy(Parameter parameter) {
    	List<Parameter> opParams = new ArrayList<>();
  
    	if (parameter.getOperation() != null) {
    		return opParams;
    	}
    	Activity activity = parameter.getActivity();
    	Operation specification = activity.getSpecification();
    	if (specification == null) {
    		return opParams;
    	}
    	
    	System.out.println("Found Specification Operation : "+specification.getName());
    	List<Parameter> sameDirectionParameter = specification
    			.getOwnedParameters()
    			.stream()
    			.filter(p -> p.getDirection() == parameter.getDirection())
    			.collect(Collectors.toList());
    	sameDirectionParameter.add(null);
    	return sameDirectionParameter;
    }
    
    public Parameter getMappedOpParamForActivity(Parameter parameter) {
    	Parameter mappedOpParam = null;
    	if (parameter.getOperation() != null) {
    		return mappedOpParam;
    	}
    	Activity activity = parameter.getActivity();
    	Operation specification = activity.getSpecification();
    	if (specification == null) {
    		return mappedOpParam;
    	}
    	List<ParameterMapping> mappings = activity.getParameterMappings();
    	Optional<ParameterMapping> foundMapping= mappings.stream().filter(m -> m.getActivityParameter() == parameter).findFirst();
    	if (foundMapping.isEmpty()) {
    		return mappedOpParam;
    	}
    	
    	mappedOpParam = foundMapping.get().getOperationParameter();
    	return mappedOpParam;
    }
}
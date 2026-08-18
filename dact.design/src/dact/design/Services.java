package dact.design;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import dact.PrimitiveType;
import dact.BooleanType;
import dact.Root;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
	
    public boolean validateWithDiagnostician(EObject self) {
        Diagnostic diagnostic = Diagnostician.INSTANCE.validate(self);
        return diagnostic.getSeverity() <= Diagnostic.WARNING; // returns true if valid
    }
    
    public BooleanType findBooleanType(EObject context) {
    	PrimitiveType foundType = findPrimitiveType(context,"Boolean");
    	if (foundType instanceof BooleanType bt) {
    		return bt;
    	}
    	return null;
    }
    
    public PrimitiveType findPrimitiveType(EObject context, String name) {
        if (context == null || name == null) {
            return null;
        }

        // Get the root element of the active model resource
        EObject root = EcoreUtil.getRootContainer(context);

        if (root instanceof Root) {
            return ((Root) root).getPrimitivesTypes()
            	.stream()
                .filter(PrimitiveType.class::isInstance)
                .map(PrimitiveType.class::cast)
                .filter(type -> name.contains(type.getName()))
                .findFirst()
                .orElse(null);
        }
        
        return null;
    }
   
}

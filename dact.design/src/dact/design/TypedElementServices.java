package dact.design;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import dact.Type;
import dact.TypedMultiplicityElement;

/**
 * The services class used by VSM.
 */
public class TypedElementServices {
    
    public List<Type> getAllAvailableTypes(EObject object){
        EObject root = EcoreUtil.getRootContainer(object);
        Iterable<EObject> iterable = () -> EcoreUtil.getAllContents(root, true);

        return StreamSupport.stream(iterable.spliterator(), false)
                .filter(Type.class::isInstance)
                .map(Type.class::cast)
                .collect(Collectors.toList());
    }
	
	public String readType(TypedMultiplicityElement e) {
	    if (e == null) {
	        return "";
	    }

	    // 1. Get the type name
	    String typeName = "";
	    if (e.getType() != null) {
	        // Adjust to e.getType().getName() or similar feature depending on your metamodel
	        typeName = e.getType().getName() != null ? e.getType().getName() : "";
	    }

	    // 2. Read lower and upper bounds
	    int lower = e.getLowerBound(); 
	    int upper = e.getUpperBound(); 

	    // 3. Omit bounds if lower == 1 and upper == 1
	    if (lower == 1 && upper == 1) {
	        return typeName;
	    }

	    // 4. Format upper bound (* for -1 / unbounded)
	    String upperStr = (upper == -1) ? "*" : String.valueOf(upper);

	    // 5. Append bounds suffix
	    if (lower == upper) {
	        return String.format("%s[%d]", typeName, lower);
	    } else {
	        return String.format("%s[%d..%s]", typeName, lower, upperStr);
	    }
	}
}
package dact.design;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
        return diagnostic.getSeverity() >= Diagnostic.WARNING; // returns true if valid
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
   
//    public String getNewElementName(EObject object) {
//    	EObject root = EcoreUtil.getRootContainer(object);
//    	Iterable<EObject> iterable = () -> EcoreUtil.getAllContents(root, true);
//    	
//    	EClass targetClass = object.eClass();
//    	
//    	long count = StreamSupport.stream(iterable.spliterator(), false)
//                .filter(eObj -> targetClass.isInstance(eObj))
//                .count();
//
//        return targetClass.getName() + count;
//    }
    
    
    /**
     * An EMF Adapter to hold persistent counter state on the root ResourceSet or Resource.
     */
    private static class SessionCounterAdapter extends AdapterImpl {
        private int count = 0;

        public synchronized int getNextValue() {
            return ++count;
        }

        public boolean isAdapterForType(Object type) {
            return type == SessionCounterAdapter.class;
        }
    }

    /**
     * Generates a unique name using a universal incrementing counter 
     * stored at the absolute root context.
     */
    public String getNewElementName(EObject object) {
        EClass targetClass = object.eClass();
        String prefix = targetClass.getName();

        // 1. Navigate to the highest root context (ResourceSet preferred, fall back to Resource)
        EObject root = EcoreUtil.getRootContainer(object);
        Resource resource = root.eResource();
        
        if (resource == null) {
            // Unattached object fallback
            return prefix + "1";
        }

        ResourceSet resourceSet = resource.getResourceSet();
        
        // 2. Fetch or attach the adapter to the root context
        SessionCounterAdapter counter;
        if (resourceSet != null) {
            counter = (SessionCounterAdapter) EcoreUtil.getExistingAdapter(resourceSet, SessionCounterAdapter.class);
            if (counter == null) {
                counter = new SessionCounterAdapter();
                resourceSet.eAdapters().add(counter);
            }
        } else {
            counter = (SessionCounterAdapter) EcoreUtil.getExistingAdapter(resource, SessionCounterAdapter.class);
            if (counter == null) {
                counter = new SessionCounterAdapter();
                resource.eAdapters().add(counter);
            }
        }

        // 3. Increment and return
        return prefix + counter.getNextValue();
    }
}

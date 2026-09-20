package dact.code.generator.utils;

import lemma.adapted.xcore.behavior.*;
import lemma.adapted.xcore.service.*;

public class BehaviorUtils {

	public Interface getParentInterface(ActivityNode node) {
	    ActivityGroup rootGroup = getRootGroup(node);
	    if (rootGroup == null) return null;
	    
	    Activity activity = rootGroup.getActivity();
	    if (activity == null) return null;
	    
	    ImportedOperation importedOp = activity.getSpecification();
	    
	    // Safety check: ensure it is specifically an ImportedInterfaceOperation
	    if (importedOp instanceof ImportedInterfaceOperation) {
	        ImportedInterfaceOperation interfaceOp = (ImportedInterfaceOperation) importedOp;
	        Operation op = interfaceOp.getOperation();
	        
	        if (op != null) {
	            return op.getInterface();
	        }
	    }
	    
	    return null;
	}
	
	public ActivityGroup getRootGroup(ActivityNode node) {
		if (node.getGroup().eContainer() instanceof ActivityNode pNode) {
			return getRootGroup(pNode);
		}else {
			return node.getGroup();
		}
	}
}
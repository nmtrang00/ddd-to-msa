package dact.design;

import org.eclipse.emf.ecore.EObject;

import java.util.List;
import dact.ActivityGroup;
import dact.ParallelFlow;
import dact.Variable;

/**
 * The services class used by VSM.
 */
public class ActivityGroupServices {
	
	public EObject getParent(ActivityGroup group) {
		if (group.getActivity() != null) {
			return group.getActivity();
		}
		
		if (group.getStructuredActivityNode() != null) {
			return group.getStructuredActivityNode();
		}
		
		if (group.getConditionalNode() != null) {
			return group.getConditionalNode();
		}
		
		if (group instanceof ParallelFlow flow && flow.getParallelNode() != null) {
			return flow.getParallelNode();
		}
		return null;
	}

	public List<Variable> getAvailableVariables(ActivityGroup group){
		return null;
	}
    
}
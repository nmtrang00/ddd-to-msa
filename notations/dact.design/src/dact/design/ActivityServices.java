package dact.design;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import dact.DactFactory;
import dact.Service;
import dact.Operation;
import dact.OperationType;
import dact.Activity;
import dact.ActivityModel;
import dact.ActivityGroup;
import dact.Scope;

/**
 * The services class used by VSM.
 */
public class ActivityServices {
	
	public Activity createANewActivity(ActivityModel model) {
		// Create Activity
		Activity newActivity =  DactFactory.eINSTANCE.createActivity();
		newActivity.setName("NewActivity"+model.getActivities().size());
		model.getActivities().add(newActivity);
        
		// Create Root Group
		ActivityGroup newRootGroup = DactFactory.eINSTANCE.createActivityGroup();
		newRootGroup.setName("Root");
		newActivity.setRoot(newRootGroup);
		
		// Create Root Scope
		Scope newScope = DactFactory.eINSTANCE.createScope();
		newRootGroup.setScope(newScope);
		
		return newActivity;
	}
	
    public List<Operation> getAvailableSpecOperations(Activity activity) {
        if (activity == null) {
            return List.of();
        }

        EObject root = EcoreUtil.getRootContainer(activity);
        Iterable<EObject> iterable = () -> EcoreUtil.getAllContents(root, true);

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
                		op.getType() == OperationType.D2_COMPOUND_MUTATOR ||
                		op.getType() == OperationType.D4_COMPOUND_ACCESSOR))
                .collect(Collectors.toList());
        allOperations.addAll(constructorOps);
        
        allOperations.add(null);
        return allOperations;
    }

}
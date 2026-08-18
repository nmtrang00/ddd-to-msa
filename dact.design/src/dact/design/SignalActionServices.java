package dact.design;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import dact.DactFactory;
import dact.DomainEvent;
import dact.SignalAction;
import dact.Identifier;

public class SignalActionServices{
	
	public List<DomainEvent> getAllAvailableDomainEvents(EObject object){
		EObject root = EcoreUtil.getRootContainer(object);
        Iterable<EObject> iterable = () -> EcoreUtil.getAllContents(root, true);

        return StreamSupport.stream(iterable.spliterator(), false)
                .filter(DomainEvent.class::isInstance)
                .map(DomainEvent.class::cast)
                .collect(Collectors.toList());
	}
	
	public String getValue(SignalAction node) {
		// Currently support only identifier
		if (node.getIdentifier() != null) return node.getIdentifier().getName();
		return "";
	}
	
	public void setValue(SignalAction node, String newValue) {
		// Currently support only identifier
		node.setValue(null);
		Identifier identifier = node.getIdentifier();
		if (identifier == null) {
			identifier = DactFactory.eINSTANCE.createIdentifier();
			node.setIdentifier(identifier);
		}
		identifier.setName(newValue);
	}
}
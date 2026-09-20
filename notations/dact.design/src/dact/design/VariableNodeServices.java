package dact.design;

import org.eclipse.emf.common.util.DiagnosticException;

import dact.Expression;
import dact.Identifier;
import dact.VariableAssignment;
import dact.DactFactory;
import dact.ActivityGroup;
import dact.VariableDeclarationAction;
import dact.VariableAssignmentAction;

public class VariableNodeServices{
	
	private static DslHelper dslHelper;

    private synchronized DslHelper getDslHelper() {
        if (dslHelper == null) {
            dslHelper = new DslHelper(); // Or retrieve via Guice injector if DslHelper needs injection
        }
        return dslHelper;
    }
    
    public void createVariableDeclarationNode(ActivityGroup group) {
    	// 1. Create main node
    	VariableDeclarationAction node = DactFactory.eINSTANCE.createVariableDeclarationAction();
    	node.setName("VariableDeclarationAction"+group.getOwnedNodes().size());
    	group.getOwnedNodes().add(node);
    	
    	// 2. Create declaration part
    	VariableAssignment assignment = DactFactory.eINSTANCE.createVariableAssignment();
    	Identifier identifier = DactFactory.eINSTANCE.createIdentifier();
    	assignment.setIdentifier(identifier);
    	node.setDeclaration(assignment);
    }
    
    public void createVariableAssignmentNode(ActivityGroup group) {
    	// 1. Create main node
    	VariableAssignmentAction node = DactFactory.eINSTANCE.createVariableAssignmentAction();
    	node.setName("VariableAssignmentAction"+group.getOwnedNodes().size());
    	group.getOwnedNodes().add(node);
    }
    
    public String readAssignment(VariableAssignment a) {
    	String toReturn = "";
    	dslHelper = getDslHelper();
    	
    	toReturn +=  (a.getIdentifier() != null) ? a.getIdentifier().getName() : "UNDEFINED_IDENTIFIER";
    	toReturn += (a.getExpr() != null) ? ( " = " + dslHelper.read(a.getExpr())) : "";
    	System.out.println("[DEBUG] Parsed assignment: "+ toReturn);
    	return toReturn;
    }
    
    public void updateAssignmentIdentifier(VariableAssignment variableAssignment, String name) {
    	Identifier identifier = variableAssignment.getIdentifier();
    	if (identifier == null) {
    		identifier = DactFactory.eINSTANCE.createIdentifier();
    		variableAssignment.setIdentifier(identifier);
    	}
    	identifier.setName(name);
    	System.out.println("[DEBUG] New identifier assigned: "+ identifier);
    }
    
	public void updateAssignmentExpr(VariableAssignment variableAssignment, String dslText) throws DiagnosticException{
        
        dslHelper = getDslHelper();
        Expression parsedExpr = dslHelper.parseExpr(dslText);
        if (parsedExpr == null) {
        	variableAssignment.setExpr(null);
	        return;
        }
        
        variableAssignment.setExpr(parsedExpr);
        return;
	}
	
	public void updateAssignment(VariableAssignmentAction node, String dslText)throws DiagnosticException{
        
        dslHelper = getDslHelper();
        VariableAssignment parsedAssignment = dslHelper.parseAssignment(dslText);
        if (parsedAssignment == null) {
        	node.setAssignment(null);
	        return;
        }
        
        node.setAssignment(parsedAssignment);
        return;
	}
}
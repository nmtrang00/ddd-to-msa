package dact.design;

import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.ecore.EObject;

import dact.DactFactory;
import dact.Expression;
import dact.ConditionalNode;
import dact.ActivityGroup;
import dact.UnaryExpression;
import dact.LiteralBoolean;
import dact.LoopNode;
import dact.Scope;
import dact.StructuredActivityNode;
import dact.ParallelNode;

/**
 * The services class used by VSM.
 */
public class StructuredActivityNodeServices {
    private static DslHelper dslHelper;

    private synchronized DslHelper getDslHelper() {
        if (dslHelper == null) {
            dslHelper = new DslHelper(); // Or retrieve via Guice injector if DslHelper needs injection
        }
        return dslHelper;
    }
    
    public void createANewConditionalNode(EObject object) {
    	if (!(object instanceof ActivityGroup group)) {
    		return;
    	}
    	
    	// Create a new node
    	ConditionalNode cnode = DactFactory.eINSTANCE.createConditionalNode();
    	cnode.setName("NewConditionalNode"+group.getOwnedNodes().size());
    	group.getOwnedNodes().add(cnode);
    	
    	// Create empty unary expr
    	UnaryExpression expr = DactFactory.eINSTANCE.createUnaryExpression();
    	LiteralBoolean lbool = DactFactory.eINSTANCE.createLiteralBoolean();
    	lbool.setValue(true);
    	expr.setValue(lbool);
    	cnode.setTest(expr);

    	// Create 2 new bodies
    	ActivityGroup body = DactFactory.eINSTANCE.createActivityGroup();
    	body.setName("Body (True)");
    	Scope bodyScope = DactFactory.eINSTANCE.createScope();
    	bodyScope.setParent(group.getScope());
    	body.setScope(bodyScope);
    	cnode.setBody(body);
    	
    	ActivityGroup elseBody = DactFactory.eINSTANCE.createActivityGroup();
    	elseBody.setName("ElseBody (False)");
    	Scope elseScope = DactFactory.eINSTANCE.createScope();
    	elseScope.setParent(group.getScope());
    	elseBody.setScope(elseScope);
    	cnode.setElseBody(elseBody);
    }
    
    public void createANewLoopNode(EObject object) {
    	if (!(object instanceof ActivityGroup group)) {
    		return;
    	}
    	
    	// Create a new node
    	LoopNode node = DactFactory.eINSTANCE.createLoopNode();
    	node.setName("NewLoopNode"+group.getOwnedNodes().size());
    	group.getOwnedNodes().add(node);
    	
    	// Create empty unary expr
    	UnaryExpression expr = DactFactory.eINSTANCE.createUnaryExpression();
    	LiteralBoolean lbool = DactFactory.eINSTANCE.createLiteralBoolean();
    	lbool.setValue(true);
    	expr.setValue(lbool);
    	node.setTest(expr);

    	// Create a new body group
    	ActivityGroup body = DactFactory.eINSTANCE.createActivityGroup();
    	body.setName("Body");
    	node.setBody(body);
    	
    	// Create a new setup group
    	ActivityGroup setup = DactFactory.eINSTANCE.createActivityGroup();
    	setup.setName("Setup");
    	node.setSetup(setup);
    }
    
    public void createANewParallelNode(EObject object) {
    	if (!(object instanceof ActivityGroup group)) {
    		return;
    	}
    	
    	// Create a new node
    	ParallelNode node = DactFactory.eINSTANCE.createParallelNode();
    	node.setName("NewParallelNode"+group.getOwnedNodes().size());
    	group.getOwnedNodes().add(node);
    	
    	// Create a new body group
    	ActivityGroup body = DactFactory.eINSTANCE.createActivityGroup();
    	body.setName("Flow");
    	node.getFlows().add(body);
    }
    
    public void updateTestExpr(EObject node, String dslText) throws DiagnosticException {
        
        if (!(node instanceof StructuredActivityNode snode)) {
        	return;
        }
        
        dslHelper = getDslHelper();
        Expression parsedExpr = dslHelper.parseExpr(dslText);
        if (parsedExpr == null) {
	        return;
        }
        
        snode.setTest(parsedExpr);
        return;
    }
}
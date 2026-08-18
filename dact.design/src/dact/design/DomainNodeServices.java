package dact.design;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import dact.DactFactory;
import dact.Expression;
import dact.UnaryExpression;
import dact.DomainNode;
import dact.AggregateRoot;
import dact.BoundedContext;
import dact.DomainElement;
import dact.Identifier;
import dact.DomainCreateAction;
import dact.DomainUpdateAction;
import dact.DomainFindAction;
import dact.DomainExistAction;
import dact.DomainDeleteAction;
import dact.BinaryExpression;
import dact.LiteralBoolean;

/**
 * The services class used by VSM.
 */
public class DomainNodeServices {
	private static DslHelper dslHelper;

    private synchronized DslHelper getDslHelper() {
        if (dslHelper == null) {
            dslHelper = new DslHelper(); // Or retrieve via Guice injector if DslHelper needs injection
        }
        return dslHelper;
    }
    
	public List<AggregateRoot> getAllAvailableAggregates(EObject object){
		EObject root = EcoreUtil.getRootContainer(object);
        Iterable<EObject> iterable = () -> EcoreUtil.getAllContents(root, true);

        List<AggregateRoot> aggregates = StreamSupport.stream(iterable.spliterator(), false)
                .filter(AggregateRoot.class::isInstance)
                .map(AggregateRoot.class::cast)
                .collect(Collectors.toList());
        aggregates.add(null);
        return aggregates;
	}
	
	public String getFullQualifiedName(DomainElement e) {
    	return getFullQualifiedName(e,"::");
    }
    
    public String getFullQualifiedName(DomainElement e, String sep) {
    	// Context
    	String contextName;
    	BoundedContext context = e.getContext();
    	
    	if (context != null) {
    		contextName = context.getName();
    	}else {
    		contextName = "UNDEFINED";
    	}
    	
    	return contextName + sep + e.getName();
    }
    
    public void updateResultIdentifier(DomainNode node, String newName) {
    	Identifier result = node.getResult();
    	if (result == null) {
    		result = DactFactory.eINSTANCE.createIdentifier();
    		node.setResult(result);
    	}
    	result.setName(newName);
    }
	
    public String getInput(DomainCreateAction node) {
    	List<Expression> exprList = node.getMainExpr();
    	if (exprList.isEmpty()) return null;
    	
    	Expression expr = exprList.getFirst();
    	return getInput(expr);
    }
    
    public String getInput(Expression expr) {
    	return getInput(expr, false);
    }
    
    public String getInput(Expression expr, Boolean withType) {
    	if (!(expr instanceof BinaryExpression be)) return null;
    	
    	Expression rightChild = be.getRightExpr();
    	if (!(rightChild instanceof UnaryExpression r)) return null;
    	
    	if (r.getIdentifier() != null) return r.getIdentifier().getName();
    	
    	if (r.getValue() != null) {
    		ValueSpecificationHelper helper = new ValueSpecificationHelper();
    		return helper.readValue(r.getValue(),withType);
    	}
    	
    	return "";
    }
    
    public void setInput(DomainCreateAction node, String newInput) {
    	node.getMainExpr().clear();
    	
    	BinaryExpression expr = DactFactory.eINSTANCE.createBinaryExpression();
    	expr.setName("Main");
    	node.getMainExpr().add(expr);
    	
    	UnaryExpression leftChild = DactFactory.eINSTANCE.createUnaryExpression();
    	Identifier selfId = DactFactory.eINSTANCE.createIdentifier();
    	selfId.setName("self");
    	leftChild.setIdentifier(selfId);
    	expr.setLeftExpr(leftChild);
    	
    	UnaryExpression rightChild = DactFactory.eINSTANCE.createUnaryExpression();
    	Identifier idToPersist = DactFactory.eINSTANCE.createIdentifier();
    	idToPersist.setName(newInput);
    	rightChild.setIdentifier(idToPersist);
    	expr.setRightExpr(rightChild);
    }
    
    public String getFullNodeInfo(DomainCreateAction node) {
    	String toReturn = "";
    	String actionStr = "";
    	if (node instanceof DomainUpdateAction) {
    		actionStr = "update";
    	}else {
    		actionStr = "save";
    	}
    	
    	if (node.getAggregate() == null && node.getResult() == null && node.getMainExpr().isEmpty()) return node.getName();
    	
    	if (node.getAggregate() != null) {
    		toReturn +=  getFullQualifiedName(node.getAggregate()) + "\n";
    	}
    	
    	if (node.getResult() != null) {
    		toReturn += node.getResult().getName() + " = ";
    	}
    	
    	if (getInput(node) != null) {
    		toReturn += actionStr + "(" + getInput(node) + ")";
    	}
    	return toReturn;
    }

    public void updateExpr(DomainNode node, Expression currentExpr, String dslText) throws DiagnosticException {
    	System.out.println("[DEBUG] Input node: "+node);
    	if (!(node instanceof DomainFindAction || node instanceof DomainDeleteAction)) return;
    	
    	Integer currentExprIdx = node.getMainExpr().indexOf(currentExpr);
    	
    	dslHelper = getDslHelper();
    	Expression parsedExpr = dslHelper.parseExpr(dslText);
    	if (parsedExpr == null) {
    		return;
    	}
    	
    	node.getMainExpr().set(currentExprIdx, parsedExpr);
    	System.out.println("[DEBUG] New parsed expression: "+ parsedExpr);
    	return;
    }
    
    public void createExpr(DomainNode node) {
    	UnaryExpression expr = DactFactory.eINSTANCE.createUnaryExpression();
    	LiteralBoolean bool = DactFactory.eINSTANCE.createLiteralBoolean();
    	bool.setValue(true);
    	expr.setValue(bool);
    	
    	node.getMainExpr().add(expr);
    	
    	return;
    }
    
    public String getFullNodeInfo(DomainNode node) {
    	String toReturn = "";
    	if (!(node instanceof DomainFindAction || node instanceof DomainDeleteAction)) return toReturn;
    	
    	if (node.getAggregate() == null && node.getResult() == null && node.getMainExpr().isEmpty()) return node.getName();
    	
    	if (node.getAggregate() != null) {
    		toReturn +=  getFullQualifiedName(node.getAggregate()) + "\n";
    	}
    	
    	if (node.getResult() != null) {
    		toReturn += node.getResult().getName() + " = ";
    	}
    	
    	toReturn += deriveDomainOperationName(node);
    	
    	return toReturn;
    }
    
    
    public String deriveDomainOperationName(DomainNode node) {
    	String toReturn = "";
    	String actionStr = "";
    	if (node instanceof DomainExistAction) {
    		actionStr = "exists";
    	}else if (node instanceof DomainFindAction) {
    		actionStr = "find";
    	}else if (node instanceof DomainDeleteAction) {
    		actionStr = "delete";
    	}
    	
    	if ((node.getMainExpr().isEmpty())) {
    		return actionStr + "()";
    	}	
    	
    	List<String> params = node.getMainExpr()
                .stream()
                .map(e -> capitalize(getInputParam(e))) 
                .toList();
    	
    	toReturn = actionStr + (params.size() > 0 ? "By" + String.join("And", params) : "") + "()";
    	return toReturn;
    }
    
    public String getInputParam(Expression expr) {
    	if (!(expr instanceof BinaryExpression be)) return null;
    	
    	Expression leftChild = be.getRightExpr();
    	if (!(leftChild instanceof UnaryExpression l)) return null;
    	
    	if (l.getIdentifier() != null) return l.getIdentifier().getName().replace("self.", "");
    	
    	return "";
    }
    
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    
}
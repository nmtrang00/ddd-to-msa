package dact.design;

import org.eclipse.swt.widgets.Display;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.emf.common.util.DiagnosticException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import java.io.StringReader;
import com.google.inject.Injector;

import dact.dsl.ExprDslStandaloneSetup;
import dact.impl.DactPackageImpl;
import dact.DactPackage;
import dact.Expression;
import dact.VariableAssignment;

/**
 * The services class used by VSM.
 */
public class DslHelper {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
	
	// Lazy initialization of the Xtext Injector
    private static Injector injector;
    
    private synchronized Injector getInjector() {
        if (injector == null) {
            System.out.println("[DEBUG-DSL] Initializing Injector via ExprDslStandaloneSetup...");
            injector = new ExprDslStandaloneSetup().createInjectorAndDoEMFRegistration();
        }
        return injector;
    }
    
    /**
     * Recursively converts an Expression / Assignment AST into text with explicit binary parentheses.
     */
    public String read(EObject expr) {
    	
        if (expr == null) return "";

        // Handle Variable Assignment: identifier = expr
        if (expr instanceof dact.VariableAssignment) {
            dact.VariableAssignment assign = (dact.VariableAssignment) expr;
            String idStr = read((EObject) assign.getIdentifier());
            String valStr = read((EObject) assign.getExpr());
            return idStr + " = " + valStr;
        }

        // Handle Binary Expression: (leftExpr OP rightExpr)
        if (expr instanceof dact.BinaryExpression) {
            dact.BinaryExpression bin = (dact.BinaryExpression) expr;
            String leftStr = read((EObject) bin.getLeftExpr());
            String opStr = getOperatorSymbol(bin.getOperator());
            String rightStr = read((EObject) bin.getRightExpr());
            
            // Explicitly wrap binary expressions in parentheses
            return "(" + leftStr + " " + opStr + " " + rightStr + ")";
        }

        // Handle Unary Not Expression: !expr
        if (expr instanceof dact.NotExpression) {
            dact.NotExpression notExpr = (dact.NotExpression) expr;
            return "!" + read((EObject) notExpr.getExpr());
        }

        // Handle Unary/Primary Expressions and Literals
        if (expr instanceof dact.UnaryExpression) {
            dact.UnaryExpression unary = (dact.UnaryExpression) expr;
            
            // If it's a Property/Identifier access
            if (unary.getIdentifier() != null) {
                return read((EObject) unary.getIdentifier());
            }
            
            // If it wraps a literal value (String, Integer, Real, Enum, etc.)
            if (unary.getValue() != null) {
                return read((EObject) unary.getValue());
            }
        }

        // Handle Identifier / Qualified Name
     // Handle Identifier / Qualified Name
        if (expr instanceof dact.Identifier) {
            dact.Identifier id = (dact.Identifier) expr;
            String name = id.getName() != null ? id.getName() : "";
            
            // Safely check if getIndex() is present and not null
            Integer index = id.getIndex();
            if (index != null) {
                name += "[" + index + "]";
            }
            return name;
        }
        
        // Handle Enum Literals (e.g., TransportStatus::RECEIVED)
        if (expr instanceof dact.EnumerationLiteral) {
            dact.EnumerationLiteral enumLit = (dact.EnumerationLiteral) expr;
            return enumLit.getName();
        }

        // Handle Primitive Literals
        if (expr instanceof dact.LiteralString) return "\"" + ((dact.LiteralString) expr).getValue() + "\"";
        if (expr instanceof dact.LiteralInteger) return String.valueOf(((dact.LiteralInteger) expr).getValue());
        if (expr instanceof dact.LiteralReal) return String.valueOf(((dact.LiteralReal) expr).getValue());
        if (expr instanceof dact.LiteralBoolean boolExpr) {
        	if (boolExpr.isValue()) {
        		return "TRUE";
        	};
        	return "FALSE";
        }
        if (expr instanceof dact.LiteralNull) return "NULL";

        // Fallback for node token text if available
        ICompositeNode node = NodeModelUtils.findActualNodeFor(expr);
        return node != null ? NodeModelUtils.getTokenText(node).trim() : expr.toString();
    }

    /**
     * Maps the operator EObject to its concrete syntax representation.
     */
    private String getOperatorSymbol(dact.Operator op) {
        if (op instanceof dact.Or) return "||";
        if (op instanceof dact.And) return "&&";
        if (op instanceof dact.Gt) return ">";
        if (op instanceof dact.Ge) return ">=";
        if (op instanceof dact.Lt) return "<";
        if (op instanceof dact.Le) return "<=";
        if (op instanceof dact.Eq) return "==";
        if (op instanceof dact.Ne) return "!=";
        if (op instanceof dact.Plus) return "+";
        if (op instanceof dact.Minus) return "-";
        if (op instanceof dact.Times) return "*";
        if (op instanceof dact.Divide) return "/";
        if (op instanceof dact.In) return "IN";
        return op != null ? op.eClass().getName() : "";
    }
    
    public Expression parseExpr(String dslText){
    	DactPackage pkg = DactPackageImpl.eINSTANCE;
    	
    	EObject parsedObject = parse(dslText, pkg.getExpression());
    	if (parsedObject instanceof Expression parsedExpr) {
    		
    		return parsedExpr;
    	}
    	
    	raiseError("Invalid Input Type","");
    	return null;
    }
    
    public VariableAssignment parseAssignment(String dslText) throws DiagnosticException{
    	DactPackage pkg = DactPackageImpl.eINSTANCE;
    	
    	EObject parsedObject = parse(dslText, pkg.getVariableAssignment());
    	if (parsedObject instanceof VariableAssignment parsedAssignment) {
    		return parsedAssignment;
    	}
    	return null;
    }
    
    
    public EObject parse(String dslText, EClassifier expectedType){
        // 1. Handle empty input
        if (dslText == null || dslText.trim().isEmpty()) {
            return null;
        }

        // 2. Parse the input string
        Injector localInjector = getInjector();
        IParser parser = localInjector.getInstance(IParser.class);
        IParseResult parseResult = parser.parse(new StringReader(dslText));
        
        // Check for syntax errors
        if (parseResult.hasSyntaxErrors()) {
        	for (INode node : parseResult.getSyntaxErrors()) {
                SyntaxErrorMessage syntaxError = node.getSyntaxErrorMessage();
                String message = String.format("Line %d: %s", node.getStartLine(), syntaxError.getMessage());
                
                System.err.println("[DSL-ERROR] " + message);
                
                raiseError("Syntax Error in "+expectedType.getName(),"Failed to parse DSL expression:\n\n" + dslText + "\n\nDetails:\n" + message);
            }
        }

        EObject rootAst = parseResult.getRootASTElement();

        // 3. Dynamic EMF Type Check
        if (rootAst == null || (expectedType != null && !expectedType.isInstance(rootAst))) {
            String expectedName = expectedType != null ? expectedType.getName() : "EObject";
            String actualName = rootAst != null ? rootAst.eClass().getName() : "null";
            String errString = "[DSL-ERROR] Parsed result is not of expected type. Expected: " 
                    + expectedName + ", Actual: " + actualName;
            System.err.println(errString);
            System.err.println("[DSL-ERROR] Keeping the existing value.");
            
            raiseError("Syntax Error in "+expectedType.getName(),
                  "Failed to parse DSL expression:\n\n" + dslText + "\n\nDetails:\n" + errString);
        }

        System.out.println("[DSL-SUCCESS] Successfully parsed string '"+ dslText +"' into " + rootAst.eClass().getName());
        return rootAst;
    }
    
    public void raiseError(String title, String body) throws RuntimeException{
        Display.getDefault().asyncExec(() -> {
            MessageDialog.openError(
                Display.getDefault().getActiveShell(),
                title,
                body
            );
        });
        
        throw new RuntimeException(title+": " + body);
    }
   
}

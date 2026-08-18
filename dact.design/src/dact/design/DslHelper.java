package dact.design;

import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import java.io.StringReader;

import com.google.inject.Injector;

import dact.dsl.ExprDslStandaloneSetup;
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

    public String read(EObject object){
    	System.out.println("[DEBUG-DSL] Input Object: " + object);
    	// 1. Try Node Model first (fastest if node metadata exists)
        ICompositeNode node = NodeModelUtils.findActualNodeFor(object);
        if (node != null) {
            return NodeModelUtils.getTokenText(node).trim();
        }

        try {
            // 2. Create an isolated XtextResourceSet
            Injector injector = getInjector(); // Your Xtext injector
            XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
            resourceSet.setClasspathURIContext(DslHelper.class);

            // 3. Create a dummy virtual resource
            URI dummyUri = URI.createURI("temp:/dummy.dd");
            Resource resource = resourceSet.createResource(dummyUri);

            // 4. Temporarily attach the detached EObject to the resource
            EObject copyObject = EcoreUtil.copy(object);
            resource.getContents().add(copyObject);

            // 5. Use Xtext Serializer now that it has a resource/context
            ISerializer serializer = injector.getInstance(ISerializer.class);
            String result = safeSerialize(copyObject,serializer);
//          
            // 6. Clean up: remove it so it doesn't pollute the model state
            resource.getContents().remove(copyObject);

            return result != null ? result.trim() : "";

        } catch (Exception e) {
            System.err.println("[DSL-ERROR] Temporary context serialization failed: " + e.getMessage());
            return "PARSED_ERROR";
        }
    }
    
    public String safeSerialize(EObject eObject, ISerializer serializer) {
        EStructuralFeature nameFeature = eObject.eClass().getEStructuralFeature("name");
        Object previousName = null;
        boolean wasSet = false;

        try {
            // Temporarily clear 'name' feature if it's set on BinaryExpression
            if (nameFeature != null && eObject.eIsSet(nameFeature)) {
                previousName = eObject.eGet(nameFeature);
                wasSet = true;
                eObject.eUnset(nameFeature);
            }

            // Standard serialization without error
            return serializer.serialize(eObject).trim();

        } finally {
            // Restore 'name' so your EMF model remains intact
            if (wasSet && nameFeature != null) {
                eObject.eSet(nameFeature, previousName);
            }
        }
    }
    
    public Expression parseExpr(String dslText) throws DiagnosticException{
    	EObject parsedObject = parse(dslText, DactPackage.Literals.EXPRESSION);
    	if (parsedObject instanceof Expression parsedExpr) {
    		return parsedExpr;
    	}
    	return null;
    }
    
    public VariableAssignment parseAssignment(String dslText) throws DiagnosticException{
    	EObject parsedObject = parse(dslText, DactPackage.Literals.VARIABLE_ASSIGNMENT);
    	if (parsedObject instanceof VariableAssignment parsedAssignment) {
    		return parsedAssignment;
    	}
    	return null;
    }
    
    
    public EObject parse(String dslText, EClassifier expectedType) throws DiagnosticException{
        // 1. Handle empty input
        if (dslText == null || dslText.trim().isEmpty()) {
            return null;
        }

        // 2. Parse the input string
        Injector localInjector = getInjector();
        IParser parser = localInjector.getInstance(IParser.class);
        IParseResult parseResult = parser.parse(new StringReader(dslText));

        // Check for syntax errors
    	BasicDiagnostic chain = new BasicDiagnostic(
    	        Diagnostic.ERROR,
    	        "DactDsl", 
    	        0,
    	        "Syntax errors encountered while parsing DSL input: "+ dslText,
    	        null
    	    );
        if (parseResult.hasSyntaxErrors()) {
        	for (INode node : parseResult.getSyntaxErrors()) {
                SyntaxErrorMessage syntaxError = node.getSyntaxErrorMessage();
                String message = String.format("Line %d: %s", node.getStartLine(), syntaxError.getMessage());
                
                System.err.println("[DSL-ERROR] " + message);

                // Add each syntax error as a child diagnostic
                chain.add(new BasicDiagnostic(
                    Diagnostic.ERROR,
                    "dact.dsl",
                    0,
                    message,
                    new Object[] { node } // Pass node or feature location
                ));
            }
            throw new DiagnosticException(chain);
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
            chain.add(new BasicDiagnostic(
                    Diagnostic.ERROR,
                    "dact.dsl",
                    0,
                    errString,
                    new Object[] { rootAst } 
                ));
            throw new DiagnosticException(chain);
        }

        System.out.println("[DSL-SUCCESS] Successfully parsed string into " + rootAst.eClass().getName());
        return rootAst;
    }
}

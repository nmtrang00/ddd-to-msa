package dact.validation;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import dact.Root;

import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;

/**
 * Shared helper for the transformation validation tests: loading models,
 * validating them against the metamodel constraints, executing a QVTo
 * transformation, and comparing a result against an expected model.
 *
 * All paths are supplied by the caller; the harness imposes no directory
 * layout of its own.
 */
public final class ValidatorHelper {

    private ValidatorHelper() {}

    // ------------------------------------------------------------------
    // Loading
    // ------------------------------------------------------------------
    public static Path bundleRoot() {
        try {
            Bundle bundle = FrameworkUtil.getBundle(ValidatorHelper.class);
            URL url = FileLocator.toFileURL(bundle.getEntry("/"));
            return Paths.get(url.toURI());
        } catch (Exception e) {
            throw new IllegalStateException("Cannot resolve bundle root", e);
        }
    }
    
    public static Path bundleRoot(String symbolicName) {
        try {
            Bundle bundle = Platform.getBundle(symbolicName);
            URL url = FileLocator.toFileURL(bundle.getEntry("/"));
            return Paths.get(url.toURI());
        } catch (Exception e) {
            throw new IllegalStateException("Cannot resolve bundle: " + symbolicName, e);
        }
    }
    public static ResourceSet newResourceSet() {
        ResourceSet rs = new ResourceSetImpl();
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
          .put(Resource.Factory.Registry.DEFAULT_EXTENSION,
               new XMIResourceFactoryImpl());
        return rs;
    }

    public static Resource load(ResourceSet rs, Path path) {
        return rs.getResource(toUri(path), true);
    }

    public static EObject loadRoot(Path path) {
        return load(newResourceSet(), path).getContents().get(0);
    }

    private static URI toUri(Path path) {
        return URI.createFileURI(path.toAbsolutePath().toString());
    }

    // ------------------------------------------------------------------
    // Metamodel validation
    // ------------------------------------------------------------------

    /**
     * Validates a model against the constraints declared in the metamodel.
     * Returns the messages of every ERROR-severity diagnostic; an empty list
     * means the model is well-formed.
     */
    public static List<String> validate(EObject root) {
        return collectErrors(Diagnostician.INSTANCE.validate(root));
    }

    public static List<String> validate(Path modelPath) {
        return validate(loadRoot(modelPath));
    }

    private static List<String> collectErrors(Diagnostic diagnostic) {
        List<String> messages = new ArrayList<>();
        if (diagnostic.getSeverity() == Diagnostic.ERROR
                && diagnostic.getChildren().isEmpty()
                && diagnostic.getMessage() != null) {
            messages.add(diagnostic.getMessage());
        }
        for (Diagnostic child : diagnostic.getChildren()) {
            messages.addAll(collectErrors(child));
        }
        return messages;
    }
    
    public static List<Diagnostic> validateWithDiagnostics(Path modelPath) {
        return validateWithDiagnostics(loadRoot(modelPath));
    }
    
    public static List<Diagnostic> validateWithDiagnostics(EObject root) {
        return collectDiagnostics(Diagnostician.INSTANCE.validate(root));
    }
    
    private static List<Diagnostic> collectDiagnostics(Diagnostic diagnostic) {
    	List<Diagnostic> diagnosticsToReturn = new ArrayList<>();
        if (diagnostic.getSeverity() >= Diagnostic.WARNING) {
        	diagnosticsToReturn.add(diagnostic);
        }
        
        for (Diagnostic child : diagnostic.getChildren()) {
        	diagnosticsToReturn.addAll(collectDiagnostics(child));
        }
        return diagnosticsToReturn;
    }

    // ------------------------------------------------------------------
    // QVTo execution
    // ------------------------------------------------------------------

    /**
     * Executes an in-place QVTo transformation, where the input model is
     * declared {@code inout} and is modified rather than replaced. The result
     * is written to {@code output}.
     *
     * @return the execution diagnostic; its severity is OK on success.
     */
    public static Diagnostic transformInPlace(Path qvto, Path input, Path output)
            throws Exception {

        ResourceSet rs = newResourceSet();
        Resource in = load(rs, input);

        ModelExtent extent = new BasicModelExtent(in.getContents());
        URI qvtoUri = URI.createFileURI(qvto.toAbsolutePath().toString());
        
        ExecutionDiagnostic result =
            new TransformationExecutor(qvtoUri)
                .execute(new ExecutionContextImpl(), extent);

        if (result.getSeverity() == Diagnostic.OK) {
            save(rs, extent, output);
        }
        return result;
    }

    /**
     * Executes a QVTo transformation whose signature declares any number of
     * input or in-out model parameters followed by a single output parameter.
     * The inputs are loaded in the order given, which must match the order of
     * the parameters in the transformation signature.
     *
     * @return the execution diagnostic; its severity is OK on success.
     */
    public static Diagnostic transform(Path qvto, Path output, Path... inputs)
            throws Exception {

        ResourceSet rs = newResourceSet();

        ModelExtent[] extents = new ModelExtent[inputs.length + 1];
        for (int i = 0; i < inputs.length; i++) {
            extents[i] = new BasicModelExtent(load(rs, inputs[i]).getContents());
        }
        ModelExtent target = new BasicModelExtent();
        extents[inputs.length] = target;

        ExecutionDiagnostic result =
            new TransformationExecutor(toUri(qvto))
                .execute(new ExecutionContextImpl(), extents);

        if (result.getSeverity() == Diagnostic.OK) {
            save(rs, target, output);
        }
        return result;
    }

    private static void save(ResourceSet rs, ModelExtent extent, Path output)
            throws Exception {
        Resource resource = rs.createResource(toUri(output));
        resource.getContents().addAll(extent.getContents());
        resource.save(Collections.emptyMap());
    }
    
    /**
     * Serializes an in-memory Root model to a temporary XMI file, executes the QVTo 
     * transformation, and returns the output Root model loaded from disk.
     */
    public static Root executeTransformation(Path qvtoPath, Root inputRoot, Path tempDir) throws Exception {
        Path inputPath = tempDir.resolve("input_model.xmi");
        Path outputPath = tempDir.resolve("output_model.xmi");

        // 1. Save in-memory model to temporary file
        saveModelToFile(inputRoot, inputPath);

        // 2. Run QVTo transformation
        Diagnostic diagnostic = transform(qvtoPath, outputPath, inputPath);
        if (diagnostic.getSeverity() != Diagnostic.OK) {
            throw new IllegalStateException(diagnostic.getMessage());
        }

        // 3. Load and return transformed output model
        return loadModelFromFile(outputPath);
    }

    /**
     * Saves an EObject (Root) to a file path.
     */
    public static void saveModelToFile(EObject rootModel, Path path) throws IOException {
        ResourceSet rs = new ResourceSetImpl();
        Resource resource = rs.createResource(toUri(path));
        resource.getContents().add(rootModel);
        resource.save(Collections.emptyMap());
    }

    /**
     * Loads a Root model from a file path.
     */
    public static Root loadModelFromFile(Path path) throws IOException {
        ResourceSet rs = new ResourceSetImpl();
        Resource resource = rs.getResource(toUri(path), true);
        return (Root) resource.getContents().get(0);
    }
    // ------------------------------------------------------------------
    // Model comparison
    // ------------------------------------------------------------------

    /**
     * Compares two models, disregarding ordering differences on features
     * whose order carries no meaning. Returns the differences found; an empty
     * list means the models correspond.
     */
    public static List<Diff> compare(Path actual, Path expected) {
        ResourceSet rs = newResourceSet();
        Resource actualModel   = load(rs, actual);
        Resource expectedModel = load(rs, expected);

        // Sort containment hierarchies to ensure identical XMI indexing
        if (!actualModel.getContents().isEmpty()) {
            ModelUtils.sortModelTree(actualModel.getContents().get(0));
        }
        if (!expectedModel.getContents().isEmpty()) {
            ModelUtils.sortModelTree(expectedModel.getContents().get(0));
        }

        IComparisonScope scope = new DefaultComparisonScope(actualModel, expectedModel, null);
        Comparison comparison = EMFCompare.builder().build().compare(scope);

        return comparison.getDifferences().stream()
            .filter(diff -> diff.getKind() != DifferenceKind.MOVE)
            .collect(Collectors.toList());
    }

    public static String describe(List<Diff> diffs) {
        return diffs.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining("\n"));
    }
}
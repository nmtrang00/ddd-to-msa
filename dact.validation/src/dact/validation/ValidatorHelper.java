package dact.validation;

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
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.EditionDistance;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.ProximityEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.match.IComparisonFactory;


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

    // ------------------------------------------------------------------
    // Model comparison
    // ------------------------------------------------------------------

    /**
     * Compares two models, disregarding ordering differences on features
     * whose order carries no meaning. Returns the differences found; an empty
     * list means the models correspond.
     */
//    public static List<Diff> compare(Path actual, Path expected) {
//        ResourceSet rs = newResourceSet();
//        Resource actualModel   = load(rs, actual);
//        Resource expectedModel = load(rs, expected);
//
//        IComparisonScope scope = new DefaultComparisonScope(actualModel, expectedModel, null);
//
//        // 1. Create your custom structural matcher
//        IEObjectMatcher customMatcher = new ProximityEObjectMatcher(EditionDistance.builder().build());
//
//        // 2. Create the standard comparison factory
//        IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
//
//        // 3. Pass matcher AND comparisonFactory directly into MatchEngineFactoryImpl
//        @SuppressWarnings("deprecation")
//		MatchEngineFactoryImpl matchEngineFactory = new MatchEngineFactoryImpl(customMatcher, comparisonFactory);
//        matchEngineFactory.setRanking(20); // Higher priority than the default match engine (default ranking is 10)
//
//        // 4. Register the factory
//        IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
//        matchEngineRegistry.add(matchEngineFactory);
//
//        // 5. Build EMFCompare engine
//        EMFCompare builder = EMFCompare.builder()
//                .setMatchEngineFactoryRegistry(matchEngineRegistry)
//                .build();
//
//        Comparison comparison = builder.compare(scope);
//
//        comparison.getDifferences().forEach(d ->
//                System.out.println(d.getKind() + " | " + d.getClass().getSimpleName() + " | " + d));
//
//        return comparison.getDifferences().stream()
//                .filter(diff -> diff.getKind() != DifferenceKind.MOVE)
//                .collect(Collectors.toList());
//    }
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
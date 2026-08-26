package dact.validation;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.compare.Diff;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Base class for the correctness tests of a single transformation phase.
 *
 * A subclass supplies the QVTo transformation and the directory holding its
 * models, and then declares one test method per case. Each happy-path case
 * confirms that the input model is well-formed, runs the transformation, and
 * compares the result against the expected output model. Each unhappy-path
 * case confirms that the transformation reports the expected error.
 */
@TestInstance(Lifecycle.PER_CLASS)
public abstract class TestTemplate {

    // ------------------------------------------------------------------
    // Supplied by the subclass
    // ------------------------------------------------------------------

    /** File name of the QVTo transformation under test. */
    protected abstract String qvtoFile();

    /** Directory of this phase within validation/trans-correctness. */
    protected abstract String phase();

    // ------------------------------------------------------------------
    // Derived locations
    // ------------------------------------------------------------------

    private Path qvto() {
        return ValidatorHelper.bundleRoot().getParent()
            .resolve("dact-to-lemma/transforms").resolve(qvtoFile());
    }

    private Path models() {
        return ValidatorHelper.bundleRoot().getParent()
            .resolve("validation/trans-correctness").resolve(phase());
    }

    protected Path input(String name)    { return models().resolve("input").resolve(name+".dact"); }
    protected Path expected(String name) { return models().resolve("output_expected").resolve(name+".dact"); }
    protected Path actual(String name)   { return models().resolve("output_generated").resolve(name+".generated.dact"); }

    // ------------------------------------------------------------------
    // Setup
    // ------------------------------------------------------------------

    /**
     * Clears the generated output directory before each test, so that a stale
     * result from an earlier run is never compared against the expected model.
     */
    @BeforeAll
    void prepareOutputDirectory() throws Exception {
        Path out = models().resolve("output_generated");
        if (Files.exists(out)) {
            try (var entries = Files.list(out)) {
                for (Path p : entries.toList()) {
                    Files.deleteIfExists(p);
                }
            }
        } else {
            Files.createDirectories(out);
        }
    }

    // ------------------------------------------------------------------
    // Shared assertions
    // ------------------------------------------------------------------

    /**
     * Runs the transformation on the named input model and compares the result
     * against the expected model of the same name. The input is validated
     * first, so that any discrepancy in the output is attributable to the
     * transformation rather than to a malformed input.
     */
    protected void assertStepProduces(String name) throws Exception {
        assertStepProduces(name, name);
    }

    /**
     * As above, where the output model is named differently from the input,
     * as when a phase produces a model of another kind.
     */
    protected void assertStepProduces(String inputName, String outputName)
            throws Exception {

        List<String> violations = ValidatorHelper.validate(input(inputName));
        assertTrue(violations.isEmpty(),
            "Input model is not well-formed: " + String.join("; ", violations));

        Diagnostic result = ValidatorHelper.transform(
            qvto(), actual(outputName), input(inputName));
        assertEquals(Diagnostic.OK, result.getSeverity(),
            "Transformation reported: " + result.getMessage());

        List<Diff> diffs = ValidatorHelper.compare(
            actual(outputName), expected(outputName));
        assertTrue(diffs.isEmpty(),
            "Unexpected differences:\n" + ValidatorHelper.describe(diffs));
    }

    /**
     * As above, for a transformation taking several input models. The inputs
     * are given in the order of the parameters of the transformation.
     */
    protected void assertStepProduces(String outputName, String... inputNames)
            throws Exception {

        Path[] inputs = new Path[inputNames.length];
        for (int i = 0; i < inputNames.length; i++) {
            inputs[i] = input(inputNames[i]);

            List<String> violations = ValidatorHelper.validate(inputs[i]);
            assertTrue(violations.isEmpty(),
                "Input model '" + inputNames[i] + "' is not well-formed: "
                    + String.join("; ", violations));
        }

        Diagnostic result = ValidatorHelper.transform(
            qvto(), actual(outputName), inputs);
        assertEquals(Diagnostic.OK, result.getSeverity(),
            "Transformation reported: " + result.getMessage());

        List<Diff> diffs = ValidatorHelper.compare(
            actual(outputName), expected(outputName));
      
        assertTrue(diffs.isEmpty(),
            "Unexpected differences:\n" + ValidatorHelper.describe(diffs));
    }

    /**
     * Runs the transformation on the named input model and confirms that it
     * reports an error containing the given fragment. The input is
     * well-formed; the failure arises from a condition the metamodel cannot
     * express.
     */
    protected void assertStepFails(String name, String expectedMessageFragment)
            throws Exception {

        List<String> violations = ValidatorHelper.validate(input(name));
        assertTrue(violations.isEmpty(),
            "Input model should be well-formed but reported: "
                + String.join("; ", violations));

        Diagnostic result = ValidatorHelper.transform(
            qvto(), actual(name), input(name));

        assertNotEquals(Diagnostic.OK, result.getSeverity(),
            "Transformation succeeded on invalid input");
        assertTrue(result.getMessage() != null
                && result.getMessage().contains(expectedMessageFragment),
            "Expected a message containing '" + expectedMessageFragment
                + "' but got: " + result.getMessage());
    }
}
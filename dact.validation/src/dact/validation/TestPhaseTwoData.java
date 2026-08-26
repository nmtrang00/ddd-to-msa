package dact.validation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Correctness tests for Phase 2: DACT to LEMMA
 */
@DisplayName("Phase 2.1: DACT DDD to LEMMA Data")
public class TestPhaseTwoData extends TestTemplate {

    @Override
    protected String qvtoFile() { return "DactToLemmaData.qvto"; }

    @Override
    protected String phase() { return "phase2"; }

    @Test
    @DisplayName("Main Transform")
    void validateTransform() throws Exception {
        assertStepProduces("cargo.simplified.ddd.dact");
    }
}
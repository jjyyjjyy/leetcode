package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class DistinctSubsequencesTest {

    private static final DistinctSubsequences DISTINCT_SUBSEQUENCES = new DistinctSubsequences();

    @ParameterizedTest
    @CsvSource({"rabbbit,rabbit,3", "babgbag,bag,5"})
    void numDistinct(String s, String t, int expect) {
        assertEquals(expect, DISTINCT_SUBSEQUENCES.numDistinct(s, t));
    }
}

package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class LongestRepeatingCharacterReplacementTest {

    private static final LongestRepeatingCharacterReplacement LONGEST_REPEATING_CHARACTER_REPLACEMENT = new LongestRepeatingCharacterReplacement();

    @ParameterizedTest
    @CsvSource({"ABAB,2,4", "AABABBA,1,4"})
    void characterReplacement(String s, int k, int expect) {
        assertEquals(expect, LONGEST_REPEATING_CHARACTER_REPLACEMENT.characterReplacement(s, k));
    }
}

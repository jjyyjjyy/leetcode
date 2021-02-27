package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class LongestSubstringWithAtLeastKRepeatingCharactersTest {

    private static final LongestSubstringWithAtLeastKRepeatingCharacters LONGEST_SUBSTRING_WITH_AT_LEAST_K_REPEATING_CHARACTERS = new LongestSubstringWithAtLeastKRepeatingCharacters();

    @ParameterizedTest
    @CsvSource({"aaabb,3,3", "ababbc,2,5"})
    void longestSubstring(String s, int k, int expect) {
        assertEquals(expect, LONGEST_SUBSTRING_WITH_AT_LEAST_K_REPEATING_CHARACTERS.longestSubstring(s, k));
    }
}

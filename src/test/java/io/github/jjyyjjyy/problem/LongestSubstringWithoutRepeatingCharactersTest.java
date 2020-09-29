package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class LongestSubstringWithoutRepeatingCharactersTest {

    private static final LongestSubstringWithoutRepeatingCharacters LONGEST_SUBSTRING_WITHOUT_REPEATING_CHARACTERS = new LongestSubstringWithoutRepeatingCharacters();

    @ParameterizedTest
    @CsvSource({"abcabcbb,3", "bbbbb,1", "pwwkew,3"})
    void lengthOfLongestSubstring(String s, int expect) {
        Assertions.assertEquals(expect, LONGEST_SUBSTRING_WITHOUT_REPEATING_CHARACTERS.lengthOfLongestSubstring(s));
    }
}

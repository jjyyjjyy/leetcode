package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class LongestPalindromicSubstringTest {

    private static final LongestPalindromicSubstring LONGEST_PALINDROMIC_SUBSTRING = new LongestPalindromicSubstring();

    @ParameterizedTest
    @CsvSource({"babad,bab", "cbbd,bb", "ac,a"})
    void longestPalindrome(String s, String expect) {
        assertEquals(expect, LONGEST_PALINDROMIC_SUBSTRING.longestPalindrome(s));
    }
}

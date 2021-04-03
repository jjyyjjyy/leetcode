package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class LongestCommonSubsequenceTest {

    private static final LongestCommonSubsequence LONGEST_COMMON_SUBSEQUENCE = new LongestCommonSubsequence();

    @ParameterizedTest
    @CsvSource({"abcde,ace,3", "abc,abc,3", "abc,def,0"})
    void longestCommonSubsequence(String text1, String text2, int expect) {
        assertEquals(expect, LONGEST_COMMON_SUBSEQUENCE.longestCommonSubsequence(text1, text2));
    }
}

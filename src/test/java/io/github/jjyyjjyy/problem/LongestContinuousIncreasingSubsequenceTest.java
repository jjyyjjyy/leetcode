package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class LongestContinuousIncreasingSubsequenceTest {

    private static final LongestContinuousIncreasingSubsequence LONGEST_CONTINUOUS_INCREASING_SUBSEQUENCE = new LongestContinuousIncreasingSubsequence();

    @ParameterizedTest
    @CsvSource({"'1,3,5,4,7',3", "'2,2,2,2,2',1", "'1,3,5,7',4"})
    void findLengthOfLCIS(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        assertEquals(expect, LONGEST_CONTINUOUS_INCREASING_SUBSEQUENCE.findLengthOfLCIS(nums));
    }
}

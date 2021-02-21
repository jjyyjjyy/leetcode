package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimitTest {

    private static final LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit LONGEST_CONTINUOUS_SUBARRAY_WITH_ABSOLUTE_DIFF_LESS_THAN_OR_EQUAL_TO_LIMIT = new LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit();

    @ParameterizedTest
    @CsvSource({"'8,2,4,7',4,2", "'10,1,2,4,7,2',5,4", "'4,2,2,2,4,4,2,2',0,3"})
    void longestSubarray(@ConvertWith(CsvToArray.class) int[] nums, int limit, int expect) {
        assertEquals(expect, LONGEST_CONTINUOUS_SUBARRAY_WITH_ABSOLUTE_DIFF_LESS_THAN_OR_EQUAL_TO_LIMIT.longestSubarray(nums, limit));
    }
}

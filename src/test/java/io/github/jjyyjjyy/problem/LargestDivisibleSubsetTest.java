package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class LargestDivisibleSubsetTest {

    private static final LargestDivisibleSubset LARGEST_DIVISIBLE_SUBSET = new LargestDivisibleSubset();

    @ParameterizedTest
    @CsvSource({"'1,2,4,8', '8,4,2,1'"})
    void largestDivisibleSubset(@ConvertWith(CsvToArray.class) int[] nums,
                                @ConvertWith(CsvToArray.class) int[] expect) {
        assertArrayEquals(expect, ArrayUtil.toIntArray(LARGEST_DIVISIBLE_SUBSET.largestDivisibleSubset(nums)));
    }
}

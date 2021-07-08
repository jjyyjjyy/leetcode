package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class BinarySubArraysWithSumTest {

    private static final BinarySubArraysWithSum BINARY_SUBARRAYS_WITH_SUM = new BinarySubArraysWithSum();

    @ParameterizedTest
    @CsvSource({"'1,0,1,0,1',2,4", "'0,0,0,0,0',0,15"})
    void numSubarraysWithSum(@ConvertWith(CsvToArray.class) int[] nums, int goal, int expect) {
        Assertions.assertEquals(expect, BINARY_SUBARRAYS_WITH_SUM.numSubarraysWithSum(nums, goal));
    }
}

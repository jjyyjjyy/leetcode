package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ContinuousSubarraySumTest {

    private static final ContinuousSubarraySum CONTINUOUS_SUBARRAY_SUM = new ContinuousSubarraySum();

    @ParameterizedTest
    @CsvSource({"'23,2,4,6,7',6,true", "'23,2,6,4,7',6,true", "'23,2,6,4,7',13,false"})
    void checkSubarraySum(@ConvertWith(CsvToArray.class) int[] nums, int k, boolean expect) {
        assertEquals(expect, CONTINUOUS_SUBARRAY_SUM.checkSubarraySum(nums, k));
    }
}

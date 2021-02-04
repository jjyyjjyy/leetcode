package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MaximumAverageSubarrayITest {

    private static final MaximumAverageSubarrayI MAXIMUM_AVERAGE_SUBARRAY_I = new MaximumAverageSubarrayI();

    @ParameterizedTest
    @CsvSource({"'1,12,-5,-6,50,3',4,12.75"})
    void findMaxAverage(@ConvertWith(CsvToArray.class) int[] nums, int k, double expect) {
        assertEquals(expect, MAXIMUM_AVERAGE_SUBARRAY_I.findMaxAverage(nums, k));
    }
}

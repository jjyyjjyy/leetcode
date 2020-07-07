package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MaximumSubarrayTest {

    private static final MaximumSubarray maximumSubarray = new MaximumSubarray();

    @ParameterizedTest
    @CsvSource({"'-2,1,-3,4,-1,2,1,-5,4',6"})
    void maxSubArray(@ConvertWith(CsvToArray.class) int[] param, int result) {
        assertEquals(result, maximumSubarray.maxSubArray(param));
    }
}

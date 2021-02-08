package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class LongestTurbulentSubarrayTest {

    private static final LongestTurbulentSubarray LONGEST_TURBULENT_SUBARRAY = new LongestTurbulentSubarray();

    @ParameterizedTest
    @CsvSource({"'9,4,2,10,7,8,8,1,9',5", "'4,8,12,16',2", "'100',1"})
    void maxTurbulenceSize(@ConvertWith(CsvToArray.class) int[] arr, int expect) {
        assertEquals(expect, LONGEST_TURBULENT_SUBARRAY.maxTurbulenceSize(arr));
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MaximumElementAfterDecreasingAndRearrangingTest {

    private static final MaximumElementAfterDecreasingAndRearranging MAXIMUM_ELEMENT_AFTER_DECREASING_AND_REARRANGING = new MaximumElementAfterDecreasingAndRearranging();

    @ParameterizedTest
    @CsvSource({"'2,2,1,2,1',2", "'100,1,1000',3"})
    void maximumElementAfterDecrementingAndRearranging(@ConvertWith(CsvToArray.class) int[] arr, int expect) {
        assertEquals(expect, MAXIMUM_ELEMENT_AFTER_DECREASING_AND_REARRANGING.maximumElementAfterDecrementingAndRearranging(arr));
    }
}

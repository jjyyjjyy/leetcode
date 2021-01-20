package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MaximumProductOfThreeNumbersTest {

    private static final MaximumProductOfThreeNumbers MAXIMUM_PRODUCT_OF_THREE_NUMBERS = new MaximumProductOfThreeNumbers();

    @ParameterizedTest
    @CsvSource({"'1,2,3',6", "'1,2,3,4',24", "'-100,-98,-1,2,3,4',39200"})
    void maximumProduct(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        assertEquals(expect, MAXIMUM_PRODUCT_OF_THREE_NUMBERS.maximumProduct(nums));
    }
}

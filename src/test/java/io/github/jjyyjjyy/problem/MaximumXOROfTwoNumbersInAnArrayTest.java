package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MaximumXOROfTwoNumbersInAnArrayTest {

    private static final MaximumXOROfTwoNumbersInAnArray MAXIMUM_XOR_OF_TWO_NUMBERS_IN_AN_ARRAY = new MaximumXOROfTwoNumbersInAnArray();

    @ParameterizedTest
    @CsvSource({"'3,10,5,25,2,8',28", "'0',0", "'2,4',6", "'8,10,2',10", "'14,70,53,83,49,91,36,80,92,51,66,70',127"})
    void findMaximumXOR(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        assertEquals(expect, MAXIMUM_XOR_OF_TWO_NUMBERS_IN_AN_ARRAY.findMaximumXOR(nums));
    }
}

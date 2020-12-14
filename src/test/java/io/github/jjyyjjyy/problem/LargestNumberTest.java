package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class LargestNumberTest {

    private static final LargestNumber LARGEST_NUMBER = new LargestNumber();

    @ParameterizedTest
    @CsvSource({"'10,2',210", "'3,30,34,5,9',9534330", "'1',1", "'10',10"})
    void largestNumber(@ConvertWith(CsvToArray.class) int[] nums, String expect) {
        assertEquals(expect, LARGEST_NUMBER.largestNumber(nums));
    }
}

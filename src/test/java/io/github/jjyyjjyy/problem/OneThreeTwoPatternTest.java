package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class OneThreeTwoPatternTest {

    private static final OneThreeTwoPattern ONE_THREE_TWO_PATTERN = new OneThreeTwoPattern();

    @ParameterizedTest
    @CsvSource({"'1,2,3,4',false", "'3,1,4,2',true", "'-1,3,2,0',true", "'1,0,1,-4,-3',false", "'3,5,0,3,4',true"})
    void find132pattern(@ConvertWith(CsvToArray.class) int[] nums, boolean expect) {
        assertEquals(expect, ONE_THREE_TWO_PATTERN.find132pattern(nums));
    }
}

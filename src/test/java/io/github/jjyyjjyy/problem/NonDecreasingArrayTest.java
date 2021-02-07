package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class NonDecreasingArrayTest {

    private static final NonDecreasingArray NON_DECREASING_ARRAY = new NonDecreasingArray();

    @ParameterizedTest
    @CsvSource({"'4,2,3',true", "'4,2,1',false", "'3,4,2,3',false", "'5,7,1,8',true"})
    void checkPossibility(@ConvertWith(CsvToArray.class) int[] nums, boolean expect) {
        Assertions.assertEquals(expect, NON_DECREASING_ARRAY.checkPossibility(nums));
    }
}

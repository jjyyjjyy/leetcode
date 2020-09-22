package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class SingleNumberTest {

    private static final SingleNumber SINGLE_NUMBER = new SingleNumber();

    @ParameterizedTest
    @CsvSource({"'2,2,1',1", "'4,1,2,1,2',4"})
    void singleNumber(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        Assertions.assertEquals(expect, SINGLE_NUMBER.singleNumber(nums));
    }
}

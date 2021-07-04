package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class SetMismatchTest {

    private static final SetMismatch SET_MISMATCH = new SetMismatch();

    @ParameterizedTest
    @CsvSource({"'1,2,2,4','2,3'", "'1,1','1,2'"})
    void findErrorNums(@ConvertWith(CsvToArray.class) int[] nums, @ConvertWith(CsvToArray.class) int[] expect) {
        assertArrayEquals(expect, SET_MISMATCH.findErrorNums(nums));
    }
}

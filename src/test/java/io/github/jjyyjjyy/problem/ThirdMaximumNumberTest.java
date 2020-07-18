package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ThirdMaximumNumberTest {

    private static final ThirdMaximumNumber THIRD_MAXIMUM_NUMBER = new ThirdMaximumNumber();

    @ParameterizedTest
    @CsvSource({"'3,2,1',1", "'1,2',2", "'2,2,3,1',1"})
    void thirdMax(@ConvertWith(CsvToArray.class) int[] arr, int expect) {
        assertEquals(expect, THIRD_MAXIMUM_NUMBER.thirdMax(arr));
    }
}

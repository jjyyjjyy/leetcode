package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class PlusOneTest {

    private PlusOne plusOne = new PlusOne();

    @ParameterizedTest
    @CsvSource({"'1,2,3','1,2,4'", "'4,3,2,1','4,3,2,2'", "'4,9','5,0'", "'9,9','1,0,0'"})
    void plusOne(@ConvertWith(CsvToArray.class) int[] param,
                 @ConvertWith(CsvToArray.class) int[] result) {
        assertArrayEquals(result, plusOne.plusOne(param));
    }
}

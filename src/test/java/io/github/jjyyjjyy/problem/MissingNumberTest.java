package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MissingNumberTest {

    private static final MissingNumber MISSING_NUMBER = new MissingNumber();

    @ParameterizedTest
    @CsvSource({"'3,0,1',2", "'9,6,4,2,3,5,7,0,1',8"})
    void missingNumber(@ConvertWith(CsvToArray.class) int[] arr, int expect) {
        assertEquals(expect, MISSING_NUMBER.missingNumber(arr));
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class RotateArrayTest {

    private static final RotateArray ROTATE_ARRAY = new RotateArray();

    @ParameterizedTest
    @CsvSource({"'1,2,3,4,5,6,7',3,'5,6,7,1,2,3,4'", "'-1,-100,3,99',2,'3,99,-1,-100'", "'-1',2,'-1'", "'1,2',3,'2,1'"})
    void rotate(@ConvertWith(CsvToArray.class) int[] arr,
                int k,
                @ConvertWith(CsvToArray.class) int[] expect) {
        ROTATE_ARRAY.rotate(arr, k);
        Assertions.assertArrayEquals(expect, arr);
    }
}

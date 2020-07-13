package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

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
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, arr.length);
        ROTATE_ARRAY.rotate(arr1, k);
        ROTATE_ARRAY.rotate2(arr2, k);
        ROTATE_ARRAY.rotate3(arr3, k);
        Assertions.assertArrayEquals(expect, arr1);
        Assertions.assertArrayEquals(expect, arr2);
        Assertions.assertArrayEquals(expect, arr3);
    }
}

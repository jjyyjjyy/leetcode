package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class RotateImageTest {

    private static final RotateImage ROTATE_IMAGE = new RotateImage();

    @ParameterizedTest
    @CsvSource({"'[1,2,3],[4,5,6],[7,8,9]','[7,4,1],[8,5,2],[9,6,3]'"})
    void rotate(@ConvertWith(CsvToArray.class) int[][] arr,
                @ConvertWith(CsvToArray.class) int[][] expect) {
        ROTATE_IMAGE.rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            Assertions.assertArrayEquals(expect[i], arr[i]);
        }
    }
}

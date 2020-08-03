package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class SpiralMatrixTest {

    private static final SpiralMatrix SPIRAL_MATRIX = new SpiralMatrix();

    @ParameterizedTest
    @CsvSource({"'[1,2,3],[4,5,6],[7,8,9]','1,2,3,6,9,8,7,4,5'", "'[7],[9],[6]','7,9,6'"})
    void spiralOrder(@ConvertWith(CsvToArray.class) int[][] arr,
                     @ConvertWith(CsvToArray.class) int[] expect) {
        Assertions.assertArrayEquals(expect, ArrayUtil.toIntArray(SPIRAL_MATRIX.spiralOrder(arr)));
    }
}

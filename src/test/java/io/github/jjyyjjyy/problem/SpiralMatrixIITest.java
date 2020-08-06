package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class SpiralMatrixIITest {

    private static final SpiralMatrixII SPIRAL_MATRIX_II = new SpiralMatrixII();

    @ParameterizedTest
    @CsvSource({"3,'[1,2,3],[8,9,4],[7,6,5]'"})
    void generateMatrix(int n, @ConvertWith(CsvToArray.class) int[][] expect) {
        int[][] matrix = SPIRAL_MATRIX_II.generateMatrix(n);
        for (int i = 0; i < expect.length; i++) {
            Assertions.assertArrayEquals(expect[i], matrix[i]);
        }
    }
}

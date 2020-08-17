package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class SetMatrixZeroesTest {

    private static final SetMatrixZeroes SET_MATRIX_ZEROES = new SetMatrixZeroes();

    @ParameterizedTest
    @CsvSource({"'[1,1,1],[1,0,1],[1,1,1]','[1,0,1],[0,0,0],[1,0,1]'", "'[0,1,2,0],[3,4,5,2],[1,3,1,5]','[0,0,0,0],[0,4,5,0],[0,3,1,0]'"})
    void setZeroes(@ConvertWith(CsvToArray.class) int[][] matrix,
                   @ConvertWith(CsvToArray.class) int[][] expect) {
        SET_MATRIX_ZEROES.setZeroes(matrix);
        for (int i = 0; i < expect.length; i++) {
            Assertions.assertArrayEquals(matrix[i], expect[i]);
        }
    }
}

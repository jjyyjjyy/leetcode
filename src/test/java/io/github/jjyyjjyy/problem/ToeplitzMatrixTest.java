package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ToeplitzMatrixTest {

    private static final ToeplitzMatrix TOEPLITZ_MATRIX = new ToeplitzMatrix();

    @ParameterizedTest
    @CsvSource({"'[1,2,3,4],[5,1,2,3],[9,5,1,2]',true", "'[1,2],[2,2]',false"})
    void isToeplitzMatrix(@ConvertWith(CsvToArray.class) int[][] matrix, boolean expect) {
        assertEquals(expect, TOEPLITZ_MATRIX.isToeplitzMatrix(matrix));
    }
}

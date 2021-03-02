package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class NumMatrixTest {

    @ParameterizedTest
    @CsvSource({"'[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]','[2,1,4,3,8],[1,1,2,2,11],[1,2,2,4,12]'"})
    void sumRegion(@ConvertWith(CsvToArray.class) int[][] matrix,
                   @ConvertWith(CsvToArray.class) int[][] cases) {
        NumMatrix numMatrix = new NumMatrix(matrix);
        for (int[] c : cases) {
            assertEquals(c[4], numMatrix.sumRegion(c[0], c[1], c[2], c[3]));
        }
    }
}

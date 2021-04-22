package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MaxSumOfRectangleNoLargerThanKTest {

    private static final MaxSumOfRectangleNoLargerThanK MAX_SUM_OF_RECTANGLE_NO_LARGER_THAN_K = new MaxSumOfRectangleNoLargerThanK();

    @ParameterizedTest
    @CsvSource({"'[1,0,1],[0,-2,3]',2,2", "'[2,2,-1]',3,3"})
    void maxSumSubmatrix(@ConvertWith(CsvToArray.class) int[][] matrix, int k, int expect) {
        assertEquals(expect, MAX_SUM_OF_RECTANGLE_NO_LARGER_THAN_K.maxSumSubmatrix(matrix, k));
    }
}

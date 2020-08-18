package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class Search2DMatrixTest {

    private static final Search2DMatrix SEARCH_2_D_MATRIX = new Search2DMatrix();

    @ParameterizedTest
    @CsvSource({"'[[1,3,5,7],[10,11,16,20],[23,30,34,50]]',3,true",
        "'[1,3,5,7],[10,11,16,20],[23,30,34,50]',13,false",
        "'[1]',0,false",
        "'[1,1]',2,false",
        "'[]',1,false",
        "'[1,3,5,7],[10,11,16,20],[23,30,34,50]',10,true"})
    void searchMatrix(@ConvertWith(CsvToArray.class) int[][] matrix, int target, boolean expect) {
        Assertions.assertEquals(expect, SEARCH_2_D_MATRIX.searchMatrix(matrix, target));
    }
}

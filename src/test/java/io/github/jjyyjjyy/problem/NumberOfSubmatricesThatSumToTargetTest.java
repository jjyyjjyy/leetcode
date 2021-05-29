package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class NumberOfSubmatricesThatSumToTargetTest {

    private static final NumberOfSubmatricesThatSumToTarget NUMBER_OF_SUBMATRICES_THAT_SUM_TO_TARGET = new NumberOfSubmatricesThatSumToTarget();

    @ParameterizedTest
    @CsvSource({"'[0,1,0],[1,1,1],[0,1,0]',0,4", "'[1,-1],[-1,1]',0,5", "'[904]',0,0"})
    void numSubmatrixSumTarget(@ConvertWith(CsvToArray.class) int[][] matrix, int target, int expect) {
        Assertions.assertEquals(expect, NUMBER_OF_SUBMATRICES_THAT_SUM_TO_TARGET.numSubmatrixSumTarget(matrix, target));
    }
}

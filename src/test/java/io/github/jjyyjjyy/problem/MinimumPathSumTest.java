package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class MinimumPathSumTest {

    private static final MinimumPathSum MINIMUM_PATH_SUM = new MinimumPathSum();

    @ParameterizedTest
    @CsvSource({"'[1,3,1],[1,5,1],[4,2,1]',7", "'[0]',0", "'[1,2,5],[3,2,1]',6", "'[9,1,4,8]',22"})
    void minPathSum(@ConvertWith(CsvToArray.class) int[][] arr, int expect) {
        Assertions.assertEquals(expect, MINIMUM_PATH_SUM.minPathSum(arr));
    }
}

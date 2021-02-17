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
class ReshapeTheMatrixTest {

    private static final ReshapeTheMatrix RESHAPE_THE_MATRIX = new ReshapeTheMatrix();

    @ParameterizedTest
    @CsvSource({"'[1,2],[3,4]',1,4,'[1,2,3,4]'", "'[1,2],[3,4]',2,4,'[1,2],[3,4]'"})
    void matrixReshape(@ConvertWith(CsvToArray.class) int[][] nums, int r, int c,
                       @ConvertWith(CsvToArray.class) int[][] expect) {
        Assertions.assertTrue(ArrayUtil.isSame(RESHAPE_THE_MATRIX.matrixReshape(nums, r, c), expect));
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jy
 */
class TransposeMatrixTest {

    private static final TransposeMatrix TRANSPOSE_MATRIX = new TransposeMatrix();

    @ParameterizedTest
    @CsvSource({"'[1,2,3],[4,5,6],[7,8,9]','[1,4,7],[2,5,8],[3,6,9]'", "'[1,2,3],[4,5,6]','[1,4],[2,5],[3,6]'"})
    void transpose(@ConvertWith(CsvToArray.class) int[][] matrix,
                   @ConvertWith(CsvToArray.class) int[][] expect) {
        assertTrue(ArrayUtil.isSame(TRANSPOSE_MATRIX.transpose(matrix), expect));
    }
}

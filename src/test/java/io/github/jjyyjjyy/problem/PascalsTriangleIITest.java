package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static io.github.jjyyjjyy.util.ArrayUtil.toIntArray;

/**
 * @author jy
 */
class PascalsTriangleIITest {

    private static final PascalsTriangleII PASCALS_TRIANGLE_II = new PascalsTriangleII();

    @ParameterizedTest
    @CsvSource({"0,'1'", "3,'1,3,3,1'", "5,'1,5,10,10,5,1'"})
    void getRow(int row, @ConvertWith(CsvToArray.class) int[] expect) {
        Assertions.assertArrayEquals(expect, toIntArray(PASCALS_TRIANGLE_II.getRow(row)));
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class MaximumXorWithAnElementFromArrayTest {

    private static final MaximumXorWithAnElementFromArray MAXIMUM_XOR_WITH_AN_ELEMENT_FROM_ARRAY = new MaximumXorWithAnElementFromArray();

    @ParameterizedTest
    @CsvSource({"'0,1,2,3,4','[3,1],[1,3],[5,6]','3,3,7'", "'5,2,4,6,6,3','[12,4],[8,1],[6,3]','15,-1,5'"})
    void maximizeXor(@ConvertWith(CsvToArray.class) int[] nums,
                     @ConvertWith(CsvToArray.class) int[][] queries,
                     @ConvertWith(CsvToArray.class) int[] expect) {
        assertArrayEquals(expect, MAXIMUM_XOR_WITH_AN_ELEMENT_FROM_ARRAY.maximizeXor(nums, queries));
    }
}

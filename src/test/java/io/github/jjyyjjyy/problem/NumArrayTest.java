package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class NumArrayTest {

    @ParameterizedTest
    @CsvSource({"'-2,0,3,-5,2,-1','[0,2,1],[2,5,-1],[0,5,-3]'"})
    void sumRange(@ConvertWith(CsvToArray.class) int[] nums,
                  @ConvertWith(CsvToArray.class) int[][] cases) {
        NumArray numArray = new NumArray(nums);
        for (int[] c : cases) {
            Assertions.assertEquals(c[2], numArray.sumRange(c[0], c[1]));
        }
    }
}

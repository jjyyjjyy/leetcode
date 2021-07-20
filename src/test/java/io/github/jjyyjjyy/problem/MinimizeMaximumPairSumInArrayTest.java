package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MinimizeMaximumPairSumInArrayTest {

    private static final MinimizeMaximumPairSumInArray MINIMIZE_MAXIMUM_PAIR_SUM_IN_ARRAY = new MinimizeMaximumPairSumInArray();

    @ParameterizedTest
    @CsvSource({"'3,5,2,3',7", "'3,5,4,2,4,6',8"})
    void minPairSum(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        assertEquals(expect, MINIMIZE_MAXIMUM_PAIR_SUM_IN_ARRAY.minPairSum(nums));
    }
}

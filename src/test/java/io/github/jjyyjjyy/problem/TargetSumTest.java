package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class TargetSumTest {

    private static final TargetSum TARGET_SUM = new TargetSum();

    @ParameterizedTest
    @CsvSource({"'1,1,1,1,1',3,5", "'1',1,1"})
    void findTargetSumWays(@ConvertWith(CsvToArray.class) int[] nums, int target, int expect) {
        assertEquals(expect, TARGET_SUM.findTargetSumWays(nums, target));
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class CombinationSumIVTest {

    private static final CombinationSumIV COMBINATION_SUM_IV = new CombinationSumIV();

    @ParameterizedTest
    @CsvSource({"'1,2,3',4,7", "'9',3,0"})
    void combinationSum4(@ConvertWith(CsvToArray.class) int[] nums, int target, int expect) {
        assertEquals(expect, COMBINATION_SUM_IV.combinationSum4(nums, target));
    }
}

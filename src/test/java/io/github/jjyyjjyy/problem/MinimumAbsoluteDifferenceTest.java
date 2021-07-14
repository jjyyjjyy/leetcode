package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MinimumAbsoluteDifferenceTest {

    private static final MinimumAbsoluteDifference MINIMUM_ABSOLUTE_DIFFERENCE = new MinimumAbsoluteDifference();

    @ParameterizedTest
    @CsvSource({"'1,7,5','2,3,5',3", "'2,4,6,8,10','2,4,6,8,10',0", "'1,10,4,4,2,7','9,3,5,1,7,4',20"})
    void minAbsoluteSumDiff(@ConvertWith(CsvToArray.class) int[] nums1, @ConvertWith(CsvToArray.class) int[] nums2, int expect) {
        assertEquals(expect, MINIMUM_ABSOLUTE_DIFFERENCE.minAbsoluteSumDiff(nums1, nums2));
    }
}

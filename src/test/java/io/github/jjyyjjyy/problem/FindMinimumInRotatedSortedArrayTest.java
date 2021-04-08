package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class FindMinimumInRotatedSortedArrayTest {

    private static final FindMinimumInRotatedSortedArray FIND_MINIMUM_IN_ROTATED_SORTED_ARRAY = new FindMinimumInRotatedSortedArray();

    @ParameterizedTest
    @CsvSource({"'3,4,5,1,2',1", "'4,5,6,7,0,1,2',0", "'11,13,15,17',11"})
    void findMin(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        assertEquals(expect, FIND_MINIMUM_IN_ROTATED_SORTED_ARRAY.findMin(nums));
    }
}

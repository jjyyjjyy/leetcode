package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class FindMinimumInRotatedSortedArrayIITest {

    private static final FindMinimumInRotatedSortedArrayII FIND_MINIMUM_IN_ROTATED_SORTED_ARRAY_II = new FindMinimumInRotatedSortedArrayII();

    @ParameterizedTest
    @CsvSource({"'1,3,5',1", "'2,2,2,0,1',0"})
    void findMin(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        assertEquals(expect, FIND_MINIMUM_IN_ROTATED_SORTED_ARRAY_II.findMin(nums));
    }
}

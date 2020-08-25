package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class SearchInRotatedSortedArrayIITest {

    private static final SearchInRotatedSortedArrayII SEARCH_IN_ROTATED_SORTED_ARRAY_II = new SearchInRotatedSortedArrayII();

    @ParameterizedTest
    @CsvSource({"'2,5,6,0,0,1,2',0,true", "'2,5,6,0,0,1,2',3,false"})
    void search(@ConvertWith(CsvToArray.class) int[] nums, int target, boolean expect) {
        assertEquals(expect, SEARCH_IN_ROTATED_SORTED_ARRAY_II.search(nums, target));
    }
}

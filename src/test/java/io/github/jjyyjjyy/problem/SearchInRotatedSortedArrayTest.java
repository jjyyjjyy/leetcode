package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class SearchInRotatedSortedArrayTest {

    private static final SearchInRotatedSortedArray SEARCH_IN_ROTATED_SORTED_ARRAY = new SearchInRotatedSortedArray();

    @ParameterizedTest
    @CsvSource({"'4,5,6,7,0,1,2',0,4", "'4,5,6,7,0,1,2',3,-1", "'3,1',1,1"})
    void search(@ConvertWith(CsvToArray.class) int[] arr, int target, int expect) {
        Assertions.assertEquals(expect, SEARCH_IN_ROTATED_SORTED_ARRAY.search(arr, target));
    }
}

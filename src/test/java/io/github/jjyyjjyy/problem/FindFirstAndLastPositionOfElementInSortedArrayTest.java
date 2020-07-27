package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class FindFirstAndLastPositionOfElementInSortedArrayTest {

    private static final FindFirstAndLastPositionOfElementInSortedArray FIND_FIRST_AND_LAST_POSITION_OF_ELEMENT_IN_SORTED_ARRAY = new FindFirstAndLastPositionOfElementInSortedArray();

    @ParameterizedTest
    @CsvSource({"'5,7,7,8,8,10',8,'3,4'", "'5,7,7,8,8,10',6,'-1,-1'", "'1,3',1,'0,0'", "'5,7,7,8,8,10',8,'3,4'"})
    void searchRange(@ConvertWith(CsvToArray.class) int[] arr,
                     int target,
                     @ConvertWith(CsvToArray.class) int[] expect) {
        Assertions.assertArrayEquals(expect, FIND_FIRST_AND_LAST_POSITION_OF_ELEMENT_IN_SORTED_ARRAY.searchRange(arr, target));
    }
}

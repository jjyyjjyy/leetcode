package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class SearchInsertPositionTest {

    private static final SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

    @ParameterizedTest
    @CsvSource({"'1,3,5,6',5,2", "'1,3,5,6',2,1", "'1,3,5,6',7,4", "'1,3,5,6',0,0"})
    void searchInsert(@ConvertWith(CsvToArray.class) int[] param1, int param2, int result) {
        Assertions.assertEquals(result, searchInsertPosition.searchInsert(param1, param2));
    }
}

package io.github.jjyyjjyy.problem;


import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class RemoveDuplicatesFromSortedArrayTest {

    private static final RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @ParameterizedTest
    @CsvSource({"'1,1,2',2", "'0,0,1,1,1,2,2,3,3,4',5"})
    void testRemoveDuplicates(@ConvertWith(CsvToArray.class) int[] arr, int result) {
        Assertions.assertEquals(result, removeDuplicatesFromSortedArray.removeDuplicates(arr));
    }
}

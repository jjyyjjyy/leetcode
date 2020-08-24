package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class RemoveDuplicatesFromSortedArrayIITest {

    private static final RemoveDuplicatesFromSortedArrayII REMOVE_DUPLICATES_FROM_SORTED_ARRAY_II = new RemoveDuplicatesFromSortedArrayII();

    @ParameterizedTest
    @CsvSource({"'1,1,1,2,2,3',5,'1,1,2,2,3'", "'0,0,1,1,1,1,2,3,3',7,'0,0,1,1,2,3,3'", "'1,2,2',3,'1,2,2'"})
    void removeDuplicates(@ConvertWith(CsvToArray.class) int[] nums, int expect, @ConvertWith(CsvToArray.class) int[] expectArray) {
        Assertions.assertEquals(expect, REMOVE_DUPLICATES_FROM_SORTED_ARRAY_II.removeDuplicates(nums));
        for (int i = 0; i < expectArray.length; i++) {
            Assertions.assertEquals(nums[i], expectArray[i]);
        }
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class MedianOfTwoSortedArraysTest {

    private static final MedianOfTwoSortedArrays MEDIAN_OF_TWO_SORTED_ARRAYS = new MedianOfTwoSortedArrays();

    @ParameterizedTest
    @CsvSource({"'1,3','2',2", "'1,2','3,4',2.5", "'0,0','0,0',0", "'','1',1", "'2','',2"})
    void findMedianSortedArrays(@ConvertWith(CsvToArray.class) int[] nums1,
                                @ConvertWith(CsvToArray.class) int[] nums2,
                                double expect) {
        Assertions.assertEquals(expect, MEDIAN_OF_TWO_SORTED_ARRAYS.findMedianSortedArrays(nums1, nums2));
    }
}

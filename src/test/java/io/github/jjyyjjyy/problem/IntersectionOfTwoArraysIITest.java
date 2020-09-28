package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class IntersectionOfTwoArraysIITest {

    private static final IntersectionOfTwoArraysII INTERSECTION_OF_TWO_ARRAYS_II = new IntersectionOfTwoArraysII();

    @ParameterizedTest
    @CsvSource({"'1,2,2,1','2,2','2,2'", "'4,9,5','9,4,9,8,4','9,4'"})
    void intersect(@ConvertWith(CsvToArray.class) int[] nums1,
                   @ConvertWith(CsvToArray.class) int[] nums2,
                   @ConvertWith(CsvToArray.class) int[] expect) {
        Assertions.assertArrayEquals(expect, INTERSECTION_OF_TWO_ARRAYS_II.intersection(nums1, nums2));
    }
}

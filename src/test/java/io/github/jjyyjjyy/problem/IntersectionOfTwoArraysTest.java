package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class IntersectionOfTwoArraysTest {

    private static final IntersectionOfTwoArrays INTERSECTION_OF_TWO_ARRAYS = new IntersectionOfTwoArrays();

    @ParameterizedTest
    @CsvSource({"'1,2,2,1','2,2','2'", "'4,9,5', '9,4,9,8,4', '9,4'"})
    void intersection(@ConvertWith(CsvToArray.class) int[] nums1,
                      @ConvertWith(CsvToArray.class) int[] nums2,
                      @ConvertWith(CsvToArray.class) int[] expect) {
        assertArrayEquals(expect, INTERSECTION_OF_TWO_ARRAYS.intersection(nums1, nums2));
    }
}

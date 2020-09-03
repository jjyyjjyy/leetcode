package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class NextGreaterElementITest {

    private static final NextGreaterElementI NEXT_GREATER_ELEMENT_I = new NextGreaterElementI();

    @ParameterizedTest
    @CsvSource({"'4,1,2','1,3,4,2','-1,3,-1'", "'2,4', '1,2,3,4', '3,-1'"})
    void nextGreaterElement(@ConvertWith(CsvToArray.class) int[] nums1, @ConvertWith(CsvToArray.class) int[] nums2, @ConvertWith(CsvToArray.class) int[] expect) {
        Assertions.assertArrayEquals(expect, NEXT_GREATER_ELEMENT_I.nextGreaterElement(nums1, nums2));
    }
}

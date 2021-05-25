package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MakeTheXorOfAllSegmentsEqualToZeroTest {

    private static final MakeTheXorOfAllSegmentsEqualToZero MAKE_THE_XOR_OF_ALL_SEGMENTS_EQUAL_TO_ZERO = new MakeTheXorOfAllSegmentsEqualToZero();

    @ParameterizedTest
    @CsvSource({"'1,2,0,3,0',1,3", "'3,4,5,2,1,7,3,4,7',3,3", "'1,2,4,1,2,5,1,2,6',3,3"})
    void minChanges(@ConvertWith(CsvToArray.class) int[] nums, int k, int expect) {
        assertEquals(expect, MAKE_THE_XOR_OF_ALL_SEGMENTS_EQUAL_TO_ZERO.minChanges(nums, k));
    }
}

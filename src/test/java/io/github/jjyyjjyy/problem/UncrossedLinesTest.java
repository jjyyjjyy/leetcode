package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class UncrossedLinesTest {

    private static final UncrossedLines UNCROSSED_LINES = new UncrossedLines();

    @ParameterizedTest
    @CsvSource({"'1,4,2','1,2,4',2", "'2,5,1,2,5','10,5,2,1,5,2',3", "'1,3,7,1,7,5','1,9,2,5,1',2"})
    void maxUncrossedLines(@ConvertWith(CsvToArray.class) int[] nums1,
                           @ConvertWith(CsvToArray.class) int[] nums2,
                           int expect) {
        assertEquals(expect, UNCROSSED_LINES.maxUncrossedLines(nums1, nums2));
    }
}

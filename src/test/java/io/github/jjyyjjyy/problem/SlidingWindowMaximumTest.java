package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class SlidingWindowMaximumTest {

    private static final SlidingWindowMaximum SLIDING_WINDOW_MAXIMUM = new SlidingWindowMaximum();

    @ParameterizedTest
    @CsvSource({"'1,3,-1,-3,5,3,6,7',3,'3,3,5,5,6,7'", "'1',1,'1'", "'1,-1',1,'1,-1'", "'9,11',2,'11'", "'4,-2',2,'4'"})
    void maxSlidingWindow(@ConvertWith(CsvToArray.class) int[] nums,
                          int k,
                          @ConvertWith(CsvToArray.class) int[] expect) {
        assertArrayEquals(expect, SLIDING_WINDOW_MAXIMUM.maxSlidingWindow(nums, k));
    }
}

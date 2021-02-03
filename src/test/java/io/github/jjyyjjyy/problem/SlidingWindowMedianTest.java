package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class SlidingWindowMedianTest {

    private static final SlidingWindowMedian SLIDING_WINDOW_MEDIAN = new SlidingWindowMedian();

    @ParameterizedTest
    @CsvSource({"'1,3,-1,-3,5,3,6,7',3,'1,-1,-1,3,5,6'", "'1,2,3,4,2,3,1,4,2',3,'2.0,3.0,3.0,3.0,2.0,3.0,2.0'", "'-2147483648,-2147483648,2147483647,-2147483648,-2147483648,-2147483648,2147483647,2147483647,2147483647,2147483647,-2147483648,2147483647,-2147483648',3,'-2147483648.0,-2147483648.0,-2147483648.0,-2147483648.0,-2147483648.0,2147483647.0,2147483647.0,2147483647.0,2147483647.0,2147483647.0,-2147483648.0'"})
    void medianSlidingWindow(@ConvertWith(CsvToArray.class) int[] nums, int k, @ConvertWith(CsvToArray.class) double[] expect) {
        assertArrayEquals(expect, SLIDING_WINDOW_MEDIAN.medianSlidingWindow(nums, k));
    }
}

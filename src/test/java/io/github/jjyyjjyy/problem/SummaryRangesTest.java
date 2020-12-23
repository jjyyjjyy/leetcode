package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class SummaryRangesTest {

    private static final SummaryRanges SUMMARY_RANGES = new SummaryRanges();

    @ParameterizedTest
    @CsvSource({"'0,1,2,4,5,7','0->2,4->5,7'", "'0,2,3,4,6,8,9','0,2->4,6,8->9'"})
    void summaryRanges(@ConvertWith(CsvToArray.class) int[] nums,
                       @ConvertWith(CsvToArray.class) String[] expect) {
        Assertions.assertArrayEquals(expect, SUMMARY_RANGES.summaryRanges(nums).toArray(String[]::new));
    }
}

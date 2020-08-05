package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class MergeIntervalsTest {

    private static final MergeIntervals MERGE_INTERVALS = new MergeIntervals();

    @ParameterizedTest
    @CsvSource({"'[1,3],[2,6],[8,10],[15,18]','[1,6],[8,10],[15,18]'", "'[1,4],[4,5]','[1,5]'"})
    void merge(@ConvertWith(CsvToArray.class) int[][] arr,
               @ConvertWith(CsvToArray.class) int[][] expect) {
        int[][] result = MERGE_INTERVALS.merge(arr);
        for (int i = 0; i < expect.length; i++) {
            Assertions.assertArrayEquals(expect[i], result[i]);
        }
    }
}

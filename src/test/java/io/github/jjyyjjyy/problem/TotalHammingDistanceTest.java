package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class TotalHammingDistanceTest {

    private static final TotalHammingDistance TOTAL_HAMMING_DISTANCE = new TotalHammingDistance();

    @ParameterizedTest
    @CsvSource({"'4,14,2',6"})
    void totalHammingDistance(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        assertEquals(expect, TOTAL_HAMMING_DISTANCE.totalHammingDistance(nums));
    }
}

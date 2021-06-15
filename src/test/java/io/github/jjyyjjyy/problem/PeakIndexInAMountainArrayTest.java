package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class PeakIndexInAMountainArrayTest {

    private static final PeakIndexInAMountainArray PEAK_INDEX_IN_A_MOUNTAIN_ARRAY = new PeakIndexInAMountainArray();

    @ParameterizedTest
    @CsvSource({"'0,1,0',1", "'0,2,1,0',1", "'0,10,5,2',1", "'3,4,5,1',2", "'24,69,100,99,79,78,67,36,26,19',2"})
    void peakIndexInMountainArray(@ConvertWith(CsvToArray.class) int[] arr, int expect) {
        assertEquals(expect, PEAK_INDEX_IN_A_MOUNTAIN_ARRAY.peakIndexInMountainArray(arr));
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class SubarraysWithKDifferentIntegersTest {

    private static final SubarraysWithKDifferentIntegers SUBARRAYS_WITH_K_DIFFERENT_INTEGERS = new SubarraysWithKDifferentIntegers();

    @ParameterizedTest
    @CsvSource({"'1,2,1,2,3',2,7", "'1,2,1,3,4',3,3"})
    void subarraysWithKDistinct(@ConvertWith(CsvToArray.class) int[] A, int k, int expect) {
        assertEquals(expect, SUBARRAYS_WITH_K_DIFFERENT_INTEGERS.subarraysWithKDistinct(A, k));
    }
}

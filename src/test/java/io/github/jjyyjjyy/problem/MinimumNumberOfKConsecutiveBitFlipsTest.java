package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MinimumNumberOfKConsecutiveBitFlipsTest {

    private static final MinimumNumberOfKConsecutiveBitFlips MINIMUM_NUMBER_OF_K_CONSECUTIVE_BIT_FLIPS = new MinimumNumberOfKConsecutiveBitFlips();

    @ParameterizedTest
    @CsvSource({"'0,1,0',1,2", "'1,1,0',2,-1", "'0,0,0,1,0,1,1,0',3,3"})
    void minKBitFlips(@ConvertWith(CsvToArray.class) int[] A, int K, int expect) {
        assertEquals(expect, MINIMUM_NUMBER_OF_K_CONSECUTIVE_BIT_FLIPS.minKBitFlips(A, K));
    }
}

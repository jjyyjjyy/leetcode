package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MaxConsecutiveOnesIIITest {

    private static final MaxConsecutiveOnesIII MAX_CONSECUTIVE_ONES_III = new MaxConsecutiveOnesIII();

    @ParameterizedTest
    @CsvSource({"'1,1,1,0,0,0,1,1,1,1,0',2,6", "'0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1',3,10"})
    void longestOnes(@ConvertWith(CsvToArray.class) int[] A, int K, int expect) {
        assertEquals(expect, MAX_CONSECUTIVE_ONES_III.longestOnes(A, K));
    }
}

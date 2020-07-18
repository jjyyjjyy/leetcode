package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MaxConsecutiveOnesTest {

    private static final MaxConsecutiveOnes MAX_CONSECUTIVE_ONES = new MaxConsecutiveOnes();

    @ParameterizedTest
    @CsvSource({"'1,1,0,1,1,1',3"})
    void findMaxConsecutiveOnes(@ConvertWith(CsvToArray.class) int[] arr, int expect) {
        assertEquals(expect, MAX_CONSECUTIVE_ONES.findMaxConsecutiveOnes(arr));
    }

}

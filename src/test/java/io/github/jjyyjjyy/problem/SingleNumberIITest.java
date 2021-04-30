package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class SingleNumberIITest {

    private static final SingleNumberII SINGLE_NUMBER_II = new SingleNumberII();

    @ParameterizedTest
    @CsvSource({"'2,2,3,2',3", "'0,1,0,1,0,1,99',99"})
    void singleNumber(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        assertEquals(expect, SINGLE_NUMBER_II.singleNumber(nums));
    }
}

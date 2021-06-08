package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class LastStoneWeightIITest {

    private static final LastStoneWeightII LAST_STONE_WEIGHT_II = new LastStoneWeightII();

    @ParameterizedTest
    @CsvSource({"'2,7,4,1,8,1',1", "'31,26,33,21,40',5", "'1,2',1"})
    void lastStoneWeightII(@ConvertWith(CsvToArray.class) int[] stones, int expect) {
        assertEquals(expect, LAST_STONE_WEIGHT_II.lastStoneWeightII(stones));
    }
}

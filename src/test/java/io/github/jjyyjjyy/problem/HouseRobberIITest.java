package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class HouseRobberIITest {

    private static final HouseRobberII HOUSE_ROBBER_II = new HouseRobberII();

    @ParameterizedTest
    @CsvSource({"'2,3,2',3", "'1,2,3,1',4", "'0',0"})
    void rob(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        assertEquals(expect, HOUSE_ROBBER_II.rob(nums));
    }
}

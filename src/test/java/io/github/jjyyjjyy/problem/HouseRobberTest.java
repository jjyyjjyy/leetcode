package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class HouseRobberTest {

    private static final HouseRobber HOUSE_ROBBER = new HouseRobber();

    @ParameterizedTest
    @CsvSource({"'1,2,3,1',4", "'2,7,9,3,1',12"})
    void rob(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        assertEquals(expect, HOUSE_ROBBER.rob(nums));
    }
}

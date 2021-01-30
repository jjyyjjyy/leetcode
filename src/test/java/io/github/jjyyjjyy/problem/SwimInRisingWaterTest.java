package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class SwimInRisingWaterTest {

    private static final SwimInRisingWater SWIM_IN_RISING_WATER = new SwimInRisingWater();

    @ParameterizedTest
    @CsvSource({"'[0,2],[1,3]',3", "'[0,1,2,3,4],[24,23,22,21,5],[12,13,14,15,16],[11,17,18,19,20],[10,9,8,7,6]',16"})
    void swimInWater(@ConvertWith(CsvToArray.class) int[][] grid, int expect) {
        assertEquals(expect, SWIM_IN_RISING_WATER.swimInWater(grid));
    }
}

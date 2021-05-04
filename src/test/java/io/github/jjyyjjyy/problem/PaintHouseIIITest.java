package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class PaintHouseIIITest {

    private static final PaintHouseIII PAINT_HOUSE_III = new PaintHouseIII();

    @ParameterizedTest
    @CsvSource({"'0,0,0,0,0','[1,10],[10,1],[10,1],[1,10],[5,1]',5,2,3,9",
        "'0,2,1,2,0','[1,10],[10,1],[10,1],[1,10],[5,1]',5,2,3,11",
        "'0,0,0,0,0','[1,10],[10,1],[1,10],[10,1],[1,10]',5,2,5,5",
        "'3,1,2,3','[1,1,1],[1,1,1],[1,1,1],[1,1,1]',4,3,3,-1"})
    void minCost(@ConvertWith(CsvToArray.class) int[] houses,
                 @ConvertWith(CsvToArray.class) int[][] cost,
                 int m, int n, int target, int expect) {
        Assertions.assertEquals(expect, PAINT_HOUSE_III.minCost(houses, cost, m, n, target));
    }
}

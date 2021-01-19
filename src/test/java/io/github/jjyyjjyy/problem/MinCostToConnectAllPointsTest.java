package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class MinCostToConnectAllPointsTest {

    private static final MinCostToConnectAllPoints MIN_COST_TO_CONNECT_ALL_POINTS = new MinCostToConnectAllPoints();

    @ParameterizedTest
    @CsvSource({"'[0,0],[2,2],[3,10],[5,2],[7,0]',20", "'[3,12],[-2,5],[-4,1]',18", "'[0,0],[1,1],[1,0],[-1,1]',4", "'[-1000000,-1000000],[1000000,1000000]',4000000", "'[0,0]',0"})
    void minCostConnectPoints(@ConvertWith(CsvToArray.class) int[][] points, int expect) {
        Assertions.assertEquals(expect, MIN_COST_TO_CONNECT_ALL_POINTS.minCostConnectPoints(points));
    }
}

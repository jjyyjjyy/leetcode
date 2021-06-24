package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MaxPointsOnALineTest {

    private static final MaxPointsOnALine MAX_POINTS_ON_A_LINE = new MaxPointsOnALine();

    @ParameterizedTest
    @CsvSource({"'[1,1],[2,2],[3,3]',3", "'[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]',4"})
    void maxPoints(@ConvertWith(CsvToArray.class) int[][] points, int expect) {
        assertEquals(expect, MAX_POINTS_ON_A_LINE.maxPoints(points));
    }
}

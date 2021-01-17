package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class CheckIfItIsAStraightLineTest {

    private static final CheckIfItIsAStraightLine CHECK_IF_IT_IS_A_STRAIGHT_LINE = new CheckIfItIsAStraightLine();

    @ParameterizedTest
    @CsvSource({"'[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]',true", "'[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]',false", "'[0,0],[0,1],[0,-1]',true", "'[2,1],[4,2],[6,3]',true"})
    void checkStraightLine(@ConvertWith(CsvToArray.class) int[][] coordinates, boolean expect) {
        assertEquals(expect, CHECK_IF_IT_IS_A_STRAIGHT_LINE.checkStraightLine(coordinates));
    }
}

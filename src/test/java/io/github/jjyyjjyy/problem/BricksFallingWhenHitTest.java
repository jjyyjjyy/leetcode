package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class BricksFallingWhenHitTest {

    private static final BricksFallingWhenHit BRICKS_FALLING_WHEN_HIT = new BricksFallingWhenHit();

    @ParameterizedTest
    @CsvSource({"'[1,0,0,0],[1,1,1,0]','[1,0]','2'",
        "'[1,0,0,0],[1,1,0,0]','[1,1],[1,0]','0,0'",
        "'[[1,1,1],[0,1,0],[0,0,0]','[0,2],[2,0],[0,1],[1,2]','0,0,1,0'",
        "'[0,1,1,1,1],[1,1,1,1,0],[1,1,1,1,0],[0,0,1,1,0],[0,0,1,0,0],[0,0,1,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0]','[6,0],[1,0],[4,3],[1,2],[7,1],[6,3],[5,2],[5,1],[2,4],[4,4],[7,3]','0,0,0,0,0,0,0,0,0,0,0'"})
    void hitBricks(@ConvertWith(CsvToArray.class) int[][] grid,
                   @ConvertWith(CsvToArray.class) int[][] hits,
                   @ConvertWith(CsvToArray.class) int[] expect) {
        assertArrayEquals(expect, BRICKS_FALLING_WHEN_HIT.hitBricks(grid, hits));
    }
}

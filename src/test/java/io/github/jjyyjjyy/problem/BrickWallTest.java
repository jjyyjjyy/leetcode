package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class BrickWallTest {

    private static final BrickWall BRICK_WALL = new BrickWall();

    @ParameterizedTest
    @CsvSource({"'[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]',2", "'[1],[1],[1]',3"})
    void leastBricks(@ConvertWith(CsvToArray.class) Integer[][] wall, int expect) {
        assertEquals(expect, BRICK_WALL.leastBricks(ArrayUtil.toList(wall)));
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class PathWithMinimumEffortTest {

    private static final PathWithMinimumEffort PATH_WITH_MINIMUM_EFFORT = new PathWithMinimumEffort();

    @ParameterizedTest
    @CsvSource({"'[1,2,2],[3,8,2],[5,3,5]',2", "'[1,2,3],[3,8,4],[5,3,5]',1", "'[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]',0"})
    void minimumEffortPath(@ConvertWith(CsvToArray.class) int[][] heights, int expect) {
        assertEquals(expect, PATH_WITH_MINIMUM_EFFORT.minimumEffortPath(heights));
    }
}

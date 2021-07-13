package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jy
 */
class TheSkylineProblemTest {

    private static final TheSkylineProblem THE_SKYLINE_PROBLEM = new TheSkylineProblem();

    @ParameterizedTest
    @CsvSource({"'[0,2,3],[2,5,3]','[0,3],[5,0]'"})
    void getSkyline(@ConvertWith(CsvToArray.class) int[][] buildings,
                    @ConvertWith(CsvToArray.class) int[][] expect) {
        assertTrue(ArrayUtil.isSame(expect, ArrayUtil.toIntArrays(THE_SKYLINE_PROBLEM.getSkyline(buildings))));
    }
}

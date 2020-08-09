package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class UniquePathsIITest {

    private static final UniquePathsII UNIQUE_PATHS_II = new UniquePathsII();

    @ParameterizedTest
    @CsvSource({"'[0,0,0],[0,1,0],[0,0,0]',2"})
    void uniquePathsWithObstacles(@ConvertWith(CsvToArray.class) int[][] arr, int expect) {
        assertEquals(expect, UNIQUE_PATHS_II.uniquePathsWithObstacles(arr));
    }

}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class RestoreTheArrayFromAdjacentPairsTest {

    private static final RestoreTheArrayFromAdjacentPairs RESTORE_THE_ARRAY_FROM_ADJACENT_PAIRS = new RestoreTheArrayFromAdjacentPairs();

    @ParameterizedTest
    @CsvSource({"'[2,1],[3,4],[3,2]','1,2,3,4'", "'[4,-2],[1,4],[-3,1]','-2,4,1,-3'", "'[100000,-100000]','100000,-100000'"})
    void restoreArray(@ConvertWith(CsvToArray.class) int[][] adjacentPairs, @ConvertWith(CsvToArray.class) int[] expect) {
        assertArrayEquals(expect, RESTORE_THE_ARRAY_FROM_ADJACENT_PAIRS.restoreArray(adjacentPairs));
    }
}

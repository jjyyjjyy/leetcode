package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MostStonesRemovedWithSameRowOrColumnTest {

    private static final MostStonesRemovedWithSameRowOrColumn MOST_STONES_REMOVED_WITH_SAME_ROW_OR_COLUMN = new MostStonesRemovedWithSameRowOrColumn();

    @ParameterizedTest
    @CsvSource({"'[0,0],[0,1],[1,0],[1,2],[2,1],[2,2]',5", "'[0,0],[0,2],[1,1],[2,0],[2,2]',3", "'[0,0]',0"})
    void removeStones(@ConvertWith(CsvToArray.class) int[][] stones, int expect) {
        assertEquals(expect, MOST_STONES_REMOVED_WITH_SAME_ROW_OR_COLUMN.removeStones(stones));
    }
}

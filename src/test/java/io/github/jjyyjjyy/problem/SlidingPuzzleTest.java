package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class SlidingPuzzleTest {

    private static final SlidingPuzzle SLIDING_PUZZLE = new SlidingPuzzle();

    @ParameterizedTest
    @CsvSource({"'[1,2,3],[4,0,5]',1", "'[1,2,3],[5,4,0]',-1", "'[4,1,2],[5,0,3]',5", "'[3,2,4],[1,5,0]',14"})
    void slidingPuzzle(@ConvertWith(CsvToArray.class) int[][] board, int expect) {
        assertEquals(expect, SLIDING_PUZZLE.slidingPuzzle(board));
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class SnakesAndLaddersTest {

    private static final SnakesAndLadders SNAKES_AND_LADDERS = new SnakesAndLadders();

    @ParameterizedTest
    @CsvSource({"'[-1,-1,-1,-1,-1,-1],[-1,-1,-1,-1,-1,-1],[-1,-1,-1,-1,-1,-1],[-1,35,-1,-1,13,-1],[-1,-1,-1,-1,-1,-1],[-1,15,-1,-1,-1,-1]',4"})
    void snakesAndLadders(@ConvertWith(CsvToArray.class) int[][] board, int expect) {
        assertEquals(expect, SNAKES_AND_LADDERS.snakesAndLadders(board));
    }
}

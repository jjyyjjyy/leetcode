package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class StoneGameTest {

    private static final StoneGame STONE_GAME = new StoneGame();

    @ParameterizedTest
    @CsvSource({"'5,3,4,5',true"})
    void stoneGame(@ConvertWith(CsvToArray.class) int[] piles, boolean expect) {
        assertEquals(expect, STONE_GAME.stoneGame(piles));
    }
}

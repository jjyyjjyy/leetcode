package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class ChalkboardXORGameTest {

    private static final ChalkboardXORGame CHALKBOARD_XOR_GAME = new ChalkboardXORGame();

    @ParameterizedTest
    @CsvSource({"'1,1,2',false"})
    void xorGame(@ConvertWith(CsvToArray.class) int[] nums, boolean expect) {
        Assertions.assertEquals(expect, CHALKBOARD_XOR_GAME.xorGame(nums));
    }
}

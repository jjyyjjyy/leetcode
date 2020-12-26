package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class NimGameTest {

    private static final NimGame NIM_GAME = new NimGame();

    @ParameterizedTest
    @CsvSource({"4,false", "2,true", "1,true"})
    void canWinNim(int n, boolean expect) {
        assertEquals(expect, NIM_GAME.canWinNim(n));
    }
}

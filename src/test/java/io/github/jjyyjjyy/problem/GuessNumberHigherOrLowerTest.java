package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class GuessNumberHigherOrLowerTest {

    @ParameterizedTest
    @CsvSource({"10,6,6", "1,1,1", "2,1,1", "2,2,2"})
    void guessNumber(int n, int pick, int expect) {
        GuessNumberHigherOrLower instance = new GuessNumberHigherOrLower(pick);
        assertEquals(expect, instance.guessNumber(n));
    }
}

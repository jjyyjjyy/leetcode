package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class PerfectSquaresTest {

    private static final PerfectSquares PERFECT_SQUARES = new PerfectSquares();

    @ParameterizedTest
    @CsvSource({"12,3", "13,2"})
    void numSquares(int n, int expect) {
        assertEquals(expect, PERFECT_SQUARES.numSquares(n));
    }
}

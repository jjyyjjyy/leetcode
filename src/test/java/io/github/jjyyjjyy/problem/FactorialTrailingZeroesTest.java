package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class FactorialTrailingZeroesTest {

    private static final FactorialTrailingZeroes FACTORIAL_TRAILING_ZEROES = new FactorialTrailingZeroes();

    @ParameterizedTest
    @CsvSource({"3,0", "5,1"})
    void trailingZeroes(int n, int expect) {
        assertEquals(expect, FACTORIAL_TRAILING_ZEROES.trailingZeroes(n));
    }
}

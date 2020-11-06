package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ValidPerfectSquareTest {

    private static final ValidPerfectSquare VALID_PERFECT_SQUARE = new ValidPerfectSquare();

    @ParameterizedTest
    @CsvSource({"16,true", "14,false", "1,true", "808201,true"})
    void isPerfectSquare(int num, boolean expect) {
        assertEquals(expect, VALID_PERFECT_SQUARE.isPerfectSquare(num));
    }
}

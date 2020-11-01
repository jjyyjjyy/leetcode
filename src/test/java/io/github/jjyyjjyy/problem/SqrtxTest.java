package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class SqrtxTest {

    private static final Sqrtx SQRTX = new Sqrtx();

    @ParameterizedTest
    @CsvSource({"4,2", "8,2"})
    void mySqrt(int x, int expect) {
        assertEquals(expect, SQRTX.mySqrt(x));
    }
}

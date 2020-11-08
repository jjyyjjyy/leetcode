package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class DivideTwoIntegersTest {

    private static final DivideTwoIntegers DIVIDE_TWO_INTEGERS = new DivideTwoIntegers();

    @ParameterizedTest
    @CsvSource({"10,3,3", "7,-3,-2"})
    void divide(int dividend, int divisor, int expect) {
        assertEquals(expect, DIVIDE_TWO_INTEGERS.divide(dividend, divisor));
    }
}

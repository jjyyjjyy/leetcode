package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class BasicCalculatorIITest {

    private static final BasicCalculatorII BASIC_CALCULATOR_II = new BasicCalculatorII();

    @ParameterizedTest
    @CsvSource({"3+2*2,7", "' 3/2 ',1", "' 3+5 / 2 ',5"})
    void calculate(String s, int expect) {
        assertEquals(expect, BASIC_CALCULATOR_II.calculate(s));
    }
}

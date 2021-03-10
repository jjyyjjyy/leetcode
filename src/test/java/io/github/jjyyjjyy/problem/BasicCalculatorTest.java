package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class BasicCalculatorTest {

    private static final BasicCalculator BASIC_CALCULATOR = new BasicCalculator();

    @ParameterizedTest
    @CsvSource({"1 + 1,2", " 2-1 + 2 ,3", "(1+(4+5+2)-3)+(6+8),23", "2147483647,2147483647", "-2+ 1,-1"})
    void calculate(String s, int expect) {
        assertEquals(expect, BASIC_CALCULATOR.calculate(s));
    }
}

package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class SumOfSquareNumbersTest {

    private static final SumOfSquareNumbers SUM_OF_SQUARE_NUMBERS = new SumOfSquareNumbers();

    @ParameterizedTest
    @CsvSource({"5,true", "3,false", "4,true", "2,true", "1,true"})
    void judgeSquareSum(int c, boolean expect) {
        assertEquals(expect, SUM_OF_SQUARE_NUMBERS.judgeSquareSum(c));
    }
}

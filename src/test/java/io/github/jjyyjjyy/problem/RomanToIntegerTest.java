package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class RomanToIntegerTest {

    private static final RomanToInteger ROMAN_TO_INTEGER = new RomanToInteger();

    @ParameterizedTest
    @CsvSource({"III,3", "IV,4", "IX,9", "LVIII,58", "MCMXCIV,1994"})
    void romanToInt(String s, int expect) {
        assertEquals(expect, ROMAN_TO_INTEGER.romanToInt(s));
    }
}

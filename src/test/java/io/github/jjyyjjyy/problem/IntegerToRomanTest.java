package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class IntegerToRomanTest {

    private static final IntegerToRoman INTEGER_TO_ROMAN = new IntegerToRoman();

    @ParameterizedTest
    @CsvSource({"3,III", "4, IV", "9,IX", "58,LVIII", "1994,MCMXCIV"})
    void intToRoman(int num, String expect) {
        Assertions.assertEquals(expect, INTEGER_TO_ROMAN.intToRoman(num));
    }
}

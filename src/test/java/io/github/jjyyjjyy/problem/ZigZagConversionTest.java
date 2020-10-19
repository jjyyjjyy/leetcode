package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ZigZagConversionTest {

    private static final ZigZagConversion ZIG_ZAG_CONVERSION = new ZigZagConversion();

    @ParameterizedTest
    @CsvSource({"LEETCODEISHIRING,3,LCIRETOESIIGEDHN", "LEETCODEISHIRING,4,LDREOEIIECIHNTSG"})
    void convert(String s, int numRows, String expect) {
        assertEquals(expect, ZIG_ZAG_CONVERSION.convert(s, numRows));
    }
}

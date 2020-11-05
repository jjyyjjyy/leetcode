package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class UglyNumberTest {

    private static final UglyNumber UGLY_NUMBER = new UglyNumber();

    @ParameterizedTest
    @CsvSource({"6,true", "8,true", "14,false"})
    void isUgly(int num, boolean expect) {
        assertEquals(expect, UGLY_NUMBER.isUgly(num));
    }
}

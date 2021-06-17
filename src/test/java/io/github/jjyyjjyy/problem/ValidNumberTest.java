package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ValidNumberTest {

    private static final ValidNumber VALID_NUMBER = new ValidNumber();

    @ParameterizedTest
    @CsvSource({"0,true", "e,false", ".,false", ".1,true"})
    void isNumber(String s, boolean expect) {
        assertEquals(expect, VALID_NUMBER.isNumber(s));
    }
}

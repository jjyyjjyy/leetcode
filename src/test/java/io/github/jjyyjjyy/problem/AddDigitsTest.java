package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class AddDigitsTest {

    private static final AddDigits ADD_DIGITS = new AddDigits();

    @ParameterizedTest
    @CsvSource({"38,2"})
    void addDigits(int num, int expect) {
        assertEquals(expect, ADD_DIGITS.addDigits(num));
    }
}

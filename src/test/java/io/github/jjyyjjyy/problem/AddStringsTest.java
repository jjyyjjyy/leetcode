package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class AddStringsTest {

    private static final AddStrings ADD_STRINGS = new AddStrings();

    @ParameterizedTest
    @CsvSource({"1,2,3", "11,10,21"})
    void addStrings(String num1, String num2, String expect) {
        assertEquals(expect, ADD_STRINGS.addStrings(num1, num2));
    }
}

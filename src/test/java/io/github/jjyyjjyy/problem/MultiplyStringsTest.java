package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class MultiplyStringsTest {

    private static final MultiplyStrings MULTIPLY_STRINGS = new MultiplyStrings();

    @ParameterizedTest
    @CsvSource({"2,3,6", "123,456,56088", "9133,0,0"})
    void multiply(String num1, String num2, String expect) {
        Assertions.assertEquals(expect, MULTIPLY_STRINGS.multiply(num1, num2));
    }
}

package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ReverseIntegerTest {

    private static final ReverseInteger REVERSE_INTEGER = new ReverseInteger();

    @ParameterizedTest
    @CsvSource({"123,321", "-123,-321", "120,21"})
    void reverse(int x, int expect) {
        assertEquals(expect, REVERSE_INTEGER.reverse(x));
    }
}

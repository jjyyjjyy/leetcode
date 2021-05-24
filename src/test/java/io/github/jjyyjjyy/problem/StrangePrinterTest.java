package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class StrangePrinterTest {

    private static final StrangePrinter STRANGE_PRINTER = new StrangePrinter();

    @ParameterizedTest
    @CsvSource({"aaabbb,2", "aba,2"})
    void strangePrinter(String s, int expect) {
        assertEquals(expect, STRANGE_PRINTER.strangePrinter(s));
    }
}

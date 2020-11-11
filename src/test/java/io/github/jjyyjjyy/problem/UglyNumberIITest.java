package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class UglyNumberIITest {

    private static final UglyNumberII UGLY_NUMBER_II = new UglyNumberII();

    @ParameterizedTest
    @CsvSource({"10,12"})
    void nthUglyNumber(int n, int expect) {
        assertEquals(expect, UGLY_NUMBER_II.nthUglyNumber(n));
    }
}

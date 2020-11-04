package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class PowerOfTwoTest {

    private static final PowerOfTwo POWER_OF_TWO = new PowerOfTwo();

    @ParameterizedTest
    @CsvSource({"1,true", "16,true", "218,false"})
    void isPowerOfTwo(int n, boolean expect) {
        assertEquals(expect, POWER_OF_TWO.isPowerOfTwo(n));
    }
}

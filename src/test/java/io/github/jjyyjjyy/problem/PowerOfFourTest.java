package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class PowerOfFourTest {

    private static final PowerOfFour POWER_OF_FOUR = new PowerOfFour();

    @ParameterizedTest
    @CsvSource({"16,true", "5,false", "1,true"})
    void isPowerOfFour(int n, boolean expect) {
        Assertions.assertEquals(expect, POWER_OF_FOUR.isPowerOfFour(n));
    }
}

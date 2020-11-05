package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class PowerOfThreeTest {

    private static final PowerOfThree POWER_OF_THREE = new PowerOfThree();

    @ParameterizedTest
    @CsvSource({"27,true", "0,false", "9,true", "45,false", "1,true"})
    void isPowerOfThree(int n, boolean expect) {
        assertEquals(expect, POWER_OF_THREE.isPowerOfThree(n));
    }
}

package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ClumsyFactorialTest {

    private static final ClumsyFactorial CLUMSY_FACTORIAL = new ClumsyFactorial();

    @ParameterizedTest
    @CsvSource({"4,7", "10,12"})
    void clumsy(int N, int expect) {
        assertEquals(expect, CLUMSY_FACTORIAL.clumsy(N));
    }
}

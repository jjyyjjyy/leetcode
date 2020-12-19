package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class NumberOf1BitsTest {

    private static final NumberOf1Bits NUMBER_OF_1_BITS = new NumberOf1Bits();

    @ParameterizedTest
    @CsvSource({"13,3"})
    void hammingWeight(int n, int expect) {
        assertEquals(expect, NUMBER_OF_1_BITS.hammingWeight(n));
    }
}

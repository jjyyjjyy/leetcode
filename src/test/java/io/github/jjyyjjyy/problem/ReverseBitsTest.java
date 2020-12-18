package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ReverseBitsTest {

    private static final ReverseBits REVERSE_BITS = new ReverseBits();

    @ParameterizedTest
    @CsvSource({"-3,-1073741825"})
    void reverseBits(int n, int expect) {
        assertEquals(expect, REVERSE_BITS.reverseBits(n));
    }
}

package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class DecodeWaysTest {

    private static final DecodeWays DECODE_WAYS = new DecodeWays();

    @ParameterizedTest
    @CsvSource({"12,2", "226,3", "0,0", "1,1", "2,1", "10011,0"})
    void numDecodings(String s, int expect) {
        Assertions.assertEquals(expect, DECODE_WAYS.numDecodings(s));
    }
}

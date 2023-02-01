package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class DecodeTheMessageTest {

    private static final DecodeTheMessage DECODE_THE_MESSAGE = new DecodeTheMessage();

    @ParameterizedTest
    @CsvSource({"'the quick brown fox jumps over the lazy dog','vkbs bs t suepuv','this is a secret'", "'eljuxhpwnyrdgtqkviszcfmabo','zwx hnfx lqantp mnoeius ycgk vcnjrdb','the five boxing wizards jump quickly'"})
    void decodeMessage(String key, String message, String expect) {
        assertEquals(expect, DECODE_THE_MESSAGE.decodeMessage(key, message));
    }
}

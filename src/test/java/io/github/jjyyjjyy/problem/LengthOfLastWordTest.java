package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class LengthOfLastWordTest {

    private static final LengthOfLastWord LENGTH_OF_LAST_WORD = new LengthOfLastWord();

    @ParameterizedTest
    @CsvSource({"Hello World,5", "a ,1"})
    void lengthOfLastWord(String s, int expect) {
        assertEquals(expect, LENGTH_OF_LAST_WORD.lengthOfLastWord(s));
    }
}

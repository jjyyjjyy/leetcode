package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ScrambleStringTest {

    private static final ScrambleString SCRAMBLE_STRING = new ScrambleString();

    @ParameterizedTest
    @CsvSource({"great,rgeat,true", "abcde,caebd,false", "a,a,true"})
    void isScramble(String s1, String s2, boolean expect) {
        assertEquals(expect, SCRAMBLE_STRING.isScramble(s1, s2));
    }
}

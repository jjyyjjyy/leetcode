package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class RemoveDuplicateLettersTest {

    private static final RemoveDuplicateLetters REMOVE_DUPLICATE_LETTERS = new RemoveDuplicateLetters();

    @ParameterizedTest
    @CsvSource({"bcabc,abc", "cbacdcbc,acdb"})
    void removeDuplicateLetters(String s, String expect) {
        assertEquals(expect, REMOVE_DUPLICATE_LETTERS.removeDuplicateLetters(s));
    }

}

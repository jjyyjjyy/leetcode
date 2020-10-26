package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ReverseWordsInAStringTest {

    private static final ReverseWordsInAString REVERSE_WORDS_IN_A_STRING = new ReverseWordsInAString();

    @ParameterizedTest
    @CsvSource({"the sky is blue, blue is sky the,", "  hello world!  ,world! hello", "a good   example,example good a", "  Bob    Loves  Alice   ,Alice Loves Bob", "Alice does not even like bob,bob like even not does Alice"})
    void reverseWords(String s, String expect) {
        assertEquals(expect, REVERSE_WORDS_IN_A_STRING.reverseWords(s));
    }
}

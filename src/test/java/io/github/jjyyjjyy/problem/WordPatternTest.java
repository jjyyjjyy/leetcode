package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class WordPatternTest {

    private static final WordPattern WORD_PATTERN = new WordPattern();

    @ParameterizedTest
    @CsvSource({"abba,dog cat cat dog,true", "abba,dog cat cat fish,false", "aaaa,dog cat cat dog,false", "abba,dog dog dog dog,false"})
    void wordPattern(String pattern, String str, boolean expect) {
        assertEquals(expect, WORD_PATTERN.wordPattern(pattern, str));
    }
}

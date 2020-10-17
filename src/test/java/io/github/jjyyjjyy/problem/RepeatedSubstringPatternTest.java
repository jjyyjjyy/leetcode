package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class RepeatedSubstringPatternTest {

    private static final RepeatedSubstringPattern REPEATED_SUBSTRING_PATTERN = new RepeatedSubstringPattern();

    @ParameterizedTest
    @CsvSource({"abab,true", "aba,false", "abcabcabcabc,true"})
    void repeatedSubstringPattern(String s, boolean expect) {
        assertEquals(expect, REPEATED_SUBSTRING_PATTERN.repeatedSubstringPattern(s));
    }
}

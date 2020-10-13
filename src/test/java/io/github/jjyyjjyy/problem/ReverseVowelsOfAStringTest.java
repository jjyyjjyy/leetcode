package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ReverseVowelsOfAStringTest {

    private static final ReverseVowelsOfAString REVERSE_VOWELS_OF_A_STRING = new ReverseVowelsOfAString();

    @ParameterizedTest
    @CsvSource({"hello,holle", "leetcode,leotcede", "aA,Aa"})
    void reverseVowels(String s, String expect) {
        assertEquals(expect, REVERSE_VOWELS_OF_A_STRING.reverseVowels(s));
    }
}

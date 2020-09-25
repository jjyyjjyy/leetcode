package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ValidAnagramTest {

    private static final ValidAnagram VALID_ANAGRAM = new ValidAnagram();

    @ParameterizedTest
    @CsvSource({"anagram,nagaram,true", "rat,car,false"})
    void isAnagram(String s, String t, boolean expect) {
        assertEquals(expect, VALID_ANAGRAM.isAnagram(s, t));
    }
}

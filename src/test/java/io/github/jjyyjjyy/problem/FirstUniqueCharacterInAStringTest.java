package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class FirstUniqueCharacterInAStringTest {

    private static final FirstUniqueCharacterInAString FIRST_UNIQUE_CHARACTER_IN_A_STRING = new FirstUniqueCharacterInAString();

    @ParameterizedTest
    @CsvSource({"leetcode,0", "loveleetcode,2", "cc,-1"})
    void firstUniqChar(String s, int expect) {
        assertEquals(expect, FIRST_UNIQUE_CHARACTER_IN_A_STRING.firstUniqChar(s));
    }
}

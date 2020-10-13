package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class RansomNoteTest {

    private static final RansomNote RANSOM_NOTE = new RansomNote();

    @ParameterizedTest
    @CsvSource({"a,b,false", "aa,ab,false", "aa,aab,true"})
    void canConstruct(String ransomNote, String magazine, boolean expect) {
        assertEquals(expect, RANSOM_NOTE.canConstruct(ransomNote, magazine));
    }
}

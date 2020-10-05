package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ImplementStrStrTest {

    private static final ImplementStrStr IMPLEMENT_STR_STR = new ImplementStrStr();

    @ParameterizedTest
    @CsvSource({"hello,ll,2", "aaaaa,bba,-1", "'','',0", "aaa,aaaa,-1"})
    void strStr(String haystack, String needle, int expect) {
        assertEquals(expect, IMPLEMENT_STR_STR.strStr(haystack, needle));
    }
}

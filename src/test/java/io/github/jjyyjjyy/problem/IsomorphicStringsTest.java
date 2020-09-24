package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class IsomorphicStringsTest {

    private static final IsomorphicStrings ISOMORPHIC_STRINGS = new IsomorphicStrings();

    @ParameterizedTest
    @CsvSource({"ab,aa,false", "egg,add,true", "foo,bar,false", "paper,title,true"})
    void isIsomorphic(String s, String t, boolean expect) {
        assertEquals(expect, ISOMORPHIC_STRINGS.isIsomorphic(s, t));
    }
}

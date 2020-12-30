package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class RegularExpressionMatchingTest {

    private static final RegularExpressionMatching REGULAR_EXPRESSION_MATCHING = new RegularExpressionMatching();

    @ParameterizedTest
    @CsvSource({"aa,a,false", "aa,a*,true", "ab,.*,true", "aab,c*a*b,true", "mississippi,mis*is*p*.,false", "abad,ab*,false"})
    void isMatch(String s, String p, boolean expect) {
        Assertions.assertEquals(expect, REGULAR_EXPRESSION_MATCHING.isMatch(s, p));
    }
}

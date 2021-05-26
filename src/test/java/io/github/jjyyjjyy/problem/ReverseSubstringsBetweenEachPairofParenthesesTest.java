package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class ReverseSubstringsBetweenEachPairofParenthesesTest {

    private static final ReverseSubstringsBetweenEachPairofParentheses REVERSE_SUBSTRINGS_BETWEEN_EACH_PAIROF_PARENTHESES = new ReverseSubstringsBetweenEachPairofParentheses();

    @ParameterizedTest
    @CsvSource({"(abcd),dcba", "(u(love)i),iloveu", "(ed(et(oc))el),leetcode", "a(bcdefghijkl(mno)p)q,apmnolkjihgfedcbq"})
    void reverseParentheses(String s, String expect) {
        assertEquals(expect, REVERSE_SUBSTRINGS_BETWEEN_EACH_PAIROF_PARENTHESES.reverseParentheses2(s));
    }
}

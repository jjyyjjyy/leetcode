package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class ValidParenthesesTest {

    private static final ValidParentheses VALID_PARENTHESES = new ValidParentheses();

    @ParameterizedTest
    @CsvSource({"(),true", "()[]{},true", "(],false", "([)],false", "{[]},true"})
    void isValid(String s, boolean expect) {
        Assertions.assertEquals(expect, VALID_PARENTHESES.isValid(s));
    }
}

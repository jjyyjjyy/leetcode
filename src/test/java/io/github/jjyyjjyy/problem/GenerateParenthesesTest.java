package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class GenerateParenthesesTest {

    private static final GenerateParentheses GENERATE_PARENTHESES = new GenerateParentheses();

    @ParameterizedTest
    @CsvSource({"3,'((())),(()()),(())(),()(()),()()()'"})
    void generateParenthesis(int n, @ConvertWith(CsvToArray.class) String[] expect) {
        Assertions.assertArrayEquals(expect, GENERATE_PARENTHESES.generateParenthesis(n).toArray(String[]::new));
    }
}

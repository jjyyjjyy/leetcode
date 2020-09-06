package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class EvaluateReversePolishNotationTest {

    private static final EvaluateReversePolishNotation EVALUATE_REVERSE_POLISH_NOTATION = new EvaluateReversePolishNotation();

    @ParameterizedTest
    @CsvSource({"'2,1,+,3,*',9", "'4,13,5,/,+',6", "'10,6,9,3,+,-11,*,/,*,17,+,5,+',22"})
    void evalRPN(@ConvertWith(CsvToArray.class) String[] tokens, int expect) {
        Assertions.assertEquals(expect, EVALUATE_REVERSE_POLISH_NOTATION.evalRPN(tokens));
    }
}

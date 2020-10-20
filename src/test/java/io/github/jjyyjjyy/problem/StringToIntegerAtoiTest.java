package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class StringToIntegerAtoiTest {

    private static final StringToIntegerAtoi STRING_TO_INTEGER_ATOI = new StringToIntegerAtoi();

    @ParameterizedTest
    @CsvSource({"42,42", "   -42,-42", "4193 with words,4193", "words and 987,0", "-91283472332,-2147483648", "+1,1", "9223372036854775808,2147483647", "18446744073709551617,2147483647"})
    void myAtoi(String s, int expect) {
        Assertions.assertEquals(expect, STRING_TO_INTEGER_ATOI.myAtoi(s));
    }
}

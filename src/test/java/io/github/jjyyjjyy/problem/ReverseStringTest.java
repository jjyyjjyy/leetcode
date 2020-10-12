package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class ReverseStringTest {

    private static final ReverseString REVERSE_STRING = new ReverseString();

    @ParameterizedTest
    @CsvSource({"'h,e,l,l,o','o,l,l,e,h'", "'H,a,n,n,a,h','h,a,n,n,a,H'"})
    void reverseString(@ConvertWith(CsvToArray.class) char[] chars,
                       @ConvertWith(CsvToArray.class) char[] expect) {
        REVERSE_STRING.reverseString(chars);
        Assertions.assertArrayEquals(expect, chars);
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class StringCompressionsTest {

    private static final StringCompressions STRING_COMPRESSION = new StringCompressions();

    @ParameterizedTest
    @CsvSource({"'a,a,b,b,c,c,c','a,2,b,2,c,3', 6", "'a','a',1", "'a,b,b,b,b,b,b,b,b,b,b,b,b','a,b,1,2',4"})
    void compress(@ConvertWith(CsvToArray.class) char[] chars,
                  @ConvertWith(CsvToArray.class) char[] expectChars,
                  int expect) {
        assertEquals(expect, STRING_COMPRESSION.compress(chars));
        for (int i = 0; i < expect; i++) {
            assertEquals(chars[i], expectChars[i]);
        }
    }
}

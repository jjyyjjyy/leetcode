package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class DecodeXoredArrayTest {

    private static final DecodeXoredArray DECODE_XORED_ARRAY = new DecodeXoredArray();

    @ParameterizedTest
    @CsvSource({"'1,2,3',1,'1,0,2,1'", "'6,2,7,3',4,'4,2,0,7,4'"})
    void decode(@ConvertWith(CsvToArray.class) int[] encoded, int first, @ConvertWith(CsvToArray.class) int[] expect) {
        assertArrayEquals(expect, DECODE_XORED_ARRAY.decode(encoded, first));
    }
}

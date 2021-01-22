package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class AddToArrayFormOfIntegerTest {

    private static final AddToArrayFormOfInteger ADD_TO_ARRAY_FORM_OF_INTEGER = new AddToArrayFormOfInteger();

    @ParameterizedTest
    @CsvSource({"'1,2,0,0',34,'1,2,3,4'", "'2,7,4',181,'4,5,5'", "'2,1,5',806,'1,0,2,1'", "'9,9,9,9,9,9,9,9,9,9',1,'1,0,0,0,0,0,0,0,0,0,0'"})
    void addToArrayForm(@ConvertWith(CsvToArray.class) int[] A, int K, @ConvertWith(CsvToArray.class) int[] expect) {
        Assertions.assertArrayEquals(expect, ArrayUtil.toIntArray(ADD_TO_ARRAY_FORM_OF_INTEGER.addToArrayForm(A, K)));
    }
}

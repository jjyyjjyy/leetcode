package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class DecodeXoredPermutationTest {

    private static final DecodeXoredPermutation DECODE_XORED_PERMUTATION = new DecodeXoredPermutation();

    @ParameterizedTest
    @CsvSource({"'3,1','1,2,3'", "'6,5,4,6','2,4,1,5,3'"})
    void decode(@ConvertWith(CsvToArray.class) int[] encoded,
                @ConvertWith(CsvToArray.class) int[] expecet) {
        assertArrayEquals(expecet, DECODE_XORED_PERMUTATION.decode(encoded));
    }
}

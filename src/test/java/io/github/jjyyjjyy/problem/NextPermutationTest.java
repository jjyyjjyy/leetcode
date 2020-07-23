package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class NextPermutationTest {

    private static final NextPermutation NEXT_PERMUTATION = new NextPermutation();

    @ParameterizedTest
    @CsvSource({"'1,2,3','1,3,2'", "'3,2,1','1,2,3'", "'1,1,5','1,5,1'"})
    void nextPermutation(@ConvertWith(CsvToArray.class) int[] a,
                         @ConvertWith(CsvToArray.class) int[] b) {
        NEXT_PERMUTATION.nextPermutation(a);
        Assertions.assertArrayEquals(b, a);
    }
}

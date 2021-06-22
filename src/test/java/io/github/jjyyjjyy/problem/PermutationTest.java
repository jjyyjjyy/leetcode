package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class PermutationTest {

    private static final Permutation PERMUTATION = new Permutation();

    @ParameterizedTest
    @CsvSource({"abc,'abc,acb,bac,bca,cab,cba'"})
    void permutation(String s, @ConvertWith(CsvToArray.class) String[] expect) {
        assertArrayEquals(expect, PERMUTATION.permutation(s));
    }
}

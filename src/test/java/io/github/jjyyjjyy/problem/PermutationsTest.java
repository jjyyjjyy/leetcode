package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class PermutationsTest {

    private static final Permutations PERMUTATIONS = new Permutations();

    @ParameterizedTest
    @CsvSource({"'1,2,3',6"})
    void permute(@ConvertWith(CsvToArray.class) int[] nums, int expectLength) {
        assertEquals(expectLength, PERMUTATIONS.permute(nums).size());
    }
}

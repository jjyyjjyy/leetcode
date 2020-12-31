package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class PermutationsIITest {

    private static final PermutationsII PERMUTATIONS_II = new PermutationsII();

    @ParameterizedTest
    @CsvSource({"'1,1,2',3"})
    void permuteUnique(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        assertEquals(expect, PERMUTATIONS_II.permuteUnique(nums).size());
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

/**
 * @author jy
 */
class SubsetsIITest {

    private static final SubsetsII SUBSETS_II = new SubsetsII();

    @ParameterizedTest
    @CsvSource({"'1,2,2', 6", "'1,1',3"})
    void subsetsWithDup(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        List<List<Integer>> result = SUBSETS_II.subsetsWithDup(nums);
        Assertions.assertEquals(expect, result.size());
    }
}

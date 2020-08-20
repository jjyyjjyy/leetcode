package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class SubsetsTest {

    private static final Subsets SUBSETS = new Subsets();

    @ParameterizedTest
    @CsvSource({"'1,2,3'"})
    void subsets(@ConvertWith(CsvToArray.class) int[] nums) {
        List<List<Integer>> subsets = SUBSETS.subsets(nums);
        assertEquals(Math.pow(2, nums.length), subsets.size());
    }
}

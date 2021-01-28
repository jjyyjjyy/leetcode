package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class FindPivotIndexTest {

    private static final FindPivotIndex FIND_PIVOT_INDEX = new FindPivotIndex();

    @ParameterizedTest
    @CsvSource({"'1,7,3,6,5,6',3", "'1,2,3',-1"})
    void pivotIndex(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        assertEquals(expect, FIND_PIVOT_INDEX.pivotIndex(nums));
    }
}

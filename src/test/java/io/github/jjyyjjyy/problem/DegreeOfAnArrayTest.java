package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class DegreeOfAnArrayTest {

    private static final DegreeOfAnArray DEGREE_OF_AN_ARRAY = new DegreeOfAnArray();

    @ParameterizedTest
    @CsvSource({"'1,2,2,3,1',2", "'1,2,2,3,1,4,2',6"})
    void findShortestSubArray(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        assertEquals(expect, DEGREE_OF_AN_ARRAY.findShortestSubArray(nums));
    }
}

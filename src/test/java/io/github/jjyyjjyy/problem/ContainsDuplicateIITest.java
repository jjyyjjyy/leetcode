package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ContainsDuplicateIITest {

    private static final ContainsDuplicateII CONTAINS_DUPLICATE_II = new ContainsDuplicateII();

    @ParameterizedTest
    @CsvSource({"'1,2,3,1', 3, true", "'1,0,1,1', 1, true", "'1,2,3,1,2,3', 2, false"})
    void containsNearbyDuplicate(@ConvertWith(CsvToArray.class) int[] arr, int k, boolean expect) {
        assertEquals(expect, CONTAINS_DUPLICATE_II.containsNearbyDuplicate(arr, k));
    }
}

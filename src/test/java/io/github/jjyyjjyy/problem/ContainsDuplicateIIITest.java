package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ContainsDuplicateIIITest {

    private static final ContainsDuplicateIII CONTAINS_DUPLICATE_III = new ContainsDuplicateIII();

    @ParameterizedTest
    @CsvSource({"'1,2,3,1',3,0,true", "'1,0,1,1',1,2,true", "'1,5,9,1,5,9',2,3,false", "'8,7,15,1,6,1,9,15',1,3,true", "'-3,3,-6',2,3,true", "'-2147483648,2147483647',1,1,false", "'2147483640,2147483641',1,100,true"})
    void containsNearbyAlmostDuplicate(@ConvertWith(CsvToArray.class) int[] nums, int k, int t, boolean expect) {
        assertEquals(expect, CONTAINS_DUPLICATE_III.containsNearbyAlmostDuplicate(nums, k, t));
    }
}

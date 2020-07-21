package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class ThreeSumClosestTest {

    private static final ThreeSumClosest THREE_SUM_CLOSEST = new ThreeSumClosest();

    @ParameterizedTest
    @CsvSource({"'-1,2,1,-4',1,2", "'0,2,1,-3',1,0"})
    void threeSumClosest(@ConvertWith(CsvToArray.class) int[] arr, int target, int expect) {
        Assertions.assertEquals(expect, THREE_SUM_CLOSEST.threeSumClosest(arr, target));
    }
}

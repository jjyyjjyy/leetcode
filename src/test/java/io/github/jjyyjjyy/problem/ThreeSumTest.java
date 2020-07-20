package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author jy
 */
class ThreeSumTest {

    private static final ThreeSum THREE_SUM = new ThreeSum();

    @Test
    void threeSum() {
        List<List<Integer>> lists = THREE_SUM.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        Assertions.assertEquals(2, lists.size());
        for (List<Integer> list : lists) {
            Assertions.assertEquals(0, list.stream().mapToInt(a -> a).sum());
        }
    }
}

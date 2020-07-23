package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author jy
 */
class FourSumTest {

    private static final FourSum FOUR_SUM = new FourSum();

    @Test
    void fourSum() {
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        List<List<Integer>> lists = FOUR_SUM.fourSum(nums, 0);
        Assertions.assertEquals(3, lists.size());

        nums = new int[]{0, 0, 0, 0};
        lists = FOUR_SUM.fourSum(nums, 0);
        Assertions.assertEquals(1, lists.size());

        nums = new int[]{-1, 0, 1, 2, -1, -4,};
        lists = FOUR_SUM.fourSum(nums, -1);
        Assertions.assertEquals(2, lists.size());

    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class CombinationSumIITest {

    private static final CombinationSumII COMBINATION_SUM_II = new CombinationSumII();

    @Test
    void combinationSum2() {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> lists = COMBINATION_SUM_II.combinationSum2(candidates, 8);
        assertEquals(4, lists.size());
        assertArrayEquals(new int[]{1, 1, 6}, ArrayUtil.toIntArray(lists.get(0)));
        assertArrayEquals(new int[]{1, 2, 5}, ArrayUtil.toIntArray(lists.get(1)));
        assertArrayEquals(new int[]{1, 7}, ArrayUtil.toIntArray(lists.get(2)));
        assertArrayEquals(new int[]{2, 6}, ArrayUtil.toIntArray(lists.get(3)));
    }
}

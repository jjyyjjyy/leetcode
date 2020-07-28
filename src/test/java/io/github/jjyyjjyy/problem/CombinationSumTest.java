package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class CombinationSumTest {

    private static final CombinationSum COMBINATION_SUM = new CombinationSum();

    @Test
    void combinationSum() {
        int[] candidates = {2, 3, 6, 7};
        List<List<Integer>> lists = COMBINATION_SUM.combinationSum(candidates, 7);
        assertEquals(2, lists.size());
        assertArrayEquals(new int[]{2, 2, 3}, ArrayUtil.toIntArray(lists.get(0)));
        assertArrayEquals(new int[]{7}, ArrayUtil.toIntArray(lists.get(1)));
    }
}

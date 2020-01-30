package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    void twoSum() {
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{2, 3}, twoSum.twoSum(new int[]{11, 15, 2, 7}, 9));
    }
}

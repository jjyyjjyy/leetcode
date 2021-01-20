package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/maximum-product-of-three-numbers/">三个数的最大乘积</a>
 *
 * <p>给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [1,2,3]
 * <strong>输出:</strong> 6
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [1,2,3,4]
 * <strong>输出:</strong> 24
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li>给定的整型数组长度范围是[3,10<sup>4</sup>]，数组中所有的元素范围是[-1000, 1000]。</li>
 * 	<li>输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>maximum-product-subarray</li>
 * </ul>
 */
@Problem(
    id = 628,
    name = "maximum-product-of-three-numbers",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY, Tag.MATH}
)
public class MaximumProductOfThreeNumbers {

    /**
     * 依次遍历数组, 找到最小的两个数和最大的三个数, 求乘积.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }
        return Math.max(max1 * min1 * min2, max1 * max2 * max3);
    }

    /**
     * 1. 将数组排好序.
     * 2. 3个数的最大乘积可能是最后三个数, 也可能是最后一个数乘以最小的两个负数.
     */
    @Complexity(Complexity.ComplexityType.O_N_LOG_N)
    public int maximumProduct2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 1] * nums[n - 2] * nums[n - 3]);
    }
}

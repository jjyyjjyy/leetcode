package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/3sum-closest/">最接近的三数之和</a>
 *
 * <p>给定一个包括&nbsp;<em>n</em> 个整数的数组&nbsp;<code>nums</code><em>&nbsp;</em>和 一个目标值&nbsp;<code>target</code>。找出&nbsp;<code>nums</code><em>&nbsp;</em>中的三个整数，使得它们的和与&nbsp;<code>target</code>&nbsp;最接近。返回这三个数的和。假定每组输入只存在唯一答案。</p>
 *
 * <pre>例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 *
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>3sum</li>
 *   <li>3sum-smaller</li>
 * </ul>
 */
@Problem(
    id = 16,
    name = "3sum-closest",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.TWO_POINTERS}
)
public class ThreeSumClosest {

    /**
     * 1. 排序数组
     * 2. 依次遍历数组, 维护慢指针i和右侧左右两个指针.
     * 3. 比较三指针之和与target的差值和之前的差值, 小于差值则暂存.
     * 4. 如果和小于target, 则右指针向左移, 反之左指针向右移.
     */
    @Complexity(Complexity.ComplexityType.O_N_POW_2)
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int prev = Integer.MAX_VALUE / 2;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return sum;
                }
                if (Math.abs(sum - target) < Math.abs(prev - target)) {
                    prev = sum;
                }
                if (sum < target) {
                    while (left < right && nums[left] == nums[++left]) ;
                } else {
                    while (left < right && nums[right] == nums[--right]) ;
                }
            }
        }
        return prev;
    }

    /**
     * 三重循环依次求和算出差值, 然后比较找到最小的差值.
     */
    @Complexity(Complexity.ComplexityType.O_N_POW_3)
    public int threeSumClosest2(int[] nums, int target) {
        int min = Integer.MAX_VALUE / 2;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum - target < min - target) {
                        min = sum;
                    }
                }
            }
        }
        return min;
    }
}

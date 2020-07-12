package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/majority-element/">多数元素</a>
 *
 * <p>给定一个大小为 <em>n </em>的数组，找到其中的多数元素。多数元素是指在数组中出现次数<strong>大于</strong>&nbsp;<code>&lfloor; n/2 &rfloor;</code>&nbsp;的元素。</p>
 *
 * <p>你可以假设数组是非空的，并且给定的数组总是存在多数元素。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> [3,2,3]
 * <strong>输出:</strong> 3</pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> [2,2,1,1,1,2,2]
 * <strong>输出:</strong> 2
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>majority-element-ii</li>
 *   <li>check-if-a-number-is-majority-element-in-a-sorted-array</li>
 * </ul>
 */
@Problem(
    id = 169,
    name = "majority-element",
    difficulty = Difficulty.EASY,
    tags = {Tag.BIT_MANIPULATION, Tag.ARRAY, Tag.DIVIDE_AND_CONQUER}
)
public class MajorityElement {

    /**
     * Boyer-Moore
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int majorityElement(int[] nums) {
        int count = 1;
        int candidate = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            count = candidate == nums[i] ? (count + 1) : (count - 1);
        }
        return candidate;
    }

    @Complexity(Complexity.ComplexityType.O_N_LOG_N)
    public int majorityElement2(int[] nums) {
        return majorityElement2(nums, 0, nums.length - 1);
    }

    private int majorityElement2(int[] nums, int start, int end) {
        if (start == end) {
            return nums[start];
        }
        int mid = (end - start) / 2 + start;
        int left = majorityElement2(nums, start, mid);
        int right = majorityElement2(nums, mid + 1, end);
        if (left == right) {
            return left;
        }

        int leftCount = count(nums, left, start, end);
        int rightCount = count(nums, right, start, end);
        return leftCount > rightCount ? left : right;
    }

    private int count(int[] nums, int target, int start, int end) {
        int count = 0;
        for (int i = start; i < end + 1; i++) {
            if (nums[i] == target) {
                count++;
            }
        }
        return count;
    }
}

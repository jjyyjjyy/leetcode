package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/find-pivot-index/">寻找数组的中心索引</a>
 *
 * <p>给定一个整数类型的数组&nbsp;<code>nums</code>，请编写一个能够返回数组<strong>&ldquo;中心索引&rdquo;</strong>的方法。</p>
 *
 * <p>我们是这样定义数组<strong>中心索引</strong>的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。</p>
 *
 * <p>如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 * nums = [1, 7, 3, 6, 5, 6]
 * <strong>输出:</strong> 3
 * <strong>解释:</strong>
 * 索引3 (nums[3] = 6) 的左侧数之和(1 + 7 + 3 = 11)，与右侧数之和(5 + 6 = 11)相等。
 * 同时, 3 也是第一个符合要求的中心索引。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 * nums = [1, 2, 3]
 * <strong>输出:</strong> -1
 * <strong>解释:</strong>
 * 数组中不存在满足此条件的中心索引。</pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ul>
 * 	<li><code>nums</code> 的长度范围为&nbsp;<code>[0, 10000]</code>。</li>
 * 	<li>任何一个&nbsp;<code>nums[i]</code> 将会是一个范围在&nbsp;<code>[-1000, 1000]</code>的整数。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>subarray-sum-equals-k</li>
 * </ul>
 */
@Problem(
    id = 724,
    name = "find-pivot-index",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class FindPivotIndex {

    /**
     * 1. 先计算数组所有元素之和.
     * 2. 依次遍历数组, 将总和减去当前元素, 然后判断是否与左边元素之和相等.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}

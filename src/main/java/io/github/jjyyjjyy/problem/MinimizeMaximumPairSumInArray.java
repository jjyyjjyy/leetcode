package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/minimize-maximum-pair-sum-in-array/">数组中最大数对和的最小值</a>
 *
 * <p>一个数对 <code>(a,b)</code> 的 <strong>数对和</strong> 等于 <code>a + b</code> 。<strong>最大数对和</strong> 是一个数对数组中最大的 <strong>数对和</strong> 。</p>
 *
 * <ul>
 * 	<li>比方说，如果我们有数对 <code>(1,5)</code> ，<code>(2,3)</code> 和 <code>(4,4)</code>，<strong>最大数对和</strong> 为 <code>max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8</code> 。</li>
 * </ul>
 *
 * <p>给你一个长度为 <strong>偶数</strong> <code>n</code> 的数组 <code>nums</code> ，请你将 <code>nums</code> 中的元素分成 <code>n / 2</code> 个数对，使得：</p>
 *
 * <ul>
 * 	<li><code>nums</code> 中每个元素 <strong>恰好</strong> 在 <strong>一个</strong> 数对中，且</li>
 * 	<li><strong>最大数对和</strong> 的值 <strong>最小</strong> 。</li>
 * </ul>
 *
 * <p>请你在最优数对划分的方案下，返回最小的 <strong>最大数对和</strong> 。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><b>输入：</b>nums = [3,5,2,3]
 * <b>输出：</b>7
 * <b>解释：</b>数组中的元素可以分为数对 (3,3) 和 (5,2) 。
 * 最大数对和为 max(3+3, 5+2) = max(6, 7) = 7 。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><b>输入：</b>nums = [3,5,4,2,4,6]
 * <b>输出：</b>8
 * <b>解释：</b>数组中的元素可以分为数对 (3,5)，(4,4) 和 (6,2) 。
 * 最大数对和为 max(3+5, 4+4, 6+2) = max(8, 8, 8) = 8 。
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>n == nums.length</code></li>
 * 	<li><code>2 &lt;= n &lt;= 10<sup>5</sup></code></li>
 * 	<li><code>n</code> 是 <strong>偶数</strong> 。</li>
 * 	<li><code>1 &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
 * </ul>
 */
@Problem(
    id = 1988,
    name = "minimize-maximum-pair-sum-in-array",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.GREEDY, Tag.ARRAY, Tag.TWO_POINTERS, Tag.SORTING}
)
public class MinimizeMaximumPairSumInArray {

    /**
     * 1. 将数组排好序.
     * 2. 遍历一半元素, 找到首尾和的最大值.
     */
    @Complexity(Complexity.ComplexityType.O_LOG_N)
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            result = Math.max(result, nums[i] + nums[n - 1 - i]);
        }
        return result;
    }
}

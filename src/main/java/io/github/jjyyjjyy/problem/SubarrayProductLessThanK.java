package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/subarray-product-less-than-k/">乘积小于K的子数组</a>
 *
 * <p>给定一个正整数数组&nbsp;<code>nums</code>。</p>
 *
 * <p>找出该数组内乘积小于&nbsp;<code>k</code>&nbsp;的连续的子数组的个数。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> nums = [10,5,2,6], k = 100
 * <strong>输出:</strong> 8
 * <strong>解释:</strong> 8个乘积小于100的子数组分别为: [10], [5], [2], [6], [10,5], [5,2], [2,6], [5,2,6]。
 * 需要注意的是 [10,5,2] 并不是乘积小于100的子数组。
 * </pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ul>
 * 	<li><code>0 &lt; nums.length &lt;= 50000</code></li>
 * 	<li><code>0 &lt; nums[i] &lt; 1000</code></li>
 * 	<li><code>0 &lt;= k &lt; 10^6</code></li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>maximum-product-subarray</li>
 *   <li>maximum-size-subarray-sum-equals-k</li>
 *   <li>subarray-sum-equals-k</li>
 *   <li>two-sum-less-than-k</li>
 * </ul>
 */
@Problem(
    id = 713,
    name = "subarray-product-less-than-k",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.TWO_POINTERS}
)
public class SubarrayProductLessThanK {
}

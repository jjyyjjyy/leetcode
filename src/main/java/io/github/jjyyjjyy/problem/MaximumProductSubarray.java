package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/maximum-product-subarray/">乘积最大子序列</a>
 *
 * <p>给定一个整数数组 <code>nums</code>&nbsp;，找出一个序列中乘积最大的连续子序列（该序列至少包含一个数）。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [2,3,-2,4]
 * <strong>输出:</strong> <code>6</code>
 * <strong>解释:</strong>&nbsp;子数组 [2,3] 有最大乘积 6。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> [-2,0,-1]
 * <strong>输出:</strong> 0
 * <strong>解释:</strong>&nbsp;结果不能为 2, 因为 [-2,-1] 不是子数组。</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>maximum-subarray</li>
 *   <li>house-robber</li>
 *   <li>product-of-array-except-self</li>
 *   <li>maximum-product-of-three-numbers</li>
 *   <li>subarray-product-less-than-k</li>
 * </ul>
 */
@Problem(
    id = 152,
    name = "maximum-product-subarray",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.DYNAMIC_PROGRAMMING}
)
public class MaximumProductSubarray {
}

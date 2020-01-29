package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/subarray-sum-equals-k/">和为K的子数组</a>
 *
 * <p>给定一个整数数组和一个整数&nbsp;<strong>k，</strong>你需要找到该数组中和为&nbsp;<strong>k&nbsp;</strong>的连续的子数组的个数。</p>
 *
 * <p><strong>示例 1 :</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>nums = [1,1,1], k = 2
 * <strong>输出:</strong> 2 , [1,1] 与 [1,1] 为两种不同的情况。
 * </pre>
 *
 * <p><strong>说明 :</strong></p>
 *
 * <ol>
 * 	<li>数组的长度为 [1, 20,000]。</li>
 * 	<li>数组中元素的范围是 [-1000, 1000] ，且整数&nbsp;<strong>k&nbsp;</strong>的范围是&nbsp;[-1e7, 1e7]。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>two-sum</li>
 *   <li>continuous-subarray-sum</li>
 *   <li>subarray-product-less-than-k</li>
 *   <li>find-pivot-index</li>
 *   <li>subarray-sums-divisible-by-k</li>
 * </ul>
 */
@Problem(
    id = 560,
    name = "subarray-sum-equals-k",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.HASH_TABLE}
)
public class SubarraySumEqualsK {
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/maximum-length-of-repeated-subarray/">最长重复子数组</a>
 *
 * <p>给两个整数数组&nbsp;<code>A</code>&nbsp;和&nbsp;<code>B</code>&nbsp;，返回两个数组中公共的、长度最长的子数组的长度。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 * A: [1,2,3,2,1]
 * B: [3,2,1,4,7]
 * <strong>输出:</strong> 3
 * <strong>解释:</strong>
 * 长度最长的公共子数组是 [3, 2, 1]。
 * </pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ol>
 * 	<li>1 &lt;= len(A), len(B) &lt;= 1000</li>
 * 	<li>0 &lt;= A[i], B[i] &lt; 100</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>minimum-size-subarray-sum</li>
 * </ul>
 */
@Problem(
    id = 718,
    name = "maximum-length-of-repeated-subarray",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.HASH_TABLE, Tag.BINARY_SEARCH, Tag.DYNAMIC_PROGRAMMING}
)
public class MaximumLengthofRepeatedSubarray {
}

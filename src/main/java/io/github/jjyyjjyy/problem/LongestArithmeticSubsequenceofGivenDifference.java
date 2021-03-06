package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/longest-arithmetic-subsequence-of-given-difference/">最长定差子序列</a>
 *
 * <p>给你一个整数数组&nbsp;<code>arr</code>&nbsp;和一个整数&nbsp;<code>difference</code>，请你找出&nbsp;<code>arr</code>&nbsp;中所有相邻元素之间的差等于给定&nbsp;<code>difference</code>&nbsp;的等差子序列，并返回其中最长的等差子序列的长度。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>arr = [1,2,3,4], difference = 1
 * <strong>输出：</strong>4
 * <strong>解释：</strong>最长的等差子序列是 [1,2,3,4]。</pre>
 *
 * <p><strong>示例&nbsp;2：</strong></p>
 *
 * <pre><strong>输入：</strong>arr = [1,3,5,7], difference = 1
 * <strong>输出：</strong>1
 * <strong>解释：</strong>最长的等差子序列是任意单个元素。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>arr = [1,5,7,8,5,3,4,2,1], difference = -2
 * <strong>输出：</strong>4
 * <strong>解释：</strong>最长的等差子序列是 [7,5,3,1]。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= arr.length &lt;= 10^5</code></li>
 * 	<li><code>-10^4 &lt;= arr[i], difference &lt;= 10^4</code></li>
 * </ul>
 */
@Problem(
    id = 1330,
    name = "longest-arithmetic-subsequence-of-given-difference",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.MATH, Tag.DYNAMIC_PROGRAMMING}
)
public class LongestArithmeticSubsequenceofGivenDifference {
}

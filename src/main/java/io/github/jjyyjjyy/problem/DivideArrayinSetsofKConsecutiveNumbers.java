package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/divide-array-in-sets-of-k-consecutive-numbers/">划分数组为连续数字的集合</a>
 *
 * <p>给你一个整数数组&nbsp;<code>nums</code>&nbsp;和一个正整数&nbsp;<code>k</code>，请你判断是否可以把这个数组划分成一些由&nbsp;<code>k</code>&nbsp;个连续数字组成的集合。<br>
 * 如果可以，请返回&nbsp;<code>True</code>；否则，返回&nbsp;<code>False</code>。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>nums = [1,2,3,3,4,4,5,6], k = 4
 * <strong>输出：</strong>true
 * <strong>解释：</strong>数组可以分成 [1,2,3,4] 和 [3,4,5,6]。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>nums = [3,2,1,2,3,4,3,4,5,9,10,11], k = 3
 * <strong>输出：</strong>true
 * <strong>解释：</strong>数组可以分成 [1,2,3] , [2,3,4] , [3,4,5] 和 [9,10,11]。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>nums = [3,3,2,2,1,1], k = 3
 * <strong>输出：</strong>true
 * </pre>
 *
 * <p><strong>示例 4：</strong></p>
 *
 * <pre><strong>输入：</strong>nums = [1,2,3,4], k = 3
 * <strong>输出：</strong>false
 * <strong>解释：</strong>数组不能分成几个大小为 3 的子数组。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= nums.length &lt;= 10^5</code></li>
 * 	<li><code>1 &lt;= nums[i] &lt;= 10^9</code></li>
 * 	<li><code>1 &lt;= k &lt;= nums.length</code></li>
 * </ul>
 */
@Problem(
    id = 1422,
    name = "divide-array-in-sets-of-k-consecutive-numbers",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.GREEDY, Tag.ARRAY}
)
public class DivideArrayinSetsofKConsecutiveNumbers {
}

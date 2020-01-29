package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/check-if-it-is-a-good-array/">检查「好数组」</a>
 *
 * <p>给你一个正整数数组 <code>nums</code>，你需要从中任选一些子集，然后将子集中每一个数乘以一个 <strong>任意整数</strong>，并求出他们的和。</p>
 *
 * <p>假如该和结果为&nbsp;<code>1</code>，那么原数组就是一个「<strong>好数组</strong>」，则返回 <code>True</code>；否则请返回 <code>False</code>。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>nums = [12,5,7,23]
 * <strong>输出：</strong>true
 * <strong>解释：</strong>挑选数字 5 和 7。
 * 5*3 + 7*(-2) = 1
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>nums = [29,6,10]
 * <strong>输出：</strong>true
 * <strong>解释：</strong>挑选数字 29, 6 和 10。
 * 29*1 + 6*(-3) + 10*(-1) = 1
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>nums = [3,6]
 * <strong>输出：</strong>false
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= nums.length &lt;= 10^5</code></li>
 * 	<li><code>1 &lt;= nums[i] &lt;= 10^9</code></li>
 * </ul>
 */
@Problem(
    id = 1372,
    name = "check-if-it-is-a-good-array",
    difficulty = Difficulty.HARD,
    tags = {Tag.MATH}
)
public class CheckIfItIsaGoodArray {
}

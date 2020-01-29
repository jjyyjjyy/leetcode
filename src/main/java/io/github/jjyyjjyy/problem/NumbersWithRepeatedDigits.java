package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/numbers-with-repeated-digits/">至少有 1 位重复的数字</a>
 *
 * <p>给定正整数&nbsp;<code>N</code>，返回小于等于 <code>N</code>&nbsp;且具有至少 1 位重复数字的正整数。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>20
 * <strong>输出：</strong>1
 * <strong>解释：</strong>具有至少 1 位重复数字的正数（&lt;= 20）只有 11 。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>100
 * <strong>输出：</strong>10
 * <strong>解释：</strong>具有至少 1 位重复数字的正数（&lt;= 100）有 11，22，33，44，55，66，77，88，99 和 100 。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>1000
 * <strong>输出：</strong>262
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= N &lt;= 10^9</code></li>
 * </ol>
 */
@Problem(
    id = 1057,
    name = "numbers-with-repeated-digits",
    difficulty = Difficulty.HARD,
    tags = {Tag.MATH, Tag.DYNAMIC_PROGRAMMING}
)
public class NumbersWithRepeatedDigits {
}

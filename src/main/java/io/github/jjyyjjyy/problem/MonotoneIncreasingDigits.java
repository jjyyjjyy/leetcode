package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/monotone-increasing-digits/">单调递增的数字</a>
 *
 * <p>给定一个非负整数&nbsp;<code>N</code>，找出小于或等于&nbsp;<code>N</code>&nbsp;的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。</p>
 *
 * <p>（当且仅当每个相邻位数上的数字&nbsp;<code>x</code>&nbsp;和&nbsp;<code>y</code>&nbsp;满足&nbsp;<code>x &lt;= y</code>&nbsp;时，我们称这个整数是单调递增的。）</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> N = 10
 * <strong>输出:</strong> 9
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> N = 1234
 * <strong>输出:</strong> 1234
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入:</strong> N = 332
 * <strong>输出:</strong> 299
 * </pre>
 *
 * <p><strong>说明:</strong> <code>N</code>&nbsp;是在&nbsp;<code>[0, 10^9]</code>&nbsp;范围内的一个整数。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>remove-k-digits</li>
 * </ul>
 */
@Problem(
    id = 738,
    name = "monotone-increasing-digits",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.GREEDY}
)
public class MonotoneIncreasingDigits {
}

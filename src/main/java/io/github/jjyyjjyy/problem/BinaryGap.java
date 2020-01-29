package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/binary-gap/">二进制间距</a>
 *
 * <p>给定一个正整数&nbsp;<code>N</code>，找到并返回 <code>N</code>&nbsp;的二进制表示中两个连续的 1 之间的最长距离。&nbsp;</p>
 *
 * <p>如果没有两个连续的 1，返回 <code>0</code> 。</p>
 *
 * <p>&nbsp;</p>
 *
 * <ul>
 * </ul>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>22
 * <strong>输出：</strong>2
 * <strong>解释：</strong>
 * 22 的二进制是 0b10110 。
 * 在 22 的二进制表示中，有三个 1，组成两对连续的 1 。
 * 第一对连续的 1 中，两个 1 之间的距离为 2 。
 * 第二对连续的 1 中，两个 1 之间的距离为 1 。
 * 答案取两个距离之中最大的，也就是 2 。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>5
 * <strong>输出：</strong>2
 * <strong>解释：</strong>
 * 5 的二进制是 0b101 。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>6
 * <strong>输出：</strong>1
 * <strong>解释：</strong>
 * 6 的二进制是 0b110 。
 * </pre>
 *
 * <p><strong>示例 4：</strong></p>
 *
 * <pre><strong>输入：</strong>8
 * <strong>输出：</strong>0
 * <strong>解释：</strong>
 * 8 的二进制是 0b1000 。
 * 在 8 的二进制表示中没有连续的 1，所以返回 0 。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= N &lt;= 10^9</code></li>
 * </ul>
 */
@Problem(
    id = 899,
    name = "binary-gap",
    difficulty = Difficulty.EASY,
    tags = {Tag.MATH}
)
public class BinaryGap {
}

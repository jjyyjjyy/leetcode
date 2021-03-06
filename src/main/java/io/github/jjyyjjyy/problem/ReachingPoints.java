package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/reaching-points/">到达终点</a>
 *
 * <p>从点&nbsp;<code>(x, y)</code>&nbsp;可以<strong>转换</strong>到&nbsp;<code>(x, x+y)</code>&nbsp; 或者&nbsp;<code>(x+y, y)</code>。</p>
 *
 * <p>给定一个起点&nbsp;<code>(sx, sy)</code>&nbsp;和一个终点&nbsp;<code>(tx, ty)</code>，如果通过一系列的<strong>转换</strong>可以从起点到达终点，则返回 <code>True&nbsp;</code>，否则返回&nbsp;<code>False</code>。</p>
 *
 * <pre>
 * <strong>示例:</strong>
 * <strong>输入:</strong> sx = 1, sy = 1, tx = 3, ty = 5
 * <strong>输出:</strong> True
 * <strong>解释:
 * </strong>可以通过以下一系列<strong>转换</strong>从起点转换到终点：
 * (1, 1) -&gt; (1, 2)
 * (1, 2) -&gt; (3, 2)
 * (3, 2) -&gt; (3, 5)
 *
 * <strong>输入:</strong> sx = 1, sy = 1, tx = 2, ty = 2
 * <strong>输出:</strong> False
 *
 * <strong>输入:</strong> sx = 1, sy = 1, tx = 1, ty = 1
 * <strong>输出:</strong> True
 *
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ul>
 * 	<li><code>sx, sy, tx, ty</code>&nbsp;是范围在&nbsp;<code>[1, 10^9]</code>&nbsp;的整数。</li>
 * </ul>
 */
@Problem(
    id = 796,
    name = "reaching-points",
    difficulty = Difficulty.HARD,
    tags = {Tag.MATH}
)
public class ReachingPoints {
}

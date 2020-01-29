package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/bulb-switcher-ii/">灯泡开关 Ⅱ</a>
 *
 * <p>现有一个房间，墙上挂有&nbsp;<code>n</code>&nbsp;只已经打开的灯泡和 4 个按钮。在进行了&nbsp;<code>m</code>&nbsp;次未知操作后，你需要返回这&nbsp;<code>n</code>&nbsp;只灯泡可能有多少种不同的状态。</p>
 *
 * <p>假设这 <code>n</code> 只灯泡被编号为 [1, 2, 3 ..., n]，这 4 个按钮的功能如下：</p>
 *
 * <ol>
 * 	<li>将所有灯泡的状态反转（即开变为关，关变为开）</li>
 * 	<li>将编号为偶数的灯泡的状态反转</li>
 * 	<li>将编号为奇数的灯泡的状态反转</li>
 * 	<li>将编号为 <code>3k+1</code> 的灯泡的状态反转（k = 0, 1, 2, ...)</li>
 * </ol>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> n = 1, m = 1.
 * <strong>输出:</strong> 2
 * <strong>说明:</strong> 状态为: [开], [关]
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> n = 2, m = 1.
 * <strong>输出:</strong> 3
 * <strong>说明:</strong> 状态为: [开, 关], [关, 开], [关, 关]
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入:</strong> n = 3, m = 1.
 * <strong>输出:</strong> 4
 * <strong>说明:</strong> 状态为: [关, 开, 关], [开, 关, 开], [关, 关, 关], [关, 开, 开].
 * </pre>
 *
 * <p><strong>注意：</strong>&nbsp;<code>n</code>&nbsp;和&nbsp;<code>m</code> 都属于 [0, 1000].</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>bulb-switcher</li>
 * </ul>
 */
@Problem(
    id = 672,
    name = "bulb-switcher-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.MATH}
)
public class BulbSwitcherII {
}

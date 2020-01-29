package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/number-of-ways-to-stay-in-the-same-place-after-some-steps/">停在原地的方案数</a>
 *
 * <p>有一个长度为&nbsp;<code>arrLen</code>&nbsp;的数组，开始有一个指针在索引&nbsp;<code>0</code> 处。</p>
 *
 * <p>每一步操作中，你可以将指针向左或向右移动 1 步，或者停在原地（指针不能被移动到数组范围外）。</p>
 *
 * <p>给你两个整数&nbsp;<code>steps</code> 和&nbsp;<code>arrLen</code> ，请你计算并返回：在恰好执行&nbsp;<code>steps</code>&nbsp;次操作以后，指针仍然指向索引&nbsp;<code>0</code> 处的方案数。</p>
 *
 * <p>由于答案可能会很大，请返回方案数 <strong>模</strong>&nbsp;<code>10^9 + 7</code> 后的结果。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>steps = 3, arrLen = 2
 * <strong>输出：</strong>4
 * <strong>解释：</strong>3 步后，总共有 4 种不同的方法可以停在索引 0 处。
 * 向右，向左，不动
 * 不动，向右，向左
 * 向右，不动，向左
 * 不动，不动，不动
 * </pre>
 *
 * <p><strong>示例&nbsp; 2：</strong></p>
 *
 * <pre><strong>输入：</strong>steps = 2, arrLen = 4
 * <strong>输出：</strong>2
 * <strong>解释：</strong>2 步后，总共有 2 种不同的方法可以停在索引 0 处。
 * 向右，向左
 * 不动，不动
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>steps = 4, arrLen = 2
 * <strong>输出：</strong>8
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= steps &lt;= 500</code></li>
 * 	<li><code>1 &lt;= arrLen&nbsp;&lt;= 10^6</code></li>
 * </ul>
 */
@Problem(
    id = 1398,
    name = "number-of-ways-to-stay-in-the-same-place-after-some-steps",
    difficulty = Difficulty.HARD,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class NumberofWaystoStayintheSamePlaceAfterSomeSteps {
}

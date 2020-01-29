package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/coin-change/">零钱兑换</a>
 *
 * <p>给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回&nbsp;<code>-1</code>。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入: </strong>coins = <code>[1, 2, 5]</code>, amount = <code>11</code>
 * <strong>输出: </strong><code>3</code>
 * <strong>解释:</strong> 11 = 5 + 5 + 1</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入: </strong>coins = <code>[2]</code>, amount = <code>3</code>
 * <strong>输出: </strong>-1</pre>
 *
 * <p><strong>说明</strong>:<br>
 * 你可以认为每种硬币的数量是无限的。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>minimum-cost-for-tickets</li>
 * </ul>
 */
@Problem(
    id = 322,
    name = "coin-change",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class CoinChange {
}

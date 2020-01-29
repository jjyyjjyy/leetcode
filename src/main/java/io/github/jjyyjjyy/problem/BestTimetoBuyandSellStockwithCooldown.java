package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/">最佳买卖股票时机含冷冻期</a>
 *
 * <p>给定一个整数数组，其中第<em>&nbsp;i</em>&nbsp;个元素代表了第&nbsp;<em>i</em>&nbsp;天的股票价格 。​</p>
 *
 * <p>设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:</p>
 *
 * <ul>
 * 	<li>你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。</li>
 * 	<li>卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。</li>
 * </ul>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,2,3,0,2]
 * <strong>输出: </strong>3
 * <strong>解释:</strong> 对应的交易状态为: [买入, 卖出, 冷冻期, 买入, 卖出]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>best-time-to-buy-and-sell-stock</li>
 *   <li>best-time-to-buy-and-sell-stock-ii</li>
 * </ul>
 */
@Problem(
    id = 309,
    name = "best-time-to-buy-and-sell-stock-with-cooldown",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class BestTimetoBuyandSellStockwithCooldown {
}

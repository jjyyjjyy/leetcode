package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/">买卖股票的最佳时机含手续费</a>
 *
 * <p>给定一个整数数组&nbsp;<code>prices</code>，其中第&nbsp;<code>i</code>&nbsp;个元素代表了第&nbsp;<code>i</code>&nbsp;天的股票价格 ；非负整数&nbsp;<code>fee</code> 代表了交易股票的手续费用。</p>
 *
 * <p>你可以无限次地完成交易，但是你每次交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。</p>
 *
 * <p>返回获得利润的最大值。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> prices = [1, 3, 2, 8, 4, 9], fee = 2
 * <strong>输出:</strong> 8
 * <strong>解释:</strong> 能够达到的最大利润:
 * 在此处买入&nbsp;prices[0] = 1
 * 在此处卖出 prices[3] = 8
 * 在此处买入 prices[4] = 4
 * 在此处卖出 prices[5] = 9
 * 总利润:&nbsp;((8 - 1) - 2) + ((9 - 4) - 2) = 8.</pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ul>
 * 	<li><code>0 &lt; prices.length &lt;= 50000</code>.</li>
 * 	<li><code>0 &lt; prices[i] &lt; 50000</code>.</li>
 * 	<li><code>0 &lt;= fee &lt; 50000</code>.</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>best-time-to-buy-and-sell-stock-ii</li>
 * </ul>
 */
@Problem(
    id = 714,
    name = "best-time-to-buy-and-sell-stock-with-transaction-fee",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.GREEDY, Tag.ARRAY, Tag.DYNAMIC_PROGRAMMING}
)
public class BestTimetoBuyandSellStockwithTransactionFee {
}

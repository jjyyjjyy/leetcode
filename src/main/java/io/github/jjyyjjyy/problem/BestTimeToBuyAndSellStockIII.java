package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iii/">买卖股票的最佳时机 III</a>
 *
 * <p>给定一个数组，它的第<em> i</em> 个元素是一支给定的股票在第 <em>i </em>天的价格。</p>
 *
 * <p>设计一个算法来计算你所能获取的最大利润。你最多可以完成&nbsp;<em>两笔&nbsp;</em>交易。</p>
 *
 * <p><strong>注意:</strong>&nbsp;你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> [3,3,5,0,0,3,1,4]
 * <strong>输出:</strong> 6
 * <strong>解释:</strong> 在第 4 天（股票价格 = 0）的时候买入，在第 6 天（股票价格 = 3）的时候卖出，这笔交易所能获得利润 = 3-0 = 3 。
 * &nbsp;    随后，在第 7 天（股票价格 = 1）的时候买入，在第 8 天 （股票价格 = 4）的时候卖出，这笔交易所能获得利润 = 4-1 = 3 。</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,2,3,4,5]
 * <strong>输出:</strong> 4
 * <strong>解释:</strong> 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。 &nbsp;
 * &nbsp;    注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。 &nbsp;
 * &nbsp;    因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入:</strong> [7,6,4,3,1]
 * <strong>输出:</strong> 0
 * <strong>解释:</strong> 在这个情况下, 没有交易完成, 所以最大利润为 0。</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>best-time-to-buy-and-sell-stock</li>
 *   <li>best-time-to-buy-and-sell-stock-ii</li>
 *   <li>best-time-to-buy-and-sell-stock-iv</li>
 *   <li>maximum-sum-of-3-non-overlapping-subarrays</li>
 * </ul>
 */
@Problem(
    id = 123,
    name = "best-time-to-buy-and-sell-stock-iii",
    difficulty = Difficulty.HARD,
    tags = {Tag.ARRAY, Tag.DYNAMIC_PROGRAMMING}
)
public class BestTimeToBuyAndSellStockIII {

    /**
     * buy1 = max(buy1, -prices[i])
     * sell1 = max(sell1, buy1 + prices[i])
     * buy2 = max(buy2, sell1 - prices[i])
     * sell2 = max(sell2, buy2 + prices[i])
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int buy1 = -prices[0];
        int sell1 = 0;
        int buy2 = -prices[0];
        int sell2 = 0;
        for (int i = 1; i < prices.length; i++) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        return sell2;
    }
}

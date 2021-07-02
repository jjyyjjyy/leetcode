package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/maximum-ice-cream-bars/">雪糕的最大数量</a>
 *
 * <p>夏日炎炎，小男孩 Tony 想买一些雪糕消消暑。</p>
 *
 * <p>商店中新到 <code>n</code> 支雪糕，用长度为 <code>n</code> 的数组 <code>costs</code> 表示雪糕的定价，其中 <code>costs[i]</code> 表示第 <code>i</code> 支雪糕的现金价格。Tony 一共有 <code>coins</code> 现金可以用于消费，他想要买尽可能多的雪糕。</p>
 *
 * <p>给你价格数组 <code>costs</code> 和现金量 <code>coins</code> ，请你计算并返回 Tony 用 <code>coins</code> 现金能够买到的雪糕的 <strong>最大数量</strong> 。</p>
 *
 * <p><strong>注意：</strong>Tony 可以按任意顺序购买雪糕。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>costs = [1,3,2,4,1], coins = 7
 * <strong>输出：</strong>4
 * <strong>解释：</strong>Tony 可以买下标为 0、1、2、4 的雪糕，总价为 1 + 3 + 2 + 1 = 7
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>costs = [10,6,8,7,7,8], coins = 5
 * <strong>输出：</strong>0
 * <strong>解释：</strong>Tony 没有足够的钱买任何一支雪糕。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>costs = [1,6,3,1,2,5], coins = 20
 * <strong>输出：</strong>6
 * <strong>解释：</strong>Tony 可以买下所有的雪糕，总价为 1 + 6 + 3 + 1 + 2 + 5 = 18 。
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>costs.length == n</code></li>
 * 	<li><code>1 &lt;= n &lt;= 10<sup>5</sup></code></li>
 * 	<li><code>1 &lt;= costs[i] &lt;= 10<sup>5</sup></code></li>
 * 	<li><code>1 &lt;= coins &lt;= 10<sup>8</sup></code></li>
 * </ul>
 */
@Problem(
    id = 1961,
    name = "maximum-ice-cream-bars",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.GREEDY, Tag.ARRAY, Tag.SORTING}
)
public class MaximumIceCreamBars {

    /**
     * 1. 将数组排序.
     * 2. 遍历数组, 判断当前累计花费加上当前雪糕价格是否大于coins, 如果不大于, 则计数加1.
     */
    @Complexity(Complexity.ComplexityType.O_N_LOG_N)
    public int maxIceCream2(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for (int cost : costs) {
            coins -= cost;
            if (coins < 0) {
                break;
            }
            count++;
        }
        return count;
    }

    /**
     * 计数排序
     */
    @Complexity(Complexity.ComplexityType.O_M_AND_N)
    public int maxIceCream(int[] costs, int coins) {
        int[] counts = new int[100001];
        for (int cost : costs) {
            counts[cost]++;
        }
        int count = 0;
        for (int i = 1; i < 100_001; i++) {
            if (coins < i) {
                break;
            }
            int currentCount = Math.min(counts[i], coins / i);
            count += currentCount;
            coins -= i * currentCount;
        }
        return count;
    }

}

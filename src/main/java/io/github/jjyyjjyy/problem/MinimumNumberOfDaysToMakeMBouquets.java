package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-number-of-days-to-make-m-bouquets/">制作 m 束花所需的最少天数</a>
 *
 * <p>给你一个整数数组 <code>bloomDay</code>，以及两个整数 <code>m</code> 和 <code>k</code> 。</p>
 *
 * <p>现需要制作 <code>m</code> 束花。制作花束时，需要使用花园中 <strong>相邻的 <code>k</code> 朵花</strong> 。</p>
 *
 * <p>花园中有 <code>n</code> 朵花，第 <code>i</code> 朵花会在 <code>bloomDay[i]</code> 时盛开，<strong>恰好</strong> 可以用于 <strong>一束</strong> 花中。</p>
 *
 * <p>请你返回从花园中摘 <code>m</code> 束花需要等待的最少的天数。如果不能摘到 <code>m</code> 束花则返回 <strong>-1</strong> 。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>bloomDay = [1,10,3,10,2], m = 3, k = 1
 * <strong>输出：</strong>3
 * <strong>解释：</strong>让我们一起观察这三天的花开过程，x 表示花开，而 _ 表示花还未开。
 * 现在需要制作 3 束花，每束只需要 1 朵。
 * 1 天后：[x, _, _, _, _]   // 只能制作 1 束花
 * 2 天后：[x, _, _, _, x]   // 只能制作 2 束花
 * 3 天后：[x, _, x, _, x]   // 可以制作 3 束花，答案为 3
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>bloomDay = [1,10,3,10,2], m = 3, k = 2
 * <strong>输出：</strong>-1
 * <strong>解释：</strong>要制作 3 束花，每束需要 2 朵花，也就是一共需要 6 朵花。而花园中只有 5 朵花，无法满足制作要求，返回 -1 。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>bloomDay = [7,7,7,7,12,7,7], m = 2, k = 3
 * <strong>输出：</strong>12
 * <strong>解释：</strong>要制作 2 束花，每束需要 3 朵。
 * 花园在 7 天后和 12 天后的情况如下：
 * 7 天后：[x, x, x, x, _, x, x]
 * 可以用前 3 朵盛开的花制作第一束花。但不能使用后 3 朵盛开的花，因为它们不相邻。
 * 12 天后：[x, x, x, x, x, x, x]
 * 显然，我们可以用不同的方式制作两束花。
 * </pre>
 *
 * <p><strong>示例 4：</strong></p>
 *
 * <pre><strong>输入：</strong>bloomDay = [1000000000,1000000000], m = 1, k = 1
 * <strong>输出：</strong>1000000000
 * <strong>解释：</strong>需要等 1000000000 天才能采到花来制作花束
 * </pre>
 *
 * <p><strong>示例 5：</strong></p>
 *
 * <pre><strong>输入：</strong>bloomDay = [1,10,2,9,3,8,4,7,5,6], m = 4, k = 2
 * <strong>输出：</strong>9
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>bloomDay.length == n</code></li>
 * 	<li><code>1 &lt;= n &lt;= 10^5</code></li>
 * 	<li><code>1 &lt;= bloomDay[i] &lt;= 10^9</code></li>
 * 	<li><code>1 &lt;= m &lt;= 10^6</code></li>
 * 	<li><code>1 &lt;= k &lt;= n</code></li>
 * </ul>
 */
@Problem(
    id = 1605,
    name = "minimum-number-of-days-to-make-m-bouquets",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.BINARY_SEARCH}
)
public class MinimumNumberOfDaysToMakeMBouquets {

    /**
     * 使用二分查找找到最小天数.
     */
    @Complexity(Complexity.ComplexityType.O_N_LOG_N)
    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) {
            return -1;
        }
        int low = 1;
        int high = Arrays.stream(bloomDay).max().getAsInt();
        while (low < high) {
            int days = low + (high - low) / 2;
            if (canMake(bloomDay, days, m, k)) {
                high = days;
            } else {
                low = days + 1;
            }
        }
        return low;
    }

    /**
     * 1. 遍历数组, 如果数据连续一段<=days的元素数量等于k, 则说明这些元素可以变成一束花, 记一次数.
     * 2. 判断花束的数量是否>=m.
     */
    private boolean canMake(int[] bloomDay, int days, int m, int k) {
        int current = 0;
        int flowerCount = 0;
        for (int i = 0; i < bloomDay.length && flowerCount < m; i++) {
            if (bloomDay[i] <= days) {
                current++;
                if (current == k) {
                    flowerCount++;
                    current = 0;
                }
            } else {
                current = 0;
            }
        }
        return flowerCount >= m;
    }
}

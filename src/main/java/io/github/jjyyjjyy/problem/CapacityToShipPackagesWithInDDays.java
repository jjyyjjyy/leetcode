package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/capacity-to-ship-packages-within-d-days/">在 D 天内送达包裹的能力</a>
 *
 * <p>传送带上的包裹必须在 D 天内从一个港口运送到另一个港口。</p>
 *
 * <p>传送带上的第 <code>i</code>&nbsp;个包裹的重量为&nbsp;<code>weights[i]</code>。每一天，我们都会按给出重量的顺序往传送带上装载包裹。我们装载的重量不会超过船的最大运载重量。</p>
 *
 * <p>返回能在 <code>D</code> 天内将传送带上的所有包裹送达的船的最低运载能力。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>weights = [1,2,3,4,5,6,7,8,9,10], D = 5
 * <strong>输出：</strong>15
 * <strong>解释：</strong>
 * 船舶最低载重 15 就能够在 5 天内送达所有包裹，如下所示：
 * 第 1 天：1, 2, 3, 4, 5
 * 第 2 天：6, 7
 * 第 3 天：8
 * 第 4 天：9
 * 第 5 天：10
 *
 * 请注意，货物必须按照给定的顺序装运，因此使用载重能力为 14 的船舶并将包装分成 (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) 是不允许的。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>weights = [3,2,2,4,1,4], D = 3
 * <strong>输出：</strong>6
 * <strong>解释：</strong>
 * 船舶最低载重 6 就能够在 3 天内送达所有包裹，如下所示：
 * 第 1 天：3, 2
 * 第 2 天：2, 4
 * 第 3 天：1, 4
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>weights = [1,2,3,1,1], D = 4
 * <strong>输出：</strong>3
 * <strong>解释：</strong>
 * 第 1 天：1
 * 第 2 天：2
 * 第 3 天：3
 * 第 4 天：1, 1
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= D &lt;= weights.length &lt;= 50000</code></li>
 * 	<li><code>1 &lt;= weights[i] &lt;= 500</code></li>
 * </ol>
 */
@Problem(
    id = 1056,
    name = "capacity-to-ship-packages-within-d-days",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.BINARY_SEARCH}
)
public class CapacityToShipPackagesWithInDDays {

    /**
     * 1. 找到数组最大值, 计算数据之和. 分别为二分查找的左右边界.
     * 2. 计算中间值所需要的天数, 如果小于等于D, 则继续搜索左半部分, 否则搜索右半部分, 直到左右边界重合.
     */
    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(nlog(sumW))")
    public int shipWithinDays(int[] weights, int D) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();

        while (left < right) {
            int mid = left + (right - left) / 2;
            int need = 1;
            int current = 0;
            for (int weight : weights) {
                if (current + weight > mid) {
                    need++;
                    current = 0;
                }
                current += weight;
            }
            if (need <= D) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

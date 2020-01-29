package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-cost-to-merge-stones/">合并石头的最低成本</a>
 *
 * <p>有 <code>N</code> 堆石头排成一排，第 <code>i</code> 堆中有&nbsp;<code>stones[i]</code>&nbsp;块石头。</p>
 *
 * <p>每次<em>移动（move）</em>需要将<strong>连续的</strong>&nbsp;<code>K</code>&nbsp;堆石头合并为一堆，而这个移动的成本为这&nbsp;<code>K</code>&nbsp;堆石头的总数。</p>
 *
 * <p>找出把所有石头合并成一堆的最低成本。如果不可能，返回 <code>-1</code> 。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>stones = [3,2,4,1], K = 2
 * <strong>输出：</strong>20
 * <strong>解释：</strong>
 * 从 [3, 2, 4, 1] 开始。
 * 合并 [3, 2]，成本为 5，剩下 [5, 4, 1]。
 * 合并 [4, 1]，成本为 5，剩下 [5, 5]。
 * 合并 [5, 5]，成本为 10，剩下 [10]。
 * 总成本 20，这是可能的最小值。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>stones = [3,2,4,1], K = 3
 * <strong>输出：</strong>-1
 * <strong>解释：</strong>任何合并操作后，都会剩下 2 堆，我们无法再进行合并。所以这项任务是不可能完成的。.
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>stones = [3,5,1,2,6], K = 3
 * <strong>输出：</strong>25
 * <strong>解释：</strong>
 * 从 [3, 5, 1, 2, 6] 开始。
 * 合并 [5, 1, 2]，成本为 8，剩下 [3, 8, 6]。
 * 合并 [3, 8, 6]，成本为 17，剩下 [17]。
 * 总成本 25，这是可能的最小值。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= stones.length &lt;= 30</code></li>
 * 	<li><code>2 &lt;= K &lt;= 30</code></li>
 * 	<li><code>1 &lt;= stones[i] &lt;= 100</code></li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>burst-balloons</li>
 *   <li>minimum-cost-to-connect-sticks</li>
 * </ul>
 */
@Problem(
    id = 1042,
    name = "minimum-cost-to-merge-stones",
    difficulty = Difficulty.HARD,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class MinimumCosttoMergeStones {
}

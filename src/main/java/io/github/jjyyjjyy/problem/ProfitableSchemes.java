package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/profitable-schemes/">盈利计划</a>
 *
 * <p>帮派里有 G 名成员，他们可能犯下各种各样的罪行。</p>
 *
 * <p>第&nbsp;<code>i</code>&nbsp;种犯罪会产生&nbsp;<code>profit[i]</code>&nbsp;的利润，它要求&nbsp;<code>group[i]</code>&nbsp;名成员共同参与。</p>
 *
 * <p>让我们把这些犯罪的任何子集称为盈利计划，该计划至少产生&nbsp;<code>P</code> 的利润。</p>
 *
 * <p>有多少种方案可以选择？因为答案很大，所以<strong>返回它模&nbsp;</strong><code>10^9 + 7</code><strong>&nbsp;的值</strong>。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例&nbsp;1：</strong></p>
 *
 * <pre><strong>输入：</strong>G = 5, P = 3, group = [2,2], profit = [2,3]
 * <strong>输出：</strong>2
 * <strong>解释： </strong>
 * 至少产生 3 的利润，该帮派可以犯下罪 0 和罪 1 ，或仅犯下罪 1 。
 * 总的来说，有两种方案。
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入：</strong>G = 10, P = 5, group = [2,3,5], profit = [6,7,8]
 * <strong>输出：</strong>7
 * <strong>解释：</strong>
 * 至少产生 5 的利润，只要他们犯其中一种罪就行，所以该帮派可以犯下任何罪行 。
 * 有 7 种可能的计划：(0)，(1)，(2)，(0,1)，(0,2)，(1,2)，以及 (0,1,2) 。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= G &lt;= 100</code></li>
 * 	<li><code>0 &lt;= P &lt;= 100</code></li>
 * 	<li><code>1 &lt;= group[i] &lt;= 100</code></li>
 * 	<li><code>0 &lt;= profit[i] &lt;= 100</code></li>
 * 	<li><code>1 &lt;= group.length = profit.length &lt;= 100</code></li>
 * </ol>
 *
 * <p>&nbsp;</p>
 */
@Problem(
    id = 911,
    name = "profitable-schemes",
    difficulty = Difficulty.HARD,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class ProfitableSchemes {

    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(len×n×minProfit)")
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int[][] dp = new int[n + 1][minProfit + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        int len = group.length, MOD = (int) 1e9 + 7;
        for (int i = 1; i <= len; i++) {
            int members = group[i - 1], earn = profit[i - 1];
            for (int j = n; j >= members; j--) {
                for (int k = minProfit; k >= 0; k--) {
                    dp[j][k] = (dp[j][k] + dp[j - members][Math.max(0, k - earn)]) % MOD;
                }
            }
        }
        return dp[n][minProfit];
    }
}

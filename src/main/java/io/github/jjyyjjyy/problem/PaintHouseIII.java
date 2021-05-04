package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/paint-house-iii/">粉刷房子 III</a>
 *
 * <p>在一个小城市里，有&nbsp;<code>m</code>&nbsp;个房子排成一排，你需要给每个房子涂上 <code>n</code>&nbsp;种颜色之一（颜色编号为 <code>1</code> 到 <code>n</code>&nbsp;）。有的房子去年夏天已经涂过颜色了，所以这些房子不需要被重新涂色。</p>
 *
 * <p>我们将连续相同颜色尽可能多的房子称为一个街区。（比方说 <code>houses = [1,2,2,3,3,2,1,1]</code> ，它包含 5 个街区&nbsp;<code> [{1}, {2,2}, {3,3}, {2}, {1,1}]</code> 。）</p>
 *
 * <p>给你一个数组&nbsp;<code>houses</code>&nbsp;，一个&nbsp;<code>m * n</code>&nbsp;的矩阵&nbsp;<code>cost</code>&nbsp;和一个整数&nbsp;<code>target</code>&nbsp;，其中：</p>
 *
 * <ul>
 * 	<li><code>houses[i]</code>：是第&nbsp;<code>i</code>&nbsp;个房子的颜色，<strong>0</strong>&nbsp;表示这个房子还没有被涂色。</li>
 * 	<li><code>cost[i][j]</code>：是将第&nbsp;<code>i</code>&nbsp;个房子涂成颜色&nbsp;<code>j+1</code>&nbsp;的花费。</li>
 * </ul>
 *
 * <p>请你返回房子涂色方案的最小总花费，使得每个房子都被涂色后，恰好组成&nbsp;<code>target</code>&nbsp;个街区。如果没有可用的涂色方案，请返回&nbsp;<strong>-1</strong>&nbsp;。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>houses = [0,0,0,0,0], cost = [[1,10],[10,1],[10,1],[1,10],[5,1]], m = 5, n = 2, target = 3
 * <strong>输出：</strong>9
 * <strong>解释：</strong>房子涂色方案为 [1,2,2,1,1]
 * 此方案包含 target = 3 个街区，分别是 [{1}, {2,2}, {1,1}]。
 * 涂色的总花费为 (1 + 1 + 1 + 1 + 5) = 9。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>houses = [0,2,1,2,0], cost = [[1,10],[10,1],[10,1],[1,10],[5,1]], m = 5, n = 2, target = 3
 * <strong>输出：</strong>11
 * <strong>解释：</strong>有的房子已经被涂色了，在此基础上涂色方案为 [2,2,1,2,2]
 * 此方案包含 target = 3 个街区，分别是 [{2,2}, {1}, {2,2}]。
 * 给第一个和最后一个房子涂色的花费为 (10 + 1) = 11。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>houses = [0,0,0,0,0], cost = [[1,10],[10,1],[1,10],[10,1],[1,10]], m = 5, n = 2, target = 5
 * <strong>输出：</strong>5
 * </pre>
 *
 * <p><strong>示例 4：</strong></p>
 *
 * <pre><strong>输入：</strong>houses = [3,1,2,3], cost = [[1,1,1],[1,1,1],[1,1,1],[1,1,1]], m = 4, n = 3, target = 3
 * <strong>输出：</strong>-1
 * <strong>解释：</strong>房子已经被涂色并组成了 4 个街区，分别是 [{3},{1},{2},{3}] ，无法形成 target = 3 个街区。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>m == houses.length == cost.length</code></li>
 * 	<li><code>n == cost[i].length</code></li>
 * 	<li><code>1 &lt;= m &lt;= 100</code></li>
 * 	<li><code>1 &lt;= n &lt;= 20</code></li>
 * 	<li><code>1 &lt;= target&nbsp;&lt;= m</code></li>
 * 	<li><code>0 &lt;= houses[i]&nbsp;&lt;= n</code></li>
 * 	<li><code>1 &lt;= cost[i][j] &lt;= 10^4</code></li>
 * </ul>
 */
@Problem(
    id = 1583,
    name = "paint-house-iii",
    difficulty = Difficulty.HARD,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class PaintHouseIII {

    private static final int INFTY = Integer.MAX_VALUE / 2;

    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(m*n*target)")
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        // 将颜色调整为从 0 开始编号，没有被涂色标记为 -1
        for (int i = 0; i < m; ++i) {
            --houses[i];
        }

        // dp 所有元素初始化为极大值
        int[][][] dp = new int[m][n][target];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                Arrays.fill(dp[i][j], INFTY);
            }
        }
        int[][][] best = new int[m][target][3];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < target; ++j) {
                best[i][j][0] = best[i][j][2] = INFTY;
                best[i][j][1] = -1;
            }
        }

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (houses[i] != -1 && houses[i] != j) {
                    continue;
                }

                for (int k = 0; k < target; ++k) {
                    if (i == 0) {
                        if (k == 0) {
                            dp[i][j][k] = 0;
                        }
                    } else {
                        dp[i][j][k] = dp[i - 1][j][k];
                        if (k > 0) {
                            // 使用 best(i-1,k-1) 直接得到 dp(i,j,k) 的值
                            int first = best[i - 1][k - 1][0];
                            int firstIdx = best[i - 1][k - 1][1];
                            int second = best[i - 1][k - 1][2];
                            dp[i][j][k] = Math.min(dp[i][j][k], (j == firstIdx ? second : first));
                        }
                    }

                    if (dp[i][j][k] != INFTY && houses[i] == -1) {
                        dp[i][j][k] += cost[i][j];
                    }

                    // 用 dp(i,j,k) 更新 best(i,k)
                    int first = best[i][k][0];
                    int second = best[i][k][2];
                    if (dp[i][j][k] < first) {
                        best[i][k][2] = first;
                        best[i][k][0] = dp[i][j][k];
                        best[i][k][1] = j;
                    } else if (dp[i][j][k] < second) {
                        best[i][k][2] = dp[i][j][k];
                    }
                }
            }
        }

        int ans = INFTY;
        for (int j = 0; j < n; ++j) {
            ans = Math.min(ans, dp[m - 1][j][target - 1]);
        }
        return ans == INFTY ? -1 : ans;
    }
}

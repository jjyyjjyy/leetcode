package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-path-sum/">最小路径和</a>
 *
 * <p>给定一个包含非负整数的 <em>m</em>&nbsp;x&nbsp;<em>n</em>&nbsp;网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。</p>
 *
 * <p><strong>说明：</strong>每次只能向下或者向右移动一步。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * [
 * &nbsp; [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * <strong>输出:</strong> 7
 * <strong>解释:</strong> 因为路径 1&rarr;3&rarr;1&rarr;1&rarr;1 的总和最小。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>unique-paths</li>
 *   <li>dungeon-game</li>
 *   <li>cherry-pickup</li>
 * </ul>
 */
@Problem(
    id = 64,
    name = "minimum-path-sum",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.DYNAMIC_PROGRAMMING}
)
public class MinimumPathSum {

    /**
     * dp[i][j] = Math.min(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
     */
    @Complexity(Complexity.ComplexityType.O_M_N)
    public int minPathSum(int[][] grid) {

        int m = grid.length;
        if (m == 0) {
            return 0;
        }
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];

        for (int i = 1; i < m; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }
        for (int i = 1; i < n; i++) {
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/unique-paths/">不同路径</a>
 *
 * <p>一个机器人位于一个 <em>m x n </em>网格的左上角 （起始点在下图中标记为&ldquo;Start&rdquo; ）。</p>
 *
 * <p>机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为&ldquo;Finish&rdquo;）。</p>
 *
 * <p>问总共有多少条不同的路径？</p>
 *
 * <p><img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/22/robot_maze.png"></p>
 *
 * <p><small>例如，上图是一个7 x 3 的网格。有多少可能的路径？</small></p>
 *
 * <p><strong>说明：</strong><em>m</em>&nbsp;和 <em>n </em>的值均不超过 100。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> m = 3, n = 2
 * <strong>输出:</strong> 3
 * <strong>解释:</strong>
 * 从左上角开始，总共有 3 条路径可以到达右下角。
 * 1. 向右 -&gt; 向右 -&gt; 向下
 * 2. 向右 -&gt; 向下 -&gt; 向右
 * 3. 向下 -&gt; 向右 -&gt; 向右
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> m = 7, n = 3
 * <strong>输出:</strong> 28</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>unique-paths-ii</li>
 *   <li>minimum-path-sum</li>
 *   <li>dungeon-game</li>
 * </ul>
 */
@Problem(
    id = 62,
    name = "unique-paths",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.DYNAMIC_PROGRAMMING}
)
public class UniquePaths {

    /**
     * a[m][n] = a[m - 1][n] + a[m][n - 1]
     */
    @Complexity(Complexity.ComplexityType.O_M_N)
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    public int uniquePaths1(int m, int n) {
        return uniquePaths1(m, n, 0, 0, 0);
    }

    private int uniquePaths1(int m, int n, int row, int column, int count) {
        if (row == m - 1 && column == n - 1) {
            return ++count;
        }
        if (row < m) {
            count = uniquePaths1(m, n, row + 1, column, count);
        }
        if (column < n) {
            count = uniquePaths1(m, n, row, column + 1, count);
        }
        return count;
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/perfect-squares/">完全平方数</a>
 *
 * <p>给定正整数&nbsp;<em>n</em>，找到若干个完全平方数（比如&nbsp;<code>1, 4, 9, 16, ...</code>）使得它们的和等于<em> n</em>。你需要让组成和的完全平方数的个数最少。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> <em>n</em> = <code>12</code>
 * <strong>输出:</strong> 3
 * <strong>解释: </strong><code>12 = 4 + 4 + 4.</code></pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> <em>n</em> = <code>13</code>
 * <strong>输出:</strong> 2
 * <strong>解释: </strong><code>13 = 4 + 9.</code></pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>count-primes</li>
 *   <li>ugly-number-ii</li>
 * </ul>
 */
@Problem(
    id = 279,
    name = "perfect-squares",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BREADTH_FIRST_SEARCH, Tag.MATH, Tag.DYNAMIC_PROGRAMMING}
)
public class PerfectSquares {

    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(n*sqrtn)")
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                minn = Math.min(minn, dp[i - j * j]);
            }
            dp[i] = minn + 1;
        }
        return dp[n];
    }
}

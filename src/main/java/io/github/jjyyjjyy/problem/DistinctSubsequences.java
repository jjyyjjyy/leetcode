package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/distinct-subsequences/">不同的子序列</a>
 *
 * <p>给定一个字符串&nbsp;<strong>S&nbsp;</strong>和一个字符串&nbsp;<strong>T</strong>，计算在 <strong>S</strong> 的子序列中 <strong>T</strong> 出现的个数。</p>
 *
 * <p>一个字符串的一个子序列是指，通过删除一些（也可以不删除）字符且不干扰剩余字符相对位置所组成的新字符串。（例如，<code>&quot;ACE&quot;</code>&nbsp;是&nbsp;<code>&quot;ABCDE&quot;</code>&nbsp;的一个子序列，而&nbsp;<code>&quot;AEC&quot;</code>&nbsp;不是）</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入: </strong>S = <code>&quot;rabbbit&quot;</code>, T = <code>&quot;rabbit&quot;
 * <strong>输出:</strong>&nbsp;3
 * </code><strong>解释:
 * </strong>
 * 如下图所示, 有 3 种可以从 S 中得到 <code>&quot;rabbit&quot; 的方案</code>。
 * (上箭头符号 ^ 表示选取的字母)
 *
 * <code>rabbbit</code>
 * ^^^^ ^^
 * <code>rabbbit</code>
 * ^^ ^^^^
 * <code>rabbbit</code>
 * ^^^ ^^^
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入: </strong>S = <code>&quot;babgbag&quot;</code>, T = <code>&quot;bag&quot;
 * <strong>输出:</strong>&nbsp;5
 * </code><strong>解释:
 * </strong>
 * 如下图所示, 有 5 种可以从 S 中得到 <code>&quot;bag&quot; 的方案</code>。
 * (上箭头符号 ^ 表示选取的字母)
 *
 * <code>babgbag</code>
 * ^^ ^
 * <code>babgbag</code>
 * ^^    ^
 * <code>babgbag</code>
 * ^    ^^
 * <code>babgbag</code>
 *   ^  ^^
 * <code>babgbag</code>
 *     ^^^</pre>
 */
@Problem(
    id = 115,
    name = "distinct-subsequences",
    difficulty = Difficulty.HARD,
    tags = {Tag.STRING, Tag.DYNAMIC_PROGRAMMING}
)
public class DistinctSubsequences {

    /**
     * 1. 维护一个二维dp数组(m+1 x n+1), dp[i][j]标识 s[i:]中有多少个t[j:]的子序列.
     * 2. 最后一列标识t为空字符串, 所以第j列全为1.
     * 3. 从下往上, 从右到左遍历:
     * 3.1. 如果s[i]和t[j]不相等, 那么s[i]和s[i+1]的子序列相等, 此时dp[i][j]=dp[i+1][j].
     * 3.2. 如果s[i]和t[j]相等, 此时dp[i][j]=dp[i+1][j]+dp[i+1][j+1].
     */
    @Complexity(Complexity.ComplexityType.O_M_N)
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m < n) {
            return 0;
        }

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            dp[i][n] = 1;
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = dp[i + 1][j] + dp[i + 1][j + 1];
                } else {
                    dp[i][j] = dp[i + 1][j];

                }
            }
        }
        return dp[0][0];
    }
}

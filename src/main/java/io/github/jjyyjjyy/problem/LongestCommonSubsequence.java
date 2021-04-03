package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/longest-common-subsequence/">最长公共子序列</a>
 *
 * <p>给定两个字符串&nbsp;<code>text1</code> 和&nbsp;<code>text2</code>，返回这两个字符串的最长公共子序列。</p>
 *
 * <p>一个字符串的&nbsp;<em>子序列&nbsp;</em>是指这样一个新的字符串：它是由原字符串在不改变字符的相对顺序的情况下删除某些字符（也可以不删除任何字符）后组成的新字符串。<br>
 * 例如，&quot;ace&quot; 是 &quot;abcde&quot; 的子序列，但 &quot;aec&quot; 不是 &quot;abcde&quot; 的子序列。两个字符串的「公共子序列」是这两个字符串所共同拥有的子序列。</p>
 *
 * <p>若这两个字符串没有公共子序列，则返回 0。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入：</strong>text1 = &quot;abcde&quot;, text2 = &quot;ace&quot;
 * <strong>输出：</strong>3
 * <strong>解释：</strong>最长公共子序列是 &quot;ace&quot;，它的长度为 3。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入：</strong>text1 = &quot;abc&quot;, text2 = &quot;abc&quot;
 * <strong>输出：</strong>3
 * <strong>解释：</strong>最长公共子序列是 &quot;abc&quot;，它的长度为 3。
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入：</strong>text1 = &quot;abc&quot;, text2 = &quot;def&quot;
 * <strong>输出：</strong>0
 * <strong>解释：</strong>两个字符串没有公共子序列，返回 0。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示:</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= text1.length &lt;= 1000</code></li>
 * 	<li><code>1 &lt;= text2.length &lt;= 1000</code></li>
 * 	<li>输入的字符串只含有小写英文字符。</li>
 * </ul>
 */
@Problem(
    id = 1250,
    name = "longest-common-subsequence",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class LongestCommonSubsequence {

    /**
     * 1. 创建一个二维数组, 存储当前位置的最长公共子序列.
     * 2. 遍历两个字符串:
     * 2.1. 如果当前字符相等, 则当前的最长子序列大小等于前一位加上1, 即dp[i-1][j-1]+1.
     * 2.2. 如果当前字符不相等, 则当前的最长子序列大小等于前一位长度的最大值, 即max(dp[i-1][j],dp[i][j-1]).
     */
    @Complexity(Complexity.ComplexityType.O_M_N)
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            char c1 = text1.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                char c2 = text2.charAt(j - 1);
                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}

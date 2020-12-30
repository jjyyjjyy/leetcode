package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/regular-expression-matching/">正则表达式匹配</a>
 *
 * <p>给你一个字符串&nbsp;<code>s</code>&nbsp;和一个字符规律&nbsp;<code>p</code>，请你来实现一个支持 <code>&#39;.&#39;</code>&nbsp;和&nbsp;<code>&#39;*&#39;</code>&nbsp;的正则表达式匹配。</p>
 *
 * <pre>&#39;.&#39; 匹配任意单个字符
 * &#39;*&#39; 匹配零个或多个前面的那一个元素
 * </pre>
 *
 * <p>所谓匹配，是要涵盖&nbsp;<strong>整个&nbsp;</strong>字符串&nbsp;<code>s</code>的，而不是部分字符串。</p>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ul>
 * 	<li><code>s</code>&nbsp;可能为空，且只包含从&nbsp;<code>a-z</code>&nbsp;的小写字母。</li>
 * 	<li><code>p</code>&nbsp;可能为空，且只包含从&nbsp;<code>a-z</code>&nbsp;的小写字母，以及字符&nbsp;<code>.</code>&nbsp;和&nbsp;<code>*</code>。</li>
 * </ul>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * s = &quot;aa&quot;
 * p = &quot;a&quot;
 * <strong>输出:</strong> false
 * <strong>解释:</strong> &quot;a&quot; 无法匹配 &quot;aa&quot; 整个字符串。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * s = &quot;aa&quot;
 * p = &quot;a*&quot;
 * <strong>输出:</strong> true
 * <strong>解释:</strong>&nbsp;因为 &#39;*&#39; 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 &#39;a&#39;。因此，字符串 &quot;aa&quot; 可被视为 &#39;a&#39; 重复了一次。
 * </pre>
 *
 * <p><strong>示例&nbsp;3:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * s = &quot;ab&quot;
 * p = &quot;.*&quot;
 * <strong>输出:</strong> true
 * <strong>解释:</strong>&nbsp;&quot;.*&quot; 表示可匹配零个或多个（&#39;*&#39;）任意字符（&#39;.&#39;）。
 * </pre>
 *
 * <p><strong>示例 4:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * s = &quot;aab&quot;
 * p = &quot;c*a*b&quot;
 * <strong>输出:</strong> true
 * <strong>解释:</strong>&nbsp;因为 &#39;*&#39; 表示零个或多个，这里 &#39;c&#39; 为 0 个, &#39;a&#39; 被重复一次。因此可以匹配字符串 &quot;aab&quot;。
 * </pre>
 *
 * <p><strong>示例 5:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * s = &quot;mississippi&quot;
 * p = &quot;mis*is*p*.&quot;
 * <strong>输出:</strong> false</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>wildcard-matching</li>
 * </ul>
 */
@Problem(
    id = 10,
    name = "regular-expression-matching",
    difficulty = Difficulty.HARD,
    tags = {Tag.STRING, Tag.DYNAMIC_PROGRAMMING, Tag.BACKTRACKING}
)
public class RegularExpressionMatching {

    /**
     * 1. 使用一个二维数组dp来保存s中m个字符与p中n个字符是否匹配:
     * 1.1. 数组长度初始化为[m+1][n+1].
     * 1.2. dp[0][0]初始化为true, 因为空串与空串可以匹配上.
     * 1.3. dp第0列第行下的行均为false, dp第0行第0列右的每一列如果是普通字符为false, 如果为*号为上一个dp匹配结果(c*与空串是匹配的, 从而直接取dp[0][0]的匹配结果).
     * 2. 依次从上往下, 从左往右遍历数组:
     * 2.1. 如果s[i]==p[j], 那么dp[i][j]=dp[i-1][j-1].
     * 2.2. 如果p[j]为*号(*号代表前一个字符可以重复0次或多次):
     * 2.2.1. [重复0次的情况] 如果s[i]!=p[j-1], 因为*号表示p[j-1]是可以省略的, 所以需要匹配s[i]和[j-2], 之前循环已经匹配过了, 所以直接取前两步的匹配结果: dp[i][j]=dp[i][j-2].
     * 2.2.2. [重复1次的情况] 如果s[i]==p[j-1], 那么直接取前一次的匹配结果: dp[i][j]=dp[i][j-2].
     * 2.2.3. [重复多次的情况] 如果s[i]==p[j-1], 那么直接取s上一个字符的匹配结果: dp[i][j]=dp[i-j][j].
     * 3. 最后dp[m][n]即为匹配结果.
     */
    @Complexity(Complexity.ComplexityType.O_M_N)
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        int sLength = s.length();
        int pLength = p.length();

        boolean[][] dp = new boolean[sLength + 1][pLength + 1];
        dp[0][0] = true;
        for (int i = 1; i <= pLength; i++) {
            dp[0][i] = p.charAt(i - 1) == '*' && dp[0][i - 2];
        }

        for (int i = 1; i <= sLength; i++) {
            for (int j = 1; j <= pLength; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    if (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.') {
                        dp[i][j] = dp[i][j - 2] || dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i][j - 2];
                    }
                }
                // 此处省略 else dp[i][j]=false, 因为boolean数组元素默认初始化值就是false.
            }
        }

        return dp[sLength][pLength];
    }
}

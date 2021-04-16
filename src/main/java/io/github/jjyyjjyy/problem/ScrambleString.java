package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <a href="https://leetcode-cn.com/problems/scramble-string/">扰乱字符串</a>
 *
 * <p>给定一个字符串&nbsp;<em>s1</em>，我们可以把它递归地分割成两个非空子字符串，从而将其表示为二叉树。</p>
 *
 * <p>下图是字符串&nbsp;<em>s1</em>&nbsp;=&nbsp;<code>&quot;great&quot;</code>&nbsp;的一种可能的表示形式。</p>
 *
 * <pre>    great
 *    /    \
 *   gr    eat
 *  / \    /  \
 * g   r  e   at
 *            / \
 *           a   t
 * </pre>
 *
 * <p>在扰乱这个字符串的过程中，我们可以挑选任何一个非叶节点，然后交换它的两个子节点。</p>
 *
 * <p>例如，如果我们挑选非叶节点&nbsp;<code>&quot;gr&quot;</code>&nbsp;，交换它的两个子节点，将会产生扰乱字符串&nbsp;<code>&quot;rgeat&quot;</code>&nbsp;。</p>
 *
 * <pre>    rgeat
 *    /    \
 *   rg    eat
 *  / \    /  \
 * r   g  e   at
 *            / \
 *           a   t
 * </pre>
 *
 * <p>我们将&nbsp;<code>&quot;rgeat&rdquo;</code>&nbsp;称作&nbsp;<code>&quot;great&quot;</code>&nbsp;的一个扰乱字符串。</p>
 *
 * <p>同样地，如果我们继续交换节点&nbsp;<code>&quot;eat&quot;</code>&nbsp;和&nbsp;<code>&quot;at&quot;</code>&nbsp;的子节点，将会产生另一个新的扰乱字符串&nbsp;<code>&quot;rgtae&quot;</code>&nbsp;。</p>
 *
 * <pre>    rgtae
 *    /    \
 *   rg    tae
 *  / \    /  \
 * r   g  ta  e
 *        / \
 *       t   a
 * </pre>
 *
 * <p>我们将&nbsp;<code>&quot;rgtae&rdquo;</code>&nbsp;称作&nbsp;<code>&quot;great&quot;</code>&nbsp;的一个扰乱字符串。</p>
 *
 * <p>给出两个长度相等的字符串 <em>s1 </em>和&nbsp;<em>s2</em>，判断&nbsp;<em>s2&nbsp;</em>是否是&nbsp;<em>s1&nbsp;</em>的扰乱字符串。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> s1 = &quot;great&quot;, s2 = &quot;rgeat&quot;
 * <strong>输出:</strong> true
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> s1 = &quot;abcde&quot;, s2 = &quot;caebd&quot;
 * <strong>输出:</strong> false</pre>
 */
@Problem(
    id = 87,
    name = "scramble-string",
    difficulty = Difficulty.HARD,
    tags = {Tag.STRING, Tag.DYNAMIC_PROGRAMMING}
)
public class ScrambleString {

    @Complexity(Complexity.ComplexityType.O_N_POW_4)
    public boolean isScramble(String s1, String s2) {
        int n = s1.length();
        int[][][] dp = new int[n][n][n + 1];
        return dfs(dp, s1, s2, 0, 0, n);
    }

    private boolean dfs(int[][][] dp, String s1, String s2, int i1, int i2, int n) {
        if (dp[i1][i2][n] != 0) {
            return dp[i1][i2][n] == 1;
        }
        String s1Sub = s1.substring(i1, i1 + n);
        String s2Sub = s2.substring(i2, i2 + n);
        if (Objects.equals(s1Sub, s2Sub)) {
            dp[i1][i2][n] = 1;
            return true;
        }
        if (!isSimilar(s1Sub, s2Sub)) {
            dp[i1][i2][n] = -1;
            return false;
        }
        for (int i = 1; i < n; i++) {
            if (dfs(dp, s1, s2, i1, i2, i) && dfs(dp, s1, s2, i1 + i, i2 + i, n - i)
                || dfs(dp, s1, s2, i1, i2 + n - i, i) && dfs(dp, s1, s2, i1 + i, i2, n - i)) {
                dp[i1][i2][n] = 1;
                return true;
            }
        }
        dp[i1][i2][n] = -1;
        return false;
    }

    private boolean isSimilar(String s1Sub, String s2Sub) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s1Sub.length(); i++) {
            count.put(s1Sub.charAt(i), count.getOrDefault(s1Sub.charAt(i), 0) + 1);
            count.put(s2Sub.charAt(i), count.getOrDefault(s2Sub.charAt(i), 0) - 1);
        }
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}

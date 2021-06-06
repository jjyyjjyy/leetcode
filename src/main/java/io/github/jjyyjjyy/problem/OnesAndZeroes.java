package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/ones-and-zeroes/">一和零</a>
 *
 * <p>在计算机界中，我们总是追求用有限的资源获取最大的收益。</p>
 *
 * <p>现在，假设你分别支配着 <strong>m</strong> 个&nbsp;<code>0</code>&nbsp;和 <strong>n</strong> 个&nbsp;<code>1</code>。另外，还有一个仅包含&nbsp;<code>0</code>&nbsp;和&nbsp;<code>1</code>&nbsp;字符串的数组。</p>
 *
 * <p>你的任务是使用给定的&nbsp;<strong>m</strong> 个&nbsp;<code>0</code>&nbsp;和 <strong>n</strong> 个&nbsp;<code>1</code>&nbsp;，找到能拼出存在于数组中的字符串的最大数量。每个&nbsp;<code>0</code>&nbsp;和&nbsp;<code>1</code>&nbsp;至多被使用<strong>一次</strong>。</p>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li>给定&nbsp;<code>0</code>&nbsp;和&nbsp;<code>1</code>&nbsp;的数量都不会超过&nbsp;<code>100</code>。</li>
 * 	<li>给定字符串数组的长度不会超过&nbsp;<code>600</code>。</li>
 * </ol>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> Array = {&quot;10&quot;, &quot;0001&quot;, &quot;111001&quot;, &quot;1&quot;, &quot;0&quot;}, m = 5, n = 3
 * <strong>输出:</strong> 4
 *
 * <strong>解释:</strong> 总共 4 个字符串可以通过 5 个 0 和 3 个 1 拼出，即 &quot;10&quot;,&quot;0001&quot;,&quot;1&quot;,&quot;0&quot; 。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> Array = {&quot;10&quot;, &quot;0&quot;, &quot;1&quot;}, m = 1, n = 1
 * <strong>输出:</strong> 2
 *
 * <strong>解释:</strong> 你可以拼出 &quot;10&quot;，但之后就没有剩余数字了。更好的选择是拼出 &quot;0&quot; 和 &quot;1&quot; 。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>non-negative-integers-without-consecutive-ones</li>
 * </ul>
 */
@Problem(
    id = 474,
    name = "ones-and-zeroes",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class OnesAndZeroes {

    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(lmn+L)")
    public int findMaxForm(String[] strs, int m, int n) {
        int length = strs.length;
        int[][][] dp = new int[length + 1][m + 1][n + 1];
        for (int i = 1; i <= length; i++) {
            int[] zerosOnes = getZerosOnes(strs[i - 1]);
            int zeros = zerosOnes[0], ones = zerosOnes[1];
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[i][j][k] = dp[i - 1][j][k];
                    if (j >= zeros && k >= ones) {
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i - 1][j - zeros][k - ones] + 1);
                    }
                }
            }
        }
        return dp[length][m][n];
    }

    public int[] getZerosOnes(String str) {
        int[] zerosOnes = new int[2];
        int length = str.length();
        for (int i = 0; i < length; i++) {
            zerosOnes[str.charAt(i) - '0']++;
        }
        return zerosOnes;
    }
}

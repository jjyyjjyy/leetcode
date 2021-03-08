package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/palindrome-partitioning-ii/">分割回文串 II</a>
 *
 * <p>给定一个字符串 <em>s</em>，将 <em>s</em> 分割成一些子串，使每个子串都是回文串。</p>
 *
 * <p>返回符合要求的最少分割次数。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong>&nbsp;&quot;aab&quot;
 * <strong>输出:</strong> 1
 * <strong>解释: </strong>进行一次分割就可将&nbsp;<em>s </em>分割成 [&quot;aa&quot;,&quot;b&quot;] 这样两个回文子串。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>palindrome-partitioning</li>
 * </ul>
 */
@Problem(
    id = 132,
    name = "palindrome-partitioning-ii",
    difficulty = Difficulty.HARD,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class PalindromePartitioningII {

    /**
     * 1. 先计算出从i到j是否是回文字符串.
     * 2. 遍历字符串, 创建一个dp数组, 维护每一位的分割次数:
     * 2.1. 如果0~i是回文串, 那么不需要分割, 分割次数为0.
     * 2.2. 从0遍历到当前位置, 如果j+1~i是回文串, 那么i的分割次数等于j的分割次数+1.
     * 3. dp数组的最后一位即为整个字符串的分割次数.
     */
    @Complexity(Complexity.ComplexityType.O_N_POW_2)
    public int minCut(String s) {
        int n = s.length();

        boolean[][] f = new boolean[n][n];
        for (boolean[] booleans : f) {
            Arrays.fill(booleans, true);
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                f[i][j] = s.charAt(i) == s.charAt(j) && f[i + 1][j - 1];
            }
        }

        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            if (f[0][i]) {
                dp[i] = 0;
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (f[j + 1][i]) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[n - 1];
    }
}

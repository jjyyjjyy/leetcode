package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/longest-palindromic-substring/">最长回文子串</a>
 *
 * <p>给定一个字符串 <code>s</code>，找到 <code>s</code> 中最长的回文子串。你可以假设&nbsp;<code>s</code> 的最大长度为 1000。</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;babad&quot;
 * <strong>输出:</strong> &quot;bab&quot;
 * <strong>注意:</strong> &quot;aba&quot; 也是一个有效答案。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;cbbd&quot;
 * <strong>输出:</strong> &quot;bb&quot;
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>shortest-palindrome</li>
 *   <li>palindrome-permutation</li>
 *   <li>palindrome-pairs</li>
 *   <li>longest-palindromic-subsequence</li>
 *   <li>palindromic-substrings</li>
 * </ul>
 */
@Problem(
    id = 5,
    name = "longest-palindromic-substring",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STRING, Tag.DYNAMIC_PROGRAMMING}
)
public class LongestPalindromicSubstring {

    /**
     * 遍历字符串, 从当前位置向左右两端扩散找到最长的回文子串, 比较并记录下来最大长度和回文子串起始位置.
     * 因为回文子串长度可能是奇数, 也可能是偶数, 所以要针对两种情况扩散寻找两次.
     */
    @Complexity(Complexity.ComplexityType.O_N_POW_2)
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) {
            return s;
        }
        int max = 1;
        int start = 0;

        for (int i = 0; i < n - 1; i++) {
            int oddLength = expand(s, i, i);
            int evenLength = expand(s, i, i + 1);
            int maxLength = Math.max(oddLength, evenLength);
            if (maxLength > max) {
                max = maxLength;
                start = i - (max - 1) / 2;
            }
        }

        return s.substring(start, start + max);
    }

    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            } else {
                break;
            }
        }
        // 减2是因为当前left, right所在字符并不相等.
        return right - left + 1 - 2;
    }

    /**
     * 当子串两端的字符相等时, 如果内部是回文串, 则当前子串也是回文串.
     * 即 dp[i][j]=s[i]==s[j]&&dp[i+1][j-1].
     * 所以使用二维数组记录内部子串的状态, 数组从上向下, 从左到右遍历来设置当前子串状态.
     */
    @Complexity(Complexity.ComplexityType.O_N_POW_2)
    public String longestPalindrome2(String s) {
        int n = s.length();
        if (n < 2) {
            return s;
        }
        int max = 1;
        int start = 0;
        boolean[][] dp = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = true;
            }
        }

        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                int currentLength = j - i + 1;
                dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
                if (dp[i][j] && currentLength > max) {
                    max = currentLength;
                    start = i;
                }
            }
        }
        return s.substring(start, start + max);
    }


    /**
     * 遍历字符串, 依次找到从当前位置开始的回文子串, 记录最长的起始位置和长度.
     */
    @Complexity(Complexity.ComplexityType.O_N_POW_3)
    public String longestPalindrome3(String s) {
        int n = s.length();
        if (n < 2) {
            return s;
        }
        int max = 1;
        int start = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int length = j - i + 1;
                if (length > max && isPalindromeString(s, i, j)) {
                    max = length;
                    start = i;
                }
            }
        }
        return s.substring(start, start + max);
    }

    private boolean isPalindromeString(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}

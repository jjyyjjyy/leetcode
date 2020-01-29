package io.github.jjyyjjyy.problem;

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
}

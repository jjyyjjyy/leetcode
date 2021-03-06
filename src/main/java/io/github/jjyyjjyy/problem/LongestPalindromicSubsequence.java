package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/longest-palindromic-subsequence/">最长回文子序列</a>
 *
 * <p>给定一个字符串<code>s</code>，找到其中最长的回文子序列。可以假设<code>s</code>的最大长度为<code>1000</code>。</p>
 *
 * <p><strong>示例 1:</strong><br />
 * 输入:</p>
 *
 * <pre>
 * &quot;bbbab&quot;
 * </pre>
 *
 * <p>输出:</p>
 *
 * <pre>
 * 4
 * </pre>
 *
 * <p>一个可能的最长回文子序列为 &quot;bbbb&quot;。</p>
 *
 * <p><strong>示例 2:</strong><br />
 * 输入:</p>
 *
 * <pre>
 * &quot;cbbd&quot;
 * </pre>
 *
 * <p>输出:</p>
 *
 * <pre>
 * 2
 * </pre>
 *
 * <p>一个可能的最长回文子序列为 &quot;bb&quot;。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>longest-palindromic-substring</li>
 *   <li>palindromic-substrings</li>
 *   <li>count-different-palindromic-subsequences</li>
 * </ul>
 */
@Problem(
    id = 516,
    name = "longest-palindromic-subsequence",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class LongestPalindromicSubsequence {
}

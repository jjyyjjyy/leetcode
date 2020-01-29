package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/">无重复字符的最长子串</a>
 *
 * <p>给定一个字符串，请你找出其中不含有重复字符的&nbsp;<strong>最长子串&nbsp;</strong>的长度。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入: </strong>&quot;abcabcbb&quot;
 * <strong>输出: </strong>3
 * <strong>解释:</strong> 因为无重复字符的最长子串是 <code>&quot;abc&quot;，所以其</code>长度为 3。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入: </strong>&quot;bbbbb&quot;
 * <strong>输出: </strong>1
 * <strong>解释: </strong>因为无重复字符的最长子串是 <code>&quot;b&quot;</code>，所以其长度为 1。
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入: </strong>&quot;pwwkew&quot;
 * <strong>输出: </strong>3
 * <strong>解释: </strong>因为无重复字符的最长子串是&nbsp;<code>&quot;wke&quot;</code>，所以其长度为 3。
 * &nbsp;    请注意，你的答案必须是 <strong>子串 </strong>的长度，<code>&quot;pwke&quot;</code>&nbsp;是一个<em>子序列，</em>不是子串。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>longest-substring-with-at-most-two-distinct-characters</li>
 *   <li>longest-substring-with-at-most-k-distinct-characters</li>
 *   <li>subarrays-with-k-different-integers</li>
 * </ul>
 */
@Problem(
    id = 3,
    name = "longest-substring-without-repeating-characters",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HASH_TABLE, Tag.TWO_POINTERS, Tag.STRING, Tag.SLIDING_WINDOW}
)
public class LongestSubstringWithoutRepeatingCharacters {
}

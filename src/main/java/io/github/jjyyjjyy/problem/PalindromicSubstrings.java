package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/palindromic-substrings/">回文子串</a>
 *
 * <p>给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。</p>
 *
 * <p>具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> &quot;abc&quot;
 * <strong>输出:</strong> 3
 * <strong>解释:</strong> 三个回文子串: &quot;a&quot;, &quot;b&quot;, &quot;c&quot;.
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> &quot;aaa&quot;
 * <strong>输出:</strong> 6
 * <strong>说明:</strong> 6个回文子串: &quot;a&quot;, &quot;a&quot;, &quot;a&quot;, &quot;aa&quot;, &quot;aa&quot;, &quot;aaa&quot;.
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li>输入的字符串长度不会超过1000。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>longest-palindromic-substring</li>
 *   <li>longest-palindromic-subsequence</li>
 *   <li>palindromic-substrings</li>
 * </ul>
 */
@Problem(
    id = 647,
    name = "palindromic-substrings",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STRING, Tag.DYNAMIC_PROGRAMMING}
)
public class PalindromicSubstrings {
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/longest-valid-parentheses/">最长有效括号</a>
 *
 * <p>给定一个只包含 <code>&#39;(&#39;</code>&nbsp;和 <code>&#39;)&#39;</code>&nbsp;的字符串，找出最长的包含有效括号的子串的长度。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;(()&quot;
 * <strong>输出:</strong> 2
 * <strong>解释:</strong> 最长有效括号子串为 <code>&quot;()&quot;</code>
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;<code>)()())</code>&quot;
 * <strong>输出:</strong> 4
 * <strong>解释:</strong> 最长有效括号子串为 <code>&quot;()()&quot;</code>
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>valid-parentheses</li>
 * </ul>
 */
@Problem(
    id = 32,
    name = "longest-valid-parentheses",
    difficulty = Difficulty.HARD,
    tags = {Tag.STRING, Tag.DYNAMIC_PROGRAMMING}
)
public class LongestValidParentheses {
}

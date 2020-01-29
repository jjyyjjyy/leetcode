package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/break-a-palindrome/">破坏回文串</a>
 *
 * <p>给你一个回文字符串&nbsp;<code>palindrome</code> ，请你将其中&nbsp;<strong>一个</strong> 字符用任意小写英文字母替换，使得结果字符串的字典序最小，且&nbsp;<strong>不是</strong>&nbsp;回文串。</p>
 *
 * <p>请你返回结果字符串。如果无法做到，则返回一个空串。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>palindrome = &quot;abccba&quot;
 * <strong>输出：</strong>&quot;aaccba&quot;
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>palindrome = &quot;a&quot;
 * <strong>输出：</strong>&quot;&quot;
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= palindrome.length &lt;= 1000</code></li>
 * 	<li><code>palindrome</code>&nbsp;只包含小写英文字母。</li>
 * </ul>
 */
@Problem(
    id = 1252,
    name = "break-a-palindrome",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STRING}
)
public class BreakaPalindrome {
}

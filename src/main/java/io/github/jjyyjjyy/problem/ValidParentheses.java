package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/valid-parentheses/">有效的括号</a>
 *
 * <p>给定一个只包括 <code>&#39;(&#39;</code>，<code>&#39;)&#39;</code>，<code>&#39;{&#39;</code>，<code>&#39;}&#39;</code>，<code>&#39;[&#39;</code>，<code>&#39;]&#39;</code>&nbsp;的字符串，判断字符串是否有效。</p>
 *
 * <p>有效字符串需满足：</p>
 *
 * <ol>
 * 	<li>左括号必须用相同类型的右括号闭合。</li>
 * 	<li>左括号必须以正确的顺序闭合。</li>
 * </ol>
 *
 * <p>注意空字符串可被认为是有效字符串。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;()&quot;
 * <strong>输出:</strong> true
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;()[]{}&quot;
 * <strong>输出:</strong> true
 * </pre>
 *
 * <p><strong>示例&nbsp;3:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;(]&quot;
 * <strong>输出:</strong> false
 * </pre>
 *
 * <p><strong>示例&nbsp;4:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;([)]&quot;
 * <strong>输出:</strong> false
 * </pre>
 *
 * <p><strong>示例&nbsp;5:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;{[]}&quot;
 * <strong>输出:</strong> true</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>generate-parentheses</li>
 *   <li>longest-valid-parentheses</li>
 *   <li>remove-invalid-parentheses</li>
 *   <li>check-if-word-is-valid-after-substitutions</li>
 * </ul>
 */
@Problem(
    id = 20,
    name = "valid-parentheses",
    difficulty = Difficulty.EASY,
    tags = {Tag.STACK, Tag.STRING}
)
public class ValidParentheses {

    public boolean isValid(String s) {
        return false;
    }
}

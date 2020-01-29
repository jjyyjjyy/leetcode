package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/remove-invalid-parentheses/">删除无效的括号</a>
 *
 * <p>删除最小数量的无效括号，使得输入的字符串有效，返回所有可能的结果。</p>
 *
 * <p><strong>说明:</strong> 输入可能包含了除&nbsp;<code>(</code>&nbsp;和&nbsp;<code>)</code>&nbsp;以外的字符。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;()())()&quot;
 * <strong>输出:</strong> [&quot;()()()&quot;, &quot;(())()&quot;]
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;(a)())()&quot;
 * <strong>输出:</strong> [&quot;(a)()()&quot;, &quot;(a())()&quot;]
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;)(&quot;
 * <strong>输出: </strong>[&quot;&quot;]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>valid-parentheses</li>
 * </ul>
 */
@Problem(
    id = 301,
    name = "remove-invalid-parentheses",
    difficulty = Difficulty.HARD,
    tags = {Tag.DEPTH_FIRST_SEARCH, Tag.BREADTH_FIRST_SEARCH}
)
public class RemoveInvalidParentheses {
}

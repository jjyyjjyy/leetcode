package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/valid-parenthesis-string/">有效的括号字符串</a>
 *
 * <p>给定一个只包含三种字符的字符串：<code>（&nbsp;</code>，<code>）</code>&nbsp;和 <code>*</code>，写一个函数来检验这个字符串是否为有效字符串。有效字符串具有如下规则：</p>
 *
 * <ol>
 * 	<li>任何左括号 <code>(</code>&nbsp;必须有相应的右括号 <code>)</code>。</li>
 * 	<li>任何右括号 <code>)</code>&nbsp;必须有相应的左括号 <code>(</code>&nbsp;。</li>
 * 	<li>左括号 <code>(</code> 必须在对应的右括号之前 <code>)</code>。</li>
 * 	<li><code>*</code>&nbsp;可以被视为单个右括号 <code>)</code>&nbsp;，或单个左括号 <code>(</code>&nbsp;，或一个空字符串。</li>
 * 	<li>一个空字符串也被视为有效字符串。</li>
 * </ol>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> &quot;()&quot;
 * <strong>输出:</strong> True
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> &quot;(*)&quot;
 * <strong>输出:</strong> True
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> &quot;(*))&quot;
 * <strong>输出:</strong> True
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li>字符串大小将在 [1，100] 范围内。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>special-binary-string</li>
 * </ul>
 */
@Problem(
    id = 678,
    name = "valid-parenthesis-string",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STRING}
)
public class ValidParenthesisString {
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-add-to-make-parentheses-valid/">使括号有效的最少添加</a>
 *
 * <p>给定一个由&nbsp;<code>&#39;(&#39;</code>&nbsp;和&nbsp;<code>&#39;)&#39;</code>&nbsp;括号组成的字符串 <code>S</code>，我们需要添加最少的括号（ <code>&#39;(&#39;</code>&nbsp;或是&nbsp;<code>&#39;)&#39;</code>，可以在任何位置），以使得到的括号字符串有效。</p>
 *
 * <p>从形式上讲，只有满足下面几点之一，括号字符串才是有效的：</p>
 *
 * <ul>
 * 	<li>它是一个空字符串，或者</li>
 * 	<li>它可以被写成&nbsp;<code>AB</code>&nbsp;（<code>A</code>&nbsp;与&nbsp;<code>B</code>&nbsp;连接）, 其中&nbsp;<code>A</code> 和&nbsp;<code>B</code>&nbsp;都是有效字符串，或者</li>
 * 	<li>它可以被写作&nbsp;<code>(A)</code>，其中&nbsp;<code>A</code>&nbsp;是有效字符串。</li>
 * </ul>
 *
 * <p>给定一个括号字符串，返回为使结果字符串有效而必须添加的最少括号数。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>&quot;())&quot;
 * <strong>输出：</strong>1
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>&quot;(((&quot;
 * <strong>输出：</strong>3
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>&quot;()&quot;
 * <strong>输出：</strong>0
 * </pre>
 *
 * <p><strong>示例 4：</strong></p>
 *
 * <pre><strong>输入：</strong>&quot;()))((&quot;
 * <strong>输出：</strong>4</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>S.length &lt;= 1000</code></li>
 * 	<li><code>S</code> 只包含&nbsp;<code>&#39;(&#39;</code> 和&nbsp;<code>&#39;)&#39;</code>&nbsp;字符。</li>
 * </ol>
 *
 * <p>&nbsp;</p>
 */
@Problem(
    id = 957,
    name = "minimum-add-to-make-parentheses-valid",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STACK, Tag.GREEDY}
)
public class MinimumAddtoMakeParenthesesValid {
}

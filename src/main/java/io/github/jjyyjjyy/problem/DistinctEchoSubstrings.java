package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/distinct-echo-substrings/">不同的循环子字符串</a>
 *
 * <p>给你一个字符串&nbsp;<code>text</code> ，请你返回满足下述条件的&nbsp;<strong>不同</strong> 非空子字符串的数目：</p>
 *
 * <ul>
 * 	<li>可以写成某个字符串与其自身相连接的形式。</li>
 * </ul>
 *
 * <p>例如，<code>abcabc</code>&nbsp;就是&nbsp;<code>abc</code>&nbsp;和它自身连接形成的。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>text = &quot;abcabcabc&quot;
 * <strong>输出：</strong>3
 * <strong>解释：</strong>3 个子字符串分别为 &quot;abcabc&quot; ， &quot;bcabca&quot; 和 &quot;cabcab&quot; 。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>text = &quot;leetcodeleetcode&quot;
 * <strong>输出：</strong>2
 * <strong>解释：</strong>2 个子字符串为 &quot;ee&quot; 和 &quot;leetcodeleetcode&quot; 。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= text.length &lt;= 2000</code></li>
 * 	<li><code>text</code>&nbsp;只包含小写英文字母。</li>
 * </ul>
 */
@Problem(
    id = 1244,
    name = "distinct-echo-substrings",
    difficulty = Difficulty.HARD,
    tags = {Tag.STRING}
)
public class DistinctEchoSubstrings {
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/last-substring-in-lexicographical-order/">按字典序排在最后的子串</a>
 *
 * <p>给你一个字符串&nbsp;<code>s</code>，找出它的所有子串并按字典序排列，返回排在最后的那个子串。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>&quot;abab&quot;
 * <strong>输出：</strong>&quot;bab&quot;
 * <strong>解释：</strong>我们可以找出 7 个子串 [&quot;a&quot;, &quot;ab&quot;, &quot;aba&quot;, &quot;abab&quot;, &quot;b&quot;, &quot;ba&quot;, &quot;bab&quot;]。按字典序排在最后的子串是 &quot;bab&quot;。
 * </pre>
 *
 * <p><strong>示例&nbsp;2：</strong></p>
 *
 * <pre><strong>输入：</strong>&quot;leetcode&quot;
 * <strong>输出：</strong>&quot;tcode&quot;
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= s.length &lt;= 4 * 10^5</code></li>
 * 	<li>s 仅含有小写英文字符。</li>
 * </ol>
 */
@Problem(
    id = 1133,
    name = "last-substring-in-lexicographical-order",
    difficulty = Difficulty.HARD,
    tags = {Tag.STRING}
)
public class LastSubstringinLexicographicalOrder {
}

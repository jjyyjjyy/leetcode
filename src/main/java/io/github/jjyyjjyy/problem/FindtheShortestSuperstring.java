package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/find-the-shortest-superstring/">最短超级串</a>
 *
 * <p>给定一个字符串数组 <code>A</code>，找到以&nbsp;<code>A</code>&nbsp;中每个字符串作为子字符串的最短字符串。</p>
 *
 * <p>我们可以假设 <code>A</code> 中没有字符串是 <code>A</code> 中另一个字符串的子字符串。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>[&quot;alex&quot;,&quot;loves&quot;,&quot;leetcode&quot;]
 * <strong>输出：</strong>&quot;alexlovesleetcode&quot;
 * <strong>解释：</strong>&quot;alex&quot;，&quot;loves&quot;，&quot;leetcode&quot; 的所有排列都会被接受。</pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>[&quot;catg&quot;,&quot;ctaagt&quot;,&quot;gcta&quot;,&quot;ttca&quot;,&quot;atgcatc&quot;]
 * <strong>输出：</strong>&quot;gctaagttcatgcatc&quot;</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= A.length &lt;= 12</code></li>
 * 	<li><code>1 &lt;= A[i].length &lt;= 20</code></li>
 * </ol>
 *
 * <p>&nbsp;</p>
 */
@Problem(
    id = 980,
    name = "find-the-shortest-superstring",
    difficulty = Difficulty.HARD,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class FindtheShortestSuperstring {
}

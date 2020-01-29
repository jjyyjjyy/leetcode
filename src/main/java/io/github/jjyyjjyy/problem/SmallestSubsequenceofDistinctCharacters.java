package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/smallest-subsequence-of-distinct-characters/">不同字符的最小子序列</a>
 *
 * <p>返回字符串 <code>text</code>&nbsp;中按字典序排列最小的子序列，该子序列包含&nbsp;<code>text</code>&nbsp;中所有不同字符一次。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>&quot;cdadabcc&quot;
 * <strong>输出：</strong>&quot;adbc&quot;
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>&quot;abcd&quot;
 * <strong>输出：</strong>&quot;abcd&quot;
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>&quot;ecbacba&quot;
 * <strong>输出：</strong>&quot;eacb&quot;
 * </pre>
 *
 * <p><strong>示例 4：</strong></p>
 *
 * <pre><strong>输入：</strong>&quot;leetcode&quot;
 * <strong>输出：</strong>&quot;letcod&quot;
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= text.length &lt;= 1000</code></li>
 * 	<li><code>text</code>&nbsp;由小写英文字母组成</li>
 * </ol>
 */
@Problem(
    id = 1159,
    name = "smallest-subsequence-of-distinct-characters",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STRING}
)
public class SmallestSubsequenceofDistinctCharacters {
}

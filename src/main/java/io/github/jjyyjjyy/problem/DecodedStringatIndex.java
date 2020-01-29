package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/decoded-string-at-index/">索引处的解码字符串</a>
 *
 * <p>给定一个编码字符串 <code>S</code>。为了找出<em>解码</em>字符串并将其写入磁带，从编码字符串中<code>每次读取一个字符</code>，并采取以下步骤：</p>
 *
 * <ul>
 * 	<li>如果所读的字符是字母，则将该字母写在磁带上。</li>
 * 	<li>如果所读的字符是数字（例如 <code>d</code>），则整个当前磁带总共会被重复写&nbsp;<code>d-1</code> 次。</li>
 * </ul>
 *
 * <p>现在，对于给定的编码字符串 <code>S</code> 和索引 <code>K</code>，查找并返回解码字符串中的第&nbsp;<code>K</code>&nbsp;个字母。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>S = &quot;leet2code3&quot;, K = 10
 * <strong>输出：</strong>&quot;o&quot;
 * <strong>解释：</strong>
 * 解码后的字符串为 &quot;leetleetcodeleetleetcodeleetleetcode&quot;。
 * 字符串中的第 10 个字母是 &quot;o&quot;。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>S = &quot;ha22&quot;, K = 5
 * <strong>输出：</strong>&quot;h&quot;
 * <strong>解释：</strong>
 * 解码后的字符串为 &quot;hahahaha&quot;。第 5 个字母是 &quot;h&quot;。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>S = &quot;a2345678999999999999999&quot;, K = 1
 * <strong>输出：</strong>&quot;a&quot;
 * <strong>解释：</strong>
 * 解码后的字符串为 &quot;a&quot; 重复 8301530446056247680 次。第 1 个字母是 &quot;a&quot;。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>2 &lt;= S.length &lt;= 100</code></li>
 * 	<li><code>S</code>&nbsp;只包含小写字母与数字 <code>2</code> 到 <code>9</code> 。</li>
 * 	<li><code>S</code>&nbsp;以字母开头。</li>
 * 	<li><code>1 &lt;= K &lt;= 10^9</code></li>
 * 	<li>解码后的字符串保证少于&nbsp;<code>2^63</code>&nbsp;个字母。</li>
 * </ol>
 */
@Problem(
    id = 916,
    name = "decoded-string-at-index",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STACK}
)
public class DecodedStringatIndex {
}

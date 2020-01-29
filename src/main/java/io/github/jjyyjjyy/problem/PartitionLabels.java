package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/partition-labels/">划分字母区间</a>
 *
 * <p>字符串 <code>S</code> 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一个字母只会出现在其中的一个片段。返回一个表示每个字符串片段的长度的列表。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> S = &quot;ababcbacadefegdehijhklij&quot;
 * <strong>输出:</strong> [9,7,8]
 * <strong>解释:</strong>
 * 划分结果为 &quot;ababcbaca&quot;, &quot;defegde&quot;, &quot;hijhklij&quot;。
 * 每个字母最多出现在一个片段中。
 * 像 &quot;ababcbacadefegde&quot;, &quot;hijhklij&quot; 的划分是错误的，因为划分的片段数较少。
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li><code>S</code>的长度在<code>[1, 500]</code>之间。</li>
 * 	<li><code>S</code>只包含小写字母<code>&#39;a&#39;</code>到<code>&#39;z&#39;</code>。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>merge-intervals</li>
 * </ul>
 */
@Problem(
    id = 768,
    name = "partition-labels",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.GREEDY, Tag.TWO_POINTERS}
)
public class PartitionLabels {
}

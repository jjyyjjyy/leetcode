package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/reorganize-string/">重构字符串</a>
 *
 * <p>给定一个字符串<code>S</code>，检查是否能重新排布其中的字母，使得两相邻的字符不同。</p>
 *
 * <p>若可行，输出任意可行的结果。若不可行，返回空字符串。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> S = &quot;aab&quot;
 * <strong>输出:</strong> &quot;aba&quot;
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> S = &quot;aaab&quot;
 * <strong>输出:</strong> &quot;&quot;
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ul>
 * 	<li><code>S</code> 只包含小写字母并且长度在<code>[1, 500]</code>区间内。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>rearrange-string-k-distance-apart</li>
 *   <li>task-scheduler</li>
 * </ul>
 */
@Problem(
    id = 778,
    name = "reorganize-string",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HEAP, Tag.GREEDY, Tag.SORT, Tag.STRING}
)
public class ReorganizeString {
}

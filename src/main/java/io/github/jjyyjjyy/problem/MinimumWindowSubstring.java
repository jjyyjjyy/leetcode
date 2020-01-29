package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-window-substring/">最小覆盖子串</a>
 *
 * <p>给你一个字符串 S、一个字符串 T，请在字符串 S 里面找出：包含 T 所有字母的最小子串。</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre><strong>输入: S</strong> = &quot;ADOBECODEBANC&quot;, <strong>T</strong> = &quot;ABC&quot;
 * <strong>输出:</strong> &quot;BANC&quot;</pre>
 *
 * <p><strong>说明：</strong></p>
 *
 * <ul>
 * 	<li>如果 S 中不存这样的子串，则返回空字符串 <code>&quot;&quot;</code>。</li>
 * 	<li>如果 S 中存在这样的子串，我们保证它是唯一的答案。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>substring-with-concatenation-of-all-words</li>
 *   <li>minimum-size-subarray-sum</li>
 *   <li>sliding-window-maximum</li>
 *   <li>permutation-in-string</li>
 *   <li>minimum-window-subsequence</li>
 * </ul>
 */
@Problem(
    id = 76,
    name = "minimum-window-substring",
    difficulty = Difficulty.HARD,
    tags = {Tag.HASH_TABLE, Tag.TWO_POINTERS, Tag.STRING, Tag.SLIDING_WINDOW}
)
public class MinimumWindowSubstring {
}

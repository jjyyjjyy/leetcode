package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/letter-case-permutation/">字母大小写全排列</a>
 *
 * <p>给定一个字符串<code>S</code>，通过将字符串<code>S</code>中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。</p>
 *
 * <pre>
 * <strong>示例:</strong>
 * <strong>输入:</strong> S = &quot;a1b2&quot;
 * <strong>输出:</strong> [&quot;a1b2&quot;, &quot;a1B2&quot;, &quot;A1b2&quot;, &quot;A1B2&quot;]
 *
 * <strong>输入:</strong> S = &quot;3z4&quot;
 * <strong>输出:</strong> [&quot;3z4&quot;, &quot;3Z4&quot;]
 *
 * <strong>输入:</strong> S = &quot;12345&quot;
 * <strong>输出:</strong> [&quot;12345&quot;]
 * </pre>
 *
 * <p><strong>注意：</strong></p>
 *
 * <ul>
 * 	<li><code>S</code>&nbsp;的长度不超过<code>12</code>。</li>
 * 	<li><code>S</code>&nbsp;仅由数字和字母组成。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>subsets</li>
 *   <li>brace-expansion</li>
 * </ul>
 */
@Problem(
    id = 800,
    name = "letter-case-permutation",
    difficulty = Difficulty.EASY,
    tags = {Tag.BIT_MANIPULATION, Tag.BACKTRACKING}
)
public class LetterCasePermutation {
}

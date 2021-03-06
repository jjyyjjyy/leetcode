package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/perfect-number/">完美数</a>
 *
 * <p>对于一个&nbsp;<strong>正整数</strong>，如果它和除了它自身以外的所有正因子之和相等，我们称它为&ldquo;完美数&rdquo;。</p>
 *
 * <p>给定一个&nbsp;<strong>整数&nbsp;</strong><code>n</code>，&nbsp;如果他是完美数，返回&nbsp;<code>True</code>，否则返回&nbsp;<code>False</code></p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre><strong>输入:</strong> 28
 * <strong>输出:</strong> True
 * <strong>解释:</strong> 28 = 1 + 2 + 4 + 7 + 14
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <p>输入的数字&nbsp;<strong><code>n</code></strong> 不会超过 100,000,000. (1e8)</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>self-dividing-numbers</li>
 * </ul>
 */
@Problem(
    id = 507,
    name = "perfect-number",
    difficulty = Difficulty.EASY,
    tags = {Tag.MATH}
)
public class PerfectNumber {
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/add-binary/">二进制求和</a>
 *
 * <p>给定两个二进制字符串，返回他们的和（用二进制表示）。</p>
 *
 * <p>输入为<strong>非空</strong>字符串且只包含数字&nbsp;<code>1</code>&nbsp;和&nbsp;<code>0</code>。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> a = &quot;11&quot;, b = &quot;1&quot;
 * <strong>输出:</strong> &quot;100&quot;</pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> a = &quot;1010&quot;, b = &quot;1011&quot;
 * <strong>输出:</strong> &quot;10101&quot;</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>add-two-numbers</li>
 *   <li>multiply-strings</li>
 *   <li>plus-one</li>
 *   <li>add-to-array-form-of-integer</li>
 * </ul>
 */
@Problem(
    id = 67,
    name = "add-binary",
    difficulty = Difficulty.EASY,
    tags = {Tag.MATH, Tag.STRING}
)
public class AddBinary {
}

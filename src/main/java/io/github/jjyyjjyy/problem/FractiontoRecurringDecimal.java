package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/fraction-to-recurring-decimal/">分数到小数</a>
 *
 * <p>给定两个整数，分别表示分数的分子&nbsp;numerator 和分母 denominator，以字符串形式返回小数。</p>
 *
 * <p>如果小数部分为循环小数，则将循环的部分括在括号内。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> numerator = 1, denominator = 2
 * <strong>输出:</strong> &quot;0.5&quot;
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> numerator = 2, denominator = 1
 * <strong>输出:</strong> &quot;2&quot;</pre>
 *
 * <p><strong>示例&nbsp;3:</strong></p>
 *
 * <pre><strong>输入:</strong> numerator = 2, denominator = 3
 * <strong>输出: </strong>&quot;0.(6)&quot;
 * </pre>
 */
@Problem(
    id = 166,
    name = "fraction-to-recurring-decimal",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HASH_TABLE, Tag.MATH}
)
public class FractiontoRecurringDecimal {
}

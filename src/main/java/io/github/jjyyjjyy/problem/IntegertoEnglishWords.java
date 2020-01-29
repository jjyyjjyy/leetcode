package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/integer-to-english-words/">整数转换英文表示</a>
 *
 * <p>将非负整数转换为其对应的英文表示。可以保证给定输入小于&nbsp;2<sup>31</sup> - 1 。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> 123
 * <strong>输出:</strong> &quot;One Hundred Twenty Three&quot;
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> 12345
 * <strong>输出:</strong> &quot;Twelve Thousand Three Hundred Forty Five&quot;</pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入:</strong> 1234567
 * <strong>输出:</strong> &quot;One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven&quot;</pre>
 *
 * <p><strong>示例 4:</strong></p>
 *
 * <pre><strong>输入:</strong> 1234567891
 * <strong>输出:</strong> &quot;One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One&quot;</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>integer-to-roman</li>
 * </ul>
 */
@Problem(
    id = 273,
    name = "integer-to-english-words",
    difficulty = Difficulty.HARD,
    tags = {Tag.MATH, Tag.STRING}
)
public class IntegertoEnglishWords {
}

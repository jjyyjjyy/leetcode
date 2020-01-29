package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/count-numbers-with-unique-digits/">计算各个位数不同的数字个数</a>
 *
 * <p>给定一个<strong>非负</strong>整数 n，计算各位数字都不同的数字 x 的个数，其中 0 &le; x &lt; 10<sup>n&nbsp;</sup>。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入: </strong>2
 * <strong>输出: </strong>91
 * <strong>解释: </strong>答案应为除去 <code>11,22,33,44,55,66,77,88,99 </code>外，在 [0,100) 区间内的所有数字。
 * </pre>
 */
@Problem(
    id = 357,
    name = "count-numbers-with-unique-digits",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.MATH, Tag.DYNAMIC_PROGRAMMING, Tag.BACKTRACKING}
)
public class CountNumberswithUniqueDigits {
}

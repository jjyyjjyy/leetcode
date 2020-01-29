package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/power-of-two/">2的幂</a>
 *
 * <p>给定一个整数，编写一个函数来判断它是否是 2 的幂次方。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> 1
 * <strong>输出:</strong> true
 * <strong>解释: </strong>2<sup>0</sup>&nbsp;= 1</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> 16
 * <strong>输出:</strong> true
 * <strong>解释: </strong>2<sup>4</sup>&nbsp;= 16</pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入:</strong> 218
 * <strong>输出:</strong> false</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>number-of-1-bits</li>
 *   <li>power-of-three</li>
 *   <li>power-of-four</li>
 * </ul>
 */
@Problem(
    id = 231,
    name = "power-of-two",
    difficulty = Difficulty.EASY,
    tags = {Tag.BIT_MANIPULATION, Tag.MATH}
)
public class PowerofTwo {
}

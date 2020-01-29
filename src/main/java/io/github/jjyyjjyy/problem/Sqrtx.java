package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/sqrtx/">x 的平方根</a>
 *
 * <p>实现&nbsp;<code>int sqrt(int x)</code>&nbsp;函数。</p>
 *
 * <p>计算并返回&nbsp;<em>x</em>&nbsp;的平方根，其中&nbsp;<em>x </em>是非负整数。</p>
 *
 * <p>由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> 4
 * <strong>输出:</strong> 2
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> 8
 * <strong>输出:</strong> 2
 * <strong>说明:</strong> 8 的平方根是 2.82842...,
 * &nbsp;    由于返回类型是整数，小数部分将被舍去。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>powx-n</li>
 *   <li>valid-perfect-square</li>
 * </ul>
 */
@Problem(
    id = 69,
    name = "sqrtx",
    difficulty = Difficulty.EASY,
    tags = {Tag.MATH, Tag.BINARY_SEARCH}
)
public class Sqrtx {
}

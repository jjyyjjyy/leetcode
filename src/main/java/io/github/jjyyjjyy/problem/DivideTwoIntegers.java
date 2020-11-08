package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/divide-two-integers/">两数相除</a>
 *
 * <p>给定两个整数，被除数&nbsp;<code>dividend</code>&nbsp;和除数&nbsp;<code>divisor</code>。将两数相除，要求不使用乘法、除法和 mod 运算符。</p>
 *
 * <p>返回被除数&nbsp;<code>dividend</code>&nbsp;除以除数&nbsp;<code>divisor</code>&nbsp;得到的商。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> dividend = 10, divisor = 3
 * <strong>输出:</strong> 3</pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> dividend = 7, divisor = -3
 * <strong>输出:</strong> -2</pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ul>
 * 	<li>被除数和除数均为 32 位有符号整数。</li>
 * 	<li>除数不为&nbsp;0。</li>
 * 	<li>假设我们的环境只能存储 32 位有符号整数，其数值范围是 [&minus;2<sup>31</sup>,&nbsp; 2<sup>31&nbsp;</sup>&minus; 1]。本题中，如果除法结果溢出，则返回 2<sup>31&nbsp;</sup>&minus; 1。</li>
 * </ul>
 */
@Problem(
    id = 29,
    name = "divide-two-integers",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.MATH, Tag.BINARY_SEARCH}
)
public class DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        return 0;
    }
}

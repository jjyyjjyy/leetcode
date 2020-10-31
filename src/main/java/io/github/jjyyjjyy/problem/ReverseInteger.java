package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/reverse-integer/">整数反转</a>
 *
 * <p>给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> 123
 * <strong>输出:</strong> 321
 * </pre>
 *
 * <p><strong>&nbsp;示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> -123
 * <strong>输出:</strong> -321
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入:</strong> 120
 * <strong>输出:</strong> 21
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <p>假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为&nbsp;[&minus;2<sup>31</sup>,&nbsp; 2<sup>31&nbsp;</sup>&minus; 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>string-to-integer-atoi</li>
 *   <li>reverse-bits</li>
 * </ul>
 */
@Problem(
    id = 7,
    name = "reverse-integer",
    difficulty = Difficulty.EASY,
    tags = {Tag.MATH}
)
public class ReverseInteger {

    @Complexity(Complexity.ComplexityType.O_LOG_N)
    public int reverse(int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x /= 10;
        }
        return (int) n == n ? (int) n : 0;
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/power-of-three/">3的幂</a>
 *
 * <p>给定一个整数，写一个函数来判断它是否是 3&nbsp;的幂次方。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> 27
 * <strong>输出:</strong> true
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> 0
 * <strong>输出:</strong> false</pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入:</strong> 9
 * <strong>输出:</strong> true</pre>
 *
 * <p><strong>示例 4:</strong></p>
 *
 * <pre><strong>输入:</strong> 45
 * <strong>输出:</strong> false</pre>
 *
 * <p><strong>进阶：</strong><br>
 * 你能不使用循环或者递归来完成本题吗？</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>power-of-two</li>
 *   <li>power-of-four</li>
 * </ul>
 */
@Problem(
    id = 326,
    name = "power-of-three",
    difficulty = Difficulty.EASY,
    tags = {Tag.MATH}
)
public class PowerOfThree {

    @Complexity(Complexity.ComplexityType.O_LOG_N)
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}

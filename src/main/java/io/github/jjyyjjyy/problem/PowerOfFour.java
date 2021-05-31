package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/power-of-four/">4的幂</a>
 *
 * <p>给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4&nbsp;的幂次方。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入: </strong>16
 * <strong>输出: </strong>true
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入: </strong>5
 * <strong>输出: </strong>false</pre>
 *
 * <p><strong>进阶：</strong><br>
 * 你能不使用循环或者递归来完成本题吗？</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>power-of-two</li>
 *   <li>power-of-three</li>
 * </ul>
 */
@Problem(
    id = 342,
    name = "power-of-four",
    difficulty = Difficulty.EASY,
    tags = {Tag.BIT_MANIPULATION}
)
public class PowerOfFour {

    /**
     * 如果一个数是4的幂, 那么这个数的二进制表示中有且仅有一个1 => (n & n - 1) == 0, 并且在偶数位上 => (n & 0xaaaaaaaa) == 0.
     */
    @Complexity(Complexity.ComplexityType.O_1)
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & n - 1) == 0 && (n & 0xaaaaaaaa) == 0;
    }
}

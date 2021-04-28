package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/sum-of-square-numbers/">平方数之和</a>
 *
 * <p>给定一个非负整数&nbsp;<code>c</code>&nbsp;，你要判断是否存在两个整数 <code>a</code> 和 <code>b</code>，使得&nbsp;a<sup>2</sup> + b<sup>2</sup> = c。</p>
 *
 * <p><strong>示例1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> 5
 * <strong>输出:</strong> True
 * <strong>解释:</strong> 1 * 1 + 2 * 2 = 5
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> 3
 * <strong>输出:</strong> False
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>valid-perfect-square</li>
 * </ul>
 */
@Problem(
    id = 633,
    name = "sum-of-square-numbers",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.MATH}
)
public class SumOfSquareNumbers {

    /**
     * 双指针遍历0到sqrt(c)之间的数, 求和判断是否等于c.
     */
    @Complexity(Complexity.ComplexityType.O_SQRT_N)
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left <= right) {
            long sum = (long) left * left + (long) right * right;
            if (sum == c) {
                return true;
            }
            if (sum < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}

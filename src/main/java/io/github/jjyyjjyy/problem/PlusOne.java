package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/plus-one/">加一</a>
 *
 * <p>给定一个由<strong>整数</strong>组成的<strong>非空</strong>数组所表示的非负整数，在该数的基础上加一。</p>
 *
 * <p>最高位数字存放在数组的首位， 数组中每个元素只存储<strong>单个</strong>数字。</p>
 *
 * <p>你可以假设除了整数 0 之外，这个整数不会以零开头。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,2,3]
 * <strong>输出:</strong> [1,2,4]
 * <strong>解释:</strong> 输入数组表示数字 123。
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> [4,3,2,1]
 * <strong>输出:</strong> [4,3,2,2]
 * <strong>解释:</strong> 输入数组表示数字 4321。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>multiply-strings</li>
 *   <li>add-binary</li>
 *   <li>plus-one-linked-list</li>
 *   <li>add-to-array-form-of-integer</li>
 * </ul>
 */
@Problem(
    id = 66,
    name = "plus-one",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class PlusOne {

    /**
     * 数组从后向前遍历
     * 如果小于9, 则直接加1, 结束.
     * 如果等于9, 则该位置变为0, 前面一个位置加1. 如果前面没有位置, 则补1.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int[] plusOne(int[] digits) {
        return plusOne(digits, digits.length - 1);
    }

    private int[] plusOne(int[] digits, int index) {
        if (digits[index] < 9) {
            digits[index]++;
            return digits;
        }
        digits[index] = 0;
        if (index > 0) {
            return plusOne(digits, index - 1);
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        System.arraycopy(digits, 0, result, 1, digits.length);
        return result;
    }
}

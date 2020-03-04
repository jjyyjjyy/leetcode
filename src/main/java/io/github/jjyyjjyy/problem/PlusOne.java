package io.github.jjyyjjyy.problem;

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

    public int[] plusOne(int[] digits) {
        return new int[0];
    }
}

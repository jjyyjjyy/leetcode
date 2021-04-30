package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/single-number-ii/">只出现一次的数字 II</a>
 *
 * <p>给定一个<strong>非空</strong>整数数组，除了某个元素只出现一次以外，其余每个元素均出现了三次。找出那个只出现了一次的元素。</p>
 *
 * <p><strong>说明：</strong></p>
 *
 * <p>你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [2,2,3,2]
 * <strong>输出:</strong> 3
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> [0,1,0,1,0,1,99]
 * <strong>输出:</strong> 99</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>single-number</li>
 *   <li>single-number-iii</li>
 * </ul>
 */
@Problem(
    id = 137,
    name = "single-number-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BIT_MANIPULATION}
)
public class SingleNumberII {

    public int singleNumber(int[] nums) {
        return -1;
    }
}

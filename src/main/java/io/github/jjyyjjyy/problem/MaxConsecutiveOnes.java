package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/max-consecutive-ones/">最大连续1的个数</a>
 *
 * <p>给定一个二进制数组， 计算其中最大连续1的个数。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [1,1,0,1,1,1]
 * <strong>输出:</strong> 3
 * <strong>解释:</strong> 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 * </pre>
 *
 * <p><strong>注意：</strong></p>
 *
 * <ul>
 * 	<li>输入的数组只包含&nbsp;<code>0</code> 和<code>1</code>。</li>
 * 	<li>输入数组的长度是正整数，且不超过 10,000。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>max-consecutive-ones-ii</li>
 *   <li>max-consecutive-ones-iii</li>
 * </ul>
 */
@Problem(
    id = 485,
    name = "max-consecutive-ones",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        return 0;
    }
}

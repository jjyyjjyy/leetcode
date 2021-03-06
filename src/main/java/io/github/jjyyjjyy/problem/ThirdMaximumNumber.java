package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/third-maximum-number/">第三大的数</a>
 *
 * <p>给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [3, 2, 1]
 *
 * <strong>输出:</strong> 1
 *
 * <strong>解释:</strong> 第三大的数是 1.
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [1, 2]
 *
 * <strong>输出:</strong> 2
 *
 * <strong>解释:</strong> 第三大的数不存在, 所以返回最大的数 2 .
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [2, 2, 3, 1]
 *
 * <strong>输出:</strong> 1
 *
 * <strong>解释:</strong> 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>kth-largest-element-in-an-array</li>
 * </ul>
 */
@Problem(
    id = 414,
    name = "third-maximum-number",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        return 0;
    }
}

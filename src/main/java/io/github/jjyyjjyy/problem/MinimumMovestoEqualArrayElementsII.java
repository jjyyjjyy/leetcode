package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements-ii/">最少移动次数使数组元素相等 II</a>
 *
 * <p>给定一个非空整数数组，找到使所有数组元素相等所需的最小移动数，其中每次移动可将选定的一个元素加1或减1。 您可以假设数组的长度最多为10000。</p>
 *
 * <p><strong>例如:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 * [1,2,3]
 *
 * <strong>输出:</strong>
 * 2
 *
 * <strong>说明：
 * </strong>只有两个动作是必要的（记得每一步仅可使其中一个元素加1或减1）：
 *
 * [1,2,3]  =&gt;  [2,2,3]  =&gt;  [2,2,2]
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>best-meeting-point</li>
 *   <li>minimum-moves-to-equal-array-elements</li>
 * </ul>
 */
@Problem(
    id = 462,
    name = "minimum-moves-to-equal-array-elements-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.MATH}
)
public class MinimumMovestoEqualArrayElementsII {
}

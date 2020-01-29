package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/majority-element-ii/">求众数 II</a>
 *
 * <p>给定一个大小为&nbsp;<em>n&nbsp;</em>的数组，找出其中所有出现超过&nbsp;<code>&lfloor; n/3 &rfloor;</code>&nbsp;次的元素。</p>
 *
 * <p><strong>说明: </strong>要求算法的时间复杂度为 O(n)，空间复杂度为 O(1)。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> [3,2,3]
 * <strong>输出:</strong> [3]</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,1,1,3,3,2,2,2]
 * <strong>输出:</strong> [1,2]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>majority-element</li>
 *   <li>check-if-a-number-is-majority-element-in-a-sorted-array</li>
 * </ul>
 */
@Problem(
    id = 229,
    name = "majority-element-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY}
)
public class MajorityElementII {
}

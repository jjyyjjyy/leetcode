package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/majority-element/">多数元素</a>
 *
 * <p>给定一个大小为 <em>n </em>的数组，找到其中的多数元素。多数元素是指在数组中出现次数<strong>大于</strong>&nbsp;<code>&lfloor; n/2 &rfloor;</code>&nbsp;的元素。</p>
 *
 * <p>你可以假设数组是非空的，并且给定的数组总是存在多数元素。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> [3,2,3]
 * <strong>输出:</strong> 3</pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> [2,2,1,1,1,2,2]
 * <strong>输出:</strong> 2
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>majority-element-ii</li>
 *   <li>check-if-a-number-is-majority-element-in-a-sorted-array</li>
 * </ul>
 */
@Problem(
    id = 169,
    name = "majority-element",
    difficulty = Difficulty.EASY,
    tags = {Tag.BIT_MANIPULATION, Tag.ARRAY, Tag.DIVIDE_AND_CONQUER}
)
public class MajorityElement {

    public int majorityElement(int[] nums) {
        return 0;
    }
}

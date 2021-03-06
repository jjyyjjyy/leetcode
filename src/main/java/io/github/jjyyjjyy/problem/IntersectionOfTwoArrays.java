package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/intersection-of-two-arrays/">两个数组的交集</a>
 *
 * <p>给定两个数组，编写一个函数来计算它们的交集。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入: </strong>nums1 = [1,2,2,1], nums2 = [2,2]
 * <strong>输出: </strong>[2]
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入: </strong>nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * <strong>输出: </strong>[9,4]</pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ul>
 * 	<li>输出结果中的每个元素一定是唯一的。</li>
 * 	<li>我们可以不考虑输出结果的顺序。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>intersection-of-two-arrays-ii</li>
 *   <li>intersection-of-three-sorted-arrays</li>
 * </ul>
 */
@Problem(
    id = 349,
    name = "intersection-of-two-arrays",
    difficulty = Difficulty.EASY,
    tags = {Tag.SORT, Tag.HASH_TABLE, Tag.TWO_POINTERS, Tag.BINARY_SEARCH}
)
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        return new int[0];
    }
}

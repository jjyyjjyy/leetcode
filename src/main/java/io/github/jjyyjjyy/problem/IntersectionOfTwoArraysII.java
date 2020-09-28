package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/">两个数组的交集 II</a>
 *
 * <p>给定两个数组，编写一个函数来计算它们的交集。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入: </strong>nums1 = [1,2,2,1], nums2 = [2,2]
 * <strong>输出: </strong>[2,2]
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入: </strong>nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * <strong>输出: </strong>[4,9]</pre>
 *
 * <p><strong>说明：</strong></p>
 *
 * <ul>
 * 	<li>输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。</li>
 * 	<li>我们可以不考虑输出结果的顺序。</li>
 * </ul>
 *
 * <p><strong><strong>进阶:</strong></strong></p>
 *
 * <ul>
 * 	<li>如果给定的数组已经排好序呢？你将如何优化你的算法？</li>
 * 	<li>如果&nbsp;<em>nums1&nbsp;</em>的大小比&nbsp;<em>nums2&nbsp;</em>小很多，哪种方法更优？</li>
 * 	<li>如果&nbsp;<em>nums2&nbsp;</em>的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>intersection-of-two-arrays</li>
 *   <li>find-common-characters</li>
 * </ul>
 */
@Problem(
    id = 350,
    name = "intersection-of-two-arrays-ii",
    difficulty = Difficulty.EASY,
    tags = {Tag.SORT, Tag.HASH_TABLE, Tag.TWO_POINTERS, Tag.BINARY_SEARCH}
)
public class IntersectionOfTwoArraysII {

    public int[] intersection(int[] nums1, int[] nums2) {
        return new int[0];
    }

}

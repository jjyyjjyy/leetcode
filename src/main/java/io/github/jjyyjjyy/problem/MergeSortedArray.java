package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/merge-sorted-array/">合并两个有序数组</a>
 *
 * <p>给定两个有序整数数组&nbsp;<em>nums1 </em>和 <em>nums2</em>，将 <em>nums2 </em>合并到&nbsp;<em>nums1&nbsp;</em>中<em>，</em>使得&nbsp;<em>num1 </em>成为一个有序数组。</p>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ul>
 * 	<li>初始化&nbsp;<em>nums1</em> 和 <em>nums2</em> 的元素数量分别为&nbsp;<em>m</em> 和 <em>n</em>。</li>
 * 	<li>你可以假设&nbsp;<em>nums1&nbsp;</em>有足够的空间（空间大小大于或等于&nbsp;<em>m + n</em>）来保存 <em>nums2</em> 中的元素。</li>
 * </ul>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * <strong>输出:</strong>&nbsp;[1,2,2,3,5,6]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>merge-two-sorted-lists</li>
 *   <li>squares-of-a-sorted-array</li>
 *   <li>interval-list-intersections</li>
 * </ul>
 */
@Problem(
    id = 88,
    name = "merge-sorted-array",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY, Tag.TWO_POINTERS}
)
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[nums1.length];

        int p1 = 0;
        int p2 = 0;

        int p = 0;
        while (p1 < m && p2 < n) {
            result[p++] = nums1[p1] > nums2[p2] ? nums2[p2++] : nums1[p1++];
        }

        if (p1 < m) {
            System.arraycopy(nums1, p1, result, p1 + p2, m + n - p1 - p2);
        } else if (p2 < n) {
            System.arraycopy(nums2, p2, result, p1 + p2, m + n - p1 - p2);
        }

        System.arraycopy(result, 0, nums1, 0, nums1.length);
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/median-of-two-sorted-arrays/">寻找两个有序数组的中位数</a>
 *
 * <p>给定两个大小为 m 和 n 的有序数组&nbsp;<code>nums1</code> 和&nbsp;<code>nums2</code>。</p>
 *
 * <p>请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为&nbsp;O(log(m + n))。</p>
 *
 * <p>你可以假设&nbsp;<code>nums1</code>&nbsp;和&nbsp;<code>nums2</code>&nbsp;不会同时为空。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * 则中位数是 (2 + 3)/2 = 2.5
 * </pre>
 */
@Problem(
    id = 4,
    name = "median-of-two-sorted-arrays",
    difficulty = Difficulty.HARD,
    tags = {Tag.ARRAY, Tag.BINARY_SEARCH, Tag.DIVIDE_AND_CONQUER}
)
public class MedianOfTwoSortedArrays {

    /**
     * 1. 计算中位数所在的位置.
     * 2. 维护p1,p2两个指针, 遍历并比较两个数组所在元素的值.
     * 3. 计算中位值.
     */
    @Complexity(Complexity.ComplexityType.O_M_AND_N)
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalNum = nums1.length + nums2.length;
        int median = (totalNum + 1) / 2;
        boolean isDualMedian = (totalNum & 1) == 0;
        int p1 = 0;
        int p2 = 0;
        int min = 0;
        while (p1 + p2 < median) {
            if (p1 >= nums1.length) {
                min = nums2[p2];
                p2++;
                continue;
            }
            if (p2 >= nums2.length) {
                min = nums1[p1];
                p1++;
                continue;
            }
            if (nums1[p1] < nums2[p2]) {
                min = nums1[p1];
                p1++;
            } else {
                min = nums2[p2];
                p2++;
            }
        }
        if (!isDualMedian) {
            return min;
        }
        int right = 0;
        if (p2 >= nums2.length) {
            right = nums1[p1];
        } else if (p1 >= nums1.length) {
            right = nums2[p2];
        } else {
            right = Math.min(nums1[p1], nums2[p2]);
        }
        return (min + right) / 2.0;
    }
}

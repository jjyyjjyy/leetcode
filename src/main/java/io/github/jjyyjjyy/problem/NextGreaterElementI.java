package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/next-greater-element-i/">下一个更大元素 I</a>
 *
 * <p>给定两个<strong>没有重复元素</strong>的数组&nbsp;<code>nums1</code> 和&nbsp;<code>nums2</code>&nbsp;，其中<code>nums1</code>&nbsp;是&nbsp;<code>nums2</code>&nbsp;的子集。找到&nbsp;<code>nums1</code>&nbsp;中每个元素在&nbsp;<code>nums2</code>&nbsp;中的下一个比其大的值。</p>
 *
 * <p><code>nums1</code>&nbsp;中数字&nbsp;<strong>x</strong>&nbsp;的下一个更大元素是指&nbsp;<strong>x</strong>&nbsp;在&nbsp;<code>nums2</code>&nbsp;中对应位置的右边的第一个比&nbsp;<strong>x&nbsp;</strong>大的元素。如果不存在，对应位置输出-1。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> <strong>nums1</strong> = [4,1,2], <strong>nums2</strong> = [1,3,4,2].
 * <strong>输出:</strong> [-1,3,-1]
 * <strong>解释:</strong>
 *     对于num1中的数字4，你无法在第二个数组中找到下一个更大的数字，因此输出 -1。
 *     对于num1中的数字1，第二个数组中数字1右边的下一个较大数字是 3。
 *     对于num1中的数字2，第二个数组中没有下一个更大的数字，因此输出 -1。</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> <strong>nums1</strong> = [2,4], <strong>nums2</strong> = [1,2,3,4].
 * <strong>输出:</strong> [3,-1]
 * <strong>解释:</strong>
 * &nbsp;   对于num1中的数字2，第二个数组中的下一个较大数字是3。
 *     对于num1中的数字4，第二个数组中没有下一个更大的数字，因此输出 -1。
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li><code>nums1</code>和<code>nums2</code>中所有元素是唯一的。</li>
 * 	<li><code>nums1</code>和<code>nums2</code>&nbsp;的数组大小都不超过1000。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>next-greater-element-ii</li>
 *   <li>next-greater-element-iii</li>
 *   <li>daily-temperatures</li>
 * </ul>
 */
@Problem(
    id = 496,
    name = "next-greater-element-i",
    difficulty = Difficulty.EASY,
    tags = {Tag.STACK}
)
public class NextGreaterElementI {
    @Complexity(Complexity.ComplexityType.O_N)
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        return new int[0];
    }
}

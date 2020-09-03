package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

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

    /**
     * 1. 维护一个栈和一个哈希表.
     * 2. 依次遍历数组, 如果当前元素大于栈顶, 说明符合条件, 保存两个元素的关系到哈希表中. 再将当前元素压入栈中.
     * 3. 遍历完数组后, 将栈中所有元素和-1存到哈希表中.
     * 4. 此时哈希表中存放着所有待查元素和其右侧最近的一个较大元素.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        int[] result = new int[nums1.length];

        for (int j : nums2) {
            while (!stack.isEmpty() && j > stack.peek()) {
                map.put(stack.pop(), j);
            }
            stack.push(j);
        }
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}

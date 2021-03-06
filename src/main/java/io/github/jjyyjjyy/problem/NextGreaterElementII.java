package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/next-greater-element-ii/">下一个更大元素 II</a>
 *
 * <p>给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。数字 x 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。如果不存在，则输出 -1。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [1,2,1]
 * <strong>输出:</strong> [2,-1,2]
 * <strong>解释:</strong> 第一个 1 的下一个更大的数是 2；
 * 数字 2 找不到下一个更大的数；
 * 第二个 1 的下一个最大的数需要循环搜索，结果也是 2。
 * </pre>
 *
 * <p><strong>注意:</strong> 输入数组的长度不会超过 10000。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>next-greater-element-i</li>
 *   <li>next-greater-element-iii</li>
 * </ul>
 */
@Problem(
    id = 503,
    name = "next-greater-element-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STACK}
)
public class NextGreaterElementII {

    public int[] nextGreaterElements(int[] nums) {
        return null;
    }
}

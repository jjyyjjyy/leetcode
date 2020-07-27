package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/">在排序数组中查找元素的第一个和最后一个位置</a>
 *
 * <p>给定一个按照升序排列的整数数组 <code>nums</code>，和一个目标值 <code>target</code>。找出给定目标值在数组中的开始位置和结束位置。</p>
 *
 * <p>你的算法时间复杂度必须是&nbsp;<em>O</em>(log <em>n</em>) 级别。</p>
 *
 * <p>如果数组中不存在目标值，返回&nbsp;<code>[-1, -1]</code>。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> nums = [<code>5,7,7,8,8,10]</code>, target = 8
 * <strong>输出:</strong> [3,4]</pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> nums = [<code>5,7,7,8,8,10]</code>, target = 6
 * <strong>输出:</strong> [-1,-1]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>first-bad-version</li>
 * </ul>
 */
@Problem(
    id = 34,
    name = "find-first-and-last-position-of-element-in-sorted-array",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.BINARY_SEARCH}
)
public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        return new int[]{-1, -1};
    }
}

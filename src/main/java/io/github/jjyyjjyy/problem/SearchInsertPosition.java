package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/search-insert-position/">搜索插入位置</a>
 *
 * <p>给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。</p>
 *
 * <p>你可以假设数组中无重复元素。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,3,5,6], 5
 * <strong>输出:</strong> 2
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,3,5,6], 2
 * <strong>输出:</strong> 1
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,3,5,6], 7
 * <strong>输出:</strong> 4
 * </pre>
 *
 * <p><strong>示例 4:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,3,5,6], 0
 * <strong>输出:</strong> 0
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>first-bad-version</li>
 * </ul>
 */
@Problem(
    id = 35,
    name = "search-insert-position",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY, Tag.BINARY_SEARCH}
)
public class SearchInsertPosition {

    @Complexity("O(n)")
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] >= target) {
                return i;
            }
            i++;
        }
        return i;
    }

}

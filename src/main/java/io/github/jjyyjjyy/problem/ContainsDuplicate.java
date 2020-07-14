package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/contains-duplicate/">存在重复元素</a>
 *
 * <p>给定一个整数数组，判断是否存在重复元素。</p>
 *
 * <p>如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,2,3,1]
 * <strong>输出:</strong> true</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入: </strong>[1,2,3,4]
 * <strong>输出:</strong> false</pre>
 *
 * <p><strong>示例&nbsp;3:</strong></p>
 *
 * <pre><strong>输入: </strong>[1,1,1,3,3,4,3,2,4,2]
 * <strong>输出:</strong> true</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>contains-duplicate-ii</li>
 *   <li>contains-duplicate-iii</li>
 * </ul>
 */
@Problem(
    id = 217,
    name = "contains-duplicate",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY, Tag.HASH_TABLE}
)
public class ContainsDuplicate {

    /**
     * 将数组排完序, 依次比对相邻元素是否相同. 如果相同则表示有重复元素.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}

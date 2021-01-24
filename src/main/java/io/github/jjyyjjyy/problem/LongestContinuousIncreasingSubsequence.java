package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/">最长连续递增序列</a>
 *
 * <p>给定一个未经排序的整数数组，找到最长且<strong>连续</strong>的的递增序列。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [1,3,5,4,7]
 * <strong>输出:</strong> 3
 * <strong>解释:</strong> 最长连续递增序列是 [1,3,5], 长度为3。
 * 尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为5和7在原数组里被4隔开。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [2,2,2,2,2]
 * <strong>输出:</strong> 1
 * <strong>解释:</strong> 最长连续递增序列是 [2], 长度为1。
 * </pre>
 *
 * <p><strong>注意：</strong>数组长度不会超过10000。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>number-of-longest-increasing-subsequence</li>
 *   <li>minimum-window-subsequence</li>
 * </ul>
 */
@Problem(
    id = 674,
    name = "longest-continuous-increasing-subsequence",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class LongestContinuousIncreasingSubsequence {

    /**
     * 依次遍歷統計當前的最大遞增子序列長度
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int current = 1;
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                current++;
            } else {
                result = Math.max(current, result);
                current = 1;
            }
        }
        return Math.max(current, result);
    }
}

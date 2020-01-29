package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/number-of-longest-increasing-subsequence/">最长递增子序列的个数</a>
 *
 * <p>给定一个未排序的整数数组，找到最长递增子序列的个数。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [1,3,5,4,7]
 * <strong>输出:</strong> 2
 * <strong>解释:</strong> 有两个最长递增子序列，分别是 [1, 3, 4, 7] 和[1, 3, 5, 7]。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [2,2,2,2,2]
 * <strong>输出:</strong> 5
 * <strong>解释:</strong> 最长递增子序列的长度是1，并且存在5个子序列的长度为1，因此输出5。
 * </pre>
 *
 * <p><strong>注意:</strong>&nbsp;给定的数组长度不超过 2000 并且结果一定是32位有符号整数。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>longest-increasing-subsequence</li>
 *   <li>longest-continuous-increasing-subsequence</li>
 * </ul>
 */
@Problem(
    id = 673,
    name = "number-of-longest-increasing-subsequence",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class NumberofLongestIncreasingSubsequence {
}

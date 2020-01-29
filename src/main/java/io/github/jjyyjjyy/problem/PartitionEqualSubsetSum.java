package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/partition-equal-subset-sum/">分割等和子集</a>
 *
 * <p>给定一个<strong>只包含正整数</strong>的<strong>非空</strong>数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。</p>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li>每个数组中的元素不会超过 100</li>
 * 	<li>数组的大小不会超过 200</li>
 * </ol>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>输入: [1, 5, 11, 5]
 *
 * 输出: true
 *
 * 解释: 数组可以分割成 [1, 5, 5] 和 [11].
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre>输入: [1, 2, 3, 5]
 *
 * 输出: false
 *
 * 解释: 数组不能分割成两个元素和相等的子集.
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>partition-to-k-equal-sum-subsets</li>
 * </ul>
 */
@Problem(
    id = 416,
    name = "partition-equal-subset-sum",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class PartitionEqualSubsetSum {
}

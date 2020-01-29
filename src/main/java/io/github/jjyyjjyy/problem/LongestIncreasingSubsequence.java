package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/longest-increasing-subsequence/">最长上升子序列</a>
 *
 * <p>给定一个无序的整数数组，找到其中最长上升子序列的长度。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>[10,9,2,5,3,7,101,18]
 * </code><strong>输出: </strong>4
 * <strong>解释: </strong>最长的上升子序列是&nbsp;<code>[2,3,7,101]，</code>它的长度是 <code>4</code>。</pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ul>
 * 	<li>可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。</li>
 * 	<li>你算法的时间复杂度应该为&nbsp;O(<em>n<sup>2</sup></em>) 。</li>
 * </ul>
 *
 * <p><strong>进阶:</strong> 你能将算法的时间复杂度降低到&nbsp;O(<em>n</em> log <em>n</em>) 吗?</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>increasing-triplet-subsequence</li>
 *   <li>russian-doll-envelopes</li>
 *   <li>maximum-length-of-pair-chain</li>
 *   <li>number-of-longest-increasing-subsequence</li>
 *   <li>minimum-ascii-delete-sum-for-two-strings</li>
 * </ul>
 */
@Problem(
    id = 300,
    name = "longest-increasing-subsequence",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BINARY_SEARCH, Tag.DYNAMIC_PROGRAMMING}
)
public class LongestIncreasingSubsequence {
}

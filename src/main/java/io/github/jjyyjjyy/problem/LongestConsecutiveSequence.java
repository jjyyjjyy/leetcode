package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/longest-consecutive-sequence/">最长连续序列</a>
 *
 * <p>给定一个未排序的整数数组，找出最长连续序列的长度。</p>
 *
 * <p>要求算法的时间复杂度为&nbsp;<em>O(n)</em>。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong>&nbsp;[100, 4, 200, 1, 3, 2]
 * <strong>输出:</strong> 4
 * <strong>解释:</strong> 最长连续序列是 <code>[1, 2, 3, 4]。它的长度为 4。</code></pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>binary-tree-longest-consecutive-sequence</li>
 * </ul>
 */
@Problem(
    id = 128,
    name = "longest-consecutive-sequence",
    difficulty = Difficulty.HARD,
    tags = {Tag.UNION_FIND, Tag.ARRAY}
)
public class LongestConsecutiveSequence {
}

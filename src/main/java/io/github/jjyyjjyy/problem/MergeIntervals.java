package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/merge-intervals/">合并区间</a>
 *
 * <p>给出一个区间的集合，请合并所有重叠的区间。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [[1,3],[2,6],[8,10],[15,18]]
 * <strong>输出:</strong> [[1,6],[8,10],[15,18]]
 * <strong>解释:</strong> 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> [[1,4],[4,5]]
 * <strong>输出:</strong> [[1,5]]
 * <strong>解释:</strong> 区间 [1,4] 和 [4,5] 可被视为重叠区间。</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>insert-interval</li>
 *   <li>meeting-rooms</li>
 *   <li>meeting-rooms-ii</li>
 *   <li>teemo-attacking</li>
 *   <li>add-bold-tag-in-string</li>
 *   <li>range-module</li>
 *   <li>employee-free-time</li>
 *   <li>partition-labels</li>
 *   <li>interval-list-intersections</li>
 * </ul>
 */
@Problem(
    id = 56,
    name = "merge-intervals",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.SORT, Tag.ARRAY}
)
public class MergeIntervals {
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/search-in-rotated-sorted-array/">搜索旋转排序数组</a>
 *
 * <p>假设按照升序排序的数组在预先未知的某个点上进行了旋转。</p>
 *
 * <p>( 例如，数组&nbsp;<code>[0,1,2,4,5,6,7]</code>&nbsp;可能变为&nbsp;<code>[4,5,6,7,0,1,2]</code>&nbsp;)。</p>
 *
 * <p>搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回&nbsp;<code>-1</code>&nbsp;。</p>
 *
 * <p>你可以假设数组中不存在重复的元素。</p>
 *
 * <p>你的算法时间复杂度必须是&nbsp;<em>O</em>(log&nbsp;<em>n</em>) 级别。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> nums = [<code>4,5,6,7,0,1,2]</code>, target = 0
 * <strong>输出:</strong> 4
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> nums = [<code>4,5,6,7,0,1,2]</code>, target = 3
 * <strong>输出:</strong> -1</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>search-in-rotated-sorted-array-ii</li>
 *   <li>find-minimum-in-rotated-sorted-array</li>
 * </ul>
 */
@Problem(
    id = 33,
    name = "search-in-rotated-sorted-array",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.BINARY_SEARCH}
)
public class SearchinRotatedSortedArray {
}

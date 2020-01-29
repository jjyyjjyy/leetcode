package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/binary-search/">二分查找</a>
 *
 * <p>给定一个&nbsp;<code>n</code>&nbsp;个元素有序的（升序）整型数组&nbsp;<code>nums</code> 和一个目标值&nbsp;<code>target</code> &nbsp;，写一个函数搜索&nbsp;<code>nums</code>&nbsp;中的 <code>target</code>，如果目标值存在返回下标，否则返回 <code>-1</code>。</p>
 *
 * <p><br>
 * <strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>nums</code> = [-1,0,3,5,9,12], <code>target</code> = 9
 * <strong>输出:</strong> 4
 * <strong>解释:</strong> 9 出现在 <code>nums</code> 中并且下标为 4
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>nums</code> = [-1,0,3,5,9,12], <code>target</code> = 2
 * <strong>输出:</strong> -1
 * <strong>解释:</strong> 2 不存在 <code>nums</code> 中因此返回 -1
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li>你可以假设 <code>nums</code>&nbsp;中的所有元素是不重复的。</li>
 * 	<li><code>n</code>&nbsp;将在&nbsp;<code>[1, 10000]</code>之间。</li>
 * 	<li><code>nums</code>&nbsp;的每个元素都将在&nbsp;<code>[-9999, 9999]</code>之间。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>search-in-a-sorted-array-of-unknown-size</li>
 * </ul>
 */
@Problem(
    id = 792,
    name = "binary-search",
    difficulty = Difficulty.EASY,
    tags = {Tag.BINARY_SEARCH}
)
public class BinarySearch {
}

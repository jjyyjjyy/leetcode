package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/count-of-smaller-numbers-after-self/">计算右侧小于当前元素的个数</a>
 *
 * <p>给定一个整数数组 <em>nums</em>，按要求返回一个新数组&nbsp;<em>counts</em>。数组 <em>counts</em> 有该性质： <code>counts[i]</code> 的值是&nbsp; <code>nums[i]</code> 右侧小于&nbsp;<code>nums[i]</code> 的元素的数量。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> [5,2,6,1]
 * <strong>输出:</strong> <code>[2,1,1,0]
 * <strong>解释:</strong></code>
 * 5 的右侧有 <strong>2 </strong>个更小的元素 (2 和 1).
 * 2 的右侧仅有 <strong>1 </strong>个更小的元素 (1).
 * 6 的右侧有 <strong>1 </strong>个更小的元素 (1).
 * 1 的右侧有 <strong>0 </strong>个更小的元素.
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>count-of-range-sum</li>
 *   <li>queue-reconstruction-by-height</li>
 *   <li>reverse-pairs</li>
 * </ul>
 */
@Problem(
    id = 315,
    name = "count-of-smaller-numbers-after-self",
    difficulty = Difficulty.HARD,
    tags = {Tag.SORT, Tag.BINARY_INDEXED_TREE, Tag.SEGMENT_TREE, Tag.BINARY_SEARCH, Tag.DIVIDE_AND_CONQUER}
)
public class CountofSmallerNumbersAfterSelf {
}

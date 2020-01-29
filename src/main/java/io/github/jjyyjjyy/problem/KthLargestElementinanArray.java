package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/kth-largest-element-in-an-array/">数组中的第K个最大元素</a>
 *
 * <p>在未排序的数组中找到第 <strong>k</strong> 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>[3,2,1,5,6,4] 和</code> k = 2
 * <strong>输出:</strong> 5
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>[3,2,3,1,2,4,5,5,6] 和</code> k = 4
 * <strong>输出:</strong> 4</pre>
 *
 * <p><strong>说明: </strong></p>
 *
 * <p>你可以假设 k 总是有效的，且 1 &le; k &le; 数组的长度。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>wiggle-sort-ii</li>
 *   <li>top-k-frequent-elements</li>
 *   <li>third-maximum-number</li>
 *   <li>kth-largest-element-in-a-stream</li>
 *   <li>k-closest-points-to-origin</li>
 * </ul>
 */
@Problem(
    id = 215,
    name = "kth-largest-element-in-an-array",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HEAP, Tag.DIVIDE_AND_CONQUER}
)
public class KthLargestElementinanArray {
}

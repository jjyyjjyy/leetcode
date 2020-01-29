package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/">两数之和 II - 输入有序数组</a>
 *
 * <p>给定一个已按照<strong><em>升序排列</em>&nbsp;</strong>的有序数组，找到两个数使得它们相加之和等于目标数。</p>
 *
 * <p>函数应该返回这两个下标值<em> </em>index1 和 index2，其中 index1&nbsp;必须小于&nbsp;index2<em>。</em></p>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ul>
 * 	<li>返回的下标值（index1 和 index2）不是从零开始的。</li>
 * 	<li>你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。</li>
 * </ul>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> numbers = [2, 7, 11, 15], target = 9
 * <strong>输出:</strong> [1,2]
 * <strong>解释:</strong> 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>two-sum</li>
 *   <li>two-sum-iv-input-is-a-bst</li>
 *   <li>two-sum-less-than-k</li>
 * </ul>
 */
@Problem(
    id = 167,
    name = "two-sum-ii-input-array-is-sorted",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY, Tag.TWO_POINTERS, Tag.BINARY_SEARCH}
)
public class TwoSumIIInputarrayissorted {
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-size-subarray-sum/">长度最小的子数组</a>
 *
 * <p>给定一个含有&nbsp;<strong>n&nbsp;</strong>个正整数的数组和一个正整数&nbsp;<strong>s ，</strong>找出该数组中满足其和<strong> &ge; s </strong>的长度最小的连续子数组<strong>。</strong>如果不存在符合条件的连续子数组，返回 0。</p>
 *
 * <p><strong>示例:&nbsp;</strong></p>
 *
 * <pre><strong>输入:</strong> <code>s = 7, nums = [2,3,1,2,4,3]</code>
 * <strong>输出:</strong> 2
 * <strong>解释: </strong>子数组&nbsp;<code>[4,3]</code>&nbsp;是该条件下的长度最小的连续子数组。
 * </pre>
 *
 * <p><strong>进阶:</strong></p>
 *
 * <p>如果你已经完成了<em>O</em>(<em>n</em>) 时间复杂度的解法, 请尝试&nbsp;<em>O</em>(<em>n</em> log <em>n</em>) 时间复杂度的解法。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>minimum-window-substring</li>
 *   <li>maximum-size-subarray-sum-equals-k</li>
 *   <li>maximum-length-of-repeated-subarray</li>
 * </ul>
 */
@Problem(
    id = 209,
    name = "minimum-size-subarray-sum",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.TWO_POINTERS, Tag.BINARY_SEARCH}
)
public class MinimumSizeSubarraySum {
}

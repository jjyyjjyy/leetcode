package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/contiguous-array/">连续数组</a>
 *
 * <p>给定一个二进制数组, 找到含有相同数量的 0 和 1 的最长连续子数组（的长度）。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [0,1]
 * <strong>输出:</strong> 2
 * <strong>说明:</strong> [0, 1] 是具有相同数量0和1的最长连续子数组。</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> [0,1,0]
 * <strong>输出:</strong> 2
 * <strong>说明:</strong> [0, 1] (或 [1, 0]) 是具有相同数量0和1的最长连续子数组。</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>注意:&nbsp;</strong>给定的二进制数组的长度不会超过50000。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>maximum-size-subarray-sum-equals-k</li>
 * </ul>
 */
@Problem(
    id = 525,
    name = "contiguous-array",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HASH_TABLE}
)
public class ContiguousArray {
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/permutations/">全排列</a>
 *
 * <p>给定一个<strong>没有重复</strong>数字的序列，返回其所有可能的全排列。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,2,3]
 * <strong>输出:</strong>
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>next-permutation</li>
 *   <li>permutations-ii</li>
 *   <li>permutation-sequence</li>
 *   <li>combinations</li>
 * </ul>
 */
@Problem(
    id = 46,
    name = "permutations",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BACKTRACKING}
)
public class Permutations {
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/permutations-ii/">全排列 II</a>
 *
 * <p>给定一个可包含重复数字的序列，返回所有不重复的全排列。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,1,2]
 * <strong>输出:</strong>
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>next-permutation</li>
 *   <li>permutations</li>
 *   <li>palindrome-permutation-ii</li>
 *   <li>number-of-squareful-arrays</li>
 * </ul>
 */
@Problem(
    id = 47,
    name = "permutations-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BACKTRACKING}
)
public class PermutationsII {
}

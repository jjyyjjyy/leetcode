package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/subsets/">子集</a>
 *
 * <p>给定一组<strong>不含重复元素</strong>的整数数组&nbsp;<em>nums</em>，返回该数组所有可能的子集（幂集）。</p>
 *
 * <p><strong>说明：</strong>解集不能包含重复的子集。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> nums = [1,2,3]
 * <strong>输出:</strong>
 * [
 *   [3],
 * &nbsp; [1],
 * &nbsp; [2],
 * &nbsp; [1,2,3],
 * &nbsp; [1,3],
 * &nbsp; [2,3],
 * &nbsp; [1,2],
 * &nbsp; []
 * ]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>subsets-ii</li>
 *   <li>generalized-abbreviation</li>
 *   <li>letter-case-permutation</li>
 * </ul>
 */
@Problem(
    id = 78,
    name = "subsets",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BIT_MANIPULATION, Tag.ARRAY, Tag.BACKTRACKING}
)
public class Subsets {
}

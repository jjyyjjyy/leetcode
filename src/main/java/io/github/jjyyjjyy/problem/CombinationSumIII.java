package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/combination-sum-iii/">组合总和 III</a>
 *
 * <p>找出所有相加之和为&nbsp;<em><strong>n</strong> </em>的&nbsp;<strong><em>k&nbsp;</em></strong>个数的组合<strong><em>。</em></strong>组合中只允许含有 1 -&nbsp;9 的正整数，并且每种组合中不存在重复的数字。</p>
 *
 * <p><strong>说明：</strong></p>
 *
 * <ul>
 * 	<li>所有数字都是正整数。</li>
 * 	<li>解集不能包含重复的组合。&nbsp;</li>
 * </ul>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> <em><strong>k</strong></em> = 3, <em><strong>n</strong></em> = 7
 * <strong>输出:</strong> [[1,2,4]]
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> <em><strong>k</strong></em> = 3, <em><strong>n</strong></em> = 9
 * <strong>输出:</strong> [[1,2,6], [1,3,5], [2,3,4]]
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>combination-sum</li>
 * </ul>
 */
@Problem(
    id = 216,
    name = "combination-sum-iii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.BACKTRACKING}
)
public class CombinationSumIII {
}

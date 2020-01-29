package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/combinations/">组合</a>
 *
 * <p>给定两个整数 <em>n</em> 和 <em>k</em>，返回 1 ... <em>n </em>中所有可能的 <em>k</em> 个数的组合。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong>&nbsp;n = 4, k = 2
 * <strong>输出:</strong>
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>combination-sum</li>
 *   <li>permutations</li>
 * </ul>
 */
@Problem(
    id = 77,
    name = "combinations",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BACKTRACKING}
)
public class Combinations {
}

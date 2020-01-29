package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-path-sum/">最小路径和</a>
 *
 * <p>给定一个包含非负整数的 <em>m</em>&nbsp;x&nbsp;<em>n</em>&nbsp;网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。</p>
 *
 * <p><strong>说明：</strong>每次只能向下或者向右移动一步。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * [
 * &nbsp; [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * <strong>输出:</strong> 7
 * <strong>解释:</strong> 因为路径 1&rarr;3&rarr;1&rarr;1&rarr;1 的总和最小。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>unique-paths</li>
 *   <li>dungeon-game</li>
 *   <li>cherry-pickup</li>
 * </ul>
 */
@Problem(
    id = 64,
    name = "minimum-path-sum",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.DYNAMIC_PROGRAMMING}
)
public class MinimumPathSum {
}

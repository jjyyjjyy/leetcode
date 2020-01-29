package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/maximal-square/">最大正方形</a>
 *
 * <p>在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:
 * </strong>
 * 1 0 1 0 0
 * 1 0 <strong>1 1</strong> 1
 * 1 1 <strong>1 1 </strong>1
 * 1 0 0 1 0
 *
 * <strong>输出: </strong>4</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>maximal-rectangle</li>
 *   <li>largest-plus-sign</li>
 * </ul>
 */
@Problem(
    id = 221,
    name = "maximal-square",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class MaximalSquare {
}

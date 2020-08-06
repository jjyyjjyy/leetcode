package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/spiral-matrix-ii/">螺旋矩阵 II</a>
 *
 * <p>给定一个正整数&nbsp;<em>n</em>，生成一个包含 1 到&nbsp;<em>n</em><sup>2</sup>&nbsp;所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> 3
 * <strong>输出:</strong>
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>spiral-matrix</li>
 * </ul>
 */
@Problem(
    id = 59,
    name = "spiral-matrix-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY}
)
public class SpiralMatrixII {

    public int[][] generateMatrix(int n) {
        return new int[0][0];
    }
}

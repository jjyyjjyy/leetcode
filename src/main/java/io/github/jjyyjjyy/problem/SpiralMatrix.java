package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/spiral-matrix/">螺旋矩阵</a>
 *
 * <p>给定一个包含&nbsp;<em>m</em> x <em>n</em>&nbsp;个元素的矩阵（<em>m</em> 行, <em>n</em> 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * <strong>输出:</strong> [1,2,3,6,9,8,7,4,5]
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * [
 *   [1, 2, 3, 4],
 *   [5, 6, 7, 8],
 *   [9,10,11,12]
 * ]
 * <strong>输出:</strong> [1,2,3,4,8,12,11,10,9,5,6,7]
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>spiral-matrix-ii</li>
 * </ul>
 */
@Problem(
    id = 54,
    name = "spiral-matrix",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY}
)
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        return null;
    }

}

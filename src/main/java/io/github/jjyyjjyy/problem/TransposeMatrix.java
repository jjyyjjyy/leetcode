package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/transpose-matrix/">转置矩阵</a>
 *
 * <p>给定一个矩阵&nbsp;<code>A</code>，&nbsp;返回&nbsp;<code>A</code>&nbsp;的转置矩阵。</p>
 *
 * <p>矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>[[1,2,3],[4,5,6],[7,8,9]]
 * <strong>输出：</strong>[[1,4,7],[2,5,8],[3,6,9]]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>[[1,2,3],[4,5,6]]
 * <strong>输出：</strong>[[1,4],[2,5],[3,6]]
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= A.length&nbsp;&lt;= 1000</code></li>
 * 	<li><code>1 &lt;= A[0].length&nbsp;&lt;= 1000</code></li>
 * </ol>
 */
@Problem(
    id = 898,
    name = "transpose-matrix",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class TransposeMatrix {

    @Complexity(Complexity.ComplexityType.O_M_N)
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] result = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}

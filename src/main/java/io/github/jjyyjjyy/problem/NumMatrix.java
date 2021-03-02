package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/range-sum-query-2d-immutable/">二维区域和检索 - 矩阵不可变</a>
 *
 * <p>给定一个二维矩阵，计算其子矩形范围内元素的总和，该子矩阵的左上角为 (<em>row</em>1,&nbsp;<em>col</em>1) ，右下角为 (<em>row</em>2,&nbsp;<em>col</em>2)。</p>
 *
 * <p><img alt="Range Sum Query 2D" src="https://assets.leetcode-cn.com/aliyun-lc-upload/images/304.png" style="width: 130px;"><br>
 * <small>上图子矩阵左上角&nbsp;(row1, col1) = <strong>(2, 1)</strong>&nbsp;，右下角(row2, col2) = <strong>(4, 3)，</strong>该子矩形内元素的总和为 8。</small></p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>给定 matrix = [
 *   [3, 0, 1, 4, 2],
 *   [5, 6, 3, 2, 1],
 *   [1, 2, 0, 1, 5],
 *   [4, 1, 0, 1, 7],
 *   [1, 0, 3, 0, 5]
 * ]
 *
 * sumRegion(2, 1, 4, 3) -&gt; 8
 * sumRegion(1, 1, 2, 2) -&gt; 11
 * sumRegion(1, 2, 2, 4) -&gt; 12
 * </pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ol>
 * 	<li>你可以假设矩阵不可变。</li>
 * 	<li>会多次调用&nbsp;<em>sumRegion&nbsp;</em>方法<em>。</em></li>
 * 	<li>你可以假设&nbsp;<em>row</em>1 &le; <em>row</em>2 且&nbsp;<em>col</em>1 &le; <em>col</em>2。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>range-sum-query-immutable</li>
 *   <li>range-sum-query-2d-mutable</li>
 * </ul>
 */
@Problem(
    id = 304,
    name = "range-sum-query-2d-immutable",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class NumMatrix {

    private int[][] sums = new int[0][0];

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) {
            return;
        }
        int n = matrix[0].length;
        sums = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sums[i + 1][j + 1] = sums[i][j + 1] + sums[i + 1][j] - sums[i][j] + matrix[i][j];
            }
        }
    }

    /**
     * 1. 提前计算好(0,0)到每个点的二维前缀和.
     * 2. ((row1,col1),(row2,col2))矩阵内点的和等于sums[row2+1][col2+1]-sums[row1][col2+1]-sums[row2+1][col1]+sums[row1][col1].
     */
    @Complexity(Complexity.ComplexityType.O_1)
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sums[row2 + 1][col2 + 1] - sums[row1][col2 + 1] - sums[row2 + 1][col1] + sums[row1][col1];
    }

    private static class NumMatrix2 {
        private int[][] sums = new int[0][0];

        public NumMatrix2(int[][] matrix) {
            int m = matrix.length;
            if (m == 0) {
                return;
            }
            int n = matrix[0].length;
            sums = new int[m][n + 1];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    sums[i][j + 1] = sums[i][j] + matrix[i][j];
                }
            }
        }

        /**
         * 提前计算二维数组每行的前缀和, 再逐行计算区间和.
         */
        @Complexity(Complexity.ComplexityType.O_N)
        public int sumRegion(int row1, int col1, int row2, int col2) {
            int result = 0;
            for (int i = row1; i <= row2; i++) {
                result += sums[i][col2 + 1] - sums[i][col1];
            }
            return result;
        }
    }

}

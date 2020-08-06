package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
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

    /**
     * 维护四个变量left, right, top, bottom. 按照上->右->下->左的顺序遍历数组赋值.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int current = 1, number = n * n;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;

        while (current <= number) {
            for (int i = left; i <= right; i++) {
                result[top][i] = current++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result[i][right] = current++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                result[bottom][i] = current++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                result[i][left] = current++;
            }
            left++;
        }
        return result;
    }
}

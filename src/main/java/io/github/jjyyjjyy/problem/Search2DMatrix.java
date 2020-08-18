package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/search-a-2d-matrix/">搜索二维矩阵</a>
 *
 * <p>编写一个高效的算法来判断&nbsp;<em>m</em> x <em>n</em>&nbsp;矩阵中，是否存在一个目标值。该矩阵具有如下特性：</p>
 *
 * <ul>
 * 	<li>每行中的整数从左到右按升序排列。</li>
 * 	<li>每行的第一个整数大于前一行的最后一个整数。</li>
 * </ul>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 3
 * <strong>输出:</strong> true
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 13
 * <strong>输出:</strong> false</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>search-a-2d-matrix-ii</li>
 * </ul>
 */
@Problem(
    id = 74,
    name = "search-a-2d-matrix",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.BINARY_SEARCH}
)
public class Search2DMatrix {

    /**
     * 将矩阵想象层扁平化的一行, 对这一行二分查找.
     * row = mid / n
     * col = mid % n
     */
    @Complexity(Complexity.ComplexityType.O_LOG_M_N)
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) {
            return false;
        }
        int n = matrix[0].length;
        if (n == 0) {
            return false;
        }

        int left = 0, right = m * n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            int row = mid / n;
            int col = mid % n;
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    /**
     * 从上到下, 从左到右二分查找
     */
    @Complexity(Complexity.ComplexityType.O_LOG_M_N)
    public boolean searchMatrix2(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) {
            return false;
        }
        int top = 0;
        int bottom = matrix.length - 1;
        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;
            if (searchRow(matrix[mid], target)) {
                return true;
            }
            if (matrix[mid].length > 0 && matrix[mid][0] < target) {
                top = mid + 1;
            } else {
                bottom = mid - 1;
            }
        }
        return false;
    }

    private boolean searchRow(int[] row, int target) {
        int left = 0;
        int right = row.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == target) {
                return true;
            } else if (row[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}

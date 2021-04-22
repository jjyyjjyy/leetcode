package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.TreeSet;

/**
 * <a href="https://leetcode-cn.com/problems/max-sum-of-rectangle-no-larger-than-k/">矩形区域不超过 K 的最大数值和</a>
 *
 * <p>给定一个非空二维矩阵&nbsp;<em>matrix&nbsp;</em>和一个整数<em> k</em>，找到这个矩阵内部不大于 <em>k</em> 的最大矩形和。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入: </strong>matrix = [[1,0,1],[0,-2,3]], k = 2
 * <strong>输出: </strong>2
 * <strong>解释:</strong>&nbsp;矩形区域&nbsp;<code>[[0, 1], [-2, 3]]</code>&nbsp;的数值和是 2，且 2 是不超过 k 的最大数字（k = 2）。
 * </pre>
 *
 * <p><strong>说明：</strong></p>
 *
 * <ol>
 * 	<li>矩阵内的矩形区域面积必须大于 0。</li>
 * 	<li>如果行数远大于列数，你将如何解答呢？</li>
 * </ol>
 */
@Problem(
    id = 363,
    name = "max-sum-of-rectangle-no-larger-than-k",
    difficulty = Difficulty.HARD,
    tags = {Tag.BINARY_SEARCH, Tag.DYNAMIC_PROGRAMMING}
)
public class MaxSumOfRectangleNoLargerThanK {

    /**
     * 1. 按行依次遍历.
     * 2. 按列依次遍历: 从当前列遍历到最后一列, 遍历每一行的时候计算每一列的和, 找到最大值.
     */
    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(m^2*n*logn)")
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int result = Integer.MIN_VALUE;
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int[] sum = new int[n];
            for (int j = i; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    sum[l] += matrix[j][l];
                }
                TreeSet<Integer> set = new TreeSet<>();
                set.add(0);
                int s = 0;
                for (int v : sum) {
                    s += v;
                    Integer ceiling = set.ceiling(s - k);
                    if (ceiling != null) {
                        result = Math.max(result, s - ceiling);
                    }
                    set.add(s);
                }
            }
        }
        return result;
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/number-of-submatrices-that-sum-to-target/">元素和为目标值的子矩阵数量</a>
 *
 * <p>给出矩阵&nbsp;<code>matrix</code>&nbsp;和目标值&nbsp;<code>target</code>，返回元素总和等于目标值的非空子矩阵的数量。</p>
 *
 * <p>子矩阵&nbsp;<code>x1, y1, x2, y2</code>&nbsp;是满足 <code>x1 &lt;= x &lt;= x2</code>&nbsp;且&nbsp;<code>y1 &lt;= y &lt;= y2</code>&nbsp;的所有单元&nbsp;<code>matrix[x][y]</code>&nbsp;的集合。</p>
 *
 * <p>如果&nbsp;<code>(x1, y1, x2, y2)</code> 和&nbsp;<code>(x1&#39;, y1&#39;, x2&#39;, y2&#39;)</code>&nbsp;两个子矩阵中部分坐标不同（如：<code>x1 != x1&#39;</code>），那么这两个子矩阵也不同。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>matrix = [[0,1,0],[1,1,1],[0,1,0]], target = 0
 * <strong>输出：</strong>4
 * <strong>解释：</strong>四个只含 0 的 1x1 子矩阵。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>matrix = [[1,-1],[-1,1]], target = 0
 * <strong>输出：</strong>5
 * <strong>解释：</strong>两个 1x2 子矩阵，加上两个 2x1 子矩阵，再加上一个 2x2 子矩阵。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong><strong>提示：</strong></strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= matrix.length &lt;= 300</code></li>
 * 	<li><code>1 &lt;= matrix[0].length &lt;= 300</code></li>
 * 	<li><code>-1000 &lt;= matrix[i] &lt;= 1000</code></li>
 * 	<li><code>-10^8 &lt;= target &lt;= 10^8</code></li>
 * </ol>
 */
@Problem(
    id = 1145,
    name = "number-of-submatrices-that-sum-to-target",
    difficulty = Difficulty.HARD,
    tags = {Tag.ARRAY, Tag.DYNAMIC_PROGRAMMING, Tag.SLIDING_WINDOW}
)
public class NumberOfSubmatricesThatSumToTarget {

    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(m^2*n)")
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int result = 0;

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            int[] sum = new int[n];
            for (int j = i; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    sum[k] += matrix[j][k];
                }
                result += subArraySum(sum, target);
            }
        }
        return result;
    }

    /**
     * 1. 依次遍历数组, 使用哈希表统计子数组和等于target的数量.
     * 2. 如果当前值与target差值在哈希表中存在, 计数加1.
     * 3. 将前缀和保存到哈希表中.
     */
    private int subArraySum(int[] sum, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int pre = 0;
        for (int x : sum) {
            pre += x;
            count += map.getOrDefault(pre - target, 0);
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/find-kth-largest-xor-coordinate-value/">找出第 K 大的异或坐标值</a>
 *
 * <p>给你一个二维矩阵 <code>matrix</code> 和一个整数 <code>k</code> ，矩阵大小为 <code>m x n</code> 由非负整数组成。</p>
 *
 * <p>矩阵中坐标 <code>(a, b)</code> 的 <strong>值</strong> 可由对所有满足 <code>0 &lt;= i &lt;= a &lt; m</code> 且 <code>0 &lt;= j &lt;= b &lt; n</code> 的元素 <code>matrix[i][j]</code>（<strong>下标从 0 开始计数</strong>）执行异或运算得到。</p>
 *
 * <p>请你找出 <code>matrix</code> 的所有坐标中第 <code>k</code> 大的值（<strong><code>k</code> 的值从 1 开始计数</strong>）。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>matrix = [[5,2],[1,6]], k = 1
 * <strong>输出：</strong>7
 * <strong>解释：</strong>坐标 (0,1) 的值是 5 XOR 2 = 7 ，为最大的值。</pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>matrix = [[5,2],[1,6]], k = 2
 * <strong>输出：</strong>5
 * <strong>解释：</strong>坐标 (0,0) 的值是 5 = 5 ，为第 2 大的值。</pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>matrix = [[5,2],[1,6]], k = 3
 * <strong>输出：</strong>4
 * <strong>解释：</strong>坐标 (1,0) 的值是 5 XOR 1 = 4 ，为第 3 大的值。</pre>
 *
 * <p><strong>示例 4：</strong></p>
 *
 * <pre><strong>输入：</strong>matrix = [[5,2],[1,6]], k = 4
 * <strong>输出：</strong>0
 * <strong>解释：</strong>坐标 (1,1) 的值是 5 XOR 2 XOR 1 XOR 6 = 0 ，为第 4 大的值。</pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>m == matrix.length</code></li>
 * 	<li><code>n == matrix[i].length</code></li>
 * 	<li><code>1 &lt;= m, n &lt;= 1000</code></li>
 * 	<li><code>0 &lt;= matrix[i][j] &lt;= 10<sup>6</sup></code></li>
 * 	<li><code>1 &lt;= k &lt;= m * n</code></li>
 * </ul>
 */
@Problem(
    id = 1860,
    name = "find-kth-largest-xor-coordinate-value",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY}
)
public class FindKthLargestXorCoordinateValue {

    /**
     * 1. 计算二维数组的前缀和.
     * 2. 排序, 找到k-1位置的前缀和.
     */
    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(mnlog(mn))")
    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] pre = new int[m + 1][n + 1];
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                pre[i][j] = pre[i - 1][j] ^ pre[i][j - 1] ^ pre[i - 1][j - 1] ^ matrix[i - 1][j - 1];
                result.add(pre[i][j]);
            }
        }
        result.sort((a, b) -> b - a);
        return result.get(k - 1);
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/uncrossed-lines/">不相交的线</a>
 *
 * <p>我们在两条独立的水平线上按给定的顺序写下&nbsp;<code>A</code>&nbsp;和&nbsp;<code>B</code>&nbsp;中的整数。</p>
 *
 * <p>现在，我们可以绘制一些连接两个数字&nbsp;<code>A[i]</code>&nbsp;和&nbsp;<code>B[j]</code>&nbsp;的直线，只要&nbsp;<code>A[i] == B[j]</code>，且我们绘制的直线不与任何其他连线（非水平线）相交。</p>
 *
 * <p>以这种方法绘制线条，并返回我们可以绘制的最大连线数。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <p><strong><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/04/28/142.png" style="height: 72px; width: 100px;"></strong></p>
 *
 * <pre><strong>输入：</strong>A = [1,4,2], B = [1,2,4]
 * <strong>输出：</strong>2
 * <strong>解释：
 * </strong>我们可以画出两条不交叉的线，如上图所示。
 * 我们无法画出第三条不相交的直线，因为从 A[1]=4 到 B[2]=4 的直线将与从 A[2]=2 到 B[1]=2 的直线相交。</pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>A = [2,5,1,2,5], B = [10,5,2,1,5,2]
 * <strong>输出：</strong>3
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>A = [1,3,7,1,7,5], B = [1,9,2,5,1]
 * <strong>输出：</strong>2</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= A.length &lt;= 500</code></li>
 * 	<li><code>1 &lt;= B.length &lt;= 500</code></li>
 * 	<li><code>1 &lt;= A[i], B[i] &lt;= 2000</code></li>
 * </ol>
 *
 * <p>&nbsp;</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>edit-distance</li>
 * </ul>
 */
@Problem(
    id = 1105,
    name = "uncrossed-lines",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY}
)
public class UncrossedLines {

    /**
     * 1. 维护一个二维数组dp保存从1到m/n的连接数.
     * 2. 依次遍历两个数组,如果当前元素相等, 则当前连接数等于上一个位置的连接数加1, 否则等于i-1连j和i连j-1的最大值.
     */
    @Complexity(Complexity.ComplexityType.O_M_N)
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            int n1 = nums1[i - 1];
            for (int j = 1; j <= n; j++) {
                int n2 = nums2[j - 1];
                if (n1 == n2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}

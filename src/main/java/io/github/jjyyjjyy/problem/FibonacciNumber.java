package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/fibonacci-number/">斐波那契数</a>
 *
 * <p><strong>斐波那契数</strong>，通常用&nbsp;<code>F(n)</code> 表示，形成的序列称为<strong>斐波那契数列</strong>。该数列由&nbsp;<code>0</code> 和 <code>1</code> 开始，后面的每一项数字都是前面两项数字的和。也就是：</p>
 *
 * <pre>F(0) = 0,&nbsp; &nbsp;F(1)&nbsp;= 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N &gt; 1.
 * </pre>
 *
 * <p>给定&nbsp;<code>N</code>，计算&nbsp;<code>F(N)</code>。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>2
 * <strong>输出：</strong>1
 * <strong>解释：</strong>F(2) = F(1) + F(0) = 1 + 0 = 1.
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>3
 * <strong>输出：</strong>2
 * <strong>解释：</strong>F(3) = F(2) + F(1) = 1 + 1 = 2.
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>4
 * <strong>输出：</strong>3
 * <strong>解释：</strong>F(4) = F(3) + F(2) = 2 + 1 = 3.
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li>0 &le; <code>N</code> &le; 30</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>climbing-stairs</li>
 *   <li>split-array-into-fibonacci-sequence</li>
 *   <li>length-of-longest-fibonacci-subsequence</li>
 * </ul>
 */
@Problem(
    id = 1013,
    name = "fibonacci-number",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class FibonacciNumber {

    /**
     * 1. 维护一个存放历史计算结果的数组, 其中f(0)=0, f(1)=1.
     * 2. 从2开始遍历到n, f(n)=f(n-2)+f(n-1).
     * 3. f(n)即为最后的结果.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        return dp[n];
    }
}

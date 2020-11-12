package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/super-ugly-number/">超级丑数</a>
 *
 * <p>编写一段程序来查找第 <code><em>n</em></code> 个超级丑数。</p>
 *
 * <p>超级丑数是指其所有质因数都是长度为&nbsp;<code>k</code>&nbsp;的质数列表&nbsp;<code>primes</code>&nbsp;中的正整数。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> n = 12, <code>primes</code> = <code>[2,7,13,19]</code>
 * <strong>输出:</strong> 32
 * <strong>解释: </strong>给定长度为 4 的质数列表 primes = [2,7,13,19]，前 12 个超级丑数序列为：[1,2,4,7,8,13,14,16,19,26,28,32] 。</pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ul>
 * 	<li><code>1</code>&nbsp;是任何给定&nbsp;<code>primes</code>&nbsp;的超级丑数。</li>
 * 	<li>&nbsp;给定&nbsp;<code>primes</code>&nbsp;中的数字以升序排列。</li>
 * 	<li>0 &lt; <code>k</code> &le; 100, 0 &lt; <code>n</code> &le; 10<sup>6</sup>, 0 &lt; <code>primes[i]</code> &lt; 1000 。</li>
 * 	<li>第&nbsp;<code>n</code>&nbsp;个超级丑数确保在 32 位有符整数范围内。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>ugly-number-ii</li>
 * </ul>
 */
@Problem(
    id = 313,
    name = "super-ugly-number",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HEAP, Tag.MATH}
)
public class SuperUglyNumber {

    /**
     * 1. 维护一个从1到n的丑数数组.
     * 2. 为每个prime维护一个单独的指针.
     * 3. 遍历primes, 将当前丑数与每个prime相乘, 比较并得到一个最小的丑数, 加入到丑数数组中. 再将所有相乘结果等于这个最小丑数的指针前进一位.
     */
    @Complexity(Complexity.ComplexityType.O_M_N)
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n];
        dp[0] = 1;

        int length = primes.length;
        int[] pointers = new int[length];

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < length; j++) {
                min = Math.min(min, dp[pointers[j]] * primes[j]);
            }
            dp[i] = min;
            for (int j = 0; j < length; j++) {
                if (dp[pointers[j]] * primes[j] == min) {
                    pointers[j]++;
                }
            }
        }
        return dp[n - 1];
    }
}

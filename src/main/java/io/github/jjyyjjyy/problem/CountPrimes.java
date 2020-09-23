package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/count-primes/">计数质数</a>
 *
 * <p>统计所有小于非负整数&nbsp;<em>n&nbsp;</em>的质数的数量。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> 10
 * <strong>输出:</strong> 4
 * <strong>解释:</strong> 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>ugly-number</li>
 *   <li>ugly-number-ii</li>
 *   <li>perfect-squares</li>
 * </ul>
 */
@Problem(
    id = 204,
    name = "count-primes",
    difficulty = Difficulty.EASY,
    tags = {Tag.HASH_TABLE, Tag.MATH}
)
public class CountPrimes {

    @Complexity(Complexity.ComplexityType.O_N_POW_2)
    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }
        int count = 1;
        for (int i = 3; i < n; i++) {
            if ((i & 1) == 0) {
                continue;
            }
            boolean sign = true;
            for (int j = 3; j * j <= i; j += 2) {
                if (i % j == 0) {
                    sign = false;
                    break;
                }
            }
            if (sign) {
                count++;
            }
        }

        return count;
    }
}

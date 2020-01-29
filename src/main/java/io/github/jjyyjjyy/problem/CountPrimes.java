package io.github.jjyyjjyy.problem;

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
}

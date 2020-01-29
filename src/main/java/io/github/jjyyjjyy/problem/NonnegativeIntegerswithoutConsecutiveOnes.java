package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/non-negative-integers-without-consecutive-ones/">不含连续1的非负整数</a>
 *
 * <p>给定一个正整数 n，找出小于或等于 n 的非负整数中，其二进制表示不包含&nbsp;<strong>连续的1&nbsp;</strong>的个数。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> 5
 * <strong>输出:</strong> 5
 * <strong>解释:</strong>
 * 下面是带有相应二进制表示的非负整数&lt;= 5：
 * 0 : 0
 * 1 : 1
 * 2 : 10
 * 3 : 11
 * 4 : 100
 * 5 : 101
 * 其中，只有整数3违反规则（有两个连续的1），其他5个满足规则。</pre>
 *
 * <p><strong>说明:</strong> 1 &lt;= n &lt;= 10<sup>9</sup></p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>house-robber</li>
 *   <li>house-robber-ii</li>
 *   <li>ones-and-zeroes</li>
 * </ul>
 */
@Problem(
    id = 600,
    name = "non-negative-integers-without-consecutive-ones",
    difficulty = Difficulty.HARD,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class NonnegativeIntegerswithoutConsecutiveOnes {
}

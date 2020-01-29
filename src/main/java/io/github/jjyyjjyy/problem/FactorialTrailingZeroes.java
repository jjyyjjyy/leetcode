package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/factorial-trailing-zeroes/">阶乘后的零</a>
 *
 * <p>给定一个整数 <em>n</em>，返回 <em>n</em>! 结果尾数中零的数量。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> 3
 * <strong>输出:</strong> 0
 * <strong>解释:</strong>&nbsp;3! = 6, 尾数中没有零。</pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> 5
 * <strong>输出:</strong> 1
 * <strong>解释:</strong>&nbsp;5! = 120, 尾数中有 1 个零.</pre>
 *
 * <p><strong>说明: </strong>你算法的时间复杂度应为&nbsp;<em>O</em>(log&nbsp;<em>n</em>)<em>&nbsp;</em>。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>number-of-digit-one</li>
 *   <li>preimage-size-of-factorial-zeroes-function</li>
 * </ul>
 */
@Problem(
    id = 172,
    name = "factorial-trailing-zeroes",
    difficulty = Difficulty.EASY,
    tags = {Tag.MATH}
)
public class FactorialTrailingZeroes {
}

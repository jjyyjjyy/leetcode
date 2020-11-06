package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/valid-perfect-square/">有效的完全平方数</a>
 *
 * <p>给定一个正整数 <em>num</em>，编写一个函数，如果 <em>num</em> 是一个完全平方数，则返回 True，否则返回 False。</p>
 *
 * <p><strong>说明：</strong>不要使用任何内置的库函数，如&nbsp; <code>sqrt</code>。</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>16
 * <strong>输出：</strong>True</pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>14
 * <strong>输出：</strong>False
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>sqrtx</li>
 *   <li>sum-of-square-numbers</li>
 * </ul>
 */
@Problem(
    id = 367,
    name = "valid-perfect-square",
    difficulty = Difficulty.EASY,
    tags = {Tag.MATH, Tag.BINARY_SEARCH}
)
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        return false;
    }
}

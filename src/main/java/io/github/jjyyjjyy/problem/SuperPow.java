package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/super-pow/">超级次方</a>
 *
 * <p>你的任务是计算&nbsp;<em>a</em><sup><em>b</em></sup>&nbsp;对&nbsp;1337 取模，<em>a</em> 是一个正整数，<em>b</em> 是一个非常大的正整数且会以数组形式给出。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入: </strong>a = 2, b = [3]
 * <strong>输出: </strong>8
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入: </strong>a = 2, b = [1,0]
 * <strong>输出: </strong>1024</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>powx-n</li>
 * </ul>
 */
@Problem(
    id = 372,
    name = "super-pow",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.MATH}
)
public class SuperPow {
}

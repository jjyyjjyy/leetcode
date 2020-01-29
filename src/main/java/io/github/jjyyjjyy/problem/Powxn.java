package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/powx-n/">Pow(x, n)</a>
 *
 * <p>实现&nbsp;<a href="https://www.cplusplus.com/reference/valarray/pow/" target="_blank">pow(<em>x</em>, <em>n</em>)</a>&nbsp;，即计算 x 的 n 次幂函数。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> 2.00000, 10
 * <strong>输出:</strong> 1024.00000
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> 2.10000, 3
 * <strong>输出:</strong> 9.26100
 * </pre>
 *
 * <p><strong>示例&nbsp;3:</strong></p>
 *
 * <pre><strong>输入:</strong> 2.00000, -2
 * <strong>输出:</strong> 0.25000
 * <strong>解释:</strong> 2<sup>-2</sup> = 1/2<sup>2</sup> = 1/4 = 0.25</pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ul>
 * 	<li>-100.0 &lt;&nbsp;<em>x</em>&nbsp;&lt; 100.0</li>
 * 	<li><em>n</em>&nbsp;是 32 位有符号整数，其数值范围是&nbsp;[&minus;2<sup>31</sup>,&nbsp;2<sup>31&nbsp;</sup>&minus; 1] 。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>sqrtx</li>
 *   <li>super-pow</li>
 * </ul>
 */
@Problem(
    id = 50,
    name = "powx-n",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.MATH, Tag.BINARY_SEARCH}
)
public class Powxn {
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/climbing-stairs/">爬楼梯</a>
 *
 * <p>假设你正在爬楼梯。需要 <em>n</em>&nbsp;阶你才能到达楼顶。</p>
 *
 * <p>每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？</p>
 *
 * <p><strong>注意：</strong>给定 <em>n</em> 是一个正整数。</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong> 2
 * <strong>输出：</strong> 2
 * <strong>解释：</strong> 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶</pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong> 3
 * <strong>输出：</strong> 3
 * <strong>解释：</strong> 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>min-cost-climbing-stairs</li>
 *   <li>fibonacci-number</li>
 *   <li>n-th-tribonacci-number</li>
 * </ul>
 */
@Problem(
    id = 70,
    name = "climbing-stairs",
    difficulty = Difficulty.EASY,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class ClimbingStairs {
}

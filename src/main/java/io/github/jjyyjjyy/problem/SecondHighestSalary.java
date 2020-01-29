package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;

/**
 * <a href="https://leetcode-cn.com/problems/second-highest-salary/">第二高的薪水</a>
 *
 * <p>编写一个 SQL 查询，获取 <code>Employee</code>&nbsp;表中第二高的薪水（Salary）&nbsp;。</p>
 *
 * <pre>+----+--------+
 * | Id | Salary |
 * +----+--------+
 * | 1  | 100    |
 * | 2  | 200    |
 * | 3  | 300    |
 * +----+--------+
 * </pre>
 *
 * <p>例如上述&nbsp;<code>Employee</code>&nbsp;表，SQL查询应该返回&nbsp;<code>200</code> 作为第二高的薪水。如果不存在第二高的薪水，那么查询应返回 <code>null</code>。</p>
 *
 * <pre>+---------------------+
 * | SecondHighestSalary |
 * +---------------------+
 * | 200                 |
 * +---------------------+
 * </pre>
 */
@Problem(
    id = 176,
    name = "second-highest-salary",
    difficulty = Difficulty.EASY,
    tags = {}
)
public class SecondHighestSalary {
}

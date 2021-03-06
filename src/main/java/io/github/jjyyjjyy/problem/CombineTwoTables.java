package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;

/**
 * <a href="https://leetcode-cn.com/problems/combine-two-tables/">组合两个表</a>
 *
 * <p>表1: <code>Person</code></p>
 *
 * <pre>+-------------+---------+
 * | 列名         | 类型     |
 * +-------------+---------+
 * | PersonId    | int     |
 * | FirstName   | varchar |
 * | LastName    | varchar |
 * +-------------+---------+
 * PersonId 是上表主键
 * </pre>
 *
 * <p>表2: <code>Address</code></p>
 *
 * <pre>+-------------+---------+
 * | 列名         | 类型    |
 * +-------------+---------+
 * | AddressId   | int     |
 * | PersonId    | int     |
 * | City        | varchar |
 * | State       | varchar |
 * +-------------+---------+
 * AddressId 是上表主键
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p>编写一个 SQL 查询，满足条件：无论 person 是否有地址信息，都需要基于上述两表提供&nbsp;person 的以下信息：</p>
 *
 * <p>&nbsp;</p>
 *
 * <pre>FirstName, LastName, City, State
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>employee-bonus</li>
 * </ul>
 */
@Problem(
    id = 175,
    name = "combine-two-tables",
    difficulty = Difficulty.EASY,
    tags = {}
)
public class CombineTwoTables {
}

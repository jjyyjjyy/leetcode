package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;

/**
 * <a href="https://leetcode-cn.com/problems/customers-who-never-order/">从不订购的客户</a>
 *
 * <p>某网站包含两个表，<code>Customers</code> 表和 <code>Orders</code> 表。编写一个 SQL 查询，找出所有从不订购任何东西的客户。</p>
 *
 * <p><code>Customers</code> 表：</p>
 *
 * <pre>+----+-------+
 * | Id | Name  |
 * +----+-------+
 * | 1  | Joe   |
 * | 2  | Henry |
 * | 3  | Sam   |
 * | 4  | Max   |
 * +----+-------+
 * </pre>
 *
 * <p><code>Orders</code> 表：</p>
 *
 * <pre>+----+------------+
 * | Id | CustomerId |
 * +----+------------+
 * | 1  | 3          |
 * | 2  | 1          |
 * +----+------------+
 * </pre>
 *
 * <p>例如给定上述表格，你的查询应返回：</p>
 *
 * <pre>+-----------+
 * | Customers |
 * +-----------+
 * | Henry     |
 * | Max       |
 * +-----------+
 * </pre>
 */
@Problem(
    id = 183,
    name = "customers-who-never-order",
    difficulty = Difficulty.EASY,
    tags = {}
)
public class CustomersWhoNeverOrder {
}

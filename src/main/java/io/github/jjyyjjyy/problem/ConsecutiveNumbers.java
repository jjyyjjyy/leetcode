package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;

/**
 * <a href="https://leetcode-cn.com/problems/consecutive-numbers/">连续出现的数字</a>
 *
 * <p>编写一个 SQL 查询，查找所有至少连续出现三次的数字。</p>
 *
 * <pre>+----+-----+
 * | Id | Num |
 * +----+-----+
 * | 1  |  1  |
 * | 2  |  1  |
 * | 3  |  1  |
 * | 4  |  2  |
 * | 5  |  1  |
 * | 6  |  2  |
 * | 7  |  2  |
 * +----+-----+
 * </pre>
 *
 * <p>例如，给定上面的 <code>Logs</code> 表， <code>1</code> 是唯一连续出现至少三次的数字。</p>
 *
 * <pre>+-----------------+
 * | ConsecutiveNums |
 * +-----------------+
 * | 1               |
 * +-----------------+
 * </pre>
 */
@Problem(
    id = 180,
    name = "consecutive-numbers",
    difficulty = Difficulty.MEDIUM,
    tags = {}
)
public class ConsecutiveNumbers {
}

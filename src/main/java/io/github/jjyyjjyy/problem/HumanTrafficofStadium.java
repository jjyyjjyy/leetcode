package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;

/**
 * <a href="https://leetcode-cn.com/problems/human-traffic-of-stadium/">体育馆的人流量</a>
 *
 * <p>X 市建了一个新的体育馆，每日人流量信息被记录在这三列信息中：<strong>序号</strong> (id)、<strong>日期</strong> (visit_date)、&nbsp;<strong>人流量</strong> (people)。</p>
 *
 * <p>请编写一个查询语句，找出人流量的高峰期。高峰期时，至少连续三行记录中的人流量不少于100。</p>
 *
 * <p>例如，表 <code>stadium</code>：</p>
 *
 * <pre>+------+------------+-----------+
 * | id   | visit_date | people    |
 * +------+------------+-----------+
 * | 1    | 2017-01-01 | 10        |
 * | 2    | 2017-01-02 | 109       |
 * | 3    | 2017-01-03 | 150       |
 * | 4    | 2017-01-04 | 99        |
 * | 5    | 2017-01-05 | 145       |
 * | 6    | 2017-01-06 | 1455      |
 * | 7    | 2017-01-07 | 199       |
 * | 8    | 2017-01-08 | 188       |
 * +------+------------+-----------+
 * </pre>
 *
 * <p>对于上面的示例数据，输出为：</p>
 *
 * <pre>+------+------------+-----------+
 * | id   | visit_date | people    |
 * +------+------------+-----------+
 * | 5    | 2017-01-05 | 145       |
 * | 6    | 2017-01-06 | 1455      |
 * | 7    | 2017-01-07 | 199       |
 * | 8    | 2017-01-08 | 188       |
 * +------+------------+-----------+
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong><br>
 * 每天只有一行记录，日期随着 id 的增加而增加。</p>
 */
@Problem(
    id = 601,
    name = "human-traffic-of-stadium",
    difficulty = Difficulty.HARD,
    tags = {}
)
public class HumanTrafficofStadium {
}

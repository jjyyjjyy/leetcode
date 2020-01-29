package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;

/**
 * <a href="https://leetcode-cn.com/problems/classes-more-than-5-students/">超过5名学生的课</a>
 *
 * <p>有一个<code>courses</code> 表 ，有: <strong>student&nbsp;(学生) </strong>和 <strong>class (课程)</strong>。</p>
 *
 * <p>请列出所有超过或等于5名学生的课。</p>
 *
 * <p>例如,表:</p>
 *
 * <pre>
 * +---------+------------+
 * | student | class      |
 * +---------+------------+
 * | A       | Math       |
 * | B       | English    |
 * | C       | Math       |
 * | D       | Biology    |
 * | E       | Math       |
 * | F       | Computer   |
 * | G       | Math       |
 * | H       | Math       |
 * | I       | Math       |
 * +---------+------------+
 * </pre>
 *
 * <p>应该输出:</p>
 *
 * <pre>
 * +---------+
 * | class   |
 * +---------+
 * | Math    |
 * +---------+
 * </pre>
 *
 * <p><strong>Note:</strong><br />
 * 学生在每个课中不应被重复计算。</p>
 */
@Problem(
    id = 596,
    name = "classes-more-than-5-students",
    difficulty = Difficulty.EASY,
    tags = {}
)
public class ClassesMoreThan5Students {
}

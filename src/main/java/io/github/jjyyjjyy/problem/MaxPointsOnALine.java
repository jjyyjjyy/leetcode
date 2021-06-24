package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/max-points-on-a-line/">直线上最多的点数</a>
 *
 * <p>给定一个二维平面，平面上有&nbsp;<em>n&nbsp;</em>个点，求最多有多少个点在同一条直线上。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [[1,1],[2,2],[3,3]]
 * <strong>输出:</strong> 3
 * <strong>解释:</strong>
 * ^
 * |
 * | &nbsp; &nbsp; &nbsp; &nbsp;o
 * | &nbsp; &nbsp; o
 * | &nbsp;o &nbsp;
 * +-------------&gt;
 * 0 &nbsp;1 &nbsp;2 &nbsp;3  4
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
 * <strong>输出:</strong> 4
 * <strong>解释:</strong>
 * ^
 * |
 * |  o
 * | &nbsp;&nbsp;&nbsp;&nbsp;o&nbsp;&nbsp;      o
 * | &nbsp;&nbsp;&nbsp;&nbsp;   o
 * | &nbsp;o &nbsp;      o
 * +-------------------&gt;
 * 0 &nbsp;1 &nbsp;2 &nbsp;3 &nbsp;4 &nbsp;5 &nbsp;6</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>line-reflection</li>
 * </ul>
 */
@Problem(
    id = 149,
    name = "max-points-on-a-line",
    difficulty = Difficulty.HARD,
    tags = {Tag.HASH_TABLE, Tag.MATH}
)
public class MaxPointsOnALine {

    public int maxPoints(int[][] points) {
        return -1;
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/max-sum-of-rectangle-no-larger-than-k/">矩形区域不超过 K 的最大数值和</a>
 *
 * <p>给定一个非空二维矩阵&nbsp;<em>matrix&nbsp;</em>和一个整数<em> k</em>，找到这个矩阵内部不大于 <em>k</em> 的最大矩形和。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入: </strong>matrix = [[1,0,1],[0,-2,3]], k = 2
 * <strong>输出: </strong>2
 * <strong>解释:</strong>&nbsp;矩形区域&nbsp;<code>[[0, 1], [-2, 3]]</code>&nbsp;的数值和是 2，且 2 是不超过 k 的最大数字（k = 2）。
 * </pre>
 *
 * <p><strong>说明：</strong></p>
 *
 * <ol>
 * 	<li>矩阵内的矩形区域面积必须大于 0。</li>
 * 	<li>如果行数远大于列数，你将如何解答呢？</li>
 * </ol>
 */
@Problem(
    id = 363,
    name = "max-sum-of-rectangle-no-larger-than-k",
    difficulty = Difficulty.HARD,
    tags = {Tag.QUEUE, Tag.BINARY_SEARCH, Tag.DYNAMIC_PROGRAMMING}
)
public class MaxSumofRectangleNoLargerThanK {
}

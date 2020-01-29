package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/search-a-2d-matrix/">搜索二维矩阵</a>
 *
 * <p>编写一个高效的算法来判断&nbsp;<em>m</em> x <em>n</em>&nbsp;矩阵中，是否存在一个目标值。该矩阵具有如下特性：</p>
 *
 * <ul>
 * 	<li>每行中的整数从左到右按升序排列。</li>
 * 	<li>每行的第一个整数大于前一行的最后一个整数。</li>
 * </ul>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 3
 * <strong>输出:</strong> true
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 13
 * <strong>输出:</strong> false</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>search-a-2d-matrix-ii</li>
 * </ul>
 */
@Problem(
    id = 74,
    name = "search-a-2d-matrix",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.BINARY_SEARCH}
)
public class Searcha2DMatrix {
}

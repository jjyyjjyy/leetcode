package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/search-a-2d-matrix-ii/">搜索二维矩阵 II</a>
 *
 * <p>编写一个高效的算法来搜索&nbsp;<em>m</em>&nbsp;x&nbsp;<em>n</em>&nbsp;矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：</p>
 *
 * <ul>
 * 	<li>每行的元素从左到右升序排列。</li>
 * 	<li>每列的元素从上到下升序排列。</li>
 * </ul>
 *
 * <p><strong>示例:</strong></p>
 *
 * <p>现有矩阵 matrix 如下：</p>
 *
 * <pre>[
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * </pre>
 *
 * <p>给定 target&nbsp;=&nbsp;<code>5</code>，返回&nbsp;<code>true</code>。</p>
 *
 * <p>给定&nbsp;target&nbsp;=&nbsp;<code>20</code>，返回&nbsp;<code>false</code>。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>search-a-2d-matrix</li>
 * </ul>
 */
@Problem(
    id = 240,
    name = "search-a-2d-matrix-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BINARY_SEARCH, Tag.DIVIDE_AND_CONQUER}
)
public class Searcha2DMatrixII {
}

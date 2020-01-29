package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/number-of-islands/">岛屿数量</a>
 *
 * <p>给定一个由&nbsp;<code>&#39;1&#39;</code>（陆地）和 <code>&#39;0&#39;</code>（水）组成的的二维网格，计算岛屿的数量。一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * 11110
 * 11010
 * 11000
 * 00000
 *
 * <strong>输出:</strong>&nbsp;1
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * 11000
 * 11000
 * 00100
 * 00011
 *
 * <strong>输出: </strong>3
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>surrounded-regions</li>
 *   <li>walls-and-gates</li>
 *   <li>number-of-islands-ii</li>
 *   <li>number-of-connected-components-in-an-undirected-graph</li>
 *   <li>number-of-distinct-islands</li>
 *   <li>max-area-of-island</li>
 * </ul>
 */
@Problem(
    id = 200,
    name = "number-of-islands",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DEPTH_FIRST_SEARCH, Tag.BREADTH_FIRST_SEARCH, Tag.UNION_FIND}
)
public class NumberofIslands {
}

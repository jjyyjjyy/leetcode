package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/maximal-rectangle/">最大矩形</a>
 *
 * <p>给定一个仅包含&nbsp;0 和 1 的二维二进制矩阵，找出只包含 1 的最大矩形，并返回其面积。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * [
 *   [&quot;1&quot;,&quot;0&quot;,&quot;1&quot;,&quot;0&quot;,&quot;0&quot;],
 *   [&quot;1&quot;,&quot;0&quot;,&quot;<strong>1</strong>&quot;,&quot;<strong>1</strong>&quot;,&quot;<strong>1</strong>&quot;],
 *   [&quot;1&quot;,&quot;1&quot;,&quot;<strong>1</strong>&quot;,&quot;<strong>1</strong>&quot;,&quot;<strong>1</strong>&quot;],
 *   [&quot;1&quot;,&quot;0&quot;,&quot;0&quot;,&quot;1&quot;,&quot;0&quot;]
 * ]
 * <strong>输出:</strong> 6</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>largest-rectangle-in-histogram</li>
 *   <li>maximal-square</li>
 * </ul>
 */
@Problem(
    id = 85,
    name = "maximal-rectangle",
    difficulty = Difficulty.HARD,
    tags = {Tag.STACK, Tag.ARRAY, Tag.HASH_TABLE, Tag.DYNAMIC_PROGRAMMING}
)
public class MaximalRectangle {
}

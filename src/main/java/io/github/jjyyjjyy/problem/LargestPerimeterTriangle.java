package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/largest-perimeter-triangle/">三角形的最大周长</a>
 *
 * <p>给定由一些正数（代表长度）组成的数组 <code>A</code>，返回由其中三个长度组成的、<strong>面积不为零</strong>的三角形的最大周长。</p>
 *
 * <p>如果不能形成任何面积不为零的三角形，返回&nbsp;<code>0</code>。</p>
 *
 * <p>&nbsp;</p>
 *
 * <ol>
 * </ol>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>[2,1,2]
 * <strong>输出：</strong>5
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>[1,2,1]
 * <strong>输出：</strong>0
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>[3,2,3,4]
 * <strong>输出：</strong>10
 * </pre>
 *
 * <p><strong>示例 4：</strong></p>
 *
 * <pre><strong>输入：</strong>[3,6,2,3]
 * <strong>输出：</strong>8
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>3 &lt;= A.length &lt;= 10000</code></li>
 * 	<li><code>1 &lt;= A[i] &lt;= 10^6</code></li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>largest-triangle-area</li>
 * </ul>
 */
@Problem(
    id = 1018,
    name = "largest-perimeter-triangle",
    difficulty = Difficulty.EASY,
    tags = {Tag.SORT, Tag.MATH}
)
public class LargestPerimeterTriangle {
}

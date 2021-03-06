package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/largest-rectangle-in-histogram/">柱状图中最大的矩形</a>
 *
 * <p>给定 <em>n</em> 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。</p>
 *
 * <p>求在该柱状图中，能够勾勒出来的矩形的最大面积。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/histogram.png"></p>
 *
 * <p><small>以上是柱状图的示例，其中每个柱子的宽度为 1，给定的高度为&nbsp;<code>[2,1,5,6,2,3]</code>。</small></p>
 *
 * <p>&nbsp;</p>
 *
 * <p><img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/histogram_area.png"></p>
 *
 * <p><small>图中阴影部分为所能勾勒出的最大矩形面积，其面积为&nbsp;<code>10</code>&nbsp;个单位。</small></p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> [2,1,5,6,2,3]
 * <strong>输出:</strong> 10</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>maximal-rectangle</li>
 * </ul>
 */
@Problem(
    id = 84,
    name = "largest-rectangle-in-histogram",
    difficulty = Difficulty.HARD,
    tags = {Tag.STACK, Tag.ARRAY}
)
public class LargestRectangleinHistogram {
}

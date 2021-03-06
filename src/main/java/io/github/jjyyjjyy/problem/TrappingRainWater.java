package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/trapping-rain-water/">接雨水</a>
 *
 * <p>给定&nbsp;<em>n</em> 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。</p>
 *
 * <p><img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/22/rainwatertrap.png" style="height: 161px; width: 412px;"></p>
 *
 * <p><small>上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。&nbsp;<strong>感谢 Marcos</strong> 贡献此图。</small></p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> [0,1,0,2,1,0,1,3,2,1,2,1]
 * <strong>输出:</strong> 6</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>container-with-most-water</li>
 *   <li>product-of-array-except-self</li>
 *   <li>trapping-rain-water-ii</li>
 *   <li>pour-water</li>
 * </ul>
 */
@Problem(
    id = 42,
    name = "trapping-rain-water",
    difficulty = Difficulty.HARD,
    tags = {Tag.STACK, Tag.ARRAY, Tag.TWO_POINTERS}
)
public class TrappingRainWater {
}

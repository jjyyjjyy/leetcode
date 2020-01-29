package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;

/**
 * <a href="https://leetcode-cn.com/problems/construct-the-rectangle/">构造矩形</a>
 *
 * <p>作为一位web开发者， 懂得怎样去规划一个页面的尺寸是很重要的。 现给定一个具体的矩形页面面积，你的任务是设计一个长度为 L 和宽度为 W 且满足以下要求的矩形的页面。要求：</p>
 *
 * <pre>
 * 1. 你设计的矩形页面必须等于给定的目标面积。
 *
 * 2. 宽度 W 不应大于长度 L，换言之，要求 L &gt;= W 。
 *
 * 3. 长度 L 和宽度 W 之间的差距应当尽可能小。
 * </pre>
 *
 * <p>你需要按顺序输出你设计的页面的长度 L 和宽度 W。</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> 4
 * <strong>输出:</strong> [2, 2]
 * <strong>解释:</strong> 目标面积是 4， 所有可能的构造方案有 [1,4], [2,2], [4,1]。
 * 但是根据要求2，[1,4] 不符合要求; 根据要求3，[2,2] 比 [4,1] 更能符合要求. 所以输出长度 L 为 2， 宽度 W 为 2。
 * </pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ol>
 * 	<li>给定的面积不大于 10,000,000 且为正整数。</li>
 * 	<li>你设计的页面的长度和宽度必须都是正整数。</li>
 * </ol>
 */
@Problem(
    id = 492,
    name = "construct-the-rectangle",
    difficulty = Difficulty.EASY,
    tags = {}
)
public class ConstructtheRectangle {
}

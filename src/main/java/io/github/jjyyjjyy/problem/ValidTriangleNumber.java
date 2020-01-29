package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/valid-triangle-number/">有效三角形的个数</a>
 *
 * <p>给定一个包含非负整数的数组，你的任务是统计其中可以组成三角形三条边的三元组个数。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [2,2,3,4]
 * <strong>输出:</strong> 3
 * <strong>解释:</strong>
 * 有效的组合是:
 * 2,3,4 (使用第一个 2)
 * 2,3,4 (使用第二个 2)
 * 2,2,3
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li>数组长度不超过1000。</li>
 * 	<li>数组里整数的范围为 [0, 1000]。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>3sum-smaller</li>
 * </ul>
 */
@Problem(
    id = 611,
    name = "valid-triangle-number",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY}
)
public class ValidTriangleNumber {
}

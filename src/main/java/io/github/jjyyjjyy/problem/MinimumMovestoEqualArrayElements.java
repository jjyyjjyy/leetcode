package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements/">最小移动次数使数组元素相等</a>
 *
 * <p>给定一个长度为 <em>n</em> 的<strong>非空</strong>整数数组，找到让数组所有元素相等的最小移动次数。每次移动可以使 <em>n</em> - 1 个元素增加 1。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 * [1,2,3]
 *
 * <strong>输出:</strong>
 * 3
 *
 * <strong>解释:</strong>
 * 只需要3次移动（注意每次移动会增加两个元素的值）：
 *
 * [1,2,3]  =&gt;  [2,3,3]  =&gt;  [3,4,3]  =&gt;  [4,4,4]
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>minimum-moves-to-equal-array-elements-ii</li>
 * </ul>
 */
@Problem(
    id = 453,
    name = "minimum-moves-to-equal-array-elements",
    difficulty = Difficulty.EASY,
    tags = {Tag.MATH}
)
public class MinimumMovestoEqualArrayElements {
}

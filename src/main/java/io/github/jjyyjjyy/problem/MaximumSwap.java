package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/maximum-swap/">最大交换</a>
 *
 * <p>给定一个非负整数，你<strong>至多</strong>可以交换一次数字中的任意两位。返回你能得到的最大值。</p>
 *
 * <p><strong>示例 1 :</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> 2736
 * <strong>输出:</strong> 7236
 * <strong>解释:</strong> 交换数字2和数字7。
 * </pre>
 *
 * <p><strong>示例 2 :</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> 9973
 * <strong>输出:</strong> 9973
 * <strong>解释:</strong> 不需要交换。
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li>给定数字的范围是&nbsp;[0, 10<sup>8</sup>]</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>create-maximum-number</li>
 * </ul>
 */
@Problem(
    id = 670,
    name = "maximum-swap",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.MATH}
)
public class MaximumSwap {
}

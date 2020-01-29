package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/maximum-product-of-three-numbers/">三个数的最大乘积</a>
 *
 * <p>给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [1,2,3]
 * <strong>输出:</strong> 6
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [1,2,3,4]
 * <strong>输出:</strong> 24
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li>给定的整型数组长度范围是[3,10<sup>4</sup>]，数组中所有的元素范围是[-1000, 1000]。</li>
 * 	<li>输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>maximum-product-subarray</li>
 * </ul>
 */
@Problem(
    id = 628,
    name = "maximum-product-of-three-numbers",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY, Tag.MATH}
)
public class MaximumProductofThreeNumbers {
}

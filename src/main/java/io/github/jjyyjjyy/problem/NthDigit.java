package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/nth-digit/">第N个数字</a>
 *
 * <p>在无限的整数序列&nbsp;1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第&nbsp;<em>n&nbsp;</em>个数字。</p>
 *
 * <p><strong>注意:</strong><br />
 * <em>n&nbsp;</em>是正数且在32为整形范围内&nbsp;(&nbsp;<em>n</em> &lt; 2<sup>31</sup>)。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 * 3
 *
 * <strong>输出:</strong>
 * 3
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 * 11
 *
 * <strong>输出:</strong>
 * 0
 *
 * <strong>说明:</strong>
 * 第11个数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是<strong>0</strong>，它是10的一部分。
 * </pre>
 */
@Problem(
    id = 400,
    name = "nth-digit",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.MATH}
)
public class NthDigit {
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/binary-number-with-alternating-bits/">交替位二进制数</a>
 *
 * <p>给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> 5
 * <strong>输出:</strong> True
 * <strong>解释:</strong>
 * 5的二进制数是: 101
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> 7
 * <strong>输出:</strong> False
 * <strong>解释:</strong>
 * 7的二进制数是: 111
 * </pre>
 *
 * <p><strong>示例&nbsp;3:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> 11
 * <strong>输出:</strong> False
 * <strong>解释:</strong>
 * 11的二进制数是: 1011
 * </pre>
 *
 * <p><strong>&nbsp;示例 4:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> 10
 * <strong>输出:</strong> True
 * <strong>解释:</strong>
 * 10的二进制数是: 1010
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>number-of-1-bits</li>
 * </ul>
 */
@Problem(
    id = 693,
    name = "binary-number-with-alternating-bits",
    difficulty = Difficulty.EASY,
    tags = {Tag.BIT_MANIPULATION}
)
public class BinaryNumberwithAlternatingBits {
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/number-complement/">数字的补数</a>
 *
 * <p>给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。</p>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li>给定的整数保证在32位带符号整数的范围内。</li>
 * 	<li>你可以假定二进制数不包含前导零位。</li>
 * </ol>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> 5
 * <strong>输出:</strong> 2
 * <strong>解释:</strong> 5的二进制表示为101（没有前导零位），其补数为010。所以你需要输出2。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> 1
 * <strong>输出:</strong> 0
 * <strong>解释:</strong> 1的二进制表示为1（没有前导零位），其补数为0。所以你需要输出0。
 * </pre>
 */
@Problem(
    id = 476,
    name = "number-complement",
    difficulty = Difficulty.EASY,
    tags = {Tag.BIT_MANIPULATION}
)
public class NumberComplement {
}

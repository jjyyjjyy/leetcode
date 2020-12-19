package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/number-of-1-bits/">位1的个数</a>
 *
 * <p>编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 &lsquo;1&rsquo;&nbsp;的个数（也被称为<a href="https://baike.baidu.com/item/%E6%B1%89%E6%98%8E%E9%87%8D%E9%87%8F" target="_blank">汉明重量</a>）。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>00000000000000000000000000001011
 * <strong>输出：</strong>3
 * <strong>解释：</strong>输入的二进制串 <code><strong>00000000000000000000000000001011</strong>&nbsp;中，共有三位为 &#39;1&#39;。</code>
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>00000000000000000000000010000000
 * <strong>输出：</strong>1
 * <strong>解释：</strong>输入的二进制串 <strong>00000000000000000000000010000000</strong>&nbsp;中，共有一位为 &#39;1&#39;。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>11111111111111111111111111111101
 * <strong>输出：</strong>31
 * <strong>解释：</strong>输入的二进制串 <strong>11111111111111111111111111111101</strong> 中，共有 31 位为 &#39;1&#39;。</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li>请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。</li>
 * 	<li>在 Java 中，编译器使用<a href="https://baike.baidu.com/item/二进制补码/5295284" target="_blank">二进制补码</a>记法来表示有符号整数。因此，在上面的&nbsp;<strong>示例 3</strong>&nbsp;中，输入表示有符号整数 <code>-3</code>。</li>
 * </ul>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>进阶</strong>:<br>
 * 如果多次调用这个函数，你将如何优化你的算法？</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>reverse-bits</li>
 *   <li>power-of-two</li>
 *   <li>counting-bits</li>
 *   <li>binary-watch</li>
 *   <li>hamming-distance</li>
 *   <li>binary-number-with-alternating-bits</li>
 *   <li>prime-number-of-set-bits-in-binary-representation</li>
 * </ul>
 */
@Problem(
    id = 191,
    name = "number-of-1-bits",
    difficulty = Difficulty.EASY,
    tags = {Tag.BIT_MANIPULATION}
)
public class NumberOf1Bits {

    /**
     * 循环12次, 校验每一位是否为1, 统计个数.
     */
    @Complexity(Complexity.ComplexityType.O_1)
    public int hammingWeight(int n) {
        int result = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                result++;
            }
            mask <<= 1;
        }
        return result;
    }
}

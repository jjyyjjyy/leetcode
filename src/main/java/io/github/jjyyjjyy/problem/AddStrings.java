package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/add-strings/">字符串相加</a>
 *
 * <p>给定两个字符串形式的非负整数&nbsp;<code>num1</code> 和<code>num2</code>&nbsp;，计算它们的和。</p>
 *
 * <p><strong>注意：</strong></p>
 *
 * <ol>
 * 	<li><code>num1</code> 和<code>num2</code>&nbsp;的长度都小于 5100.</li>
 * 	<li><code>num1</code> 和<code>num2</code> 都只包含数字&nbsp;<code>0-9</code>.</li>
 * 	<li><code>num1</code> 和<code>num2</code> 都不包含任何前导零。</li>
 * 	<li><strong>你不能使用任何內建 BigInteger 库，&nbsp;也不能直接将输入的字符串转换为整数形式。</strong></li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>add-two-numbers</li>
 *   <li>multiply-strings</li>
 *   <li>add-to-array-form-of-integer</li>
 * </ul>
 */
@Problem(
    id = 415,
    name = "add-strings",
    difficulty = Difficulty.EASY,
    tags = {Tag.STRING}
)
public class AddStrings {

    /**
     * 同时遍历两个字符串, 将字符两两从后向前相加.
     */
    @Complexity(Complexity.ComplexityType.O_M_AND_N)
    public String addStrings(String num1, String num2) {
        char[] num1Chars = num1.toCharArray();
        char[] num2Chars = num2.toCharArray();

        int num1Position = num1Chars.length - 1;
        int num2Position = num2Chars.length - 1;

        StringBuilder result = new StringBuilder();

        int tmp = 0;

        while (num1Position >= 0 || num2Position >= 0) {
            int add = 0;
            if (num1Position < 0) {
                add += num2Chars[num2Position] - '0' + tmp;
            } else if (num2Position < 0) {
                add += num1Chars[num1Position] - '0' + tmp;
            } else {
                add += (num1Chars[num1Position] - '0') + (num2Chars[num2Position] - '0') + tmp;
            }

            result.append(add % 10);
            tmp = add / 10;
            num1Position--;
            num2Position--;
        }

        if (tmp > 0) {
            result.append(tmp);
        }

        return result.reverse().toString();
    }
}

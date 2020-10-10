package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/add-binary/">二进制求和</a>
 *
 * <p>给定两个二进制字符串，返回他们的和（用二进制表示）。</p>
 *
 * <p>输入为<strong>非空</strong>字符串且只包含数字&nbsp;<code>1</code>&nbsp;和&nbsp;<code>0</code>。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> a = &quot;11&quot;, b = &quot;1&quot;
 * <strong>输出:</strong> &quot;100&quot;</pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> a = &quot;1010&quot;, b = &quot;1011&quot;
 * <strong>输出:</strong> &quot;10101&quot;</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>add-two-numbers</li>
 *   <li>multiply-strings</li>
 *   <li>plus-one</li>
 *   <li>add-to-array-form-of-integer</li>
 * </ul>
 */
@Problem(
    id = 67,
    name = "add-binary",
    difficulty = Difficulty.EASY,
    tags = {Tag.MATH, Tag.STRING}
)
public class AddBinary {

    /**
     * 将两个数字从后向前遍历, 依次相加.
     * 如果加得的结果大于1, 则前一位相加的时候要加上1, 以此类推.
     */
    @Complexity(Complexity.ComplexityType.O_M_AND_N)
    public String addBinary(String a, String b) {
        char[] adderA = a.toCharArray();
        char[] adderB = b.toCharArray();

        StringBuilder result = new StringBuilder();

        int lengthA = adderA.length;
        int lengthB = adderB.length;
        int last = 0;
        int positionA = lengthA - 1;
        int positionB = lengthB - 1;

        while (positionA >= 0 || positionB >= 0) {
            int valueA = positionA < 0 ? 0 : (adderA[positionA] - '0');
            int valueB = positionB < 0 ? 0 : (adderB[positionB] - '0');

            int add = valueA + valueB + last;
            if (add > 1) {
                add -= 2;
                last = 1;
            } else {
                last = 0;
            }
            result.append(add);
            positionA--;
            positionB--;
        }
        if (last == 1) {
            result.append(1);
        }
        return result.reverse().toString();
    }
}

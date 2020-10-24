package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/multiply-strings/">字符串相乘</a>
 *
 * <p>给定两个以字符串形式表示的非负整数&nbsp;<code>num1</code>&nbsp;和&nbsp;<code>num2</code>，返回&nbsp;<code>num1</code>&nbsp;和&nbsp;<code>num2</code>&nbsp;的乘积，它们的乘积也表示为字符串形式。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> num1 = &quot;2&quot;, num2 = &quot;3&quot;
 * <strong>输出:</strong> &quot;6&quot;</pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> num1 = &quot;123&quot;, num2 = &quot;456&quot;
 * <strong>输出:</strong> &quot;56088&quot;</pre>
 *
 * <p><strong>说明：</strong></p>
 *
 * <ol>
 * 	<li><code>num1</code>&nbsp;和&nbsp;<code>num2</code>&nbsp;的长度小于110。</li>
 * 	<li><code>num1</code> 和&nbsp;<code>num2</code> 只包含数字&nbsp;<code>0-9</code>。</li>
 * 	<li><code>num1</code> 和&nbsp;<code>num2</code>&nbsp;均不以零开头，除非是数字 0 本身。</li>
 * 	<li><strong>不能使用任何标准库的大数类型（比如 BigInteger）</strong>或<strong>直接将输入转换为整数来处理</strong>。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>add-two-numbers</li>
 *   <li>plus-one</li>
 *   <li>add-binary</li>
 *   <li>add-strings</li>
 * </ul>
 */
@Problem(
    id = 43,
    name = "multiply-strings",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.MATH, Tag.STRING}
)
public class MultiplyStrings {

    /**
     * 将第二个字符串从后向前遍历, 与第一个字符串相乘, 将每次的结果相加, 得到最终相乘后的结果.
     */
    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(m*n+n^2)")
    public String multiply(String num1, String num2) {

        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();

        String result = "0";

        for (int i = n - 1; i >= 0; i--) {
            StringBuilder current = new StringBuilder();
            current.append("0".repeat(Math.max(0, n - 1 - i)));
            int y = num2.charAt(i) - '0';
            int add = 0;
            for (int j = m - 1; j >= 0; j--) {
                int x = num1.charAt(j) - '0';
                int multipliedResult = x * y + add;
                current.append(multipliedResult % 10);
                add = multipliedResult / 10;
            }
            if (add > 0) {
                current.append(add % 10);
            }
            result = addString(result, current.reverse().toString());
        }

        return result;
    }

    private String addString(String a, String b) {

        int aPosition = a.length() - 1;
        int bPosition = b.length() - 1;

        StringBuilder result = new StringBuilder();
        int add = 0;
        while (aPosition >= 0 || bPosition >= 0) {
            int current;
            if (aPosition < 0) {
                current = b.charAt(bPosition) - '0' + add;
            } else if (bPosition < 0) {
                current = a.charAt(aPosition) - '0' + add;
            } else {
                current = a.charAt(aPosition) - '0' + add + b.charAt(bPosition) - '0';
            }
            result.append(current % 10);
            add = current / 10;
            aPosition--;
            bPosition--;
        }
        if (add > 0) {
            result.append(add);
        }
        return result.reverse().toString();
    }

}

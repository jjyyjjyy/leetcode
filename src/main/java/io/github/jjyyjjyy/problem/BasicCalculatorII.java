package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Stack;

/**
 * <a href="https://leetcode-cn.com/problems/basic-calculator-ii/">基本计算器 II</a>
 *
 * <p>实现一个基本的计算器来计算一个简单的字符串表达式的值。</p>
 *
 * <p>字符串表达式仅包含非负整数，<code>+</code>， <code>-</code> ，<code>*</code>，<code>/</code> 四种运算符和空格&nbsp;<code>&nbsp;</code>。 整数除法仅保留整数部分。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入: </strong>&quot;3+2*2&quot;
 * <strong>输出:</strong> 7
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot; 3/2 &quot;
 * <strong>输出:</strong> 1</pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot; 3+5 / 2 &quot;
 * <strong>输出:</strong> 5
 * </pre>
 *
 * <p><strong>说明：</strong></p>
 *
 * <ul>
 * 	<li>你可以假设所给定的表达式都是有效的。</li>
 * 	<li>请<strong>不要</strong>使用内置的库函数 <code>eval</code>。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>basic-calculator</li>
 *   <li>expression-add-operators</li>
 *   <li>basic-calculator-iii</li>
 * </ul>
 */
@Problem(
    id = 227,
    name = "basic-calculator-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STRING}
)
public class BasicCalculatorII {

    /**
     * 1. 维护一个操作数栈.
     * 2. 记录前一个操作符, 方便计算乘法和除法.
     * 3. 记录当前操作数, 用来计算大于9的操作数.
     * 4. 遍历字符串:
     * 4.1. 如果当前是数字, 则更新当前的操作数.
     * 4.2. 如果当前是符号, 或者是最后一位, 则用上一个操作符计算当前操作数的结果, 压入栈中.
     * 5. 遍历栈, 将栈中所有的数字相加得到计算结果.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int calculate(String s) {
        int n = s.length();
        Stack<Integer> operands = new Stack<>();
        char preSign = '+';
        int preNum = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                preNum = preNum * 10 + (ch - '0');
            }
            if (!Character.isDigit(ch) && ch != ' ' || i == n - 1) {
                switch (preSign) {
                    case '+':
                        operands.push(preNum);
                        break;
                    case '-':
                        operands.push(-preNum);
                        break;
                    case '*':
                        operands.push(operands.pop() * preNum);
                        break;
                    case '/':
                        operands.push(operands.pop() / preNum);
                        break;
                    default:
                }
                preSign = ch;
                preNum = 0;
            }
        }
        int result = 0;
        while (!operands.isEmpty()) {
            result += operands.pop();
        }
        return result;
    }
}

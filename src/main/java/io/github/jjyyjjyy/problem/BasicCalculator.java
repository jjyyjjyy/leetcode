package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Stack;

/**
 * <a href="https://leetcode-cn.com/problems/basic-calculator/">基本计算器</a>
 *
 * <p>实现一个基本的计算器来计算一个简单的字符串表达式的值。</p>
 *
 * <p>字符串表达式可以包含左括号&nbsp;<code>(</code>&nbsp;，右括号&nbsp;<code>)</code>，加号&nbsp;<code>+</code>&nbsp;，减号&nbsp;<code>-</code>，<strong>非负</strong>整数和空格&nbsp;<code>&nbsp;</code>。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;1 + 1&quot;
 * <strong>输出:</strong> 2
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot; 2-1 + 2 &quot;
 * <strong>输出:</strong> 3</pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;(1+(4+5+2)-3)+(6+8)&quot;
 * <strong>输出:</strong> 23</pre>
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
 *   <li>evaluate-reverse-polish-notation</li>
 *   <li>basic-calculator-ii</li>
 *   <li>different-ways-to-add-parentheses</li>
 *   <li>expression-add-operators</li>
 *   <li>basic-calculator-iii</li>
 * </ul>
 */
@Problem(
    id = 224,
    name = "basic-calculator",
    difficulty = Difficulty.HARD,
    tags = {Tag.STACK, Tag.MATH}
)
public class BasicCalculator {

    private static void cal(Stack<Integer> operands, Stack<Character> operators) {
        if (operators.isEmpty()) {
            return;
        }
        int b = operands.pop(), a = operands.pop();
        operands.push(operators.pop() == '+' ? a + b : a - b);
    }

    /**
     * 1. 维护一个操作数栈和操作符栈.
     * 2. 遍历字符串:
     * 2.1. 如果当前字符是空格, 则跳过.
     * 2.2. 如果当前字符是数字, 则判断上一个字符是否是数字, 如果上一个字符是数字则将操作数栈栈顶弹出*10加上当前元素, 压入操作数栈中.
     * 2.3. 如果当前字符是左括号, 直接压入操作符栈中.
     * 2.4. 如果当前字符是右括号或者加减号, 则一直计算到左括号.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int calculate(String s) {
        int n = s.length();
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        if (s.charAt(0) == '-') {
            operands.push(0);
        }
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            }
            if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (!operators.isEmpty()) {
                    if (operators.peek() != '(') {
                        cal(operands, operators);
                    } else {
                        operators.pop();
                        break;
                    }
                }
            } else if (Character.isDigit(c)) {
                int d = c - '0';
                if (i > 0 && Character.isDigit(s.charAt(i - 1))) {
                    d = operands.pop() * 10 + d;
                }
                operands.add(d);
            } else {
                // 一直算到左括号之前
                while (!operators.isEmpty() && operators.peek() != '(') {
                    cal(operands, operators);
                }
                operators.push(c);
            }
        }
        while (!operators.isEmpty()) {
            cal(operands, operators);
        }
        return operands.pop();
    }
}

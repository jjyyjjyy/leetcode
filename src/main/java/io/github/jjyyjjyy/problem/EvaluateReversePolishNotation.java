package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Stack;

/**
 * <a href="https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/">逆波兰表达式求值</a>
 *
 * <p>根据<a href="https://baike.baidu.com/item/%E9%80%86%E6%B3%A2%E5%85%B0%E5%BC%8F/128437" target="_blank">逆波兰表示法</a>，求表达式的值。</p>
 *
 * <p>有效的运算符包括&nbsp;<code>+</code>,&nbsp;<code>-</code>,&nbsp;<code>*</code>,&nbsp;<code>/</code>&nbsp;。每个运算对象可以是整数，也可以是另一个逆波兰表达式。</p>
 *
 * <p><strong>说明：</strong></p>
 *
 * <ul>
 * 	<li>整数除法只保留整数部分。</li>
 * 	<li>给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。</li>
 * </ul>
 *
 * <p><strong>示例&nbsp;1：</strong></p>
 *
 * <pre><strong>输入:</strong> [&quot;2&quot;, &quot;1&quot;, &quot;+&quot;, &quot;3&quot;, &quot;*&quot;]
 * <strong>输出:</strong> 9
 * <strong>解释:</strong> ((2 + 1) * 3) = 9
 * </pre>
 *
 * <p><strong>示例&nbsp;2：</strong></p>
 *
 * <pre><strong>输入:</strong> [&quot;4&quot;, &quot;13&quot;, &quot;5&quot;, &quot;/&quot;, &quot;+&quot;]
 * <strong>输出:</strong> 6
 * <strong>解释:</strong> (4 + (13 / 5)) = 6
 * </pre>
 *
 * <p><strong>示例&nbsp;3：</strong></p>
 *
 * <pre><strong>输入:</strong> [&quot;10&quot;, &quot;6&quot;, &quot;9&quot;, &quot;3&quot;, &quot;+&quot;, &quot;-11&quot;, &quot;*&quot;, &quot;/&quot;, &quot;*&quot;, &quot;17&quot;, &quot;+&quot;, &quot;5&quot;, &quot;+&quot;]
 * <strong>输出:</strong> 22
 * <strong>解释:</strong>
 *   ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>basic-calculator</li>
 *   <li>expression-add-operators</li>
 * </ul>
 */
@Problem(
    id = 150,
    name = "evaluate-reverse-polish-notation",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STACK}
)
public class EvaluateReversePolishNotation {

    /**
     * 1. 维护一个操作数栈.
     * 2. 依次遍历数组.
     * 2.1. 如果当前元素是操作符, 则弹出操作数栈上的两个元素, 执行操作符运算再压入栈中.
     * 2.2. 否则当前元素为操作数, 直接压入栈中.
     * 3. 操作数栈此时栈顶为运算的结果.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int evalRPN(String[] tokens) {
        Stack<Integer> operandStack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    operandStack.push(operandStack.pop() + operandStack.pop());
                    break;
                case "-":
                    Integer second = operandStack.pop();
                    Integer first = operandStack.pop();
                    operandStack.push(first - second);
                    break;
                case "*":
                    operandStack.push(operandStack.pop() * operandStack.pop());
                    break;
                case "/":
                    Integer s = operandStack.pop();
                    Integer f = operandStack.pop();
                    operandStack.push(f / s);
                    break;
                default:
                    operandStack.push(Integer.valueOf(token));
            }
        }
        return operandStack.pop();
    }
}

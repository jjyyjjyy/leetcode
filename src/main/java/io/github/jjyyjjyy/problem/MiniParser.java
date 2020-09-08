package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

import java.util.Stack;

/**
 * <a href="https://leetcode-cn.com/problems/mini-parser/">迷你语法分析器</a>
 *
 * <p>给定一个用字符串表示的整数的嵌套列表，实现一个解析它的语法分析器。</p>
 *
 * <p>列表中的每个元素只可能是整数或整数嵌套列表</p>
 *
 * <p><strong>提示：</strong>你可以假定这些字符串都是格式良好的：</p>
 *
 * <ul>
 * 	<li>字符串非空</li>
 * 	<li>字符串不包含空格</li>
 * 	<li>字符串只包含数字<code>0-9</code>, <code>[</code>, <code>-</code> <code>,</code>, <code>]</code></li>
 * </ul>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * 给定 s = &quot;324&quot;,
 *
 * 你应该返回一个 NestedInteger 对象，其中只包含整数值 324。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * 给定 s = &quot;[123,[456,[789]]]&quot;,
 *
 * 返回一个 NestedInteger 对象包含一个有两个元素的嵌套列表：
 *
 * 1. 一个 integer 包含值 123
 * 2. 一个包含两个元素的嵌套列表：
 *     i.  一个 integer 包含值 456
 *     ii. 一个包含一个元素的嵌套列表
 *          a. 一个 integer 包含值 789
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>flatten-nested-list-iterator</li>
 *   <li>ternary-expression-parser</li>
 *   <li>remove-comments</li>
 * </ul>
 */
@Problem(
    id = 385,
    name = "mini-parser",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STACK, Tag.STRING}
)
public class MiniParser {

    /**
     * 1. 创建一个栈, 维护NestInteger对象.
     * 2. 创建一个StringBuilder对象.
     * 3. 依次遍历字符串:
     * 3.1. 如果为[, 则代表下一个是嵌套列表的NestInteger对象, 创建一个NestInteger空对象压入栈中.
     * 3.2. 如果为负号或数字:
     * 3.2.1. 如果栈为空则说明整个字符串为单纯的数字, 解析整个字符串即可.
     * 3.2.2. 如果栈不为空, 则将当前字符拼接到StringBuilder中.
     * 3.3. 如果为逗号, 则创建一个NestInteger对象, 设置值为StringBuilder中暂存的数字, add到栈顶元素元素的列表中.
     * 3.4. 如果为]:
     * 3.4.1. 如果StringBuilder中暂存过字符, 则创建一个NestInteger对象, 设置值为StringBuilder中暂存的数字, add到栈顶元素元素的列表中.
     * 3.4.2. 如果栈中只有一个元素, 则说明遍历结束, 直接返回栈顶元素.
     * 3.4.3. 如果栈中超过一个元素, 则将栈顶元素弹出, 并将该元素添加到新的栈顶元素的列表中.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public NestedInteger deserialize(String s) {
        Stack<NestedInteger> stack = new Stack<>();
        char[] chars = s.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            if (c == '[') {
                stack.push(new NestedInteger());
            } else if (c == '-' || Character.isDigit(c)) {
                if (stack.isEmpty()) {
                    return new NestedInteger(Integer.parseInt(s));
                } else {
                    sb.append(c);
                }
            } else if (c == ',') {
                stack.peek().add(new NestedInteger(Integer.parseInt(sb.toString())));
                sb = new StringBuilder();
            } else { // ]
                if (sb.length() > 0) {
                    stack.peek().add(new NestedInteger(Integer.parseInt(sb.toString())));
                }
                NestedInteger pop = stack.pop();
                if (stack.isEmpty()) {
                    return pop;
                } else {
                    stack.peek().add(pop);
                }
                sb = new StringBuilder();
            }
        }
        return stack.pop();
    }
}

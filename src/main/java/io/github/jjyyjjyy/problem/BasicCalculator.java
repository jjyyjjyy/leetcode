package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

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

    public int calculate(String s) {
        return -1;
    }
}

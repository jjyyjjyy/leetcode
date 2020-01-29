package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/expression-add-operators/">给表达式添加运算符</a>
 *
 * <p>给定一个仅包含数字&nbsp;<code>0-9</code>&nbsp;的字符串和一个目标值，在数字之间添加<strong>二元</strong>运算符（不是一元）<code>+</code>、<code>-</code>&nbsp;或&nbsp;<code>*</code>&nbsp;，返回所有能够得到目标值的表达式。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> <code><em>num</em> = </code>&quot;123&quot;, <em>target</em> = 6
 * <strong>输出: </strong>[&quot;1+2+3&quot;, &quot;1*2*3&quot;]
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> <code><em>num</em> = </code>&quot;232&quot;, <em>target</em> = 8
 * <strong>输出: </strong>[&quot;2*3+2&quot;, &quot;2+3*2&quot;]</pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入:</strong> <code><em>num</em> = </code>&quot;105&quot;, <em>target</em> = 5
 * <strong>输出: </strong>[&quot;1*0+5&quot;,&quot;10-5&quot;]</pre>
 *
 * <p><strong>示例&nbsp;4:</strong></p>
 *
 * <pre><strong>输入:</strong> <code><em>num</em> = </code>&quot;00&quot;, <em>target</em> = 0
 * <strong>输出: </strong>[&quot;0+0&quot;, &quot;0-0&quot;, &quot;0*0&quot;]
 * </pre>
 *
 * <p><strong>示例 5:</strong></p>
 *
 * <pre><strong>输入:</strong> <code><em>num</em> = </code>&quot;3456237490&quot;, <em>target</em> = 9191
 * <strong>输出: </strong>[]
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>evaluate-reverse-polish-notation</li>
 *   <li>basic-calculator</li>
 *   <li>basic-calculator-ii</li>
 *   <li>different-ways-to-add-parentheses</li>
 *   <li>target-sum</li>
 * </ul>
 */
@Problem(
    id = 282,
    name = "expression-add-operators",
    difficulty = Difficulty.HARD,
    tags = {Tag.DIVIDE_AND_CONQUER}
)
public class ExpressionAddOperators {
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * <a href="https://leetcode-cn.com/problems/valid-parentheses/">有效的括号</a>
 *
 * <p>给定一个只包括 <code>&#39;(&#39;</code>，<code>&#39;)&#39;</code>，<code>&#39;{&#39;</code>，<code>&#39;}&#39;</code>，<code>&#39;[&#39;</code>，<code>&#39;]&#39;</code>&nbsp;的字符串，判断字符串是否有效。</p>
 *
 * <p>有效字符串需满足：</p>
 *
 * <ol>
 * 	<li>左括号必须用相同类型的右括号闭合。</li>
 * 	<li>左括号必须以正确的顺序闭合。</li>
 * </ol>
 *
 * <p>注意空字符串可被认为是有效字符串。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;()&quot;
 * <strong>输出:</strong> true
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;()[]{}&quot;
 * <strong>输出:</strong> true
 * </pre>
 *
 * <p><strong>示例&nbsp;3:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;(]&quot;
 * <strong>输出:</strong> false
 * </pre>
 *
 * <p><strong>示例&nbsp;4:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;([)]&quot;
 * <strong>输出:</strong> false
 * </pre>
 *
 * <p><strong>示例&nbsp;5:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;{[]}&quot;
 * <strong>输出:</strong> true</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>generate-parentheses</li>
 *   <li>longest-valid-parentheses</li>
 *   <li>remove-invalid-parentheses</li>
 *   <li>check-if-word-is-valid-after-substitutions</li>
 * </ul>
 */
@Problem(
    id = 20,
    name = "valid-parentheses",
    difficulty = Difficulty.EASY,
    tags = {Tag.STACK, Tag.STRING}
)
public class ValidParentheses {

    private static final Map<Character, Character> ref = new HashMap<>();

    static {
        ref.put('(', ')');
        ref.put('[', ']');
        ref.put('{', '}');
    }

    /**
     * 1. 维护左右大括号的映射关系.
     * 2. 依次遍历字符串, 如果当前字符属于左括号, 则将对应的右括号压入栈中; 否则将栈首弹出, 如果栈首元素与当前字符不相等或者栈为空则说明匹配失败.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        if (n % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : chars) {
            if (ref.containsKey(c)) {
                stack.push(ref.get(c));
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}

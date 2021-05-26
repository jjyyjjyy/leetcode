package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Stack;

/**
 * <a href="https://leetcode-cn.com/problems/reverse-substrings-between-each-pair-of-parentheses/">反转每对括号间的子串</a>
 *
 * <p>给出一个字符串&nbsp;<code>s</code>（仅含有小写英文字母和括号）。</p>
 *
 * <p>请你按照从括号内到外的顺序，逐层反转每对匹配括号中的字符串，并返回最终的结果。</p>
 *
 * <p>注意，您的结果中 <strong>不应</strong> 包含任何括号。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;(abcd)&quot;
 * <strong>输出：</strong>&quot;dcba&quot;
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;(u(love)i)&quot;
 * <strong>输出：</strong>&quot;iloveu&quot;
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;(ed(et(oc))el)&quot;
 * <strong>输出：</strong>&quot;leetcode&quot;
 * </pre>
 *
 * <p><strong>示例 4：</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;a(bcdefghijkl(mno)p)q&quot;
 * <strong>输出：</strong>&quot;apmnolkjihgfedcbq&quot;
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>0 &lt;= s.length &lt;= 2000</code></li>
 * 	<li><code>s</code> 中只有小写英文字母和括号</li>
 * 	<li>我们确保所有括号都是成对出现的</li>
 * </ul>
 */
@Problem(
    id = 1298,
    name = "reverse-substrings-between-each-pair-of-parentheses",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STACK}
)
public class ReverseSubstringsBetweenEachPairofParentheses {

    /**
     * 1. 依次遍历字符串.
     * 2. 如果遍历到左括号, 则将当前遍历过的字符压入栈中.
     * 3. 如果遍历到右括号, 则将当前遍历过的字符翻转, 将栈顶字符放到当前字符最前面.
     */
    @Complexity(Complexity.ComplexityType.O_N_POW_2)
    public String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(result.toString());
                result.setLength(0);
            } else if (ch == ')') {
                result.reverse();
                result.insert(0, stack.pop());
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    /**
     * 1. 遍历字符串, 找到配对的索引.
     * 2. 遍历字符串, 如果遍历到左括号或者右括号, 则跳转到配对的索引处, 如果跳到右括号则倒序遍历, 一直遍历到左括号处, 然后跳到原来的右括号右侧.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public String reverseParentheses2(String s) {
        int n = s.length();
        int[] pair = new int[n];
        Stack<Integer> pairStack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                pairStack.push(i);
            } else if (ch == ')') {
                int j = pairStack.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }
        StringBuilder result = new StringBuilder();
        int index = 0;
        int step = 1;
        while (index < n) {
            char ch = s.charAt(index);
            if (ch == '(' || ch == ')') {
                index = pair[index];
                step = -step;
            } else {
                result.append(ch);
            }
            index += step;
        }
        return result.toString();
    }
}

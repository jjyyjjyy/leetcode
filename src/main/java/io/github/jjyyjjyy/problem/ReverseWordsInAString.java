package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Stack;

/**
 * <a href="https://leetcode-cn.com/problems/reverse-words-in-a-string/">翻转字符串里的单词</a>
 *
 * <p>给定一个字符串，逐个翻转字符串中的每个单词。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;<code>the sky is blue</code>&quot;
 * <strong>输出:&nbsp;</strong>&quot;<code>blue is sky the</code>&quot;
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入:</strong> &quot; &nbsp;hello world! &nbsp;&quot;
 * <strong>输出:&nbsp;</strong>&quot;world! hello&quot;
 * <strong>解释: </strong>输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;a good &nbsp; example&quot;
 * <strong>输出:&nbsp;</strong>&quot;example good a&quot;
 * <strong>解释: </strong>如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>说明：</strong></p>
 *
 * <ul>
 * 	<li>无空格字符构成一个单词。</li>
 * 	<li>输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。</li>
 * 	<li>如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。</li>
 * </ul>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>进阶：</strong></p>
 *
 * <p>请选用 C 语言的用户尝试使用&nbsp;<em>O</em>(1) 额外空间复杂度的原地解法。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>reverse-words-in-a-string-ii</li>
 * </ul>
 */
@Problem(
    id = 151,
    name = "reverse-words-in-a-string",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STRING}
)
public class ReverseWordsInAString {

    /**
     * 1. 找到起始位置, 遍历字符串.
     * 2. 如果遍历到非空字符, 则暂存起来.
     * 3. 如果遍历到空字符且有暂存到的字符串, 则将该字符串存储到栈中.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public String reverseWords(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (s.charAt(left) == ' ') {
            left++;
        }
        while (s.charAt(right) == ' ') {
            right--;
        }
        Stack<String> stack = new Stack<>();
        StringBuilder current = new StringBuilder();
        while (left <= right) {
            if (s.charAt(left) != ' ') {
                current.append(s.charAt(left));
            } else {
                if (current.length() > 0) {
                    stack.push(current.toString());
                }
                current.setLength(0);
            }
            left++;
        }
        if (current.length() > 0) {
            stack.push(current.toString());
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }

        return result.substring(0, result.length() - 1);
    }
}

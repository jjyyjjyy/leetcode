package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/reverse-vowels-of-a-string/">反转字符串中的元音字母</a>
 *
 * <p>编写一个函数，以字符串作为输入，反转该字符串中的元音字母。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入: </strong>&quot;hello&quot;
 * <strong>输出: </strong>&quot;holle&quot;
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入: </strong>&quot;leetcode&quot;
 * <strong>输出: </strong>&quot;leotcede&quot;</pre>
 *
 * <p><strong>说明:</strong><br>
 * 元音字母不包含字母&quot;y&quot;。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>reverse-string</li>
 *   <li>remove-vowels-from-a-string</li>
 * </ul>
 */
@Problem(
    id = 345,
    name = "reverse-vowels-of-a-string",
    difficulty = Difficulty.EASY,
    tags = {Tag.TWO_POINTERS, Tag.STRING}
)
public class ReverseVowelsOfAString {

    private static final String VOWEL_STRING = "aieouAIEOU";

    /**
     * 分别从前向后, 从后向前遍历, 过滤掉元音字符, 然后交换.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (true) {
            while (start < end && !VOWEL_STRING.contains(String.valueOf(chars[start]))) {
                start++;
            }
            while (start < end && !VOWEL_STRING.contains(String.valueOf(chars[end]))) {
                end--;
            }
            if (start < end) {
                char tmp = chars[start];
                chars[start] = chars[end];
                chars[end] = tmp;
                start++;
                end--;
            } else {
                break;
            }
        }
        return new String(chars);
    }
}

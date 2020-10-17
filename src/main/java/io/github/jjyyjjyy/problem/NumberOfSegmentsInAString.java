package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/number-of-segments-in-a-string/">字符串中的单词数</a>
 *
 * <p>统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。</p>
 *
 * <p>请注意，你可以假定字符串里不包括任何不可打印的字符。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;Hello, my name is John&quot;
 * <strong>输出:</strong> 5
 * </pre>
 */
@Problem(
    id = 434,
    name = "number-of-segments-in-a-string",
    difficulty = Difficulty.EASY,
    tags = {Tag.STRING}
)
public class NumberOfSegmentsInAString {

    /**
     * 依次遍历字符串, 如果当前不是空字符并且前一位是空字符, 计数加1.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int countSegments(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                result++;
            }
        }

        return result;
    }
}

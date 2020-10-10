package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/length-of-last-word/">最后一个单词的长度</a>
 *
 * <p>给定一个仅包含大小写字母和空格&nbsp;<code>&#39; &#39;</code>&nbsp;的字符串 <code>s</code>，返回其最后一个单词的长度。</p>
 *
 * <p>如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。</p>
 *
 * <p>如果不存在最后一个单词，请返回 0&nbsp;。</p>
 *
 * <p><strong>说明：</strong>一个单词是指仅由字母组成、不包含任何空格的 <strong>最大子字符串</strong>。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;Hello World&quot;
 * <strong>输出:</strong> 5
 * </pre>
 */
@Problem(
    id = 58,
    name = "length-of-last-word",
    difficulty = Difficulty.EASY,
    tags = {Tag.STRING}
)
public class LengthOfLastWord {

    /**
     * 先找到最后一个不为空的字符, 从这个字符开始向前遍历, 一直找到不为空的字符.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        int start = chars.length - 1;
        while (start >= 0 && chars[start] == ' ') {
            start--;
        }
        for (int i = start; i >= 0; i--) {
            if (chars[i] == ' ') {
                break;
            }
            result++;
        }
        return result;
    }
}

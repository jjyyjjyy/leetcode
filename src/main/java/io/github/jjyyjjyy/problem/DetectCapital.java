package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/detect-capital/">检测大写字母</a>
 *
 * <p>给定一个单词，你需要判断单词的大写使用是否正确。</p>
 *
 * <p>我们定义，在以下情况时，单词的大写用法是正确的：</p>
 *
 * <ol>
 * 	<li>全部字母都是大写，比如&quot;USA&quot;。</li>
 * 	<li>单词中所有字母都不是大写，比如&quot;leetcode&quot;。</li>
 * 	<li>如果单词不只含有一个字母，只有首字母大写，&nbsp;比如&nbsp;&quot;Google&quot;。</li>
 * </ol>
 *
 * <p>否则，我们定义这个单词没有正确使用大写字母。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> &quot;USA&quot;
 * <strong>输出:</strong> True
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> &quot;FlaG&quot;
 * <strong>输出:</strong> False
 * </pre>
 *
 * <p><strong>注意:</strong> 输入是由大写和小写拉丁字母组成的非空单词。</p>
 */
@Problem(
    id = 520,
    name = "detect-capital",
    difficulty = Difficulty.EASY,
    tags = {Tag.STRING}
)
public class DetectCapital {

    /**
     * 两种情况下不合法:
     * 1. 前一个字符是小写, 后一个字符是大写.
     * 2. 从三个字符开始, 前一个字符是大写, 后一个字符是小写.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean detectCapitalUse(String word) {
        for (int i = 1; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i - 1)) && Character.isUpperCase(word.charAt(i))
                || i > 1 && Character.isUpperCase(word.charAt(i - 1)) && Character.isLowerCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

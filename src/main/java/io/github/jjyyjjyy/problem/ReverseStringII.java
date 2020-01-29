package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/reverse-string-ii/">反转字符串 II</a>
 *
 * <p>给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> s = &quot;abcdefg&quot;, k = 2
 * <strong>输出:</strong> &quot;bacdfeg&quot;
 * </pre>
 *
 * <p><strong>要求:</strong></p>
 *
 * <ol>
 * 	<li>该字符串只包含小写的英文字母。</li>
 * 	<li>给定字符串的长度和 k 在[1, 10000]范围内。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>reverse-string</li>
 *   <li>reverse-words-in-a-string-iii</li>
 * </ul>
 */
@Problem(
    id = 541,
    name = "reverse-string-ii",
    difficulty = Difficulty.EASY,
    tags = {Tag.STRING}
)
public class ReverseStringII {
}

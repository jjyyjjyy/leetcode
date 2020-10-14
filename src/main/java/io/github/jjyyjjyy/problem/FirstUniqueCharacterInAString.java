package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/first-unique-character-in-a-string/">字符串中的第一个唯一字符</a>
 *
 * <p>给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。</p>
 *
 * <p><strong>案例:</strong></p>
 *
 * <pre>
 * s = &quot;leetcode&quot;
 * 返回 0.
 *
 * s = &quot;loveleetcode&quot;,
 * 返回 2.
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>注意事项：</strong>您可以假定该字符串只包含小写字母。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>sort-characters-by-frequency</li>
 * </ul>
 */
@Problem(
    id = 387,
    name = "first-unique-character-in-a-string",
    difficulty = Difficulty.EASY,
    tags = {Tag.HASH_TABLE, Tag.STRING}
)
public class FirstUniqueCharacterInAString {

    /**
     * 1. 使用數組統計每個元素出現的次數.
     * 2. 遍歷字符串, 如果統計出來的次數爲1, 則返回該字符的索引.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int firstUniqChar(String s) {
        int[] summary = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            summary[c - 'a']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (summary[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}

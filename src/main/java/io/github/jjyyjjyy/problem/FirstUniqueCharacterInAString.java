package io.github.jjyyjjyy.problem;

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

    public int firstUniqChar(String s) {
        return -1;
    }
}

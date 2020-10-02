package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/group-anagrams/">字母异位词分组</a>
 *
 * <p>给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>[&quot;eat&quot;, &quot;tea&quot;, &quot;tan&quot;, &quot;ate&quot;, &quot;nat&quot;, &quot;bat&quot;]</code>,
 * <strong>输出:</strong>
 * [
 *   [&quot;ate&quot;,&quot;eat&quot;,&quot;tea&quot;],
 *   [&quot;nat&quot;,&quot;tan&quot;],
 *   [&quot;bat&quot;]
 * ]</pre>
 *
 * <p><strong>说明：</strong></p>
 *
 * <ul>
 * 	<li>所有输入均为小写字母。</li>
 * 	<li>不考虑答案输出的顺序。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>valid-anagram</li>
 *   <li>group-shifted-strings</li>
 * </ul>
 */
@Problem(
    id = 49,
    name = "group-anagrams",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HASH_TABLE, Tag.STRING}
)
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        return null;
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/valid-anagram/">有效的字母异位词</a>
 *
 * <p>给定两个字符串 <em>s</em> 和 <em>t</em> ，编写一个函数来判断 <em>t</em> 是否是 <em>s</em> 的字母异位词。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> <em>s</em> = &quot;anagram&quot;, <em>t</em> = &quot;nagaram&quot;
 * <strong>输出:</strong> true
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> <em>s</em> = &quot;rat&quot;, <em>t</em> = &quot;car&quot;
 * <strong>输出: </strong>false</pre>
 *
 * <p><strong>说明:</strong><br>
 * 你可以假设字符串只包含小写字母。</p>
 *
 * <p><strong>进阶:</strong><br>
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>group-anagrams</li>
 *   <li>palindrome-permutation</li>
 *   <li>find-all-anagrams-in-a-string</li>
 * </ul>
 */
@Problem(
    id = 242,
    name = "valid-anagram",
    difficulty = Difficulty.EASY,
    tags = {Tag.SORT, Tag.HASH_TABLE}
)
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        return false;
    }

}

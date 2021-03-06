package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/permutation-in-string/">字符串的排列</a>
 *
 * <p>给定两个字符串&nbsp;<strong>s1</strong>&nbsp;和&nbsp;<strong>s2</strong>，写一个函数来判断 <strong>s2</strong> 是否包含 <strong>s1&nbsp;</strong>的排列。</p>
 *
 * <p>换句话说，第一个字符串的排列之一是第二个字符串的子串。</p>
 *
 * <p><strong>示例1:</strong></p>
 *
 * <pre>
 * <strong>输入: </strong>s1 = &quot;ab&quot; s2 = &quot;eidbaooo&quot;
 * <strong>输出: </strong>True
 * <strong>解释:</strong> s2 包含 s1 的排列之一 (&quot;ba&quot;).
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例2:</strong></p>
 *
 * <pre>
 * <strong>输入: </strong>s1= &quot;ab&quot; s2 = &quot;eidboaoo&quot;
 * <strong>输出:</strong> False
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>注意：</strong></p>
 *
 * <ol>
 * 	<li>输入的字符串只包含小写字母</li>
 * 	<li>两个字符串的长度都在 [1, 10,000] 之间</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>minimum-window-substring</li>
 *   <li>find-all-anagrams-in-a-string</li>
 * </ul>
 */
@Problem(
    id = 567,
    name = "permutation-in-string",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TWO_POINTERS, Tag.SLIDING_WINDOW}
)
public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        return false;
    }
}

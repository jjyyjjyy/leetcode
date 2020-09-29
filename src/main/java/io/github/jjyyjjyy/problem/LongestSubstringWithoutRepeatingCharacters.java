package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/">无重复字符的最长子串</a>
 *
 * <p>给定一个字符串，请你找出其中不含有重复字符的&nbsp;<strong>最长子串&nbsp;</strong>的长度。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入: </strong>&quot;abcabcbb&quot;
 * <strong>输出: </strong>3
 * <strong>解释:</strong> 因为无重复字符的最长子串是 <code>&quot;abc&quot;，所以其</code>长度为 3。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入: </strong>&quot;bbbbb&quot;
 * <strong>输出: </strong>1
 * <strong>解释: </strong>因为无重复字符的最长子串是 <code>&quot;b&quot;</code>，所以其长度为 1。
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入: </strong>&quot;pwwkew&quot;
 * <strong>输出: </strong>3
 * <strong>解释: </strong>因为无重复字符的最长子串是&nbsp;<code>&quot;wke&quot;</code>，所以其长度为 3。
 * &nbsp;    请注意，你的答案必须是 <strong>子串 </strong>的长度，<code>&quot;pwke&quot;</code>&nbsp;是一个<em>子序列，</em>不是子串。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>longest-substring-with-at-most-two-distinct-characters</li>
 *   <li>longest-substring-with-at-most-k-distinct-characters</li>
 *   <li>subarrays-with-k-different-integers</li>
 * </ul>
 */
@Problem(
    id = 3,
    name = "longest-substring-without-repeating-characters",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HASH_TABLE, Tag.TWO_POINTERS, Tag.STRING, Tag.SLIDING_WINDOW}
)
public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * 1. 维护left, right两个指针, 初始化为0. 最大不包含重复元素的字符串长度, 初始化为0.
     * 2. 创建一个集合保存当前不重复的字符.
     * 3. 遍历字符串:
     * 3.1. left指针前进一位时, 将当前left字符从集合中删除.
     * 3.2. 将right指针向右移动, 一直到字符串末尾, 并且right指针所在的字符不在集合中.
     * 3.3. 当前left和right中间的字符串即为当前不包含重复元素的字符串, 更新当前最大长度.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int lengthOfLongestSubstring(String s) {
        Set<Character> exists = new HashSet<>();
        int n = s.length();
        int maxLength = 0;
        int right = 0;

        for (int i = 0; i < n; i++) {
            if (i != 0) {
                exists.remove(s.charAt(i - 1));
            }
            while (right < n && !exists.contains(s.charAt(right))) {
                exists.add(s.charAt(right++));
            }
            maxLength = Math.max(maxLength, right - i);
        }

        return maxLength;
    }
}

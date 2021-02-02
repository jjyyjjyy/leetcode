package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/longest-repeating-character-replacement/">替换后的最长重复字符</a>
 *
 * <p>给你一个仅由大写英文字母组成的字符串，你可以将任意位置上的字符替换成另外的字符，总共可最多替换&nbsp;<em>k&nbsp;</em>次。在执行上述操作后，找到包含重复字母的最长子串的长度。</p>
 *
 * <p><strong>注意:</strong><br>
 * 字符串长度 和 <em>k </em>不会超过&nbsp;10<sup>4</sup>。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * s = &quot;ABAB&quot;, k = 2
 *
 * <strong>输出:</strong>
 * 4
 *
 * <strong>解释:</strong>
 * 用两个&#39;A&#39;替换为两个&#39;B&#39;,反之亦然。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * s = &quot;AABABBA&quot;, k = 1
 *
 * <strong>输出:</strong>
 * 4
 *
 * <strong>解释:</strong>
 * 将中间的一个&#39;A&#39;替换为&#39;B&#39;,字符串变为 &quot;AABBBBA&quot;。
 * 子串 &quot;BBBB&quot; 有最长重复字母, 答案为 4。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>longest-substring-with-at-most-k-distinct-characters</li>
 *   <li>max-consecutive-ones-iii</li>
 * </ul>
 */
@Problem(
    id = 424,
    name = "longest-repeating-character-replacement",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TWO_POINTERS, Tag.SLIDING_WINDOW}
)
public class LongestRepeatingCharacterReplacement {

    /**
     * 1. 维护左指针, 右指针, 历史字符出现最大次数max, 和一个长度为26的数组维护窗口内每个字符出现的次数. 窗口长度即为最后结果.
     * 2. 右指针向右移:
     * 2.1. 右指针所属的字符次数+1.
     * 2.2. 更新最大次数.
     * 2.3. 如果窗口长度-max大于k, 说明当前窗口需要替换的字符数超过了k, 不满足条件, 左指针向右移一位.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0;
        int max = 0;
        int[] nums = new int[26];

        int right = 0;
        while (right < n) {
            int index = s.charAt(right) - 'A';
            max = Math.max(max, ++nums[index]);
            if (right - left + 1 - max > k) {
                nums[s.charAt(left) - 'A']--;
                left++;
            }
            right++;
        }
        return right - left;
    }
}

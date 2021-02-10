package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
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

    /**
     * 1. 先统计出s1词频和字符种数.
     * 2. 维护快慢两个指针, 依次遍历s2.
     * 2.1. 如果当前字符在s1中, 则将s2窗口内当前字符的词频加1, 如果加到和s1中改字符的词频数相同, 则当前窗口中的字符种数加1.
     * 2.2. 右指针向右移一位.
     * 2.3. 如果窗口内词频等于s1的词频, 且窗口长度等于s1的长度, 则说明窗口内字符与s1是等价的, 返回true, 否则左指针右移一位, 并且窗口内的字符种数是否需要减1.
     */
    @Complexity(Complexity.ComplexityType.O_M_AND_N)
    public boolean checkInclusion(String s1, String s2) {

        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();

        int wordCount = 0;
        int[] wordFreq = new int[26];

        for (char s1Char : s1Chars) {
            if (wordFreq[s1Char - 'a']++ == 0) {
                wordCount++;
            }
        }

        int left = 0;
        int right = 0;
        int[] windowWordFreq = new int[26];
        int windowWordCount = 0;
        while (right < s2Chars.length) {
            int index = s2Chars[right] - 'a';
            if (wordFreq[index] > 0) {
                windowWordFreq[index]++;
                if (wordFreq[index] == windowWordFreq[index]) {
                    windowWordCount++;
                }
            }
            right++;
            while (windowWordCount == wordCount) {
                if (right - left == s1Chars.length) {
                    return true;
                }
                int leftIndex = s2Chars[left] - 'a';
                if (wordFreq[leftIndex] > 0) {
                    windowWordFreq[leftIndex]--;
                    if (windowWordFreq[leftIndex] < wordFreq[leftIndex]) {
                        windowWordCount--;
                    }
                }
                left++;
            }
        }
        return false;
    }
}

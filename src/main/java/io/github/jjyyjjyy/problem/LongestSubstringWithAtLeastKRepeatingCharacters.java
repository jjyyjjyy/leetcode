package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/longest-substring-with-at-least-k-repeating-characters/">至少有K个重复字符的最长子串</a>
 *
 * <p>找到给定字符串（由小写字符组成）中的最长子串 <strong><em>T</em></strong> ，&nbsp;要求&nbsp;<strong><em>T</em></strong>&nbsp;中的每一字符出现次数都不少于 <em>k</em> 。输出 <strong><em>T&nbsp;</em></strong>的长度。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * 输入:
 * s = &quot;aaabb&quot;, k = 3
 *
 * 输出:
 * 3
 *
 * 最长子串为 &quot;aaa&quot; ，其中 &#39;a&#39; 重复了 3 次。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * 输入:
 * s = &quot;ababbc&quot;, k = 2
 *
 * 输出:
 * 5
 *
 * 最长子串为 &quot;ababb&quot; ，其中 &#39;a&#39; 重复了 2 次， &#39;b&#39; 重复了 3 次。
 * </pre>
 */
@Problem(
    id = 395,
    name = "longest-substring-with-at-least-k-repeating-characters",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DIVIDE_AND_CONQUER}
)
public class LongestSubstringWithAtLeastKRepeatingCharacters {

    @Complexity(Complexity.ComplexityType.O_N)
    public int longestSubstring(String s, int k) {
        int n = s.length();
        return dfs(s, 0, n - 1, k);
    }

    private int dfs(String s, int l, int r, int k) {
        int[] cnt = new int[26];
        for (int i = l; i <= r; i++) {
            cnt[s.charAt(i) - 'a']++;
        }

        char split = 0;
        for (int i = 0; i < 26; i++) {
            if (cnt[i] > 0 && cnt[i] < k) {
                split = (char) (i + 'a');
                break;
            }
        }
        if (split == 0) {
            return r - l + 1;
        }

        int i = l;
        int ret = 0;
        while (i <= r) {
            while (i <= r && s.charAt(i) == split) {
                i++;
            }
            if (i > r) {
                break;
            }
            int start = i;
            while (i <= r && s.charAt(i) != split) {
                i++;
            }

            int length = dfs(s, start, i - 1, k);
            ret = Math.max(ret, length);
        }
        return ret;
    }
}

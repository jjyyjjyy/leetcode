package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/implement-strstr/">实现 strStr()</a>
 *
 * <p>实现&nbsp;<a href="https://baike.baidu.com/item/strstr/811469" target="_blank">strStr()</a>&nbsp;函数。</p>
 *
 * <p>给定一个&nbsp;haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回&nbsp; <strong>-1</strong>。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> haystack = &quot;hello&quot;, needle = &quot;ll&quot;
 * <strong>输出:</strong> 2
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> haystack = &quot;aaaaa&quot;, needle = &quot;bba&quot;
 * <strong>输出:</strong> -1
 * </pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <p>当&nbsp;<code>needle</code>&nbsp;是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。</p>
 *
 * <p>对于本题而言，当&nbsp;<code>needle</code>&nbsp;是空字符串时我们应当返回 0 。这与C语言的&nbsp;<a href="https://baike.baidu.com/item/strstr/811469" target="_blank">strstr()</a>&nbsp;以及 Java的&nbsp;<a href="https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#indexOf(java.lang.String)" target="_blank">indexOf()</a>&nbsp;定义相符。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>shortest-palindrome</li>
 *   <li>repeated-substring-pattern</li>
 * </ul>
 */
@Problem(
    id = 28,
    name = "implement-strstr",
    difficulty = Difficulty.EASY,
    tags = {Tag.TWO_POINTERS, Tag.STRING}
)
public class ImplementStrStr {

    /**
     * 1. 维护慢指针i.
     * 2. 从i处依次遍历两个字符串, 如果字符不相等则跳出, 如果遍历到needle最后一位则返回i.
     * 3. i前进一位, 重复步骤2.
     */
    @Complexity(Complexity.ComplexityType.O_M_N)
    public int strStr(String haystack, String needle) {
        char[] hayStacks = haystack.toCharArray();
        char[] needles = needle.toCharArray();
        if (needles.length == 0) {
            return 0;
        }
        for (int i = 0; i <= hayStacks.length - needles.length; i++) {
            for (int j = 0; j < needles.length; j++) {
                if (hayStacks[i + j] != needles[j]) {
                    break;
                }
                if (j == needles.length - 1) {
                    return i;
                }
            }
        }
        return -1;
    }

}
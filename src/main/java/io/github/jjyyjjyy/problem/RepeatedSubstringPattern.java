package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/repeated-substring-pattern/">重复的子字符串</a>
 *
 * <p>给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> &quot;abab&quot;
 *
 * <strong>输出:</strong> True
 *
 * <strong>解释:</strong> 可由子字符串 &quot;ab&quot; 重复两次构成。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> &quot;aba&quot;
 *
 * <strong>输出:</strong> False
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> &quot;abcabcabcabc&quot;
 *
 * <strong>输出:</strong> True
 *
 * <strong>解释:</strong> 可由子字符串 &quot;abc&quot; 重复四次构成。 (或者子字符串 &quot;abcabc&quot; 重复两次构成。)
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>implement-strstr</li>
 *   <li>repeated-string-match</li>
 * </ul>
 */
@Problem(
    id = 459,
    name = "repeated-substring-pattern",
    difficulty = Difficulty.EASY,
    tags = {Tag.STRING}
)
public class RepeatedSubstringPattern {

    /**
     * 将两个原字符串拼在一起, 从第1位开始遍历到倒数第一位, 如果存在原字符串则说明可以重复构成.
     */
    @Complexity(Complexity.ComplexityType.O_LOG_N)
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }

    /**
     * 1. 从第1位开始遍历到中间.
     * 2. 如果当前位置不能被n整除, 则跳过, 因为当前这个位置肯定不能作为重复开始的位置.
     * 3. 依次当前后半部分字符串和前半部分字符串, 如果都相同则表示可以重复构成.
     */
    @Complexity(Complexity.ComplexityType.O_N_POW_2)
    public boolean repeatedSubstringPattern2(String s) {
        int n = s.length();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i > 0) {
                continue;
            }
            boolean match = true;
            for (int j = i; j < n; j++) {
                if (s.charAt(j) != s.charAt(j - i)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }
        }
        return false;
    }
}

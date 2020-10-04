package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/longest-common-prefix/">最长公共前缀</a>
 *
 * <p>编写一个函数来查找字符串数组中的最长公共前缀。</p>
 *
 * <p>如果不存在公共前缀，返回空字符串&nbsp;<code>&quot;&quot;</code>。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入: </strong>[&quot;flower&quot;,&quot;flow&quot;,&quot;flight&quot;]
 * <strong>输出:</strong> &quot;fl&quot;
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入: </strong>[&quot;dog&quot;,&quot;racecar&quot;,&quot;car&quot;]
 * <strong>输出:</strong> &quot;&quot;
 * <strong>解释:</strong> 输入不存在公共前缀。
 * </pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <p>所有输入只包含小写字母&nbsp;<code>a-z</code>&nbsp;。</p>
 */
@Problem(
    id = 14,
    name = "longest-common-prefix",
    difficulty = Difficulty.EASY,
    tags = {Tag.STRING}
)
public class LongestCommonPrefix {

    @Complexity(Complexity.ComplexityType.O_M_N)
    public String longestCommonPrefix(String[] strs) {
        return "";
    }
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/remove-duplicate-letters/">去除重复字母</a>
 *
 * <p>给定一个仅包含小写字母的字符串，去除字符串中重复的字母，使得每个字母只出现一次。需保证返回结果的字典序最小（要求不能打乱其他字符的相对位置）。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>&quot;bcabc&quot;</code>
 * <strong>输出:</strong> <code>&quot;abc&quot;</code>
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>&quot;cbacdcbc&quot;</code>
 * <strong>输出:</strong> <code>&quot;acdb&quot;</code></pre>
 */
@Problem(
    id = 316,
    name = "remove-duplicate-letters",
    difficulty = Difficulty.HARD,
    tags = {Tag.STACK, Tag.GREEDY}
)
public class RemoveDuplicateLetters {
}

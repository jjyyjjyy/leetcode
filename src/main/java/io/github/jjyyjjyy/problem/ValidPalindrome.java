package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/valid-palindrome/">验证回文串</a>
 *
 * <p>给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。</p>
 *
 * <p><strong>说明：</strong>本题中，我们将空字符串定义为有效的回文串。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;A man, a plan, a canal: Panama&quot;
 * <strong>输出:</strong> true
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;race a car&quot;
 * <strong>输出:</strong> false
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>palindrome-linked-list</li>
 *   <li>valid-palindrome-ii</li>
 * </ul>
 */
@Problem(
    id = 125,
    name = "valid-palindrome",
    difficulty = Difficulty.EASY,
    tags = {Tag.TWO_POINTERS, Tag.STRING}
)
public class ValidPalindrome {
}

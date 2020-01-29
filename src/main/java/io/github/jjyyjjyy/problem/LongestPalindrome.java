package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/longest-palindrome/">最长回文串</a>
 *
 * <p>给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。</p>
 *
 * <p>在构造过程中，请注意区分大小写。比如&nbsp;<code>&quot;Aa&quot;</code>&nbsp;不能当做一个回文字符串。</p>
 *
 * <p><strong>注意:</strong><br />
 * 假设字符串的长度不会超过 1010。</p>
 *
 * <p><strong>示例 1: </strong></p>
 *
 * <pre>
 * 输入:
 * &quot;abccccdd&quot;
 *
 * 输出:
 * 7
 *
 * 解释:
 * 我们可以构造的最长的回文串是&quot;dccaccd&quot;, 它的长度是 7。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>palindrome-permutation</li>
 * </ul>
 */
@Problem(
    id = 409,
    name = "longest-palindrome",
    difficulty = Difficulty.EASY,
    tags = {Tag.HASH_TABLE}
)
public class LongestPalindrome {
}

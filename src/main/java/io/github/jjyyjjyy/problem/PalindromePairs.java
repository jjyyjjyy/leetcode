package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/palindrome-pairs/">回文对</a>
 *
 * <p>给定一组<strong>唯一</strong>的单词， 找出所有<strong><em>不同&nbsp;</em></strong>的索引对<code>(i, j)</code>，使得列表中的两个单词，&nbsp;<code>words[i] + words[j]</code>&nbsp;，可拼接成回文串。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入: </strong>[&quot;abcd&quot;,&quot;dcba&quot;,&quot;lls&quot;,&quot;s&quot;,&quot;sssll&quot;]
 * <strong>输出: </strong>[[0,1],[1,0],[3,2],[2,4]]
 * <strong>解释: </strong>可拼接成的回文串为 <code>[&quot;dcbaabcd&quot;,&quot;abcddcba&quot;,&quot;slls&quot;,&quot;llssssll&quot;]</code>
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入: </strong>[&quot;bat&quot;,&quot;tab&quot;,&quot;cat&quot;]
 * <strong>输出: </strong>[[0,1],[1,0]]
 * <strong>解释: </strong>可拼接成的回文串为 <code>[&quot;battab&quot;,&quot;tabbat&quot;]</code></pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>longest-palindromic-substring</li>
 *   <li>shortest-palindrome</li>
 * </ul>
 */
@Problem(
    id = 336,
    name = "palindrome-pairs",
    difficulty = Difficulty.HARD,
    tags = {Tag.TRIE, Tag.HASH_TABLE, Tag.STRING}
)
public class PalindromePairs {
}

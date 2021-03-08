package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/palindrome-partitioning-ii/">分割回文串 II</a>
 *
 * <p>给定一个字符串 <em>s</em>，将 <em>s</em> 分割成一些子串，使每个子串都是回文串。</p>
 *
 * <p>返回符合要求的最少分割次数。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong>&nbsp;&quot;aab&quot;
 * <strong>输出:</strong> 1
 * <strong>解释: </strong>进行一次分割就可将&nbsp;<em>s </em>分割成 [&quot;aa&quot;,&quot;b&quot;] 这样两个回文子串。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>palindrome-partitioning</li>
 * </ul>
 */
@Problem(
    id = 132,
    name = "palindrome-partitioning-ii",
    difficulty = Difficulty.HARD,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class PalindromePartitioningII {

    public int minCut(String s) {
        return -1;
    }
}

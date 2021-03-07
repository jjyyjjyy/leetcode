package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/palindrome-partitioning/">分割回文串</a>
 *
 * <p>给定一个字符串 <em>s</em>，将<em> s </em>分割成一些子串，使每个子串都是回文串。</p>
 *
 * <p>返回 <em>s</em> 所有可能的分割方案。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong>&nbsp;&quot;aab&quot;
 * <strong>输出:</strong>
 * [
 *   [&quot;aa&quot;,&quot;b&quot;],
 *   [&quot;a&quot;,&quot;a&quot;,&quot;b&quot;]
 * ]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>palindrome-partitioning-ii</li>
 * </ul>
 */
@Problem(
    id = 131,
    name = "palindrome-partitioning",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BACKTRACKING}
)
public class PalindromePartitioning {

    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "n*2^n")
    public List<List<String>> partition(String s) {
        return null;
    }

}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/is-subsequence/">判断子序列</a>
 *
 * <p>给定字符串 <strong>s</strong> 和 <strong>t</strong> ，判断 <strong>s</strong> 是否为 <strong>t</strong> 的子序列。</p>
 *
 * <p>你可以认为 <strong>s</strong> 和 <strong>t</strong> 中仅包含英文小写字母。字符串 <strong>t</strong> 可能会很长（长度 ~= 500,000），而 <strong>s</strong> 是个短字符串（长度 &lt;=100）。</p>
 *
 * <p>字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，<code>&quot;ace&quot;</code>是<code>&quot;abcde&quot;</code>的一个子序列，而<code>&quot;aec&quot;</code>不是）。</p>
 *
 * <p><strong>示例&nbsp;1:</strong><br />
 * <strong>s</strong> = <code>&quot;abc&quot;</code>, <strong>t</strong> = <code>&quot;ahbgdc&quot;</code></p>
 *
 * <p>返回&nbsp;<code>true</code>.</p>
 *
 * <p><strong>示例&nbsp;2:</strong><br />
 * <strong>s</strong> = <code>&quot;axc&quot;</code>, <strong>t</strong> = <code>&quot;ahbgdc&quot;</code></p>
 *
 * <p>返回&nbsp;<code>false</code>.</p>
 *
 * <p><strong>后续挑战</strong> <strong>:</strong></p>
 *
 * <p>如果有大量输入的 S，称作S1, S2, ... , Sk 其中 k &gt;= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？</p>
 *
 * <p><strong>致谢:</strong></p>
 *
 * <p>特别感谢<strong> </strong><a href="https://leetcode.com/pbrother/">@pbrother&nbsp;</a>添加此问题并且创建所有测试用例。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>number-of-matching-subsequences</li>
 *   <li>shortest-way-to-form-string</li>
 * </ul>
 */
@Problem(
    id = 392,
    name = "is-subsequence",
    difficulty = Difficulty.EASY,
    tags = {Tag.GREEDY, Tag.BINARY_SEARCH, Tag.DYNAMIC_PROGRAMMING}
)
public class IsSubsequence {
}

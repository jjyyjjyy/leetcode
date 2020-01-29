package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/edit-distance/">编辑距离</a>
 *
 * <p>给定两个单词&nbsp;<em>word1</em> 和&nbsp;<em>word2</em>，计算出将&nbsp;<em>word1</em>&nbsp;转换成&nbsp;<em>word2 </em>所使用的最少操作数&nbsp;。</p>
 *
 * <p>你可以对一个单词进行如下三种操作：</p>
 *
 * <ol>
 * 	<li>插入一个字符</li>
 * 	<li>删除一个字符</li>
 * 	<li>替换一个字符</li>
 * </ol>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> word1 = &quot;horse&quot;, word2 = &quot;ros&quot;
 * <strong>输出:</strong> 3
 * <strong>解释:</strong>
 * horse -&gt; rorse (将 &#39;h&#39; 替换为 &#39;r&#39;)
 * rorse -&gt; rose (删除 &#39;r&#39;)
 * rose -&gt; ros (删除 &#39;e&#39;)
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> word1 = &quot;intention&quot;, word2 = &quot;execution&quot;
 * <strong>输出:</strong> 5
 * <strong>解释:</strong>
 * intention -&gt; inention (删除 &#39;t&#39;)
 * inention -&gt; enention (将 &#39;i&#39; 替换为 &#39;e&#39;)
 * enention -&gt; exention (将 &#39;n&#39; 替换为 &#39;x&#39;)
 * exention -&gt; exection (将 &#39;n&#39; 替换为 &#39;c&#39;)
 * exection -&gt; execution (插入 &#39;u&#39;)
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>one-edit-distance</li>
 *   <li>delete-operation-for-two-strings</li>
 *   <li>minimum-ascii-delete-sum-for-two-strings</li>
 *   <li>uncrossed-lines</li>
 * </ul>
 */
@Problem(
    id = 72,
    name = "edit-distance",
    difficulty = Difficulty.HARD,
    tags = {Tag.STRING, Tag.DYNAMIC_PROGRAMMING}
)
public class EditDistance {
}

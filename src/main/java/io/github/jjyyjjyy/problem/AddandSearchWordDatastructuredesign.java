package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/add-and-search-word-data-structure-design/">添加与搜索单词 - 数据结构设计</a>
 *
 * <p>设计一个支持以下两种操作的数据结构：</p>
 *
 * <pre>void addWord(word)
 * bool search(word)
 * </pre>
 *
 * <p>search(word)&nbsp;可以搜索文字或正则表达式字符串，字符串只包含字母&nbsp;<code>.</code>&nbsp;或&nbsp;<code>a-z</code>&nbsp;。&nbsp;<code>.</code> 可以表示任何一个字母。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>addWord(&quot;bad&quot;)
 * addWord(&quot;dad&quot;)
 * addWord(&quot;mad&quot;)
 * search(&quot;pad&quot;) -&gt; false
 * search(&quot;bad&quot;) -&gt; true
 * search(&quot;.ad&quot;) -&gt; true
 * search(&quot;b..&quot;) -&gt; true
 * </pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <p>你可以假设所有单词都是由小写字母 <code>a-z</code>&nbsp;组成的。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>implement-trie-prefix-tree</li>
 *   <li>prefix-and-suffix-search</li>
 * </ul>
 */
@Problem(
    id = 211,
    name = "add-and-search-word-data-structure-design",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DESIGN, Tag.TRIE, Tag.BACKTRACKING}
)
public class AddandSearchWordDatastructuredesign {
}

package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/implement-trie-prefix-tree/">实现 Trie (前缀树)</a>
 *
 * <p>实现一个 Trie (前缀树)，包含&nbsp;<code>insert</code>,&nbsp;<code>search</code>, 和&nbsp;<code>startsWith</code>&nbsp;这三个操作。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>Trie trie = new Trie();
 *
 * trie.insert(&quot;apple&quot;);
 * trie.search(&quot;apple&quot;);   // 返回 true
 * trie.search(&quot;app&quot;);     // 返回 false
 * trie.startsWith(&quot;app&quot;); // 返回 true
 * trie.insert(&quot;app&quot;);
 * trie.search(&quot;app&quot;);     // 返回 true</pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ul>
 * 	<li>你可以假设所有的输入都是由小写字母&nbsp;<code>a-z</code>&nbsp;构成的。</li>
 * 	<li>保证所有输入均为非空字符串。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>add-and-search-word-data-structure-design</li>
 *   <li>design-search-autocomplete-system</li>
 *   <li>replace-words</li>
 *   <li>implement-magic-dictionary</li>
 * </ul>
 */
@Problem(
    id = 208,
    name = "implement-trie-prefix-tree",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DESIGN, Tag.TRIE}
)
public class ImplementTriePrefixTree {
}

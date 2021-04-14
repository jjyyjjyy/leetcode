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
public class Trie {

    private final Trie[] children = new Trie[26];

    private boolean end = false;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new Trie();
            }
            node = node.children[index];
        }
        node.end = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        Trie trie = searchPrefix(word);
        return trie != null && trie.end;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private Trie searchPrefix(String prefix) {
        Trie node = this;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            int index = c - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }

}
